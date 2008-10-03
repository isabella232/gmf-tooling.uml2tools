package org.eclipse.uml2.diagram.clazz.tests.wholediagram;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestSuite;

public class TestWholeDiagramSuite extends TestSuite {

	public TestWholeDiagramSuite() {
		for (String name : oursDiagramFiles) {
			addTest(new TestWholeClassDiagram(name + ".uml", name + ".umlclass"));
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
		oursDiagramFiles.add("7.32.Comment notation");
		oursDiagramFiles.add("7.33.Constraint attached to an attribute");
		oursDiagramFiles.add("7.40.Example of element import with aliasing");
		oursDiagramFiles.add("7.48.Multiple ways of dividing subtypes (generalization sets) and constraint examples");
		oursDiagramFiles.add("7.54.Instance specifications representing two objects connected by a link");
		oursDiagramFiles.add("Example of stereotyped class notation");
		oursDiagramFiles.add("Figure 17.19 - Template Class and Bound Class");
		oursDiagramFiles.add("Figure 7.34 - {xor} constraint");
//		oursDiagramFiles.add("Figure 7.39 - Example of element import");
	}

}
