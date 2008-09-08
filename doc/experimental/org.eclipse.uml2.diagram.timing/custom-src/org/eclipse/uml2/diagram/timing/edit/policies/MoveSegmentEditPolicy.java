package org.eclipse.uml2.diagram.timing.edit.policies;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.gef.requests.ChangeBoundsRequest;
import org.eclipse.gmf.runtime.common.core.command.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.commands.SetBoundsCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.Size;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;


public class MoveSegmentEditPolicy extends AbstractEditPolicy {
	public static final String ROLE = MoveSegmentEditPolicy.class.getName() + ":ROLE";
	
	@Override
	public Command getCommand(Request request) {
		if (request instanceof ChangeBoundsRequest){
			return getAdjustRelatedSegmentsCommand((ChangeBoundsRequest)request);
		}
		return super.getCommand(request);
	}
	
	private TransactionalEditingDomain getDomain(){
		return getHostImpl().getEditingDomain();
	}
	
	private IGraphicalEditPart getHostImpl(){
		return ((IGraphicalEditPart)getHost());
	}
	
	private Command getAdjustRelatedSegmentsCommand(ChangeBoundsRequest req){
		Point moveDelta = req.getMoveDelta();
		if (moveDelta == null){
			return null;
		}
		
		CompositeTransactionalCommand cc = new CompositeTransactionalCommand(getDomain(), "Adjust related segments");
		Map<EObject, View> domain2Notation = new Domain2NotationCollector().collectAll(getHostImpl().getNotationView().getDiagram());

		for (Object next : req.getEditParts()){
			if (next instanceof DSegmentEditPart){
				DSegmentEditPart nextEP = (DSegmentEditPart)next;
				DSegment nextSegment = (DSegment) nextEP.resolveSemanticElement();
				DSegmentStart start = nextSegment.getStart();
				DSegmentEnd end = nextSegment.getEnd();
				
				if (start != null){
					DStateSwitch incomingSwitch = start.getIncomingSwitch();
					if (incomingSwitch != null){
						DSegment fromSegment = incomingSwitch.getFromSegment();
						if (fromSegment != null){
							View fromSegmentView = domain2Notation.get(fromSegment);
							if (fromSegmentView instanceof Node){
								LayoutConstraint constr = ((Node)fromSegmentView).getLayoutConstraint();
								if (constr instanceof Size){
									Size size = (Size)constr;
									int width = size.getWidth();
									if (width > 0){
										if (width > -moveDelta.x){
											cc.compose(new SetBoundsCommand(getDomain(), "", new EObjectAdapter(fromSegmentView), new Dimension(width + moveDelta.x, size.getHeight())));
										} else {
											cc.compose(UnexecutableCommand.INSTANCE);
										}
									}
								}
							}
						}
					}
				}
				
				if (end != null){
					DStateSwitch outgoingSwitch = end.getSwitch();
					if (outgoingSwitch != null){
						DSegment toSegment = outgoingSwitch.getToSegment();
						if (toSegment != null){
							View toSegmentView = domain2Notation.get(toSegment);
							if (toSegmentView instanceof Node){
								LayoutConstraint constr = ((Node)toSegmentView).getLayoutConstraint();
								if (constr instanceof Bounds){
									Bounds bounds = (Bounds)constr;
									int width = bounds.getWidth();
									if (width > moveDelta.x){
										Rectangle newBounds = new Rectangle(bounds.getX(), bounds.getY(), bounds.getWidth(), bounds.getHeight());
										newBounds.x += moveDelta.x;
										newBounds.width  -= moveDelta.x;
										cc.compose(new SetBoundsCommand(getDomain(), "", new EObjectAdapter(toSegmentView), newBounds));  
									} else {
										cc.compose(UnexecutableCommand.INSTANCE);
									}
								}
							}
						}
					}
				}
			}
		}
		
		if (cc.size() == 0){
			return null;
		}
		return new ICommandProxy(cc.reduce());
	}
	
	private static class Domain2NotationCollector {
		private Map<EObject, View> myResult;
		
		public Map<EObject, View> collectAll(View view){
			myResult = new HashMap<EObject, View>();
			visit(view);
			if (false == view instanceof Diagram){
				visitDiagramLinks(view.getDiagram());
			}
			Map<EObject, View> result = myResult;
			myResult = null;
			return result;
		}
		
		private void visit(View root){
			register(root);
			for (Object next : root.getChildren()){
				if (next instanceof Edge && false == root instanceof Diagram){
					continue;
				}
				visit((View)next);
			}
		}
		
		private void register(View view){
			if (view.getElement() != null){
				myResult.put(view.getElement(), view);
			}
		}
		
		private void visitDiagramLinks(Diagram diagram){
			for (Object next : diagram.getChildren()){
				if (next instanceof Edge){
					register((Edge)next);
				}
			}
		}
	}

}
