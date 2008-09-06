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

import java.util.Map;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.XYLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartViewer;

public abstract class AbstractEditPartAwareXYLayout extends XYLayout {
	private Map<?,?> visualPartMap;

	public final void setViewer(EditPartViewer viewer) {
		visualPartMap = viewer.getVisualPartMap();
	}
	
	protected final Map<?, ?> getVisualPartMap(){
		return visualPartMap;
	}
	
	protected final EditPart findEditPart(IFigure figure){
		return visualPartMap == null ? null : (EditPart) visualPartMap.get(figure); 
	}
}
