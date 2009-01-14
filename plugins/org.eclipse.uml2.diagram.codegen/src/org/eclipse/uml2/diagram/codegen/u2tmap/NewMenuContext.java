/**
 * <copyright>
 * </copyright>
 *
 * $Id: NewMenuContext.java,v 1.1 2009/01/14 20:47:10 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>New Menu Context</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#isIncludeSubClasses <em>Include Sub Classes</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getImportedEntries <em>Imported Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuContext()
 * @model
 * @generated
 */
public interface NewMenuContext extends EObject {
	/**
	 * Returns the value of the '<em><b>Metaclass</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metaclass</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metaclass</em>' reference.
	 * @see #setMetaclass(EClass)
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuContext_Metaclass()
	 * @model
	 * @generated
	 */
	EClass getMetaclass();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getMetaclass <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metaclass</em>' reference.
	 * @see #getMetaclass()
	 * @generated
	 */
	void setMetaclass(EClass value);

	/**
	 * Returns the value of the '<em><b>Include Sub Classes</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Include Sub Classes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Include Sub Classes</em>' attribute.
	 * @see #setIncludeSubClasses(boolean)
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuContext_IncludeSubClasses()
	 * @model default="true"
	 * @generated
	 */
	boolean isIncludeSubClasses();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#isIncludeSubClasses <em>Include Sub Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Include Sub Classes</em>' attribute.
	 * @see #isIncludeSubClasses()
	 * @generated
	 */
	void setIncludeSubClasses(boolean value);

	/**
	 * Returns the value of the '<em><b>Entries</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry#getContext <em>Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entries</em>' containment reference list.
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuContext_Entries()
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry#getContext
	 * @model opposite="context" containment="true"
	 * @generated
	 */
	EList<AbstractNewMenuEntry> getEntries();

	/**
	 * Returns the value of the '<em><b>Imported Entries</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Imported Entries</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Imported Entries</em>' reference list.
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getNewMenuContext_ImportedEntries()
	 * @model
	 * @generated
	 */
	EList<AbstractNewMenuEntry> getImportedEntries();

} // NewMenuContext
