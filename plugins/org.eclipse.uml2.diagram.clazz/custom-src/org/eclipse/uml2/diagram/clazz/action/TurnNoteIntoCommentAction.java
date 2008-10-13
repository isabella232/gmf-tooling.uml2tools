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
package org.eclipse.uml2.diagram.clazz.action;

import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.notation.DescriptionStyle;
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.helpers.CommentEditHelper;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.actions.ConvertElementActionBase;

public class TurnNoteIntoCommentAction extends ConvertElementActionBase {

	public TurnNoteIntoCommentAction() {
		super(UMLElementTypes.Comment_2018);
	}
	
	@Override
	protected void processCreateViewRequest(CreateViewRequest request, GraphicalEditPart editPart) {
		String newString = "";
		DescriptionStyle style = (DescriptionStyle) ((View) editPart.getModel()).getStyle(NotationPackage.eINSTANCE.getDescriptionStyle());
		if (style != null) {
			String descString = style.getDescription();
			if (descString != null && descString.length() > 0) {
				newString = descString;
			}
		}
		request.getExtendedData().put(CommentEditHelper.PARAMETER_COMMENT_BODY, newString);
	}

	@Override
	protected void convertName(CompositeTransactionalCommand parentCommand, GraphicalEditPart editPart, CreateViewRequest request) {
	}

}
