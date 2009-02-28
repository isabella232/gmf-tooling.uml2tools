/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDFactory.java,v 1.4 2009/02/28 15:21:20 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage
 * @generated
 */
public interface SDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SDFactory eINSTANCE = org.eclipse.uml2.diagram.sequence.model.sequenced.impl.SDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Model</em>'.
	 * @generated
	 */
	SDModel createSDModel();

	/**
	 * Returns a new object of class '<em>Gate</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate</em>'.
	 * @generated
	 */
	SDGate createSDGate();

	/**
	 * Returns a new object of class '<em>Life Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Life Line</em>'.
	 * @generated
	 */
	SDLifeLine createSDLifeLine();

	/**
	 * Returns a new object of class '<em>Execution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Execution</em>'.
	 * @generated
	 */
	SDExecution createSDExecution();

	/**
	 * Returns a new object of class '<em>Invocation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Invocation</em>'.
	 * @generated
	 */
	SDInvocation createSDInvocation();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	SDMessage createSDMessage();

	/**
	 * Returns a new object of class '<em>Gate Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate Message</em>'.
	 * @generated
	 */
	SDGateMessage createSDGateMessage();

	/**
	 * Returns a new object of class '<em>Gate Message End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Gate Message End</em>'.
	 * @generated
	 */
	SDGateMessageEnd createSDGateMessageEnd();

	/**
	 * Returns a new object of class '<em>Simple Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Node</em>'.
	 * @generated
	 */
	SDSimpleNode createSDSimpleNode();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	SDPackage getSDPackage();

} //SDFactory
