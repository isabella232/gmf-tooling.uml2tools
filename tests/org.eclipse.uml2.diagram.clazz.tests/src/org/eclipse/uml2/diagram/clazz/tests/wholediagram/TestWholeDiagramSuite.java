package org.eclipse.uml2.diagram.clazz.tests.wholediagram;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestSuite;

public class TestWholeDiagramSuite extends TestSuite {

	public TestWholeDiagramSuite() {
		for (String name : oursDiagramFiles) {
			addTest(new TestWholeClassDiagram(name + ".uml", name + ".umlclass_diagram"));
		}

	}

	private static List<String> oursDiagramFiles = new ArrayList<String>();
	static {
		oursDiagramFiles.add("7.19.Graphic notation indicating exactly one association end owned by the association");
		oursDiagramFiles.add("7.20.Combining line path graphics");
		oursDiagramFiles.add("7.21.Binary and ternary associations");
		oursDiagramFiles.add("7.22.Association ends with various adornments");
		oursDiagramFiles.add("7.23.Examples of navigable ends");
		oursDiagramFiles.add("7.24.Example of attribute notation for navigable end owned by an end class");
		oursDiagramFiles.add("7.25.Derived supersets (union)");
		oursDiagramFiles.add("7.26.Composite aggregation is depicted as a black diamond");
		oursDiagramFiles.add("7.27.An AssociationClass is depicted by an association symbol (a line) and a class symbol (a box)");
		oursDiagramFiles.add("7.28.Class notation - details suppressed, analysis-level details, implementation-level details");
		oursDiagramFiles.add("7.30.Examples of attributes");
		oursDiagramFiles.add("7.33.Constraint attached to an attribute");
	}

}
