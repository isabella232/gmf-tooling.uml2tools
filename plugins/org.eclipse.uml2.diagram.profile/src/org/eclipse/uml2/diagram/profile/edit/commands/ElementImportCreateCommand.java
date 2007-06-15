package org.eclipse.uml2.diagram.profile.edit.commands;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.ElementImport;
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ElementImportCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ElementImportCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getNamespace();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		ElementImport newElement = (ElementImport) super.doDefaultElementCreation();
		if (newElement != null) {
			Profile container = (Profile) getElementToEdit();
			if (container != null) {
				Collection featureValues = container.getMetaclassReferences();
				featureValues.add(newElement);
			}
		}
		return newElement;
	}
}
