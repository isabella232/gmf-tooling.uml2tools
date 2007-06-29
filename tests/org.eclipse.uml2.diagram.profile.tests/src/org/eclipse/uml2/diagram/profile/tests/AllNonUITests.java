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

package org.eclipse.uml2.diagram.profile.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.uml2.diagram.common.tests.FakeNonUITest;

public class AllNonUITests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Headless tests for org.eclipse.uml2.diagram.clazz");
		//$JUnit-BEGIN$
		suite.addTest(new FakeNonUITest());
		//$JUnit-END$
		return suite;
	}

}
