/**
 * <copyright>
 * </copyright>
 *
 * $Id: AbstractNewMenuEntry.java,v 1.1 2009/01/14 20:47:10 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract New Menu Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getAbstractNewMenuEntry()
 * @model abstract="true"
 * @generated
 */
public interface AbstractNewMenuEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getEntries <em>Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Context</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' container reference.
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getAbstractNewMenuEntry_Context()
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getEntries
	 * @model opposite="entries" transient="false" changeable="false"
	 * @generated
	 */
	NewMenuContext getContext();

} // AbstractNewMenuEntry
