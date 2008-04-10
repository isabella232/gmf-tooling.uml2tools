package org.eclipse.uml2.diagram.csd.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Port;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Port3CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Port3CreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getStructuredClassifier();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Port newElement = UMLFactory.eINSTANCE.createPort();

		StructuredClassifier owner = (StructuredClassifier) getElementToEdit();
		owner.getOwnedAttributes().add(newElement);

		UMLElementTypes.init_Port_3017(newElement);
		return newElement;
	}

}
