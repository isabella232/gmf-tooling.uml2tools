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
import org.eclipse.uml2.diagram.clazz.tests.tool.PaletteAssociationClassNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PaletteClassNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PaletteConstraintNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PaletteDataTypeNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PaletteEnumerationNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PaletteOperationNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PalettePackageNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PalettePrimitiveTypeNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PalettePropertyNodeTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PortProvidedCreationTest;
import org.eclipse.uml2.diagram.clazz.tests.tool.PortRequiredCreationTest;
import org.eclipse.uml2.diagram.clazz.tests.wholediagram.TestWholeDiagramSuite;

public class UITests {

	public static Test suite() {
		TestSuite suite = new TestSuite("UI Test for UML2Tools Class Diagram Editor plugin");
		//$JUnit-BEGIN$
		suite.addTest(new TestWholeDiagramSuite());
		suite.addTestSuite(ChangeInterfaceNotationActionTest.class);
		suite.addTestSuite(PaletteAssociationClassNodeTest.class);
		suite.addTestSuite(PaletteClassNodeTest.class);
 		suite.addTestSuite(PaletteConstraintNodeTest.class);
		suite.addTestSuite(PaletteDataTypeNodeTest.class);
		suite.addTestSuite(PaletteEnumerationNodeTest.class);
		suite.addTestSuite(PaletteOperationNodeTest.class);
		suite.addTestSuite(PalettePackageNodeTest.class);
		suite.addTestSuite(PalettePrimitiveTypeNodeTest.class);
		suite.addTestSuite(PalettePropertyNodeTest.class);
		suite.addTestSuite(PortProvidedCreationTest.class);
		suite.addTestSuite(PortRequiredCreationTest.class);
		//$JUnit-END$
		return suite;
	}

}
