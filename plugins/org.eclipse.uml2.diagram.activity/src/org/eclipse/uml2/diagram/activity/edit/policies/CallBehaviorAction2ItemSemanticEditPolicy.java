package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.commands.ActionLocalPreconditionReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ExceptionHandlerReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ExceptionHandlerTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.InputPin4CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.OutputPin3CreateCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class CallBehaviorAction2ItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.OutputPin_3006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getCallAction_Result());
			}
			return getMSLWrapper(new OutputPin3CreateCommand(req));
		}
		if (UMLElementTypes.InputPin_3007 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getInvocationAction_Argument());
			}
			return getMSLWrapper(new InputPin4CreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = new CompoundCommand();
		Collection allEdges = new ArrayList();
		View view = (View) getHost().getModel();
		allEdges.addAll(view.getSourceEdges());
		allEdges.addAll(view.getTargetEdges());
		for (Iterator it = allEdges.iterator(); it.hasNext();) {
			Edge nextEdge = (Edge) it.next();
			EditPart nextEditPart = (EditPart) getHost().getViewer().getEditPartRegistry().get(nextEdge);
			EditCommandRequestWrapper editCommandRequest = new EditCommandRequestWrapper(new DestroyElementRequest(((CallBehaviorAction2EditPart) getHost()).getEditingDomain(), req
					.isConfirmationRequired()), Collections.EMPTY_MAP);
			cc.add(nextEditPart.getCommand(editCommandRequest));
		}
		cc.add(getMSLWrapper(new DestroyElementCommand(req)));
		return cc;
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ControlFlow_4001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingControlFlow_4001Command(req) : getCreateCompleteIncomingControlFlow_4001Command(req);
		}
		if (UMLElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingObjectFlow_4002Command(req) : getCreateCompleteIncomingObjectFlow_4002Command(req);
		}
		if (UMLElementTypes.ActionLocalPrecondition_4003 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingActionLocalPrecondition_4003Command(req) : null;
		}
		if (UMLElementTypes.ExceptionHandler_4005 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingExceptionHandler_4005Command(req) : getCreateCompleteIncomingExceptionHandler_4005Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingControlFlow_4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof ActivityNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ActivityNode source = (ActivityNode) sourceEObject;
		Activity container = (Activity) getRelationshipContainer(source, UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateControlFlow_4001(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingControlFlow_4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof ActivityNode || false == targetEObject instanceof ActivityNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ActivityNode source = (ActivityNode) sourceEObject;
		ActivityNode target = (ActivityNode) targetEObject;
		Activity container = (Activity) getRelationshipContainer(source, UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateControlFlow_4001(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Edge());
		}
		return getMSLWrapper(new ControlFlowTypeLinkCreateCommand(req, container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingObjectFlow_4002Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof ActivityNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ActivityNode source = (ActivityNode) sourceEObject;
		Activity container = (Activity) getRelationshipContainer(source, UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateObjectFlow_4002(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingObjectFlow_4002Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof ActivityNode || false == targetEObject instanceof ActivityNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ActivityNode source = (ActivityNode) sourceEObject;
		ActivityNode target = (ActivityNode) targetEObject;
		Activity container = (Activity) getRelationshipContainer(source, UMLPackage.eINSTANCE.getActivity(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateObjectFlow_4002(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Edge());
		}
		return getMSLWrapper(new ObjectFlowTypeLinkCreateCommand(req, container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingActionLocalPrecondition_4003Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof Action) {
			return UnexecutableCommand.INSTANCE;
		}
		Action source = (Action) sourceEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateActionLocalPrecondition_4003(source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingExceptionHandler_4005Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		if (false == sourceEObject instanceof ExecutableNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ExecutableNode source = (ExecutableNode) sourceEObject;
		ExecutableNode container = (ExecutableNode) getRelationshipContainer(source, UMLPackage.eINSTANCE.getExecutableNode(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateExceptionHandler_4005(container, source, null)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingExceptionHandler_4005Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof ExecutableNode || false == targetEObject instanceof ExecutableNode) {
			return UnexecutableCommand.INSTANCE;
		}
		ExecutableNode source = (ExecutableNode) sourceEObject;
		ExecutableNode target = (ExecutableNode) targetEObject;
		ExecutableNode container = (ExecutableNode) getRelationshipContainer(source, UMLPackage.eINSTANCE.getExecutableNode(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateExceptionHandler_4005(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getExecutableNode_Handler());
		}
		return getMSLWrapper(new ExceptionHandlerTypeLinkCreateCommand(req, container, source, target));
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
			return getMSLWrapper(new ControlFlowReorientCommand(req));
		case ObjectFlowEditPart.VISUAL_ID:
			return getMSLWrapper(new ObjectFlowReorientCommand(req));
		case ExceptionHandlerEditPart.VISUAL_ID:
			return getMSLWrapper(new ExceptionHandlerReorientCommand(req));
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
			return getMSLWrapper(new ActionLocalPreconditionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}
}
