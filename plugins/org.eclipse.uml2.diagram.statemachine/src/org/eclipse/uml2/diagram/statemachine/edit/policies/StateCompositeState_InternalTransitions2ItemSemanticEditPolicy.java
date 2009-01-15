package org.eclipse.uml2.diagram.statemachine.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Transition2CreateCommand;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */

public class StateCompositeState_InternalTransitions2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateCompositeState_InternalTransitions2ItemSemanticEditPolicy() {
		super(UMLElementTypes.State_3016);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Transition_3022 == req.getElementType()) {
			return getGEFWrapper(new Transition2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
