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

import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gmf.runtime.diagram.ui.figures.NoteFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;

public class CommentFigureBase extends NoteFigure {
	private WrappingLabel myBody;

	public CommentFigureBase() {
		this(100, 65, new Insets());
	}

	public CommentFigureBase(int width, int height, Insets insets) {
		super(width, height, insets);
		myBody = new WrappingLabel();
		myBody.setBorder(new MarginBorder(5, 5, 5, 14));
		add(myBody);
	}
	
	public WrappingLabel getBodyLabel(){
		return myBody;
	}
	
	protected void setTextLabelWrap(boolean wrap){
		getBodyLabel().setTextWrap(wrap);
	}
	
}
