/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuxSecondaryDiagramNodeAttribute.java,v 1.1 2009/03/10 13:47:21 tfesenko Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aux Secondary Diagram Node Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute#isSubstituteWithCanvasElement <em>Substitute With Canvas Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getAuxSecondaryDiagramNodeAttribute()
 * @model
 * @generated
 */
public interface AuxSecondaryDiagramNodeAttribute extends Attributes {
	/**
	 * Returns the value of the '<em><b>Substitute With Canvas Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * When installed into the top-level node, it should always share the domain element with diagram canvas
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Substitute With Canvas Element</em>' attribute.
	 * @see #setSubstituteWithCanvasElement(boolean)
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getAuxSecondaryDiagramNodeAttribute_SubstituteWithCanvasElement()
	 * @model
	 * @generated
	 */
	boolean isSubstituteWithCanvasElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute#isSubstituteWithCanvasElement <em>Substitute With Canvas Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitute With Canvas Element</em>' attribute.
	 * @see #isSubstituteWithCanvasElement()
	 * @generated
	 */
	void setSubstituteWithCanvasElement(boolean value);

} // AuxSecondaryDiagramNodeAttribute
