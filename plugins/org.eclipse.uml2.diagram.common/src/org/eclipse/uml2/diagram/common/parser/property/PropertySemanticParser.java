/*
 * Copyright (c) 2008, 2010 Borland Software Corporation, and others 
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 *    Elena Shaverdova (SwiftTeams) - completion assistants support
 */
package org.eclipse.uml2.diagram.common.parser.property;

import java.util.Collections;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.contentassist.IContentAssistSubjectControl;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.diagram.parser.ApplyStrategy;
import org.eclipse.uml2.diagram.parser.BasicApplyStrategy;
import org.eclipse.uml2.diagram.parser.ExternalToString;
import org.eclipse.uml2.diagram.parser.SemanticParserAdapter;
import org.eclipse.uml2.diagram.parser.assist.LookupCompletionProcessor;
import org.eclipse.uml2.diagram.parser.lookup.Lookup;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuite;
import org.eclipse.uml2.uml.Type;

public class PropertySemanticParser extends SemanticParserAdapter {

	private final ILabelProvider myLabelProvider;

	private final CompletionProcessor myCompletionProcessor;

	public PropertySemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider) {
		this(lookupSuite, labelProvider, new BasicApplyStrategy(), new PropertyToString.VIEW(), new PropertyToString.EDIT());
	}

	public PropertySemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider, ApplyStrategy applier, ExternalToString.WithReferences viewAndEdit) {
		this(lookupSuite, labelProvider, applier, viewAndEdit, viewAndEdit);
	}

	public PropertySemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider, ApplyStrategy applier, ExternalToString.WithReferences view, ExternalToString edit) {
		super(new PropertyParser(lookupSuite), applier, view, edit);
		myLabelProvider = labelProvider;
		myCompletionProcessor = new CompletionProcessor(lookupSuite.getLookup(Type.class));
	}

	protected EObject doAdapt(IAdaptable adaptable) {
		EObject element = (EObject) adaptable.getAdapter(EObject.class);
		return element;
	}

	public boolean areSemanticElementsAffected(EObject listener, Object notification) {
		return isAffectingEvent(notification);
	}

	public List<?> getSemanticElementsBeingParsed(EObject element) {
		return isValidElement(element) ? getViewToStringImpl().getAdditionalReferencedElements(element) : Collections.EMPTY_LIST;
	}

	private ExternalToString.WithReferences getViewToStringImpl() {
		return (ExternalToString.WithReferences) getViewToString();
	}

	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {
		myCompletionProcessor.setContext(doAdapt(element));
		return myCompletionProcessor;
	}

	private class CompletionProcessor extends LookupCompletionProcessor<Type> {

		public CompletionProcessor(Lookup<Type> lookup) {
			super(lookup);
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

			List<Type> proposedTypes = computeLookupProposals(getContext());
			List<ICompletionProposal> proposals = createProposals(subjectControl.getSelectedRange(), proposalPrefix, proposedTypes);
			return proposals.toArray(NO_PROPOSALS);
		}

		@Override
		protected String getProposalPrefix(String controlPrefix) {
			int colonIndex = controlPrefix.indexOf(':');
			if (colonIndex == -1) {
				return null;
			}
			String proposalPrefix = controlPrefix.substring(colonIndex + ":".length());
			return trimLeft(proposalPrefix);
		}

		@Override
		protected Image getProposalImage(Type proposedEObject) {
			return myLabelProvider.getImage(proposedEObject);
		}

	}
}
