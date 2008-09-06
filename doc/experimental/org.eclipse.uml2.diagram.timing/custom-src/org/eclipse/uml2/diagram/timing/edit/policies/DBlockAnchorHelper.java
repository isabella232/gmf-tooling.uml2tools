package org.eclipse.uml2.diagram.timing.edit.policies;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DBlockEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineEditPart;


public class DBlockAnchorHelper {
	private static final Dimension DEFAULT_SIZE = new Dimension(-1, -1);
	private final DBlockEditPart myBlockEP;

	public DBlockAnchorHelper(DBlockEditPart blockEP){
		myBlockEP = blockEP;
	}
	
	public DSegmentEditPart findSegmentForGlobalPoint(Point globalPoint){
//		System.out.println("AnchorHelper.findSegmentFor(): global point = " + globalPoint);
		List<DValueLineEditPart> lineEPs = collectChildEditParts(myBlockEP, DValueLineEditPart.class);
		for (DValueLineEditPart next : lineEPs){
			for (DSegmentEditPart nextSegment : collectChildEditParts(next, DSegmentEditPart.class)){
				IFigure segmentF = nextSegment.getPrimaryShape();
				Rectangle nextSegmentGlobalBounds = segmentF.getBounds().getCopy();
				segmentF.getParent().translateToAbsolute(nextSegmentGlobalBounds);
//				System.out.println("\t: nextSegment global bounds" + nextSegmentGlobalBounds);
				if (nextSegmentGlobalBounds.x <= globalPoint.x && nextSegmentGlobalBounds.x + nextSegmentGlobalBounds.width >= globalPoint.x){
					return nextSegment;
				}
			}
		}
		return null;
	}
	
	private Rectangle getSegmentBounds(DValueLineEditPart lineEP, DSegmentEditPart segmentEP){
		DSegmentEditPart.SegmentFigure figure = segmentEP.getPrimaryShape();
		Rectangle bounds = figure.getBounds();
		return getConstraintFor(lineEP, bounds.getLocation(), bounds.getSize());
		
		
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
	
	protected static Rectangle getConstraintFor(GraphicalEditPart containerEP, Point where, Dimension size) {
		IFigure figure = containerEP.getContentPane();

		where = where.getCopy();
		figure.translateToRelative(where);
		figure.translateFromParent(where);
		where.translate(getLayoutOrigin(containerEP).getNegated());

		if (size == null || size.isEmpty()){
			return new Rectangle(where, DEFAULT_SIZE);
		} else {
			size = size.getCopy();
			figure.translateToRelative(size);
			figure.translateFromParent(size);	
			return new Rectangle(where, size);
		}
	}
	
	protected static Point getLayoutOrigin(GraphicalEditPart ep) {
		IFigure layoutContainer = ep.getContentPane();
		if (false == layoutContainer.getLayoutManager() instanceof XYLayout){
			throw new IllegalStateException("XYLayout expected for ep: " + ep + ", actual: " + layoutContainer.getLayoutManager());
		}
		XYLayout xyLayout = (XYLayout)layoutContainer.getLayoutManager();
		return xyLayout.getOrigin(layoutContainer);
	}
	
	
	
	
}
