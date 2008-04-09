package org.eclipse.uml2.diagram.usecase.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.uml2.uml.ExtensionPoint;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;

/**
 * @generated
 */
public class ExtensionPoint2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ExtensionPoint2CreateCommand(CreateElementRequest req) {
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
		ExtensionPoint newElement = UMLFactory.eINSTANCE.createExtensionPoint();

		UseCase owner = (UseCase) getElementToEdit();
		owner.getExtensionPoints().add(newElement);

		UMLElementTypes.init_ExtensionPoint_3003(newElement);
		return newElement;
	}

}
