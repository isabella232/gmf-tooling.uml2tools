/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractDynamicCanonicalContainerImpl.java,v 1.3 2009/02/16 16:05:56 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer;
import org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract Dynamic Canonical Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AbstractDynamicCanonicalContainerImpl#getAlwaysCanonicalIDs <em>Always Canonical IDs</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AbstractDynamicCanonicalContainerImpl#isInitiallyCanonical <em>Initially Canonical</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AbstractDynamicCanonicalContainerImpl extends EObjectImpl implements AbstractDynamicCanonicalContainer {
	/**
	 * The cached value of the '{@link #getAlwaysCanonicalIDs() <em>Always Canonical IDs</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlwaysCanonicalIDs()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> alwaysCanonicalIDs;

	/**
	 * The default value of the '{@link #isInitiallyCanonical() <em>Initially Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitiallyCanonical()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INITIALLY_CANONICAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInitiallyCanonical() <em>Initially Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInitiallyCanonical()
	 * @generated
	 * @ordered
	 */
	protected boolean initiallyCanonical = INITIALLY_CANONICAL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractDynamicCanonicalContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenExtPackage.Literals.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getAlwaysCanonicalIDs() {
		if (alwaysCanonicalIDs == null) {
			alwaysCanonicalIDs = new EDataTypeUniqueEList<Integer>(Integer.class, this, GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS);
		}
		return alwaysCanonicalIDs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInitiallyCanonical() {
		return initiallyCanonical;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiallyCanonical(boolean newInitiallyCanonical) {
		boolean oldInitiallyCanonical = initiallyCanonical;
		initiallyCanonical = newInitiallyCanonical;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL, oldInitiallyCanonical, initiallyCanonical));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GenCommonBase> getAlwaysCanonicalChildren() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS:
				return getAlwaysCanonicalIDs();
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL:
				return isInitiallyCanonical();
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
		switch (featureID) {
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS:
				getAlwaysCanonicalIDs().clear();
				getAlwaysCanonicalIDs().addAll((Collection<? extends Integer>)newValue);
				return;
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL:
				setInitiallyCanonical((Boolean)newValue);
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
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS:
				getAlwaysCanonicalIDs().clear();
				return;
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL:
				setInitiallyCanonical(INITIALLY_CANONICAL_EDEFAULT);
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
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS:
				return alwaysCanonicalIDs != null && !alwaysCanonicalIDs.isEmpty();
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL:
				return initiallyCanonical != INITIALLY_CANONICAL_EDEFAULT;
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
		result.append(" (alwaysCanonicalIDs: ");
		result.append(alwaysCanonicalIDs);
		result.append(", initiallyCanonical: ");
		result.append(initiallyCanonical);
		result.append(')');
		return result.toString();
	}

} //AbstractDynamicCanonicalContainerImpl
