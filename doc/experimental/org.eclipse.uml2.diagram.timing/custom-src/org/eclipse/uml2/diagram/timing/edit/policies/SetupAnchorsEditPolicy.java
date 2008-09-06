package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.RootEditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;


public class SetupAnchorsEditPolicy extends AbstractEditPolicy {
	private static final String PREFIX = SetupAnchorsEditPolicy.class.getSimpleName() + ":";
	public static final String ROLE = PREFIX + "Role";
	public static final String KEY_OVERLAPPING_SEGMENT_EP = PREFIX + "OverlappingSegmentEP";
	
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
			DSegmentEditPart segmentEP = myHelper.findSegmentForGlobalPoint(reqImpl.getLocation());
			return new PushDataCommand(reqImpl, segmentEP);
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
		private final DSegmentEditPart myOverlappingSegment;

		public PushDataCommand(SetupAnchorsRequest request, DSegmentEditPart overlappingSegment){
			myRequest = request;
			myOverlappingSegment = overlappingSegment;
		}
		
		@SuppressWarnings("unchecked")
		@Override
		public void execute() {
			System.out.println("PushDataCommand.execute(): " + myOverlappingSegment);
			myRequest.getTargetData().put(KEY_OVERLAPPING_SEGMENT_EP, myOverlappingSegment);
		}
	}
	
	
}
