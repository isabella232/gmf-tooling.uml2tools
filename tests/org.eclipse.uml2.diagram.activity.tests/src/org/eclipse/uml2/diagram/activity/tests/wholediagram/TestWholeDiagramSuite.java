package org.eclipse.uml2.diagram.activity.tests.wholediagram;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestSuite;

public class TestWholeDiagramSuite extends TestSuite {

	public TestWholeDiagramSuite() {
		for (String name : oursDiagramFiles) {
			addTest(new TestWholeActivityDiagram(name + ".uml", name + ".umlactivity_diagram"));
		}

	}

	private static List<String> oursDiagramFiles = new ArrayList<String>();
	static {
		oursDiagramFiles.add("12.115.Object node notations");
		oursDiagramFiles.add("12.126.Pin examples");
		oursDiagramFiles.add("12.35.Example of an activity with input parameter");
		oursDiagramFiles.add("12.49.Activity final example");
		oursDiagramFiles.add("12.59.Activity partition using swimlane example");
		oursDiagramFiles.add("12.75.Data store node example");
	}

}
