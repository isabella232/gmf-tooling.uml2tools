package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class ParameterCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ParameterCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEditGen() {
		EObject container = ((CreateElementRequest) getRequest()).getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated NOT
	 */
	protected EObject getElementToEdit() {
		return getElementToEditGen().eContainer();
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getBehavior();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreationGen() {
		Parameter newElement = UMLFactory.eINSTANCE.createParameter();

		Behavior owner = (Behavior) getElementToEdit();
		owner.getOwnedParameters().add(newElement);
		ParameterSet childHolder = (ParameterSet) getElementToEdit();
		childHolder.getParameters().add(newElement);
		return newElement;
	}

	/**
	 * @generated NOT
	 */
	protected EObject doDefaultElementCreation() {
		Parameter newElement = UMLFactory.eINSTANCE.createParameter();

		Behavior owner = (Behavior) getElementToEdit();
		owner.getOwnedParameters().add(newElement);
		ParameterSet childHolder = (ParameterSet) getElementToEditGen();
		childHolder.getParameters().add(newElement);
		return newElement;
	}
}
