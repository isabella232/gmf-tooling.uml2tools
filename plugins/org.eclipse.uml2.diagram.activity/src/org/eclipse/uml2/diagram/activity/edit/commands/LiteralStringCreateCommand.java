package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class LiteralStringCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public LiteralStringCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getConstraint();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		LiteralString newElement = UMLFactory.eINSTANCE.createLiteralString();

		Constraint owner = (Constraint) getElementToEdit();
		owner.setSpecification(newElement);
		UMLElementTypes.init_LiteralString_3049(newElement);
		return newElement;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		Constraint container = (Constraint) getElementToEdit();
		if (container.getSpecification() != null) {
			return false;
		}
		return true;
	}
}
