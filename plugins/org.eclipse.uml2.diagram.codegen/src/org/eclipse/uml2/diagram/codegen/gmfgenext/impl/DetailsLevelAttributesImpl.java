/**
 * <copyright>
 * </copyright>
 *
 * $Id: DetailsLevelAttributesImpl.java,v 1.3 2009/01/14 20:47:10 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes;
import org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Details Level Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DetailsLevelAttributesImpl#isFilteringCompartment <em>Filtering Compartment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DetailsLevelAttributesImpl#isDetailsAwareParser <em>Details Aware Parser</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DetailsLevelAttributesImpl extends EObjectImpl implements DetailsLevelAttributes {
	/**
	 * The default value of the '{@link #isFilteringCompartment() <em>Filtering Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilteringCompartment()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTERING_COMPARTMENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilteringCompartment() <em>Filtering Compartment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilteringCompartment()
	 * @generated
	 * @ordered
	 */
	protected boolean filteringCompartment = FILTERING_COMPARTMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isDetailsAwareParser() <em>Details Aware Parser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetailsAwareParser()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETAILS_AWARE_PARSER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDetailsAwareParser() <em>Details Aware Parser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDetailsAwareParser()
	 * @generated
	 * @ordered
	 */
	protected boolean detailsAwareParser = DETAILS_AWARE_PARSER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetailsLevelAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GMFGenExtPackage.Literals.DETAILS_LEVEL_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilteringCompartment() {
		return filteringCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilteringCompartment(boolean newFilteringCompartment) {
		boolean oldFilteringCompartment = filteringCompartment;
		filteringCompartment = newFilteringCompartment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__FILTERING_COMPARTMENT, oldFilteringCompartment, filteringCompartment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDetailsAwareParser() {
		return detailsAwareParser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDetailsAwareParser(boolean newDetailsAwareParser) {
		boolean oldDetailsAwareParser = detailsAwareParser;
		detailsAwareParser = newDetailsAwareParser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__DETAILS_AWARE_PARSER, oldDetailsAwareParser, detailsAwareParser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__FILTERING_COMPARTMENT:
				return isFilteringCompartment() ? Boolean.TRUE : Boolean.FALSE;
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__DETAILS_AWARE_PARSER:
				return isDetailsAwareParser() ? Boolean.TRUE : Boolean.FALSE;
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
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__FILTERING_COMPARTMENT:
				setFilteringCompartment(((Boolean)newValue).booleanValue());
				return;
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__DETAILS_AWARE_PARSER:
				setDetailsAwareParser(((Boolean)newValue).booleanValue());
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
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__FILTERING_COMPARTMENT:
				setFilteringCompartment(FILTERING_COMPARTMENT_EDEFAULT);
				return;
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__DETAILS_AWARE_PARSER:
				setDetailsAwareParser(DETAILS_AWARE_PARSER_EDEFAULT);
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
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__FILTERING_COMPARTMENT:
				return filteringCompartment != FILTERING_COMPARTMENT_EDEFAULT;
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES__DETAILS_AWARE_PARSER:
				return detailsAwareParser != DETAILS_AWARE_PARSER_EDEFAULT;
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
		result.append(" (filteringCompartment: ");
		result.append(filteringCompartment);
		result.append(", detailsAwareParser: ");
		result.append(detailsAwareParser);
		result.append(')');
		return result.toString();
	}

} //DetailsLevelAttributesImpl
