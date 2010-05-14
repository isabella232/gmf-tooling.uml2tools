/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkToolStackSupportAttribute.java,v 1.1 2010/05/14 17:15:02 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link Tool Stack Support Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute#getToolClassProviderName <em>Tool Class Provider Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute#getBaseSemanticClassName <em>Base Semantic Class Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getLinkToolStackSupportAttribute()
 * @model
 * @generated
 */
public interface LinkToolStackSupportAttribute extends Attributes {
	/**
	 * Returns the value of the '<em><b>Tool Class Provider Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Passed to the link, contains name of the class that provides ConnectionCreationTool classes to the stack tools.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tool Class Provider Name</em>' attribute.
	 * @see #setToolClassProviderName(String)
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getLinkToolStackSupportAttribute_ToolClassProviderName()
	 * @model
	 * @generated
	 */
	String getToolClassProviderName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute#getToolClassProviderName <em>Tool Class Provider Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tool Class Provider Name</em>' attribute.
	 * @see #getToolClassProviderName()
	 * @generated
	 */
	void setToolClassProviderName(String value);

	/**
	 * Returns the value of the '<em><b>Base Semantic Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Passed to the link, contains name of the class that is parent to all links created by tools of the stack.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Base Semantic Class Name</em>' attribute.
	 * @see #setBaseSemanticClassName(String)
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getLinkToolStackSupportAttribute_BaseSemanticClassName()
	 * @model
	 * @generated
	 */
	String getBaseSemanticClassName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute#getBaseSemanticClassName <em>Base Semantic Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Semantic Class Name</em>' attribute.
	 * @see #getBaseSemanticClassName()
	 * @generated
	 */
	void setBaseSemanticClassName(String value);

} // LinkToolStackSupportAttribute
