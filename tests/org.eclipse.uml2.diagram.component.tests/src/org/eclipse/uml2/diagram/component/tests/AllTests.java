package org.eclipse.uml2.diagram.component.tests;

import org.eclipse.uml2.diagram.component.tests.tool.NodesGroupTest;
import org.eclipse.uml2.diagram.component.tests.whole.TestWholeDiagramSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.component");
		//$JUnit-BEGIN$
		suite.addTest(new TestWholeDiagramSuite());
		suite.addTestSuite(NodesGroupTest.class);
		//$JUnit-END$
		return suite;
	}

}
