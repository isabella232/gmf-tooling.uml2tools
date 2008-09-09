package org.eclipse.uml2.diagram.timing.edit.policies.create;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.l10n.DiagramUIMessages;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.editpolicies.AbstractPostCreateCommand;
import org.eclipse.uml2.diagram.timing.draw2d.SegmentGeometry;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEndEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentStartEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DStateSwitchEditPart;
import org.eclipse.uml2.diagram.timing.edit.policies.SegmentAnchor;
import org.eclipse.uml2.diagram.timing.edit.policies.SegmentAnchor.EditPartAndGlobalBounds;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDFactory;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;


public class PostCreateSegmentEditPolicy extends AbstractEditPolicy {
	public static final String ROLE = PostCreateSegmentEditPolicy.class.getName() + ":Role";
	
	@Override
	public Command getCommand(Request request) {
		if (understandsRequest(request)){
			return getPostCreateCommand((CreateViewAndElementRequest)request);
		}
		return null;
	}
	
	@Override
	public boolean understandsRequest(Request req) {
		if (false == req instanceof CreateViewAndElementRequest){
			return false;
		}
		CreateViewAndElementRequest cvaeReq = (CreateViewAndElementRequest)req;
		CreateElementRequestAdapter requestAdapter = cvaeReq.getViewAndElementDescriptor().getCreateElementRequestAdapter();
		CreateElementRequest semanticRequest = (CreateElementRequest) requestAdapter.getAdapter(CreateElementRequest.class);
		return (semanticRequest.getElementType() == TimingDElementTypes.DSegment_3003);
	}
	
	private Command getPostCreateCommand(CreateViewAndElementRequest cvaeReq){
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(getDomain(), DiagramUIMessages.AddCommand_Label);
		cc.compose(new PostCreateSegmentCommand(getDomain(), cvaeReq, getHostImpl()));
		return new ICommandProxy(cc.reduce());
	}
	
	private IGraphicalEditPart getHostImpl(){
		return (IGraphicalEditPart) getHost();
	}
	
	private TransactionalEditingDomain getDomain(){
		return getHostImpl().getEditingDomain();	
	}
	
	private static class PostCreateSegmentCommand extends AbstractPostCreateCommand {
		public PostCreateSegmentCommand(TransactionalEditingDomain domain, CreateViewAndElementRequest cvaeReq, IGraphicalEditPart hostEditPart){
			super(domain, cvaeReq, hostEditPart, TimingDVisualIDRegistry.TYPED_ADAPTER);
		}
		
		@Override
		protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
			SegmentAnchor anchor = SegmentAnchor.Util.getAnchor(getCreateRequest());
			//System.err.println("Anchor: " + anchor);
			//System.err.println("Location: " + getRequestLocation());
			//System.err.println("Size: " + getRequestSize());

			View createdView = getCreatedView();
			DSegment createdSegment = getCreatedSegment();
			
			//System.err.println("Created View: " + createdView);
			//System.err.println("Created Segment: " + createdSegment);
			
			DSegmentStart segmentStart = createdSegment.getStart();
			if (segmentStart == null){
				segmentStart = TimingDFactory.eINSTANCE.createDSegmentStart();
				createdSegment.setStart(segmentStart);
			}
			
			View segmentStartView = findChildByType(createdView, DSegmentStartEditPart.VISUAL_ID);
			if (segmentStartView == null){
				segmentStartView = ViewService.getInstance().createNode(new EObjectAdapter(segmentStart), createdView, null, ViewUtil.APPEND, getPreferencesHint());
			}
			
			completeOverlappingSegment(anchor, segmentStartView);
			
			return CommandResult.newOKCommandResult();
		}
		
		private void completeOverlappingSegment(SegmentAnchor anchor, View segmentStartView){
			if (anchor == null){
				return;
			}
			EditPartAndGlobalBounds<DSegmentEditPart> oldSegmentData = anchor.getOverlappingSegmentEditPartData();
			if (oldSegmentData == null){
				return;
			}
			View oldSegmentView = oldSegmentData.getNotationView();
			DSegment oldSegment = (DSegment) oldSegmentData.getSemanticElement();
			if (oldSegment == null || oldSegmentView == null){
				return;
			}
			
			if (oldSegment.isClosedSegment()){
				DSegmentEnd oldEnd = oldSegment.getEnd();
				Node oldEndView = (Node)findChildByType(oldSegmentView, DSegmentEndEditPart.VISUAL_ID);
				DStateSwitch oldSwitch = oldEnd.getSwitch();
				Edge oldSwitchEdge = findOutgoingEdge(oldEndView, DStateSwitchEditPart.VISUAL_ID, oldSwitch);
				
				//1) complete just created segment
				DSegment newSegment = getCreatedSegment();
				DSegmentEnd newSegmentEnd = TimingDFactory.eINSTANCE.createDSegmentEnd();
				newSegment.setEnd(newSegmentEnd);
				View newSegmentEndView = ViewService.getInstance().createNode(new EObjectAdapter(newSegmentEnd), getCreatedView(), null, ViewUtil.APPEND, getPreferencesHint());
				
				SemanticHelper.reconnectSource(oldSwitch, newSegmentEnd);
				oldSwitchEdge.setSource(newSegmentEndView);
				
				//2) now old end is free -- connect it to the new start
				if (oldEnd.getSwitch() != null){
					throw new IllegalStateException("How could it happen?");
				}	
				
				Edge newSwitch = createSwitch(oldEndView, segmentStartView);
				if (newSwitch == null){
					throw new IllegalStateException("Can't create switch between: " + oldEndView + ", and " + segmentStartView);
				}
				
				//3) Shrink old segment
				Rectangle oldBounds = oldSegmentData.getGlobalBounds();
				Point splitLocation = getRequestLocation();
				Dimension diff = oldBounds.getTopRight().getDifference(splitLocation);
				setSize(oldSegmentView, new Dimension(oldBounds.getSize().width - diff.width + 2 * SegmentGeometry.CIRCLE_RADIUS, oldBounds.height));
				
				//4) Shrink new segment
				setSize(getCreatedView(), new Dimension(diff.width, -1));
				
				return;
			}
			
			DSegmentEnd segmentEnd = TimingDFactory.eINSTANCE.createDSegmentEnd();
			oldSegment.setEnd(segmentEnd);
			View segmentEndView = ViewService.getInstance().createNode(new EObjectAdapter(segmentEnd), oldSegmentView, null, ViewUtil.APPEND, getPreferencesHint());
			
			Rectangle oldBounds = oldSegmentData.getGlobalBounds();
			Point splitLocation = getRequestLocation();
			Dimension completedSize = splitLocation.getDifference(oldBounds.getTopLeft());
			completedSize.height = oldBounds.height;
			completedSize.width += 2 * SegmentGeometry.CIRCLE_RADIUS;
			setSize(oldSegmentView, completedSize);
			
			Dimension newSegmentSize = splitLocation.getDifference(oldBounds.getTopRight()).getNegated();
			newSegmentSize.height = oldBounds.height;
			setSize(getCreatedView(), newSegmentSize);
			
			createSwitch(segmentEndView, segmentStartView);
		}
		
		protected Edge createSwitch(View fromView, View toView){
			if (false == fromView.getElement() instanceof DSegmentEnd){
				throw new IllegalStateException("Switch source should be DSegmentEnd: " + fromView.getElement());
			}

			if (false == toView.getElement() instanceof DSegmentStart){
				throw new IllegalStateException("Switch destination should be DSegmentStart: " + toView.getElement());
			}
			
			return createSwitch(fromView, (DSegmentEnd)fromView.getElement(), toView, (DSegmentStart)toView.getElement());
		}
		
		protected Edge createSwitch(View fromView, DSegmentEnd from, View toView, DSegmentStart to){
			return new CreateSwitchHelper(getPreferencesHint()).createSwitchEdge(fromView, from, toView, to);
		}
		
		private DSegment getCreatedSegment(){
			return (DSegment)getCreatedEntity();
		}
	}
	
	
}
