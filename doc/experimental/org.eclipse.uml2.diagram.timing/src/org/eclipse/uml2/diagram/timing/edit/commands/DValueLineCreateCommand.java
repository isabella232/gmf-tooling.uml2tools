package org.eclipse.uml2.diagram.timing.edit.commands;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.emf.type.core.commands.CreateElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDFactory;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

/**
 * @generated
 */

public class DValueLineCreateCommand extends CreateElementCommand {

	/**
	 * @generated
	 */
	public DValueLineCreateCommand(CreateElementRequest req) {
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
		return TimingDPackage.eINSTANCE.getDBlock();
	}

	/**
	 * @generated
	 */
	protected EObject doDefaultElementCreation() {
		DValueLine newElement = TimingDFactory.eINSTANCE.createDValueLine();

		DBlock owner = (DBlock) getElementToEdit();
		owner.getStates().add(newElement);
		TimingDElementTypes.init_DValueLine_3002(newElement);
		return newElement;
	}
}
