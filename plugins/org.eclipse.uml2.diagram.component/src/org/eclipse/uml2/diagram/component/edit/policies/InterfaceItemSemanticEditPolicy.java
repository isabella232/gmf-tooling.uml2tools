package org.eclipse.uml2.diagram.component.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import org.eclipse.uml2.diagram.component.edit.commands.InterfaceRealizationTypeLinkCreateCommand;

import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class InterfaceItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

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
		if (UMLElementTypes.InterfaceRealization_4001 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingInterfaceRealization4001Command(req);
		}
		if (UMLElementTypes.PortProvided_4006 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingPort_Provided4006Command(req);
		}
		if (UMLElementTypes.PortRequired_4004 == req.getElementType()) {
			return req.getTarget() == null ? null : getCreateCompleteIncomingPort_Required4004Command(req);
		}
		return super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingInterfaceRealization4001Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof BehavioredClassifier || false == targetEObject instanceof Interface) {
			return UnexecutableCommand.INSTANCE;
		}
		BehavioredClassifier source = (BehavioredClassifier) sourceEObject;
		Interface target = (Interface) targetEObject;

		BehavioredClassifier container = (BehavioredClassifier) getRelationshipContainer(source, UMLPackage.eINSTANCE.getBehavioredClassifier(), req.getElementType());
		if (container == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreateInterfaceRealization_4001(container, source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization());
		}
		return getMSLWrapper(new InterfaceRealizationTypeLinkCreateCommand(req, container, source, target));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingPort_Provided4006Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Port || false == targetEObject instanceof Interface) {
			return UnexecutableCommand.INSTANCE;
		}
		Port source = (Port) sourceEObject;
		Interface target = (Interface) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreatePortProvided_4006(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getPort_Provided(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingPort_Required4004Command(CreateRelationshipRequest req) {
		EObject sourceEObject = req.getSource();
		EObject targetEObject = req.getTarget();
		if (false == sourceEObject instanceof Port || false == targetEObject instanceof Interface) {
			return UnexecutableCommand.INSTANCE;
		}
		Port source = (Port) sourceEObject;
		Interface target = (Interface) targetEObject;
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.canCreatePortRequired_4004(source, target)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getPort_Required(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}
}
