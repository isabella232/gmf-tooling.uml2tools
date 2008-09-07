package org.eclipse.uml2.diagram.timing.draw2d;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.uml2.diagram.timing.draw2d.layout.SegmentLayout;


public class SegmentShape extends RectangleFigure implements SegmentGeometry {
	private SegmentLayout mySegmentLayout;
	
	public SegmentShape(){
		Dimension size = new Dimension(-1, 2 * CIRCLE_RADIUS + 2);
		setPreferredSize(size.getCopy());
		setMinimumSize(size.getCopy());
		setMaximumSize(size.getCopy());
		
		mySegmentLayout = new SegmentLayout();
		setLayoutManager(mySegmentLayout);
		
		setForegroundColor(ColorConstants.red);
	}
	
	public void setViewer(EditPartViewer viewer){
		mySegmentLayout.setViewer(viewer);
	}
	
	public RectangleFigure getSegmentContents() {
		return this;
	}
	
	@Override
	protected void outlineShape(Graphics graphics) {
		Rectangle r = getBounds();
		int x = r.x + lineWidth / 2;
		int y = r.y + lineWidth / 2;
		int w = r.width - Math.max(1, lineWidth);
		int h = r.height - Math.max(1, lineWidth);
		
		graphics.pushState();
		graphics.setForegroundColor(ColorConstants.red);
		graphics.drawRectangle(x + CIRCLE_RADIUS, y + LEDGE, w - 2 * CIRCLE_RADIUS, h - 2 * LEDGE);
		graphics.popState();
	}
	
	@Override
	protected void fillShape(Graphics graphics) {
		Rectangle r = getBounds();
		int x = r.x + lineWidth / 2;
		int y = r.y + lineWidth / 2;
		int w = r.width - Math.max(1, lineWidth);
		int h = r.height - Math.max(1, lineWidth);
		
		graphics.pushState();
		graphics.setBackgroundColor(ColorConstants.yellow);
		graphics.fillRectangle(x + CIRCLE_RADIUS, y + LEDGE, w - 2 * CIRCLE_RADIUS, h - 2 * LEDGE);
		graphics.popState();
	}
	
}
