package org.eclipse.uml2.diagram.timing.draw2d;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Ellipse;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.XYLayout;


public class SegmentShape extends RectangleFigure {
	private Ellipse left;
	private Ellipse right;
	private Shape contents;
	
	public SegmentShape(){
		setLayoutManager(new BorderLayout());
		setForegroundColor(ColorConstants.red);
		
		left = new Ellipse();
		right = new Ellipse();
		
		left.setSize(14, 14);
		right.setSize(14, 14);
		
		contents = new RectangleFigure();
		contents.setPreferredSize(-1, 10);
		contents.setLayoutManager(new XYLayout());
		
		add(left, BorderLayout.LEFT);
		add(right, BorderLayout.RIGHT);
		add(contents, BorderLayout.CENTER);
	}
	
	
	public Shape getContents() {
		return contents;
	}
	
	
	public Ellipse getLeftEllipse() {
		return left;
	}
	
	
	public Ellipse getRightEllipse() {
		return right;
	}
	
}
