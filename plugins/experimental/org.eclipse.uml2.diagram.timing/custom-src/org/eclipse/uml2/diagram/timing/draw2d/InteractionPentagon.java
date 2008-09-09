package org.eclipse.uml2.diagram.timing.draw2d;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.swt.graphics.Image;
import org.eclipse.uml2.diagram.common.draw2d.FillingBorderLayout;
import org.eclipse.uml2.diagram.timing.part.TimingDDiagramEditorPlugin;


public class InteractionPentagon extends Shape {
    public static final int BIT_SIZE = 5;
    
    public InteractionPentagon () {
    	setFont(TimingDDiagramEditorPlugin.getInstance().getDefaultFont());
        setLayoutManager(new FillingBorderLayout());
    }
    
    protected void fillShape(Graphics graphics) {
        graphics.fillPolygon(getPoints(getOutlineBounds(this)));
    }

    protected void outlineShape(Graphics graphics) {
        graphics.drawPolygon(getPoints(getOutlineBounds(this)));
    }

    /**
     * Text label to be shown in the pentagon
     */
    public void setContent(IFigure content) {
        content.setBorder(new MarginBorder(0, BIT_SIZE, 2, BIT_SIZE));
        add(content, FillingBorderLayout.CENTER);
        updateToPreferredSize();
    }
    
    public void updateToPreferredSize(){
    	setSize(getPreferredSize());
    }
    
    protected PointList getPoints(Rectangle rect) {           
        PointList points = new PointList(6);
        
        points.addPoint(rect.x, rect.y);
        points.addPoint(rect.x + rect.width, rect.y);
        if (BIT_SIZE > rect.height || BIT_SIZE > rect.width) {
            points.addPoint(rect.x + rect.width, rect.y + rect.height);
            //assert false;
        } else {
            points.addPoint(rect.x + rect.width, rect.y + rect.height - BIT_SIZE);
            points.addPoint(rect.x + rect.width - BIT_SIZE, rect.y + rect.height);
        }
        points.addPoint(rect.x, rect.y + rect.height);
        points.addPoint(rect.x, rect.y);//XXX: if ShapedPolygon.outlineShape(Graphics graphics) called drawPolygon but not drawPolyline it would be useless point
        
        return points;
    }
    
    
    //LMVisibleFrameWithPentagon.PentagonLayouter methods
    public int getPreferredWidth() {
        return getPreferredSize().width;
    }

    public int getPreferredHeight() {
        return getPreferredSize().height;
    }

    public void setX(int x) {
        Rectangle bounds = getBounds().getCopy();
        bounds.x = x;
        setBounds(bounds);
    }

    public void setY(int y) {
        Rectangle bounds = getBounds().getCopy();
        bounds.y = y;
        setBounds(bounds);
    }
    
    public Label createPentagonLabel(){
    	return new Label(){
    		@Override
    		public void setText(String s) {
    			super.setText(s);
    			InteractionPentagon.this.updateToPreferredSize();
    		}
    		
    		@Override
    		public void setIcon(Image image) {
    			super.setIcon(image);
    			InteractionPentagon.this.updateToPreferredSize();
    		}
    	};
    }
    
	private static Rectangle getOutlineBounds(Shape shape) {
		Rectangle b = new Rectangle(shape.getBounds());
		final int lineWidth = shape.getLineWidth();
		final int lineOffset = lineWidth / 2;
		b.x += lineOffset;
		b.y += lineOffset;
		b.width -= lineWidth;
		b.height -= lineWidth;
		return b;
	}
}
