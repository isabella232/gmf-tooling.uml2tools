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
		oursDiagramFiles.add("12.49.Activity final example");
	}

}
