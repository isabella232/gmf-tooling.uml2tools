package org.eclipse.uml2.diagram.clazz.action;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.osgi.util.NLS;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.clazz.part.Messages;
import org.eclipse.uml2.diagram.clazz.part.NewDiagramForFixedElementsWizard;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorUtil;
import org.eclipse.uml2.diagram.clazz.part.UMLNewDiagramFileWizard;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.PackageableElement;

public class NewClassDiagramAction implements IObjectActionDelegate, IEditorActionDelegate {

	private IWorkbenchPart myTargetPart;

	private Package myDiagramRoot;

	private List<PackageableElement> mySelectedElements = new ArrayList<PackageableElement>();

	private final TransactionalEditingDomain myEditingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();

	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		this.myTargetPart = targetPart;
	}

	public void setActiveEditor(IAction action, IEditorPart editor) {
		this.myTargetPart = editor;
	}

	public void selectionChanged(IAction action, ISelection selection) {
		action.setEnabled(false);
		mySelectedElements = new ArrayList<PackageableElement>();
		if (selection instanceof IStructuredSelection == false || selection.isEmpty()) {
			return;
		}
		IStructuredSelection ss = (IStructuredSelection) selection;
		for (Object next : ss.toArray()) {
			PackageableElement pe = getValidElement(next);
			if (pe != null) {
				mySelectedElements.add(pe);
			}
		}
		myDiagramRoot = getDiagramRoot(mySelectedElements);
		action.setEnabled(isEnabled());
	}

	public void run(IAction action) {
		Wizard wizard;
		if (mySelectedElements.size() == 1 && myDiagramRoot.equals(mySelectedElements.get(0))) {
			wizard = new UMLNewDiagramFileWizard(getDiagramFileURI(), myDiagramRoot, myEditingDomain);
		} else {
			wizard = new NewDiagramForFixedElementsWizard(getDiagramFileURI(), myDiagramRoot, mySelectedElements.toArray(new PackageableElement[mySelectedElements.size()]), myEditingDomain);
		}
		wizard.setWindowTitle(NLS.bind(Messages.InitDiagramFile_WizardTitle, PackageEditPart.MODEL_ID));
		UMLDiagramEditorUtil.runWizard(getShell(), wizard, "InitDiagramFile"); //$NON-NLS-1$
	}
	
	private PackageableElement getValidElement(Object element) {
		if (element instanceof IGraphicalEditPart) {
			element = ((IGraphicalEditPart)element).getNotationView().getElement();
		}
		if (element instanceof PackageableElement) {
			return (PackageableElement) element;
		}
		return null;
	}

	private boolean isEnabled() {
		return myDiagramRoot != null;
	}

	private Package getDiagramRoot(List<PackageableElement> selected) {
		if (selected == null || selected.size() == 0) {
			return null;
		}
		for (PackageableElement next: selected) {
			Package pakkage = next.getNearestPackage();
			if (pakkage != null) {
				return pakkage;
			}
		}
		return null;
	}

	private URI getDiagramFileURI() {
		URI domainModelURI = myDiagramRoot.eResource().getURI();
		return domainModelURI;
		//return domainModelURI.trimSegments(1).appendSegment(getDiagramFileName(myDiagramRoot)).appendFileExtension(domainModelURI.fileExtension());
	}

	private String getDiagramFileName(Package pakkage) {
		return pakkage.getQualifiedName().replaceAll("\\:\\:", "_");
	}

	private Shell getShell() {
		return myTargetPart.getSite().getShell();
	}

}
