package org.eclipse.uml2.diagram.component.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ClassDiagramNotationOperationCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ClassDiagramNotationOperationCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getClass_();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Operation newElement = UMLFactory.eINSTANCE.createOperation();

		Class owner = (Class) getElementToEdit();
		owner.getOwnedOperations().add(newElement);
		UMLElementTypes.init_Operation_3012(newElement);
		return newElement;
	}

}
