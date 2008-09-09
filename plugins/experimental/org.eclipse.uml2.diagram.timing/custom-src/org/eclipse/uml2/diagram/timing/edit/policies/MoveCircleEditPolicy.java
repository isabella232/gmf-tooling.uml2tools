package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.editpolicies.ViewHelper;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DTickEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.DTick;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;


public class MoveCircleEditPolicy extends AbstractEditPolicy {
	public static final String ROLE = MoveCircleEditPolicy.class.getName() + ":Role";
	
	@Override
	public Command getCommand(Request request) {
		if (false == request instanceof ChangeBoundsRequest){
			return null;
		}
		ChangeBoundsRequest req = (ChangeBoundsRequest)request;
		if (REQ_MOVE.equals(request.getType())){
			return getMoveCircleTickCommand(req);
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private Command getMoveCircleTickCommand(ChangeBoundsRequest request){
		DSegmentElement circle = (DSegmentElement) getHostImpl().resolveSemanticElement();
		DTick tick = circle.getTick();
		if (tick == null){
			return null;
		}
		DBlockEditPart blockEP = SegmentAnchorHelper.findBlockEditPart(getHostImpl());
		if (blockEP == null){
			return null;
		}
		
		View blockView = blockEP.getNotationView();
		ViewHelper viewHelper = new ViewHelper(TimingDVisualIDRegistry.TYPED_ADAPTER);
		View tickView = viewHelper.findChildByType(blockView, DTickEditPart.VISUAL_ID, tick);
		if (tickView == null){
			return null;
		}
		
		DTickEditPart tickEditPart = (DTickEditPart) getHostImpl().getViewer().getEditPartRegistry().get(tickView);
		if (tickEditPart == null){
			return null;
		}
		
		ChangeBoundsRequest moveTickRequest = new ChangeBoundsRequest(REQ_MOVE);
		moveTickRequest.setMoveDelta(request.getMoveDelta());
		moveTickRequest.setSizeDelta(new Dimension(0, 0));
		moveTickRequest.setLocation(request.getLocation());
		moveTickRequest.setExtendedData(request.getExtendedData());
		
		moveTickRequest.getExtendedData().put(MoveTickEditPolicy.KEY_INITIATED_FROM_CIRCLE, getHostImpl());
		Command result = tickEditPart.getCommand(moveTickRequest);
		moveTickRequest.getExtendedData().put(MoveTickEditPolicy.KEY_INITIATED_FROM_CIRCLE, null);
		return result;
	}
	
	private IGraphicalEditPart getHostImpl(){
		return (IGraphicalEditPart) getHost();
	}
	
}
