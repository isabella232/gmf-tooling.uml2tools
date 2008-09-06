package org.eclipse.uml2.diagram.timing.navigator;

import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;

/**
 * @generated
 */

public class TimingDNavigatorSorter extends ViewerSorter {

	/**
	 * @generated
	 */
	private static final int GROUP_CATEGORY = 4003;

	/**
	 * @generated
	 */
	public int category(Object element) {
		if (element instanceof TimingDNavigatorItem) {
			TimingDNavigatorItem item = (TimingDNavigatorItem) element;
			return TimingDVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
