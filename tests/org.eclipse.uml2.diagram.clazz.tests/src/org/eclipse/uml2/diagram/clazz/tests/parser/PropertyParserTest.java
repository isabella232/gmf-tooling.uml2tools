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

import java.util.Arrays;

import org.eclipse.uml2.diagram.parser.ExternalParserException;
import org.eclipse.uml2.uml.LiteralUnlimitedNatural;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.VisibilityKind;

public class PropertyParserTest extends PropertyParserTestBase {
	
	public void testName() throws ExternalParserException {
		String simple = "abcDEF";
		assertEquals(simple, parse(simple).getName());
		
		String withSpaces = "abc def klm";
		assertEquals(withSpaces, parse(withSpaces).getName());
		
		String withDigits = "abc12345 def67890";
		assertEquals(withDigits, parse(withDigits).getName());
		assertParseError("123 starts with digit");

		String withUnderscore = "_____";
		assertEquals(withUnderscore, parse(withUnderscore).getName());

		String russian = "\u043f\u0440\u0435\u0432\u0435\u0434";
		assertEquals(russian, parse(russian).getName());

		assertParseError("a, b");
		assertParseError("a+b");
		assertParseError("a-b");
		assertParseError("a.b.c");
		assertParseError("");
		assertParseError("    ");
	}
	
	public void testNormalizeSpaces() throws ExternalParserException {
		assertEquals("a b", parse("a b").getName());
		assertEquals("a b", parse("       a b").getName());
		assertEquals("a b", parse("a b       ").getName());
		assertEquals("a b", parse("a         b").getName());
		assertEquals("a b", parse("a\tb").getName());
		assertEquals("a b", parse("a \t \t \t b").getName());
	}
	
	public void testVisibility() throws ExternalParserException {
		assertEquals(VisibilityKind.PACKAGE_LITERAL, parse("~abc").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, parse("+abc").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, parse("-abc").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, parse("#abc").getVisibility());
	
		assertEquals(VisibilityKind.PACKAGE_LITERAL, parse("~   def").getVisibility());
		assertEquals(VisibilityKind.PUBLIC_LITERAL, parse("+\tdef").getVisibility());
		assertEquals(VisibilityKind.PRIVATE_LITERAL, parse("   -def").getVisibility());
		assertEquals(VisibilityKind.PROTECTED_LITERAL, parse("   #  def").getVisibility());

		assertEquals(newProperty().getVisibility(), parse("abc").getVisibility());
		
		assertParseError("+#abc");
		assertParseError("++abc");
		assertParseError("+#abc");
		assertParseError("+");
		assertParseError("-");
		assertParseError("#");
		assertParseError("~");
	}

	public void testMultiplicity() throws ExternalParserException {
		assertEquals(1, parse("a[1..2]").getLower());
		assertEquals(2, parse("a[1..2]").getUpper());
		
		assertEquals(3, parse("a[3..3]").getLower());
		assertEquals(3, parse("a[3..3]").getUpper());
		
		assertEquals(9999, parse("a[9999..0]").getLower());
		assertEquals(0, parse("a[9999..0]").getUpper());
		
		assertEquals(57, parse("a[57]").getLower());
		assertEquals(57, parse("a[57]").getUpper());
		assertEquals(0, parse("a[*]").getLower());
		assertEquals(LiteralUnlimitedNatural.UNLIMITED, parse("a[*]").getUpper());
		assertEquals(LiteralUnlimitedNatural.UNLIMITED, parse("a[1..*]").getUpper());
		
		assertEquals(42, parse("a [  42 \t .. 84  ]").getLower());
		assertEquals(84, parse("a [  42 \t .. 84  ]").getUpper());
		
		assertEquals(1, parse("a[0001]").getLower());
		
		assertParseError("b[]");
		assertParseError("b[c]");
		assertParseError("b[c..d]");
		assertParseError("b[1][2][3]");
		
		assertParseError("a[999999999999999999]");
	}
	
	public void testIsDerived() throws ExternalParserException {
		assertFalse(parse("abc").isDerived());
		assertTrue(parse("/abc").isDerived());
		assertTrue(parse("+/abc").isDerived());
		assertTrue(parse("~ / \t abc").isDerived());
	}
	
	public void testType() throws ExternalParserException {
		parse("abc");
		getTypeLookup().assertNoSearches();
		
		parse("abc : CDE");
		getTypeLookup().assertSearches("CDE");
		
		parse("abc cde : DEF KLM");
		getTypeLookup().assertSearches("DEF KLM");
		
		parse("a1 b2 : C3    D4    E5");
		getTypeLookup().assertSearches("C3 D4 E5");
		
		parse("abc : A B C [6]");
		getTypeLookup().assertSearches("A B C");
		
		assertParseError("abc : [*]");
		assertParseError("abc : ABC : DEF ");
		assertParseError("abc :: ABC");
	}
	
	public void testDefault() throws ExternalParserException {
		assertEquals("5", parse("abc = 5").getDefault());
		assertEquals("5", parse("abc : int = 5").getDefault());
		assertEquals("5", parse("abc : boolean = 5").getDefault());
		assertEquals("ABC", parse("abc : int = ABC").getDefault());
		assertEquals(newProperty().getDefault(), parse("abc : int").getDefault());
		
		assertParseError("abc = ");
		assertParseError("abc == 5");
	}
	
	public void testModifiers() throws ExternalParserException {
		assertTrue(parse("abc {readOnly}").isReadOnly());
		assertTrue(parse("abc {unique}").isUnique());
		assertTrue(parse("abc {ordered}").isOrdered());
		assertTrue(parse("abc {unique, ordered}").isOrdered());
		assertTrue(parse("abc {unique, ordered}").isUnique());
		assertTrue(parse("abc {ordered, unique}").isUnique());
		assertFalse(parse("abc {ordered, nonunique, union}").isUnique());
		assertFalse(parse("abc {unordered, unique}").isOrdered());
		assertTrue(parse("abc {union}").isDerivedUnion());
		
		
		assertFalse(parse("abc {unique, nonunique}").isUnique());		
		assertTrue(parse("abc {nonunique, unique}").isUnique());
		
		Property aLot = parse("abc {ordered, nonunique, redefines def, subsets xyz, union }"); 
		assertFalse(aLot.isUnique());
		assertTrue(aLot.isOrdered());
		assertTrue(aLot.isDerivedUnion());
		
		assertParseError("abc {}");
		assertParseError("abc {set}");
		assertParseError("abc {unique ordered}");
	}
	
	public void testRedefines() throws ExternalParserException {
		parse("abc");
		getRedefinesLookup().assertNoSearches();
		
		parse("abc { unique }");
		getRedefinesLookup().assertNoSearches();
		
		parse("abc { redefines a }");
		getRedefinesLookup().assertSearches("a");
		
		parse("abc { redefines a b c }");
		getRedefinesLookup().assertSearches("a b c");

		parse("abc {redefines a, redefines b, redefines c}");
		getRedefinesLookup().assertSearches(Arrays.asList(new String[] {"a", "b", "c"}));
	
		parse("abc {redefines a, ordered, redefines b, unique, redefines c}");
		getRedefinesLookup().assertSearches(Arrays.asList(new String[] {"a", "b", "c"}));
	}
	
	public void testSubsets() throws ExternalParserException {
		parse("abc");
		getSubsetsLookup().assertNoSearches();
		
		parse("abc { unique }");
		getSubsetsLookup().assertNoSearches();
		
		parse("abc { subsets c }");
		getSubsetsLookup().assertSearches("c");
		
		parse("abc { subsets d e f}");
		getSubsetsLookup().assertSearches("d e f");

		parse("abc {subsets f, subsets e, subsets d}");
		getSubsetsLookup().assertSearches(Arrays.asList(new String[] {"f", "e", "d"}));
	
		parse("abc {subsets a, unique, ordered, subsets b, subsets c}");
		getSubsetsLookup().assertSearches(Arrays.asList(new String[] {"a", "b", "c"}));
	}

}
