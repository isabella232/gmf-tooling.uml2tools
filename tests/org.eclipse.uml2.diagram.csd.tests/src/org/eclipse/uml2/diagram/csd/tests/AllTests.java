package org.eclipse.uml2.diagram.csd.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.uml2.diagram.csd.tests.tool.ChildrenGroupTest;
import org.eclipse.uml2.diagram.csd.tests.tool.NodesGroupTest;
import org.eclipse.uml2.diagram.csd.whole.TestWholeDiagramSuite;

public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.csd");
		//$JUnit-BEGIN$
		suite.addTest(new TestWholeDiagramSuite());
		suite.addTestSuite(NodesGroupTest.class);
		suite.addTestSuite(ChildrenGroupTest.class);
		//$JUnit-END$
		return suite;
	}

}
