/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuxSecondaryDiagramNodeAttributeImpl.java,v 1.1 2009/03/10 13:47:21 tfesenko Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aux Secondary Diagram Node Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.AuxSecondaryDiagramNodeAttributeImpl#isSubstituteWithCanvasElement <em>Substitute With Canvas Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuxSecondaryDiagramNodeAttributeImpl extends EObjectImpl implements AuxSecondaryDiagramNodeAttribute {
	/**
	 * The default value of the '{@link #isSubstituteWithCanvasElement() <em>Substitute With Canvas Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstituteWithCanvasElement()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUBSTITUTE_WITH_CANVAS_ELEMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSubstituteWithCanvasElement() <em>Substitute With Canvas Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSubstituteWithCanvasElement()
	 * @generated
	 * @ordered
	 */
	protected boolean substituteWithCanvasElement = SUBSTITUTE_WITH_CANVAS_ELEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuxSecondaryDiagramNodeAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return U2TGenPackage.Literals.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSubstituteWithCanvasElement() {
		return substituteWithCanvasElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubstituteWithCanvasElement(boolean newSubstituteWithCanvasElement) {
		boolean oldSubstituteWithCanvasElement = substituteWithCanvasElement;
		substituteWithCanvasElement = newSubstituteWithCanvasElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE__SUBSTITUTE_WITH_CANVAS_ELEMENT, oldSubstituteWithCanvasElement, substituteWithCanvasElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case U2TGenPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE__SUBSTITUTE_WITH_CANVAS_ELEMENT:
				return isSubstituteWithCanvasElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case U2TGenPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE__SUBSTITUTE_WITH_CANVAS_ELEMENT:
				setSubstituteWithCanvasElement((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case U2TGenPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE__SUBSTITUTE_WITH_CANVAS_ELEMENT:
				setSubstituteWithCanvasElement(SUBSTITUTE_WITH_CANVAS_ELEMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case U2TGenPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE__SUBSTITUTE_WITH_CANVAS_ELEMENT:
				return substituteWithCanvasElement != SUBSTITUTE_WITH_CANVAS_ELEMENT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (substituteWithCanvasElement: ");
		result.append(substituteWithCanvasElement);
		result.append(')');
		return result.toString();
	}

} //AuxSecondaryDiagramNodeAttributeImpl
