package org.eclipse.uml2.diagram.timing.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDFactory;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

/**
 * @generated
 */

public class DFrameCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public DFrameCreateCommand(CreateElementRequest req) {
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
		return TimingDPackage.eINSTANCE.getDFrameContainer();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		DFrame newElement = TimingDFactory.eINSTANCE.createDFrame();

		DFrameContainer owner = (DFrameContainer) getElementToEdit();
		owner.getFrames().add(newElement);
		TimingDElementTypes.init_DFrame_2001(newElement);
		return newElement;
	}
}
