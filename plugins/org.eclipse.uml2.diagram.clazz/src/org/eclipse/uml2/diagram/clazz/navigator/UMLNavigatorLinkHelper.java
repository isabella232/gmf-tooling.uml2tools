package org.eclipse.uml2.diagram.clazz.navigator;

import org.eclipse.core.resources.IFile;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.gef.EditPart;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.StructuredSelection;

import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;

import org.eclipse.ui.navigator.ILinkHelper;

import org.eclipse.ui.part.FileEditorInput;

import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;

import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditor;

/**
 * @generated
 */
public class UMLNavigatorLinkHelper implements ILinkHelper {

	/**
	 * @generated
	 */
	public IStructuredSelection findSelection(IEditorInput anInput) {
		return StructuredSelection.EMPTY;
	}

	/**
	 * @generated
	 */
	public void activateEditor(IWorkbenchPage aPage, IStructuredSelection aSelection) {
		if (aSelection == null || aSelection.isEmpty()) {
			return;
		}
		if (aSelection.getFirstElement() instanceof UMLAbstractNavigatorItem) {
			UMLAbstractNavigatorItem navigatorItem = (UMLAbstractNavigatorItem) aSelection.getFirstElement();
			if (!PackageEditPart.MODEL_ID.equals(navigatorItem.getModelID())) {
				return;
			}
			Object parentFile = navigatorItem.getParent();
			while (parentFile instanceof UMLAbstractNavigatorItem) {
				parentFile = ((UMLAbstractNavigatorItem) parentFile).getParent();
			}
			if (false == parentFile instanceof IFile) {
				return;
			}
			IEditorInput fileInput = new FileEditorInput((IFile) parentFile);
			IEditorPart editor = aPage.findEditor(fileInput);
			if (editor == null) {
				return;
			}
			aPage.bringToTop(editor);
			if (editor instanceof UMLDiagramEditor) {
				UMLDiagramEditor diagramEditor = (UMLDiagramEditor) editor;
				Resource diagramResource = diagramEditor.getDiagram().eResource();

				View navigatorView = null;
				if (navigatorItem instanceof UMLNavigatorItem) {
					navigatorView = ((UMLNavigatorItem) navigatorItem).getView();
				} else if (navigatorItem instanceof UMLNavigatorGroup) {
					UMLNavigatorGroup group = (UMLNavigatorGroup) navigatorItem;
					if (group.getParent() instanceof UMLNavigatorItem) {
						navigatorView = ((UMLNavigatorItem) group.getParent()).getView();
					}
				}

				if (navigatorView == null) {
					return;
				}
				EObject selectedView = diagramResource.getEObject(navigatorView.eResource().getURIFragment(navigatorView));
				if (selectedView == null) {
					return;
				}
				EditPart selectedEditPart = (EditPart) diagramEditor.getDiagramGraphicalViewer().getEditPartRegistry().get(selectedView);
				if (selectedEditPart != null) {
					diagramEditor.getDiagramGraphicalViewer().select(selectedEditPart);
				}
			}
		}
	}

}
