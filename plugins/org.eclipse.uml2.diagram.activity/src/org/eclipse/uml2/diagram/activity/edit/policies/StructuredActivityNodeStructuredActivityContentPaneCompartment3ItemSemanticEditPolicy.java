package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventAction3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventAction4CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityFinalNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AddStructuralFeatureValueAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallBehaviorAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallOperationAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CentralBufferNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CreateObjectAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.DataStoreNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.DecisionNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.FlowFinalNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ForkNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.InputPin7CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.JoinNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OpaqueAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OutputPin5CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.Pin2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.StructuredActivityNode4CreateCommand;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StructuredActivityNodeStructuredActivityContentPaneCompartment3ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public StructuredActivityNodeStructuredActivityContentPaneCompartment3ItemSemanticEditPolicy() {
		super(UMLElementTypes.StructuredActivityNode_3076);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.StructuredActivityNode_3079 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new StructuredActivityNode4CreateCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_3011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new OpaqueAction2CreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new AcceptEventAction3CreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new AcceptEventAction4CreateCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new ActivityFinalNode2CreateCommand(req));
		}
		if (UMLElementTypes.DecisionNode_3015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new DecisionNode2CreateCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_3016 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new FlowFinalNode2CreateCommand(req));
		}
		if (UMLElementTypes.Pin_3017 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new Pin2CreateCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_3018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new CreateObjectAction2CreateCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3019 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new CallBehaviorAction2CreateCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_3020 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new CallOperationAction2CreateCommand(req));
		}
		if (UMLElementTypes.ForkNode_3021 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new ForkNode2CreateCommand(req));
		}
		if (UMLElementTypes.JoinNode_3022 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new JoinNode2CreateCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3023 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new AddStructuralFeatureValueAction2CreateCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_3024 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new DataStoreNode2CreateCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_3025 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new CentralBufferNode2CreateCommand(req));
		}
		if (UMLElementTypes.InputPin_3080 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new InputPin7CreateCommand(req));
		}
		if (UMLElementTypes.OutputPin_3081 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getGEFWrapper(new OutputPin5CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
