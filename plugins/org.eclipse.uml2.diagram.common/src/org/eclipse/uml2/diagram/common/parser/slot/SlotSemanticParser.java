package org.eclipse.uml2.diagram.common.parser.slot;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.diagram.common.parser.ImageProvider;
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

	private final ImageProvider myImageProvider;

	private final CompletionProcessor myCompletionProcessor;

	public SlotSemanticParser(LookupSuite lookupSuite, ImageProvider imageProvider) {
		this(lookupSuite, imageProvider, new BasicApplyStrategy(), new SlotToString.VIEW(), new SlotToString.EDIT());
	}

	public SlotSemanticParser(LookupSuite lookupSuite, ImageProvider imageProvider, ApplyStrategy applier, WithReferences view, ExternalToString edit) {
		super(new SlotParser(lookupSuite), applier, view, edit);
		myCompletionProcessor = new CompletionProcessor(lookupSuite.getLookup(StructuralFeature.class));
		myImageProvider = imageProvider;
	}

	public SlotSemanticParser(LookupSuite lookupSuite, ImageProvider imageProvider, ApplyStrategy applier, WithReferences viewAndEdit) {
		this(lookupSuite, imageProvider, applier, viewAndEdit, viewAndEdit);
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

	private class CompletionProcessor extends LookupCompletionProcessor<StructuralFeature> {

		public CompletionProcessor(Lookup<StructuralFeature> featureLookup) {
			super(featureLookup);
		}

		@Override
		protected String getProposalPrefix(String controlPrefix) {
			return controlPrefix.contains("=") ? null : trimLeft(controlPrefix);
		}

		@Override
		protected Image getProposalImage(StructuralFeature proposedFeature) {
			return myImageProvider.getImage(proposedFeature.eClass());
		}
	}
}
