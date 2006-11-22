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

import org.eclipse.draw2d.AbstractHintLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.draw2d.geometry.Transposer;

public class LaneLayout extends AbstractHintLayout {
	public static int HORIZONTAL = 0;
	public static int VERTICAL = 1;
	
	public LaneLayout() {
		this(HORIZONTAL);
	}

	public LaneLayout(int laneOrientation) {
		transposer = new Transposer();
		setLaneOrientation(laneOrientation);
	}

	public void setLaneOrientation(int orientation) {
		if (orientation != HORIZONTAL && orientation != VERTICAL) {
			throw new IllegalArgumentException("Incorrect lane orientation constant: " + orientation);
		}
		transposer.setEnabled(orientation == VERTICAL);
		laneOrientation = orientation;
	}

	public int getLaneOrientation() {
		return laneOrientation;
	}
	
	@Override
	protected Dimension calculateMinimumSize(IFigure container, int wHint, int hHint) {
		List children = container.getChildren();
		Dimension result = calculateChildrenSize(children, wHint, hHint, false);
		return result;
	}

	@Override
	protected Dimension calculatePreferredSize(IFigure container, int wHint, int hHint) {
		List children = container.getChildren();
		Dimension result = calculateChildrenSize(children, wHint, hHint, true);
		return result;
	}

	public void layout(IFigure container) {
        List children = container.getChildren();
		int numChildren = children.size();
        if (numChildren > 0) {
			Dimension prefSizes[] = new Dimension[numChildren];
			Dimension minSizes[] = new Dimension[numChildren];

			int wHint = getLaneOrientation() == HORIZONTAL ? container.getClientArea(Rectangle.SINGLETON).width : -1;
			int hHint = getLaneOrientation() == VERTICAL ? container.getClientArea(Rectangle.SINGLETON).height : -1;

			int totalPrefHeight = 0;

			for (int i = 0; i < numChildren; i++) {
				IFigure child = (IFigure) children.get(i);

				prefSizes[i] = transposer.t(child.getPreferredSize(wHint, hHint));
				minSizes[i] = transposer.t(child.getMinimumSize(wHint, hHint));

				totalPrefHeight += prefSizes[i].height;
			}

			Rectangle clientArea = transposer.t(container.getClientArea());
			int expansion = totalPrefHeight < clientArea.height ? (clientArea.height - totalPrefHeight) / children.size() : 0;

			int x = clientArea.x;
			int y = clientArea.y;
			for (int i = 0; i < numChildren; i++) {
				int prefHeight = prefSizes[i].height;
				int prefWidth = prefSizes[i].width;
				int minWidth = minSizes[i].width;
				Rectangle newBounds = new Rectangle(x, y, prefWidth, prefHeight);

				IFigure child = (IFigure) children.get(i);
				newBounds.width = Math.max(minWidth, clientArea.width);
				newBounds.height += expansion;
				child.setBounds(transposer.t(newBounds));

				y += newBounds.height;
			}
		}
	}

	private Dimension calculateChildrenSize(List children, int wHint, int hHint, boolean preferred) {
		int childWHint = getLaneOrientation() == HORIZONTAL ? wHint : (wHint > 0 ? wHint / children.size() : wHint);
		int childHHint = getLaneOrientation() == VERTICAL ? hHint : (hHint > 0 ? hHint / children.size() : hHint);

		int height = 0, width = 0;
		for (int i = 0; i < children.size(); i++) {
			IFigure child = (IFigure) children.get(i);
			Dimension childSize = transposer.t(preferred ? child.getPreferredSize(childWHint, childHHint) : 
				child.getMinimumSize(childWHint, childHHint));
			height += childSize.height;
			width = Math.max(width, childSize.width);
		}
		return transposer.t(new Dimension(width, height));
	}

	private int laneOrientation;

	// Transposer object used in layout calculations
	private Transposer transposer;
}
