package org.eclipse.uml2.diagram.activity.action;

import org.eclipse.uml2.diagram.activity.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CommentEditPart;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.actions.ConvertCommentCommandBase;
import org.eclipse.uml2.diagram.common.actions.ConvertCommentIntoNoteAction;

/**
 * @generated
 */
public class TurnCommentIntoNoteAction extends ConvertCommentIntoNoteAction {

	/**
	* @generated
	*/
	public TurnCommentIntoNoteAction() {
		super(new ConvertCommentCommandBase.ConfigImpl(CommentEditPart.VISUAL_ID, CommentAnnotatedElementEditPart.VISUAL_ID, UMLElementTypes.CommentAnnotatedElement_4007));
	}
}
