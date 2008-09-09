/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegment.java,v 1.3 2008/09/09 08:30:29 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSegment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getState <em>State</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getStart <em>Start</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getEnd <em>End</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getMiddlePoints <em>Middle Points</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getEndSwitch <em>End Switch</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getStartOccurrence <em>Start Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegment()
 * @model
 * @generated
 */
public interface DSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>State</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getSegments <em>Segments</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' container reference.
	 * @see #setState(DValueLine)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegment_State()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getSegments
	 * @model opposite="segments" transient="false"
	 * @generated
	 */
	DValueLine getState();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getState <em>State</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' container reference.
	 * @see #getState()
	 * @generated
	 */
	void setState(DValueLine value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' containment reference.
	 * @see #setStart(DSegmentStart)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegment_Start()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegmentStart#getSegment
	 * @model opposite="segment" containment="true"
	 * @generated
	 */
	DSegmentStart getStart();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getStart <em>Start</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' containment reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(DSegmentStart value);

	/**
	 * Returns the value of the '<em><b>End</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End</em>' containment reference.
	 * @see #setEnd(DSegmentEnd)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegment_End()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd#getSegment
	 * @model opposite="segment" containment="true"
	 * @generated
	 */
	DSegmentEnd getEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getEnd <em>End</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End</em>' containment reference.
	 * @see #getEnd()
	 * @generated
	 */
	void setEnd(DSegmentEnd value);

	/**
	 * Returns the value of the '<em><b>Middle Points</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint#getSegment <em>Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Middle Points</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Middle Points</em>' containment reference list.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegment_MiddlePoints()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint#getSegment
	 * @model opposite="segment" containment="true"
	 * @generated
	 */
	EList<DSegmentMiddlePoint> getMiddlePoints();

	/**
	 * Returns the value of the '<em><b>End Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Switch</em>' reference.
	 * @see #setEndSwitch(DStateSwitch)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegment_EndSwitch()
	 * @model
	 * @generated
	 */
	DStateSwitch getEndSwitch();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getEndSwitch <em>End Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Switch</em>' reference.
	 * @see #getEndSwitch()
	 * @generated
	 */
	void setEndSwitch(DStateSwitch value);

	/**
	 * Returns the value of the '<em><b>Start Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Occurrence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Occurrence</em>' reference.
	 * @see #setStartOccurrence(OccurrenceSpecification)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegment_StartOccurrence()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLOccurrenceSpecification"
	 * @generated
	 */
	OccurrenceSpecification getStartOccurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getStartOccurrence <em>Start Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Occurrence</em>' reference.
	 * @see #getStartOccurrence()
	 * @generated
	 */
	void setStartOccurrence(OccurrenceSpecification value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isClosedSegment();

} // DSegment
