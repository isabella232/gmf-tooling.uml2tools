package org.eclipse.uml2.diagram.clazz.tests.diagram;

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
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.part.DiagramContentsInitializer;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.diagram.common.tests.UMLDiagramFacade;


public class ClassDiagramFacade extends UMLDiagramFacade {

	@Override
	protected Diagram createDiagramView(EObject modelRoot) {
		return ViewService.createDiagram(modelRoot, PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
	}

	@Override
	protected void initDiagramContents(Diagram diagram, EObject modelRoot) {
		new DiagramContentsInitializer().initDiagramContents(diagram, modelRoot);
	}

	public ClassDiagramFacade(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		super(modelFile, diagramFile);
	}

	public ClassDiagramFacade(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		return UMLDiagramEditorUtil.createDiagram(diagramModelURI, domainModelURI, new NullProgressMonitor());
	}

	@Override
	protected String getDiagramFileExtension() {
		return "umlclass_diagram";
	}

}
