package org.eclipse.uml2.diagram.timing.edit.policies.create;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.AbstractPostCreateCommand;
import org.eclipse.uml2.diagram.timing.draw2d.SegmentGeometry;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.policies.SegmentAnchorHelper;
import org.eclipse.uml2.diagram.timing.edit.policies.SegmentAnchor.EditPartAndGlobalBounds;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;


public class CreateTickEditPolicy extends AbstractEditPolicy {
	public static final String ROLE = CreateTickEditPolicy.class.getName() + ":Role";
	private DBlockEditPart myBlockEP;
	
	@Override
	public void activate() {
		super.activate();
		myBlockEP = findBlockEditPart(getHostImpl());
	}
	
	@Override
	public void deactivate() {
		myBlockEP = null;
		super.deactivate();
	}
	
	@Override
	public Command getCommand(Request request) {
		if (understandsRequest(request)){
			return getPostCreateCommand((CreateViewAndElementRequest)request);
		}
		return null;
	}
	
	@Override
	public boolean understandsRequest(Request req) {
		if (myBlockEP == null){
			return false;
		}
		if (false == req instanceof CreateViewAndElementRequest){
			return false;
		}
		CreateViewAndElementRequest cvaeReq = (CreateViewAndElementRequest)req;
		CreateElementRequestAdapter requestAdapter = cvaeReq.getViewAndElementDescriptor().getCreateElementRequestAdapter();
		CreateElementRequest semanticRequest = (CreateElementRequest) requestAdapter.getAdapter(CreateElementRequest.class);
		return (semanticRequest.getElementType() == TimingDElementTypes.DTick_3007);
	}
	
	private IGraphicalEditPart getHostImpl(){
		return (IGraphicalEditPart) getHost();
	}
	
	private TransactionalEditingDomain getDomain(){
		return getHostImpl().getEditingDomain();	
	}
	
	private Command getPostCreateCommand(CreateViewAndElementRequest cvaeReq){
		SegmentAnchorHelper helper = new SegmentAnchorHelper(myBlockEP);
		EditPartAndGlobalBounds<PrimaryShapeEditPart> circleData = helper.findCloseCircle(cvaeReq.getLocation(), SegmentGeometry.CIRCLE_RADIUS + 1);
		PostCreateTickCommand resCommand = new PostCreateTickCommand(getDomain(), cvaeReq, getHostImpl(), circleData); 
		return new ICommandProxy(resCommand);
	}
	
	private static DBlockEditPart findBlockEditPart(IGraphicalEditPart start){
		EditPart curr = start;
		while (curr != null && false == curr instanceof DiagramEditPart && false == curr instanceof DBlockEditPart){
			curr = curr.getParent();
		}
		return curr instanceof DBlockEditPart ? (DBlockEditPart)curr : null;
	}
	
	private static class PostCreateTickCommand extends AbstractPostCreateCommand {
		private final EditPartAndGlobalBounds<PrimaryShapeEditPart> myCircleData;

		public PostCreateTickCommand(TransactionalEditingDomain domain, CreateViewAndElementRequest cvaeReq, IGraphicalEditPart hostEditPart, EditPartAndGlobalBounds<PrimaryShapeEditPart> circleData) {
			super(domain, cvaeReq, hostEditPart, TimingDVisualIDRegistry.TYPED_ADAPTER);
			myCircleData = circleData;
		}
		
		@Override
		public boolean canExecute() {
			return myCircleData != null;
		}
		
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			IFigure circleF = myCircleData.getEditPart().getPrimaryShape();
			Rectangle nextCircleBounds = circleF.getBounds().getCopy();
			circleF.getParent().translateToAbsolute(nextCircleBounds);
			int centerX = nextCircleBounds.x + nextCircleBounds.width / 2;
			
			Point tickCenter = new Point(centerX - SegmentGeometry.TICK_WIDTH/2, -SegmentGeometry.TICK_HEIGHT);
			getHostEditPart().getFigure().translateToRelative(tickCenter);
			setLocation(getCreatedView(), tickCenter);
			return CommandResult.newOKCommandResult();
		}
	}
	

}
