package org.eclipse.uml2.diagram.statemachine.tests.whole;

import java.net.URL;
import java.util.Collections;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.uml2.diagram.common.wholediagram.TestWholeDiagram;
import org.eclipse.uml2.diagram.common.wholediagram.UMLInitDiagramFacade;
import org.eclipse.uml2.diagram.statemachine.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditor;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin;
import org.osgi.framework.Bundle;

public class TestWholeStateMDiagram extends TestWholeDiagram {

	public TestWholeStateMDiagram(String modelFileName, String diagramFileName) {
		super(modelFileName, diagramFileName);
	}

	@Override
	protected UMLInitDiagramFacade getInitDiagramFacade(IFile modelFile, IFile diagramFile) {
		return new UMLInitDiagramFacade(modelFile, diagramFile, UMLDiagramEditor.ID) {

			@Override
			protected Diagram createDiagramView(EObject modelRoot) {
				return ViewService.createDiagram(modelRoot, PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
			}
			
		};
	}

	@Override
	protected URL findFileInTestPlugin(String fileName) {
		return FileLocator.find(UML_TEST_BUNDLE, new Path(EXAMPLE_FOLDER).append(fileName), Collections.EMPTY_MAP);
	}

	private final static Bundle UML_TEST_BUNDLE = Platform.getBundle("org.eclipse.uml2.diagram.statemachine.tests");

	private final static String EXAMPLE_FOLDER = "examples/";

}
