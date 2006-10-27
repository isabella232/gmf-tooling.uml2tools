/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Michael Golubev (Borland) - initial API and implementation
 */

package org.eclipse.uml2.diagram.common.draw2d;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.uml.AggregationKind;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

public class AssociationDecoration extends PolygonDecoration {
	private static final PointList RHOMB = new PointList(new int[] { //
			//
					-1, 1, // 
					0, 0, //
					-1, -1, //
					-2, 0, //
					-1, 1, //
			});

	/**
	 * XXX: navigability arrows and owner-dot decorations are not implemented yet
	 */
	private static final PointList ARROW = new PointList(new int[] { //
			//
					-1, 1, // 
					0, 0, //
					-1, -1, //
					0, 0, // 
					-1, 1, //
			});

	public AssociationDecoration() {
		setTemplate(RHOMB.getCopy());
		setScale(7, 3);
		setVisible(false);
		setFill(true);
	}

	public void update(AggregationKind kind) {
		if (kind == AggregationKind.COMPOSITE_LITERAL) {
			setVisible(true);
			if (getParent() != null && getParent().getForegroundColor() != null){
				setBackgroundColor(getParent().getForegroundColor());	
			}
		} else if (kind == AggregationKind.SHARED_LITERAL) {
			setVisible(true);
			setBackgroundColor(ColorConstants.white);
		} else {
			setVisible(false);
		}
	}
	
	public void update(Association association, Property associationEnd) {
		update(associationEnd.getAggregation());
	}

}
