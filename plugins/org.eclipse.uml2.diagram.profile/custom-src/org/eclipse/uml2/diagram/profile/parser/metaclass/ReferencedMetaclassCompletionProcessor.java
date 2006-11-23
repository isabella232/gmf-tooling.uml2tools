/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.profile.parser.metaclass;

import java.util.LinkedList;
import java.util.List;
import java.util.SortedSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.contentassist.IContentAssistSubjectControl;
import org.eclipse.jface.contentassist.ISubjectControlContentAssistProcessor;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.jface.text.contentassist.IContextInformation;
import org.eclipse.jface.text.contentassist.IContextInformationValidator;
import org.eclipse.swt.graphics.Point;
import org.eclipse.uml2.uml.resource.UMLResource;

public class ReferencedMetaclassCompletionProcessor implements IContentAssistProcessor, ISubjectControlContentAssistProcessor {
	private static final ICompletionProposal[] NO_PROPOSALS = new ICompletionProposal[0];
	private static final IContextInformation[] NO_CONTEXTS= new IContextInformation[0];

	private final MetaclassesList myMetaclasses;
	private EObject myContext;
	
	public ReferencedMetaclassCompletionProcessor(MetaclassesList metaclasses){
		myMetaclasses = metaclasses;
	}
	
	public ReferencedMetaclassCompletionProcessor(){
		this(new MetaclassesList(UMLResource.UML_METAMODEL_URI));
	}
	
	public ICompletionProposal[] computeCompletionProposals(IContentAssistSubjectControl subjectControl, int offset) {
		if (myContext == null){
			return NO_PROPOSALS;
		}
		
		Point selection = subjectControl.getSelectedRange();
		int selectionStart = selection.x; 
		int selectionLength = selection.y;
		String prefix = getPrefix(subjectControl, selectionStart);		
		int prefixLength = prefix.length(); 
			
		SortedSet<String> allNames = myMetaclasses.getMetaclassNames(myContext);
		List<ICompletionProposal> result = new LinkedList<ICompletionProposal>();
		for (String next : allNames.subSet(prefix, prefix + "\uFFFF")){
			ICompletionProposal proposal = new CompletionProposal(next, selectionStart - prefixLength, selectionLength + prefixLength, next.length(), null, next, null, null);
			result.add(proposal);
		}
		return result.toArray(NO_PROPOSALS);
	}
	
	public void setContext(EObject context) {
		myContext = context;
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
		//return new char[] {'a', 'k', ' '};
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

	private String getPrefix(IContentAssistSubjectControl subjectControl, int offset) {
		IDocument doc= subjectControl.getDocument();
		if (doc == null || offset > doc.getLength()){
			throw new IllegalStateException("Bad content assist subject control: " + doc);
		}
		try {
			int length = 0;
			while (--offset >= 0 && Character.isJavaIdentifierPart(doc.getChar(offset))){
				length++;
			}
			
			return doc.get(offset + 1, length);
		} catch (BadLocationException e){
			throw new IllegalStateException(e);
		}
	}
}
