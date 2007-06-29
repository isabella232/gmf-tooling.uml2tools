package org.eclipse.uml2.diagram.common.tests;

import java.io.IOException;
import java.util.Collections;
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
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public abstract class UMLTestDiagram {

	protected abstract String getDiagramFileExtension();

	protected abstract Resource createDiagram(URI diagramModelURI, URI domainModelURI);
	
	protected abstract Diagram createDiagramView(EObject modelRoot);
	
	protected abstract void initDiagramContents(Diagram diagram, EObject modelRoot);

	private Resource myDiagramResource;

	private Resource myModelResource;

	private IDiagramWorkbenchPart myDiagramWorkbenchPart;

	public UMLTestDiagram(String projectPath) {
		myDiagramResource = createDiagram(projectPath);
	}

	public UMLTestDiagram(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		myDiagramResource = createRestoredDiagram(modelFile, diagramFile);
	}

	public void open() throws PartInitException {
		String path = myDiagramResource.getURI().toPlatformString(true);
		IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
		if (workspaceResource instanceof IFile) {
			IWorkbench workbench = PlatformUI.getWorkbench();
			IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
			IEditorPart editorPart = page
					.openEditor(new FileEditorInput((IFile) workspaceResource), workbench.getEditorRegistry().getDefaultEditor(workspaceResource.getFullPath().toString()).getId());
			myDiagramWorkbenchPart = (IDiagramWorkbenchPart) editorPart;
		}
	}

	public void close() {
		if (myDiagramWorkbenchPart != null && myDiagramWorkbenchPart instanceof IEditorPart) {
			IWorkbenchPage page = myDiagramWorkbenchPart.getSite().getPage();
			page.closeEditor((IEditorPart) myDiagramWorkbenchPart, false);
		}
		myDiagramWorkbenchPart = null;
		myDiagramResource.unload();
		myDiagramResource = null;
		if (myModelResource != null) {
			myModelResource.unload();
			myModelResource = null;
		}
	}

	public IDiagramWorkbenchPart getDiagramWorkbenchPart() {
		return myDiagramWorkbenchPart;
	}

	public Diagram getView() {
		return (Diagram) myDiagramResource.getContents().get(0);
	}

	private Resource createRestoredDiagram(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		diagramFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		final EObject modelRoot = getModelRoot(modelFile, resourceSet);

		Diagram diagram = createDiagramView(modelRoot);
		initDiagramContents(diagram, modelRoot);

		Resource result = createEmptyResource(resourceSet, diagramFile);
		addDiagram(result, diagram, editingDomain, diagramFile);
		result.save(Collections.EMPTY_MAP);
		return result;
	}

	private void addDiagram(final Resource diagramResource, final Diagram diagram, TransactionalEditingDomain editingDomain, IFile diagramFile) throws ExecutionException {
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

	private Resource createDiagram(String projectPath) {
		URI diagramModelURI = URI.createPlatformResourceURI(projectPath + "/test." + getDiagramFileExtension(), false); //$NON-NLS-1$
		URI domainModelURI = URI.createPlatformResourceURI(projectPath + "/test.uml", false); //$NON-NLS-1$
		return createDiagram(diagramModelURI, domainModelURI);
	}

}
