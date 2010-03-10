package org.eclipse.uml2.diagram.common.parser.slot;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.uml2.diagram.parser.ApplyStrategy;
import org.eclipse.uml2.diagram.parser.BasicApplyStrategy;
import org.eclipse.uml2.diagram.parser.ExternalToString;
import org.eclipse.uml2.diagram.parser.SemanticParserAdapter;
import org.eclipse.uml2.diagram.parser.ExternalToString.WithReferences;
import org.eclipse.uml2.diagram.parser.assist.LookupCompletionProcessor;
import org.eclipse.uml2.diagram.parser.lookup.Lookup;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuite;
import org.eclipse.uml2.uml.StructuralFeature;

public class SlotSemanticParser extends SemanticParserAdapter {

	private final CompletionProcessor myCompletionProcessor;

	public SlotSemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider) {
		this(lookupSuite, labelProvider, new BasicApplyStrategy(), new SlotToString.VIEW(), new SlotToString.EDIT());
	}

	public SlotSemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider, ApplyStrategy applier, WithReferences view, ExternalToString edit) {
		super(new SlotParser(lookupSuite), applier, view, edit);
		myCompletionProcessor = new CompletionProcessor(lookupSuite.getLookup(StructuralFeature.class), labelProvider);
	}

	public SlotSemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider, ApplyStrategy applier, WithReferences viewAndEdit) {
		this(lookupSuite, labelProvider, applier, viewAndEdit, viewAndEdit);
	}

	protected final EObject doAdapt(IAdaptable adaptable) {
		EObject element = (EObject) adaptable.getAdapter(EObject.class);
		return element;
	}

	@Override
	public String getPrintString(IAdaptable element, int flags) {
		String result = super.getPrintString(element, flags);
		if ("".equals(result)) {
			result = "<enter>";
		}
		return result;
	}

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		myCompletionProcessor.setContext(doAdapt(element));
		return myCompletionProcessor;
	}

	private static class CompletionProcessor extends LookupCompletionProcessor<StructuralFeature> {

		public CompletionProcessor(Lookup<StructuralFeature> featureLookup, ILabelProvider labelProvider) {
			super(featureLookup, labelProvider);
		}

		@Override
		protected String getProposalPrefix(String controlPrefix) {
			return controlPrefix.contains("=") ? null : trimLeft(controlPrefix);
		}
	}
}
