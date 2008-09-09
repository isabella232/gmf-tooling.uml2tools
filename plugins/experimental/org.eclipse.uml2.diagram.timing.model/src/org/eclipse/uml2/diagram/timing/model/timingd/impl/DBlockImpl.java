/**
 * <copyright>
 * </copyright>
 *
 * $Id: DBlockImpl.java,v 1.1 2008/09/09 17:00:33 mgolubev Exp $
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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint;
import org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch;
import org.eclipse.uml2.diagram.timing.model.timingd.DTick;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DBlock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DBlockImpl#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DBlockImpl#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DBlockImpl#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DBlockImpl#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DBlockImpl#getSwitches <em>Switches</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DBlockImpl#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DBlockImpl#getTicks <em>Ticks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DBlockImpl extends EObjectImpl implements DBlock {
	/**
	 * The cached value of the '{@link #getLifeline() <em>Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLifeline()
	 * @generated
	 * @ordered
	 */
	protected Lifeline lifeline;

	/**
	 * The default value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected static final String DISPLAY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDisplayName() <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisplayName()
	 * @generated
	 * @ordered
	 */
	protected String displayName = DISPLAY_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<DValueLine> states;

	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected EList<DStateSwitch> switches;

	/**
	 * The cached value of the '{@link #getConstraint() <em>Constraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<DPointConstraint> constraint;

	/**
	 * The cached value of the '{@link #getTicks() <em>Ticks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTicks()
	 * @generated
	 * @ordered
	 */
	protected EList<DTick> ticks;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DBLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline getLifeline() {
		if (lifeline != null && ((EObject)lifeline).eIsProxy()) {
			InternalEObject oldLifeline = (InternalEObject)lifeline;
			lifeline = (Lifeline)eResolveProxy(oldLifeline);
			if (lifeline != oldLifeline) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TimingDPackage.DBLOCK__LIFELINE, oldLifeline, lifeline));
			}
		}
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Lifeline basicGetLifeline() {
		return lifeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLifeline(Lifeline newLifeline) {
		Lifeline oldLifeline = lifeline;
		lifeline = newLifeline;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DBLOCK__LIFELINE, oldLifeline, lifeline));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DFrame getFrame() {
		if (eContainerFeatureID != TimingDPackage.DBLOCK__FRAME) return null;
		return (DFrame)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrame(DFrame newFrame, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFrame, TimingDPackage.DBLOCK__FRAME, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrame(DFrame newFrame) {
		if (newFrame != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DBLOCK__FRAME && newFrame != null)) {
			if (EcoreUtil.isAncestor(this, newFrame))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFrame != null)
				msgs = ((InternalEObject)newFrame).eInverseAdd(this, TimingDPackage.DFRAME__BLOCKS, DFrame.class, msgs);
			msgs = basicSetFrame(newFrame, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DBLOCK__FRAME, newFrame, newFrame));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDisplayName() {
		return displayName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisplayName(String newDisplayName) {
		String oldDisplayName = displayName;
		displayName = newDisplayName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DBLOCK__DISPLAY_NAME, oldDisplayName, displayName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DValueLine> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<DValueLine>(DValueLine.class, this, TimingDPackage.DBLOCK__STATES, TimingDPackage.DVALUE_LINE__BLOCK);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DStateSwitch> getSwitches() {
		if (switches == null) {
			switches = new EObjectContainmentEList<DStateSwitch>(DStateSwitch.class, this, TimingDPackage.DBLOCK__SWITCHES);
		}
		return switches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DPointConstraint> getConstraint() {
		if (constraint == null) {
			constraint = new EObjectContainmentEList<DPointConstraint>(DPointConstraint.class, this, TimingDPackage.DBLOCK__CONSTRAINT);
		}
		return constraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DTick> getTicks() {
		if (ticks == null) {
			ticks = new EObjectContainmentWithInverseEList<DTick>(DTick.class, this, TimingDPackage.DBLOCK__TICKS, TimingDPackage.DTICK__BLOCK);
		}
		return ticks;
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
			case TimingDPackage.DBLOCK__FRAME:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFrame((DFrame)otherEnd, msgs);
			case TimingDPackage.DBLOCK__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
			case TimingDPackage.DBLOCK__TICKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTicks()).basicAdd(otherEnd, msgs);
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
			case TimingDPackage.DBLOCK__FRAME:
				return basicSetFrame(null, msgs);
			case TimingDPackage.DBLOCK__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case TimingDPackage.DBLOCK__SWITCHES:
				return ((InternalEList<?>)getSwitches()).basicRemove(otherEnd, msgs);
			case TimingDPackage.DBLOCK__CONSTRAINT:
				return ((InternalEList<?>)getConstraint()).basicRemove(otherEnd, msgs);
			case TimingDPackage.DBLOCK__TICKS:
				return ((InternalEList<?>)getTicks()).basicRemove(otherEnd, msgs);
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
			case TimingDPackage.DBLOCK__FRAME:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DFRAME__BLOCKS, DFrame.class, msgs);
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
			case TimingDPackage.DBLOCK__LIFELINE:
				if (resolve) return getLifeline();
				return basicGetLifeline();
			case TimingDPackage.DBLOCK__FRAME:
				return getFrame();
			case TimingDPackage.DBLOCK__DISPLAY_NAME:
				return getDisplayName();
			case TimingDPackage.DBLOCK__STATES:
				return getStates();
			case TimingDPackage.DBLOCK__SWITCHES:
				return getSwitches();
			case TimingDPackage.DBLOCK__CONSTRAINT:
				return getConstraint();
			case TimingDPackage.DBLOCK__TICKS:
				return getTicks();
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
			case TimingDPackage.DBLOCK__LIFELINE:
				setLifeline((Lifeline)newValue);
				return;
			case TimingDPackage.DBLOCK__FRAME:
				setFrame((DFrame)newValue);
				return;
			case TimingDPackage.DBLOCK__DISPLAY_NAME:
				setDisplayName((String)newValue);
				return;
			case TimingDPackage.DBLOCK__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends DValueLine>)newValue);
				return;
			case TimingDPackage.DBLOCK__SWITCHES:
				getSwitches().clear();
				getSwitches().addAll((Collection<? extends DStateSwitch>)newValue);
				return;
			case TimingDPackage.DBLOCK__CONSTRAINT:
				getConstraint().clear();
				getConstraint().addAll((Collection<? extends DPointConstraint>)newValue);
				return;
			case TimingDPackage.DBLOCK__TICKS:
				getTicks().clear();
				getTicks().addAll((Collection<? extends DTick>)newValue);
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
			case TimingDPackage.DBLOCK__LIFELINE:
				setLifeline((Lifeline)null);
				return;
			case TimingDPackage.DBLOCK__FRAME:
				setFrame((DFrame)null);
				return;
			case TimingDPackage.DBLOCK__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
				return;
			case TimingDPackage.DBLOCK__STATES:
				getStates().clear();
				return;
			case TimingDPackage.DBLOCK__SWITCHES:
				getSwitches().clear();
				return;
			case TimingDPackage.DBLOCK__CONSTRAINT:
				getConstraint().clear();
				return;
			case TimingDPackage.DBLOCK__TICKS:
				getTicks().clear();
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
			case TimingDPackage.DBLOCK__LIFELINE:
				return lifeline != null;
			case TimingDPackage.DBLOCK__FRAME:
				return getFrame() != null;
			case TimingDPackage.DBLOCK__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
			case TimingDPackage.DBLOCK__STATES:
				return states != null && !states.isEmpty();
			case TimingDPackage.DBLOCK__SWITCHES:
				return switches != null && !switches.isEmpty();
			case TimingDPackage.DBLOCK__CONSTRAINT:
				return constraint != null && !constraint.isEmpty();
			case TimingDPackage.DBLOCK__TICKS:
				return ticks != null && !ticks.isEmpty();
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
		result.append(" (displayName: ");
		result.append(displayName);
		result.append(')');
		return result.toString();
	}

} //DBlockImpl
