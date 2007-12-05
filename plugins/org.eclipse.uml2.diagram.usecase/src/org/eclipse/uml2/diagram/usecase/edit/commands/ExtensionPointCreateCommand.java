package org.eclipse.uml2.diagram.usecase.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ExtensionPointCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ExtensionPointCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getUseCase();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		ExtensionPoint newElement = (ExtensionPoint) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.ExtensionPoint_3002.init(newElement);
		}
		return newElement;
	}

}
