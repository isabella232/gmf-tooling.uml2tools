package org.eclipse.uml2.diagram.usecase.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Component;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class SubjectCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public SubjectCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getPackage();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Component newElement = UMLFactory.eINSTANCE.createComponent();

		Package owner = (Package) getElementToEdit();
		owner.getPackagedElements().add(newElement);

		UMLElementTypes.init_Component_2006(newElement);
		return newElement;
	}

}
