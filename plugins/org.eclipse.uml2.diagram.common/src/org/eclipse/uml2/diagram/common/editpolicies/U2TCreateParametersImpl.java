package org.eclipse.uml2.diagram.common.editpolicies;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.notation.View;

public class U2TCreateParametersImpl implements U2TCreateParameters {
	private Point myRelativeLocation;
	private View myParentView;
	private View myAnchorSibling;
	private boolean myIsBeforeAnchor;
	
	public Point getRelativeLocation() {
		return myRelativeLocation;
	}
	
	public void setRelativeLocation(Point relativeLocation) {
		myRelativeLocation = relativeLocation;
	}
	
	public View getAnchorSibling() {
		return myAnchorSibling;
	}
	
	public void setAnchorSibling(View anchorSibling) {
		myAnchorSibling = anchorSibling;
	}
	
	public boolean isBeforeNotAfterAnchor() {
		return myIsBeforeAnchor;
	}
	
	public void setBeforeNotAfterAnchor(boolean isBeforeAnchor) {
		myIsBeforeAnchor = isBeforeAnchor;
	}
	
	public View getParentView() {
		return myParentView;
	}
	
	public void setParentView(View parentView) {
		myParentView = parentView;
	}
}