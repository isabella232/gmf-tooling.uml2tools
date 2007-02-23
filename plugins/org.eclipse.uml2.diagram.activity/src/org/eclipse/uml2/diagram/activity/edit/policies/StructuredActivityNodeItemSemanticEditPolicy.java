package org.eclipse.uml2.diagram.activity.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.uml2.diagram.activity.edit.commands.ControlFlowTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ExceptionHandlerTypeLinkCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectFlowTypeLinkCreateCommand;

import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StructuredActivityNodeItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getMSLWrapper(new DestroyElementCommand(req) {

			protected EObject getElementToDestroy() {
				View view = (View) getHost().getModel();
				EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
				if (annotation != null) {
					return view;
				}
				return super.getElementToDestroy();
			}

		});
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ControlFlow_4001 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingControlFlow4001Command(req) : getCreateCompleteIncomingControlFlow4001Command(req);
		}
		if (UMLElementTypes.ObjectFlow_4002 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingObjectFlow4002Command(req) : getCreateCompleteIncomingObjectFlow4002Command(req);
		}
		if (UMLElementTypes.ActionLocalPrecondition_4003 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingAction_LocalPrecondition4003Command(req) : null;
		}
		if (UMLElementTypes.ExceptionHandler_4005 == req.getElementType()) {
			return req.getTarget() == null ? getCreateStartOutgoingExceptionHandler4005Command(req) : getCreateCompleteIncomingExceptionHandler4005Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingControlFlow4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof ActivityNode || (targetEObject != null && false == targetEObject instanceof ActivityNode)) {
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
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingControlFlow4001Command(CreateRelationshipRequest req) {
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
	protected Command getCreateStartOutgoingObjectFlow4002Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof ActivityNode || (targetEObject != null && false == targetEObject instanceof ActivityNode)) {
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
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingObjectFlow4002Command(CreateRelationshipRequest req) {
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
	protected Command getCreateStartOutgoingAction_LocalPrecondition4003Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Action || (targetEObject != null && false == targetEObject instanceof Constraint)) {
			return UnexecutableCommand.INSTANCE;
		}
		Action source = (Action) sourceEObject;
		Constraint target = (Constraint) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateActionLocalPrecondition_4003(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateStartOutgoingExceptionHandler4005Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof ExecutableNode || (targetEObject != null && false == targetEObject instanceof ExecutableNode)) {
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
		return new Command() {
		};
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingExceptionHandler4005Command(CreateRelationshipRequest req) {
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
}
