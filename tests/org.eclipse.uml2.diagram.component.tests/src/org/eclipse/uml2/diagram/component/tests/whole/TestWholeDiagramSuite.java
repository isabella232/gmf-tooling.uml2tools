package org.eclipse.uml2.diagram.component.tests.whole;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.diagram.component.tests.ComponentDiagramFacade;

import junit.framework.TestSuite;

public class TestWholeDiagramSuite extends TestSuite {

	public TestWholeDiagramSuite() {
		for (String name : oursDiagramFiles) {
			addTest(new TestWholeComponentDiagram(name + ".uml", name + "." + ComponentDiagramFacade.DIAGRAM_FILE_EXTENSION));
		}

	}

	private static List<String> oursDiagramFiles = new ArrayList<String>();
	static {
		oursDiagramFiles.add("8.14.Example of wiring through dependencies");
		oursDiagramFiles.add("8.16.Delegation connectors");
		oursDiagramFiles.add("8.6.Component with provided and required interfaces");
	}

}
