package org.eclipse.uml2.diagram.profile.tests.sample;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestSuite;


public class ProfileTestSampleSuite extends TestSuite {
	public ProfileTestSampleSuite() {
		for (String name: oursDiagramFiles) {
			addTest(new ProfileSampleTest(name + ".profile.uml", name + ".umlprofile_diagram"));
		}
		
	}
	private static List<String> oursDiagramFiles = new ArrayList<String>();
	static {
		oursDiagramFiles.add("Ecore");
	}

}
