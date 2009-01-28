/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDNotationFactory.java,v 1.1 2009/01/28 13:08:52 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sdnotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationPackage
 * @generated
 */
public interface SDNotationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SDNotationFactory eINSTANCE = org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDNotationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>SD Model Access Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SD Model Access Style</em>'.
	 * @generated
	 */
	SDModelAccessStyle createSDModelAccessStyle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SDNotationPackage getSDNotationPackage();

} //SDNotationFactory
