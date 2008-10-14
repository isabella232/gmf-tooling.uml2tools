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

import java.util.List;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.gef.RequestConstants;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest.ViewDescriptor;
import org.eclipse.gmf.runtime.emf.commands.core.command.AbstractTransactionalCommand;
import org.eclipse.gmf.runtime.notation.View;

public class DelayedCreateConnectionCommand extends AbstractTransactionalCommand {
	
	private final ViewDescriptor myNewlyCreatedView;
	private final EditPartViewer myViewer;
	private final CreateConnectionViewRequest myCreateConnectionRequest;
	private final GraphicalEditPart myLinkTargetEP;
	
	public DelayedCreateConnectionCommand(GraphicalEditPart targetEP, ViewDescriptor created, CreateConnectionViewRequest createRequest) {
		super(targetEP.getEditingDomain(), "Create Connection", null);
		myNewlyCreatedView = created;
		myViewer = targetEP.getViewer();
		myCreateConnectionRequest = createRequest;
		myLinkTargetEP = targetEP;
	}

	@Override
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		View view = (View) myNewlyCreatedView.getAdapter(View.class);
		EditPart sourceEditPart = (EditPart) myViewer.getEditPartRegistry().get(view);
		if (sourceEditPart == null) {
			return CommandResult.newOKCommandResult();
		}
		myCreateConnectionRequest.setSourceEditPart(sourceEditPart);
		myCreateConnectionRequest.setTargetEditPart(myLinkTargetEP);
		
		myCreateConnectionRequest.setType(RequestConstants.REQ_CONNECTION_START);
//		createViewRequest.setLocation(getSourceLocation(editPart));
		sourceEditPart.getCommand(myCreateConnectionRequest);

		myCreateConnectionRequest.setType(RequestConstants.REQ_CONNECTION_END);
//		createViewRequest.setLocation(getTargetLocation(editPart));
		Command createViewCommand = myLinkTargetEP.getCommand(myCreateConnectionRequest);

		if (createViewCommand.canExecute()) {
			createViewCommand.execute();
		}
		return CommandResult.newOKCommandResult();
	}
	
	public static ViewDescriptor getCreatedElement(CreateViewRequest createRequest) {
		if (createRequest == null) {
			return null;
		}
		List newObject = (List) createRequest.getNewObject();
		return (ViewDescriptor) ((List) newObject).get(0);
	}	
}
