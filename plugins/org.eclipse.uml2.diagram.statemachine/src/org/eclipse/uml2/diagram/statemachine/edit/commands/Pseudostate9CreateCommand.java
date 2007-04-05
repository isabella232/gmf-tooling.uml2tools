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
public class Pseudostate9CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Pseudostate9CreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getStateMachine();
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
			UMLElementTypes.Initializers.Pseudostate_3014.init(newElement);
		}
		return newElement;
	}

}
