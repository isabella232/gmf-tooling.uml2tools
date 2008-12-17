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
import org.eclipse.uml2.diagram.activity.edit.commands.InputPin6CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.JoinNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OpaqueAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OutputPin4CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.Pin2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.StructuredActivityNode2CreateCommand;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */

public class ExpansionRegionExpansionRegionNodeCompartmentItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public ExpansionRegionExpansionRegionNodeCompartmentItemSemanticEditPolicy() {
		super(UMLElementTypes.ExpansionRegion_3084);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.StructuredActivityNode_3009 == req.getElementType()) {
			return getGEFWrapper(new StructuredActivityNode2CreateCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_3011 == req.getElementType()) {
			return getGEFWrapper(new OpaqueAction2CreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3012 == req.getElementType()) {
			return getGEFWrapper(new AcceptEventAction3CreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_3013 == req.getElementType()) {
			return getGEFWrapper(new AcceptEventAction4CreateCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_3014 == req.getElementType()) {
			return getGEFWrapper(new ActivityFinalNode2CreateCommand(req));
		}
		if (UMLElementTypes.DecisionNode_3015 == req.getElementType()) {
			return getGEFWrapper(new DecisionNode2CreateCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_3016 == req.getElementType()) {
			return getGEFWrapper(new FlowFinalNode2CreateCommand(req));
		}
		if (UMLElementTypes.Pin_3017 == req.getElementType()) {
			return getGEFWrapper(new Pin2CreateCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_3018 == req.getElementType()) {
			return getGEFWrapper(new CreateObjectAction2CreateCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_3019 == req.getElementType()) {
			return getGEFWrapper(new CallBehaviorAction2CreateCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_3020 == req.getElementType()) {
			return getGEFWrapper(new CallOperationAction2CreateCommand(req));
		}
		if (UMLElementTypes.ForkNode_3021 == req.getElementType()) {
			return getGEFWrapper(new ForkNode2CreateCommand(req));
		}
		if (UMLElementTypes.JoinNode_3022 == req.getElementType()) {
			return getGEFWrapper(new JoinNode2CreateCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_3023 == req.getElementType()) {
			return getGEFWrapper(new AddStructuralFeatureValueAction2CreateCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_3024 == req.getElementType()) {
			return getGEFWrapper(new DataStoreNode2CreateCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_3025 == req.getElementType()) {
			return getGEFWrapper(new CentralBufferNode2CreateCommand(req));
		}
		if (UMLElementTypes.InputPin_3054 == req.getElementType()) {
			return getGEFWrapper(new InputPin6CreateCommand(req));
		}
		if (UMLElementTypes.OutputPin_3055 == req.getElementType()) {
			return getGEFWrapper(new OutputPin4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
