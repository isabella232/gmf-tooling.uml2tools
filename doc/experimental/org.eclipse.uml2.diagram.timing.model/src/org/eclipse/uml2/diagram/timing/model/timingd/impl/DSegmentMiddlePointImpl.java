/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentMiddlePointImpl.java,v 1.1 2008/09/06 19:44:14 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSegment Middle Point</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentMiddlePointImpl#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSegmentMiddlePointImpl extends DSegmentElementImpl implements DSegmentMiddlePoint {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSegmentMiddlePointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DSEGMENT_MIDDLE_POINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegment getSegment() {
		if (eContainerFeatureID != TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT) return null;
		return (DSegment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegment(DSegment newSegment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSegment, TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegment(DSegment newSegment) {
		if (newSegment != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT && newSegment != null)) {
			if (EcoreUtil.isAncestor(this, newSegment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSegment != null)
				msgs = ((InternalEObject)newSegment).eInverseAdd(this, TimingDPackage.DSEGMENT__MIDDLE_POINTS, DSegment.class, msgs);
			msgs = basicSetSegment(newSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT, newSegment, newSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSegment((DSegment)otherEnd, msgs);
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
			case TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT:
				return basicSetSegment(null, msgs);
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
		switch (eContainerFeatureID) {
			case TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DSEGMENT__MIDDLE_POINTS, DSegment.class, msgs);
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
			case TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT:
				return getSegment();
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
			case TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT:
				setSegment((DSegment)newValue);
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
			case TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT:
				setSegment((DSegment)null);
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
			case TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT:
				return getSegment() != null;
		}
		return super.eIsSet(featureID);
	}

} //DSegmentMiddlePointImpl
