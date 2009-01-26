package org.eclipse.uml2.diagram.statemachine.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.statemachine.edit.commands.FinalStateCreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate2CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate3CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate4CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate5CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate6CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate7CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.Pseudostate8CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.PseudostateCreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.SimpleStateCreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.State2CreateCommand;
import org.eclipse.uml2.diagram.statemachine.edit.commands.SubmachineStateCreateCommand;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */

public class RegionSubverticesItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public RegionSubverticesItemSemanticEditPolicy() {
		super(UMLElementTypes.Region_3013);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.State_3001 == req.getElementType()) {
			return getGEFWrapper(new SimpleStateCreateCommand(req));
		}
		if (UMLElementTypes.State_3012 == req.getElementType()) {
			return getGEFWrapper(new State2CreateCommand(req));
		}
		if (UMLElementTypes.State_3016 == req.getElementType()) {
			return getGEFWrapper(new SubmachineStateCreateCommand(req));
		}
		if (UMLElementTypes.FinalState_3003 == req.getElementType()) {
			return getGEFWrapper(new FinalStateCreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_3004 == req.getElementType()) {
			return getGEFWrapper(new PseudostateCreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_3005 == req.getElementType()) {
			return getGEFWrapper(new Pseudostate2CreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_3006 == req.getElementType()) {
			return getGEFWrapper(new Pseudostate3CreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_3007 == req.getElementType()) {
			return getGEFWrapper(new Pseudostate4CreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_3008 == req.getElementType()) {
			return getGEFWrapper(new Pseudostate5CreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_3009 == req.getElementType()) {
			return getGEFWrapper(new Pseudostate6CreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_3010 == req.getElementType()) {
			return getGEFWrapper(new Pseudostate7CreateCommand(req));
		}
		if (UMLElementTypes.Pseudostate_3011 == req.getElementType()) {
			return getGEFWrapper(new Pseudostate8CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
