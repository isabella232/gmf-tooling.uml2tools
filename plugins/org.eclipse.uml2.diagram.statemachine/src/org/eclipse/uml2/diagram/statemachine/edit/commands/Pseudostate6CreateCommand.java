package org.eclipse.uml2.diagram.statemachine.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

import org.eclipse.uml2.uml.Pseudostate;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Pseudostate6CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Pseudostate6CreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getRegion();
	}

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
		Pseudostate newElement = (Pseudostate) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.Pseudostate_3009.init(newElement);
		}
		return newElement;
	}

}
