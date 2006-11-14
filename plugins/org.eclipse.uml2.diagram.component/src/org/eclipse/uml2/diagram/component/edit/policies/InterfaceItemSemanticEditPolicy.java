package org.eclipse.uml2.diagram.component.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.gef.commands.UnexecutableCommand;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateRelationshipCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.SetValueCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.SetRequest;

import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
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
		if (!(req.getSource() instanceof BehavioredClassifier)) {
			return UnexecutableCommand.INSTANCE;
		}
		final BehavioredClassifier element = (BehavioredClassifier) getRelationshipContainer(req.getSource(), UMLPackage.eINSTANCE.getBehavioredClassifier(), req.getElementType());
		if (element == null) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.InterfaceRealization_4001.canCreateLink(req, false)) {
			return UnexecutableCommand.INSTANCE;
		}
		if (req.getContainmentFeature() == null) {
			req.setContainmentFeature(UMLPackage.eINSTANCE.getBehavioredClassifier_InterfaceRealization());
		}
		return getMSLWrapper(new CreateIncomingInterfaceRealization4001Command(req) {

			protected EObject getElementToEdit() {
				return element;
			}
		});
	}

	/**
	 * @generated
	 */
	private static class CreateIncomingInterfaceRealization4001Command extends CreateRelationshipCommand {

		/**
		 * @generated
		 */
		public CreateIncomingInterfaceRealization4001Command(CreateRelationshipRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getBehavioredClassifier();
		};

		/**
		 * @generated
		 */
		protected void setElementToEdit(EObject element) {
			throw new UnsupportedOperationException();
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			InterfaceRealization newElement = (InterfaceRealization) super.doDefaultElementCreation();
			if (newElement != null) {
				newElement.setContract((Interface) getTarget());
				newElement.setImplementingClassifier((BehavioredClassifier) getSource());
			}
			return newElement;
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingPort_Provided4006Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Port)) {
			return UnexecutableCommand.INSTANCE;
		}
		Port element = (Port) req.getSource();
		if (element.getProvideds().contains(req.getTarget())) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.PortProvided_4006.canCreateLink(req, false)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getPort_Provided(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}

	/**
	 * @generated
	 */
	protected Command getCreateCompleteIncomingPort_Required4004Command(CreateRelationshipRequest req) {
		if (!(req.getSource() instanceof Port)) {
			return UnexecutableCommand.INSTANCE;
		}
		Port element = (Port) req.getSource();
		if (element.getRequireds().contains(req.getTarget())) {
			return UnexecutableCommand.INSTANCE;
		}
		if (!UMLBaseItemSemanticEditPolicy.LinkConstraints.PortRequired_4004.canCreateLink(req, false)) {
			return UnexecutableCommand.INSTANCE;
		}
		SetRequest setReq = new SetRequest(req.getSource(), UMLPackage.eINSTANCE.getPort_Required(), req.getTarget());
		return getMSLWrapper(new SetValueCommand(setReq));
	}
}
