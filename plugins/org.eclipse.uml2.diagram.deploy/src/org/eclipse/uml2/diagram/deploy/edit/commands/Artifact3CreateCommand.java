package org.eclipse.uml2.diagram.deploy.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.deploy.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Artifact;
import org.eclipse.uml2.uml.Class;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Artifact3CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public Artifact3CreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getClass_();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		Artifact newElement = UMLFactory.eINSTANCE.createArtifact();

		Class owner = (Class) getElementToEdit();
		owner.getNestedClassifiers().add(newElement);

		UMLElementTypes.init_Artifact_3006(newElement);
		return newElement;
	}
}
