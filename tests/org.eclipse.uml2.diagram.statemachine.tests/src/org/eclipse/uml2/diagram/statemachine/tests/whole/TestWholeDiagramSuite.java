package org.eclipse.uml2.diagram.statemachine.tests.whole;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestSuite;

public class TestWholeDiagramSuite extends TestSuite {

	public TestWholeDiagramSuite() {
		for (String name : oursDiagramFiles) {
			addTest(new TestWholeStateMDiagram(name + ".uml", name + ".umlstatemachine_diagram"));
		}
	}

	private static List<String> oursDiagramFiles = new ArrayList<String>();
	static {
		oursDiagramFiles.add("15.22.Junction");
		oursDiagramFiles.add("15.25.Fork and Join");
		oursDiagramFiles.add("15.32.State with compartments");
		oursDiagramFiles.add("15.35.Orthogonal state with regions");
		oursDiagramFiles.add("15.38.State machine with exit point on the border of the statemachine");
	}

}
