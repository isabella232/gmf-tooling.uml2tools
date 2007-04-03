package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.WriteStructuralFeatureAction;

/**
 * @generated
 */
public class InputPin2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public InputPin2CreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getWriteStructuralFeatureAction();
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
	public boolean canExecute() {
		WriteStructuralFeatureAction container = (WriteStructuralFeatureAction) getElementToEdit();
		if (container.getValue() != null) {
			return false;
		}
		return true;
	}

}
