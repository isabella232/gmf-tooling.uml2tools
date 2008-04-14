package org.eclipse.uml2.diagram.deploy.tests;

import org.eclipse.uml2.diagram.deploy.tests.tool.NodeTestPalette;
import org.eclipse.uml2.diagram.deploy.tests.whole.TestWholeDiagramSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.deploy");
		//$JUnit-BEGIN$
		suite.addTest(new TestWholeDiagramSuite());
		suite.addTestSuite(NodeTestPalette.class);
		//$JUnit-END$
		return suite;
	}

}
