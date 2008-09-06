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

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.uml2.diagram.timing.draw2d.SegmentShape;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEndEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentMiddlePointEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentStartEditPart;

public class SegmentLayout extends AbstractEditPartAwareXYLayout {
	@Override
	public void layout(IFigure parent) {
		Iterator<?> children = parent.getChildren().iterator();
		Dimension clientAreaSize = parent.getClientArea().getSize();
		if (clientAreaSize.width == -1){
			return;
		}
		Point offset = getOrigin(parent);
		IFigure f;
		
		while (children.hasNext()) {
			f = (IFigure)children.next();
			
			Rectangle bounds = (Rectangle)getConstraint(f);

			EditPart editPart = findEditPart(f); 
			if (editPart instanceof DSegmentStartEditPart){
				bounds = new Rectangle(0, 0, SegmentShape.CIRCLE_RADIUS * 2, SegmentShape.CIRCLE_RADIUS * 2);
			} 
			if (editPart instanceof DSegmentEndEditPart){
				bounds = new Rectangle(clientAreaSize.width - SegmentShape.CIRCLE_RADIUS * 2, 0, SegmentShape.CIRCLE_RADIUS * 2, SegmentShape.CIRCLE_RADIUS * 2);
			} 
			
			if (bounds == null) {
				continue;
			}

			bounds = bounds.getCopy();
			if (editPart instanceof DSegmentMiddlePointEditPart){
				bounds.width = SegmentShape.CIRCLE_RADIUS * 2; 
				bounds.height = SegmentShape.CIRCLE_RADIUS * 2;
			} else if (bounds.height == -1 || bounds.width == -1){
				Dimension preferredSize = f.getPreferredSize(bounds.width, bounds.height);
				if (bounds.height == -1){
					bounds.height = preferredSize.height;
				}
				if (bounds.width == -1){
					bounds.width = preferredSize.width;
				}
			}
			
			bounds.y = clientAreaSize.height / 2 - bounds.height / 2;
			bounds = bounds.getTranslated(offset);
			
//			System.err.println("Bounds for : " + editPart + " = " + bounds);
			
			f.setBounds(bounds);
		}
	}

}
