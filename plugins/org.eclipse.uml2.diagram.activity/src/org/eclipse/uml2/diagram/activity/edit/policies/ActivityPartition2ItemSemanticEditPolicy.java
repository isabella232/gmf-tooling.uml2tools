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
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventAction5CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventAction6CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityFinalNode3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityPartition2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AddStructuralFeatureValueAction3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallBehaviorAction3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallOperationAction3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CentralBufferNode3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ConditionalNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CreateObjectAction3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.DataStoreNode3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.DecisionNode3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ExpansionRegion2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.FlowFinalNode3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ForkNode3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.InitialNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.JoinNode3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.LoopNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.MergeNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OpaqueAction3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.Pin3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.SendSignalAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.StructuredActivityNode3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction6EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegion2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode3EditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActivityPartition2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ActivityPartition2ItemSemanticEditPolicy() {
		super(UMLElementTypes.ActivityPartition_3057);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.ActivityPartition_3057 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivityPartition_Subpartition());
			}
			return getGEFWrapper(new ActivityPartition2CreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3059 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new AcceptEventAction5CreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3060 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new AcceptEventAction6CreateCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3061 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new ActivityFinalNode3CreateCommand(req));
		}
		if (UMLElementTypes.DecisionNode_3062 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new DecisionNode3CreateCommand(req));
		}
		if (UMLElementTypes.MergeNode_3063 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new MergeNode2CreateCommand(req));
		}
		if (UMLElementTypes.InitialNode_3064 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new InitialNode2CreateCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_3065 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new DataStoreNode3CreateCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_3066 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new CentralBufferNode3CreateCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_3067 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new OpaqueAction3CreateCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_3068 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new FlowFinalNode3CreateCommand(req));
		}
		if (UMLElementTypes.ForkNode_3069 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new ForkNode3CreateCommand(req));
		}
		if (UMLElementTypes.JoinNode_3070 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new JoinNode3CreateCommand(req));
		}
		if (UMLElementTypes.Pin_3071 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new Pin3CreateCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_3072 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new CreateObjectAction3CreateCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3073 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new AddStructuralFeatureValueAction3CreateCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3074 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new CallBehaviorAction3CreateCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_3075 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new CallOperationAction3CreateCommand(req));
		}
		if (UMLElementTypes.StructuredActivityNode_3076 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new StructuredActivityNode3CreateCommand(req));
		}
		if (UMLElementTypes.SendSignalAction_3077 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new SendSignalAction2CreateCommand(req));
		}
		if (UMLElementTypes.LoopNode_3078 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new LoopNode2CreateCommand(req));
		}
		if (UMLElementTypes.ConditionalNode_3083 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new ConditionalNode2CreateCommand(req));
		}
		if (UMLElementTypes.ExpansionRegion_3085 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new ExpansionRegion2CreateCommand(req));
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
			case ActivityPartition2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case AcceptEventAction5EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case AcceptEventAction6EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivityFinalNode3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case DecisionNode3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case MergeNode2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case InitialNode2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case DataStoreNode3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CentralBufferNode3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case OpaqueAction3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case FlowFinalNode3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ForkNode3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case JoinNode3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case Pin3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CreateObjectAction3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CallBehaviorAction3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case CallOperationAction3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case StructuredActivityNode3EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case SendSignalAction2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case LoopNode2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ConditionalNode2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ExpansionRegion2EditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			}
		}
	}

}
