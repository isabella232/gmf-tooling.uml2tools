package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class AcceptEventAction4CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public AcceptEventAction4CreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getStructuredActivityNode();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		AcceptEventAction newElement = (AcceptEventAction) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.AcceptEventAction_3013.init(newElement);
		}
		return newElement;
	}
}
