/**
 * <copyright>
 * </copyright>
 *
 * $Id: DStateSwitchImpl.java,v 1.1 2008/09/09 17:00:33 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DState Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DStateSwitchImpl#getFromSegmentEnd <em>From Segment End</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DStateSwitchImpl#getToSegmentStart <em>To Segment Start</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DStateSwitchImpl#getFromSegment <em>From Segment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DStateSwitchImpl#getToSegment <em>To Segment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DStateSwitchImpl#getFromValueLine <em>From Value Line</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DStateSwitchImpl#getToValueLine <em>To Value Line</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DStateSwitchImpl extends EObjectImpl implements DStateSwitch {
	/**
	 * The cached value of the '{@link #getFromSegmentEnd() <em>From Segment End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSegmentEnd()
	 * @generated
	 * @ordered
	 */
	protected DSegmentEnd fromSegmentEnd;

	/**
	 * The cached value of the '{@link #getToSegmentStart() <em>To Segment Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSegmentStart()
	 * @generated
	 * @ordered
	 */
	protected DSegmentStart toSegmentStart;

	/**
	 * The cached value of the '{@link #getFromSegment() <em>From Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromSegment()
	 * @generated
	 * @ordered
	 */
	protected DSegment fromSegment;

	/**
	 * The cached value of the '{@link #getToSegment() <em>To Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToSegment()
	 * @generated
	 * @ordered
	 */
	protected DSegment toSegment;

	/**
	 * The cached value of the '{@link #getFromValueLine() <em>From Value Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromValueLine()
	 * @generated
	 * @ordered
	 */
	protected DValueLine fromValueLine;

	/**
	 * The cached value of the '{@link #getToValueLine() <em>To Value Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getToValueLine()
	 * @generated
	 * @ordered
	 */
	protected DValueLine toValueLine;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DStateSwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DSTATE_SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentEnd getFromSegmentEnd() {
		if (fromSegmentEnd != null && fromSegmentEnd.eIsProxy()) {
			InternalEObject oldFromSegmentEnd = (InternalEObject)fromSegmentEnd;
			fromSegmentEnd = (DSegmentEnd)eResolveProxy(oldFromSegmentEnd);
			if (fromSegmentEnd != oldFromSegmentEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END, oldFromSegmentEnd, fromSegmentEnd));
			}
		}
		return fromSegmentEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentEnd basicGetFromSegmentEnd() {
		return fromSegmentEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFromSegmentEnd(DSegmentEnd newFromSegmentEnd, NotificationChain msgs) {
		DSegmentEnd oldFromSegmentEnd = fromSegmentEnd;
		fromSegmentEnd = newFromSegmentEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END, oldFromSegmentEnd, newFromSegmentEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromSegmentEnd(DSegmentEnd newFromSegmentEnd) {
		if (newFromSegmentEnd != fromSegmentEnd) {
			NotificationChain msgs = null;
			if (fromSegmentEnd != null)
				msgs = ((InternalEObject)fromSegmentEnd).eInverseRemove(this, TimingDPackage.DSEGMENT_END__SWITCH, DSegmentEnd.class, msgs);
			if (newFromSegmentEnd != null)
				msgs = ((InternalEObject)newFromSegmentEnd).eInverseAdd(this, TimingDPackage.DSEGMENT_END__SWITCH, DSegmentEnd.class, msgs);
			msgs = basicSetFromSegmentEnd(newFromSegmentEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END, newFromSegmentEnd, newFromSegmentEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentStart getToSegmentStart() {
		if (toSegmentStart != null && toSegmentStart.eIsProxy()) {
			InternalEObject oldToSegmentStart = (InternalEObject)toSegmentStart;
			toSegmentStart = (DSegmentStart)eResolveProxy(oldToSegmentStart);
			if (toSegmentStart != oldToSegmentStart) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START, oldToSegmentStart, toSegmentStart));
			}
		}
		return toSegmentStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentStart basicGetToSegmentStart() {
		return toSegmentStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetToSegmentStart(DSegmentStart newToSegmentStart, NotificationChain msgs) {
		DSegmentStart oldToSegmentStart = toSegmentStart;
		toSegmentStart = newToSegmentStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START, oldToSegmentStart, newToSegmentStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSegmentStart(DSegmentStart newToSegmentStart) {
		if (newToSegmentStart != toSegmentStart) {
			NotificationChain msgs = null;
			if (toSegmentStart != null)
				msgs = ((InternalEObject)toSegmentStart).eInverseRemove(this, TimingDPackage.DSEGMENT_START__INCOMING_SWITCH, DSegmentStart.class, msgs);
			if (newToSegmentStart != null)
				msgs = ((InternalEObject)newToSegmentStart).eInverseAdd(this, TimingDPackage.DSEGMENT_START__INCOMING_SWITCH, DSegmentStart.class, msgs);
			msgs = basicSetToSegmentStart(newToSegmentStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START, newToSegmentStart, newToSegmentStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegment getFromSegment() {
		if (fromSegment != null && fromSegment.eIsProxy()) {
			InternalEObject oldFromSegment = (InternalEObject)fromSegment;
			fromSegment = (DSegment)eResolveProxy(oldFromSegment);
			if (fromSegment != oldFromSegment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT, oldFromSegment, fromSegment));
			}
		}
		return fromSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegment basicGetFromSegment() {
		return fromSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromSegment(DSegment newFromSegment) {
		DSegment oldFromSegment = fromSegment;
		fromSegment = newFromSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT, oldFromSegment, fromSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegment getToSegment() {
		if (toSegment != null && toSegment.eIsProxy()) {
			InternalEObject oldToSegment = (InternalEObject)toSegment;
			toSegment = (DSegment)eResolveProxy(oldToSegment);
			if (toSegment != oldToSegment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSTATE_SWITCH__TO_SEGMENT, oldToSegment, toSegment));
			}
		}
		return toSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegment basicGetToSegment() {
		return toSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToSegment(DSegment newToSegment) {
		DSegment oldToSegment = toSegment;
		toSegment = newToSegment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSTATE_SWITCH__TO_SEGMENT, oldToSegment, toSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DValueLine getFromValueLine() {
		if (fromValueLine != null && fromValueLine.eIsProxy()) {
			InternalEObject oldFromValueLine = (InternalEObject)fromValueLine;
			fromValueLine = (DValueLine)eResolveProxy(oldFromValueLine);
			if (fromValueLine != oldFromValueLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSTATE_SWITCH__FROM_VALUE_LINE, oldFromValueLine, fromValueLine));
			}
		}
		return fromValueLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DValueLine basicGetFromValueLine() {
		return fromValueLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromValueLine(DValueLine newFromValueLine) {
		DValueLine oldFromValueLine = fromValueLine;
		fromValueLine = newFromValueLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSTATE_SWITCH__FROM_VALUE_LINE, oldFromValueLine, fromValueLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DValueLine getToValueLine() {
		if (toValueLine != null && toValueLine.eIsProxy()) {
			InternalEObject oldToValueLine = (InternalEObject)toValueLine;
			toValueLine = (DValueLine)eResolveProxy(oldToValueLine);
			if (toValueLine != oldToValueLine) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSTATE_SWITCH__TO_VALUE_LINE, oldToValueLine, toValueLine));
			}
		}
		return toValueLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DValueLine basicGetToValueLine() {
		return toValueLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setToValueLine(DValueLine newToValueLine) {
		DValueLine oldToValueLine = toValueLine;
		toValueLine = newToValueLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSTATE_SWITCH__TO_VALUE_LINE, oldToValueLine, toValueLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END:
				if (fromSegmentEnd != null)
					msgs = ((InternalEObject)fromSegmentEnd).eInverseRemove(this, TimingDPackage.DSEGMENT_END__SWITCH, DSegmentEnd.class, msgs);
				return basicSetFromSegmentEnd((DSegmentEnd)otherEnd, msgs);
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START:
				if (toSegmentStart != null)
					msgs = ((InternalEObject)toSegmentStart).eInverseRemove(this, TimingDPackage.DSEGMENT_START__INCOMING_SWITCH, DSegmentStart.class, msgs);
				return basicSetToSegmentStart((DSegmentStart)otherEnd, msgs);
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
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END:
				return basicSetFromSegmentEnd(null, msgs);
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START:
				return basicSetToSegmentStart(null, msgs);
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
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END:
				if (resolve) return getFromSegmentEnd();
				return basicGetFromSegmentEnd();
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START:
				if (resolve) return getToSegmentStart();
				return basicGetToSegmentStart();
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT:
				if (resolve) return getFromSegment();
				return basicGetFromSegment();
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT:
				if (resolve) return getToSegment();
				return basicGetToSegment();
			case TimingDPackage.DSTATE_SWITCH__FROM_VALUE_LINE:
				if (resolve) return getFromValueLine();
				return basicGetFromValueLine();
			case TimingDPackage.DSTATE_SWITCH__TO_VALUE_LINE:
				if (resolve) return getToValueLine();
				return basicGetToValueLine();
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
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END:
				setFromSegmentEnd((DSegmentEnd)newValue);
				return;
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START:
				setToSegmentStart((DSegmentStart)newValue);
				return;
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT:
				setFromSegment((DSegment)newValue);
				return;
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT:
				setToSegment((DSegment)newValue);
				return;
			case TimingDPackage.DSTATE_SWITCH__FROM_VALUE_LINE:
				setFromValueLine((DValueLine)newValue);
				return;
			case TimingDPackage.DSTATE_SWITCH__TO_VALUE_LINE:
				setToValueLine((DValueLine)newValue);
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
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END:
				setFromSegmentEnd((DSegmentEnd)null);
				return;
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START:
				setToSegmentStart((DSegmentStart)null);
				return;
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT:
				setFromSegment((DSegment)null);
				return;
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT:
				setToSegment((DSegment)null);
				return;
			case TimingDPackage.DSTATE_SWITCH__FROM_VALUE_LINE:
				setFromValueLine((DValueLine)null);
				return;
			case TimingDPackage.DSTATE_SWITCH__TO_VALUE_LINE:
				setToValueLine((DValueLine)null);
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
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT_END:
				return fromSegmentEnd != null;
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT_START:
				return toSegmentStart != null;
			case TimingDPackage.DSTATE_SWITCH__FROM_SEGMENT:
				return fromSegment != null;
			case TimingDPackage.DSTATE_SWITCH__TO_SEGMENT:
				return toSegment != null;
			case TimingDPackage.DSTATE_SWITCH__FROM_VALUE_LINE:
				return fromValueLine != null;
			case TimingDPackage.DSTATE_SWITCH__TO_VALUE_LINE:
				return toValueLine != null;
		}
		return super.eIsSet(featureID);
	}

} //DStateSwitchImpl
