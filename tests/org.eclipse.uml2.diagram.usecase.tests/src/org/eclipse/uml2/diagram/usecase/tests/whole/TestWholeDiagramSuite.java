package org.eclipse.uml2.diagram.usecase.tests.whole;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.uml2.diagram.usecase.tests.UseCaseDiagramFacade;

import junit.framework.TestSuite;

public class TestWholeDiagramSuite extends TestSuite {

	public TestWholeDiagramSuite() {
		for (String name : oursDiagramFiles) {
			addTest(new TestWholeUseCaseDiagram(name + ".uml", name + "." + UseCaseDiagramFacade.DIAGRAM_FILE_EXTENSION));
		}

	}

	private static List<String> oursDiagramFiles = new ArrayList<String>();
	static {
		oursDiagramFiles.add("Figure 16.10 - UseCase diagram with a rectangle representing the boundary of the subject");
		// test fails because it contains link to link, hence, diagram refresh is needed. see UMLInitDiagramFacade#refreshDiagram()
		oursDiagramFiles.add("Figure 16.3 - Example of an extend relationship between use cases");
		oursDiagramFiles.add("Figure 16.7 - Example of use cases owned by various packages");
		oursDiagramFiles.add("Figure 16.9 - Example of the classifier based notation for a use case");
	}

}
