/**
 * <copyright>
 * </copyright>
 *
 * $Id: GeneralizedLinkConstraintAttribute.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generalized Link Constraint Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute#getLinkConstraint <em>Link Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getGeneralizedLinkConstraintAttribute()
 * @model
 * @generated
 */
public interface GeneralizedLinkConstraintAttribute extends Attributes {
	/**
   * Returns the value of the '<em><b>Link Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * Passed to the link, contains java code for canExist(NamedElement source, NamedElement target, EClass linkClass) generalized method of BaseItemSemanticEditPolicy.LinkConstraints.
   * <!-- end-model-doc -->
   * @return the value of the '<em>Link Constraint</em>' attribute.
   * @see #setLinkConstraint(String)
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getGeneralizedLinkConstraintAttribute_LinkConstraint()
   * @model
   * @generated
   */
	String getLinkConstraint();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute#getLinkConstraint <em>Link Constraint</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>Link Constraint</em>' attribute.
   * @see #getLinkConstraint()
   * @generated
   */
	void setLinkConstraint(String value);

} // GeneralizedLinkConstraintAttribute
