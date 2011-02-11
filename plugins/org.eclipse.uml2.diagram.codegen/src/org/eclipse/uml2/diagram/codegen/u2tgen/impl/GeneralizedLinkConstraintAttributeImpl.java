/**
 * <copyright>
 * </copyright>
 *
 * $Id: GeneralizedLinkConstraintAttributeImpl.java,v 1.2 2011/02/11 14:16:05 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalized Link Constraint Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.GeneralizedLinkConstraintAttributeImpl#getLinkConstraint <em>Link Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GeneralizedLinkConstraintAttributeImpl extends EObjectImpl implements GeneralizedLinkConstraintAttribute {
	/**
   * The default value of the '{@link #getLinkConstraint() <em>Link Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLinkConstraint()
   * @generated
   * @ordered
   */
	protected static final String LINK_CONSTRAINT_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getLinkConstraint() <em>Link Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getLinkConstraint()
   * @generated
   * @ordered
   */
	protected String linkConstraint = LINK_CONSTRAINT_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected GeneralizedLinkConstraintAttributeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return U2TGenPackage.Literals.GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getLinkConstraint() {
    return linkConstraint;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setLinkConstraint(String newLinkConstraint) {
    String oldLinkConstraint = linkConstraint;
    linkConstraint = newLinkConstraint;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE__LINK_CONSTRAINT, oldLinkConstraint, linkConstraint));
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
      case U2TGenPackage.GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE__LINK_CONSTRAINT:
        return getLinkConstraint();
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
      case U2TGenPackage.GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE__LINK_CONSTRAINT:
        setLinkConstraint((String)newValue);
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
      case U2TGenPackage.GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE__LINK_CONSTRAINT:
        setLinkConstraint(LINK_CONSTRAINT_EDEFAULT);
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
      case U2TGenPackage.GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE__LINK_CONSTRAINT:
        return LINK_CONSTRAINT_EDEFAULT == null ? linkConstraint != null : !LINK_CONSTRAINT_EDEFAULT.equals(linkConstraint);
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
    result.append(" (linkConstraint: ");
    result.append(linkConstraint);
    result.append(')');
    return result.toString();
  }

} //GeneralizedLinkConstraintAttributeImpl
