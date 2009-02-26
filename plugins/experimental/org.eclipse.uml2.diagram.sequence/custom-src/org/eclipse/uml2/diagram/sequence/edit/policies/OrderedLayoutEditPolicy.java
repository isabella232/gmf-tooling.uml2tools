package org.eclipse.uml2.diagram.sequence.edit.policies;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.notation.View;

public interface OrderedLayoutEditPolicy {
	public AnchoredSibling findAnchoredSibling(Point relativeLocation);
	
	public static class AnchoredSibling {
		private final View mySiblingView;
		private final boolean myBeforeNotAfterAnchor;
		
		public AnchoredSibling(View siblingView, boolean isBeforeNotAfterAnchor){
			mySiblingView = siblingView;
			myBeforeNotAfterAnchor = isBeforeNotAfterAnchor;
		}
		
		public View getSiblingView(){
			return mySiblingView;
		}
		
		public boolean isBeforeNotAfterAnchor(){
			return myBeforeNotAfterAnchor;
		}	
	}
}
