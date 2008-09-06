/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentEnd.java,v 1.1 2008/09/06 19:44:14 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSegment End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd#getSegment <em>Segment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd#getSwitch <em>Switch</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentEnd()
 * @model
 * @generated
 */
public interface DSegmentEnd extends DSegmentElement {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getEnd <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' container reference.
	 * @see #setSegment(DSegment)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentEnd_Segment()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getEnd
	 * @model opposite="end" transient="false"
	 * @generated
	 */
	DSegment getSegment();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd#getSegment <em>Segment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment</em>' container reference.
	 * @see #getSegment()
	 * @generated
	 */
	void setSegment(DSegment value);

	/**
	 * Returns the value of the '<em><b>Switch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switch</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switch</em>' reference.
	 * @see #setSwitch(DStateSwitch)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentEnd_Switch()
	 * @model
	 * @generated
	 */
	DStateSwitch getSwitch();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentEnd#getSwitch <em>Switch</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switch</em>' reference.
	 * @see #getSwitch()
	 * @generated
	 */
	void setSwitch(DStateSwitch value);

} // DSegmentEnd
