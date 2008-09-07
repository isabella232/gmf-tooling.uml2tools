package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;


public class SegmentAnchorImpl implements SegmentAnchor {
	private DSegmentEditPart myOverlappingSegment;
	private PrimaryShapeEditPart myLeftAnchor;
	private PrimaryShapeEditPart myRightAnchor;
	
	public DSegmentEditPart getOverlappingSegment() {
		return myOverlappingSegment;
	}
	
	public PrimaryShapeEditPart getLeftAnchor() {
		return myLeftAnchor;
	}
	
	public PrimaryShapeEditPart getRightAnchor() {
		return myRightAnchor;
	}
	
	public void setLeftAnchor(PrimaryShapeEditPart leftAnchor) {
		myLeftAnchor = leftAnchor;
	}
	
	public void setOverlappingSegment(DSegmentEditPart overlappingSegment) {
		myOverlappingSegment = overlappingSegment;
	}
	
	public void setRightAnchor(PrimaryShapeEditPart rightAnchor) {
		myRightAnchor = rightAnchor;
	}
	
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer();
		result.append("SegmentAnchor: ");
		result.append("\n\t OverlappingSegment: ").append(myOverlappingSegment);
		result.append("\n\t LeftCircle: ").append(asDebugString(myLeftAnchor));
		result.append("\n\t RightCircle: ").append(asDebugString(myRightAnchor));
		return result.toString();
	}
	
	private static String asDebugString(PrimaryShapeEditPart ep){
		if (ep == null){
			return "null";
		}
		StringBuffer result = new StringBuffer();
		result.append(ep);
		
		EObject semantic = ep.resolveSemanticElement();
		if (semantic instanceof DSegmentElement){
			result.append("\n\t\t[").append(semantic).append("]");
		}
		return result.toString();
	}
}
