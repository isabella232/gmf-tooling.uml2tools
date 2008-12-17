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
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityFinalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityParameterNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartitionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AddStructuralFeatureValueActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallBehaviorActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallOperationActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CentralBufferNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ConditionalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CreateObjectActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.DataStoreNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.DecisionNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ExpansionRegionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.FlowFinalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ForkNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.InitialNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.JoinNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.LoopNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.MergeNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectNodeSelectionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectNodeSelectionReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OpaqueActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OpaqueBehaviorCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ParameterSetCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.PinCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.SendSignalActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.StructuredActivityNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectNodeSelectionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ParameterSetEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */

public class ActivityItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityItemSemanticEditPolicy() {
		super(UMLElementTypes.Activity_2026);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.AcceptEventAction_3030 == req.getElementType()) {
			return getGEFWrapper(new AcceptEventActionCreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3031 == req.getElementType()) {
			return getGEFWrapper(new AcceptEventAction2CreateCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3032 == req.getElementType()) {
			return getGEFWrapper(new ActivityFinalNodeCreateCommand(req));
		}
		if (UMLElementTypes.DecisionNode_3033 == req.getElementType()) {
			return getGEFWrapper(new DecisionNodeCreateCommand(req));
		}
		if (UMLElementTypes.MergeNode_3034 == req.getElementType()) {
			return getGEFWrapper(new MergeNodeCreateCommand(req));
		}
		if (UMLElementTypes.InitialNode_3035 == req.getElementType()) {
			return getGEFWrapper(new InitialNodeCreateCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_3036 == req.getElementType()) {
			return getGEFWrapper(new DataStoreNodeCreateCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_3037 == req.getElementType()) {
			return getGEFWrapper(new CentralBufferNodeCreateCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_3029 == req.getElementType()) {
			return getGEFWrapper(new OpaqueActionCreateCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_3038 == req.getElementType()) {
			return getGEFWrapper(new FlowFinalNodeCreateCommand(req));
		}
		if (UMLElementTypes.ForkNode_3039 == req.getElementType()) {
			return getGEFWrapper(new ForkNodeCreateCommand(req));
		}
		if (UMLElementTypes.JoinNode_3040 == req.getElementType()) {
			return getGEFWrapper(new JoinNodeCreateCommand(req));
		}
		if (UMLElementTypes.Pin_3041 == req.getElementType()) {
			return getGEFWrapper(new PinCreateCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_3042 == req.getElementType()) {
			return getGEFWrapper(new CreateObjectActionCreateCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3043 == req.getElementType()) {
			return getGEFWrapper(new AddStructuralFeatureValueActionCreateCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3044 == req.getElementType()) {
			return getGEFWrapper(new CallBehaviorActionCreateCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_3045 == req.getElementType()) {
			return getGEFWrapper(new CallOperationActionCreateCommand(req));
		}
		if (UMLElementTypes.StructuredActivityNode_3046 == req.getElementType()) {
			return getGEFWrapper(new StructuredActivityNodeCreateCommand(req));
		}
		if (UMLElementTypes.OpaqueBehavior_3047 == req.getElementType()) {
			return getGEFWrapper(new OpaqueBehaviorCreateCommand(req));
		}
		if (UMLElementTypes.ActivityParameterNode_3052 == req.getElementType()) {
			return getGEFWrapper(new ActivityParameterNodeCreateCommand(req));
		}
		if (UMLElementTypes.SendSignalAction_3053 == req.getElementType()) {
			return getGEFWrapper(new SendSignalActionCreateCommand(req));
		}
		if (UMLElementTypes.ActivityPartition_3056 == req.getElementType()) {
			return getGEFWrapper(new ActivityPartitionCreateCommand(req));
		}
		if (UMLElementTypes.LoopNode_3058 == req.getElementType()) {
			return getGEFWrapper(new LoopNodeCreateCommand(req));
		}
		if (UMLElementTypes.ConditionalNode_3082 == req.getElementType()) {
			return getGEFWrapper(new ConditionalNodeCreateCommand(req));
		}
		if (UMLElementTypes.ExpansionRegion_3084 == req.getElementType()) {
			return getGEFWrapper(new ExpansionRegionCreateCommand(req));
		}
		if (UMLElementTypes.ParameterSet_3086 == req.getElementType()) {
			return getGEFWrapper(new ParameterSetCreateCommand(req));
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
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
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
			case AcceptEventActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case AcceptEventAction2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityFinalNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case DecisionNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case MergeNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case InitialNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case DataStoreNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CentralBufferNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OpaqueActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case FlowFinalNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ForkNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case JoinNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case PinEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CreateObjectActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CallBehaviorActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CallOperationActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case StructuredActivityNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OpaqueBehaviorEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityParameterNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case SendSignalActionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityPartitionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case LoopNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ConditionalNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ExpansionRegionEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ParameterSetEditPart.VISUAL_ID:
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
		if (UMLElementTypes.ObjectNodeSelection_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ObjectNodeSelection_4004 == req.getElementType()) {
			return getGEFWrapper(new ObjectNodeSelectionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
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
