/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TNotationFactory.java,v 1.1 2008/09/08 10:23:27 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.common.notation.u2tnotation;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage
 * @generated
 */
public interface U2TNotationFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	U2TNotationFactory eINSTANCE = org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TNotationFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>U2T Diagram Canonical Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>U2T Diagram Canonical Style</em>'.
	 * @generated
	 */
	U2TDiagramCanonicalStyle createU2TDiagramCanonicalStyle();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	U2TNotationPackage getU2TNotationPackage();

} //U2TNotationFactory
