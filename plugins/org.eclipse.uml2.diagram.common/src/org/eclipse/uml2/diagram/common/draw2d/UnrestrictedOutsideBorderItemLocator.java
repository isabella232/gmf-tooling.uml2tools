package org.eclipse.uml2.diagram.common.draw2d;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

public class UnrestrictedOutsideBorderItemLocator implements IBorderItemLocator {

	private IFigure parentFigure = null;

	private Rectangle constraint = new Rectangle(0, 0, 0, 0);

	private static final int VERTICAL_OFFSET = 6;

	public UnrestrictedOutsideBorderItemLocator(IFigure parentFigure) {
		this.parentFigure = parentFigure;
	}

	public int getCurrentSideOfParent() {
		return PositionConstants.SOUTH;
	}

	public Rectangle getValidLocation(Rectangle proposedLocation, IFigure borderItem) {
		return new Rectangle(locateOutsideBorder(proposedLocation), proposedLocation.getSize());
	}

	public void setConstraint(Rectangle constraint) {
		this.constraint = constraint;
	}

	private Rectangle getConstraint() {
		return constraint;
	}

	private IFigure getParentFigure() {
		return parentFigure;
	}

	public void relocate(IFigure borderItem) {
		Dimension size = getSize(borderItem);
		Point ptNewLocation = getPreferredLocation(borderItem);
		ptNewLocation = locateOutsideBorder(new Rectangle(ptNewLocation, size));
		borderItem.setBounds(new Rectangle(ptNewLocation, size));
	}

	private final Dimension getSize(IFigure borderItem) {
		Dimension size = getConstraint().getSize();
		if (size.isEmpty()) {
			size = borderItem.getPreferredSize();
		}
		return size;
	}

	private Point getPreferredLocation(IFigure borderItem) {
		Point constraintLocation = getConstraint().getLocation();
		Point parentOrigin = getParentBorder().getTopLeft();
		Point ptAbsoluteLocation = parentOrigin.translate(constraintLocation);
		return ptAbsoluteLocation;
	}

	private Rectangle getParentBorder() {
		Rectangle bounds = getParentFigure().getBounds().getCopy();
		if (getParentFigure() instanceof NodeFigure) {
			bounds = ((NodeFigure) getParentFigure()).getHandleBounds().getCopy();
		}
		return bounds;
	}

	private Point locateOutsideBorder(Rectangle proposedRectangle) {
		Rectangle parentRectangle = getParentBorder();
		if (parentRectangle.intersects(proposedRectangle)) {

			int y = parentRectangle.y + parentRectangle.height + VERTICAL_OFFSET;

			int x = parentRectangle.x + (parentRectangle.width - proposedRectangle.width) / 2;

			return new Point(x, y);
		}
		return proposedRectangle.getLocation();
	}
}
