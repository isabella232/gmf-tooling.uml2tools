/**
 * <copyright>
 * </copyright>
 *
 * $Id: TimingDFactory.java,v 1.3 2008/09/09 01:27:29 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage
 * @generated
 */
public interface TimingDFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TimingDFactory eINSTANCE = org.eclipse.uml2.diagram.timing.model.timingd.impl.TimingDFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>DFrame Container</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFrame Container</em>'.
	 * @generated
	 */
	DFrameContainer createDFrameContainer();

	/**
	 * Returns a new object of class '<em>DFrame</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DFrame</em>'.
	 * @generated
	 */
	DFrame createDFrame();

	/**
	 * Returns a new object of class '<em>DBlock</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DBlock</em>'.
	 * @generated
	 */
	DBlock createDBlock();

	/**
	 * Returns a new object of class '<em>DValue Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DValue Line</em>'.
	 * @generated
	 */
	DValueLine createDValueLine();

	/**
	 * Returns a new object of class '<em>DSegment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSegment</em>'.
	 * @generated
	 */
	DSegment createDSegment();

	/**
	 * Returns a new object of class '<em>DSegment Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSegment Element</em>'.
	 * @generated
	 */
	DSegmentElement createDSegmentElement();

	/**
	 * Returns a new object of class '<em>DSegment Middle Point</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSegment Middle Point</em>'.
	 * @generated
	 */
	DSegmentMiddlePoint createDSegmentMiddlePoint();

	/**
	 * Returns a new object of class '<em>DSegment Start</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSegment Start</em>'.
	 * @generated
	 */
	DSegmentStart createDSegmentStart();

	/**
	 * Returns a new object of class '<em>DSegment End</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DSegment End</em>'.
	 * @generated
	 */
	DSegmentEnd createDSegmentEnd();

	/**
	 * Returns a new object of class '<em>DState Switch</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DState Switch</em>'.
	 * @generated
	 */
	DStateSwitch createDStateSwitch();

	/**
	 * Returns a new object of class '<em>DMessage</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DMessage</em>'.
	 * @generated
	 */
	DMessage createDMessage();

	/**
	 * Returns a new object of class '<em>DInterval</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DInterval</em>'.
	 * @generated
	 */
	DInterval createDInterval();

	/**
	 * Returns a new object of class '<em>DPoint Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DPoint Constraint</em>'.
	 * @generated
	 */
	DPointConstraint createDPointConstraint();

	/**
	 * Returns a new object of class '<em>DTick</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DTick</em>'.
	 * @generated
	 */
	DTick createDTick();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TimingDPackage getTimingDPackage();

} //TimingDFactory
