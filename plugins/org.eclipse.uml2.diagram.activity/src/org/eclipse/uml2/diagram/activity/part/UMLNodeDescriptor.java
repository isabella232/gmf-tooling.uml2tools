package org.eclipse.uml2.diagram.activity.part;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;

/**
 * @generated
 */
@SuppressWarnings("unchecked")
public class UMLNodeDescriptor implements IUpdaterNodeDescriptor {

	/**
	 * @generated
	 */
	private EObject myModelElement;

	/**
	 * @generated
	 */
	private int myVisualID;

	/**
	 * @generated
	 */
	private String myType;

	/**
	 * @generated
	 */
	public UMLNodeDescriptor(EObject modelElement, int visualID) {
		myModelElement = modelElement;
		myVisualID = visualID;
	}

	/**
	 * @generated
	 */
	public EObject getModelElement() {
		return myModelElement;
	}

	/**
	 * @generated
	 */
	public int getVisualID() {
		return myVisualID;
	}

	/**
	 * @generated
	 */
	public String getType() {
		if (myType == null) {
			myType = UMLVisualIDRegistry.getType(getVisualID());
		}
		return myType;
	}

}
