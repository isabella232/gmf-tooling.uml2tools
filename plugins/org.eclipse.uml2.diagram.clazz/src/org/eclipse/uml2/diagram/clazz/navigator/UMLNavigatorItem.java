package org.eclipse.uml2.diagram.clazz.navigator;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class UMLNavigatorItem extends UMLAbstractNavigatorItem {

	/**
	 * @generated
	 */
	private View myView;

	/**
	 * @generated
	 */
	public UMLNavigatorItem(View view, Object parent) {
		super(parent);
		myView = view;
	}

	/**
	 * @generated
	 */
	public View getView() {
		return myView;
	}

	/**
	 * @generated
	 */
	public String getModelID() {
		return UMLVisualIDRegistry.getModelID(myView);
	}

	/**
	 * @generated
	 */
	public int getVisualID() {
		return UMLVisualIDRegistry.getVisualID(myView);
	}

	/**
	 * @generated
	 */
	public Object getAdapter(Class adapter) {
		if (View.class.isAssignableFrom(adapter) || EObject.class.isAssignableFrom(adapter)) {
			return myView;
		}
		return super.getAdapter(adapter);
	}

	/**
	 * @generated
	 */
	public boolean equals(Object obj) {
		if (obj instanceof UMLNavigatorItem) {
			EObject eObject = getView().getElement();
			EObject anotherEObject = ((UMLNavigatorItem) obj).getView().getElement();
			if (eObject == null) {
				return anotherEObject == null;
			} else if (anotherEObject == null) {
				return false;
			}
			return eObject.eResource().getURIFragment(eObject).equals(anotherEObject.eResource().getURIFragment(anotherEObject));
		}
		return super.equals(obj);
	}

}
