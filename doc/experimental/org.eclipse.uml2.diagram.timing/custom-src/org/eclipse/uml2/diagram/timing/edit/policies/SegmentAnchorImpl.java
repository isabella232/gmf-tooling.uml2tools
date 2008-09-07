package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;


public class SegmentAnchorImpl implements SegmentAnchor {
	private DSegmentEditPart myOverlappingSegment;
	private PrimaryShapeEditPart myLeftAnchor;
	private PrimaryShapeEditPart myRightAnchor;
	private Rectangle mySegmentGlobalBounds;
	
	public DSegmentEditPart getOverlappingSegmentEditPart() {
		return myOverlappingSegment;
	}
	
	public PrimaryShapeEditPart getLeftAnchorEditPart() {
		return myLeftAnchor;
	}
	
	public PrimaryShapeEditPart getRightAnchorEditPart() {
		return myRightAnchor;
	}
	
	public DSegment getOverlappingSegment() {
		return (DSegment) (myOverlappingSegment == null ? null : myOverlappingSegment.resolveSemanticElement());
	}
	
	public DSegmentElement getLeftAnchor() {
		return (DSegmentElement) (myLeftAnchor == null ? null : myLeftAnchor.resolveSemanticElement());
	}
	
	public DSegmentElement getRightAnchor() {
		return (DSegmentElement) (myRightAnchor == null ? null : myRightAnchor.resolveSemanticElement());
	}
	
	public View getOverlappingSegmentView() {
		return (View) (myOverlappingSegment == null ? null : myOverlappingSegment.getNotationView());
	}
	
	public View getRightAnchorView() {
		return (View) (myRightAnchor == null ? null : myRightAnchor.getNotationView());
	}
	
	public Rectangle getOverlappingSegmentGlobalBounds() {
		return mySegmentGlobalBounds == null ? null : mySegmentGlobalBounds.getCopy();
	}
	
	public View getLeftAnchorView() {
		return (View) (myLeftAnchor == null ? null : myLeftAnchor.getNotationView());
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
	
	public void setSegmentGlobalBounds(Rectangle segmentGlobalBounds){
		mySegmentGlobalBounds = segmentGlobalBounds;
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
