package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityFinalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AddStructuralFeatureValueActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallBehaviorActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallOperationActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CentralBufferNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CreateObjectActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.DataStoreNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.DecisionNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.FlowFinalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ForkNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.InitialNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.JoinNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.MergeNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OpaqueActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OpaqueBehaviorCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.PinCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.SendSignalActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.StructuredActivityNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActivitySubverticesItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.AcceptEventAction_3030 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new AcceptEventActionCreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3031 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new AcceptEventAction2CreateCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3032 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new ActivityFinalNodeCreateCommand(req));
		}
		if (UMLElementTypes.DecisionNode_3033 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new DecisionNodeCreateCommand(req));
		}
		if (UMLElementTypes.MergeNode_3034 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new MergeNodeCreateCommand(req));
		}
		if (UMLElementTypes.InitialNode_3035 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new InitialNodeCreateCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_3036 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new DataStoreNodeCreateCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_3037 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new CentralBufferNodeCreateCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_3029 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new OpaqueActionCreateCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_3038 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new FlowFinalNodeCreateCommand(req));
		}
		if (UMLElementTypes.ForkNode_3039 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new ForkNodeCreateCommand(req));
		}
		if (UMLElementTypes.JoinNode_3040 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new JoinNodeCreateCommand(req));
		}
		if (UMLElementTypes.Pin_3041 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new PinCreateCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_3042 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new CreateObjectActionCreateCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3043 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new AddStructuralFeatureValueActionCreateCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3044 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new CallBehaviorActionCreateCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_3045 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new CallOperationActionCreateCommand(req));
		}
		if (UMLElementTypes.StructuredActivityNode_3046 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Group());
			}
			return getGEFWrapper(new StructuredActivityNodeCreateCommand(req));
		}
		if (UMLElementTypes.OpaqueBehavior_3047 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior());
			}
			return getGEFWrapper(new OpaqueBehaviorCreateCommand(req));
		}
		if (UMLElementTypes.SendSignalAction_3053 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new SendSignalActionCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
