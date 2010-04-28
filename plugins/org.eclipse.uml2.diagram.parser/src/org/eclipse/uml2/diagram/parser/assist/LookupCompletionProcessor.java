package org.eclipse.uml2.diagram.parser.assist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.contentassist.IContentAssistSubjectControl;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.uml2.diagram.parser.lookup.Lookup;
import org.eclipse.uml2.uml.NamedElement;

public abstract class LookupCompletionProcessor<T extends NamedElement> extends CompletionProcessorBase {

	protected static final Comparator<NamedElement> BY_NAME_COMPARATOR = new Comparator<NamedElement>() {

		public int compare(NamedElement first, NamedElement second) {
			return first.getName().compareTo(second.getName());
		}
	};

	private final Lookup<T> myLookup;

	private final ILabelProvider myProposalsLabelProvider;

	/**
	 * Extracts the part of the control text related to the proposal.
	 * <p>
	 * E.g, if the complete text entered in control is "myName : Str", then the
	 * type-proposal is expected to extract the proposal prefix "Str", because
	 * everything before the ":" are not relevant for type proposals.
	 * <p>
	 * Only the proposals starting with this proposal prefix ("Str") will be
	 * considered.
	 * 
	 * @param prefix
	 *            text entered into the control before the actual selection
	 * @return relevant part of the entered text, or <code>null</code> if given
	 *         text is not relevant to proposals at all (no assistant will be
	 *         shown in this case).
	 */
	protected abstract String getProposalPrefix(String controlPrefix);

	public LookupCompletionProcessor(Lookup<T> lookup, ILabelProvider proposalsLabelProvider) {
		myLookup = lookup;
		myProposalsLabelProvider = proposalsLabelProvider;
	}

	public ICompletionProposal[] computeCompletionProposals(IContentAssistSubjectControl subjectControl, int offset) {
		if (getContext() == null) {
			return NO_PROPOSALS;
		}

		String prefix = getControlTextBeforeSelection(subjectControl);
		String proposalPrefix = getProposalPrefix(prefix);
		if (proposalPrefix == null) {
			return NO_PROPOSALS;
		}

		List<T> proposedEObjects = computeLookupProposals(getContext());
		List<ICompletionProposal> proposals = createProposals(subjectControl.getSelectedRange(), proposalPrefix, proposedEObjects);
		return proposals.toArray(NO_PROPOSALS);
	}

	protected List<T> computeLookupProposals(EObject context) {
		List<T> resultList = myLookup.computeScope(context);
		Collections.sort(resultList, BY_NAME_COMPARATOR);
		return resultList;
	}

	protected List<ICompletionProposal> createProposals(Point selection, String proposalPrefix, List<T> proposals) {
		String ignoreCasePrefix = proposalPrefix.toLowerCase();
		int prefixLength = proposalPrefix.length();
		int selectionStart = selection.x;
		int selectionLength = selection.y;
		List<ICompletionProposal> result = new ArrayList<ICompletionProposal>(proposals.size());
		for (T next : proposals) {
			if (next == null) {
				continue;
			}
			String nextName = next.getName();
			if (nextName == null || !nextName.toLowerCase().startsWith(ignoreCasePrefix)) {
				continue;
			}
			Image image = getProposalImage(next);
			ICompletionProposal proposal = new CompletionProposal(//
					nextName, selectionStart - prefixLength, selectionLength + prefixLength, nextName.length(), image, nextName, null, null);
			result.add(proposal);
		}
		return result;
	}

	protected Image getProposalImage(T proposedEObject) {
		return myProposalsLabelProvider == null ? null : myProposalsLabelProvider.getImage(proposedEObject);
	}

	protected static final String trimLeft(String text) {
		return text.startsWith(" ") ? text.replaceAll("\\A\\s+", "") : text;
	}

}
