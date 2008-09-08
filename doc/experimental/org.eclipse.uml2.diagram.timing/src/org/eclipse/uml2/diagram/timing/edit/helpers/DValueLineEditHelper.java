package org.eclipse.uml2.diagram.timing.edit.helpers;

import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.timing.edit.policies.SegmentAnchor;

/**
 * @generated
 */

public class DValueLineEditHelper extends TimingDBaseEditHelper {

	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		Object anchor = SegmentAnchor.Util.getAnchor(req);
		if (anchor != null) {
			//System.err.println("DValueLineEditHelper.getCreateCommand()");
			//System.err.println("\t req: " + req);
			//System.err.println("\t anchor: " + anchor);
		}
		return super.getCreateCommand(req);
	}
}
