package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

/**
 * @generated
 */

public class DMessageItemSemanticEditPolicy extends TimingDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DMessageItemSemanticEditPolicy() {
		super(TimingDElementTypes.DMessage_4002);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
	}

}
