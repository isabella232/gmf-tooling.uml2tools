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
import org.eclipse.uml2.diagram.common.parser.property.PropertyParser;
import org.eclipse.uml2.diagram.parser.ExternalParserException;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.RedefinableElement;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

public class PropertyParserTestBase extends ParserTestBase {
	protected void assertParseError(String string){
		try {
			parse(string);
			fail("Should not be parsable: " + string);
		} catch (ExternalParserException e) {
			//expected
		}
	}
	
	protected Property newProperty() {
		return UMLFactory.eINSTANCE.createProperty();
	}
	
	protected Property parse(String string) throws ExternalParserException {
		getLookupSuite().resetAll();
		PropertyParser parser = new PropertyParser(getLookupSuite());
		EObject result = parser.parseNewObject(newProperty(), string);
		assertNotNull("Can not parse:" + string, result);
		assertEquals(UMLPackage.eINSTANCE.getProperty(), result.eClass());
		return (Property)result;
	}
	
	protected MockLookup<Type> getTypeLookup(){
		return getLookupSuite().getLookup(Type.class);
	}
	
	protected MockLookup<RedefinableElement> getRedefinesLookup(){
		return getLookupSuite().getLookup(RedefinableElement.class);
	}
	
	protected MockLookup<Property> getSubsetsLookup(){
		return getLookupSuite().getLookup(Property.class);
	}
}
