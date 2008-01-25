package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ExpansionRegionCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ExpansionRegionCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getActivity();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		ExpansionRegion newElement = (ExpansionRegion) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.ExpansionRegion_3084.init(newElement);
		}
		return newElement;
	}

}
