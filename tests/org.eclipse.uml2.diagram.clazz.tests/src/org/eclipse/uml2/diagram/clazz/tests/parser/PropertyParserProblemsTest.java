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

package org.eclipse.uml2.diagram.clazz.tests.parser;

import org.eclipse.uml2.diagram.parser.ExternalParserException;

public class PropertyParserProblemsTest extends PropertyParserTestBase {
	public void testMultiplicityProblems(){
		assertParseError("b[1. .2]");
	}
	
	public void testIsDerivedProblems(){
		assertParseError("\\b"); //at least should not throw instanceof Error 
	}
	
	public void testDefaultProblems() throws ExternalParserException {
		assertEquals("2*3", parse("abc : int = 2*3").getDefault()); 
	}
	
	public void testNameProblems() throws ExternalParserException {
		assertEquals("subsets", parse("subsets").getName());
	}

}
