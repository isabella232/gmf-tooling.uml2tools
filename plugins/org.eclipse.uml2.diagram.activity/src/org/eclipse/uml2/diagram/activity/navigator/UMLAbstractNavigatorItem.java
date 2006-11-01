package org.eclipse.uml2.diagram.activity.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.ui.views.properties.tabbed.ITabbedPropertySheetPageContributor;

/**
 * @generated
 */
public abstract class UMLAbstractNavigatorItem implements IAdaptable {

	/**
	 * @generated
	 */
	private Object myParent;

	/**
	 * @generated
	 */
	protected UMLAbstractNavigatorItem(Object parent) {
		myParent = parent;
	}

	/**
	 * @generated
	 */
	abstract public String getModelID();

	/**
	 * @generated
	 */
	public Object getParent() {
		return myParent;
	}

	/**
	 * @generated
	 */
	public Object getAdapter(Class adapter) {
		if (ITabbedPropertySheetPageContributor.class.isAssignableFrom(adapter)) {
			return new ITabbedPropertySheetPageContributor() {

				public String getContributorId() {
					return "org.eclipse.uml2.diagram.activity";
				}
			};
		}
		return null;
	}

}
