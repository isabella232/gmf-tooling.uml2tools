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
package org.eclipse.uml2.diagram.common.codeassist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.contentassist.IContentAssistSubjectControl;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Point;
import org.eclipse.uml2.diagram.parser.assist.EObjectCompletionProcessor;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.NamedElement;
import org.eclipse.uml2.uml.Type;


public class OperationCompletionProcessor extends EObjectCompletionProcessor  {
	
	private final OCLLookup<Type> myTypeLookup;
	
	public OperationCompletionProcessor(OCLLookup<Type> lookup) {
		myTypeLookup = lookup;
	}	

	@Override
	public ICompletionProposal[] computeCompletionProposals(IContentAssistSubjectControl subjectControl, int offset) {
		if (myContext == null) {
			return NO_PROPOSALS;
		}
		Point selection = subjectControl.getSelectedRange();
		int selectionStart = selection.x;
		int selectionLength = selection.y;
		String prefix = getPrefix(subjectControl, selectionStart);
		List<ICompletionProposal> result = new LinkedList<ICompletionProposal>();
		CompletionProcessor p = CompletionProcessor.NULL_PROCESSOR;
		if (OperationAnalizer.isInType(prefix)) {
			p = new TypeCompletionProcessor();
		} else if (OperationAnalizer.isInOperationProperty(prefix)) {
			p = new PropertyCompletionProcessor(); 
		}
		String proposalPrefix = p.getProposalPrefix(prefix);
		int prefixLength = proposalPrefix.length();
		for (String next : p.computeProposals(myContext)) {
			if (next == null || !next.startsWith(proposalPrefix)){
				continue;
			}
			ICompletionProposal proposal = new CompletionProposal(next, selectionStart - prefixLength, selectionLength + prefixLength, next.length(), null, next, null, null);
			result.add(proposal);
		}
		return result.toArray(NO_PROPOSALS);
	}

	@Override
	protected Iterable<String> computeContextProposals(EObject context) {
		return null;
	}
	
	private class PropertyCompletionProcessor implements CompletionProcessor {

		public String getProposalPrefix(String prefix) {
			return OperationAnalizer.getOperationPropertyPrefix(prefix);
		}

		public Iterable<String> computeProposals(EObject context) {
			return OPERATION_PROPERTIES;
		}
	}
	
	private class TypeCompletionProcessor implements CompletionProcessor {

		public String getProposalPrefix(String prefix) {
			return OperationAnalizer.getTypePrefix(prefix);
		}

		public Iterable<String> computeProposals(EObject context) {
			List<Type> scope = myTypeLookup.computeScope(context);
			List<String> res = new ArrayList<String>();
			for (NamedElement el: scope) {
				res.add(el.getName());
			}
			return res;
		}

	}

	private static final List<String> OPERATION_PROPERTIES = Arrays.asList(new String[] { "redefines", //$NON-NLS-1$
			"ordered", //$NON-NLS-1$
			"unordered", //$NON-NLS-1$
			"unique", //$NON-NLS-1$
			"nonunique", //$NON-NLS-1$
			"query", });//$NON-NLS-1$

}
