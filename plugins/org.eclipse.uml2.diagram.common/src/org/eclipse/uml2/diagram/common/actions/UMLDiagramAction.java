/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.actions;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

public abstract class UMLDiagramAction implements IObjectActionDelegate {

	private GraphicalEditPart mySelectedElement;

	public void run(IAction action) {
		if (mySelectedElement == null) {
			return;
		}
		Command command = getCommand();
		if (command != null && command.canExecute()) {
			mySelectedElement.getDiagramEditDomain().getDiagramCommandStack().execute(getCommand());
		} 
	}

	public void selectionChanged(IAction action, ISelection selection) {
		mySelectedElement = null;
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection) selection;
			if (structuredSelection.getFirstElement() instanceof GraphicalEditPart) {
				mySelectedElement = (GraphicalEditPart) structuredSelection.getFirstElement();
			}
		}
		action.setEnabled(mySelectedElement != null);
	}
	
	protected GraphicalEditPart getSelectedEditPart() {
		return mySelectedElement;
	}

	protected abstract Command getCommand();

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
	}

}
