package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;


public interface SegmentAnchor {
	public static final String KEY_FOR_REQUEST_PARAMETERS = SegmentAnchor.class.getSimpleName() + ":REQUEST_KEY";
	
	public DSegmentEditPart getOverlappingSegment();
	public PrimaryShapeEditPart getLeftAnchor();
	public PrimaryShapeEditPart getRightAnchor();
}
