package org.eclipse.uml2.diagram.clazz.tests.parser;

import org.eclipse.uml2.diagram.common.codeassist.OperationAnalizer;

import junit.framework.TestCase;

public class OperationCodeAssistTest extends TestCase {

	public void testIsInParameterType() throws Exception {
		assertTrue(OperationAnalizer.isInType("+ name( p :"));
		assertTrue(OperationAnalizer.isInType("+ name( p : "));
		assertTrue(OperationAnalizer.isInType("+ name( p : t"));
		assertTrue(OperationAnalizer.isInType("+ name( p :type"));
		assertTrue(OperationAnalizer.isInType("+ name( p :type, p2 :type"));
		assertFalse(OperationAnalizer.isInType("name( p :type, p2"));
		assertFalse(OperationAnalizer.isInType("name( p"));
		assertFalse(OperationAnalizer.isInType("na"));
	}

	public void testGetParameterTypePrefix() throws Exception {
		assertEquals(OperationAnalizer.getTypePrefix("+ name( p :"), "");
		assertEquals(OperationAnalizer.getTypePrefix("+ name( p : t"), "t");
		assertEquals(OperationAnalizer.getTypePrefix("+ name( p :type"), "type");
		assertEquals(OperationAnalizer.getTypePrefix("+ name( p :t1, p2 :t2"), "t2");
	}

	public void testIsInPropertyType() throws Exception {
		assertTrue(OperationAnalizer.isInType("+ name( p :type, p2 :ty) :"));
		assertTrue(OperationAnalizer.isInType("- name( p :type, p2 :ty) :type"));
		assertFalse(OperationAnalizer.isInType("- name( p :type, p2 :ty)"));
	}

	public void testGetPropertyTypePrefix() throws Exception {
		assertEquals(OperationAnalizer.getTypePrefix("+ name( p :type, p2 :ty) :"), "");
		assertEquals(OperationAnalizer.getTypePrefix("- name( p :type, p2 :ty) :type"), "type");
	}

	public void testIsInOperationProperty() throws Exception {
		assertTrue(OperationAnalizer.isInOperationProperty("name():type {ordered"));
		assertTrue(OperationAnalizer.isInOperationProperty("name(in p: type) {ordered"));
		assertTrue(OperationAnalizer.isInOperationProperty("name(in p: type) {ordered, unique"));
		assertTrue(OperationAnalizer.isInOperationProperty("name(in p: type) { ordered"));
		assertTrue(OperationAnalizer.isInOperationProperty("name(in p: type) { "));
		assertFalse(OperationAnalizer.isInOperationProperty("name(in p: type) "));
		assertFalse(OperationAnalizer.isInOperationProperty("name(in p: type) {}"));
	}
	public void testGetOperationProperty() throws Exception {
		assertEquals(OperationAnalizer.getOperationPropertyPrefix("name(in p: type) {ordered"), "ordered");
		assertEquals(OperationAnalizer.getOperationPropertyPrefix("name(in p: type) { ordered"), "ordered");
		assertEquals(OperationAnalizer.getOperationPropertyPrefix("name(in p: type) {ordered, unique"), "unique");		
	}

	public void testIsInParameterDirection() throws Exception {
		assertTrue(OperationAnalizer.isInDirection("name("));
		assertTrue(OperationAnalizer.isInDirection("name(in"));
		assertTrue(OperationAnalizer.isInDirection("name(in p: type, out"));
		assertFalse(OperationAnalizer.isInDirection("name(in p: type, out p2: type) in"));
	}

	public void testGetParameterDirection() throws Exception {
		assertEquals(OperationAnalizer.getParameterDirectionPrefix("name("), "");
		assertEquals(OperationAnalizer.getParameterDirectionPrefix("name(in"), "in");
		assertEquals(OperationAnalizer.getParameterDirectionPrefix("name(in p: type, out"), "out");
	}

}
