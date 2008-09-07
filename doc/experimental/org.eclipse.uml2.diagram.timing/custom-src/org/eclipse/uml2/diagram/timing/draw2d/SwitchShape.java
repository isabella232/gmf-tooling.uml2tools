package org.eclipse.uml2.diagram.timing.draw2d;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;


public class SwitchShape extends PolylineConnectionEx {
	public SwitchShape(){
		setFill(true);
		setLineWidth(10);
	}
	
	@Override
	protected void outlineShape(Graphics g) {
		g.pushState();
		super.outlineShape(g);

		int oldLineWidth = getLineWidth();
		g.setLineWidth(oldLineWidth - 2);
		g.setForegroundColor(getBackgroundColor());
		super.outlineShape(g);
		g.popState();
	}
	
	@Override
	protected void fillShape(Graphics g) {
        PointList displayPoints = getSmoothPoints();
        g.pushState();
        g.setBackgroundColor(getBackgroundColor());
        g.fillPolygon(displayPoints);
        g.popState();
	}
}
