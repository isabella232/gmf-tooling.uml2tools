package org.eclipse.uml2.diagram.statemachine.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;
import org.eclipse.uml2.uml.ConnectionPointReference;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ConnectionPointReferenceCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ConnectionPointReferenceCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getState();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		ConnectionPointReference newElement = (ConnectionPointReference) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.ConnectionPointReference_3017.init(newElement);
		}
		return newElement;
	}
}
