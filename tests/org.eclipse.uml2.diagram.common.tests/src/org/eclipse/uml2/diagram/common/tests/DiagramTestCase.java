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

package org.eclipse.uml2.diagram.common.tests;

import junit.framework.TestCase;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramEditDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramWorkbenchPart;
import org.eclipse.swt.widgets.Display;

public abstract class DiagramTestCase extends TestCase {
	private UMLTestProject project;
	private UMLTestDiagram diagram;

	public DiagramTestCase(String name) {
		super(name);
	}
	
	protected UMLTestProject getTestProject() {
		return project;
	}
	
	protected UMLTestDiagram getTestDiagram() {
		return diagram;
	}

	public DiagramEditPart getDiagramEditPart() {
		IDiagramWorkbenchPart part = getDiagramWorkbenchPart();
		assertNotNull(part);
		return part.getDiagramEditPart();
	}
	
	public IDiagramEditDomain getDiagramEditDomain() {
		IDiagramWorkbenchPart part = getDiagramWorkbenchPart();
		assertNotNull(part);
		return part.getDiagramEditDomain();
	}
	public IDiagramWorkbenchPart getDiagramWorkbenchPart() {
		return diagram.getDiagramWorkbenchPart();
	}


	public void flushEventQueue() {
		Display display = Display.getDefault();
		while (display.readAndDispatch()) {
			// do nothing
		}
	}

	protected void setUp() throws Exception {
		project = createProject();
		diagram = createDiagram();
		diagram.open();
		flushEventQueue();
	}

	protected void tearDown() throws Exception {
		flushEventQueue();
		project.close();
		diagram.close();
	}

	protected UMLTestProject createProject() throws CoreException {
		return new UMLTestProject();
	}
	protected abstract UMLTestDiagram createDiagram();

}
