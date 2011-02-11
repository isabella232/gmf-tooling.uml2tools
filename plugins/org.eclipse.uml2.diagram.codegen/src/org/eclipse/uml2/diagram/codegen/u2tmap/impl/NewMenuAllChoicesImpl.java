/**
 * <copyright>
 * </copyright>
 *
 * $Id: NewMenuAllChoicesImpl.java,v 1.2 2011/02/11 14:16:05 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuAllChoices;
import org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Menu All Choices</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuAllChoicesImpl#getExclusions <em>Exclusions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewMenuAllChoicesImpl extends NewMenuEntryImpl implements NewMenuAllChoices {
	/**
   * The cached value of the '{@link #getExclusions() <em>Exclusions</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExclusions()
   * @generated
   * @ordered
   */
	protected EList<EClass> exclusions;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NewMenuAllChoicesImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return U2TMapPackage.Literals.NEW_MENU_ALL_CHOICES;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<EClass> getExclusions() {
    if (exclusions == null)
    {
      exclusions = new EObjectResolvingEList<EClass>(EClass.class, this, U2TMapPackage.NEW_MENU_ALL_CHOICES__EXCLUSIONS);
    }
    return exclusions;
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
      case U2TMapPackage.NEW_MENU_ALL_CHOICES__EXCLUSIONS:
        return getExclusions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case U2TMapPackage.NEW_MENU_ALL_CHOICES__EXCLUSIONS:
        getExclusions().clear();
        getExclusions().addAll((Collection<? extends EClass>)newValue);
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
      case U2TMapPackage.NEW_MENU_ALL_CHOICES__EXCLUSIONS:
        getExclusions().clear();
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
      case U2TMapPackage.NEW_MENU_ALL_CHOICES__EXCLUSIONS:
        return exclusions != null && !exclusions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //NewMenuAllChoicesImpl
