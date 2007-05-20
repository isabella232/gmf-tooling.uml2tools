/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutableByAttributesImpl.java,v 1.1 2007/05/20 19:31:35 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage;
import org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitutable By Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.SubstitutableByAttributesImpl#getSubstitutableBy <em>Substitutable By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstitutableByAttributesImpl extends EObjectImpl implements SubstitutableByAttributes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "";

	/**
	 * The cached value of the '{@link #getSubstitutableBy() <em>Substitutable By</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubstitutableBy()
	 * @generated
	 * @ordered
	 */
	protected EList substitutableBy = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SubstitutableByAttributesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return GMFGenExtPackage.Literals.SUBSTITUTABLE_BY_ATTRIBUTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getSubstitutableBy() {
		if (substitutableBy == null) {
			substitutableBy = new EObjectResolvingEList(GenCommonBase.class, this, GMFGenExtPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY);
		}
		return substitutableBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GMFGenExtPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY:
				return getSubstitutableBy();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GMFGenExtPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY:
				getSubstitutableBy().clear();
				getSubstitutableBy().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case GMFGenExtPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY:
				getSubstitutableBy().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GMFGenExtPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY:
				return substitutableBy != null && !substitutableBy.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SubstitutableByAttributesImpl
