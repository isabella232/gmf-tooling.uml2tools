package org.eclipse.uml2.diagram.clazz.async;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.diagram.clazz.navigator.UMLNavigatorLabelProvider;
import org.eclipse.uml2.diagram.common.async.SyncModelLabelProvider;
import org.eclipse.uml2.diagram.common.async.SyncModelNode;
import org.eclipse.uml2.diagram.common.async.SyncModelUI;


public class SynchronizeDiagramDialog extends Dialog {
	private SyncModelUI mySyncUI;
	private final SyncModelNode myRootNode;
	
	public SynchronizeDiagramDialog(Shell shell, SyncModelNode rootNode){
		super(shell);
		myRootNode = rootNode;
		setShellStyle(getShellStyle() | SWT.RESIZE);
		setBlockOnOpen(true);
	}

	/**
	 * @generated
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		getShell().setText("Choose synchronization mode");
		mySyncUI = new SyncModelUI(composite, new SyncModelLabelProvider(new UMLNavigatorLabelProvider()));
		mySyncUI.setRootNode(getRootSyncNode());
		mySyncUI.getUI().addFilter(new DiagramHeaderFilter());
		return composite;
	}

	/**
	 * @generated
	 */
	@Override
	protected Control createButtonBar(Composite parent) {
		Control buttonBar = super.createButtonBar(parent);
		setOkButtonEnabled(true);
		return buttonBar;
	}
	
	/**
	 * @generated
	 */
	private void setOkButtonEnabled(boolean enabled) {
		getButton(IDialogConstants.OK_ID).setEnabled(enabled);
	}
	
	public SyncModelNode getRootSyncNode(){
		return myRootNode;
	}
	
	protected SyncModelUI getSyncUI() {
		return mySyncUI;
	}
	
}
