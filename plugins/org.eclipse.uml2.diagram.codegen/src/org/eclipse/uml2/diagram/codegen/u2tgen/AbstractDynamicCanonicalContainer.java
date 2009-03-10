/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractDynamicCanonicalContainer.java,v 1.1 2009/03/10 13:47:21 tfesenko Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Dynamic Canonical Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer#getAlwaysCanonicalIDs <em>Always Canonical IDs</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer#isInitiallyCanonical <em>Initially Canonical</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getAbstractDynamicCanonicalContainer()
 * @model abstract="true"
 * @generated
 */
public interface AbstractDynamicCanonicalContainer extends Attributes {
	/**
	 * Returns the value of the '<em><b>Always Canonical IDs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Always Canonical IDs</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Always Canonical IDs</em>' attribute list.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getAbstractDynamicCanonicalContainer_AlwaysCanonicalIDs()
	 * @model
	 * @generated
	 */
	EList<Integer> getAlwaysCanonicalIDs();

	/**
	 * Returns the value of the '<em><b>Initially Canonical</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initially Canonical</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initially Canonical</em>' attribute.
	 * @see #setInitiallyCanonical(boolean)
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getAbstractDynamicCanonicalContainer_InitiallyCanonical()
	 * @model default="false"
	 * @generated
	 */
	boolean isInitiallyCanonical();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer#isInitiallyCanonical <em>Initially Canonical</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initially Canonical</em>' attribute.
	 * @see #isInitiallyCanonical()
	 * @generated
	 */
	void setInitiallyCanonical(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<GenCommonBase> getAlwaysCanonicalChildren();

} // AbstractDynamicCanonicalContainer
