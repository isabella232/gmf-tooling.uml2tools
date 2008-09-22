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

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.contentassist.IContentAssistSubjectControl;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Point;
import org.eclipse.uml2.diagram.parser.assist.EObjectCompletionProcessor;


public abstract class CompositeCompletionProcessor extends EObjectCompletionProcessor  {
	
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
		CompletionProcessor p = getCompletionProcessor(prefix);
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

	protected abstract CompletionProcessor getCompletionProcessor(String prefix);

	@Override
	protected Iterable<String> computeContextProposals(EObject context) {
		return null;
	}
	
}
