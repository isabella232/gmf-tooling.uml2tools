package org.eclipse.uml2.diagram.sequence.edit.policies;

import org.eclipse.draw2d.geometry.Point;
import org.eclipse.gmf.runtime.notation.View;

public interface OrderedLayoutEditPolicy {
	public View findAnchorView(Point relativeLocation, boolean isBeforeAnchor);
}
