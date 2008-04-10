package org.eclipse.uml2.diagram.csd.whole;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.diagram.csd.tests.CSDiagramFacade;

import junit.framework.TestSuite;

public class TestWholeDiagramSuite extends TestSuite {

	public TestWholeDiagramSuite() {
		for (String name : oursDiagramFiles) {
			addTest(new TestWholeCSDiagram(name + ".uml", name + "." + CSDiagramFacade.DIAGRAM_FILE_EXTENSION));
		}

	}

	private static List<String> oursDiagramFiles = new ArrayList<String>();
	static {
		oursDiagramFiles.add("Figure 9.11 - The internal structure of the Observer collaboration shown inside the collaboration icon");
		oursDiagramFiles.add("Figure 9.14 - The BrokeredSale collaboration");
		oursDiagramFiles.add("Figure 9.16 - Port notation");
		oursDiagramFiles.add("Figure 9.19 - Port examples");
		oursDiagramFiles.add("Figure 9.20 - Properties");
	}

}
