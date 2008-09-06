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

import org.eclipse.draw2d.IFigure;
import org.eclipse.gef.EditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DValueLineEditPart;

public class TimeLineLayout extends AbstractOneDimensionLayout {
	public TimeLineLayout() {
		super(HORIZONTAL);
	}
	
	public TimeLineLayout(int orientation) {
		super(orientation);
	}
	
	@Override
	protected boolean shouldStretch(IFigure figure) {
		EditPart editPart = findEditPart(figure); 
		return editPart instanceof DValueLineEditPart;
	}
}
