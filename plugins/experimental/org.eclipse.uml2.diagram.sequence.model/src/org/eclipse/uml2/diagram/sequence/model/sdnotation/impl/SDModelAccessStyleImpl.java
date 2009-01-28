/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDModelAccessStyleImpl.java,v 1.1 2009/01/28 13:08:52 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sdnotation.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.gmf.runtime.notation.impl.NamedStyleImpl;

import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle;
import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationPackage;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SD Model Access Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDModelAccessStyleImpl#getFrame <em>Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SDModelAccessStyleImpl extends NamedStyleImpl implements SDModelAccessStyle {
	/**
	 * The cached value of the '{@link #getFrame() <em>Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrame()
	 * @generated
	 * @ordered
	 */
	protected SDFrame frame;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SDModelAccessStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SDNotationPackage.Literals.SD_MODEL_ACCESS_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDFrame getFrame() {
		if (frame != null && frame.eIsProxy()) {
			InternalEObject oldFrame = (InternalEObject)frame;
			frame = (SDFrame)eResolveProxy(oldFrame);
			if (frame != oldFrame) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SDNotationPackage.SD_MODEL_ACCESS_STYLE__FRAME, oldFrame, frame));
			}
		}
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDFrame basicGetFrame() {
		return frame;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(SDFrame newFrame) {
		SDFrame oldFrame = frame;
		frame = newFrame;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SDNotationPackage.SD_MODEL_ACCESS_STYLE__FRAME, oldFrame, frame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SDNotationPackage.SD_MODEL_ACCESS_STYLE__FRAME:
				if (resolve) return getFrame();
				return basicGetFrame();
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
			case SDNotationPackage.SD_MODEL_ACCESS_STYLE__FRAME:
				setFrame((SDFrame)newValue);
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
			case SDNotationPackage.SD_MODEL_ACCESS_STYLE__FRAME:
				setFrame((SDFrame)null);
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
			case SDNotationPackage.SD_MODEL_ACCESS_STYLE__FRAME:
				return frame != null;
		}
		return super.eIsSet(featureID);
	}

} //SDModelAccessStyleImpl
