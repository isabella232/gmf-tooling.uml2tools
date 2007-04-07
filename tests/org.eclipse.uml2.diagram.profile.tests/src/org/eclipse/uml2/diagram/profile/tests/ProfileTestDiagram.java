package org.eclipse.uml2.diagram.profile.tests;

import java.io.IOException;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.uml2.diagram.common.tests.UMLTestDiagram;
import org.eclipse.uml2.diagram.profile.edit.parts.ProfileEditPart;
import org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorUtil;


public class ProfileTestDiagram extends UMLTestDiagram {
	public ProfileTestDiagram(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		super(modelFile, diagramFile);
	}

	public ProfileTestDiagram(String path) {
		super(path);
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		return UMLDiagramEditorUtil.createDiagram(diagramModelURI, domainModelURI, new NullProgressMonitor());
	}

	@Override
	protected String getDiagramFileExtension() {
		return "umlprofile_diagram";
	}

	@Override
	protected Diagram createDiagramView(EObject modelRoot) {
		return ViewService.createDiagram(modelRoot, ProfileEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
	}

	@Override
	protected void initDiagramContents(Diagram diagram, EObject modelRoot) {
		new DiagramContentsInitializer().initDiagramContents(diagram, modelRoot);
	}

}
