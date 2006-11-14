package org.eclipse.uml2.diagram.clazz.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

import org.eclipse.uml2.diagram.clazz.edit.parts.PackageEditPart;

/**
 * @generated
 */
public class UMLNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7030;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof UMLNavigatorItem) {
			UMLNavigatorItem item = (UMLNavigatorItem) element;
			return UMLVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
