package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.diagram.timing.edit.commands.DMessageCreateCommand;
import org.eclipse.uml2.diagram.timing.edit.commands.DMessageReorientCommand;
import org.eclipse.uml2.diagram.timing.edit.commands.DStateSwitchCreateCommand;
import org.eclipse.uml2.diagram.timing.edit.commands.DStateSwitchReorientCommand;
import org.eclipse.uml2.diagram.timing.edit.parts.DMessageEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DStateSwitchEditPart;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

/**
 * @generated
 */

public class DSegmentStartItemSemanticEditPolicy extends TimingDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DSegmentStartItemSemanticEditPolicy() {
		super(TimingDElementTypes.DSegmentStart_3005);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
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
		if (TimingDElementTypes.DStateSwitch_4001 == req.getElementType()) {
			return null;
		}
		if (TimingDElementTypes.DMessage_4002 == req.getElementType()) {
			return getGEFWrapper(new DMessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TimingDElementTypes.DStateSwitch_4001 == req.getElementType()) {
			return getGEFWrapper(new DStateSwitchCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (TimingDElementTypes.DMessage_4002 == req.getElementType()) {
			return getGEFWrapper(new DMessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case DStateSwitchEditPart.VISUAL_ID:
			return getGEFWrapper(new DStateSwitchReorientCommand(req));
		case DMessageEditPart.VISUAL_ID:
			return getGEFWrapper(new DMessageReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
