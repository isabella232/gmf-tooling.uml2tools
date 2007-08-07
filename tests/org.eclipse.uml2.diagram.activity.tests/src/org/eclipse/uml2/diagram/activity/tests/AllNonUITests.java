package org.eclipse.uml2.diagram.activity.tests;


import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.uml2.diagram.common.tests.FakeNonUITest;


public class AllNonUITests {

	public static Test suite() {
		TestSuite suite = new TestSuite("Test for org.eclipse.uml2.diagram.statemachine"); //$NON-NLS-1$
		//$JUnit-BEGIN$
		suite.addTestSuite(FakeNonUITest.class);
		//$JUnit-END$
		return suite;
	}

}
