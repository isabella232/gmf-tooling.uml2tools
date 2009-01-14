/**
 * <copyright>
 * </copyright>
 *
 * $Id: NewMenuAllChoices.java,v 1.1 2009/01/14 20:47:10 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Menu All Choices</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuAllChoices#getExclusions <em>Exclusions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuAllChoices()
 * @model
 * @generated
 */
public interface NewMenuAllChoices extends NewMenuEntry {
	/**
	 * Returns the value of the '<em><b>Exclusions</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exclusions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exclusions</em>' reference list.
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuAllChoices_Exclusions()
	 * @model
	 * @generated
	 */
	EList<EClass> getExclusions();

} // NewMenuAllChoices
