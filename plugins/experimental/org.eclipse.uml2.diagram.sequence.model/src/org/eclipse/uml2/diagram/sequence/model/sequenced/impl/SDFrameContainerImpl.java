/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDFrameContainerImpl.java,v 1.1 2009/02/28 21:17:05 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrameContainer;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frame Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDFrameContainerImpl#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SDFrameContainerImpl extends EObjectImpl implements SDFrameContainer {
	/**
	 * The cached value of the '{@link #getFrames() <em>Frames</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrames()
	 * @generated
	 * @ordered
	 */
	protected EList<SDFrame> frames;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDFrameContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SDPackage.Literals.SD_FRAME_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SDFrame> getFrames() {
		if (frames == null) {
			frames = new EObjectContainmentWithInverseEList<SDFrame>(SDFrame.class, this, SDPackage.SD_FRAME_CONTAINER__FRAMES, SDPackage.SD_FRAME__FRAME_CONTAINER);
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
			case SDPackage.SD_FRAME_CONTAINER__FRAMES:
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
			case SDPackage.SD_FRAME_CONTAINER__FRAMES:
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
			case SDPackage.SD_FRAME_CONTAINER__FRAMES:
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
			case SDPackage.SD_FRAME_CONTAINER__FRAMES:
				getFrames().clear();
				getFrames().addAll((Collection<? extends SDFrame>)newValue);
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
			case SDPackage.SD_FRAME_CONTAINER__FRAMES:
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
			case SDPackage.SD_FRAME_CONTAINER__FRAMES:
				return frames != null && !frames.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SDFrameContainerImpl
