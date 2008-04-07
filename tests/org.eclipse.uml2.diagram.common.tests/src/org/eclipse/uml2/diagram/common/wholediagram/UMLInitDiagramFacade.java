package org.eclipse.uml2.diagram.common.wholediagram;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import junit.framework.Assert;

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
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public abstract class UMLInitDiagramFacade {

	protected abstract Resource createDiagram(URI diagramModelURI, URI domainModelURI);
	
	protected abstract Diagram createDiagramView(EObject modelRoot);
	
	protected abstract void initDiagramContents(Diagram diagram, EObject modelRoot);

	private Resource myRestoredDiagramResource;

	private Resource myModelResource;

	private IDiagramWorkbenchPart myDiagramWorkbenchPart;

	public UMLInitDiagramFacade(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		myRestoredDiagramResource = initializeDiagramFromDomainModel(modelFile, diagramFile);
	}

	public void open() throws PartInitException {
		String path = myRestoredDiagramResource.getURI().toPlatformString(true);
		IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
		if (false == workspaceResource instanceof IFile) {
			Assert.fail("workspace resource should be a file: " + workspaceResource);
		}
		IWorkbench workbench = PlatformUI.getWorkbench();
		IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
		IEditorPart editorPart = page.openEditor(new FileEditorInput((IFile) workspaceResource), workbench.getEditorRegistry().getDefaultEditor(workspaceResource.getFullPath().toString()).getId());
		myDiagramWorkbenchPart = (IDiagramWorkbenchPart) editorPart;
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

	public Diagram getRestoredDiagramView() {
		return (Diagram) myRestoredDiagramResource.getContents().get(0);
	}

	private Resource initializeDiagramFromDomainModel(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		diagramFile.setCharset("UTF-8", new NullProgressMonitor()); //$NON-NLS-1$
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		ResourceSet resourceSet = editingDomain.getResourceSet();
		final EObject modelRoot = getModelRoot(modelFile, resourceSet);

		Diagram diagram = createDiagramView(modelRoot);
		initDiagramContents(diagram, modelRoot);

		Resource result = createEmptyResource(resourceSet, diagramFile);
		addDiagramToResource(result, diagram, editingDomain, diagramFile);
		result.save(Collections.EMPTY_MAP);
		return result;
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
