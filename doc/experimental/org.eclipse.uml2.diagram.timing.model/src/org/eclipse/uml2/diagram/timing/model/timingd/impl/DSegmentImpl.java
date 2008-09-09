/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentImpl.java,v 1.2 2008/09/09 00:39:32 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DSegment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentImpl#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentImpl#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentImpl#getMiddlePoints <em>Middle Points</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DSegmentImpl#getEndSwitch <em>End Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DSegmentImpl extends EObjectImpl implements DSegment {
	/**
	 * The cached value of the '{@link #getStart() <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart()
	 * @generated
	 * @ordered
	 */
	protected DSegmentStart start;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected DSegmentEnd end;

	/**
	 * The cached value of the '{@link #getMiddlePoints() <em>Middle Points</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMiddlePoints()
	 * @generated
	 * @ordered
	 */
	protected EList<DSegmentMiddlePoint> middlePoints;

	/**
	 * The cached value of the '{@link #getEndSwitch() <em>End Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndSwitch()
	 * @generated
	 * @ordered
	 */
	protected DStateSwitch endSwitch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DSEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DValueLine getState() {
		if (eContainerFeatureID != TimingDPackage.DSEGMENT__STATE) return null;
		return (DValueLine)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetState(DValueLine newState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newState, TimingDPackage.DSEGMENT__STATE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState(DValueLine newState) {
		if (newState != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DSEGMENT__STATE && newState != null)) {
			if (EcoreUtil.isAncestor(this, newState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newState != null)
				msgs = ((InternalEObject)newState).eInverseAdd(this, TimingDPackage.DVALUE_LINE__SEGMENTS, DValueLine.class, msgs);
			msgs = basicSetState(newState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT__STATE, newState, newState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentStart getStart() {
		return start;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStart(DSegmentStart newStart, NotificationChain msgs) {
		DSegmentStart oldStart = start;
		start = newStart;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT__START, oldStart, newStart);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart(DSegmentStart newStart) {
		if (newStart != start) {
			NotificationChain msgs = null;
			if (start != null)
				msgs = ((InternalEObject)start).eInverseRemove(this, TimingDPackage.DSEGMENT_START__SEGMENT, DSegmentStart.class, msgs);
			if (newStart != null)
				msgs = ((InternalEObject)newStart).eInverseAdd(this, TimingDPackage.DSEGMENT_START__SEGMENT, DSegmentStart.class, msgs);
			msgs = basicSetStart(newStart, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT__START, newStart, newStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentEnd getEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnd(DSegmentEnd newEnd, NotificationChain msgs) {
		DSegmentEnd oldEnd = end;
		end = newEnd;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT__END, oldEnd, newEnd);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(DSegmentEnd newEnd) {
		if (newEnd != end) {
			NotificationChain msgs = null;
			if (end != null)
				msgs = ((InternalEObject)end).eInverseRemove(this, TimingDPackage.DSEGMENT_END__SEGMENT, DSegmentEnd.class, msgs);
			if (newEnd != null)
				msgs = ((InternalEObject)newEnd).eInverseAdd(this, TimingDPackage.DSEGMENT_END__SEGMENT, DSegmentEnd.class, msgs);
			msgs = basicSetEnd(newEnd, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT__END, newEnd, newEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSegmentMiddlePoint> getMiddlePoints() {
		if (middlePoints == null) {
			middlePoints = new EObjectContainmentWithInverseEList<DSegmentMiddlePoint>(DSegmentMiddlePoint.class, this, TimingDPackage.DSEGMENT__MIDDLE_POINTS, TimingDPackage.DSEGMENT_MIDDLE_POINT__SEGMENT);
		}
		return middlePoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateSwitch getEndSwitch() {
		if (endSwitch != null && endSwitch.eIsProxy()) {
			InternalEObject oldEndSwitch = (InternalEObject)endSwitch;
			endSwitch = (DStateSwitch)eResolveProxy(oldEndSwitch);
			if (endSwitch != oldEndSwitch) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DSEGMENT__END_SWITCH, oldEndSwitch, endSwitch));
			}
		}
		return endSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DStateSwitch basicGetEndSwitch() {
		return endSwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndSwitch(DStateSwitch newEndSwitch) {
		DStateSwitch oldEndSwitch = endSwitch;
		endSwitch = newEndSwitch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DSEGMENT__END_SWITCH, oldEndSwitch, endSwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isClosedSegment() {
		return getEnd() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DSEGMENT__STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetState((DValueLine)otherEnd, msgs);
			case TimingDPackage.DSEGMENT__START:
				if (start != null)
					msgs = ((InternalEObject)start).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingDPackage.DSEGMENT__START, null, msgs);
				return basicSetStart((DSegmentStart)otherEnd, msgs);
			case TimingDPackage.DSEGMENT__END:
				if (end != null)
					msgs = ((InternalEObject)end).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingDPackage.DSEGMENT__END, null, msgs);
				return basicSetEnd((DSegmentEnd)otherEnd, msgs);
			case TimingDPackage.DSEGMENT__MIDDLE_POINTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMiddlePoints()).basicAdd(otherEnd, msgs);
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
			case TimingDPackage.DSEGMENT__STATE:
				return basicSetState(null, msgs);
			case TimingDPackage.DSEGMENT__START:
				return basicSetStart(null, msgs);
			case TimingDPackage.DSEGMENT__END:
				return basicSetEnd(null, msgs);
			case TimingDPackage.DSEGMENT__MIDDLE_POINTS:
				return ((InternalEList<?>)getMiddlePoints()).basicRemove(otherEnd, msgs);
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
			case TimingDPackage.DSEGMENT__STATE:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DVALUE_LINE__SEGMENTS, DValueLine.class, msgs);
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
			case TimingDPackage.DSEGMENT__STATE:
				return getState();
			case TimingDPackage.DSEGMENT__START:
				return getStart();
			case TimingDPackage.DSEGMENT__END:
				return getEnd();
			case TimingDPackage.DSEGMENT__MIDDLE_POINTS:
				return getMiddlePoints();
			case TimingDPackage.DSEGMENT__END_SWITCH:
				if (resolve) return getEndSwitch();
				return basicGetEndSwitch();
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
			case TimingDPackage.DSEGMENT__STATE:
				setState((DValueLine)newValue);
				return;
			case TimingDPackage.DSEGMENT__START:
				setStart((DSegmentStart)newValue);
				return;
			case TimingDPackage.DSEGMENT__END:
				setEnd((DSegmentEnd)newValue);
				return;
			case TimingDPackage.DSEGMENT__MIDDLE_POINTS:
				getMiddlePoints().clear();
				getMiddlePoints().addAll((Collection<? extends DSegmentMiddlePoint>)newValue);
				return;
			case TimingDPackage.DSEGMENT__END_SWITCH:
				setEndSwitch((DStateSwitch)newValue);
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
			case TimingDPackage.DSEGMENT__STATE:
				setState((DValueLine)null);
				return;
			case TimingDPackage.DSEGMENT__START:
				setStart((DSegmentStart)null);
				return;
			case TimingDPackage.DSEGMENT__END:
				setEnd((DSegmentEnd)null);
				return;
			case TimingDPackage.DSEGMENT__MIDDLE_POINTS:
				getMiddlePoints().clear();
				return;
			case TimingDPackage.DSEGMENT__END_SWITCH:
				setEndSwitch((DStateSwitch)null);
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
			case TimingDPackage.DSEGMENT__STATE:
				return getState() != null;
			case TimingDPackage.DSEGMENT__START:
				return start != null;
			case TimingDPackage.DSEGMENT__END:
				return end != null;
			case TimingDPackage.DSEGMENT__MIDDLE_POINTS:
				return middlePoints != null && !middlePoints.isEmpty();
			case TimingDPackage.DSEGMENT__END_SWITCH:
				return endSwitch != null;
		}
		return super.eIsSet(featureID);
	}

} //DSegmentImpl
