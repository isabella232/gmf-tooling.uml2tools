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
package org.eclipse.uml2.diagram.common.sheet.chooser;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.uml2.diagram.common.part.ModelElementsContentHelper;

public class ElementFilteredListChooser implements ElementChooserPage {

	private AdapterFactoryContentProvider myAdapterFctoryContentProvier;

	private TransactionalEditingDomain myEditingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();

	private final AdapterFactory myItemProvidersAdapterFactory;

	private final EObject mySourceObject;

	private final EStructuralFeature myFeature;

	private FilteredListControl myFilteredList;

	public ElementFilteredListChooser(AdapterFactory itemProvidersAdapterFactory, EObject sourceObject, EStructuralFeature feature) {
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		mySourceObject = sourceObject;
		myFeature = feature;
		myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(itemProvidersAdapterFactory);
	}

	public Control createControl(Composite parent) {
		myFilteredList = new FilteredListControl(parent, new AdapterFactoryLabelProvider(myItemProvidersAdapterFactory));
		Object featureValue = mySourceObject.eGet(myFeature);
		if (featureValue != null) {
			myFilteredList.setInitialSelections(new Object[] { featureValue });
		}
		ILabelProvider labelProvider = new SimpleNamedElementLabelProvider(new AdapterFactoryLabelProvider(myItemProvidersAdapterFactory));
		myFilteredList.setFilterMatcher(new ConfigurableFilterMatcher(labelProvider));
		myFilteredList.setListElements(getElements(mySourceObject.eResource()));
		return myFilteredList;
	}

	public Object getSelection() {
        Object[] result = myFilteredList.getSelectedElements();
        if (result == null || result.length == 0) {
			return null;
		}
        return result[0];
	}

	public void setSelection(Object selection) {
		if (selection == null) {
			myFilteredList.setSelection(null);
		} else {
			myFilteredList.setSelection(new Object[]{selection});
		}
	}

	protected EObject[] getElements(Object inputElement) {
		List<EObject> result = new LinkedList<EObject>();
		for (Object next : getAllChildren(inputElement)) {
			if ((next instanceof EObject)) {
				EObject transformed = ReferencedElementChooserDialog.accept((EObject) next, myFeature);
				if (transformed != null) {
					result.add(transformed);
				}
			}
		}
		return result.toArray(new EObject[result.size()]);
	}

	protected List<Object> getAllChildren(Object parentElement) {
		List<Object> result = new LinkedList<Object>();
		for (Object next : ModelElementsContentHelper.getChildren(parentElement, myAdapterFctoryContentProvier, myEditingDomain.getResourceSet())) {
			result.add(next);
			result.addAll(getAllChildren(next));
		}
		return result;
	}

}
