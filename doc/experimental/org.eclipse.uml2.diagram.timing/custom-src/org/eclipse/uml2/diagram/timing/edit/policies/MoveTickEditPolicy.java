package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;


public class MoveTickEditPolicy extends AbstractEditPolicy {
	public static final String ROLE = MoveTickEditPolicy.class.getName() + ":Role";
	
	@Override
	public Command getCommand(Request request) {
		if (request instanceof ChangeBoundsRequest && REQ_MOVE.equals(request.getType())){
			if (false == request.getExtendedData().get(MoveCircleEditPolicy.KEY_INITIATED_FROM_CIRCLE) instanceof IGraphicalEditPart){
				return UnexecutableCommand.INSTANCE;
			}
		}
		return null;
	}
	
}
