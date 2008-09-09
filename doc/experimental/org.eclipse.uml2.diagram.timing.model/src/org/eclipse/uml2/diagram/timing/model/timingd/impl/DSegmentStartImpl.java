/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentStartImpl.java,v 1.3 2008/09/09 00:39:32 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.uml.StateInvariant;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSegment Start</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentStartImpl#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentStartImpl#getSegment <em>Segment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentStartImpl#getIncomingSwitch <em>Incoming Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSegmentStartImpl extends DSegmentElementImpl implements DSegmentStart {
	/**
	 * The cached value of the '{@link #getStateInvariant() <em>State Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStateInvariant()
	 * @generated
	 * @ordered
	 */
	protected StateInvariant stateInvariant;

	/**
	 * The cached value of the '{@link #getIncomingSwitch() <em>Incoming Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingSwitch()
	 * @generated
	 * @ordered
	 */
	protected DStateSwitch incomingSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSegmentStartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DSEGMENT_START;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant getStateInvariant() {
		if (stateInvariant != null && ((EObject)stateInvariant).eIsProxy()) {
			InternalEObject oldStateInvariant = (InternalEObject)stateInvariant;
			stateInvariant = (StateInvariant)eResolveProxy(oldStateInvariant);
			if (stateInvariant != oldStateInvariant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSEGMENT_START__STATE_INVARIANT, oldStateInvariant, stateInvariant));
			}
		}
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StateInvariant basicGetStateInvariant() {
		return stateInvariant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateInvariant(StateInvariant newStateInvariant) {
		StateInvariant oldStateInvariant = stateInvariant;
		stateInvariant = newStateInvariant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_START__STATE_INVARIANT, oldStateInvariant, stateInvariant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegment getSegment() {
		if (eContainerFeatureID != TimingDPackage.DSEGMENT_START__SEGMENT) return null;
		return (DSegment)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSegment(DSegment newSegment, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSegment, TimingDPackage.DSEGMENT_START__SEGMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSegment(DSegment newSegment) {
		if (newSegment != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DSEGMENT_START__SEGMENT && newSegment != null)) {
			if (EcoreUtil.isAncestor(this, newSegment))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSegment != null)
				msgs = ((InternalEObject)newSegment).eInverseAdd(this, TimingDPackage.DSEGMENT__START, DSegment.class, msgs);
			msgs = basicSetSegment(newSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_START__SEGMENT, newSegment, newSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateSwitch getIncomingSwitch() {
		if (incomingSwitch != null && incomingSwitch.eIsProxy()) {
			InternalEObject oldIncomingSwitch = (InternalEObject)incomingSwitch;
			incomingSwitch = (DStateSwitch)eResolveProxy(oldIncomingSwitch);
			if (incomingSwitch != oldIncomingSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSEGMENT_START__INCOMING_SWITCH, oldIncomingSwitch, incomingSwitch));
			}
		}
		return incomingSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateSwitch basicGetIncomingSwitch() {
		return incomingSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIncomingSwitch(DStateSwitch newIncomingSwitch, NotificationChain msgs) {
		DStateSwitch oldIncomingSwitch = incomingSwitch;
		incomingSwitch = newIncomingSwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_START__INCOMING_SWITCH, oldIncomingSwitch, newIncomingSwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncomingSwitch(DStateSwitch newIncomingSwitch) {
		if (newIncomingSwitch != incomingSwitch) {
			NotificationChain msgs = null;
			if (incomingSwitch != null)
				msgs = ((InternalEObject)incomingSwitch).eInverseRemove(this, TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START, DStateSwitch.class, msgs);
			if (newIncomingSwitch != null)
				msgs = ((InternalEObject)newIncomingSwitch).eInverseAdd(this, TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START, DStateSwitch.class, msgs);
			msgs = basicSetIncomingSwitch(newIncomingSwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_START__INCOMING_SWITCH, newIncomingSwitch, newIncomingSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DSEGMENT_START__SEGMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSegment((DSegment)otherEnd, msgs);
			case TimingDPackage.DSEGMENT_START__INCOMING_SWITCH:
				if (incomingSwitch != null)
					msgs = ((InternalEObject)incomingSwitch).eInverseRemove(this, TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START, DStateSwitch.class, msgs);
				return basicSetIncomingSwitch((DStateSwitch)otherEnd, msgs);
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
			case TimingDPackage.DSEGMENT_START__SEGMENT:
				return basicSetSegment(null, msgs);
			case TimingDPackage.DSEGMENT_START__INCOMING_SWITCH:
				return basicSetIncomingSwitch(null, msgs);
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
			case TimingDPackage.DSEGMENT_START__SEGMENT:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DSEGMENT__START, DSegment.class, msgs);
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
			case TimingDPackage.DSEGMENT_START__STATE_INVARIANT:
				if (resolve) return getStateInvariant();
				return basicGetStateInvariant();
			case TimingDPackage.DSEGMENT_START__SEGMENT:
				return getSegment();
			case TimingDPackage.DSEGMENT_START__INCOMING_SWITCH:
				if (resolve) return getIncomingSwitch();
				return basicGetIncomingSwitch();
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
			case TimingDPackage.DSEGMENT_START__STATE_INVARIANT:
				setStateInvariant((StateInvariant)newValue);
				return;
			case TimingDPackage.DSEGMENT_START__SEGMENT:
				setSegment((DSegment)newValue);
				return;
			case TimingDPackage.DSEGMENT_START__INCOMING_SWITCH:
				setIncomingSwitch((DStateSwitch)newValue);
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
			case TimingDPackage.DSEGMENT_START__STATE_INVARIANT:
				setStateInvariant((StateInvariant)null);
				return;
			case TimingDPackage.DSEGMENT_START__SEGMENT:
				setSegment((DSegment)null);
				return;
			case TimingDPackage.DSEGMENT_START__INCOMING_SWITCH:
				setIncomingSwitch((DStateSwitch)null);
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
			case TimingDPackage.DSEGMENT_START__STATE_INVARIANT:
				return stateInvariant != null;
			case TimingDPackage.DSEGMENT_START__SEGMENT:
				return getSegment() != null;
			case TimingDPackage.DSEGMENT_START__INCOMING_SWITCH:
				return incomingSwitch != null;
		}
		return super.eIsSet(featureID);
	}

} //DSegmentStartImpl
