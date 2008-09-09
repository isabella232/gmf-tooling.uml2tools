/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentElementImpl.java,v 1.4 2008/09/09 01:27:29 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.DTick;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSegment Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentElementImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentElementImpl#getDebugId <em>Debug Id</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentElementImpl#getTick <em>Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSegmentElementImpl extends EObjectImpl implements DSegmentElement {
	/**
	 * The cached value of the '{@link #getOccurrence() <em>Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrence()
	 * @generated
	 * @ordered
	 */
	protected OccurrenceSpecification occurrence;

	/**
	 * The default value of the '{@link #getDebugId() <em>Debug Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugId()
	 * @generated
	 * @ordered
	 */
	protected static final String DEBUG_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDebugId() <em>Debug Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebugId()
	 * @generated
	 * @ordered
	 */
	protected String debugId = DEBUG_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTick() <em>Tick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTick()
	 * @generated
	 * @ordered
	 */
	protected DTick tick;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSegmentElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DSEGMENT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification getOccurrence() {
		if (occurrence != null && ((EObject)occurrence).eIsProxy()) {
			InternalEObject oldOccurrence = (InternalEObject)occurrence;
			occurrence = (OccurrenceSpecification)eResolveProxy(oldOccurrence);
			if (occurrence != oldOccurrence) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSEGMENT_ELEMENT__OCCURRENCE, oldOccurrence, occurrence));
			}
		}
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceSpecification basicGetOccurrence() {
		return occurrence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOccurrence(OccurrenceSpecification newOccurrence) {
		OccurrenceSpecification oldOccurrence = occurrence;
		occurrence = newOccurrence;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_ELEMENT__OCCURRENCE, oldOccurrence, occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDebugId() {
		return debugId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebugId(String newDebugId) {
		String oldDebugId = debugId;
		debugId = newDebugId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_ELEMENT__DEBUG_ID, oldDebugId, debugId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTick getTick() {
		if (tick != null && tick.eIsProxy()) {
			InternalEObject oldTick = (InternalEObject)tick;
			tick = (DTick)eResolveProxy(oldTick);
			if (tick != oldTick) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSEGMENT_ELEMENT__TICK, oldTick, tick));
			}
		}
		return tick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTick basicGetTick() {
		return tick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTick(DTick newTick, NotificationChain msgs) {
		DTick oldTick = tick;
		tick = newTick;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_ELEMENT__TICK, oldTick, newTick);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTick(DTick newTick) {
		if (newTick != tick) {
			NotificationChain msgs = null;
			if (tick != null)
				msgs = ((InternalEObject)tick).eInverseRemove(this, TimingDPackage.DTICK__SUBJECT, DTick.class, msgs);
			if (newTick != null)
				msgs = ((InternalEObject)newTick).eInverseAdd(this, TimingDPackage.DTICK__SUBJECT, DTick.class, msgs);
			msgs = basicSetTick(newTick, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT_ELEMENT__TICK, newTick, newTick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DSEGMENT_ELEMENT__TICK:
				if (tick != null)
					msgs = ((InternalEObject)tick).eInverseRemove(this, TimingDPackage.DTICK__SUBJECT, DTick.class, msgs);
				return basicSetTick((DTick)otherEnd, msgs);
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
			case TimingDPackage.DSEGMENT_ELEMENT__TICK:
				return basicSetTick(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingDPackage.DSEGMENT_ELEMENT__OCCURRENCE:
				if (resolve) return getOccurrence();
				return basicGetOccurrence();
			case TimingDPackage.DSEGMENT_ELEMENT__DEBUG_ID:
				return getDebugId();
			case TimingDPackage.DSEGMENT_ELEMENT__TICK:
				if (resolve) return getTick();
				return basicGetTick();
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
			case TimingDPackage.DSEGMENT_ELEMENT__OCCURRENCE:
				setOccurrence((OccurrenceSpecification)newValue);
				return;
			case TimingDPackage.DSEGMENT_ELEMENT__DEBUG_ID:
				setDebugId((String)newValue);
				return;
			case TimingDPackage.DSEGMENT_ELEMENT__TICK:
				setTick((DTick)newValue);
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
			case TimingDPackage.DSEGMENT_ELEMENT__OCCURRENCE:
				setOccurrence((OccurrenceSpecification)null);
				return;
			case TimingDPackage.DSEGMENT_ELEMENT__DEBUG_ID:
				setDebugId(DEBUG_ID_EDEFAULT);
				return;
			case TimingDPackage.DSEGMENT_ELEMENT__TICK:
				setTick((DTick)null);
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
			case TimingDPackage.DSEGMENT_ELEMENT__OCCURRENCE:
				return occurrence != null;
			case TimingDPackage.DSEGMENT_ELEMENT__DEBUG_ID:
				return DEBUG_ID_EDEFAULT == null ? debugId != null : !DEBUG_ID_EDEFAULT.equals(debugId);
			case TimingDPackage.DSEGMENT_ELEMENT__TICK:
				return tick != null;
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
		result.append(" (debugId: ");
		result.append(debugId);
		result.append(')');
		return result.toString();
	}

} //DSegmentElementImpl
