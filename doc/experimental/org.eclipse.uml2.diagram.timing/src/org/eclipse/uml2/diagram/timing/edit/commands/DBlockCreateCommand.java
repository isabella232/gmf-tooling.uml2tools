package org.eclipse.uml2.diagram.timing.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDFactory;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

/**
 * @generated
 */

public class DBlockCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public DBlockCreateCommand(CreateElementRequest req) {
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
		return TimingDPackage.eINSTANCE.getDFrame();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		DBlock newElement = TimingDFactory.eINSTANCE.createDBlock();

		DFrame owner = (DFrame) getElementToEdit();
		owner.getBlocks().add(newElement);
		TimingDElementTypes.init_DBlock_3001(newElement);
		return newElement;
	}
}
