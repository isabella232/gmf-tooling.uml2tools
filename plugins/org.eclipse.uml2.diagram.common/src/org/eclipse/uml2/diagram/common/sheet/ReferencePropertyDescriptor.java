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
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.uml2.uml.ElementImport;

public class ReferencePropertyDescriptor extends EMFCompositeSourcePropertyDescriptor {

	private final AdapterFactory myItemProvidersAdapterFactory;

	public ReferencePropertyDescriptor(Object sourceObject, IItemPropertyDescriptor itemPropertyDescriptor, String category, AdapterFactory itemProvidersAdapterFactory) {
		super(sourceObject, itemPropertyDescriptor, category);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
	}

	@Override
	protected CellEditor doCreateEditor(Composite composite) {
		final EStructuralFeature feature = (EStructuralFeature) getFeature();
//		UMLElementChooserDialog dialog = new ReferenceElementTreeChooserDialog(composite.getShell(), myItemProvidersAdapterFactory, (EObject) object, feature) {
		ReferenceElementTableChooserDialog dialog = new ReferenceElementTableChooserDialog(composite.getShell(), myItemProvidersAdapterFactory, (EObject) object, feature) {

			@Override
			protected EObject accept(EObject selectedElement) {
				if (selectedElement instanceof ElementImport){
					ElementImport _import = (ElementImport)selectedElement;
					selectedElement = _import.getImportedElement();
				}
				if (selectedElement != null && feature.getEType().isInstance(selectedElement)){
					return selectedElement;
				}
				return null;
			}
		};
		return new ReferenceComboAndDialogCellEditor(composite, new ArrayList(getChoiceOfValues()), getLabelProvider(), true, dialog, TransactionUtil.getEditingDomain(object));

	}

}
