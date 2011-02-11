/**
 * <copyright>
 * </copyright>
 *
 * $Id: NewMenuDefinitions.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Menu Definitions</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getDefID <em>Def ID</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getImportedContexts <em>Imported Contexts</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getImportedDefinitions <em>Imported Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuDefinitions()
 * @model
 * @generated
 */
public interface NewMenuDefinitions extends EObject {
	/**
   * Returns the value of the '<em><b>Def ID</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Def ID</em>' attribute.
   * @see #setDefID(String)
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuDefinitions_DefID()
   * @model
   * @generated
   */
	String getDefID();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getDefID <em>Def ID</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Def ID</em>' attribute.
   * @see #getDefID()
   * @generated
   */
	void setDefID(String value);

	/**
   * Returns the value of the '<em><b>Contexts</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contexts</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Contexts</em>' containment reference list.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuDefinitions_Contexts()
   * @model containment="true"
   * @generated
   */
	EList<NewMenuContext> getContexts();

	/**
   * Returns the value of the '<em><b>Imported Contexts</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Contexts</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Contexts</em>' reference list.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuDefinitions_ImportedContexts()
   * @model
   * @generated
   */
	EList<NewMenuContext> getImportedContexts();

	/**
   * Returns the value of the '<em><b>Imported Definitions</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions}.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Definitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Definitions</em>' reference list.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuDefinitions_ImportedDefinitions()
   * @model
   * @generated
   */
	EList<NewMenuDefinitions> getImportedDefinitions();

} // NewMenuDefinitions
