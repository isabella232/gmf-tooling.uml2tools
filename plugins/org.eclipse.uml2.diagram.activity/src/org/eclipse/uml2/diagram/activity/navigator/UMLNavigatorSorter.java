package org.eclipse.uml2.diagram.activity.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;

/**
 * @generated
 */
public class UMLNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof UMLNavigatorItem) {
			UMLNavigatorItem item = (UMLNavigatorItem) element;
			if (ActivityEditPart.MODEL_ID.equals(item.getModelID())) {
				return item.getVisualID();
			}
		}
		return GROUP_CATEGORY;
	}

}
