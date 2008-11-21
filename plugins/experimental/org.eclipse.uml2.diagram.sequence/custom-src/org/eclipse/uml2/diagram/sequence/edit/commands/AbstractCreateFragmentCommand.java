package org.eclipse.uml2.diagram.sequence.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;
import org.eclipse.uml2.uml.Lifeline;
import org.eclipse.uml2.uml.UMLPackage;

public abstract class AbstractCreateFragmentCommand extends CreateElementCommand {
	
	public AbstractCreateFragmentCommand(CreateElementRequest req) {
		super(req);
	}

	protected abstract void afterDefaultElementCreation(InteractionFragment createdFragment);
	
	@Override
	protected final EObject doDefaultElementCreation() {
		EObject newElement = super.doDefaultElementCreation();
		if (newElement instanceof InteractionFragment){
			InteractionFragment fragment = (InteractionFragment)newElement;
			defaultSetupInteractionFragment(fragment);
			afterDefaultElementCreation(fragment);
		}
		return newElement;
	}

	protected void defaultSetupInteractionFragment(InteractionFragment newFragment) {
		Lifeline lifeline = getLifeline();
		if (!newFragment.getCovereds().contains(lifeline)){
			newFragment.getCovereds().add(lifeline);
		}
	}

	protected EObject getElementToEdit() {
		Lifeline lifeline = getLifeline();
		return lifeline.getInteraction();
	}

	protected EClass getEClassToEdit() {
		return UMLPackage.eINSTANCE.getInteraction();
	}

	protected CreateElementRequest getCreateElementRequest(){
		return (CreateElementRequest)getRequest();
	}

	protected Lifeline getLifeline(){
		EObject container = ((CreateElementRequest) getRequest()).getContainer();
		if (container instanceof View) {
			container = ((View) container).getElement();
		}
		if (false == container instanceof Lifeline) {
			return null;
		}
		return (Lifeline)container;
	}
	
	protected Interaction getInteraction(){
		return getLifeline().getInteraction();
	}
	
}
