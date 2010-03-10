/*
 * Copyright (c) 2008, 2010 Borland Software Corporation and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 *    Elena Shaverdova (SwiftTeams) - #305302, completion assistants
 */
package org.eclipse.uml2.diagram.common.parser.operation;

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
import org.eclipse.uml2.uml.Type;

public class OperationSemanticParser extends SemanticParserAdapter {

	private final CompletionProcessor myCompletionProcessor;

	public OperationSemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider) {
		this(lookupSuite, labelProvider, new BasicApplyStrategy(), new OperationToString.VIEW(), new OperationToString.EDIT());
	}

	public OperationSemanticParser(LookupSuite lookupSuite, ILabelProvider labelProvider, ApplyStrategy applier, WithReferences view, ExternalToString edit) {
		super(new OperationParser(lookupSuite), applier, view, edit);
		myCompletionProcessor = new CompletionProcessor(lookupSuite.getLookup(Type.class), labelProvider);
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

	private static class CompletionProcessor extends LookupCompletionProcessor<Type> {

		public CompletionProcessor(Lookup<Type> typeLookup, ILabelProvider labelProvider) {
			super(typeLookup, labelProvider);
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

	}
}
