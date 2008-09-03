package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.ParameterSet;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class ParameterSetCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ParameterSetCreateCommand(CreateElementRequest req) {
		super(req);
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
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getBehavior();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		ParameterSet newElement = UMLFactory.eINSTANCE.createParameterSet();

		Behavior owner = (Behavior) getElementToEdit();
		owner.getOwnedParameterSets().add(newElement);
		UMLElementTypes.init_ParameterSet_3086(newElement);
		return newElement;
	}
}
