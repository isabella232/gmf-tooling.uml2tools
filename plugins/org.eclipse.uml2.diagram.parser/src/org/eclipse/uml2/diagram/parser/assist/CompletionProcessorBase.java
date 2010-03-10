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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.contentassist.IContentAssistSubjectControl;
import org.eclipse.jface.contentassist.ISubjectControlContentAssistProcessor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Point;

/**
 * Computes completion proposals for given context EObject.
 * 
 * Intended to be used in case if the whole set of proposals does not depend on
 * the suggested prefix text and only filtering by given string prefix is
 * required to compute the result list.
 */
@SuppressWarnings("deprecation")
public abstract class CompletionProcessorBase implements IContentAssistProcessor, ISubjectControlContentAssistProcessor {

	protected static final ICompletionProposal[] NO_PROPOSALS = new ICompletionProposal[0];

	protected static final IContextInformation[] NO_CONTEXTS = new IContextInformation[0];

	private EObject myContext;

	public void setContext(EObject context) {
		myContext = context;
	}

	protected final EObject getContext() {
		return myContext;
	}

	public IContextInformation[] computeContextInformation(IContentAssistSubjectControl contentAssistSubjectControl, int documentOffset) {
		return NO_CONTEXTS;
	}

	public ICompletionProposal[] computeCompletionProposals(ITextViewer viewer, int offset) {
		throw new UnsupportedOperationException("use ISubjectControlContentAssistProcessor instead");
	}

	public IContextInformation[] computeContextInformation(ITextViewer viewer, int offset) {
		return NO_CONTEXTS;
	}

	public char[] getCompletionProposalAutoActivationCharacters() {
		return null;
	}

	public char[] getContextInformationAutoActivationCharacters() {
		return null;
	}

	public IContextInformationValidator getContextInformationValidator() {
		return null;
	}

	public String getErrorMessage() {
		return null;
	}

	protected final String getPrefix(IContentAssistSubjectControl subjectControl, int offset) {
		IDocument doc = subjectControl.getDocument();
		if (doc == null || offset > doc.getLength()) {
			throw new IllegalStateException("Bad content assist subject control: " + doc);
		}
		try {
			return doc.get(0, offset);
		} catch (BadLocationException e) {
			throw new IllegalStateException(e);
		}
	}
	
	protected final String getControlTextBeforeSelection(IContentAssistSubjectControl subjectControl){
		Point selection = subjectControl.getSelectedRange();
		int selectionStart = selection.x;
		return getPrefix(subjectControl, selectionStart);
	}

}
