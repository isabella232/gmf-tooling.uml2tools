/**
 * <copyright>
 * </copyright>
 *
 * $Id: DIntervalImpl.java,v 1.1 2008/09/09 17:00:33 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DInterval;
import org.eclipse.uml2.diagram.timing.model.timingd.DTick;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.uml.DurationConstraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DInterval</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DIntervalImpl#getDurationConstraint <em>Duration Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DIntervalImpl#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DIntervalImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DIntervalImpl#getFromTick <em>From Tick</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DIntervalImpl#getToTick <em>To Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DIntervalImpl extends EObjectImpl implements DInterval {
	/**
	 * The cached value of the '{@link #getDurationConstraint() <em>Duration Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurationConstraint()
	 * @generated
	 * @ordered
	 */
	protected DurationConstraint durationConstraint;

	/**
	 * The default value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected static final String DURATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDuration() <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuration()
	 * @generated
	 * @ordered
	 */
	protected String duration = DURATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFromTick() <em>From Tick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromTick()
	 * @generated
	 * @ordered
	 */
	protected DTick fromTick;

	/**
	 * The cached value of the '{@link #getToTick() <em>To Tick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToTick()
	 * @generated
	 * @ordered
	 */
	protected DTick toTick;

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
	public DurationConstraint getDurationConstraint() {
		if (durationConstraint != null && ((EObject)durationConstraint).eIsProxy()) {
			InternalEObject oldDurationConstraint = (InternalEObject)durationConstraint;
			durationConstraint = (DurationConstraint)eResolveProxy(oldDurationConstraint);
			if (durationConstraint != oldDurationConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DINTERVAL__DURATION_CONSTRAINT, oldDurationConstraint, durationConstraint));
			}
		}
		return durationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationConstraint basicGetDurationConstraint() {
		return durationConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDurationConstraint(DurationConstraint newDurationConstraint) {
		DurationConstraint oldDurationConstraint = durationConstraint;
		durationConstraint = newDurationConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DINTERVAL__DURATION_CONSTRAINT, oldDurationConstraint, durationConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDuration() {
		return duration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDuration(String newDuration) {
		String oldDuration = duration;
		duration = newDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DINTERVAL__DURATION, oldDuration, duration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFrame getFrame() {
		if (eContainerFeatureID != TimingDPackage.DINTERVAL__FRAME) return null;
		return (DFrame)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(DFrame newFrame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFrame, TimingDPackage.DINTERVAL__FRAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(DFrame newFrame) {
		if (newFrame != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DINTERVAL__FRAME && newFrame != null)) {
			if (EcoreUtil.isAncestor(this, newFrame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, TimingDPackage.DFRAME__INTERVALS, DFrame.class, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DINTERVAL__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTick getFromTick() {
		if (fromTick != null && fromTick.eIsProxy()) {
			InternalEObject oldFromTick = (InternalEObject)fromTick;
			fromTick = (DTick)eResolveProxy(oldFromTick);
			if (fromTick != oldFromTick) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DINTERVAL__FROM_TICK, oldFromTick, fromTick));
			}
		}
		return fromTick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTick basicGetFromTick() {
		return fromTick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromTick(DTick newFromTick) {
		DTick oldFromTick = fromTick;
		fromTick = newFromTick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DINTERVAL__FROM_TICK, oldFromTick, fromTick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTick getToTick() {
		if (toTick != null && toTick.eIsProxy()) {
			InternalEObject oldToTick = (InternalEObject)toTick;
			toTick = (DTick)eResolveProxy(oldToTick);
			if (toTick != oldToTick) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DINTERVAL__TO_TICK, oldToTick, toTick));
			}
		}
		return toTick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DTick basicGetToTick() {
		return toTick;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToTick(DTick newToTick) {
		DTick oldToTick = toTick;
		toTick = newToTick;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DINTERVAL__TO_TICK, oldToTick, toTick));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DINTERVAL__FRAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFrame((DFrame)otherEnd, msgs);
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
			case TimingDPackage.DINTERVAL__FRAME:
				return basicSetFrame(null, msgs);
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
			case TimingDPackage.DINTERVAL__FRAME:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DFRAME__INTERVALS, DFrame.class, msgs);
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
			case TimingDPackage.DINTERVAL__DURATION_CONSTRAINT:
				if (resolve) return getDurationConstraint();
				return basicGetDurationConstraint();
			case TimingDPackage.DINTERVAL__DURATION:
				return getDuration();
			case TimingDPackage.DINTERVAL__FRAME:
				return getFrame();
			case TimingDPackage.DINTERVAL__FROM_TICK:
				if (resolve) return getFromTick();
				return basicGetFromTick();
			case TimingDPackage.DINTERVAL__TO_TICK:
				if (resolve) return getToTick();
				return basicGetToTick();
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
			case TimingDPackage.DINTERVAL__DURATION_CONSTRAINT:
				setDurationConstraint((DurationConstraint)newValue);
				return;
			case TimingDPackage.DINTERVAL__DURATION:
				setDuration((String)newValue);
				return;
			case TimingDPackage.DINTERVAL__FRAME:
				setFrame((DFrame)newValue);
				return;
			case TimingDPackage.DINTERVAL__FROM_TICK:
				setFromTick((DTick)newValue);
				return;
			case TimingDPackage.DINTERVAL__TO_TICK:
				setToTick((DTick)newValue);
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
			case TimingDPackage.DINTERVAL__DURATION_CONSTRAINT:
				setDurationConstraint((DurationConstraint)null);
				return;
			case TimingDPackage.DINTERVAL__DURATION:
				setDuration(DURATION_EDEFAULT);
				return;
			case TimingDPackage.DINTERVAL__FRAME:
				setFrame((DFrame)null);
				return;
			case TimingDPackage.DINTERVAL__FROM_TICK:
				setFromTick((DTick)null);
				return;
			case TimingDPackage.DINTERVAL__TO_TICK:
				setToTick((DTick)null);
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
			case TimingDPackage.DINTERVAL__DURATION_CONSTRAINT:
				return durationConstraint != null;
			case TimingDPackage.DINTERVAL__DURATION:
				return DURATION_EDEFAULT == null ? duration != null : !DURATION_EDEFAULT.equals(duration);
			case TimingDPackage.DINTERVAL__FRAME:
				return getFrame() != null;
			case TimingDPackage.DINTERVAL__FROM_TICK:
				return fromTick != null;
			case TimingDPackage.DINTERVAL__TO_TICK:
				return toTick != null;
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
		result.append(" (duration: ");
		result.append(duration);
		result.append(')');
		return result.toString();
	}

} //DIntervalImpl
