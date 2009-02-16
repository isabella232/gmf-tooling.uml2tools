/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractNewMenuEntryImpl.java,v 1.2 2009/02/16 16:05:57 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap.impl;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry;
import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext;
import org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract New Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.AbstractNewMenuEntryImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractNewMenuEntryImpl extends EObjectImpl implements AbstractNewMenuEntry {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractNewMenuEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return U2TMapPackage.Literals.ABSTRACT_NEW_MENU_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NewMenuContext getContext() {
		if (eContainerFeatureID() != U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT) return null;
		return (NewMenuContext)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return eBasicSetContainer(otherEnd, U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT:
				return eBasicSetContainer(null, U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT:
				return eInternalContainer().eInverseRemove(this, U2TMapPackage.NEW_MENU_CONTEXT__ENTRIES, NewMenuContext.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT:
				return getContext();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT:
				return getContext() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractNewMenuEntryImpl
