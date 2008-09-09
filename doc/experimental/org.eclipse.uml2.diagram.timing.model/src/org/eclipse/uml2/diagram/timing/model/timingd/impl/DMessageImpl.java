/**
 * <copyright>
 * </copyright>
 *
 * $Id: DMessageImpl.java,v 1.1 2008/09/09 00:39:32 mgolubev Exp $
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
import org.eclipse.uml2.diagram.timing.model.timingd.DMessage;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DMessage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DMessageImpl#getUmlMessage <em>Uml Message</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DMessageImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DMessageImpl#getMessageSource <em>Message Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DMessageImpl#getMessageTarget <em>Message Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DMessageImpl extends EObjectImpl implements DMessage {
	/**
	 * The cached value of the '{@link #getUmlMessage() <em>Uml Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlMessage()
	 * @generated
	 * @ordered
	 */
	protected Message umlMessage;

	/**
	 * The cached value of the '{@link #getMessageSource() <em>Message Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageSource()
	 * @generated
	 * @ordered
	 */
	protected DSegmentElement messageSource;

	/**
	 * The cached value of the '{@link #getMessageTarget() <em>Message Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessageTarget()
	 * @generated
	 * @ordered
	 */
	protected DSegmentElement messageTarget;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DMESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message getUmlMessage() {
		if (umlMessage != null && ((EObject)umlMessage).eIsProxy()) {
			InternalEObject oldUmlMessage = (InternalEObject)umlMessage;
			umlMessage = (Message)eResolveProxy(oldUmlMessage);
			if (umlMessage != oldUmlMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DMESSAGE__UML_MESSAGE, oldUmlMessage, umlMessage));
			}
		}
		return umlMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message basicGetUmlMessage() {
		return umlMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlMessage(Message newUmlMessage) {
		Message oldUmlMessage = umlMessage;
		umlMessage = newUmlMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DMESSAGE__UML_MESSAGE, oldUmlMessage, umlMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFrame getFrame() {
		if (eContainerFeatureID != TimingDPackage.DMESSAGE__FRAME) return null;
		return (DFrame)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(DFrame newFrame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFrame, TimingDPackage.DMESSAGE__FRAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(DFrame newFrame) {
		if (newFrame != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DMESSAGE__FRAME && newFrame != null)) {
			if (EcoreUtil.isAncestor(this, newFrame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, TimingDPackage.DFRAME__MESSAGES, DFrame.class, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DMESSAGE__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement getMessageSource() {
		if (messageSource != null && messageSource.eIsProxy()) {
			InternalEObject oldMessageSource = (InternalEObject)messageSource;
			messageSource = (DSegmentElement)eResolveProxy(oldMessageSource);
			if (messageSource != oldMessageSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DMESSAGE__MESSAGE_SOURCE, oldMessageSource, messageSource));
			}
		}
		return messageSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement basicGetMessageSource() {
		return messageSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageSource(DSegmentElement newMessageSource) {
		DSegmentElement oldMessageSource = messageSource;
		messageSource = newMessageSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DMESSAGE__MESSAGE_SOURCE, oldMessageSource, messageSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement getMessageTarget() {
		if (messageTarget != null && messageTarget.eIsProxy()) {
			InternalEObject oldMessageTarget = (InternalEObject)messageTarget;
			messageTarget = (DSegmentElement)eResolveProxy(oldMessageTarget);
			if (messageTarget != oldMessageTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DMESSAGE__MESSAGE_TARGET, oldMessageTarget, messageTarget));
			}
		}
		return messageTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DSegmentElement basicGetMessageTarget() {
		return messageTarget;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageTarget(DSegmentElement newMessageTarget) {
		DSegmentElement oldMessageTarget = messageTarget;
		messageTarget = newMessageTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DMESSAGE__MESSAGE_TARGET, oldMessageTarget, messageTarget));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TimingDPackage.DMESSAGE__FRAME:
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
			case TimingDPackage.DMESSAGE__FRAME:
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
			case TimingDPackage.DMESSAGE__FRAME:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DFRAME__MESSAGES, DFrame.class, msgs);
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
			case TimingDPackage.DMESSAGE__UML_MESSAGE:
				if (resolve) return getUmlMessage();
				return basicGetUmlMessage();
			case TimingDPackage.DMESSAGE__FRAME:
				return getFrame();
			case TimingDPackage.DMESSAGE__MESSAGE_SOURCE:
				if (resolve) return getMessageSource();
				return basicGetMessageSource();
			case TimingDPackage.DMESSAGE__MESSAGE_TARGET:
				if (resolve) return getMessageTarget();
				return basicGetMessageTarget();
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
			case TimingDPackage.DMESSAGE__UML_MESSAGE:
				setUmlMessage((Message)newValue);
				return;
			case TimingDPackage.DMESSAGE__FRAME:
				setFrame((DFrame)newValue);
				return;
			case TimingDPackage.DMESSAGE__MESSAGE_SOURCE:
				setMessageSource((DSegmentElement)newValue);
				return;
			case TimingDPackage.DMESSAGE__MESSAGE_TARGET:
				setMessageTarget((DSegmentElement)newValue);
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
			case TimingDPackage.DMESSAGE__UML_MESSAGE:
				setUmlMessage((Message)null);
				return;
			case TimingDPackage.DMESSAGE__FRAME:
				setFrame((DFrame)null);
				return;
			case TimingDPackage.DMESSAGE__MESSAGE_SOURCE:
				setMessageSource((DSegmentElement)null);
				return;
			case TimingDPackage.DMESSAGE__MESSAGE_TARGET:
				setMessageTarget((DSegmentElement)null);
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
			case TimingDPackage.DMESSAGE__UML_MESSAGE:
				return umlMessage != null;
			case TimingDPackage.DMESSAGE__FRAME:
				return getFrame() != null;
			case TimingDPackage.DMESSAGE__MESSAGE_SOURCE:
				return messageSource != null;
			case TimingDPackage.DMESSAGE__MESSAGE_TARGET:
				return messageTarget != null;
		}
		return super.eIsSet(featureID);
	}

} //DMessageImpl
