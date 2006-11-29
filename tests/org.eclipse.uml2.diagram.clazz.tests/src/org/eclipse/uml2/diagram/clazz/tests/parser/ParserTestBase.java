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

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.uml2.diagram.parser.lookup.Lookup;
import org.eclipse.uml2.diagram.parser.lookup.LookupSuite;
import org.eclipse.uml2.uml.NamedElement;

public class ParserTestBase extends TestCase {
	private MockLookupSuite mySuite = new MockLookupSuite();

	protected MockLookupSuite getLookupSuite() {
		return mySuite;
	}
	
	protected static class MockLookupSuite implements LookupSuite {
		private HashMap<Class, MockLookup> myLookups = new HashMap<Class, MockLookup>();
		
		public <T> void setLookup(Class<T> clazz, MockLookup<T> lookup){
			myLookups.put(clazz, lookup);
		}
		
		public <T> MockLookup<T> getLookup(Class<T> clazz) {
			MockLookup<T> result = myLookups.get(clazz);
			if (result == null){
				result = new MockLookup<T>();
				setLookup(clazz, result);
			}
			return result;
		}
		
		public void resetAll(){
			for (MockLookup next : myLookups.values()){
				next.reset();
			}
		}
	}
	
	protected static class MockLookup<T> implements Lookup<T> {
		private final List<String> mySearches = new LinkedList<String>();
		
		public T lookup(String name, EObject context) {
			mySearches.add(name);
			return null;
		}
		
		public List<IElementType> getResolutionElementTypes() {
			return Collections.emptyList();
		}

		public void reset(){
			mySearches.clear();
		}
		
		public void assertSearches(List<String> expected){
			assertEquals(expected, mySearches);
		}
		
		public void assertSearches(String expected){
			assertSearches(Collections.singletonList(expected));
		}
		
		public void assertNoSearches(){
			assertSearches(Collections.<String>emptyList());
		}
	}
	
	protected static class FixedLookup<T extends NamedElement> extends MockLookup<T> {
		private final T[] myTypes;

		public FixedLookup(T[] types){
			myTypes = types;
		}
		
		public T lookup(String name, EObject context) {
			assertNotNull(name);
			for (int i = 0; i < myTypes.length; i++){
				T next = myTypes[i];
				if (name.equals(next.getName())){
					return next;
				}
			}
			return null;
		}
	}

}
