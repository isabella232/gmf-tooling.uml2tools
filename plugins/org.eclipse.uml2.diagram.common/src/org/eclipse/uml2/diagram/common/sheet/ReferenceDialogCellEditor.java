/*
 * Copyright (c) 2006 Borland Software Corporation
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Tatiana Fesenko (Borland) - initial API and implementation
 */
package org.eclipse.uml2.diagram.common.sheet;

import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.uml2.diagram.common.sheet.chooser.ReferencedElementChooserDialog;

public class ReferenceDialogCellEditor extends DialogCellEditor {

	final private ReferencedElementChooserDialog myElementChooserDialog;

	public ReferenceDialogCellEditor(Composite parent, ReferencedElementChooserDialog chooserDialog) {
		super(parent);
		myElementChooserDialog = chooserDialog;
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		myElementChooserDialog.open();
		return myElementChooserDialog.getResult();
	}

}
