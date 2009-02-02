package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
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
import org.eclipse.uml2.diagram.activity.edit.commands.ExceptionHandlerCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ExceptionHandlerReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPostconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionExpansionRegionNodeCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */

public class ExpansionRegionItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExpansionRegionItemSemanticEditPolicy() {
		super(UMLElementTypes.ExpansionRegion_3084);
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
			case ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (UMLVisualIDRegistry.getVisualID(cnode)) {
					case StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_OpaqueActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_AcceptEventActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_AcceptTimeEventActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_ActivityFinalNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_DecisionNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_FlowFinalNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_PinEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_CreateObjectActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_CallBehaviorActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_CallOperationActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_ForkNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_JoinNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_AddStructuralFeatureValueActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_DataStoreNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_CentralBufferNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_InputPinEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
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
