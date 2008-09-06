/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentElementImpl.java,v 1.1 2008/09/06 19:44:14 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingDPackage.DSEGMENT_ELEMENT__OCCURRENCE:
				if (resolve) return getOccurrence();
				return basicGetOccurrence();
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
		}
		return super.eIsSet(featureID);
	}

} //DSegmentElementImpl
