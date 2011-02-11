/**
 * <copyright>
 * </copyright>
 *
 * $Id: Fake.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.gmfgraph.Canvas;

import org.eclipse.gmf.tooldef.ToolRegistry;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fake</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Actually not used. See scr https://bugs.eclipse.org/bugs/show_bug.cgi?id=261062 for details
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.Fake#getExplicitGraphdefReference <em>Explicit Graphdef Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.Fake#getExplicitTooldefReference <em>Explicit Tooldef Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getFake()
 * @model abstract="true"
 * @generated
 */
public interface Fake extends EObject {
	/**
   * Returns the value of the '<em><b>Explicit Graphdef Reference</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Graphdef Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Graphdef Reference</em>' reference.
   * @see #setExplicitGraphdefReference(Canvas)
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getFake_ExplicitGraphdefReference()
   * @model
   * @generated
   */
	Canvas getExplicitGraphdefReference();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.Fake#getExplicitGraphdefReference <em>Explicit Graphdef Reference</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Graphdef Reference</em>' reference.
   * @see #getExplicitGraphdefReference()
   * @generated
   */
	void setExplicitGraphdefReference(Canvas value);

	/**
   * Returns the value of the '<em><b>Explicit Tooldef Reference</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Tooldef Reference</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>Explicit Tooldef Reference</em>' reference.
   * @see #setExplicitTooldefReference(ToolRegistry)
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getFake_ExplicitTooldefReference()
   * @model
   * @generated
   */
	ToolRegistry getExplicitTooldefReference();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.Fake#getExplicitTooldefReference <em>Explicit Tooldef Reference</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Explicit Tooldef Reference</em>' reference.
   * @see #getExplicitTooldefReference()
   * @generated
   */
	void setExplicitTooldefReference(ToolRegistry value);

} // Fake
