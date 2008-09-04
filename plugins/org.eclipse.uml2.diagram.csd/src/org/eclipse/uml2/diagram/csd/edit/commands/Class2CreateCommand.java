package org.eclipse.uml2.diagram.csd.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Class2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Class2CreateCommand(CreateElementRequest req) {
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
		Class newElement = UMLFactory.eINSTANCE.createClass();

		Class owner = (Class) getElementToEdit();
		owner.getNestedClassifiers().add(newElement);
		UMLElementTypes.init_Class_3010(newElement);
		return newElement;
	}
}
