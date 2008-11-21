package org.eclipse.uml2.diagram.sequence.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.CombinedFragment;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.UMLFactory;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class CombinedFragmentMountingRegionCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public CombinedFragmentMountingRegionCreateCommand(CreateElementRequest req) {
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
		return UMLPackage.eINSTANCE.getInteraction();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		CombinedFragment newElement = UMLFactory.eINSTANCE.createCombinedFragment();

		Interaction owner = (Interaction) getElementToEdit();
		owner.getFragments().add(newElement);
		Lifeline childHolder = (Lifeline) getElementToEdit();
		childHolder.getCoveredBys().add(newElement);
		return newElement;
	}

}
