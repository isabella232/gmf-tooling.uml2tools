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
package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ParameterSetEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;


public class XYLayoutBorderItemsEditPolicy extends XYLayoutEditPolicy {
	@Override
	protected EditPolicy createChildEditPolicy(EditPart child) {
		View childView = (View) child.getModel();
		switch (UMLVisualIDRegistry.getVisualID(childView)) {
		case ActivityParameterNodeEditPart.VISUAL_ID:
		case ParameterSetEditPart.VISUAL_ID:
			return new BorderItemSelectionEditPolicy();
		}
		return super.createChildEditPolicy(child);
	}
}
