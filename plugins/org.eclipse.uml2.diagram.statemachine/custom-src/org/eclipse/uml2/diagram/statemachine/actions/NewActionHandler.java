/*
 * Copyright (c) 2009 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sergey Gribovsky (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.statemachine.actions;

import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.resources.editor.parts.DiagramDocumentEditor;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.handlers.HandlerUtil;

public abstract class NewActionHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		DiagramDocumentEditor editor = (DiagramDocumentEditor) HandlerUtil.getActiveEditorChecked(event);
		ISelection selection = HandlerUtil.getCurrentSelectionChecked(event);
		if (false == selection instanceof IStructuredSelection) {
			return null;
		}
		List<?> editParts = ((IStructuredSelection) selection).toList();

		TransactionalEditingDomain domain = editor.getEditingDomain();
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(domain, CustomMessages.NewInternalTransitionActionHandler_command_label);
		for (Object nextEditPart : editParts) {
			if (nextEditPart instanceof ShapeNodeEditPart) {
				try {
					cc.add(getCreateElementCommand((ShapeNodeEditPart) nextEditPart));
				} catch (IllegalArgumentException iae) {
					;//Nothing to do
				}
			}
		}

		if (cc.canExecute()) {
			editor.getDiagramEditDomain().getDiagramCommandStack().execute(new ICommandProxy(cc.reduce()));
		}

		return null;
	}

	protected abstract ICommand getCreateElementCommand(ShapeNodeEditPart editPart);
}
