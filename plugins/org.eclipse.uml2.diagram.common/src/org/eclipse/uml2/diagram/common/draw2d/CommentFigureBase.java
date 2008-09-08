/*
 * Copyright (c) 2008 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.draw2d;

import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gmf.runtime.diagram.ui.figures.NoteFigure;

public class CommentFigureBase extends NoteFigure {
	public CommentFigureBase() {
		this(100, 65, new Insets());
	}
	
	public CommentFigureBase(int width, int height, Insets insets){
		super(width, height, insets);
	}
}
