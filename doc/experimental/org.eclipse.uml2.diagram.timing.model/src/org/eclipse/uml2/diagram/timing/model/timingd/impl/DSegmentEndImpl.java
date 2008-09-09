/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentEndImpl.java,v 1.3 2008/09/09 00:39:32 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSegment End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentEndImpl#getSegment <em>Segment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentEndImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSegmentEndImpl extends DSegmentElementImpl implements DSegmentEnd {
	/**
	 * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitch()
	 * @generated
	 * @ordered
	 */
	protected DStateSwitch switch_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSegmentEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DSEGMENT_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegment getSegment() {
		if (eContainerFeatureID != TimingDPackage.DSEGMENT_END__SEGMENT) return null;
		return (DSegment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegment(DSegment newSegment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSegment, TimingDPackage.DSEGMENT_END__SEGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegment(DSegment newSegment) {
		if (newSegment != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DSEGMENT_END__SEGMENT && newSegment != null)) {
			if (EcoreUtil.isAncestor(this, newSegment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSegment != null)
				msgs = ((InternalEObject)newSegment).eInverseAdd(this, TimingDPackage.DSEGMENT__END, DSegment.class, msgs);
			msgs = basicSetSegment(newSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_END__SEGMENT, newSegment, newSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateSwitch getSwitch() {
		if (switch_ != null && switch_.eIsProxy()) {
			InternalEObject oldSwitch = (InternalEObject)switch_;
			switch_ = (DStateSwitch)eResolveProxy(oldSwitch);
			if (switch_ != oldSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSEGMENT_END__SWITCH, oldSwitch, switch_));
			}
		}
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateSwitch basicGetSwitch() {
		return switch_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitch(DStateSwitch newSwitch, NotificationChain msgs) {
		DStateSwitch oldSwitch = switch_;
		switch_ = newSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_END__SWITCH, oldSwitch, newSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitch(DStateSwitch newSwitch) {
		if (newSwitch != switch_) {
			NotificationChain msgs = null;
			if (switch_ != null)
				msgs = ((InternalEObject)switch_).eInverseRemove(this, TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END, DStateSwitch.class, msgs);
			if (newSwitch != null)
				msgs = ((InternalEObject)newSwitch).eInverseAdd(this, TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END, DStateSwitch.class, msgs);
			msgs = basicSetSwitch(newSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_END__SWITCH, newSwitch, newSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DSEGMENT_END__SEGMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSegment((DSegment)otherEnd, msgs);
			case TimingDPackage.DSEGMENT_END__SWITCH:
				if (switch_ != null)
					msgs = ((InternalEObject)switch_).eInverseRemove(this, TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END, DStateSwitch.class, msgs);
				return basicSetSwitch((DStateSwitch)otherEnd, msgs);
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
			case TimingDPackage.DSEGMENT_END__SEGMENT:
				return basicSetSegment(null, msgs);
			case TimingDPackage.DSEGMENT_END__SWITCH:
				return basicSetSwitch(null, msgs);
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
			case TimingDPackage.DSEGMENT_END__SEGMENT:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DSEGMENT__END, DSegment.class, msgs);
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
			case TimingDPackage.DSEGMENT_END__SEGMENT:
				return getSegment();
			case TimingDPackage.DSEGMENT_END__SWITCH:
				if (resolve) return getSwitch();
				return basicGetSwitch();
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
			case TimingDPackage.DSEGMENT_END__SEGMENT:
				setSegment((DSegment)newValue);
				return;
			case TimingDPackage.DSEGMENT_END__SWITCH:
				setSwitch((DStateSwitch)newValue);
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
			case TimingDPackage.DSEGMENT_END__SEGMENT:
				setSegment((DSegment)null);
				return;
			case TimingDPackage.DSEGMENT_END__SWITCH:
				setSwitch((DStateSwitch)null);
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
			case TimingDPackage.DSEGMENT_END__SEGMENT:
				return getSegment() != null;
			case TimingDPackage.DSEGMENT_END__SWITCH:
				return switch_ != null;
		}
		return super.eIsSet(featureID);
	}

} //DSegmentEndImpl
