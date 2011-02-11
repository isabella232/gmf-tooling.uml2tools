/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkToolStackInfoAttributeImpl.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Tool Stack Info Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackInfoAttributeImpl#getToolgroupTitle <em>Toolgroup Title</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackInfoAttributeImpl#getElementUniqueIdentifier <em>Element Unique Identifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkToolStackInfoAttributeImpl extends EObjectImpl implements LinkToolStackInfoAttribute {
	/**
   * The default value of the '{@link #getToolgroupTitle() <em>Toolgroup Title</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getToolgroupTitle()
   * @generated
   * @ordered
   */
	protected static final String TOOLGROUP_TITLE_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getToolgroupTitle() <em>Toolgroup Title</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getToolgroupTitle()
   * @generated
   * @ordered
   */
	protected String toolgroupTitle = TOOLGROUP_TITLE_EDEFAULT;

	/**
   * The default value of the '{@link #getElementUniqueIdentifier() <em>Element Unique Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getElementUniqueIdentifier()
   * @generated
   * @ordered
   */
	protected static final String ELEMENT_UNIQUE_IDENTIFIER_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getElementUniqueIdentifier() <em>Element Unique Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getElementUniqueIdentifier()
   * @generated
   * @ordered
   */
	protected String elementUniqueIdentifier = ELEMENT_UNIQUE_IDENTIFIER_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected LinkToolStackInfoAttributeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return U2TGenPackage.Literals.LINK_TOOL_STACK_INFO_ATTRIBUTE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getToolgroupTitle() {
    return toolgroupTitle;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setToolgroupTitle(String newToolgroupTitle) {
    String oldToolgroupTitle = toolgroupTitle;
    toolgroupTitle = newToolgroupTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__TOOLGROUP_TITLE, oldToolgroupTitle, toolgroupTitle));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getElementUniqueIdentifier() {
    return elementUniqueIdentifier;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setElementUniqueIdentifier(String newElementUniqueIdentifier) {
    String oldElementUniqueIdentifier = elementUniqueIdentifier;
    elementUniqueIdentifier = newElementUniqueIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__ELEMENT_UNIQUE_IDENTIFIER, oldElementUniqueIdentifier, elementUniqueIdentifier));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__TOOLGROUP_TITLE:
        return getToolgroupTitle();
      case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__ELEMENT_UNIQUE_IDENTIFIER:
        return getElementUniqueIdentifier();
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
    switch (featureID)
    {
      case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__TOOLGROUP_TITLE:
        setToolgroupTitle((String)newValue);
        return;
      case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__ELEMENT_UNIQUE_IDENTIFIER:
        setElementUniqueIdentifier((String)newValue);
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
    switch (featureID)
    {
      case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__TOOLGROUP_TITLE:
        setToolgroupTitle(TOOLGROUP_TITLE_EDEFAULT);
        return;
      case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__ELEMENT_UNIQUE_IDENTIFIER:
        setElementUniqueIdentifier(ELEMENT_UNIQUE_IDENTIFIER_EDEFAULT);
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
    switch (featureID)
    {
      case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__TOOLGROUP_TITLE:
        return TOOLGROUP_TITLE_EDEFAULT == null ? toolgroupTitle != null : !TOOLGROUP_TITLE_EDEFAULT.equals(toolgroupTitle);
      case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE__ELEMENT_UNIQUE_IDENTIFIER:
        return ELEMENT_UNIQUE_IDENTIFIER_EDEFAULT == null ? elementUniqueIdentifier != null : !ELEMENT_UNIQUE_IDENTIFIER_EDEFAULT.equals(elementUniqueIdentifier);
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
    result.append(" (toolgroupTitle: ");
    result.append(toolgroupTitle);
    result.append(", elementUniqueIdentifier: ");
    result.append(elementUniqueIdentifier);
    result.append(')');
    return result.toString();
  }

} //LinkToolStackInfoAttributeImpl
