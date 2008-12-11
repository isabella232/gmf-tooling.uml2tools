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

import java.util.ArrayList;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositeSourcePropertyDescriptor;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.diagram.common.sheet.chooser.ReferencedElementChooserDialog;

public class ReferencePropertyDescriptor extends EMFCompositeSourcePropertyDescriptor {

	private final AdapterFactory myItemProvidersAdapterFactory;

	private final IDialogSettings myDialogSettings;

	public ReferencePropertyDescriptor(Object sourceObject, IItemPropertyDescriptor itemPropertyDescriptor, String category, AdapterFactory itemProvidersAdapterFactory, IDialogSettings dialogSettings) {
		super(sourceObject, itemPropertyDescriptor, category);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		myDialogSettings = dialogSettings;
	}

	@Override
	protected CellEditor doCreateEditor(Composite composite) {
		final EStructuralFeature feature = (EStructuralFeature) getFeature();
		ReferencedElementChooserDialog dialog = new ReferencedElementChooserDialog(composite.getShell(), myDialogSettings, myItemProvidersAdapterFactory, (EObject) object, feature);
		return new ReferenceComboAndDialogCellEditor(composite, new ArrayList(getChoiceOfValues()), getLabelProvider(), true, dialog, TransactionUtil.getEditingDomain(object));
	}

}
