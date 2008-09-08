package org.eclipse.uml2.diagram.common.async;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.ITreeViewerListener;
import org.eclipse.jface.viewers.TreeExpansionEvent;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;


public class SyncModelUI {
	private final SyncModelNode myRootNode;
	private final SyncModelLabelProvider myLabelProvider;
	private CheckboxTreeViewer myTreeViewer;
	
	public SyncModelUI(Composite parent, SyncModelNode rootNode, SyncModelLabelProvider labelProvider){
		myRootNode = rootNode;
		myLabelProvider = labelProvider;
		createContents(parent);
	}

	private void createContents(Composite composite) {
		myTreeViewer = new CheckboxTreeViewer(composite, SWT.SINGLE | SWT.H_SCROLL | SWT.V_SCROLL | SWT.BORDER);
		myLabelProvider.hookTreeViewer(myTreeViewer);
		
		GridData layoutData = new GridData(GridData.FILL_BOTH);
		layoutData.heightHint = 300;
		layoutData.widthHint = 300;
		myTreeViewer.getTree().setLayoutData(layoutData);
		myTreeViewer.setContentProvider(new SyncModelContentProvider());
		myTreeViewer.setLabelProvider(myLabelProvider);
		
		myTreeViewer.setInput(new SyncModelNode[] {myRootNode});
		
		myTreeViewer.addTreeListener(new CheckStateInitializer(myTreeViewer));
		myTreeViewer.setGrayChecked(myRootNode, true);
		myTreeViewer.addCheckStateListener(new CheckListener(myRootNode, myTreeViewer));
		
		new MenuBuilder(myTreeViewer).attachMenu();
	}
	
	public SyncModelNode getRootSyncNode(){
		return myRootNode;
	}
	
	public CheckboxTreeViewer getUI(){
		return myTreeViewer;
	}
	
	private static class CheckStateInitializer implements ITreeViewerListener {
		private final List<Object> myExpandedNodes = new ArrayList<Object>();
		private final CheckboxTreeViewer myViewer;
		
		public CheckStateInitializer(CheckboxTreeViewer viewer){
			myViewer = viewer;
		}
		
		public void treeCollapsed(TreeExpansionEvent event) {
			// 
		}
		
		public void treeExpanded(TreeExpansionEvent event) {
			Object expanded = event.getElement();
			if (myExpandedNodes.contains(expanded)){
				return; //only first expand is interesting
			}
			
			myExpandedNodes.add(expanded);
			for (Object nextChild : getTreeContentProvider().getChildren(expanded)){
				if (nextChild instanceof SyncModelNode){
					SyncModelNode node = (SyncModelNode)nextChild;
					myViewer.setChecked(node, node.isChecked());
				}
			}
		}
		
		private ITreeContentProvider getTreeContentProvider(){
			return (ITreeContentProvider) myViewer.getContentProvider();
		}
	}
	
	private static class CheckListener implements ICheckStateListener {
		private final SyncModelNode myRoot;
		private final CheckboxTreeViewer myViewer;
		
		public CheckListener(SyncModelNode root, CheckboxTreeViewer viewer){
			myRoot = root;
			myViewer = viewer;
		}

		public void checkStateChanged(CheckStateChangedEvent event) {
			Object subject = event.getElement();
			if (subject == myRoot){
				//roll back, its always checked
				myViewer.setChecked(subject, true);
				return;
			}
			if (false == subject instanceof SyncModelNode){
				return;
			}
			SyncModelNode node = (SyncModelNode)subject;
			node.setChecked(event.getChecked());
			
			boolean refreshNeeded = false;
			if (event.getChecked()){
				for (SyncModelNode next = node.getParent(); next != null; next = next.getParent()){
					refreshNeeded |= !next.isChecked();
					next.setChecked(true);
					myViewer.setChecked(next, true);
				}
				if (node.isAutoSynchronized()){
					for (SyncModelNode nextChild : node.getChildren()){
						refreshNeeded |= nextChild.isChecked();
						nextChild.setChecked(true);
						myViewer.setChecked(nextChild, true);
					}
				}
			} else {
				SyncModelNode parent = node.getParent();
				refreshNeeded = parent.isAutoSynchronized();
				parent.setAutoSynchronized(false);
				
				for (SyncModelNode nextChild : node.getChildren()){
					refreshNeeded |= nextChild.isChecked();
					nextChild.setChecked(false);
					myViewer.setChecked(nextChild, false);
				}
			}
			
			if (refreshNeeded){
				myViewer.refresh(true);
			}
		}
	}
	
	private static class MenuBuilder implements IMenuListener {
		private final CheckboxTreeViewer myViewer;
		private final SyncModelUIAction mySwitchSyncAction; 

		public MenuBuilder(CheckboxTreeViewer viewer){
			myViewer = viewer;
			mySwitchSyncAction = new SwitchSynchronizationAction(viewer);
		}
		
		public void attachMenu(){
			MenuManager menuManager = new MenuManager();
			menuManager.addMenuListener(this);
			menuManager.add(mySwitchSyncAction);
			myViewer.getTree().setMenu(menuManager.createContextMenu(myViewer.getTree()));
		}
		
		public void removeMenu(){
			myViewer.getTree().setMenu(null);
		}
		
		public void menuAboutToShow(IMenuManager manager) {
			mySwitchSyncAction.update(myViewer);
		}
		
	}
	
	private static abstract class SyncModelUIAction extends Action {
		public abstract void update(CheckboxTreeViewer syncModelUI);
	}
	
	private static class SwitchSynchronizationAction extends SyncModelUIAction {
		private final CheckboxTreeViewer mySyncModelUI;
		private SyncModelNode mySelected;

		public SwitchSynchronizationAction(CheckboxTreeViewer syncModelUI){
			mySyncModelUI = syncModelUI;
		}
		
		@Override
		public void update(CheckboxTreeViewer viewer) {
			mySelected = null;
			IStructuredSelection selection = (IStructuredSelection)viewer.getSelection();
			setEnabled(selection.size() == 1);
			if (selection.size() != 1){
				return;
			}
			
			mySelected = (SyncModelNode) selection.getFirstElement();
			if (mySelected.isAutoSynchronized()){
				setText("Disable synchronization");
			} else {
				setText("Enable synchronization");
			}
		} 
		
		@Override
		public void run() {
			if (mySelected.isAutoSynchronized()){
				mySelected.setAutoSynchronized(false);
			} else {
				mySelected.setAutoSynchronized(true);
				for (SyncModelNode nextDirectChild : mySelected.getChildren()){
					nextDirectChild.setChecked(true);
					mySyncModelUI.setChecked(nextDirectChild, true);
				}
			}
			mySyncModelUI.refresh(mySelected);
		}
	}
	
	
}
