/*
 * Copyright (c) 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.sequence.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class SDBuilderTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.sequence");
		//$JUnit-BEGIN$
		suite.addTestSuite(SDModelBuilderTest.class);
		suite.addTestSuite(SDFramesBuilderTest.class);
		suite.addTestSuite(SDCreateCombinedFragmentTest.class);
		//$JUnit-END$
		return suite;
	}

}
