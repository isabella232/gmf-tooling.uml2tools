/**
 * <copyright>
 * </copyright>
 *
 * $Id: DIntervalImpl.java,v 1.2 2008/09/09 00:39:32 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.uml2.diagram.timing.model.timingd.DInterval;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DInterval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DIntervalImpl#getFromPoint <em>From Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DIntervalImpl#getToPoint <em>To Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DIntervalImpl extends EObjectImpl implements DInterval {
	/**
	 * The cached value of the '{@link #getFromPoint() <em>From Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromPoint()
	 * @generated
	 * @ordered
	 */
	protected DSegmentElement fromPoint;

	/**
	 * The cached value of the '{@link #getToPoint() <em>To Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToPoint()
	 * @generated
	 * @ordered
	 */
	protected DSegmentElement toPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DIntervalImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DINTERVAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement getFromPoint() {
		if (fromPoint != null && fromPoint.eIsProxy()) {
			InternalEObject oldFromPoint = (InternalEObject)fromPoint;
			fromPoint = (DSegmentElement)eResolveProxy(oldFromPoint);
			if (fromPoint != oldFromPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DINTERVAL__FROM_POINT, oldFromPoint, fromPoint));
			}
		}
		return fromPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement basicGetFromPoint() {
		return fromPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromPoint(DSegmentElement newFromPoint) {
		DSegmentElement oldFromPoint = fromPoint;
		fromPoint = newFromPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DINTERVAL__FROM_POINT, oldFromPoint, fromPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement getToPoint() {
		if (toPoint != null && toPoint.eIsProxy()) {
			InternalEObject oldToPoint = (InternalEObject)toPoint;
			toPoint = (DSegmentElement)eResolveProxy(oldToPoint);
			if (toPoint != oldToPoint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DINTERVAL__TO_POINT, oldToPoint, toPoint));
			}
		}
		return toPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement basicGetToPoint() {
		return toPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToPoint(DSegmentElement newToPoint) {
		DSegmentElement oldToPoint = toPoint;
		toPoint = newToPoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DINTERVAL__TO_POINT, oldToPoint, toPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingDPackage.DINTERVAL__FROM_POINT:
				if (resolve) return getFromPoint();
				return basicGetFromPoint();
			case TimingDPackage.DINTERVAL__TO_POINT:
				if (resolve) return getToPoint();
				return basicGetToPoint();
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
			case TimingDPackage.DINTERVAL__FROM_POINT:
				setFromPoint((DSegmentElement)newValue);
				return;
			case TimingDPackage.DINTERVAL__TO_POINT:
				setToPoint((DSegmentElement)newValue);
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
			case TimingDPackage.DINTERVAL__FROM_POINT:
				setFromPoint((DSegmentElement)null);
				return;
			case TimingDPackage.DINTERVAL__TO_POINT:
				setToPoint((DSegmentElement)null);
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
			case TimingDPackage.DINTERVAL__FROM_POINT:
				return fromPoint != null;
			case TimingDPackage.DINTERVAL__TO_POINT:
				return toPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //DIntervalImpl
