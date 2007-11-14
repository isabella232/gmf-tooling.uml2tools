package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class OutputPin2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public OutputPin2CreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getCreateObjectAction();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		OutputPin newElement = (OutputPin) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.OutputPin_3002.init(newElement);
		}
		return newElement;
	}

	/**
	 * @generated
	 */
	public boolean canExecute() {
		CreateObjectAction container = (CreateObjectAction) getElementToEdit();
		if (container.getResult() != null) {
			return false;
		}
		return true;
	}
}
