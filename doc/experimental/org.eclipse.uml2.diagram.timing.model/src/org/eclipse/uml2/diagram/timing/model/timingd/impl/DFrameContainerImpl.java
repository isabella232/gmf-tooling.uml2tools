/**
 * <copyright>
 * </copyright>
 *
 * $Id: DFrameContainerImpl.java,v 1.3 2008/09/09 00:39:32 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DFrame Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DFrameContainerImpl#getPakkage <em>Pakkage</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DFrameContainerImpl#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DFrameContainerImpl extends EObjectImpl implements DFrameContainer {
	/**
	 * The cached value of the '{@link #getPakkage() <em>Pakkage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPakkage()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Package pakkage;

	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected EList<DFrame> frames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DFrameContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DFRAME_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package getPakkage() {
		if (pakkage != null && ((EObject)pakkage).eIsProxy()) {
			InternalEObject oldPakkage = (InternalEObject)pakkage;
			pakkage = (org.eclipse.uml2.uml.Package)eResolveProxy(oldPakkage);
			if (pakkage != oldPakkage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DFRAME_CONTAINER__PAKKAGE, oldPakkage, pakkage));
			}
		}
		return pakkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Package basicGetPakkage() {
		return pakkage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPakkage(org.eclipse.uml2.uml.Package newPakkage) {
		org.eclipse.uml2.uml.Package oldPakkage = pakkage;
		pakkage = newPakkage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DFRAME_CONTAINER__PAKKAGE, oldPakkage, pakkage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DFrame> getFrames() {
		if (frames == null) {
			frames = new EObjectContainmentWithInverseEList<DFrame>(DFrame.class, this, TimingDPackage.DFRAME_CONTAINER__FRAMES, TimingDPackage.DFRAME__CONTAINER);
		}
		return frames;
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
			case TimingDPackage.DFRAME_CONTAINER__FRAMES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFrames()).basicAdd(otherEnd, msgs);
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
			case TimingDPackage.DFRAME_CONTAINER__FRAMES:
				return ((InternalEList<?>)getFrames()).basicRemove(otherEnd, msgs);
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
			case TimingDPackage.DFRAME_CONTAINER__PAKKAGE:
				if (resolve) return getPakkage();
				return basicGetPakkage();
			case TimingDPackage.DFRAME_CONTAINER__FRAMES:
				return getFrames();
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
			case TimingDPackage.DFRAME_CONTAINER__PAKKAGE:
				setPakkage((org.eclipse.uml2.uml.Package)newValue);
				return;
			case TimingDPackage.DFRAME_CONTAINER__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends DFrame>)newValue);
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
			case TimingDPackage.DFRAME_CONTAINER__PAKKAGE:
				setPakkage((org.eclipse.uml2.uml.Package)null);
				return;
			case TimingDPackage.DFRAME_CONTAINER__FRAMES:
				getFrames().clear();
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
			case TimingDPackage.DFRAME_CONTAINER__PAKKAGE:
				return pakkage != null;
			case TimingDPackage.DFRAME_CONTAINER__FRAMES:
				return frames != null && !frames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DFrameContainerImpl
