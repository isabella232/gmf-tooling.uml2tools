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

package org.eclipse.uml2.diagram.activity.tests;

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
import org.eclipse.uml2.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.diagram.common.tests.UMLTestDiagram;


public class ActivityTestDiagram extends UMLTestDiagram {

	public ActivityTestDiagram(String projectPath) {
		super(projectPath);
	}

	public ActivityTestDiagram(IFile modelFile, IFile diagramFile) throws ExecutionException, IOException, CoreException {
		super(modelFile, diagramFile);
	}

	@Override
	protected Resource createDiagram(URI diagramModelURI, URI domainModelURI) {
		return UMLDiagramEditorUtil.createDiagram(diagramModelURI, domainModelURI, new NullProgressMonitor());
	}

	@Override
	protected Diagram createDiagramView(EObject modelRoot) {
		return ViewService.createDiagram(modelRoot, PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
	}

	@Override
	protected String getDiagramFileExtension() {
		return "umlactivity_diagram"; //$NON-NLS-1$
	}

	@Override
	protected void initDiagramContents(Diagram diagram, EObject modelRoot) {
	}

}
