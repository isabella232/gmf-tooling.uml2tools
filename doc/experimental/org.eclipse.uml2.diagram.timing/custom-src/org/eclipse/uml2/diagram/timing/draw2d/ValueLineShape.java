package org.eclipse.uml2.diagram.timing.draw2d;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPartViewer;
import org.eclipse.uml2.diagram.timing.draw2d.layout.ValueLineLayout;


public class ValueLineShape extends RectangleFigure {
	public static final int LABEL_PREFERRED_WIDTH = 80;
	public static final int SPACING = 25;
	
	private Label myNameLabel;
	private Tail myTail;
	
	public ValueLineShape(){
		BorderLayout layout = new BorderLayout();
		layout.setHorizontalSpacing(SPACING);
		setLayoutManager(layout);
		
		myNameLabel = addLabel();
		myTail = addTail();
		
		setLabelPreferredWidth(LABEL_PREFERRED_WIDTH);
	}
	
	public void setViewer(EditPartViewer viewer){
		myTail.setViewer(viewer);
	}
	
	private Label addLabel(){
		Label result = new Label();
		result.setBorder(new MarginBorder(5, 5, 5, 5));
		this.add(result, BorderLayout.LEFT);
		return result;
	}
	
	private Tail addTail(){
		Tail result = new Tail();
		result.setBorder(new MarginBorder(0, 0, 0, 15));
		result.setShowTail(true);
		this.add(result, BorderLayout.CENTER);
		return result;
	}
	
	public Label getNameLabel() {
		return myNameLabel;
	}
	
	public Tail getTail() {
		return myTail;
	}
	
	public void setLabelPreferredWidth(int width){
		myNameLabel.setPreferredSize(width, -1);
	}
	
	public static class Tail extends RectangleFigure {
		private final Rectangle TEMP = new Rectangle();
		private boolean myShowTail = true;
		private int myEndGap;
		private ValueLineLayout myLayout;
		
		public Tail(){
	        setOpaque(false);
	        setFill(false);
	        setLineStyle(Graphics.LINE_DASH);
	        setEndGap(15);
	        myLayout = new ValueLineLayout();
	        setLayoutManager(myLayout);
		}
		
		public void setEndGap(int gap){
			myEndGap = gap;
			requestRepaint();
		}
		
		private void setViewer(EditPartViewer viewer){
			myLayout.setViewer(viewer);
		}	
		
		@Override
		protected void outlineShape(Graphics graphics) {
			TEMP.setBounds(getBounds());
			int centerY = TEMP.y + TEMP.height / 2;
			graphics.drawLine(TEMP.x, centerY, Math.max(TEMP.x + TEMP.width - myEndGap, TEMP.x), centerY);
		}
		
		
		public void setShowTail(boolean showTail) {
			if (myShowTail != showTail){
				myShowTail = showTail;
				requestRepaint();
			}
		}
		
		private void requestRepaint(){
			if (getParent() != null){
				repaint();
			}
		}
	}
	
}
