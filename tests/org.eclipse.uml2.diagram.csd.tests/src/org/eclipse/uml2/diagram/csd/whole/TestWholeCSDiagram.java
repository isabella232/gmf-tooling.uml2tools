package org.eclipse.uml2.diagram.csd.whole;

import java.io.IOException;
import java.net.URL;
import java.util.Collections;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.uml2.diagram.common.wholediagram.TestWholeDiagram;
import org.eclipse.uml2.diagram.common.wholediagram.UMLInitDiagramFacade;
import org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.csd.part.UMLDiagramEditorPlugin;
import org.osgi.framework.Bundle;

public class TestWholeCSDiagram extends TestWholeDiagram {

	public TestWholeCSDiagram(String modelFileName, String diagramFileName) {
		super(modelFileName, diagramFileName);
	}

	@Override
	protected UMLInitDiagramFacade getInitDiagramFacade(IFile modelFile, IFile diagramFile) {
		return new UMLInitDiagramFacade(modelFile, diagramFile, org.eclipse.uml2.diagram.csd.part.UMLDiagramEditor.ID) {

			@Override
			protected Diagram createDiagramView(EObject modelRoot) {
				return ViewService.createDiagram(modelRoot, PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
			}

			@Override
			public Diagram getDiagramView() throws ExecutionException, IOException, CoreException {
				Diagram result = super.getDiagramView();
//				diagram should be refresh when link to link exists. 
				UMLInitDiagramFacade.refreshDiagram(result);
				return result;
			}

		};
	}

	@Override
	protected URL findFileInTestPlugin(String fileName) {
		return FileLocator.find(UML_TEST_BUNDLE, new Path(EXAMPLE_FOLDER).append(fileName), Collections.EMPTY_MAP);
	}

	@Override
	protected boolean ignoreView(int visualId) {
		return super.ignoreView(visualId) || Package2EditPart.VISUAL_ID == visualId;
	}

	private final static Bundle UML_TEST_BUNDLE = Platform.getBundle("org.eclipse.uml2.diagram.csd.tests");

	private final static String EXAMPLE_FOLDER = "examples/";

}
