/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentStart.java,v 1.1 2008/09/06 19:44:15 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.uml2.uml.StateInvariant;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSegment Start</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart#getStateInvariant <em>State Invariant</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentStart()
 * @model
 * @generated
 */
public interface DSegmentStart extends DSegmentElement {
	/**
	 * Returns the value of the '<em><b>State Invariant</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Invariant</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Invariant</em>' reference.
	 * @see #setStateInvariant(StateInvariant)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentStart_StateInvariant()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLStateInvariant"
	 * @generated
	 */
	StateInvariant getStateInvariant();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart#getStateInvariant <em>State Invariant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Invariant</em>' reference.
	 * @see #getStateInvariant()
	 * @generated
	 */
	void setStateInvariant(StateInvariant value);

	/**
	 * Returns the value of the '<em><b>Segment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getStart <em>Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' container reference.
	 * @see #setSegment(DSegment)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentStart_Segment()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getStart
	 * @model opposite="start" transient="false"
	 * @generated
	 */
	DSegment getSegment();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart#getSegment <em>Segment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment</em>' container reference.
	 * @see #getSegment()
	 * @generated
	 */
	void setSegment(DSegment value);

} // DSegmentStart
