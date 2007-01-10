/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Yury Chernikov (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.draw2d;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gmf.runtime.diagram.ui.figures.NoteFigure;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;

public class ConstraintFigure extends NoteFigure {
	private WrapLabel myFixedLabel;
	private RectangleFigure myContentPane;

	public ConstraintFigure() {
		super(100, 60, new Insets());
		setLayoutManager(new BorderLayout());
		
		myFixedLabel = new WrapLabel("");
		myFixedLabel.setBorder(new MarginBorder(0, CLIP_MARGIN_DP + 1, 0, CLIP_MARGIN_DP + 1));
		add(myFixedLabel, BorderLayout.TOP);
		
		myContentPane = new RectangleFigure();
		myContentPane.setOutline(false);
		myContentPane.setFill(false);
		myContentPane.setLayoutManager(new StackLayout());
		add(myContentPane, BorderLayout.CENTER);
	}
	
	public RectangleFigure getContentPane(){
		return myContentPane;
	}
	
	public void setFixedLabelText(String text){
		myFixedLabel.setText(text == null ? "" : text);
	}

}
