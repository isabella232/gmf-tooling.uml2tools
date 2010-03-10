/*
 * Copyright (c) 2006, 2010 Borland Software Corporation, and others
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.parser.assist;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.contentassist.IContentAssistSubjectControl;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.swt.graphics.Point;

/**
 * Computes completion proposals for given context EObject.
 * 
 * Intended to be used in case if the whole set of proposals does not depend on
 * the suggested prefix text and only filtering by given string prefix is
 * required to compute the result list.
 */
public abstract class EObjectCompletionProcessor extends CompletionProcessorBase {

	protected abstract Iterable<String> computeContextProposals(EObject context);

	public ICompletionProposal[] computeCompletionProposals(IContentAssistSubjectControl subjectControl, int offset) {
		if (getContext() == null) {
			return NO_PROPOSALS;
		}
		Point selection = subjectControl.getSelectedRange();
		int selectionStart = selection.x;
		int selectionLength = selection.y;
		String prefix = getPrefix(subjectControl, selectionStart);
		String proposalPrefix = getProposalPrefix(prefix);
		int prefixLength = proposalPrefix.length();

		List<ICompletionProposal> result = new LinkedList<ICompletionProposal>();
		for (String next : computeContextProposals(getContext())) {
			if (next == null || !next.startsWith(proposalPrefix)) {
				continue;
			}
			ICompletionProposal proposal = new CompletionProposal(next, selectionStart - prefixLength, selectionLength + prefixLength, next.length(), null, next, null, null);
			result.add(proposal);
		}
		return result.toArray(NO_PROPOSALS);
	}

	/**
	 * Extracts the part of the control text related to the proposal.
	 * <p>
	 * E.g, if the complete text entered in control is "myName : Str", then the
	 * type-proposal is expected to extract the proposal prefix "Str". Only the
	 * proposals starting with this proposal prefix will be considered.
	 * <p>
	 * By default, the whole control text is considered a relevant to proposal,
	 * subclass may override if needed.
	 * 
	 * @param prefix
	 *            text entered into the control before the actual selection
	 * @return
	 */
	protected String getProposalPrefix(String prefix) {
		return prefix;
	}

}
