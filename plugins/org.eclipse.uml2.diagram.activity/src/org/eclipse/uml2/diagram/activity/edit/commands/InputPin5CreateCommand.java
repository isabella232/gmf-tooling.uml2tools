package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class InputPin5CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public InputPin5CreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getCallOperationAction();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		InputPin newElement = UMLFactory.eINSTANCE.createInputPin();

		CallOperationAction owner = (CallOperationAction) getElementToEdit();
		owner.setTarget(newElement);

		UMLElementTypes.init_InputPin_3008(newElement);
		return newElement;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		CallOperationAction container = (CallOperationAction) getElementToEdit();
		if (container.getTarget() != null) {
			return false;
		}
		return true;
	}
}
