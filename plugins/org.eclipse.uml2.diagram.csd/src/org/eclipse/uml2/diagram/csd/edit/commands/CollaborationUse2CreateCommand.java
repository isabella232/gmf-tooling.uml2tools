package org.eclipse.uml2.diagram.csd.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.CollaborationUse;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class CollaborationUse2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public CollaborationUse2CreateCommand(CreateElementRequest req) {
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
		CollaborationUse newElement = UMLFactory.eINSTANCE.createCollaborationUse();

		Classifier owner = (Classifier) getElementToEdit();
		owner.getCollaborationUses().add(newElement);

		UMLElementTypes.init_CollaborationUse_3002(newElement);
		return newElement;
	}
}
