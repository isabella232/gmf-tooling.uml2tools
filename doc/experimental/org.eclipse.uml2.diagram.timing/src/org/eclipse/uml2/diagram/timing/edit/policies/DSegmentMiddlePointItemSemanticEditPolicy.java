package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

/**
 * @generated
 */

public class DSegmentMiddlePointItemSemanticEditPolicy extends TimingDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DSegmentMiddlePointItemSemanticEditPolicy() {
		super(TimingDElementTypes.DSegmentMiddlePoint_3004);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

}
