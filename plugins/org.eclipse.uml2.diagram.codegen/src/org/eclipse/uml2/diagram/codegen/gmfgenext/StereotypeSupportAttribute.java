/**
 * <copyright>
 * </copyright>
 *
 * $Id: StereotypeSupportAttribute.java,v 1.1 2009/02/16 16:05:56 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Stereotype Support Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.StereotypeSupportAttribute#getRole <em>Role</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getStereotypeSupportAttribute()
 * @model
 * @generated
 */
public interface StereotypeSupportAttribute extends Attributes {
	/**
	 * Returns the value of the '<em><b>Role</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.uml2.diagram.codegen.gmfgenext.StereotypeSupportRole}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Role</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Role</em>' attribute.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.StereotypeSupportRole
	 * @see #setRole(StereotypeSupportRole)
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getStereotypeSupportAttribute_Role()
	 * @model
	 * @generated
	 */
	StereotypeSupportRole getRole();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.StereotypeSupportAttribute#getRole <em>Role</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Role</em>' attribute.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.StereotypeSupportRole
	 * @see #getRole()
	 * @generated
	 */
	void setRole(StereotypeSupportRole value);

} // StereotypeSupportAttribute
