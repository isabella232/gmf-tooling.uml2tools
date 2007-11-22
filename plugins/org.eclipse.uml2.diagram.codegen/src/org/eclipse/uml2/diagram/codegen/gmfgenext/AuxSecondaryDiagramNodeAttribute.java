/**
 * <copyright>
 * </copyright>
 *
 * $Id: AuxSecondaryDiagramNodeAttribute.java,v 1.2 2007/11/22 16:59:33 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aux Secondary Diagram Node Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute#isSubstituteWithCanvasElement <em>Substitute With Canvas Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getAuxSecondaryDiagramNodeAttribute()
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
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getAuxSecondaryDiagramNodeAttribute_SubstituteWithCanvasElement()
	 * @model
	 * @generated
	 */
	boolean isSubstituteWithCanvasElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute#isSubstituteWithCanvasElement <em>Substitute With Canvas Element</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Substitute With Canvas Element</em>' attribute.
	 * @see #isSubstituteWithCanvasElement()
	 * @generated
	 */
	void setSubstituteWithCanvasElement(boolean value);

} // AuxSecondaryDiagramNodeAttribute
