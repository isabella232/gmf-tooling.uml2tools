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

package org.eclipse.uml2.diagram.clazz.tests.lookup;

import java.util.List;

import junit.framework.TestCase;

import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;
import org.eclipse.uml2.diagram.clazz.providers.UMLParserProvider;
import org.eclipse.uml2.diagram.parser.lookup.OCLLookup;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class TypeLookupTest extends TestCase {
	
	public void testAAA(){
		EditCommandRequestWrapper w = new EditCommandRequestWrapper(new SetRequest(UMLFactory.eINSTANCE.createActivity(), UMLPackage.eINSTANCE.getNamedElement_Name(), "Name"));
		assertNotNull(w);
	}
	
	public void testLookupScope(){
		Fixture fixture = new Fixture();
		OCLLookup<Type> lookup = getTypeLookup();
		List<Type> scopeA = lookup.computeScope(fixture.getClassA());
		assertNotNull(scopeA);
		assertFalse(scopeA.isEmpty());
		assertTrue(scopeA.contains(fixture.getClassA()));
		assertFalse(scopeA.contains(fixture.getClassB()));
		
		List<Type> scopeB = lookup.computeScope(fixture.getClassB());
		assertNotNull(scopeB);
		assertFalse(scopeB.isEmpty());
		assertFalse(scopeB.contains(fixture.getClassA()));
		assertTrue(scopeB.contains(fixture.getClassB()));
	}

	public void testSimpleNameLookup(){
		Fixture fixture = new Fixture();
		Class testerA = fixture.getTesterA();
		Property property = testerA.createOwnedAttribute("testProp", null);
		
		OCLLookup<Type> lookup = getTypeLookup();
		
		assertNull(lookup.lookup("NoSuchName", property));
		assertNull(lookup.lookup(fixture.getClassB().getName(), property));
		
		assertEquals(testerA, lookup.lookup(testerA.getName(), property));
		assertEquals(fixture.getClassA(), lookup.lookup("A", property));
		assertEquals(fixture.getEnumA(), lookup.lookup(fixture.getEnumA().getName(), property));
		assertEquals(fixture.getDataTypeA(), lookup.lookup(fixture.getDataTypeA().getName(), property));
		assertEquals(fixture.getPrimitiveTypeA(), lookup.lookup(fixture.getPrimitiveTypeA().getName(), property));
	}
	
	private OCLLookup<Type> getTypeLookup(){
		return UMLParserProvider.TYPE_LOOKUP;
	}
	
}
