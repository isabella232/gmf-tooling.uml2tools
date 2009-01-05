package org.eclipse.uml2.diagram.common.sheet.chooser;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.TabFolder;
import org.eclipse.swt.widgets.TabItem;
import org.eclipse.uml2.diagram.common.sheet.chooser.ElementChooserPage.Validator;
import org.eclipse.uml2.uml.ElementImport;

public class TabbedElementChooser {
	
	private final AdapterFactory myItemProvidersAdapterFactory;
	private final EObject mySourceObject;
	private final EStructuralFeature myFeature;
	private final IDialogSettings myDialogSettings;
	private ElementChooserPage myCurrentPage;
	private final String mySettingsKeyLastFocus = "ReferencedElementDialog.KeyLastFocus";
	private TabFolder myTabFolder;
	private final Validator myValidator;
	private ElementTreeChooser myTreeChooserTab;
	private ElementFilteredListChooser myListChooserPage;
	private final TransactionalEditingDomain myEditingDomain;

	public TabbedElementChooser(IDialogSettings settings, AdapterFactory itemProvidersAdapterFactory, EObject sourceObject, EStructuralFeature feature, TransactionalEditingDomain editingDomain) {
		myDialogSettings = settings;
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		mySourceObject = sourceObject;
		myFeature = feature;
		myEditingDomain = editingDomain;
		myValidator = new FeatureValueValidator(feature);		
	}

	public Control createDialogArea(Composite composite) {
		Composite plate = new Composite(composite, SWT.NONE);
		plate.setLayout(new GridLayout());
		myTabFolder = new TabFolder(plate, SWT.NONE);
		myTabFolder.setFont(plate.getFont());
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		myTabFolder.setLayoutData(layoutData);
		
		myTreeChooserTab = new ElementTreeChooser(myItemProvidersAdapterFactory, mySourceObject, myEditingDomain);
		addTabPage("Choose from a Tree", myTabFolder, myTreeChooserTab);
		myListChooserPage = new ElementFilteredListChooser(myItemProvidersAdapterFactory, mySourceObject, myFeature, myValidator, myEditingDomain);
		addTabPage("Choose from a List", myTabFolder, myListChooserPage);

		myCurrentPage= (ElementChooserPage) myTabFolder.getSelection()[0].getData();
		myTabFolder.addSelectionListener(new SelectionListener() {
			public void widgetDefaultSelected(SelectionEvent e) {}
			public void widgetSelected(SelectionEvent e) {
				tabChanged((TabItem)e.item);
				// XXX remove check, but give a valid settings
				if (myDialogSettings != null) {
					myDialogSettings.put(mySettingsKeyLastFocus, myTabFolder.getSelectionIndex());
				}
			}
		});

		return plate;
	}
	
	
	public Validator getValidator() {
		return myValidator;
	}
	
	private static void addTabPage(String title, TabFolder myTabFolder, ElementChooserPage tabPage) {
		final TabItem tabItem= new TabItem(myTabFolder, SWT.NONE);
//		applyDialogFont(tabItem.getControl());
		tabItem.setText(title);
		tabItem.setData(tabPage);
		tabItem.setControl(tabPage.createControl(myTabFolder));
	}
	
	private void tabChanged(TabItem tabItem) {
		ElementChooserPage newPage = (ElementChooserPage) tabItem.getData();
		tabItem.getControl().setFocus();
		if (myCurrentPage != null) {
			newPage.setSelection(myCurrentPage.getSelection());
		}
		// XXX add OK button listener to filtered tree
//		if (newPage instanceof FilteredTree) {
//			setOkButtonEnabled(true);
//		}
		myCurrentPage = newPage;
	}

	public void initSelection() {
		int lastFocusNr = 0;
		try {
			// XXX remove check, but give a valid settings
			if (myDialogSettings != null) {
				lastFocusNr = myDialogSettings.getInt(mySettingsKeyLastFocus);
			}
			if (lastFocusNr < 0 || lastFocusNr > myTabFolder.getItemCount()) {
				lastFocusNr = 0;
			}
		} catch (NumberFormatException x) {
			lastFocusNr = 0;
		}

		myTabFolder.setSelection(lastFocusNr);
		myCurrentPage = (ElementChooserPage) myTabFolder.getSelection()[0].getData();
		myCurrentPage.setSelection(getInitialSelection());
	}

	private List<Object> getInitialSelection() {
		return Collections.singletonList(mySourceObject.eGet(myFeature));
	}


	public List<Object> getSelection() {		
		return myCurrentPage.getSelection();
	}


	public void setSelection(List<Object> selection) {
		myCurrentPage.setSelection(selection);		
	}

	public void addDoubleClickListener(IDoubleClickListener listener) {
		myListChooserPage.addDoubleClickListener(listener);
		myTreeChooserTab.addDoubleClickListener(listener);
	}

	public void addSelectionListener(ISelectionChangedListener listener) {
		myListChooserPage.addSelectionListener(listener);
		myTreeChooserTab.addSelectionListener(listener);
	}

	private static class FeatureValueValidator implements Validator {
		
		private final EStructuralFeature myFeature2;

		public FeatureValueValidator(EStructuralFeature feature) {
			myFeature2 = feature;
		}

		public EObject validate(Object object) {
			if (false == object instanceof EObject) {
				return null;
			}
			EObject eobject = (EObject) object;
			if (eobject instanceof ElementImport) {
				ElementImport _import = (ElementImport) eobject;
				eobject = _import.getImportedElement();
			}
			if (eobject != null && myFeature2.getEType().isInstance(eobject)) {
				return eobject;
			}
			return null;
		}
		
	}

}
