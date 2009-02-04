package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_AcceptEventActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_AcceptTimeEventActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_ActivityFinalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_ActivityPartitionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_AddStructuralFeatureValueActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_CallBehaviorActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_CallOperationActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_CentralBufferNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_ConditionalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_CreateObjectActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_DataStoreNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_DecisionNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_ExpansionRegionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_FlowFinalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_ForkNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_InitialNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_JoinNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_LoopNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_MergeNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_OpaqueActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_PinCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_SendSignalActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition_StructuredActivityNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ValueSpecificationActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ConditionalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ExpansionRegionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_LoopNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ValueSpecificationActionEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */

public class ActivityPartitionItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityPartitionItemSemanticEditPolicy() {
		super(UMLElementTypes.ActivityPartition_3056);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.ActivityPartition_3057 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_ActivityPartitionCreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3059 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_AcceptEventActionCreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3060 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_AcceptTimeEventActionCreateCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3061 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_ActivityFinalNodeCreateCommand(req));
		}
		if (UMLElementTypes.DecisionNode_3062 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_DecisionNodeCreateCommand(req));
		}
		if (UMLElementTypes.MergeNode_3063 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_MergeNodeCreateCommand(req));
		}
		if (UMLElementTypes.InitialNode_3064 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_InitialNodeCreateCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_3065 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_DataStoreNodeCreateCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_3066 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_CentralBufferNodeCreateCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_3067 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_OpaqueActionCreateCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_3068 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_FlowFinalNodeCreateCommand(req));
		}
		if (UMLElementTypes.ForkNode_3069 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_ForkNodeCreateCommand(req));
		}
		if (UMLElementTypes.JoinNode_3070 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_JoinNodeCreateCommand(req));
		}
		if (UMLElementTypes.Pin_3071 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_PinCreateCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_3072 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_CreateObjectActionCreateCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3073 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_AddStructuralFeatureValueActionCreateCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3074 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_CallBehaviorActionCreateCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_3075 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_CallOperationActionCreateCommand(req));
		}
		if (UMLElementTypes.StructuredActivityNode_3076 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_StructuredActivityNodeCreateCommand(req));
		}
		if (UMLElementTypes.SendSignalAction_3077 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_SendSignalActionCreateCommand(req));
		}
		if (UMLElementTypes.LoopNode_3078 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_LoopNodeCreateCommand(req));
		}
		if (UMLElementTypes.ConditionalNode_3083 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_ConditionalNodeCreateCommand(req));
		}
		if (UMLElementTypes.ExpansionRegion_3085 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartition_ExpansionRegionCreateCommand(req));
		}
		if (UMLElementTypes.ValueSpecificationAction_3088 == req.getElementType()) {
			return getGEFWrapper(new ValueSpecificationActionCreateCommand(req));
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
			case ActivityPartition_ActivityPartitionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_AcceptEventActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_AcceptTimeEventActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_ActivityFinalNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_DecisionNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_MergeNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_InitialNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_DataStoreNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_CentralBufferNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_OpaqueActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_FlowFinalNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_ForkNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_JoinNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_PinEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_CreateObjectActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_CallBehaviorActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_CallOperationActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_StructuredActivityNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_SendSignalActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_LoopNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_ConditionalNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartition_ExpansionRegionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ValueSpecificationActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			}
		}
	}

}
