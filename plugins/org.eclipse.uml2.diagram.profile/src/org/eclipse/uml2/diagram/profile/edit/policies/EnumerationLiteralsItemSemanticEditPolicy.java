package org.eclipse.uml2.diagram.profile.edit.policies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

import org.eclipse.uml2.uml.EnumerationLiteral;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class EnumerationLiteralsItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.EnumerationLiteral_3005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getEnumeration_OwnedLiteral());
			}
			return getMSLWrapper(new CreateEnumerationLiteral_3005Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateEnumerationLiteral_3005Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateEnumerationLiteral_3005Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getEnumeration();
		};

		/**
		 * @generated
		 */
		protected EObject getElementToEdit() {
			EObject container = ((CreateElementRequest) getRequest()).getContainer();
			if (container instanceof View) {
				container = ((View) container).getElement();
			}
			return container;
		}

		/**
		 * @generated
		 */
		protected EObject doDefaultElementCreation() {
			EnumerationLiteral newElement = (EnumerationLiteral) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.EnumerationLiteral_3005.init(newElement);
			}
			return newElement;
		}
	}

}
