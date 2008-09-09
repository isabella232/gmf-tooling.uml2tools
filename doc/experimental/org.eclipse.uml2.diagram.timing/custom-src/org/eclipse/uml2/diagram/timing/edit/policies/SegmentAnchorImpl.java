package org.eclipse.uml2.diagram.timing.edit.policies;

import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;


public class SegmentAnchorImpl implements SegmentAnchor {
	private EditPartAndGlobalBounds<DSegmentEditPart> myOverlappingSegment;
	private EditPartAndGlobalBounds<PrimaryShapeEditPart> myLeftAnchor;
	private EditPartAndGlobalBounds<PrimaryShapeEditPart> myRightAnchor;
	
	public void setLeftAnchor(EditPartAndGlobalBounds<PrimaryShapeEditPart> leftAnchorD) {
		myLeftAnchor = leftAnchorD;
	}
	
	public void setLeftAnchor(PrimaryShapeEditPart ep, Rectangle globalBounds) {
		setLeftAnchor(new EditPartAndGlobalBounds<PrimaryShapeEditPart>(ep, globalBounds));
	}
	
	public void setOverlappingSegment(DSegmentEditPart ep, Rectangle globalBounds) {
		setOverlappingSegment(new EditPartAndGlobalBounds<DSegmentEditPart>(ep, globalBounds));
	}
	
	public void setRightAnchor(PrimaryShapeEditPart ep, Rectangle globalBounds) {
		setRightAnchor(new EditPartAndGlobalBounds<PrimaryShapeEditPart>(ep, globalBounds));
	}
	
	public void setOverlappingSegment(EditPartAndGlobalBounds<DSegmentEditPart> overlappingSegmentD) {
		myOverlappingSegment = overlappingSegmentD;
	}
	
	public void setRightAnchor(EditPartAndGlobalBounds<PrimaryShapeEditPart> rightAnchorD) {
		myRightAnchor = rightAnchorD;
	}
	
	public EditPartAndGlobalBounds<PrimaryShapeEditPart> getLeftAnchorEditPartData() {
		return myLeftAnchor;
	}
	
	public EditPartAndGlobalBounds<DSegmentEditPart> getOverlappingSegmentEditPartData() {
		return myOverlappingSegment;
	}
	
	public EditPartAndGlobalBounds<PrimaryShapeEditPart> getRightAnchorEditPartData() {
		return myRightAnchor;
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
	
	private static <T extends IGraphicalEditPart> String asDebugString(EditPartAndGlobalBounds<T> epd){
		if (epd == null){
			return "null";
		}
		IGraphicalEditPart ep = epd.getEditPart();
		
		StringBuffer result = new StringBuffer();
		result.append(ep);
		
		EObject semantic = ep.resolveSemanticElement();
		if (semantic instanceof DSegmentElement){
			result.append("\n\t\t[").append(semantic).append("]");
		}
		return result.toString();
	}
}
