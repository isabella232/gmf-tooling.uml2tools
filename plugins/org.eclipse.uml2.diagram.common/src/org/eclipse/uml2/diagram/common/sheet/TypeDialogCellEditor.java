package org.eclipse.uml2.diagram.common.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.transaction.util.TransactionUtil;
import org.eclipse.jface.viewers.DialogCellEditor;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.uml.Type;

public class TypeDialogCellEditor extends DialogCellEditor {

	final private AdapterFactory myItemProvidersAdapterFactory;

	final private TransactionalEditingDomain myEditingDomain;

	final private EObject mySourceObject;

	public TypeDialogCellEditor(Composite parent, AdapterFactory itemProvidersAdapterFactory, EObject object) {
		super(parent, SWT.SINGLE);
		mySourceObject = object;
		myEditingDomain = TransactionUtil.getEditingDomain(object);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
	}

	@Override
	protected Object openDialogBox(Control cellEditorWindow) {
		UMLElementChooserDialog dialog = createElementChooserDialog(cellEditorWindow.getShell(), mySourceObject);
		if (dialog.open() == Window.OK) {
			URI uri = dialog.getSelectedModelElementURI();
			try {
				return myEditingDomain.getResourceSet().getEObject(uri, true);
			} catch (WrappedException e) {
				e.printStackTrace();
				return null;
			}
		}
		return null;
	}
	
	private UMLElementChooserDialog createElementChooserDialog(Shell shell, EObject sourceObject) {
		return new TypeChooserDialog(shell, mySourceObject);
	}

	private class TypeChooserDialog extends UMLElementChooserDialog {

		public TypeChooserDialog(Shell parentShell, EObject sourceObject) {
			super(parentShell, myItemProvidersAdapterFactory, sourceObject);
		}

		@Override
		protected boolean isCorrectElement(EObject selectedElement) {
			return selectedElement instanceof Type;
		}
	}

}
