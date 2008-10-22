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

import org.eclipse.gmf.runtime.diagram.core.util.ViewType;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.uml2.diagram.clazz.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.CommentEditPart;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.actions.ConvertCommentCommandBase;
import org.eclipse.uml2.diagram.common.actions.ConvertNoteToCommentAction;

public class TurnNoteIntoCommentAction extends ConvertNoteToCommentAction {

	public TurnNoteIntoCommentAction() {
		super(CLASS_D_CONFIG);
	}

	public static final ConvertCommentCommandBase.Config CLASS_D_CONFIG = new ConvertCommentCommandBase.Config() {

		public String getNoteAttachmentVisualID() {
			return ViewType.NOTEATTACHMENT;
		}

		public IElementType getAnnotatedElementElementType() {
			return UMLElementTypes.CommentAnnotatedElement_4019;
		}

		public int getCommentVisualID() {
			return CommentEditPart.VISUAL_ID;
		}

		public int getAnnotatedElementVisualID() {
			return CommentAnnotatedElementEditPart.VISUAL_ID;
		}

		public String getNoteVisualId() {
			return ViewType.NOTE;
		}
	};

}
