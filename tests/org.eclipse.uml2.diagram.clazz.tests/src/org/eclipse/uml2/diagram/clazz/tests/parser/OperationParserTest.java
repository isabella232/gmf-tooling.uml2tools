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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.common.parser.operation.OperationParser;
import org.eclipse.uml2.diagram.parser.ExternalParserException;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuite;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterDirectionKind;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.VisibilityKind;

public class OperationParserTest extends ParserTestBase {

	public void testSample() throws ExternalParserException {
		final String TEXT = "- composite Name(in a : composite type[6] {ordered}, \t inout B, out c = 5) : string {unique, query} ";
		Type stringType = createType("string") ;
		Type compositeType = createType("composite type");
		MockLookupSuite suite = new MockLookupSuite();
		suite.setLookup(Type.class, new FixedLookup<Type>(new Type[] {stringType, compositeType}));
		Operation actual = parse(TEXT, suite);
		
		assertEquals(VisibilityKind.PRIVATE_LITERAL, actual.getVisibility());
		assertEquals("composite Name", actual.getName());
		assertTrue(actual.isUnique());
		assertFalse(actual.isOrdered());
		assertTrue(actual.isQuery());
		assertNotNull(actual.getReturnResult());
		assertEquals(stringType, actual.getReturnResult().getType());
		assertEquals(stringType, actual.getType());
		
		assertEquals(3 + 1, actual.getOwnedParameters().size());
		Parameter aParam = actual.getOwnedParameter("a", compositeType);
		Parameter bParam = actual.getOwnedParameter("B", null);
		Parameter cParam = actual.getOwnedParameter("c", null);
		
		assertNotNull(aParam);
		assertNotNull(bParam);
		assertNotNull(cParam);
		
		assertEquals(6, aParam.getLower());
		assertEquals(6, aParam.getUpper());
		assertTrue(aParam.isOrdered());
		assertEquals(UMLFactory.eINSTANCE.createParameter().isUnique(), aParam.isUnique());
		assertEquals(ParameterDirectionKind.IN_LITERAL, aParam.getDirection());
		
		assertEquals(ParameterDirectionKind.INOUT_LITERAL, bParam.getDirection());
		
		assertEquals(ParameterDirectionKind.OUT_LITERAL, cParam.getDirection());
		assertEquals("5", cParam.getDefault());
	}

	private Type createType(String name) {
		Type result = UMLFactory.eINSTANCE.createClass();
		result.setName(name);
		return result;
	}

	protected Operation parse(String text) throws ExternalParserException {
		getLookupSuite().resetAll();
		return parse(text, getLookupSuite());
	}

	protected static Operation parse(String text, LookupSuite lookup) throws ExternalParserException {
		OperationParser parser = new OperationParser(lookup);
		EObject result = parser.parseNewObject(getFakeContext(), text);
		assertNotNull(result);
		assertEquals(UMLPackage.eINSTANCE.getOperation(), result.eClass());
		return (Operation)result;
	}
	
	protected static EObject getFakeContext(){
		return UMLFactory.eINSTANCE.createOperation();
	}
}
