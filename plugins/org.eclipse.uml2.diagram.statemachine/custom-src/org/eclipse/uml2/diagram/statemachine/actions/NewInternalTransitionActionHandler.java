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

import java.util.Iterator;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Region;
import org.eclipse.uml2.uml.State;
import org.eclipse.uml2.uml.Transition;
import org.eclipse.uml2.uml.TransitionKind;

public class NewInternalTransitionActionHandler extends NewActionHandler {
	@Override
	protected ICommand getCreateElementCommand(ShapeNodeEditPart editPart) {
		CreateElementRequest createRequest = new CreateElementRequest(getTransitionContainer(editPart), UMLElementTypes.Transition_3022);
		return new CreateInternalTransitionCommand(createRequest);
	}
	
	private EObject getTransitionContainer(ShapeNodeEditPart editPart) throws IllegalArgumentException {
		EObject element = ((View) editPart.getModel()).getElement();
		if (!(element instanceof State)) {
			throw new IllegalArgumentException();
		}
		EList<Region> regions = ((State) element).getRegions();
		if (regions.isEmpty()) {
			throw new IllegalArgumentException();
		}
		return regions.get(0);
	}
	
	private static class CreateInternalTransitionCommand extends CreateElementCommand {
		public CreateInternalTransitionCommand(CreateElementRequest createRequest) {
			super(createRequest);
		}
		
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			CommandResult result = super.doExecuteWithResult(monitor, info);
			Region region = (Region) ((CreateElementRequest) getRequest()).getContainer();
			Transition transition = (Transition) result.getReturnValue();
			transition.setName(getTransitionName(region));
			transition.setKind(TransitionKind.INTERNAL_LITERAL);
			State state = region.getState();
			transition.setSource(state);
			transition.setTarget(state);
			return result;
		}
		
		private String getTransitionName(Region region) {
			if (!hasTransition(region, CustomMessages.NewInternalTransitionActionHandler_name_prefix)) {
				return CustomMessages.NewInternalTransitionActionHandler_name_prefix;
			}
			
			for (int i = 1; i <= 9; i++) {
				String name = CustomMessages.NewInternalTransitionActionHandler_name_prefix + i;
				if (!hasTransition(region, name)) {
					return name;
				}
			}
			
			return CustomMessages.NewInternalTransitionActionHandler_name_prefix;
		}
		
		private boolean hasTransition(Region region, String name) {
			EList<Transition> transitions = region.getTransitions();
			for (Iterator<Transition> transitionsIterator = transitions.iterator(); transitionsIterator.hasNext();) {
				if (name.equals(transitionsIterator.next().getName())) {
					return true;
				}
			}
			
			return false;
		}
 	}
}
