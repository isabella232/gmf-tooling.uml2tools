package org.eclipse.uml2.diagram.common.wholediagram;

import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.operations.OperationHistoryFactory;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public abstract class UMLInitDiagramFacade {

	protected abstract Diagram createDiagramView(EObject modelRoot);

	private Resource myRestoredDiagramResource;

	private Resource myModelResource;

	private IDiagramWorkbenchPart myDiagramWorkbenchPart;

	private IFile myModelFile;

	private IFile myDagramFile;
	
	private final String diagram_editor_id;

	public UMLInitDiagramFacade(IFile modelFile, IFile diagramFile, String deID) {
		myModelFile = modelFile;
		myDagramFile = diagramFile;
		diagram_editor_id = deID;
	}

	public void close() {
		if (myDiagramWorkbenchPart != null && myDiagramWorkbenchPart instanceof IEditorPart) {
			IWorkbenchPage page = myDiagramWorkbenchPart.getSite().getPage();
			page.closeEditor((IEditorPart) myDiagramWorkbenchPart, false);
		}
		myDiagramWorkbenchPart = null;
		myRestoredDiagramResource.unload();
		myRestoredDiagramResource = null;
		if (myModelResource != null) {
			myModelResource.unload();
			myModelResource = null;
		}
	}

	public Diagram getDiagramView() throws ExecutionException, IOException, CoreException {
		return initializeDiagramFromDomainModel(myModelFile, myDagramFile);
	}
	
	private Diagram openDiagram(Resource diagram) throws PartInitException {
		String path = diagram.getURI().toPlatformString(true);
		IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
		if (workspaceResource instanceof IFile) {
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			IEditorPart editor = page.openEditor(new FileEditorInput((IFile) workspaceResource), diagram_editor_id);
			return ((DiagramDocumentEditor)editor).getDiagram();
		}
		return null;
	}
	
	public static void refreshDiagram(Diagram diagram) {
		EObject modelElement = diagram.getElement();
		List<?> editPolicies = CanonicalEditPolicy.getRegisteredEditPolicies(modelElement);
		for (Iterator<?> it = editPolicies.iterator(); it.hasNext();) {
			CanonicalEditPolicy nextEditPolicy = (CanonicalEditPolicy) it.next();
			nextEditPolicy.refresh();
		}
		
	}

	private Diagram initializeDiagramFromDomainModel(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		diagramFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		final EObject modelRoot = getModelRoot(modelFile, resourceSet);

		Diagram diagram = createDiagramView(modelRoot);

		myRestoredDiagramResource = createEmptyResource(resourceSet, diagramFile);
		addDiagramToResource(myRestoredDiagramResource, diagram, editingDomain, diagramFile);
		myRestoredDiagramResource.save(Collections.emptyMap());
		return openDiagram(myRestoredDiagramResource);
	}

	private void addDiagramToResource(final Resource diagramResource, final Diagram diagram, TransactionalEditingDomain editingDomain, IFile diagramFile) throws ExecutionException {
		List affectedFiles = new LinkedList();
		affectedFiles.add(diagramFile);
		AbstractTransactionalCommand command = new AbstractTransactionalCommand(editingDomain, "Initializing diagram contents", affectedFiles) { //$NON-NLS-1$

			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				diagramResource.getContents().add(diagram);
				return CommandResult.newOKCommandResult();
			}
		};
		OperationHistoryFactory.getOperationHistory().execute(command, new NullProgressMonitor(), null);
	}

	private Resource createEmptyResource(ResourceSet resourceSet, IFile diagramFile) {
		org.eclipse.emf.common.util.URI diagramModelURI = org.eclipse.emf.common.util.URI.createPlatformResourceURI(diagramFile.getFullPath().toString(), true);
		final Resource diagramResource = resourceSet.createResource(diagramModelURI);
		return diagramResource;
	}

	private EObject getModelRoot(final IFile modelFile, ResourceSet resourceSet) {
		URI domainModelURI = URI.createPlatformResourceURI(modelFile.getFullPath().toString(), false);
		myModelResource = resourceSet.getResource(domainModelURI, true);
		EObject modelRoot = (EObject) myModelResource.getContents().get(0);
		return modelRoot;
	}

}
