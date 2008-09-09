package org.eclipse.uml2.diagram.timing.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.DTick;

/**
 * @generated
 */

public class DSegmentMiddlePointEditHelper extends TimingDBaseEditHelper {

	@Override
	protected ICommand getDestroyElementCommand(DestroyElementRequest req) {
		DestroyElementCommand destroyTick = null;
		if (req.getElementToDestroy() instanceof DSegmentElement) {
			DSegmentElement withTick = (DSegmentElement) req.getElementToDestroy();
			DTick tick = withTick.getTick();
			if (tick != null) {
				destroyTick = new DestroyElementCommand(new DestroyElementRequest(tick, req.isConfirmationRequired()));
			}
		}
		ICommand result = super.getDestroyElementCommand(req);
		return compose(destroyTick, result);
	}

}
