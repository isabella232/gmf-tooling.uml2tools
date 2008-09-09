/**
 * <copyright>
 * </copyright>
 *
 * $Id: DValueLineImpl.java,v 1.1 2008/09/09 17:00:33 mgolubev Exp $
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
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DValue Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DValueLineImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DValueLineImpl#getInvariantTemplate <em>Invariant Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DValueLineImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.impl.DValueLineImpl#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DValueLineImpl extends EObjectImpl implements DValueLine {
	/**
	 * The cached value of the '{@link #getInvariantTemplate() <em>Invariant Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariantTemplate()
	 * @generated
	 * @ordered
	 */
	protected Constraint invariantTemplate;

	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<DSegment> segments;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DValueLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TimingDPackage.Literals.DVALUE_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DBlock getBlock() {
		if (eContainerFeatureID != TimingDPackage.DVALUE_LINE__BLOCK) return null;
		return (DBlock)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(DBlock newBlock, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBlock, TimingDPackage.DVALUE_LINE__BLOCK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(DBlock newBlock) {
		if (newBlock != eInternalContainer() || (eContainerFeatureID != TimingDPackage.DVALUE_LINE__BLOCK && newBlock != null)) {
			if (EcoreUtil.isAncestor(this, newBlock))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, TimingDPackage.DBLOCK__STATES, DBlock.class, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DVALUE_LINE__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Constraint getInvariantTemplate() {
		return invariantTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInvariantTemplate(Constraint newInvariantTemplate, NotificationChain msgs) {
		Constraint oldInvariantTemplate = invariantTemplate;
		invariantTemplate = newInvariantTemplate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE, oldInvariantTemplate, newInvariantTemplate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvariantTemplate(Constraint newInvariantTemplate) {
		if (newInvariantTemplate != invariantTemplate) {
			NotificationChain msgs = null;
			if (invariantTemplate != null)
				msgs = ((InternalEObject)invariantTemplate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE, null, msgs);
			if (newInvariantTemplate != null)
				msgs = ((InternalEObject)newInvariantTemplate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE, null, msgs);
			msgs = basicSetInvariantTemplate(newInvariantTemplate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE, newInvariantTemplate, newInvariantTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DSegment> getSegments() {
		if (segments == null) {
			segments = new EObjectContainmentWithInverseEList<DSegment>(DSegment.class, this, TimingDPackage.DVALUE_LINE__SEGMENTS, TimingDPackage.DSEGMENT__STATE);
		}
		return segments;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TimingDPackage.DVALUE_LINE__DISPLAY_NAME, oldDisplayName, displayName));
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
			case TimingDPackage.DVALUE_LINE__BLOCK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBlock((DBlock)otherEnd, msgs);
			case TimingDPackage.DVALUE_LINE__SEGMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSegments()).basicAdd(otherEnd, msgs);
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
			case TimingDPackage.DVALUE_LINE__BLOCK:
				return basicSetBlock(null, msgs);
			case TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE:
				return basicSetInvariantTemplate(null, msgs);
			case TimingDPackage.DVALUE_LINE__SEGMENTS:
				return ((InternalEList<?>)getSegments()).basicRemove(otherEnd, msgs);
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
			case TimingDPackage.DVALUE_LINE__BLOCK:
				return eInternalContainer().eInverseRemove(this, TimingDPackage.DBLOCK__STATES, DBlock.class, msgs);
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
			case TimingDPackage.DVALUE_LINE__BLOCK:
				return getBlock();
			case TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE:
				return getInvariantTemplate();
			case TimingDPackage.DVALUE_LINE__SEGMENTS:
				return getSegments();
			case TimingDPackage.DVALUE_LINE__DISPLAY_NAME:
				return getDisplayName();
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
			case TimingDPackage.DVALUE_LINE__BLOCK:
				setBlock((DBlock)newValue);
				return;
			case TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE:
				setInvariantTemplate((Constraint)newValue);
				return;
			case TimingDPackage.DVALUE_LINE__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends DSegment>)newValue);
				return;
			case TimingDPackage.DVALUE_LINE__DISPLAY_NAME:
				setDisplayName((String)newValue);
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
			case TimingDPackage.DVALUE_LINE__BLOCK:
				setBlock((DBlock)null);
				return;
			case TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE:
				setInvariantTemplate((Constraint)null);
				return;
			case TimingDPackage.DVALUE_LINE__SEGMENTS:
				getSegments().clear();
				return;
			case TimingDPackage.DVALUE_LINE__DISPLAY_NAME:
				setDisplayName(DISPLAY_NAME_EDEFAULT);
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
			case TimingDPackage.DVALUE_LINE__BLOCK:
				return getBlock() != null;
			case TimingDPackage.DVALUE_LINE__INVARIANT_TEMPLATE:
				return invariantTemplate != null;
			case TimingDPackage.DVALUE_LINE__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case TimingDPackage.DVALUE_LINE__DISPLAY_NAME:
				return DISPLAY_NAME_EDEFAULT == null ? displayName != null : !DISPLAY_NAME_EDEFAULT.equals(displayName);
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

} //DValueLineImpl
