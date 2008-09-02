package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.CallAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class OutputPin3CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public OutputPin3CreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getCallAction();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OutputPin newElement = UMLFactory.eINSTANCE.createOutputPin();

		CallAction owner = (CallAction) getElementToEdit();
		owner.getResults().add(newElement);
		UMLElementTypes.init_OutputPin_3006(newElement);
		return newElement;
	}
}
