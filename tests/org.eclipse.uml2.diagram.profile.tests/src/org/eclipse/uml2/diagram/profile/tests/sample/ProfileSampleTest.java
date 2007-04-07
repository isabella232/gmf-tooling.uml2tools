package org.eclipse.uml2.diagram.profile.tests.sample;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.uml2.diagram.common.tests.DiagramSampleTest;
import org.eclipse.uml2.diagram.common.tests.UMLTestDiagram;
import org.eclipse.uml2.diagram.profile.tests.ProfileTestDiagram;
import org.osgi.framework.Bundle;

public class ProfileSampleTest extends DiagramSampleTest {

	public ProfileSampleTest(String modelFileName, String diagramFileName) {
		super(modelFileName, diagramFileName);
	}

	@Override
	protected UMLTestDiagram restoreDiagram(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		return new ProfileTestDiagram(modelFile, diagramFile);
	}

	protected URL getURL(String fileName) {
		return FileLocator.find(UML_TEST_BUNDLE, new Path(fileName), Collections.EMPTY_MAP);
	}

	private final static Bundle UML_TEST_BUNDLE = Platform.getBundle("org.eclipse.uml2.diagram.profile.tests");

}
