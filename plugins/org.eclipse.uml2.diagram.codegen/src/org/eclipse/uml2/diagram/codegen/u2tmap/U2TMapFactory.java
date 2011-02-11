/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TMapFactory.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage
 * @generated
 */
public interface U2TMapFactory extends EFactory {
	/**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	U2TMapFactory eINSTANCE = org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapFactoryImpl.init();

	/**
   * Returns a new object of class '<em>Mapping Ext</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Mapping Ext</em>'.
   * @generated
   */
	MappingExt createMappingExt();

	/**
   * Returns a new object of class '<em>New Menu Definitions</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>New Menu Definitions</em>'.
   * @generated
   */
	NewMenuDefinitions createNewMenuDefinitions();

	/**
   * Returns a new object of class '<em>New Menu Context</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>New Menu Context</em>'.
   * @generated
   */
	NewMenuContext createNewMenuContext();

	/**
   * Returns a new object of class '<em>New Menu Entry</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>New Menu Entry</em>'.
   * @generated
   */
	NewMenuEntry createNewMenuEntry();

	/**
   * Returns a new object of class '<em>New Menu All Choices</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>New Menu All Choices</em>'.
   * @generated
   */
	NewMenuAllChoices createNewMenuAllChoices();

	/**
   * Returns a new object of class '<em>Separator</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return a new object of class '<em>Separator</em>'.
   * @generated
   */
	Separator createSeparator();

	/**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
	U2TMapPackage getU2TMapPackage();

} //U2TMapFactory
