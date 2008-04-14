package org.eclipse.uml2.diagram.usecase.tests;

import org.eclipse.uml2.diagram.usecase.tests.tool.ChildrenGroupTest;
import org.eclipse.uml2.diagram.usecase.tests.tool.NodesGroupTest;
import org.eclipse.uml2.diagram.usecase.tests.whole.TestWholeDiagramSuite;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.usecase");
		//$JUnit-BEGIN$
		suite.addTest(new TestWholeDiagramSuite());
		suite.addTestSuite(NodesGroupTest.class);
		suite.addTestSuite(ChildrenGroupTest.class);
		//$JUnit-END$
		return suite;
	}

}
