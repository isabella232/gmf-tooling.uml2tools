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
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;

public class ValueLineLayout extends AbstractEditPartAwareXYLayout {
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
			
			bounds = bounds.getCopy();
			
			if (bounds.height == -1 || bounds.width == -1){
				Dimension preferredSize = f.getPreferredSize(bounds.width, bounds.height);
				if (bounds.height == -1){
					bounds.height = preferredSize.height;
				}
				if (bounds.width == -1){
					bounds.width = preferredSize.width;
				}
			} 
			
			if (bounds.height > clientAreaSize.height){
				bounds.height = clientAreaSize.height;
			}
			
			bounds.y = clientAreaSize.height / 2 - bounds.height / 2;

			if (shouldStretch(f)) {
				bounds.width = clientAreaSize.width - bounds.x;
			}
			
			bounds = bounds.getTranslated(offset);
			f.setBounds(bounds);
		}
	}

	private boolean shouldStretch(IFigure f) {
		EditPart editPart = findEditPart(f);
		if (editPart instanceof DSegmentEditPart){
			DSegmentEditPart segmentEditPart = (DSegmentEditPart)editPart;
			EObject element = segmentEditPart.resolveSemanticElement();
			if (element instanceof DSegment){
				DSegment segment = (DSegment)element;
				return !segment.isClosedSegment();
			}
		}
		return false;
	}

}
