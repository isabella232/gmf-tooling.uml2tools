package org.eclipse.uml2.diagram.timing.edit.policies.links;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.uml2.diagram.timing.edit.policies.TimingDBaseItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

public class ValueLineCheckValueSwitchEditPolicy extends TimingDBaseItemSemanticEditPolicy {
	public static final String ROLE = ValueLineCheckValueSwitchEditPolicy.class.getName() + ":Role";
	
	public ValueLineCheckValueSwitchEditPolicy() {
		super(TimingDElementTypes.DValueLine_3002);
	}

	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		return (req.getTarget() == null) ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
	}

	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (TimingDElementTypes.DStateSwitch_4001 == req.getElementType()) {
			return getGEFWrapper(new SegmentCheckValueSwitchEditPolicy.CheckValueSwitchCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}
	
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		return null;
	}

}
