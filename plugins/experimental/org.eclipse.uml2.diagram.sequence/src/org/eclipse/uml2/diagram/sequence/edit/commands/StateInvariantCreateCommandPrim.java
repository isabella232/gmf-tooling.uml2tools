package org.eclipse.uml2.diagram.sequence.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class StateInvariantCreateCommandPrim extends CreateElementCommand {

	/**
	 * Intentionally package local -- prevents default generated code from instantiation. 
	 * StateInvariantCreateCommand should be used externally.  
	 * 
	 * @generated NOT
	 */
	StateInvariantCreateCommandPrim(CreateElementRequest req) {
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
		EObject eObject = getElementToEditGen();
		if (false == eObject instanceof Lifeline) {
			return null;
		}
		Lifeline lifeline = (Lifeline) eObject;
		return lifeline.getInteraction();
	}

	/**
	 * @generated
	 */
	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getInteraction();
	}

}
