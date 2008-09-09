/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.timing.draw2d.layout;

import java.util.Iterator;
import java.util.ListIterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;

public abstract class AbstractOneDimensionLayout extends AbstractEditPartAwareXYLayout {
	public static int HORIZONTAL = 0;
	public static int VERTICAL = 1;

	private int stretchOrientation;

	protected abstract boolean shouldStretch(IFigure figure);
	
	public AbstractOneDimensionLayout() {
		this(HORIZONTAL);
	}
	
	public AbstractOneDimensionLayout(int orientation) {
		stretchOrientation = orientation;
	}
	
	public int getStretchOrientation() {
		return stretchOrientation;
	}
	
	@Override
	public void layout(IFigure parent) {
		Iterator<?> children = parent.getChildren().iterator();
		Dimension clientAreaSize = parent.getClientArea().getSize();
		Point offset = getOrigin(parent);
		IFigure f;
		while (children.hasNext()) {
			f = (IFigure)children.next();
			Rectangle bounds = (Rectangle)getConstraint(f);
			if (bounds == null) continue;

			if (bounds.width == -1 || bounds.height == -1) {
				Dimension preferredSize = f.getPreferredSize(bounds.width, bounds.height);
				bounds = bounds.getCopy();
				if (bounds.width == -1)
					bounds.width = preferredSize.width;
				if (bounds.height == -1)
					bounds.height = preferredSize.height;
			}
			
			if (shouldStretch(f)) {
				if (getStretchOrientation() == HORIZONTAL) {
					bounds.x = 0;
					bounds.width = clientAreaSize.width;
				} else {
					bounds.y = 0;
					bounds.height = clientAreaSize.height;
				}
			}
			
			bounds = bounds.getTranslated(offset);
			f.setBounds(bounds);
		}
	}
	
	protected Dimension calculatePreferredSize(IFigure f, int wHint, int hHint) {
		Rectangle rect = new Rectangle();
		ListIterator<?> children = f.getChildren().listIterator();
		while (children.hasNext()) {
			IFigure child = (IFigure)children.next();
			Rectangle r = (Rectangle)constraints.get(child);
			if (r == null)
				continue;
			
			if (r.width == -1 || r.height == -1) {
				Dimension preferredSize = child.getPreferredSize(r.width, r.height);
				r = r.getCopy();
				if (r.width == -1)
					r.width = preferredSize.width;
				if (r.height == -1)
					r.height = preferredSize.height;
			}
			
			if (shouldStretch(child)){
				r = r.getCopy();
				if (getStretchOrientation() == HORIZONTAL) {
					r.x = 0;
				} else {
					r.y = 0;
				}
			}
			rect.union(r);
		}
		Dimension d = rect.getSize();
		Insets insets = f.getInsets();
		return new Dimension(d.width + insets.getWidth(), d.height + insets.getHeight()).
			union(getBorderPreferredSize(f));
	}
	
}
