package org.eclipse.uml2.diagram.timing.edit.policies;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEndEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentMiddlePointEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentStartEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineEditPart;
import org.eclipse.uml2.diagram.timing.edit.policies.SegmentAnchor.EditPartAndGlobalBounds;


public class SegmentAnchorHelper {
	private final DBlockEditPart myBlockEP;

	public SegmentAnchorHelper(DBlockEditPart blockEP){
		myBlockEP = blockEP;
	}
	
	public SegmentAnchor findSegmentAnchor(Point globalPoint){
		SegmentAnchorImpl result = new SegmentAnchorImpl();
		if (setupOverlappingSegment(result, globalPoint)){
			setupLeftAnchor(result, globalPoint);
			setupRightAnchor(result, globalPoint);
		}
		return result;
	}
	
	public boolean setupOverlappingSegment(SegmentAnchorImpl anchorData, Point globalPoint){
		List<DValueLineEditPart> lineEPs = collectChildEditParts(myBlockEP, DValueLineEditPart.class);
		for (DValueLineEditPart next : lineEPs){
			for (DSegmentEditPart nextSegment : collectChildEditParts(next, DSegmentEditPart.class)){
				IFigure segmentF = nextSegment.getPrimaryShape();
				Rectangle nextSegmentGlobalBounds = segmentF.getBounds().getCopy();
				segmentF.getParent().translateToAbsolute(nextSegmentGlobalBounds);
				if (nextSegmentGlobalBounds.x <= globalPoint.x && nextSegmentGlobalBounds.x + nextSegmentGlobalBounds.width >= globalPoint.x){
					anchorData.setOverlappingSegment(nextSegment, nextSegmentGlobalBounds.getCopy());
					return true;
				}
			}
		}
		return false;
	}
	
	public void setupLeftAnchor(SegmentAnchorImpl anchorData, Point global){
		if (anchorData.getOverlappingSegmentEditPartData() == null){
			return;
		}
		DSegmentEditPart segmentEP = anchorData.getOverlappingSegmentEditPartData().getEditPart();
		if (segmentEP == null){
			return;
		}
		
		int bestCenterX = Integer.MIN_VALUE;
		PrimaryShapeEditPart bestCircle = null;
		Rectangle bestBounds = null;
		List<PrimaryShapeEditPart> circles = new LinkedList<PrimaryShapeEditPart>();
		
		circles.addAll(collectChildEditParts(segmentEP, DSegmentStartEditPart.class));
		circles.addAll(collectChildEditParts(segmentEP, DSegmentMiddlePointEditPart.class));
		circles.addAll(collectChildEditParts(segmentEP, DSegmentEndEditPart.class));

		for (PrimaryShapeEditPart nextCircle : circles){
			IFigure figure = nextCircle.getPrimaryShape();
			Rectangle nextGlobalBounds = figure.getBounds().getCopy();
			figure.getParent().translateToAbsolute(nextGlobalBounds);
			
			int nextCenterX = nextGlobalBounds.x + nextGlobalBounds.width / 2; 
			if (nextCenterX <= global.x){
				debugOut("Circle at the left found: " + nextCircle + "\n\t " + nextCenterX);
				if (bestCircle == null || bestCenterX < nextCenterX){
					if (bestCircle != null){
						debugOut("And its better than: " + bestCircle + "\n\t" + bestCenterX);
					}
					bestCircle = nextCircle;
					bestCenterX = nextCenterX;
					if (bestBounds == null){
						bestBounds = new Rectangle();
					}
					bestBounds.setBounds(nextGlobalBounds);
				} else {
					debugOut("Not that good, skipped");
				}
			}
		}
		if (bestCircle != null){
			anchorData.setLeftAnchor(new EditPartAndGlobalBounds<PrimaryShapeEditPart>(bestCircle, bestBounds));
		}
	}
	
	public void setupRightAnchor(SegmentAnchorImpl anchorData, Point global){
		EditPartAndGlobalBounds<DSegmentEditPart> segmentData = anchorData.getOverlappingSegmentEditPartData();
		if (segmentData == null){
			return;
		}
		DSegmentEditPart segmentEP = segmentData.getEditPart();
		
		int bestCenterX = Integer.MAX_VALUE;
		PrimaryShapeEditPart bestCircle = null;
		Rectangle bestBounds = null;
		List<PrimaryShapeEditPart> circles = new LinkedList<PrimaryShapeEditPart>();
		
		circles.addAll(collectChildEditParts(segmentEP, DSegmentStartEditPart.class));
		circles.addAll(collectChildEditParts(segmentEP, DSegmentMiddlePointEditPart.class));
		circles.addAll(collectChildEditParts(segmentEP, DSegmentEndEditPart.class));

		for (PrimaryShapeEditPart nextCircle : circles){
			IFigure figure = nextCircle.getPrimaryShape();
			Rectangle nextGlobalBounds = figure.getBounds().getCopy();
			figure.getParent().translateToAbsolute(nextGlobalBounds);
			
			int nextCenterX = nextGlobalBounds.x + nextGlobalBounds.width / 2; 
			if (nextCenterX >= global.x){
				debugOut("Circle at the right found: " + nextCircle + "\n\t " + nextCenterX);
				if (bestCircle == null || bestCenterX > nextCenterX){
					if (bestCircle != null){
						debugOut("And its better than: " + bestCircle + "\n\t" + bestCenterX);
					}
					bestCircle = nextCircle;
					bestCenterX = nextCenterX;
					if (bestBounds == null){
						bestBounds = new Rectangle();
					}
					bestBounds.setBounds(nextGlobalBounds);
				} else {
					debugOut("Not that good, skipped");
				}
			}
		}

		if (bestCircle != null){
			anchorData.setRightAnchor(new EditPartAndGlobalBounds<PrimaryShapeEditPart>(bestCircle, bestBounds));
		}
	}

	private static <T extends EditPart> List<T> collectChildEditParts(EditPart parent, Class<T> clazz){
		List<T> result = new LinkedList<T>();
		for (Object next : parent.getChildren()){
			if (clazz.isInstance(next)){
				result.add(clazz.cast(next));
			}
		}
		return result;
	}
	
	private void debugOut(String s){
		//System.err.println(s);
	}
	
}
