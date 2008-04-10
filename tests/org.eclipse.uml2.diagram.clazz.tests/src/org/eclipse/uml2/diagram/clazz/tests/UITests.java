/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.clazz.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.uml2.diagram.clazz.tests.action.ChangeInterfaceNotationActionTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PaletteNodesGroupTest;
import org.eclipse.uml2.diagram.clazz.tests.wholediagram.TestWholeDiagramSuite;

public class UITests {

	public static Test suite() {
		TestSuite suite = new TestSuite("UI Test for UML2Tools Class Diagram Editor plugin");
		//$JUnit-BEGIN$
		suite.addTest(new TestWholeDiagramSuite());
		suite.addTestSuite(ChangeInterfaceNotationActionTest.class);
		suite.addTestSuite(PaletteNodesGroupTest.class);
		//$JUnit-END$
		return suite;
	}

}
