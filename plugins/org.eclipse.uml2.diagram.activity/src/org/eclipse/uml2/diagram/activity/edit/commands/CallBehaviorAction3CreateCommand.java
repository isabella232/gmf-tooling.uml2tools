package org.eclipse.uml2.diagram.activity.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.providers.ElementInitializers;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityPartition;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class CallBehaviorAction3CreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public CallBehaviorAction3CreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated
	 */
	protected EObject getElementToEditGen() {
		EObject container = ((CreateElementRequest) getRequest()).getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		return container;
	}

	/**
	 * @generated NOT
	 */
	protected EObject getElementToEdit() {
		return getElementToEditGen().eContainer();
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getActivity();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreationGen() {
		CallBehaviorAction newElement = UMLFactory.eINSTANCE.createCallBehaviorAction();

		Activity owner = (Activity) getElementToEdit();
		owner.getNodes().add(newElement);
		ActivityPartition childHolder = (ActivityPartition) getElementToEdit();
		childHolder.getNodes().add(newElement);
		UMLElementTypes.init_CallBehaviorAction_3074(newElement);
		return newElement;
	}

	/**
	 * @generated NOT
	 */
	protected EObject doDefaultElementCreation() {
		CallBehaviorAction newElement = (CallBehaviorAction) super.doDefaultElementCreation();
		if (newElement != null) {
			Activity container = (Activity) getElementToEdit();
			if (container != null) {
				container.getNodes().add(newElement);
			}

			ActivityPartition partition = (ActivityPartition) getElementToEditGen();
			newElement.getInPartitions().add(partition);

			ElementInitializers.init_CallBehaviorAction_3074(newElement);
		}
		return newElement;
	}
}
