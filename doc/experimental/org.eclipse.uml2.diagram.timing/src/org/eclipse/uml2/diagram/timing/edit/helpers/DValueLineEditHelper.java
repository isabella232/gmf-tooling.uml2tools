package org.eclipse.uml2.diagram.timing.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.timing.edit.policies.SetupAnchorsEditPolicy;

/**
 * @generated
 */

public class DValueLineEditHelper extends TimingDBaseEditHelper {

	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		Object segment = req.getParameters().get(SetupAnchorsEditPolicy.KEY_OVERLAPPING_SEGMENT_EP);
		if (segment != null) {
			System.out.println("DValueLineEditHelper.getCreateCommand()" + segment);
		}
		return super.getCreateCommand(req);
	}
}
