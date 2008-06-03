/*
 * Copyright (c) 2007 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Sergey Gribovsky (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.draw2d;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;


public class BisectionBorderItemLocator extends BorderItemLocator {
	public BisectionBorderItemLocator(IFigure parentFigure) {
		super(parentFigure);
	}

	public BisectionBorderItemLocator(IFigure parentFigure, int preferredSide) {
		super(parentFigure, preferredSide);
	}

	public BisectionBorderItemLocator(IFigure borderItem, IFigure parentFigure, Rectangle constraint) {
		super(borderItem, parentFigure, constraint);
	}
	
	@Override
	public Rectangle getValidLocation(Rectangle proposedLocation, IFigure borderItem) {
		int side = findClosestSideOfParent(proposedLocation, getParentBorder());
		return getBisectionLocation(super.getValidLocation(proposedLocation, borderItem), side);
	}
	
	@Override
	public void relocate(IFigure borderItem) {
		super.relocate(borderItem);
		borderItem.setBounds(getBisectionLocation(borderItem.getBounds(), getCurrentSideOfParent()));
	}
	
	protected Rectangle getBisectionLocation(Rectangle location, int side) {
		Rectangle bisectingLocation = new Rectangle(location);
		
		switch (side) {
		case PositionConstants.WEST:
			bisectingLocation.x = bisectingLocation.x + bisectingLocation.width / 2;
			break;

		case PositionConstants.EAST:
			bisectingLocation.x = bisectingLocation.x - bisectingLocation.width / 2;
			break;

		case PositionConstants.NORTH:
			bisectingLocation.y = bisectingLocation.y + bisectingLocation.height / 2;
			break;

		case PositionConstants.SOUTH:
			bisectingLocation.y = bisectingLocation.y - bisectingLocation.height / 2;
			break;
		}
		
		return bisectingLocation;
	}
}
