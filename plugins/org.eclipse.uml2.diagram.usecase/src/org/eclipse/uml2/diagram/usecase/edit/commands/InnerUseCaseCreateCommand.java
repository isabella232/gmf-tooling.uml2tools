package org.eclipse.uml2.diagram.usecase.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.UMLPackage;
import org.eclipse.uml2.uml.UseCase;

/**
 * @generated
 */
public class InnerUseCaseCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public InnerUseCaseCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getClassifier();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		UseCase newElement = (UseCase) super.doDefaultElementCreation();
		if (newElement != null) {
			Classifier container = (Classifier) getElementToEdit();
			if (container != null) {
				container.getUseCases().add(newElement);
			}
			UMLElementTypes.Initializers.UseCase_3004.init(newElement);
		}
		return newElement;
	}

}
