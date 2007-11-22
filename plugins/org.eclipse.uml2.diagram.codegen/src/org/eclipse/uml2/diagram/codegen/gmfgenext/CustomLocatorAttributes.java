/**
 * <copyright>
 * </copyright>
 *
 * $Id: CustomLocatorAttributes.java,v 1.2 2007/11/22 16:59:34 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Custom Locator Attributes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes#getCustomLocatorFQN <em>Custom Locator FQN</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getCustomLocatorAttributes()
 * @model
 * @generated
 */
public interface CustomLocatorAttributes extends Attributes {
	/**
	 * Returns the value of the '<em><b>Custom Locator FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Applicable for gmfgen::GenChildSideAffixedNode only. Allows to customize IBorderItemLocator implementation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Custom Locator FQN</em>' attribute.
	 * @see #setCustomLocatorFQN(String)
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getCustomLocatorAttributes_CustomLocatorFQN()
	 * @model
	 * @generated
	 */
	String getCustomLocatorFQN();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes#getCustomLocatorFQN <em>Custom Locator FQN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Custom Locator FQN</em>' attribute.
	 * @see #getCustomLocatorFQN()
	 * @generated
	 */
	void setCustomLocatorFQN(String value);

} // CustomLocatorAttributes
