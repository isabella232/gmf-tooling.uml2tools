package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.commands.DuplicateEObjectsCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DuplicateElementsRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventAction2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AcceptEventActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityFinalNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.AddStructuralFeatureValueActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallBehaviorActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CallOperationActionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.CentralBufferNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.Constraint2CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ConstraintCreateCommand;
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
import org.eclipse.uml2.diagram.activity.edit.commands.StructuredActivityNodeCreateCommand;

import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActivityItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.AcceptEventAction_2001 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new AcceptEventActionCreateCommand(req));
		}
		if (UMLElementTypes.AcceptEventAction_2002 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new AcceptEventAction2CreateCommand(req));
		}
		if (UMLElementTypes.ActivityFinalNode_2003 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new ActivityFinalNodeCreateCommand(req));
		}
		if (UMLElementTypes.DecisionNode_2004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new DecisionNodeCreateCommand(req));
		}
		if (UMLElementTypes.MergeNode_2005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new MergeNodeCreateCommand(req));
		}
		if (UMLElementTypes.InitialNode_2006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new InitialNodeCreateCommand(req));
		}
		if (UMLElementTypes.DataStoreNode_2008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new DataStoreNodeCreateCommand(req));
		}
		if (UMLElementTypes.CentralBufferNode_2009 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CentralBufferNodeCreateCommand(req));
		}
		if (UMLElementTypes.OpaqueAction_2010 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new OpaqueActionCreateCommand(req));
		}
		if (UMLElementTypes.FlowFinalNode_2011 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new FlowFinalNodeCreateCommand(req));
		}
		if (UMLElementTypes.ForkNode_2012 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new ForkNodeCreateCommand(req));
		}
		if (UMLElementTypes.JoinNode_2013 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new JoinNodeCreateCommand(req));
		}
		if (UMLElementTypes.Pin_2014 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new PinCreateCommand(req));
		}
		if (UMLElementTypes.CreateObjectAction_2015 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CreateObjectActionCreateCommand(req));
		}
		if (UMLElementTypes.AddStructuralFeatureValueAction_2016 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new AddStructuralFeatureValueActionCreateCommand(req));
		}
		if (UMLElementTypes.CallBehaviorAction_2017 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CallBehaviorActionCreateCommand(req));
		}
		if (UMLElementTypes.CallOperationAction_2018 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getMSLWrapper(new CallOperationActionCreateCommand(req));
		}
		if (UMLElementTypes.StructuredActivityNode_2007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Group());
			}
			return getMSLWrapper(new StructuredActivityNodeCreateCommand(req));
		}
		if (UMLElementTypes.Constraint_2019 == req.getElementType()) {
			return getMSLWrapper(new ConstraintCreateCommand(req));
		}
		if (UMLElementTypes.Constraint_2020 == req.getElementType()) {
			return getMSLWrapper(new Constraint2CreateCommand(req));
		}
		if (UMLElementTypes.OpaqueBehavior_2021 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getBehavioredClassifier_OwnedBehavior());
			}
			return getMSLWrapper(new OpaqueBehaviorCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDuplicateCommand(DuplicateElementsRequest req) {
		TransactionalEditingDomain editingDomain = ((IGraphicalEditPart) getHost()).getEditingDomain();
		return getMSLWrapper(new DuplicateAnythingCommand(editingDomain, req));
	}

	/**
	 * @generated
	 */
	private static class DuplicateAnythingCommand extends DuplicateEObjectsCommand {

		/**
		 * @generated
		 */
		public DuplicateAnythingCommand(TransactionalEditingDomain editingDomain, DuplicateElementsRequest req) {
			super(editingDomain, req.getLabel(), req.getElementsToBeDuplicated(), req.getAllDuplicatedElementsMap());
		}
	}
}
