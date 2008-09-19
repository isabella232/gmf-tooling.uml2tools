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
package org.eclipse.uml2.diagram.common.parser.property;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.text.contentassist.IContentAssistProcessor;
import org.eclipse.uml2.diagram.parser.BasicApplyStrategy;
import org.eclipse.uml2.diagram.parser.SemanticParserAdapter;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuiteImpl;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.Type;


public class PropertySemanticParser extends SemanticParserAdapter {
	private final LookupSuiteImpl myLookupSuite;
	
	public PropertySemanticParser(LookupSuiteImpl lookupSuite) {
		super(new PropertyParser(lookupSuite), new BasicApplyStrategy(), new PropertyToString.VIEW(), new PropertyToString.EDIT());
		myLookupSuite = lookupSuite;
	}

	@Override
	public IContentAssistProcessor getCompletionProcessor(IAdaptable element) {		
		EObject context = doAdapt(element);
		org.eclipse.uml2.diagram.common.codeassist.PropertyCompletionProcessor p = new org.eclipse.uml2.diagram.common.codeassist.PropertyCompletionProcessor(((OCLLookup<Type>)myLookupSuite.getLookup(Type.class)));
		p.setContext(context);
		return p;
	}
	
	private EObject doAdapt(IAdaptable adaptable) {
		EObject element = (EObject) adaptable.getAdapter(EObject.class);
		return element;
	}
	
}
