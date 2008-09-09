/**
 * <copyright>
 * </copyright>
 *
 * $Id: DTickImpl.java,v 1.1 2008/09/09 01:27:29 mgolubev Exp $
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

import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.DTick;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DTick</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DTickImpl#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DTickImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DTickImpl#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DTickImpl extends EObjectImpl implements DTick {
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
	 * The cached value of the '{@link #getSubject() <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubject()
	 * @generated
	 * @ordered
	 */
	protected DSegmentElement subject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DTickImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DTICK;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DTICK__OCCURRENCE, oldOccurrence, occurrence));
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DTICK__OCCURRENCE, oldOccurrence, occurrence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBlock getBlock() {
		if (eContainerFeatureID != TimingDPackage.DTICK__BLOCK) return null;
		return (DBlock)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(DBlock newBlock, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBlock, TimingDPackage.DTICK__BLOCK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(DBlock newBlock) {
		if (newBlock != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DTICK__BLOCK && newBlock != null)) {
			if (EcoreUtil.isAncestor(this, newBlock))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, TimingDPackage.DBLOCK__TICKS, DBlock.class, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DTICK__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement getSubject() {
		if (subject != null && subject.eIsProxy()) {
			InternalEObject oldSubject = (InternalEObject)subject;
			subject = (DSegmentElement)eResolveProxy(oldSubject);
			if (subject != oldSubject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DTICK__SUBJECT, oldSubject, subject));
			}
		}
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement basicGetSubject() {
		return subject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubject(DSegmentElement newSubject, NotificationChain msgs) {
		DSegmentElement oldSubject = subject;
		subject = newSubject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DTICK__SUBJECT, oldSubject, newSubject);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubject(DSegmentElement newSubject) {
		if (newSubject != subject) {
			NotificationChain msgs = null;
			if (subject != null)
				msgs = ((InternalEObject)subject).eInverseRemove(this, TimingDPackage.DSEGMENT_ELEMENT__TICK, DSegmentElement.class, msgs);
			if (newSubject != null)
				msgs = ((InternalEObject)newSubject).eInverseAdd(this, TimingDPackage.DSEGMENT_ELEMENT__TICK, DSegmentElement.class, msgs);
			msgs = basicSetSubject(newSubject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DTICK__SUBJECT, newSubject, newSubject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DTICK__BLOCK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBlock((DBlock)otherEnd, msgs);
			case TimingDPackage.DTICK__SUBJECT:
				if (subject != null)
					msgs = ((InternalEObject)subject).eInverseRemove(this, TimingDPackage.DSEGMENT_ELEMENT__TICK, DSegmentElement.class, msgs);
				return basicSetSubject((DSegmentElement)otherEnd, msgs);
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
			case TimingDPackage.DTICK__BLOCK:
				return basicSetBlock(null, msgs);
			case TimingDPackage.DTICK__SUBJECT:
				return basicSetSubject(null, msgs);
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
			case TimingDPackage.DTICK__BLOCK:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DBLOCK__TICKS, DBlock.class, msgs);
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
			case TimingDPackage.DTICK__OCCURRENCE:
				if (resolve) return getOccurrence();
				return basicGetOccurrence();
			case TimingDPackage.DTICK__BLOCK:
				return getBlock();
			case TimingDPackage.DTICK__SUBJECT:
				if (resolve) return getSubject();
				return basicGetSubject();
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
			case TimingDPackage.DTICK__OCCURRENCE:
				setOccurrence((OccurrenceSpecification)newValue);
				return;
			case TimingDPackage.DTICK__BLOCK:
				setBlock((DBlock)newValue);
				return;
			case TimingDPackage.DTICK__SUBJECT:
				setSubject((DSegmentElement)newValue);
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
			case TimingDPackage.DTICK__OCCURRENCE:
				setOccurrence((OccurrenceSpecification)null);
				return;
			case TimingDPackage.DTICK__BLOCK:
				setBlock((DBlock)null);
				return;
			case TimingDPackage.DTICK__SUBJECT:
				setSubject((DSegmentElement)null);
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
			case TimingDPackage.DTICK__OCCURRENCE:
				return occurrence != null;
			case TimingDPackage.DTICK__BLOCK:
				return getBlock() != null;
			case TimingDPackage.DTICK__SUBJECT:
				return subject != null;
		}
		return super.eIsSet(featureID);
	}

} //DTickImpl
