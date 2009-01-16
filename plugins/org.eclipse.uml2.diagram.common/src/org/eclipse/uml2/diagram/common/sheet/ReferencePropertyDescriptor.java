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

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.ui.celleditor.ExtendedDialogCellEditor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.ui.provider.PropertyDescriptor;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositePropertySource;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositeSourcePropertyDescriptor;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.uml2.diagram.common.preferences.UMLPreferencesConstants;
import org.eclipse.uml2.diagram.common.sheet.chooser.MultiReferenceElementChooserDialog;
import org.eclipse.uml2.diagram.common.sheet.chooser.ReferencedElementChooserDialog;

public class ReferencePropertyDescriptor extends EMFCompositeSourcePropertyDescriptor {

	private final AdapterFactory myItemProvidersAdapterFactory;

	private final IDialogSettings myDialogSettings;
	
	private final IPreferenceStore myPreferenceStore;

	private final IItemPropertyDescriptor myItemPropertyDescriptor;

	private final Object mySourceObject;

	public ReferencePropertyDescriptor(Object sourceObject, IItemPropertyDescriptor itemPropertyDescriptor, String category, AdapterFactory itemProvidersAdapterFactory, IDialogSettings dialogSettings, IPreferenceStore store) {
		super(sourceObject, itemPropertyDescriptor, category);
		mySourceObject = sourceObject;
		myItemPropertyDescriptor = itemPropertyDescriptor;
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		myDialogSettings = dialogSettings;
		myPreferenceStore = store;
	}
	
	@Override
	protected CellEditor doCreateEditor(final Composite composite) {
		final EStructuralFeature feature = (EStructuralFeature) myItemPropertyDescriptor.getFeature(mySourceObject);
        if (itemPropertyDescriptor.getFeature(object) instanceof EReference && !myItemPropertyDescriptor.getChoiceOfValues(mySourceObject).isEmpty()) {
        	if (itemPropertyDescriptor.isMany(object)) {
    			return new ExtendedDialogCellEditor(composite, getEditLabelProvider()) {
    				@Override
    				protected Object openDialogBox(Control cellEditorWindow) {
    					MultiReferenceElementChooserDialog dialog = new MultiReferenceElementChooserDialog(composite.getShell(), myDialogSettings, myItemProvidersAdapterFactory, (EObject) object, feature);
    					dialog.open();
    					return dialog.getResult();
    				}
    			};
        	}
        	if (useDialogNotComboCellEditor()) {
        		ReferencedElementChooserDialog dialog = new ReferencedElementChooserDialog(composite.getShell(), myDialogSettings, myItemProvidersAdapterFactory, (EObject) object, feature);
        		return new ReferenceDialogCellEditor(composite, dialog);
        	}
        }
		return super.doCreateEditor(composite);
	}
	
	private boolean useDialogNotComboCellEditor() {
		String value = myPreferenceStore.getString(UMLPreferencesConstants.PREF_PROP_SHEET_REFERENCE);
		// XXX remove the check, when Preference Page will be added to UI
		if (value == null || "".equals(value)) {
			return true;
		}
		return UMLPreferencesConstants.PREF_PROP_SHEET_REFERENCE_DIALOG.equals(value);
	}

}
