package org.eclipse.uml2.diagram.component.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ClassCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ClassCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getComponent();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Class newElement = UMLFactory.eINSTANCE.createClass();

		Component owner = (Component) getElementToEdit();
		owner.getPackagedElements().add(newElement);

		UMLElementTypes.init_Class_3004(newElement);
		return newElement;
	}
}
