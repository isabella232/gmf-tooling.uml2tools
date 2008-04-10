package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class PinCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public PinCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getActivity();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Pin newElement = UMLFactory.eINSTANCE.createPin();

		Activity owner = (Activity) getElementToEdit();
		owner.getNodes().add(newElement);

		UMLElementTypes.init_Pin_3041(newElement);
		return newElement;
	}
}
