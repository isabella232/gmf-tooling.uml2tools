package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.uml2.diagram.activity.edit.commands.CommentAnnotatedElementCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CommentAnnotatedElementReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.CommentAnnotatedElementEditPart;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */

public class ExceptionHandlerItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExceptionHandlerItemSemanticEditPolicy() {
		super(UMLElementTypes.ExceptionHandler_4005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

	/**
	* @generated
	*/
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	* @generated
	*/
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.CommentAnnotatedElement_4007 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	* @generated
	*/
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.CommentAnnotatedElement_4007 == req.getElementType()) {
			return getGEFWrapper(new CommentAnnotatedElementCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	* Returns command to reorient EReference based link. New link target or source
	* should be the domain model element associated with this node.
	* 
	* @generated
	*/
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case CommentAnnotatedElementEditPart.VISUAL_ID:
			return getGEFWrapper(new CommentAnnotatedElementReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
