package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;


public class SetupAnchorsEditPolicy extends AbstractEditPolicy {
	public static final String ROLE = SetupAnchorsEditPolicy.class.getSimpleName() + ":Role";
	private DBlockAnchorHelper myHelper;
	
	@Override
	public void activate() {
		super.activate();
		myHelper = createHelper();
	}
	
	@Override
	public boolean understandsRequest(Request req) {
		return req instanceof SetupAnchorsRequest;
	}
	
	@Override
	public Command getCommand(Request request) {
		if (myHelper == null){
			return null;
		}
		
		if (request instanceof SetupAnchorsRequest){
			SetupAnchorsRequest reqImpl = (SetupAnchorsRequest)request;
			Point globalLocation = reqImpl.getLocation();
			SegmentAnchor anchor = myHelper.findSegmentAnchor(globalLocation);
			return new PushDataCommand(reqImpl, anchor);
		}
		return null;
	}
	
	protected DBlockAnchorHelper createHelper(){
		DBlockEditPart blockEP = findBlockEditPart(getHost());
		return blockEP == null ? null : new DBlockAnchorHelper(blockEP);
	}
	
	private DBlockEditPart findBlockEditPart(EditPart start){
		RootEditPart root = start.getRoot();
		EditPart current = start;
		while (false == current instanceof DBlockEditPart){
			EditPart parent = current.getParent();
			if (parent == null || parent == root || parent == current){
				return null;
			}
			current = parent;
		}
		return (DBlockEditPart)current;
	}
	
	private static class PushDataCommand extends Command {
		private final SetupAnchorsRequest myRequest;
		private final SegmentAnchor myAnchor;

		public PushDataCommand(SetupAnchorsRequest request, SegmentAnchor anchor){
			myRequest = request;
			myAnchor = anchor;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public void execute() {
			myRequest.getTargetData().put(SegmentAnchor.KEY_FOR_REQUEST_PARAMETERS, myAnchor);
		}
	}
	
	
}
