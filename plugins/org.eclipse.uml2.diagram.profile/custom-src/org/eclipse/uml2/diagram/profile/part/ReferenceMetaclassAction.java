package org.eclipse.uml2.diagram.profile.part;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.celleditor.FeatureEditorDialog;
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
import org.eclipse.uml2.uml.Profile;
import org.eclipse.uml2.uml.UMLPackage;

public class ReferenceMetaclassAction implements IObjectActionDelegate {
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
		TransactionalEditingDomain editingDomain = ((GraphicalEditPart)mySelection.getFirstElement()).getEditingDomain();
		final EObject profile = getSelectedUmlElement();
		List<EObject> choiceOfValues = getSelectorChoices(profile);
		String label = "Reference Metaclass";
		final FeatureEditorDialog dialog = new FeatureEditorDialog(myPart
				.getSite().getShell(), new UmlLabelProvider(), profile,
				UMLPackage.Literals.CLASS, Collections.EMPTY_LIST, label,
				choiceOfValues);
		dialog.open();

		if (dialog.getReturnCode() == FeatureEditorDialog.OK) {
			editingDomain.getCommandStack().execute(
					new ChangeCommand(editingDomain, new Runnable() {
						public void run() {
							for (Iterator metaclasses = dialog.getResult()
									.iterator(); metaclasses.hasNext();) {
								processSelection(profile, (EObject)metaclasses.next());
							}
						}
					}, label));
		}
	}
	protected List<EObject> getSelectorChoices(EObject object) {
		return new UmlChoiceProvider() {
			protected boolean isValidElement(Object object) {
				return (object instanceof org.eclipse.uml2.uml.Class
						&& ((org.eclipse.uml2.uml.Class) object).isMetaclass());
			}
			
			protected EList getReferencedElements(EObject object) {
				return ((Profile)object).getReferencedMetaclasses();
			}
		}.getUmlElements(object);
	}
	
	protected EObject getSelectedUmlElement() {
		GraphicalEditPart selected = (GraphicalEditPart) mySelection
				.getFirstElement();
		return (EObject) ((View) selected.getModel())
				.getElement();
	}
	
	
	protected void processSelection(EObject object, EObject choosenElement) {
		((Profile)object)
				.createMetaclassReference((org.eclipse.uml2.uml.Class) choosenElement);
	}

}
