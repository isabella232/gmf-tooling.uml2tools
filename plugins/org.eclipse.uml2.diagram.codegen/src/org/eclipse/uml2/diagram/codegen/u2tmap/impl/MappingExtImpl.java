/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappingExtImpl.java,v 1.2 2011/02/11 14:16:05 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.mappings.impl.MappingImpl;

import org.eclipse.uml2.diagram.codegen.u2tmap.MappingExt;
import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions;
import org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping Ext</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.MappingExtImpl#getNewMenuDefs <em>New Menu Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MappingExtImpl extends MappingImpl implements MappingExt {
	/**
   * The cached value of the '{@link #getNewMenuDefs() <em>New Menu Defs</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getNewMenuDefs()
   * @generated
   * @ordered
   */
	protected NewMenuDefinitions newMenuDefs;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MappingExtImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return U2TMapPackage.Literals.MAPPING_EXT;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NewMenuDefinitions getNewMenuDefs() {
    if (newMenuDefs != null && newMenuDefs.eIsProxy())
    {
      InternalEObject oldNewMenuDefs = (InternalEObject)newMenuDefs;
      newMenuDefs = (NewMenuDefinitions)eResolveProxy(oldNewMenuDefs);
      if (newMenuDefs != oldNewMenuDefs)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, U2TMapPackage.MAPPING_EXT__NEW_MENU_DEFS, oldNewMenuDefs, newMenuDefs));
      }
    }
    return newMenuDefs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NewMenuDefinitions basicGetNewMenuDefs() {
    return newMenuDefs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setNewMenuDefs(NewMenuDefinitions newNewMenuDefs) {
    NewMenuDefinitions oldNewMenuDefs = newMenuDefs;
    newMenuDefs = newNewMenuDefs;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TMapPackage.MAPPING_EXT__NEW_MENU_DEFS, oldNewMenuDefs, newMenuDefs));
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
      case U2TMapPackage.MAPPING_EXT__NEW_MENU_DEFS:
        if (resolve) return getNewMenuDefs();
        return basicGetNewMenuDefs();
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
      case U2TMapPackage.MAPPING_EXT__NEW_MENU_DEFS:
        setNewMenuDefs((NewMenuDefinitions)newValue);
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
      case U2TMapPackage.MAPPING_EXT__NEW_MENU_DEFS:
        setNewMenuDefs((NewMenuDefinitions)null);
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
      case U2TMapPackage.MAPPING_EXT__NEW_MENU_DEFS:
        return newMenuDefs != null;
    }
    return super.eIsSet(featureID);
  }

} //MappingExtImpl
