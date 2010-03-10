/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.parser.operation;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.diagram.parser.ApplyStrategy;
import org.eclipse.uml2.diagram.parser.BasicApplyStrategy;
import org.eclipse.uml2.diagram.parser.ExternalToString;
import org.eclipse.uml2.diagram.parser.SemanticParserAdapter;
import org.eclipse.uml2.diagram.parser.ExternalToString.WithReferences;
import org.eclipse.uml2.diagram.parser.assist.LookupCompletionProcessor;
import org.eclipse.uml2.diagram.parser.lookup.Lookup;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuite;
import org.eclipse.uml2.uml.Type;

public class OperationSemanticParser extends SemanticParserAdapter {

	private final ILabelProvider myLabelProvider;

	private final CompletionProcessor myCompletionProcessor;

	public OperationSemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider) {
		this(lookupSuite, labelProvider, new BasicApplyStrategy(), new OperationToString.VIEW(), new OperationToString.EDIT());
	}

	public OperationSemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider, ApplyStrategy applier, WithReferences view, ExternalToString edit) {
		super(new OperationParser(lookupSuite), applier, view, edit);
		myLabelProvider = labelProvider;
		myCompletionProcessor = new CompletionProcessor(lookupSuite.getLookup(Type.class));
	}

	public OperationSemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider, ApplyStrategy applier, WithReferences viewAndEdit) {
		this(lookupSuite, labelProvider, applier, viewAndEdit, viewAndEdit);
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

		public CompletionProcessor(Lookup<Type> typeLookup) {
			super(typeLookup);
		}

		@Override
		protected String getProposalPrefix(String controlPrefix) {
			int colonIndex = controlPrefix.lastIndexOf(':');
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
