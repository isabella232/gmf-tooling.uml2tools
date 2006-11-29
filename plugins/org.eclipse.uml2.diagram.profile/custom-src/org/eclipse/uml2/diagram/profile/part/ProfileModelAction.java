package org.eclipse.uml2.diagram.profile.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.common.edit.command.ChangeCommand;

public abstract class ProfileModelAction implements IObjectActionDelegate {
	private IWorkbenchPart myPart;
	private IStructuredSelection mySelection;
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		myPart = targetPart;
	}
	public void selectionChanged(IAction action, ISelection selection) {
		mySelection = StructuredSelection.EMPTY;
		action.setEnabled(false);
		if (selection instanceof IStructuredSelection == false
				|| selection.isEmpty()) {
			return;
		}
		mySelection = (IStructuredSelection) selection;
		action.setEnabled(true);
	}

	public void run(IAction action) {
		GraphicalEditPart selected = (GraphicalEditPart) mySelection
				.getFirstElement();
		final EObject selectedObject = (EObject) ((View) selected.getModel())
		.getElement();
		TransactionalEditingDomain editingDomain = selected.getEditingDomain();
		editingDomain.getCommandStack().execute(
				new ChangeCommand(editingDomain, new Runnable() {
					public void run() {
						runInModel(selectedObject);
					}
				}, getActionLabel()));
	}
	
	abstract protected void runInModel(EObject selected);
	abstract protected String getActionLabel();
}
