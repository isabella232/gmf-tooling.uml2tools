package org.eclipse.uml2.diagram.timing.edit.policies.links;

import java.util.Collections;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.GraphicalNodeEditPolicy;
import org.eclipse.gef.requests.CreateConnectionRequest;
import org.eclipse.gef.requests.ReconnectRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewAndElementRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.policies.SegmentAnchor;
import org.eclipse.uml2.diagram.timing.edit.policies.SegmentAnchorHelper;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;


public class ValueLineCreateValueSwitchEditPolicy extends GraphicalNodeEditPolicy {
	public static final String ROLE = ValueLineCreateValueSwitchEditPolicy.class.getName() + ":Role";
	
	@Override
	protected Command getConnectionCompleteCommand(CreateConnectionRequest request) {
		if (request instanceof CreateConnectionViewAndElementRequest){
			CreateConnectionViewAndElementRequest ccvaeReq = (CreateConnectionViewAndElementRequest)request;
			CreateElementRequestAdapter requestAdapter = ccvaeReq.getConnectionViewAndElementDescriptor().getCreateElementRequestAdapter();
			IElementType elementType = (IElementType)requestAdapter.getAdapter(IElementType.class);
			if (TimingDElementTypes.DStateSwitch_4001.equals(elementType)){
				return getValueSwitchCompleteCommand(ccvaeReq);
			}
		}
		return null;
	}

	private Command getValueSwitchCompleteCommand(CreateConnectionViewAndElementRequest ccvaeReq) {
		SegmentAnchorHelper segmentAnchorHelper = new SegmentAnchorHelper((DBlockEditPart) getHost().getParent());
		SegmentAnchor anchor = segmentAnchorHelper.findSegmentAnchor(ccvaeReq.getLocation());
		
		PreferencesHint prefHint = ((IGraphicalEditPart)getHost()).getDiagramPreferencesHint();
		CreateUnspecifiedTypeRequest segmentRequest = new CreateUnspecifiedTypeRequest(Collections.singletonList(TimingDElementTypes.DSegment_3003), prefHint);
		segmentRequest.setLocation(ccvaeReq.getLocation());
		SegmentAnchor.Util.putAnchor(anchor, segmentRequest);
		
		Command command = getHost().getCommand(segmentRequest);
		return command;
	}

	@Override
	protected Command getConnectionCreateCommand(CreateConnectionRequest request) {
		return null;
	}

	@Override
	protected Command getReconnectSourceCommand(ReconnectRequest request) {
		return null;
	}

	@Override
	protected Command getReconnectTargetCommand(ReconnectRequest request) {
		return null;
	}
	
	
}
