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
import org.eclipse.uml2.diagram.activity.edit.commands.JoinNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OpaqueAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.Pin2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.StructuredActivityNode2CreateCommand;

import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StructuredActivityNodeStructuredActivityContentPaneCompartmentItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.StructuredActivityNode_3009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new StructuredActivityNode2CreateCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_3011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new OpaqueAction2CreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new AcceptEventAction3CreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new AcceptEventAction4CreateCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new ActivityFinalNode2CreateCommand(req));
		}
		if (UMLElementTypes.DecisionNode_3015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new DecisionNode2CreateCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_3016 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new FlowFinalNode2CreateCommand(req));
		}
		if (UMLElementTypes.Pin_3017 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new Pin2CreateCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_3018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CreateObjectAction2CreateCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3019 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CallBehaviorAction2CreateCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_3020 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CallOperationAction2CreateCommand(req));
		}
		if (UMLElementTypes.ForkNode_3021 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new ForkNode2CreateCommand(req));
		}
		if (UMLElementTypes.JoinNode_3022 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new JoinNode2CreateCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3023 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new AddStructuralFeatureValueAction2CreateCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_3024 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new DataStoreNode2CreateCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_3025 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getStructuredActivityNode_Node());
			}
			return getMSLWrapper(new CentralBufferNode2CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
}
