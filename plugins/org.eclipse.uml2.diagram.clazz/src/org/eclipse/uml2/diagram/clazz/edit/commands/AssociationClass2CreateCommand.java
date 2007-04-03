package org.eclipse.uml2.diagram.clazz.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;

import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

import org.eclipse.uml2.uml.AssociationClass;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class AssociationClass2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public AssociationClass2CreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getPackage();
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
	protected EObject doDefaultElementCreation() {
		AssociationClass newElement = (AssociationClass) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.AssociationClass_2007.init(newElement);
		}
		return newElement;
	}

}
