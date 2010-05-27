/**
 * <copyright>
 * </copyright>
 *
 * $Id: CounterpartSemanticHintAttributeImpl.java,v 1.1 2010/05/27 11:50:59 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Counterpart Semantic Hint Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.CounterpartSemanticHintAttributeImpl#getParentVisualId <em>Parent Visual Id</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.CounterpartSemanticHintAttributeImpl#getChildVisualId <em>Child Visual Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CounterpartSemanticHintAttributeImpl extends EObjectImpl implements CounterpartSemanticHintAttribute {
	/**
	 * The default value of the '{@link #getParentVisualId() <em>Parent Visual Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentVisualId()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_VISUAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentVisualId() <em>Parent Visual Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentVisualId()
	 * @generated
	 * @ordered
	 */
	protected String parentVisualId = PARENT_VISUAL_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChildVisualId() <em>Child Visual Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildVisualId()
	 * @generated
	 * @ordered
	 */
	protected static final String CHILD_VISUAL_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChildVisualId() <em>Child Visual Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildVisualId()
	 * @generated
	 * @ordered
	 */
	protected String childVisualId = CHILD_VISUAL_ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CounterpartSemanticHintAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return U2TGenPackage.Literals.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentVisualId() {
		return parentVisualId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentVisualId(String newParentVisualId) {
		String oldParentVisualId = parentVisualId;
		parentVisualId = newParentVisualId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__PARENT_VISUAL_ID, oldParentVisualId, parentVisualId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChildVisualId() {
		return childVisualId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChildVisualId(String newChildVisualId) {
		String oldChildVisualId = childVisualId;
		childVisualId = newChildVisualId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__CHILD_VISUAL_ID, oldChildVisualId, childVisualId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__PARENT_VISUAL_ID:
				return getParentVisualId();
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__CHILD_VISUAL_ID:
				return getChildVisualId();
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
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__PARENT_VISUAL_ID:
				setParentVisualId((String)newValue);
				return;
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__CHILD_VISUAL_ID:
				setChildVisualId((String)newValue);
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
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__PARENT_VISUAL_ID:
				setParentVisualId(PARENT_VISUAL_ID_EDEFAULT);
				return;
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__CHILD_VISUAL_ID:
				setChildVisualId(CHILD_VISUAL_ID_EDEFAULT);
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
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__PARENT_VISUAL_ID:
				return PARENT_VISUAL_ID_EDEFAULT == null ? parentVisualId != null : !PARENT_VISUAL_ID_EDEFAULT.equals(parentVisualId);
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__CHILD_VISUAL_ID:
				return CHILD_VISUAL_ID_EDEFAULT == null ? childVisualId != null : !CHILD_VISUAL_ID_EDEFAULT.equals(childVisualId);
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
		result.append(" (parentVisualId: ");
		result.append(parentVisualId);
		result.append(", childVisualId: ");
		result.append(childVisualId);
		result.append(')');
		return result.toString();
	}

} //CounterpartSemanticHintAttributeImpl
