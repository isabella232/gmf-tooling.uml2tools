package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectNodeSelectionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectNodeSelectionReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectNodeSelectionEditPart;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */
public class InputPin2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public InputPin2ItemSemanticEditPolicy() {
		super(UMLElementTypes.InputPin_3004);
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
		if (UMLElementTypes.ControlFlow_4001 == req.getElementType()) {
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ObjectNodeSelection_4004 == req.getElementType()) {
			return getGEFWrapper(new ObjectNodeSelectionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ControlFlow_4001 == req.getElementType()) {
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ObjectNodeSelection_4004 == req.getElementType()) {
			return null;
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
		case ControlFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ControlFlowReorientCommand(req));
		case ObjectFlowEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectFlowReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ObjectNodeSelectionEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectNodeSelectionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
