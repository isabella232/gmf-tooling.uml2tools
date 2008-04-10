package org.eclipse.uml2.diagram.csd.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.uml2.diagram.csd.whole.TestWholeDiagramSuite;

public class AllTests {
	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.csd");
		//$JUnit-BEGIN$
		suite.addTest(new TestWholeDiagramSuite());
		//$JUnit-END$
		return suite;
	}

}
