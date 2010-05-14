/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkToolStackSupportAttributeImpl.java,v 1.1 2010/05/14 17:15:02 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Tool Stack Support Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackSupportAttributeImpl#getToolClassProviderName <em>Tool Class Provider Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackSupportAttributeImpl#getBaseSemanticClassName <em>Base Semantic Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkToolStackSupportAttributeImpl extends EObjectImpl implements LinkToolStackSupportAttribute {
	/**
	 * The default value of the '{@link #getToolClassProviderName() <em>Tool Class Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolClassProviderName()
	 * @generated
	 * @ordered
	 */
	protected static final String TOOL_CLASS_PROVIDER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getToolClassProviderName() <em>Tool Class Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToolClassProviderName()
	 * @generated
	 * @ordered
	 */
	protected String toolClassProviderName = TOOL_CLASS_PROVIDER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseSemanticClassName() <em>Base Semantic Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSemanticClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_SEMANTIC_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseSemanticClassName() <em>Base Semantic Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseSemanticClassName()
	 * @generated
	 * @ordered
	 */
	protected String baseSemanticClassName = BASE_SEMANTIC_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkToolStackSupportAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return U2TGenPackage.Literals.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getToolClassProviderName() {
		return toolClassProviderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToolClassProviderName(String newToolClassProviderName) {
		String oldToolClassProviderName = toolClassProviderName;
		toolClassProviderName = newToolClassProviderName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME, oldToolClassProviderName, toolClassProviderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseSemanticClassName() {
		return baseSemanticClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseSemanticClassName(String newBaseSemanticClassName) {
		String oldBaseSemanticClassName = baseSemanticClassName;
		baseSemanticClassName = newBaseSemanticClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME, oldBaseSemanticClassName, baseSemanticClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME:
				return getToolClassProviderName();
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME:
				return getBaseSemanticClassName();
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
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME:
				setToolClassProviderName((String)newValue);
				return;
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME:
				setBaseSemanticClassName((String)newValue);
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
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME:
				setToolClassProviderName(TOOL_CLASS_PROVIDER_NAME_EDEFAULT);
				return;
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME:
				setBaseSemanticClassName(BASE_SEMANTIC_CLASS_NAME_EDEFAULT);
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
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME:
				return TOOL_CLASS_PROVIDER_NAME_EDEFAULT == null ? toolClassProviderName != null : !TOOL_CLASS_PROVIDER_NAME_EDEFAULT.equals(toolClassProviderName);
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME:
				return BASE_SEMANTIC_CLASS_NAME_EDEFAULT == null ? baseSemanticClassName != null : !BASE_SEMANTIC_CLASS_NAME_EDEFAULT.equals(baseSemanticClassName);
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
		result.append(" (toolClassProviderName: ");
		result.append(toolClassProviderName);
		result.append(", baseSemanticClassName: ");
		result.append(baseSemanticClassName);
		result.append(')');
		return result.toString();
	}

} //LinkToolStackSupportAttributeImpl
