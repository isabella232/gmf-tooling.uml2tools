package org.eclipse.uml2.diagram.deploy.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.deploy.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Node;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Node2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Node2CreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getNode();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Node newElement = UMLFactory.eINSTANCE.createNode();

		Node owner = (Node) getElementToEdit();
		owner.getNestedNodes().add(newElement);

		UMLElementTypes.init_Node_3007(newElement);
		return newElement;
	}
}
