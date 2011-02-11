/**
 * <copyright>
 * </copyright>
 *
 * $Id: NewMenuEntry.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getContainment <em>Containment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuEntry()
 * @model
 * @generated
 */
public interface NewMenuEntry extends AbstractNewMenuEntry {
	/**
   * Returns the value of the '<em><b>Containment</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Containment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Containment</em>' reference.
   * @see #setContainment(EReference)
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuEntry_Containment()
   * @model
   * @generated
   */
	EReference getContainment();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getContainment <em>Containment</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Containment</em>' reference.
   * @see #getContainment()
   * @generated
   */
	void setContainment(EReference value);

	/**
   * Returns the value of the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Display Name</em>' attribute.
   * @see #setDisplayName(String)
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuEntry_DisplayName()
   * @model
   * @generated
   */
	String getDisplayName();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getDisplayName <em>Display Name</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Display Name</em>' attribute.
   * @see #getDisplayName()
   * @generated
   */
	void setDisplayName(String value);

	/**
   * Returns the value of the '<em><b>Children</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EClass}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' reference list.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuEntry_Children()
   * @model required="true"
   * @generated
   */
	EList<EClass> getChildren();

} // NewMenuEntry
