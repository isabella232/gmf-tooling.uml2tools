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

package org.eclipse.uml2.diagram.clazz.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.uml2.diagram.clazz.tests.lookup.TypeLookupTest;
import org.eclipse.uml2.diagram.clazz.tests.parser.OperationInplaceApplierTest;
import org.eclipse.uml2.diagram.clazz.tests.parser.OperationParserTest;
import org.eclipse.uml2.diagram.clazz.tests.parser.PropertyParserProblemsTest;
import org.eclipse.uml2.diagram.clazz.tests.parser.PropertyParserTest;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.clazz");
		//$JUnit-BEGIN$
		suite.addTestSuite(TypeLookupTest.class);
		suite.addTestSuite(OperationParserTest.class);
		suite.addTestSuite(OperationInplaceApplierTest.class);
		suite.addTestSuite(PropertyParserTest.class);
		//suite.addTestSuite(PropertyParserProblemsTest.class);
		//$JUnit-END$
		return suite;
	}

}
