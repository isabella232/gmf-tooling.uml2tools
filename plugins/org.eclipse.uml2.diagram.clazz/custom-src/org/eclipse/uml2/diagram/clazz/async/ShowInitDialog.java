package org.eclipse.uml2.diagram.clazz.async;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.uml2.diagram.clazz.edit.parts.Package4EditPart;
import org.eclipse.uml2.diagram.clazz.navigator.UMLNavigatorLabelProvider;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.async.SyncModelLabelProvider;
import org.eclipse.uml2.diagram.common.async.SyncModelNode;
import org.eclipse.uml2.diagram.common.async.SyncModelUI;


public class ShowInitDialog extends Dialog {
	private SyncModelUI mySyncUI;
	private final SyncModelNode myRootNode;
	
	public ShowInitDialog(Shell shell, SyncModelNode rootNode){
		super(shell);
		myRootNode = rootNode;
		setShellStyle(getShellStyle() | SWT.RESIZE);
		setBlockOnOpen(true);
	}

	/**
	 * @generated
	 */
	protected Control createDialogArea(Composite parent) {
		Composite composite = (Composite) super.createDialogArea(parent);
		getShell().setText("Choose synchronization mode");
		mySyncUI = new SyncModelUI(composite, getRootSyncNode(), new SyncModelLabelProvider(new UMLNavigatorLabelProvider()));
		mySyncUI.getUI().addFilter(new ViewerFilter(){
			@Override
			public boolean select(Viewer viewer, Object parentElement, Object element) {
				return element instanceof SyncModelNode && !isDiagramHeader((SyncModelNode)element);
			}
			
			private boolean isDiagramHeader(SyncModelNode node){
				View view = node.getSyncModelView();
				return Package4EditPart.VISUAL_ID == UMLVisualIDRegistry.getVisualID(view);
			}
		});
		return composite;
	}

	/**
	 * @generated
	 */
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
