/**
 * <copyright>
 * </copyright>
 *
 * $Id: DependencyToolStackSupportAttribute.java,v 1.1 2010/05/14 17:15:02 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dependency Tool Stack Support Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.DependencyToolStackSupportAttribute#getLinkConstraint <em>Link Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getDependencyToolStackSupportAttribute()
 * @model
 * @generated
 */
public interface DependencyToolStackSupportAttribute extends Attributes {
	/**
	 * Returns the value of the '<em><b>Link Constraint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Passed to the link, contains java code for canExist(NamedElement source, NamedElement target, EClass linkClass) generalized method of BaseItemSemanticEditPolicy.LinkConstraints.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Link Constraint</em>' attribute.
	 * @see #setLinkConstraint(String)
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getDependencyToolStackSupportAttribute_LinkConstraint()
	 * @model
	 * @generated
	 */
	String getLinkConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.DependencyToolStackSupportAttribute#getLinkConstraint <em>Link Constraint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Link Constraint</em>' attribute.
	 * @see #getLinkConstraint()
	 * @generated
	 */
	void setLinkConstraint(String value);

} // DependencyToolStackSupportAttribute
