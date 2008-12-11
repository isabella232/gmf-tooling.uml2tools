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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.ListenerList;
import org.eclipse.jface.util.SafeRunnable;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.HelpEvent;
import org.eclipse.swt.events.HelpListener;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.dialogs.FilteredList;
import org.eclipse.ui.dialogs.FilteredList.FilterMatcher;

public class FilteredListControl extends Composite {

	private boolean fIgnoreCase = true;

	private boolean fIsMultipleSelection = false;

	private boolean fMatchEmptyString = true;

	private boolean fAllowDuplicates = true;

	private Text fFilterText;

	private List myInitialSelections = new ArrayList();

	private Object[] fSelection = new Object[0];

	private String fFilter = null;

	protected FilteredList fFilteredList;

	private final ILabelProvider fRenderer;

	private FilteredList myFilteredList;
	
    private ListenerList selectionChangedListeners = new ListenerList();

	public FilteredListControl(Composite parent, ILabelProvider renderer) {
		super(parent, SWT.NONE);
		GridLayout layout = new GridLayout();
		setLayout(layout);
		setLayoutData(new GridData(GridData.FILL_BOTH));

		fRenderer = renderer;
		createFilterText(this);
		myFilteredList = createFilteredList(this);
	}

	protected void setFilterMatcher(FilterMatcher filterMatcher) {
		myFilteredList.setFilterMatcher(filterMatcher);
	}

	public void setInitialSelections(Object[] selectedElements) {
		myInitialSelections = new ArrayList(selectedElements.length);
		for (int i = 0; i < selectedElements.length; i++) {
			myInitialSelections.add(selectedElements[i]);
		}
	}

	protected Text createFilterText(Composite parent) {
		Text text = new Text(parent, SWT.BORDER);

		GridData data = new GridData();
		data.grabExcessVerticalSpace = false;
		data.grabExcessHorizontalSpace = true;
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.BEGINNING;
		text.setLayoutData(data);
		text.setFont(parent.getFont());

		text.setText((fFilter == null ? "" : fFilter)); //$NON-NLS-1$

		Listener listener = new Listener() {

			public void handleEvent(Event e) {
				fFilteredList.setFilter(fFilterText.getText());
			}
		};
		text.addListener(SWT.Modify, listener);

		text.addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent e) {
				if (e.keyCode == SWT.ARROW_DOWN) {
					fFilteredList.setFocus();
				}
			}

			public void keyReleased(KeyEvent e) {
			}
		});

		fFilterText = text;

		return text;
	}

	protected FilteredList createFilteredList(Composite parent) {
		int flags = SWT.BORDER | SWT.V_SCROLL | SWT.H_SCROLL | (fIsMultipleSelection ? SWT.MULTI : SWT.SINGLE);

		FilteredList list = new FilteredList(parent, flags, fRenderer, fIgnoreCase, fAllowDuplicates, fMatchEmptyString);

		GridData data = new GridData();
		// data.widthHint = convertWidthInCharsToPixels(fWidth);
		// data.heightHint = convertHeightInCharsToPixels(fHeight);
		data.grabExcessVerticalSpace = true;
		data.grabExcessHorizontalSpace = true;
		data.horizontalAlignment = GridData.FILL;
		data.verticalAlignment = GridData.FILL;
		list.setLayoutData(data);
		list.setFont(parent.getFont());
		list.setFilter((fFilter == null ? "" : fFilter)); //$NON-NLS-1$		

		list.addSelectionListener(new SelectionListener() {

			public void widgetDefaultSelected(SelectionEvent e) {
				// handleDefaultSelected();
			}

			public void widgetSelected(SelectionEvent e) {
				handleWidgetSelected();
			}
		});

		fFilteredList = list;

		return list;
	}

	private void handleWidgetSelected() {
		Object[] newSelection = fFilteredList.getSelection();

		if (newSelection.length != fSelection.length) {
			fSelection = newSelection;
			handleSelectionChanged();
		} else {
			for (int i = 0; i != newSelection.length; i++) {
				if (!newSelection[i].equals(fSelection[i])) {
					fSelection = newSelection;
					handleSelectionChanged();
					break;
				}
			}
		}
	}

	protected void setListElements(Object[] elements) {
		Assert.isNotNull(fFilteredList);
		fFilteredList.setElements(elements);
	}

	/**
	 * Sets the filter pattern.
	 * 
	 * @param filter
	 *            the filter pattern.
	 */
	public void setFilter(String filter) {
		if (fFilterText == null) {
			fFilter = filter;
		} else {
			fFilterText.setText(filter);
		}
	}

	/**
	 * Returns the current filter pattern.
	 * 
	 * @return returns the current filter pattern or
	 *         <code>null<code> if filter was not set.
	 */
	public String getFilter() {
		if (fFilteredList == null) {
			return fFilter;
		} else {
			return fFilteredList.getFilter();
		}
	}

	/**
	 * Returns the indices referring the current selection. To be called within
	 * open().
	 * 
	 * @return returns the indices of the current selection.
	 */
	protected int[] getSelectionIndices() {
		Assert.isNotNull(fFilteredList);
		return fFilteredList.getSelectionIndices();
	}

	/**
	 * Returns an index referring the first current selection. To be called
	 * within open().
	 * 
	 * @return returns the indices of the current selection.
	 */
	protected int getSelectionIndex() {
		Assert.isNotNull(fFilteredList);
		return fFilteredList.getSelectionIndex();
	}

	/**
	 * Sets the selection referenced by an array of elements. Empty or null
	 * array removes selection. To be called within open().
	 * 
	 * @param selection
	 *            the indices of the selection.
	 */
	protected void setSelection(Object[] selection) {
		Assert.isNotNull(fFilteredList);
		fFilteredList.setSelection(selection);
	}

	/**
	 * Returns an array of the currently selected elements. To be called within
	 * or after open().
	 * 
	 * @return returns an array of the currently selected elements.
	 */
	protected Object[] getSelectedElements() {
		Assert.isNotNull(fFilteredList);
		return fFilteredList.getSelection();
	}

	/**
	 * Returns all elements which are folded together to one entry in the list.
	 * 
	 * @param index
	 *            the index selecting the entry in the list.
	 * @return returns an array of elements folded together.
	 */
	public Object[] getFoldedElements(int index) {
		Assert.isNotNull(fFilteredList);
		return fFilteredList.getFoldedElements(index);
	}

	protected void handleSelectionChanged() {
	}
	
    public void addSelectionChangedListener(ISelectionChangedListener listener) {
        selectionChangedListeners.add(listener);
    }

    protected void fireSelectionChanged(final SelectionChangedEvent event) {
        Object[] listeners = selectionChangedListeners.getListeners();
        for (int i = 0; i < listeners.length; ++i) {
            final ISelectionChangedListener l = (ISelectionChangedListener) listeners[i];
            SafeRunnable.run(new SafeRunnable() {
                public void run() {
                    l.selectionChanged(event);
                }
            });
        }
    }

    public void removeSelectionChangedListener(
            ISelectionChangedListener listener) {
        selectionChangedListeners.remove(listener);
    }



}
