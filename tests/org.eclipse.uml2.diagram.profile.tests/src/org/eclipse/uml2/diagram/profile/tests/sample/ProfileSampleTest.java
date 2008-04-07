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
import org.eclipse.uml2.diagram.common.wholediagram.TestWholeDiagram;
import org.eclipse.uml2.diagram.common.wholediagram.UMLInitDiagramFacade;
import org.eclipse.uml2.diagram.profile.tests.InitProfileDiagramFacade;
import org.osgi.framework.Bundle;

public class ProfileSampleTest extends TestWholeDiagram {

	public ProfileSampleTest(String modelFileName, String diagramFileName) {
		super(modelFileName, diagramFileName);
	}

	@Override
	protected UMLInitDiagramFacade restoreDiagram(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		return new InitProfileDiagramFacade(modelFile, diagramFile);
	}

	@Override
	protected URL getURL(String fileName) {
		return FileLocator.find(UML_TEST_BUNDLE, new Path(EXAMPLE_FOLDER + fileName), Collections.EMPTY_MAP);
	}

	private final static Bundle UML_TEST_BUNDLE = Platform.getBundle("org.eclipse.uml2.diagram.profile.tests");

	private final static String EXAMPLE_FOLDER = "examples/";
}
