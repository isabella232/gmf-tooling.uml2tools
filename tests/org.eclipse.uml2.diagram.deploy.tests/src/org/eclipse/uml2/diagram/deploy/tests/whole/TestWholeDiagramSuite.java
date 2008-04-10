package org.eclipse.uml2.diagram.deploy.tests.whole;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.diagram.deploy.tests.DeployDiagramFacade;

import junit.framework.TestSuite;

public class TestWholeDiagramSuite extends TestSuite {

	public TestWholeDiagramSuite() {
		for (String name : oursDiagramFiles) {
			addTest(new TestWholeDeployDiagram(name + ".uml", name + "." + DeployDiagramFacade.DIAGRAM_FILE_EXTENSION));
		}

	}

	private static List<String> oursDiagramFiles = new ArrayList<String>();
	static {
		oursDiagramFiles.add("Figure 10.13 - A DeploymentSpecification for an artifact");
		oursDiagramFiles.add("Figure 10.14 - Notation for a Device");
		oursDiagramFiles.add("Figure 10.17 - Communication path between two Node types with deployed Artifacts");
	}

}
