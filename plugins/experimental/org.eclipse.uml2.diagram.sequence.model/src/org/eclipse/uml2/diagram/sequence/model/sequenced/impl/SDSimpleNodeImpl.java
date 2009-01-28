/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDSimpleNodeImpl.java,v 1.1 2009/01/28 05:27:46 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode;

import org.eclipse.uml2.uml.InteractionFragment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDSimpleNodeImpl#getUmlFragment <em>Uml Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDSimpleNodeImpl extends SDBracketImpl implements SDSimpleNode {
	/**
	 * The cached value of the '{@link #getUmlFragment() <em>Uml Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlFragment()
	 * @generated
	 * @ordered
	 */
	protected InteractionFragment umlFragment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDSimpleNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SDPackage.Literals.SD_SIMPLE_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment getUmlFragment() {
		if (umlFragment != null && ((EObject)umlFragment).eIsProxy()) {
			InternalEObject oldUmlFragment = (InternalEObject)umlFragment;
			umlFragment = (InteractionFragment)eResolveProxy(oldUmlFragment);
			if (umlFragment != oldUmlFragment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SDPackage.SD_SIMPLE_NODE__UML_FRAGMENT, oldUmlFragment, umlFragment));
			}
		}
		return umlFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionFragment basicGetUmlFragment() {
		return umlFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlFragment(InteractionFragment newUmlFragment) {
		InteractionFragment oldUmlFragment = umlFragment;
		umlFragment = newUmlFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SDPackage.SD_SIMPLE_NODE__UML_FRAGMENT, oldUmlFragment, umlFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SDPackage.SD_SIMPLE_NODE__UML_FRAGMENT:
				if (resolve) return getUmlFragment();
				return basicGetUmlFragment();
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
			case SDPackage.SD_SIMPLE_NODE__UML_FRAGMENT:
				setUmlFragment((InteractionFragment)newValue);
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
			case SDPackage.SD_SIMPLE_NODE__UML_FRAGMENT:
				setUmlFragment((InteractionFragment)null);
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
			case SDPackage.SD_SIMPLE_NODE__UML_FRAGMENT:
				return umlFragment != null;
		}
		return super.eIsSet(featureID);
	}

} //SDSimpleNodeImpl
