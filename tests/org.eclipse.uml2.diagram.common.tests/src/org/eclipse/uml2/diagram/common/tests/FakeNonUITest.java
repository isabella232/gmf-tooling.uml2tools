package org.eclipse.uml2.diagram.common.tests;

import junit.framework.TestCase;

public class FakeNonUITest extends TestCase {
	public void testNonUITest() throws Exception {
		//all actual tests for StateMachineDiagram require GMF diagram viewer and 
		//can not be run in headless mode (see #[194901]).
		//Thus, they are disabled in the Eclipse EMFT build procedure that 
		//can run headless tests only 
	}
}
