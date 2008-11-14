package org.eclipse.uml2.diagram.clazz.async;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.core.services.ViewService;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.async.SyncModelContext;
import org.eclipse.uml2.diagram.common.async.SyncModelNode;

/**
 * @generated
 */
public class ShowInitDialogAction implements IObjectActionDelegate {

	/**
	 * @generated
	 */
	private IWorkbenchPart targetPart;
	
	private org.eclipse.uml2.uml.Package myRootElement;

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
		myRootElement = null;
		if (firstSelected instanceof org.eclipse.uml2.uml.Package){
			myRootElement = (org.eclipse.uml2.uml.Package)firstSelected;
		}
		action.setEnabled(myRootElement != null);
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
		SynchronizeDiagramDialog dialog = new SynchronizeDiagramDialog(getShell(), createRootNode());
		dialog.open();
	}
	
	private SyncModelNode createRootNode(){
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		SyncModelContext context = new SyncModelContext(UMLDiagramUpdater.TYPED_ADAPTER, UMLVisualIDRegistry.TYPED_ADAPTER, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT, editingDomain);
		ResourceSet resourceSet = editingDomain.getResourceSet();
		resourceSet.getResource(myRootElement.eResource().getURI(), true);

		final Resource syncModelResource = context.getSyncModelResource();
		
		int diagramVID = UMLVisualIDRegistry.getDiagramVisualID(myRootElement);
		if (diagramVID != PackageEditPart.VISUAL_ID) {
			return null;
		}
		
		final Diagram diagram = ViewService.createDiagram(myRootElement, PackageEditPart.MODEL_ID, UMLDiagramEditorPlugin.DIAGRAM_PREFERENCES_HINT);
		context.runCommand(new Runnable() {
			public void run() {
				syncModelResource.getContents().add(diagram);
			}
		});
		
		return new SyncModelNode(diagram, null, context);
	}
	
}
