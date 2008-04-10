package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class OutputPinCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public OutputPinCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getOpaqueAction();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OutputPin newElement = UMLFactory.eINSTANCE.createOutputPin();

		OpaqueAction owner = (OpaqueAction) getElementToEdit();
		owner.getOutputValues().add(newElement);

		UMLElementTypes.init_OutputPin_3001(newElement);
		return newElement;
	}
}
