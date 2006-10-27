package org.eclipse.uml2.diagram.statemachine.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

import org.eclipse.uml2.diagram.statemachine.edit.parts.StateMachineEditPart;

/**
 * @generated
 */
public class UMLNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 7004;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof UMLNavigatorItem) {
			UMLNavigatorItem item = (UMLNavigatorItem) element;
			if (StateMachineEditPart.MODEL_ID.equals(item.getModelID())) {
				return item.getVisualID();
			}
		}
		return GROUP_CATEGORY;
	}

}
