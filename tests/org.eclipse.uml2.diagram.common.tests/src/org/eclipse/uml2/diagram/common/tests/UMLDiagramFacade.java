package org.eclipse.uml2.diagram.common.tests;

import junit.framework.Assert;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;

public abstract class UMLDiagramFacade {

	protected final String myDiagramFileExtension;

	protected abstract Resource createDiagram(URI diagramModelURI, URI domainModelURI);

	private Resource myDiagramResource;

	private Resource myModelResource;

	private IDiagramWorkbenchPart myDiagramWorkbenchPart;

	private String myProjectPath;

	public UMLDiagramFacade(String projectPath, String diagramFileExtension) {
		myProjectPath = projectPath;
		myDiagramFileExtension = diagramFileExtension;
	}

	public void create() {
		URI diagramModelURI = URI.createPlatformResourceURI(myProjectPath + "/test." + myDiagramFileExtension, false); //$NON-NLS-1$
		URI domainModelURI = URI.createPlatformResourceURI(myProjectPath + "/test.uml", false); //$NON-NLS-1$
		myDiagramResource = createDiagram(diagramModelURI, domainModelURI);
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

	public DiagramEditPart getDiagramEditPart() {
		Assert.assertNotNull(myDiagramWorkbenchPart);
		return myDiagramWorkbenchPart.getDiagramEditPart();
	}
	
	public IDiagramEditDomain getDiagramEditDomain() {
		Assert.assertNotNull(myDiagramWorkbenchPart);
		return myDiagramWorkbenchPart.getDiagramEditDomain();
	}

	public static void flushEventQueue() {
		Display display = Display.getDefault();
		while (display.readAndDispatch()) {
			// do nothing
		}
	}

}
