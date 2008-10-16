package org.eclipse.uml2.diagram.clazz.tests;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import org.eclipse.ui.PlatformUI;


public class UITestsWorksOnBuildServerSuite {

	public static Test suite() {
		TestSuite suite = new TestSuite("Checking that UI tests can be run on build server");
		suite.addTest(new SimpleUITest());
		return suite;
	}
	
	public static class SimpleUITest extends TestCase {
		public void testWorkbenchStarted(){
			System.out.println("SimpleUITest.testWorkbenchStarted(): started");
			assertNotNull(PlatformUI.getWorkbench());
			assertTrue(PlatformUI.isWorkbenchRunning());
			System.out.println("SimpleUITest.testWorkbenchStarted(): finished");
		}
	}
}
