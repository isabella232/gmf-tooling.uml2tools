package org.eclipse.uml2.diagram.sequence.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.sequence.edit.commands.ActionExecutionSpecificationCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.BehaviorExecutionSpecificationCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.CombinedFragmentMountingRegionCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.InteractionUseMountingRegionCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.MessageCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.MessageReorientCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.StateInvariantCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.parts.ActionExecutionSpecificationEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.BehaviorExecutionSpecificationEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.CombinedFragmentMountingRegionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.InteractionUseMountingRegionEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.StateInvariantEditPart;
import org.eclipse.uml2.diagram.sequence.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class LifelineItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public LifelineItemSemanticEditPolicy() {
		super(UMLElementTypes.Lifeline_3001);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.ActionExecutionSpecification_3002 == req.getElementType()) {
			return getGEFWrapper(new ActionExecutionSpecificationCreateCommand(req));
		}
		if (UMLElementTypes.StateInvariant_3003 == req.getElementType()) {
			return getGEFWrapper(new StateInvariantCreateCommand(req));
		}
		if (UMLElementTypes.BehaviorExecutionSpecification_3004 == req.getElementType()) {
			return getGEFWrapper(new BehaviorExecutionSpecificationCreateCommand(req));
		}
		if (UMLElementTypes.InteractionUse_3006 == req.getElementType()) {
			return getGEFWrapper(new InteractionUseMountingRegionCreateCommand(req));
		}
		if (UMLElementTypes.CombinedFragment_3010 == req.getElementType()) {
			return getGEFWrapper(new CombinedFragmentMountingRegionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (UMLVisualIDRegistry.getVisualID(node)) {
			case ActionExecutionSpecificationEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case StateInvariantEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case InteractionUseMountingRegionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CombinedFragmentMountingRegionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			}
		}
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
		if (UMLElementTypes.Message_4001 == req.getElementType()) {
			return getGEFWrapper(new MessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.Message_4001 == req.getElementType()) {
			return getGEFWrapper(new MessageCreateCommand(req, req.getSource(), req.getTarget()));
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
		case MessageEditPart.VISUAL_ID:
			return getGEFWrapper(new MessageReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
