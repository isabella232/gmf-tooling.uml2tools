package org.eclipse.uml2.diagram.csd.edit.commands;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Collaboration;
import org.eclipse.uml2.uml.Parameter;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ParameterCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ParameterCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getStructuredClassifier();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Parameter newElement = (Parameter) super.doDefaultElementCreation();
		if (newElement != null) {
			Collaboration container = (Collaboration) getElementToEdit();
			if (container != null) {
				container.getCollaborationRoles().add(newElement);
			}
		}
		return newElement;
	}
}
