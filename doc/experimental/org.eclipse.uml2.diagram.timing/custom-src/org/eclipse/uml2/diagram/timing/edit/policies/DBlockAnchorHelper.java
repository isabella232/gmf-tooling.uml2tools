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


public class DBlockAnchorHelper {
	private final DBlockEditPart myBlockEP;

	public DBlockAnchorHelper(DBlockEditPart blockEP){
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
					anchorData.setOverlappingSegment(nextSegment);
					anchorData.setSegmentGlobalBounds(nextSegmentGlobalBounds.getCopy());
					return true;
				}
			}
		}
		return false;
	}
	
	public void setupLeftAnchor(SegmentAnchorImpl anchorData, Point global){
		DSegmentEditPart segmentEP = anchorData.getOverlappingSegmentEditPart();
		if (segmentEP == null){
			return;
		}
		
		int bestCenterX = Integer.MIN_VALUE;
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
				if (anchorData.getLeftAnchorEditPart() == null || bestCenterX < nextCenterX){
					if (anchorData.getLeftAnchorEditPart() != null){
						debugOut("And its better than: " + anchorData.getLeftAnchorEditPart() + "\n\t" + bestCenterX);
					}
					anchorData.setLeftAnchor(nextCircle);
					bestCenterX = nextCenterX;
				} else {
					debugOut("Not that good, skipped");
				}
			}
		}
	}
	
	public void setupRightAnchor(SegmentAnchorImpl anchorData, Point global){
		DSegmentEditPart segmentEP = anchorData.getOverlappingSegmentEditPart();
		if (segmentEP == null){
			return;
		}
		
		int bestCenterX = Integer.MAX_VALUE;
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
				if (anchorData.getRightAnchorEditPart() == null || bestCenterX > nextCenterX){
					if (anchorData.getRightAnchorEditPart() != null){
						debugOut("And its better than: " + anchorData.getRightAnchorEditPart() + "\n\t" + bestCenterX);
					}
					anchorData.setRightAnchor(nextCircle);
					bestCenterX = nextCenterX;
				} else {
					debugOut("Not that good, skipped");
				}
			}
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
	
//	private Rectangle getSegmentBounds(DValueLineEditPart lineEP, DSegmentEditPart segmentEP){
//		DSegmentEditPart.SegmentFigure figure = segmentEP.getPrimaryShape();
//		Rectangle bounds = figure.getBounds();
//		return getConstraintFor(lineEP, bounds.getLocation(), bounds.getSize());
//	}
//	
//	private static Rectangle getConstraintFor(GraphicalEditPart containerEP, Point where, Dimension size) {
//		IFigure figure = containerEP.getContentPane();
//
//		where = where.getCopy();
//		figure.translateToRelative(where);
//		figure.translateFromParent(where);
//		where.translate(getLayoutOrigin(containerEP).getNegated());
//
//		if (size == null || size.isEmpty()){
//			return new Rectangle(where, DEFAULT_SIZE);
//		} else {
//			size = size.getCopy();
//			figure.translateToRelative(size);
//			figure.translateFromParent(size);	
//			return new Rectangle(where, size);
//		}
//	}
//	
//	private static Point getLayoutOrigin(GraphicalEditPart ep) {
//		IFigure layoutContainer = ep.getContentPane();
//		if (false == layoutContainer.getLayoutManager() instanceof XYLayout){
//			throw new IllegalStateException("XYLayout expected for ep: " + ep + ", actual: " + layoutContainer.getLayoutManager());
//		}
//		XYLayout xyLayout = (XYLayout)layoutContainer.getLayoutManager();
//		return xyLayout.getOrigin(layoutContainer);
//	}
//	private static final Dimension DEFAULT_SIZE = new Dimension(-1, -1);
	
}
