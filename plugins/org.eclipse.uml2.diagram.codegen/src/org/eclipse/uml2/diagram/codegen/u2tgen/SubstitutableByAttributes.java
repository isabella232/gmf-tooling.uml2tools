/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutableByAttributes.java,v 1.1 2009/03/10 13:47:21 tfesenko Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitutable By Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes#getSubstitutableByIDs <em>Substitutable By IDs</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes#isRequiresAll <em>Requires All</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getSubstitutableByAttributes()
 * @model
 * @generated
 */
public interface SubstitutableByAttributes extends Attributes {
	/**
	 * Returns the value of the '<em><b>Substitutable By IDs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows to have different notation for same semantic element. Diagram updater should choose some default notation, but should treat any of the substitutable nodes as correct representation for given semantic element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitutable By IDs</em>' attribute list.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getSubstitutableByAttributes_SubstitutableByIDs()
	 * @model
	 * @generated
	 */
	EList<Integer> getSubstitutableByIDs();

	/**
	 * Returns the value of the '<em><b>Requires All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Requires All</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Requires All</em>' attribute.
	 * @see #setRequiresAll(boolean)
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getSubstitutableByAttributes_RequiresAll()
	 * @model
	 * @generated
	 */
	boolean isRequiresAll();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes#isRequiresAll <em>Requires All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Requires All</em>' attribute.
	 * @see #isRequiresAll()
	 * @generated
	 */
	void setRequiresAll(boolean value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	EList<GenCommonBase> getSubstitutableByNodes();

} // SubstitutableByAttributes
