/**
 * <copyright>
 * </copyright>
 *
 * $Id: InteractionDiagramAttributesImpl.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.codegen.u2tgen.InteractionDiagramAttributes;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction Diagram Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.InteractionDiagramAttributesImpl#isMultiLayered <em>Multi Layered</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InteractionDiagramAttributesImpl extends EObjectImpl implements InteractionDiagramAttributes {
	/**
   * The default value of the '{@link #isMultiLayered() <em>Multi Layered</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMultiLayered()
   * @generated
   * @ordered
   */
	protected static final boolean MULTI_LAYERED_EDEFAULT = true;

	/**
   * The cached value of the '{@link #isMultiLayered() <em>Multi Layered</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isMultiLayered()
   * @generated
   * @ordered
   */
	protected boolean multiLayered = MULTI_LAYERED_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected InteractionDiagramAttributesImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return U2TGenPackage.Literals.INTERACTION_DIAGRAM_ATTRIBUTES;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isMultiLayered() {
    return multiLayered;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setMultiLayered(boolean newMultiLayered) {
    boolean oldMultiLayered = multiLayered;
    multiLayered = newMultiLayered;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.INTERACTION_DIAGRAM_ATTRIBUTES__MULTI_LAYERED, oldMultiLayered, multiLayered));
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
      case U2TGenPackage.INTERACTION_DIAGRAM_ATTRIBUTES__MULTI_LAYERED:
        return isMultiLayered();
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
      case U2TGenPackage.INTERACTION_DIAGRAM_ATTRIBUTES__MULTI_LAYERED:
        setMultiLayered((Boolean)newValue);
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
      case U2TGenPackage.INTERACTION_DIAGRAM_ATTRIBUTES__MULTI_LAYERED:
        setMultiLayered(MULTI_LAYERED_EDEFAULT);
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
      case U2TGenPackage.INTERACTION_DIAGRAM_ATTRIBUTES__MULTI_LAYERED:
        return multiLayered != MULTI_LAYERED_EDEFAULT;
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
    result.append(" (multiLayered: ");
    result.append(multiLayered);
    result.append(')');
    return result.toString();
  }

} //InteractionDiagramAttributesImpl
