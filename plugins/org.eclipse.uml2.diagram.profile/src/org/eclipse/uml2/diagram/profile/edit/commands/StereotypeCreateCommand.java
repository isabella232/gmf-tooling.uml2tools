package org.eclipse.uml2.diagram.profile.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Stereotype;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StereotypeCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public StereotypeCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getPackage();
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
		Stereotype newElement = (Stereotype) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.Stereotype_3003.init(newElement);
		}
		return newElement;
	}

}
