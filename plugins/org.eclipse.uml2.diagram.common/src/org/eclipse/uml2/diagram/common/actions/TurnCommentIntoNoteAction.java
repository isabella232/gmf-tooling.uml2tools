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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.core.commands.SetPropertyCommand;
import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.internal.properties.Properties;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.type.DiagramNotationType;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Comment;

public class TurnCommentIntoNoteAction extends ConvertElementActionBase {

	public TurnCommentIntoNoteAction() {
		super(DiagramNotationType.NOTE, DiagramNotationType.NOTE_ATTACHMENT);
	}

	@Override
	protected void convertName(CompositeTransactionalCommand parentCommand, GraphicalEditPart editPart, CreateViewRequest request) {
		String newString = ((Comment) editPart.getNotationView().getElement()).getBody();
		SetPropertyCommand command = new SetPropertyCommand(editPart.getEditingDomain(), new ViewAdapterForCreateViewRequest(request), Properties.ID_DESCRIPTION, ViewType.TEXT, newString);
		parentCommand.compose(command);
	}

	private class ViewAdapterForCreateViewRequest implements IAdaptable {

		private final CreateViewRequest myRequest;

		private ViewAdapterForCreateViewRequest(CreateViewRequest request) {
			myRequest = request;
		}

		public Object getAdapter(Class adapter) {
			if (!View.class.equals(adapter)) {
				return null;
			}
			if (myRequest == null) {
				return null;
			}
			IAdaptable adaptable = DelayedCreateConnectionCommand.getCreatedElement(myRequest);
			if (adaptable != null) {
				return adaptable.getAdapter(View.class);
			}
			return null;
		}

	}

}
