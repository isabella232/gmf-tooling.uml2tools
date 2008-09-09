package org.eclipse.uml2.diagram.timing.edit.policies.links;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.requests.EditCommandRequestWrapper;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.IEditCommandRequest;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

public class ValueLineCheckValueSwitchEditPolicy extends AbstractEditPolicy {
	public static final String ROLE = ValueLineCheckValueSwitchEditPolicy.class.getName() + ":Role";
	
	@Override
	public Command getCommand(Request request) {
		if (RequestConstants.REQ_SEMANTIC_WRAPPER.equals(request.getType())) {
			return getSemanticCommand(((EditCommandRequestWrapper) request).getEditCommandRequest());
		}
		return null;
	}
	
	protected Command getSemanticCommand(IEditCommandRequest req) {
		//XXX: this editpolicy provides answers to wrappered CreateRelationshipRequest's only
		if (req instanceof CreateRelationshipRequest) {
			return getCreateRelationshipCommand((CreateRelationshipRequest) req);
		}
		return null;
	}

	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return (req.getTarget() == null) ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
	}

	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TimingDElementTypes.DStateSwitch_4001 == req.getElementType()) {
			return new ICommandProxy(new SegmentCheckValueSwitchEditPolicy.CheckValueSwitchCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}
	
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

}
