package org.eclipse.uml2.diagram.statemachine.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */
public class CommentAnnotatedElementItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public CommentAnnotatedElementItemSemanticEditPolicy() {
		super(UMLElementTypes.CommentAnnotatedElement_4002);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
