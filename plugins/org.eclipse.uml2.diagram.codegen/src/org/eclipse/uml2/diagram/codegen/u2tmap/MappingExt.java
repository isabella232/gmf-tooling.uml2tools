/**
 * <copyright>
 * </copyright>
 *
 * $Id: MappingExt.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.gmf.mappings.Mapping;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Ext</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.MappingExt#getNewMenuDefs <em>New Menu Defs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getMappingExt()
 * @model
 * @generated
 */
public interface MappingExt extends Mapping {
	/**
   * Returns the value of the '<em><b>New Menu Defs</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>New Menu Defs</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @return the value of the '<em>New Menu Defs</em>' reference.
   * @see #setNewMenuDefs(NewMenuDefinitions)
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#getMappingExt_NewMenuDefs()
   * @model
   * @generated
   */
	NewMenuDefinitions getNewMenuDefs();

	/**
   * Sets the value of the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.MappingExt#getNewMenuDefs <em>New Menu Defs</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param value the new value of the '<em>New Menu Defs</em>' reference.
   * @see #getNewMenuDefs()
   * @generated
   */
	void setNewMenuDefs(NewMenuDefinitions value);

} // MappingExt
