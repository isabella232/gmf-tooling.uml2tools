package org.eclipse.uml2.diagram.sequence.edit.policies;

import java.util.List;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.ConnectionEditPart;
import org.eclipse.gef.NodeListener;
import org.eclipse.gef.editpolicies.AbstractEditPolicy;
import org.eclipse.uml2.diagram.sequence.edit.parts.BehaviorExecutionSpecificationEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.uml2.uml.Message;
import org.eclipse.uml2.uml.MessageSort;


public class BehaviorExecutionColorVisualEffect extends AbstractEditPolicy implements NodeListener {
	
	@Override
	public void activate() {
		super.activate();
		refreshColorScheme(null);
		getHostImpl().addNodeListener(this);
	}
	
	@Override
	public void deactivate() {
		getHostImpl().removeNodeListener(this);
		super.deactivate();
	}
	
	public void refreshEffect() {
		refreshColorScheme(null);
	}
	
	private void refreshColorScheme(ConnectionEditPart toBeRemoved) {
		boolean isRoot = hasOutgoingMessages(toBeRemoved) && !hasIncomingMessages(toBeRemoved);
		IFigure figure = getHostImpl().getPrimaryShape();
		if (isRoot){
			figure.setBackgroundColor(ColorConstants.lightGray);
			figure.setForegroundColor(ColorConstants.darkGray);
		} else {
			figure.setBackgroundColor(ColorConstants.white);
			figure.setForegroundColor(ColorConstants.black);
		}
	}

	private BehaviorExecutionSpecificationEditPart getHostImpl(){
		return (BehaviorExecutionSpecificationEditPart)getHost();
	}
	
	private boolean hasIncomingMessages(ConnectionEditPart toBeRemoved){
		BehaviorExecutionSpecificationEditPart host = getHostImpl();
		List<?> targetConnections = host.getTargetConnections();
		return containsMessageEditParts(targetConnections, toBeRemoved);
	}

	private boolean hasOutgoingMessages(ConnectionEditPart toBeRemoved){
		BehaviorExecutionSpecificationEditPart host = getHostImpl();
		List<?> sourceConnections = host.getSourceConnections();
		return containsMessageEditParts(sourceConnections, toBeRemoved);
	}

	private boolean containsMessageEditParts(List<?> connections, ConnectionEditPart toBeRemoved){
		for (Object next : connections){
			if (next == toBeRemoved){
				continue;
			}
			if (next instanceof MessageEditPart){
				MessageEditPart nextMessageEditPart = (MessageEditPart)next;
				Message message = (Message)nextMessageEditPart.resolveSemanticElement();
				if (message != null && message.getMessageSort() != MessageSort.REPLY_LITERAL){
					return true;
				}
			}
		}
		return false;
	}

	public void removingSourceConnection(ConnectionEditPart connection, int index) {
		refreshColorScheme(connection);
	}

	public void removingTargetConnection(ConnectionEditPart connection, int index) {
		refreshColorScheme(connection);
	}

	public void sourceConnectionAdded(ConnectionEditPart connection, int index) {
		refreshColorScheme(null);
	}

	public void targetConnectionAdded(ConnectionEditPart connection, int index) {
		refreshColorScheme(null);
	}
	
}
