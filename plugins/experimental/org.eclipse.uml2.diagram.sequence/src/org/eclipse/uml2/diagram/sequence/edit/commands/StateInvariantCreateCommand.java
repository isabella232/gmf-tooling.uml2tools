package org.eclipse.uml2.diagram.sequence.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.sequence.providers.ElementInitializers;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated NOT 
 */
public class StateInvariantCreateCommand extends AbstractCreateFragmentCommand {

	/**
	 * @generated
	 */
	public StateInvariantCreateCommand(CreateElementRequest req) {
		super(req);
	}

	/**
	 * @generated NOT
	 */
	protected EObject getElementToEdit() {
		return super.getElementToEdit();
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getInteraction();
	}

	@Override
	protected void afterDefaultElementCreation(InteractionFragment createdFragment) {
		StateInvariant invariant = (StateInvariant) createdFragment;
		ElementInitializers.init_StateInvariant_3003(invariant);
		if (invariant.getInvariant() == null) {
			invariant.createInvariant("State");
		}
	}

}
