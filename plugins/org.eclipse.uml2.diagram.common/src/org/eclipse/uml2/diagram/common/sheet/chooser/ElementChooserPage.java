package org.eclipse.uml2.diagram.common.sheet.chooser;

import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

public interface ElementChooserPage {
	Object getSelection();
	void setSelection(Object selection);
	Control createControl(Composite parent);
	void addSelectionListener(ISelectionChangedListener l);

}
