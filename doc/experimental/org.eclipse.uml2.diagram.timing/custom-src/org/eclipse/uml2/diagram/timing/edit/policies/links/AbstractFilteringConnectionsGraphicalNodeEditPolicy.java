package org.eclipse.uml2.diagram.timing.edit.policies.links;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;


public abstract class AbstractFilteringConnectionsGraphicalNodeEditPolicy extends GraphicalNodeEditPolicy {
	
	@Override
	public Command getCommand(Request request) {
		if (ignoreRequest(request)){
			return null;
		}
		return super.getCommand(request);
	}
	
	@Override
	public boolean understandsRequest(Request req) {
		return super.understandsRequest(req) && !ignoreRequest(req);
	}
	
	@Override
	public void showTargetFeedback(Request request) {
		if (!ignoreRequest(request)){
			super.showTargetFeedback(request);
		}
	}
	
	@Override
	public void showSourceFeedback(Request request) {
		if (!ignoreRequest(request)){
			super.showSourceFeedback(request);
		}
	}
	
	@Override
	public void eraseSourceFeedback(Request request) {
		if (!ignoreRequest(request)){
			super.eraseSourceFeedback(request);
		}
	}
	
	@Override
	public void eraseTargetFeedback(Request request) {
		if (!ignoreRequest(request)){
			super.eraseTargetFeedback(request);
		}
	}
	
	protected final boolean ignoreRequest(Request request){
		Object type = request.getType();
		if (request instanceof CreateConnectionViewAndElementRequest){
			if (RequestConstants.REQ_CONNECTION_START.equals(type) || RequestConstants.REQ_CONNECTION_END.equals(type)){
				return ignoreRequestImpl((CreateConnectionViewAndElementRequest)request);
			}
		}
		return false;
	}
	
	protected abstract boolean ignoreRequestImpl(CreateConnectionViewAndElementRequest req);

}
