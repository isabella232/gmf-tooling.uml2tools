/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sergey Gribovsky (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.statemachine.tests;

import junit.framework.TestCase;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspace;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorUtil;


public class StateMachineDiagramTestCase extends TestCase {
	public StateMachineDiagramTestCase(String name) {
		super(name);
	}
	
	public DiagramEditPart getDiagramEditPart() {
		assertNotNull(getDiagramWorkbenchPart());		
		return getDiagramWorkbenchPart().getDiagramEditPart();
	}

	public IDiagramWorkbenchPart getDiagramWorkbenchPart() {
		return diagramWorkbenchPart;
	}

	public void flushEventQueue() {
		Display display = Display.getDefault();
		while (display.readAndDispatch()) {
			// do nothing
		}
	}

	protected void setUp() throws Exception {
		createProject();

		diagramResource = createDiagram();
		openDiagram();

		flushEventQueue();
	}

	protected void tearDown() throws Exception {
		flushEventQueue();

		closeDiagram();
        
        diagramResource.unload();
        diagramResource = null;

		closeProject();		
	}

	protected Resource createDiagram() throws Exception {
		return UMLDiagramEditorUtil.createDiagram(getDiagramModelURI(), getDomainModelURI(), new NullProgressMonitor());
	}
	
	protected URI getDiagramModelURI() {
		String projectPath = getProject().getFullPath().toString();
		return URI.createPlatformResourceURI(projectPath + "/test.umlstatemachine_diagram", false); //$NON-NLS-1$
	}
	
	protected URI getDomainModelURI() {
		String projectPath = getProject().getFullPath().toString();
		return URI.createPlatformResourceURI(projectPath + "/test.uml", false); //$NON-NLS-1$
	}

	private void createProject() throws Exception {
		IWorkspace workspace = ResourcesPlugin.getWorkspace();
		IWorkspaceRoot wsroot = workspace.getRoot();
		
		project = wsroot.getProject(getProjectName());
		
		IProjectDescription desc =
			workspace.newProjectDescription(project.getName());

		if (!project.exists()) {
			project.create(desc, null);
		}

		if (!project.isOpen()) {
			project.open(null);
		}
	}

	private void closeProject() throws CoreException {
		try {
			project.delete(true, true, null);
		} finally {
			project = null;
		}
	}

	private IProject getProject() {
		return project;
	}

	private void openDiagram() throws PartInitException {
        String path = diagramResource.getURI().toPlatformString(true);
        IResource workspaceResource = ResourcesPlugin.getWorkspace().getRoot().findMember(new Path(path));
        if (workspaceResource instanceof IFile)
        {
          IWorkbench workbench = PlatformUI.getWorkbench();
          IWorkbenchPage page = workbench.getActiveWorkbenchWindow().getActivePage();
          IEditorPart editorPart = page.openEditor(new FileEditorInput((IFile)workspaceResource), workbench.getEditorRegistry().getDefaultEditor(workspaceResource.getFullPath().toString()).getId());
          setDiagramWorkbenchPart((IDiagramWorkbenchPart) editorPart);
        }
	}

	private void closeDiagram() {	
		if (getDiagramWorkbenchPart() instanceof IEditorPart) {
			IWorkbenchPage page = getDiagramWorkbenchPart().getSite().getPage();
			
			page.closeEditor(
					(IEditorPart) getDiagramWorkbenchPart(),
					false);
		}
		setDiagramWorkbenchPart(null);
	}

	private String getProjectName() {
		return "state_machine_test_project"; //$NON-NLS-1$
	}

	private void setDiagramWorkbenchPart(IDiagramWorkbenchPart diagramWorkbenchPart) {
		this.diagramWorkbenchPart = diagramWorkbenchPart;
	}

	private IProject project;
	private Resource diagramResource;
	private IDiagramWorkbenchPart diagramWorkbenchPart;
}
