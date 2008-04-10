package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class InputPinCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public InputPinCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		InputPin newElement = UMLFactory.eINSTANCE.createInputPin();

		AddStructuralFeatureValueAction owner = (AddStructuralFeatureValueAction) getElementToEdit();
		owner.setInsertAt(newElement);

		UMLElementTypes.init_InputPin_3003(newElement);
		return newElement;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		AddStructuralFeatureValueAction container = (AddStructuralFeatureValueAction) getElementToEdit();
		if (container.getInsertAt() != null) {
			return false;
		}
		return true;
	}
}
