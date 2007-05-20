/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutableByAttributes.java,v 1.1 2007/05/20 19:31:35 mgolubev Exp $
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
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes#getSubstitutableBy <em>Substitutable By</em>}</li>
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
	 * Returns the value of the '<em><b>Substitutable By</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.gmf.codegen.gmfgen.GenCommonBase}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Allows to have different notation for same semantic element. Diagram updater should choose some default notation, but should treat any of the substitutable nodes as correct representation for given semantic element
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitutable By</em>' reference list.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getSubstitutableByAttributes_SubstitutableBy()
	 * @model type="org.eclipse.gmf.codegen.gmfgen.GenCommonBase"
	 * @generated
	 */
	EList getSubstitutableBy();

} // SubstitutableByAttributes
