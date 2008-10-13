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

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequestFactory;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;

public abstract class ConvertElementActionBase extends UMLDiagramAction {
	
	private final IElementType myNewElementType;

	public ConvertElementActionBase(IElementType type) {
		myNewElementType = type;
	}

	@Override
	protected Command getCommand() {
		final GraphicalEditPart editPart = getSelectedEditPart();
		// select
		if (editPart == null) {
			return UnexecutableCommand.INSTANCE;
		}
		Command deleteCommand = getDeleteViewCommand(editPart);
		if (deleteCommand == null) {
			return UnexecutableCommand.INSTANCE;
		}
		CreateViewRequest request = getCreateRequest(editPart, editPart.getDiagramPreferencesHint(), myNewElementType);
		processCreateViewRequest(request, editPart);
		Command createViewCommand = getCreateViewCommand(editPart, request);
		if (createViewCommand == null) {
			return UnexecutableCommand.INSTANCE;
		}
		CompositeTransactionalCommand command = new CompositeTransactionalCommand(editPart.getEditingDomain(), "Turn Comment Into Node");
		command.compose(new CommandProxy(deleteCommand));
		command.compose(new CommandProxy(createViewCommand));
		convertName(command, editPart, request);
		if (command.isEmpty() || command.size() == 0) {
			return UnexecutableCommand.INSTANCE;
		}
		return new ICommandProxy(command);
	}

	private Command getDeleteViewCommand(GraphicalEditPart editPart) {
		DestroyElementRequest request = new DestroyElementRequest(editPart.getEditingDomain(), false);
		Command command = editPart.getCommand(new EditCommandRequestWrapper(request));
		return (command != null) ? command : UnexecutableCommand.INSTANCE;
	}

	private Command getCreateViewCommand(GraphicalEditPart editPart, CreateViewRequest request) {
		return editPart.getParent().getCommand(request);
	}

	private CreateViewRequest getCreateRequest(GraphicalEditPart editPart, PreferencesHint hint, IElementType elementType) {
		CreateViewRequest request = CreateViewRequestFactory.getCreateShapeRequest(elementType, hint);
		request.setLocation(getLocation(editPart));
		request.setSize(getSize(editPart));
		return request;
	}
	
	protected void processCreateViewRequest(CreateViewRequest request,  GraphicalEditPart editPart) {
	}

	protected abstract void convertName(CompositeTransactionalCommand parentCommand, GraphicalEditPart editPart, CreateViewRequest request);

	private Point getLocation(GraphicalEditPart editPart) {
		Rectangle b = editPart.getFigure().getBounds().getCopy();
		editPart.getFigure().translateToAbsolute(b);
		return b.getLocation();
	}

	private org.eclipse.draw2d.geometry.Dimension getSize(GraphicalEditPart editPart) {
		Rectangle b = editPart.getFigure().getBounds().getCopy();
		editPart.getFigure().translateToAbsolute(b);
		return b.getSize();
	}

}
