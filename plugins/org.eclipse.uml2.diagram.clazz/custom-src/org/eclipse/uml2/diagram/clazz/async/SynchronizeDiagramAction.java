package org.eclipse.uml2.diagram.clazz.async;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.preferences.PreferencesHint;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramUpdateCommand;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.async.ApplySynchronizationCommand;
import org.eclipse.uml2.diagram.common.async.SyncModelContext;
import org.eclipse.uml2.diagram.common.async.SyncModelNode;

/**
 * @generated
 */
public class SynchronizeDiagramAction implements IObjectActionDelegate {
	
	private IWorkbenchPart targetPart;

	private View myRootDiagramView;

	private PreferencesHint myPreferencesHint;

	/**
	 * @generated
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.targetPart = targetPart;
	}

	/**
	 * @generated
	 */
	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false || selection.isEmpty()) {
			return;
		}
		Object firstSelected = ((IStructuredSelection) selection).getFirstElement();
		myRootDiagramView = null;
		myPreferencesHint = null;
		if (firstSelected instanceof IGraphicalEditPart) {
			IGraphicalEditPart ep = (IGraphicalEditPart) firstSelected;
			View view = ep.getNotationView();
			int visualId = UMLVisualIDRegistry.getVisualID(view);
			if (visualId > 0) {
				if (UMLVisualIDRegistry.isCompartmentVisualID(visualId)) {
					view = (View) view.eContainer();
				}
				myRootDiagramView = view;
				myPreferencesHint = ep.getDiagramPreferencesHint();
			}
		}
		action.setEnabled(myRootDiagramView != null);
	}

	/**
	 * @generated
	 */
	private Shell getShell() {
		return targetPart.getSite().getShell();
	}

	/**
	 * @generated
	 */
	public void run(IAction action) {
		SyncModelContext context = createContext();
		try {
			SyncModelNode root = createRootNode(context);
			SynchronizeDiagramDialog dialog = new SynchronizeDiagramDialog(getShell(), root);
			if (dialog.open() == Dialog.OK){
				applySynchronization(dialog.getRootSyncNode());
			}
		} finally {
			context.dispose();
		}
	}

	private void applySynchronization(SyncModelNode syncRoot) {
		SyncModelContext context = syncRoot.getContext();
		ApplySynchronizationCommand applyCommand = new ApplySynchronizationCommand(syncRoot);
		context.runCommand(applyCommand);
		UMLDiagramUpdateCommand.performCanonicalUpdate(syncRoot.getDiagramView().getDiagram().getElement());
		context.dispose();
	}

	private SyncModelNode createRootNode(SyncModelContext context) {
		final Resource syncModelResource = context.getSyncModelResource();
		final Diagram syncDiagram = ViewService.createDiagram(myRootDiagramView.getDiagram().getElement(), UMLVisualIDRegistry.getModelID(myRootDiagramView), myPreferencesHint);
		View syncRoot;
		if (myRootDiagramView instanceof Diagram) {
			syncRoot = syncDiagram;
		} else {
			syncRoot = ViewService.createNode(syncDiagram, myRootDiagramView.getElement(), myRootDiagramView.getType(), myPreferencesHint);
		}
		context.runCommand(new Runnable() {
			public void run() {
				syncModelResource.getContents().add(syncDiagram);
			}
		});
		SyncModelNode result = new SyncModelNode(syncRoot, myRootDiagramView, context);
		return result;
	}
	
	private SyncModelContext createContext(){
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.getEditingDomain(myRootDiagramView.eResource().getResourceSet());
		return new SyncModelContext(UMLDiagramUpdater.TYPED_ADAPTER, UMLVisualIDRegistry.TYPED_ADAPTER, myPreferencesHint, editingDomain);
	}

}
