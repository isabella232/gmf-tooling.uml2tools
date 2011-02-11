/**
 * <copyright>
 * </copyright>
 *
 * $Id: CounterpartSemanticHintAttribute.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Counterpart Semantic Hint Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute#getParentVisualId <em>Parent Visual Id</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute#getChildVisualId <em>Child Visual Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getCounterpartSemanticHintAttribute()
 * @model
 * @generated
 */
public interface CounterpartSemanticHintAttribute extends Attributes {
	/**
   * Returns the value of the '<em><b>Parent Visual Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Passed to view, provides visualId of a view it may be assigned as a child.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Parent Visual Id</em>' attribute.
   * @see #setParentVisualId(String)
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getCounterpartSemanticHintAttribute_ParentVisualId()
   * @model
   * @generated
   */
	String getParentVisualId();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute#getParentVisualId <em>Parent Visual Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent Visual Id</em>' attribute.
   * @see #getParentVisualId()
   * @generated
   */
	void setParentVisualId(String value);

	/**
   * Returns the value of the '<em><b>Child Visual Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Passed to view, provides visualId it has to have in new parent view.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Child Visual Id</em>' attribute.
   * @see #setChildVisualId(String)
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getCounterpartSemanticHintAttribute_ChildVisualId()
   * @model
   * @generated
   */
	String getChildVisualId();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute#getChildVisualId <em>Child Visual Id</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Child Visual Id</em>' attribute.
   * @see #getChildVisualId()
   * @generated
   */
	void setChildVisualId(String value);

} // CounterpartSemanticHintAttribute
