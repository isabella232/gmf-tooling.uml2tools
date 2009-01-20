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

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.uml2.diagram.common.part.ModelElementsContentHelper;

public class ElementFilteredListChooser implements ElementChooserPage {

	private AdapterFactoryContentProvider myAdapterFctoryContentProvier;

	private final AdapterFactory myItemProvidersAdapterFactory;

	private final EObject mySourceObject;

	private final EStructuralFeature myFeature;

	private FilteredListControl myFilteredList;

	private final Validator myValidator;
	
	private final TransactionalEditingDomain myEditingDomain;

	public ElementFilteredListChooser(AdapterFactory itemProvidersAdapterFactory, EObject sourceObject, EStructuralFeature feature, Validator validator, TransactionalEditingDomain editingDomain) {
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		mySourceObject = sourceObject;
		myFeature = feature;
		myValidator = validator;
		myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(itemProvidersAdapterFactory);
		myEditingDomain = editingDomain;
	}

	public Control createControl(Composite parent) {
		myFilteredList = new FilteredListControl(parent, new AdapterFactoryLabelProvider(myItemProvidersAdapterFactory));
		Object featureValue = mySourceObject.eGet(myFeature);
		if (featureValue != null) {
			myFilteredList.setInitialSelections(new Object[] { featureValue });
		}
		ILabelProvider labelProvider = new SimpleNamedElementLabelProvider(new AdapterFactoryLabelProvider(myItemProvidersAdapterFactory));
		myFilteredList.setFilterMatcher(new ConfigurableFilterMatcher(labelProvider));
		myFilteredList.setListElements(collectElements(mySourceObject.eResource().getResourceSet()));
		return myFilteredList;
	}

	public List<?> getSelection() {
        Object[] result = myFilteredList.getSelectedElements();
        return Arrays.asList(result);
	}

	public void setSelection(List<?> selection) {
		if (selection == null || selection.isEmpty()) {
			myFilteredList.setSelection(null);
		} else {
			myFilteredList.setSelection(selection.toArray());			
		}
	}

	protected EObject[] collectElements(Object inputElement) {
		List<EObject> result = new LinkedList<EObject>();
		for (Object next : getAllChildren(inputElement)) {
			if (next instanceof EObject) {
				EObject transformed = myValidator.validate((EObject) next);
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

	public void addDoubleClickListener(IDoubleClickListener l) {
		myFilteredList.addDoubleClickListener(l);
	}

	public void addSelectionListener(ISelectionChangedListener l) {
		myFilteredList.addSelectionListener(l);		
	}

}
