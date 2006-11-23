package org.eclipse.uml2.diagram.profile.edit.policies;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gef.commands.Command;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StereotypeConstraintsItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.Constraint_3008 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getNamespace_OwnedRule());
			}
			return getMSLWrapper(new CreateConstraint_3008Command(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	private static class CreateConstraint_3008Command extends CreateElementCommand {

		/**
		 * @generated
		 */
		public CreateConstraint_3008Command(CreateElementRequest req) {
			super(req);
		}

		/**
		 * @generated
		 */
		protected EClass getEClassToEdit() {
			return UMLPackage.eINSTANCE.getStereotype();
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
			Constraint newElement = (Constraint) super.doDefaultElementCreation();
			if (newElement != null) {
				UMLElementTypes.Initializers.Constraint_3008.init(newElement);
			}
			return newElement;
		}
	}

}
