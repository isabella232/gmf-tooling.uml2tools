package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActivityPartition2CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public ActivityPartition2CreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getActivityPartition();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		ActivityPartition newElement = (ActivityPartition) super.doDefaultElementCreation();
		if (newElement != null) {
			UMLElementTypes.Initializers.ActivityPartition_3057.init(newElement);
		}
		return newElement;
	}
}
