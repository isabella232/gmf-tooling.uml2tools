package org.eclipse.uml2.diagram.statemachine.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Behavior2CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Behavior3CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.BehaviorCreateCommand;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */

public class StateSimpleState_InternalActivitiesItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StateSimpleState_InternalActivitiesItemSemanticEditPolicy() {
		super(UMLElementTypes.State_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Behavior_3019 == req.getElementType()) {
			return getGEFWrapper(new BehaviorCreateCommand(req));
		}
		if (UMLElementTypes.Behavior_3020 == req.getElementType()) {
			return getGEFWrapper(new Behavior2CreateCommand(req));
		}
		if (UMLElementTypes.Behavior_3021 == req.getElementType()) {
			return getGEFWrapper(new Behavior3CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
