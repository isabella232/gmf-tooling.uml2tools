package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPostconditionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPostconditionReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPreconditionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPreconditionReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CreateObjectAction_OutputPinCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ExceptionHandlerCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ExceptionHandlerReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPostconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */

public class CreateObjectAction3ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public CreateObjectAction3ItemSemanticEditPolicy() {
		super(UMLElementTypes.CreateObjectAction_3072);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.OutputPin_3002 == req.getElementType()) {
			return getGEFWrapper(new CreateObjectAction_OutputPinCreateCommand(req));
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
			case CreateObjectAction_OutputPinEditPart.VISUAL_ID:
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
		if (UMLElementTypes.ControlFlow_4001 == req.getElementType()) {
			return getGEFWrapper(new ControlFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return getGEFWrapper(new ObjectFlowCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ActionLocalPrecondition_4003 == req.getElementType()) {
			return getGEFWrapper(new ActionLocalPreconditionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ActionLocalPostcondition_4006 == req.getElementType()) {
			return getGEFWrapper(new ActionLocalPostconditionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		if (UMLElementTypes.ExceptionHandler_4005 == req.getElementType()) {
			return getGEFWrapper(new ExceptionHandlerCreateCommand(req, req.getSource(), req.getTarget()));
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
		if (UMLElementTypes.ActionLocalPrecondition_4003 == req.getElementType()) {
			return null;
		}
		if (UMLElementTypes.ActionLocalPostcondition_4006 == req.getElementType()) {
			return null;
		}
		if (UMLElementTypes.ExceptionHandler_4005 == req.getElementType()) {
			return getGEFWrapper(new ExceptionHandlerCreateCommand(req, req.getSource(), req.getTarget()));
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
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getGEFWrapper(new ExceptionHandlerReorientCommand(req));
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
		case ActionLocalPreconditionEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionLocalPreconditionReorientCommand(req));
		case ActionLocalPostconditionEditPart.VISUAL_ID:
			return getGEFWrapper(new ActionLocalPostconditionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
