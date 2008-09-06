/**
 * <copyright>
 * </copyright>
 *
 * $Id: DPointConstraintImpl.java,v 1.1 2008/09/06 19:44:14 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DPoint Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DPointConstraintImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DPointConstraintImpl#getConstraintedSegmentElement <em>Constrainted Segment Element</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DPointConstraintImpl extends EObjectImpl implements DPointConstraint {
	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected Constraint constraint;

	/**
	 * The cached value of the '{@link #getConstraintedSegmentElement() <em>Constrainted Segment Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintedSegmentElement()
	 * @generated
	 * @ordered
	 */
	protected DSegmentElement constraintedSegmentElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DPointConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DPOINT_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getConstraint() {
		if (constraint != null && ((EObject)constraint).eIsProxy()) {
			InternalEObject oldConstraint = (InternalEObject)constraint;
			constraint = (Constraint)eResolveProxy(oldConstraint);
			if (constraint != oldConstraint) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
			}
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint basicGetConstraint() {
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraint(Constraint newConstraint) {
		Constraint oldConstraint = constraint;
		constraint = newConstraint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINT, oldConstraint, constraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement getConstraintedSegmentElement() {
		if (constraintedSegmentElement != null && constraintedSegmentElement.eIsProxy()) {
			InternalEObject oldConstraintedSegmentElement = (InternalEObject)constraintedSegmentElement;
			constraintedSegmentElement = (DSegmentElement)eResolveProxy(oldConstraintedSegmentElement);
			if (constraintedSegmentElement != oldConstraintedSegmentElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINTED_SEGMENT_ELEMENT, oldConstraintedSegmentElement, constraintedSegmentElement));
			}
		}
		return constraintedSegmentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement basicGetConstraintedSegmentElement() {
		return constraintedSegmentElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintedSegmentElement(DSegmentElement newConstraintedSegmentElement) {
		DSegmentElement oldConstraintedSegmentElement = constraintedSegmentElement;
		constraintedSegmentElement = newConstraintedSegmentElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINTED_SEGMENT_ELEMENT, oldConstraintedSegmentElement, constraintedSegmentElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINT:
				if (resolve) return getConstraint();
				return basicGetConstraint();
			case TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINTED_SEGMENT_ELEMENT:
				if (resolve) return getConstraintedSegmentElement();
				return basicGetConstraintedSegmentElement();
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
			case TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINT:
				setConstraint((Constraint)newValue);
				return;
			case TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINTED_SEGMENT_ELEMENT:
				setConstraintedSegmentElement((DSegmentElement)newValue);
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
			case TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINT:
				setConstraint((Constraint)null);
				return;
			case TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINTED_SEGMENT_ELEMENT:
				setConstraintedSegmentElement((DSegmentElement)null);
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
			case TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINT:
				return constraint != null;
			case TimingDPackage.DPOINT_CONSTRAINT__CONSTRAINTED_SEGMENT_ELEMENT:
				return constraintedSegmentElement != null;
		}
		return super.eIsSet(featureID);
	}

} //DPointConstraintImpl
