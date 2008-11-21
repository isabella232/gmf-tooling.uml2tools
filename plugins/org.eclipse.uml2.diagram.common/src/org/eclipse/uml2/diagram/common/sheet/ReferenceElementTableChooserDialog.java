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
package org.eclipse.uml2.diagram.common.sheet;

import java.util.LinkedList;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.dialogs.FilteredList;
import org.eclipse.ui.dialogs.FilteredList.FilterMatcher;
import org.eclipse.ui.internal.misc.StringMatcher;
import org.eclipse.uml2.diagram.common.part.ModelElementsContentHelper;
import org.eclipse.uml2.uml.NamedElement;

public class ReferenceElementTableChooserDialog extends ElementListSelectionDialog {

	private AdapterFactoryContentProvider myAdapterFctoryContentProvier;

	private TransactionalEditingDomain myEditingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
	
	private final static int UNSET_BUTTON_ID = IDialogConstants.NO_TO_ALL_ID + 1; 

	private final AdapterFactory myItemProvidersAdapterFactory;

	public ReferenceElementTableChooserDialog(Shell parentShell, AdapterFactory itemProvidersAdapterFactory, EObject sourceObject, EStructuralFeature feature) {
		super(parentShell, new AdapterFactoryLabelProvider(itemProvidersAdapterFactory));
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		setTitle("Choose Element");
		setMessage("Enter element name prefix of pattern(?, *, or camel case):");
		myAdapterFctoryContentProvier = new AdapterFactoryContentProvider(itemProvidersAdapterFactory);
		setShellStyle(getShellStyle() | SWT.RESIZE);
		setElements(getElements(sourceObject.eResource()));
		Object featureValue = sourceObject.eGet(feature);
		if (featureValue != null) {
			setInitialSelections(new Object[]{featureValue});
		}
	}
	
	@Override
	protected FilteredList createFilteredList(Composite parent) {
		FilteredList list = super.createFilteredList(parent);
		ILabelProvider labelProvider = new SimpleNamedElementLabelProvider(new AdapterFactoryLabelProvider(myItemProvidersAdapterFactory));
		list.setFilterMatcher(new ConfigurableFilterMatcher(labelProvider));
		return list;
	}

	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		// create OK and Cancel buttons by default
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL,
				true);
		createButton(parent, UNSET_BUTTON_ID, "Unset", false);
		createButton(parent, IDialogConstants.CANCEL_ID,
				IDialogConstants.CANCEL_LABEL, false);
	}
	
	@Override
	protected void buttonPressed(int buttonId) {
		if (UNSET_BUTTON_ID == buttonId) {
			unsetPressed();
		} else {
			super.buttonPressed(buttonId);
		}
	}
	
	private void unsetPressed() {
		setSelection(null);
	}

	
	protected EObject accept(EObject selectedElement) {
		return null;
	}

	protected EObject[] getElements(Object inputElement) {
		List<EObject> result = new LinkedList<EObject>();
		for (Object next : getAllChildren(inputElement)) {
			if ((next instanceof EObject)){
				EObject transfromed = accept((EObject) next);
				if (transfromed != null){
					result.add(transfromed);
				}
			}
		}
		return result.toArray(new EObject[result.size()]);
	}

	private List<Object> getAllChildren(Object parentElement) {
		List<Object> result = new LinkedList<Object>();
		for (Object next : ModelElementsContentHelper.getChildren(parentElement, myAdapterFctoryContentProvier, myEditingDomain.getResourceSet())) {
			result.add(next);
			result.addAll(getAllChildren(next));
		}
		return result;
	}
	
	private class SimpleNamedElementLabelProvider implements ILabelProvider {
		private final ILabelProvider myOriginalLabelProvider;

		private SimpleNamedElementLabelProvider(ILabelProvider originalLabelProvider) {
			myOriginalLabelProvider = originalLabelProvider;
			
		}

		public Image getImage(Object element) {
			return myOriginalLabelProvider.getImage(element);
		}

		public String getText(Object element) {
			if (element instanceof NamedElement) {
				return ((NamedElement)element).getName();
			}
			return myOriginalLabelProvider.getText(element);
		}

		public void addListener(ILabelProviderListener listener) {
			myOriginalLabelProvider.addListener(listener);
		}

		public void dispose() {
			myOriginalLabelProvider.dispose();			
		}

		public boolean isLabelProperty(Object element, String property) {
			return myOriginalLabelProvider.isLabelProperty(element, property);
		}

		public void removeListener(ILabelProviderListener listener) {
			myOriginalLabelProvider.removeListener(listener);
		}
		
	}
	
	private class ConfigurableFilterMatcher implements FilterMatcher {

		private final ILabelProvider myLabelProvider;

		private StringMatcher myMatcher;

		private ConfigurableFilterMatcher(ILabelProvider provider) {
			myLabelProvider = provider;
		}

		public void setFilter(String pattern, boolean ignoreCase, boolean ignoreWildCards) {
			myMatcher = new StringMatcher(pattern + '*', ignoreCase, ignoreWildCards);
		}

		public boolean match(Object element) {
			return myMatcher.match(myLabelProvider.getText(element));
		}
	}

}
