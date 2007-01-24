/*
 * Copyright (c) 2006 Borland Software Corporation
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

import java.util.List;

import org.eclipse.draw2d.FreeformFigure;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemsAwareFreeFormLayer;

/**
 * Freeform layer that expands children to cover client area of the figure at whole.
 */
public class CoveredFreeformLayer extends BorderItemsAwareFreeFormLayer {
	public Rectangle getFreeformExtent() {
        if (myFreeformExtent != null) {
            return myFreeformExtent;
        }
		
		List children = getChildren();
		for (int i = 0; i < children.size(); i++) {
			IFigure child = (IFigure) children.get(i);
			Rectangle childBounds;
			if (child instanceof FreeformFigure) {
				childBounds = ((FreeformFigure) child).getFreeformExtent();
			} else {
				Dimension size = child.getPreferredSize().getCopy();
				size.width += getMarginInsets().getWidth();
				size.height += getMarginInsets().getHeight();
				childBounds = new Rectangle(0, 0, size.width, size.height);
			}
			if (myFreeformExtent == null) {
				myFreeformExtent = childBounds.getCopy();
			} else {
				myFreeformExtent.union(childBounds);
			}
		}
		Insets insets = getInsets();
		if (myFreeformExtent == null) {
			myFreeformExtent = new Rectangle(0, 0, insets.getWidth(), insets.getHeight());
		} else {
			translateToParent(myFreeformExtent);
			myFreeformExtent.expand(insets);
		}
		return myFreeformExtent;
	}

	public void setFreeformBounds(Rectangle bounds) {
		setBounds(bounds);
		bounds = bounds.getCopy();
		translateFromParent(bounds);
		List children = getChildren();
		for (int i = 0; i < children.size(); i++) {
			IFigure child = (IFigure) children.get(i);
			if (child instanceof FreeformFigure) {
				((FreeformFigure) child).setFreeformBounds(bounds);
			} else {
		        Insets insets = getMarginInsets();
		        int x = insets.left;
		        int y = insets.top;
		        
		        Dimension size = bounds.getSize().getCopy().shrink(insets.getWidth(), insets.getHeight());

		        final Rectangle childBounds = new Rectangle(x, y, size.width, size.height);           
		        child.setBounds(childBounds);
			}
		}
	}
	
	@Override
	public void setBounds(Rectangle rect) {
		super.setBounds(rect);
		myMarginInsets = null;
	}
	
	@Override
	public void invalidate() {
		super.invalidate();
		myFreeformExtent = null;
	}

	public final Insets getMarginInsets() {
		if (myMarginInsets == null) {
			Rectangle bounds = getBounds();
			int widthMarginInset = (int) (bounds.width * myMarginRatio);
			int heightMarginInset = (int) (bounds.height * myMarginRatio);
			myMarginInsets = new Insets(heightMarginInset, widthMarginInset, heightMarginInset, widthMarginInset);
		}
		return myMarginInsets;
	}

	public void setMarginRatio(double margin) {
		myMarginRatio = margin;
	}
	
	private Rectangle myFreeformExtent;
	private Insets myMarginInsets;
	private double myMarginRatio = 0.1;
}
