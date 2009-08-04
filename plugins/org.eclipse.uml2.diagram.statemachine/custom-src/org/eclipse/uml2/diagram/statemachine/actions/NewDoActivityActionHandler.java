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

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.UMLPackage;

public class NewDoActivityActionHandler extends NewActionHandler {
	@Override
	protected ICommand getCreateElementCommand(ShapeNodeEditPart editPart) {
		CreateElementRequest createRequest = 
			new CreateElementRequest(((View) editPart.getModel()).getElement(), UMLElementTypes.Behavior_3021);
		return new CreateDoActivityCommand(createRequest);
	}

	private static class CreateDoActivityCommand extends CreateElementCommand {
		public CreateDoActivityCommand(CreateElementRequest request) {
			super(request);
		}
		
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			State state = (State) ((CreateElementRequest) getRequest()).getContainer();
			Behavior doActivity = 
				state.createDoActivity(CustomMessages.NewDoActivityActionHandler_name_prefix, UMLPackage.Literals.ACTIVITY);
			return CommandResult.newOKCommandResult(doActivity);
		}
	}
}
