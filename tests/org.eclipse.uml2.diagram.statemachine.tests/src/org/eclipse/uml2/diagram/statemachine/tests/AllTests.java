/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sergey Gribovsky (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.statemachine.tests;

import org.eclipse.uml2.diagram.statemachine.tests.sync.SynchronizedDiagramContentTest;
import org.eclipse.uml2.diagram.statemachine.tests.tools.CreationToolTest;
import org.eclipse.uml2.diagram.statemachine.tests.whole.TestWholeDiagramSuite;

import junit.framework.Test;
import junit.framework.TestSuite;


public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.statemachine"); //$NON-NLS-1$
		//$JUnit-BEGIN$
		suite.addTestSuite(CreationToolTest.class);
		suite.addTestSuite(SynchronizedDiagramContentTest.class);
		suite.addTest(new TestWholeDiagramSuite());
		//$JUnit-END$
		return suite;
	}

}
