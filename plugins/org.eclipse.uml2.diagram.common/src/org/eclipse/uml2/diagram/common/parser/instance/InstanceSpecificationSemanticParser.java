package org.eclipse.uml2.diagram.common.parser.instance;

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
import org.eclipse.uml2.uml.Type;

public class InstanceSpecificationSemanticParser extends SemanticParserAdapter {

	private final ImageProvider myImageProvider;

	private final CompletionProcessor myCompletionProcessor;

	public InstanceSpecificationSemanticParser(LookupSuite lookupSuite, ImageProvider imageProvider) {
		this(lookupSuite, imageProvider, new BasicApplyStrategy(), new InstanceSpecificationToString.VIEW(), new InstanceSpecificationToString.EDIT());
	}

	public InstanceSpecificationSemanticParser(LookupSuite lookupSuite, ImageProvider imageProvider, ApplyStrategy applier, WithReferences view, ExternalToString edit) {
		super(new InstanceSpecificationParser(lookupSuite), applier, view, edit);
		myCompletionProcessor = new CompletionProcessor(lookupSuite.getLookup(Type.class));
		myImageProvider = imageProvider;
	}

	public InstanceSpecificationSemanticParser(LookupSuite lookupSuite, ImageProvider imageProvider, ApplyStrategy applier, WithReferences viewAndEdit) {
		this(lookupSuite, imageProvider, applier, viewAndEdit, viewAndEdit);
	}

	protected final EObject doAdapt(IAdaptable adaptable) {
		EObject element = (EObject) adaptable.getAdapter(EObject.class);
		return element;
	}

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		myCompletionProcessor.setContext(doAdapt(element));
		return myCompletionProcessor;
	}

	private class CompletionProcessor extends LookupCompletionProcessor<Type> {

		public CompletionProcessor(Lookup<Type> lookup) {
			super(lookup);
		}

		@Override
		protected String getProposalPrefix(String controlPrefix) {
			int colonIndex = controlPrefix.lastIndexOf(':');
			int commaIndex = controlPrefix.lastIndexOf(',');
			int startIndex = Math.max(colonIndex, commaIndex);
			if (startIndex == -1) {
				return null;
			}

			String proposalPrefix = controlPrefix.substring(startIndex + 1);
			return trimLeft(proposalPrefix);
		}

		@Override
		protected Image getProposalImage(Type proposedType) {
			return myImageProvider.getImage(proposedType.eClass());
		}
	}
}
