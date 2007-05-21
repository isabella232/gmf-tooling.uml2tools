/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutableByAttributes.java,v 1.2 2007/05/21 02:23:19 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Substitutable By Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes#getSubstitutableByIDs <em>Substitutable By IDs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getSubstitutableByAttributes()
 * @model
 * @generated
 */
public interface SubstitutableByAttributes extends Attributes {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "";

	/**
	 * Returns the value of the '<em><b>Substitutable By IDs</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows to have different notation for same semantic element. Diagram updater should choose some default notation, but should treat any of the substitutable nodes as correct representation for given semantic element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitutable By IDs</em>' attribute list.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getSubstitutableByAttributes_SubstitutableByIDs()
	 * @model type="int"
	 * @generated
	 */
	EList getSubstitutableByIDs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" type="org.eclipse.gmf.codegen.gmfgen.GenCommonBase"
	 * @generated
	 */
	EList getSubstitutableByNodes();

} // SubstitutableByAttributes
