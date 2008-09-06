/**
 * <copyright>
 * </copyright>
 *
 * $Id: DStateSwitch.java,v 1.1 2008/09/06 19:44:15 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DState Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getFromSegmentEnd <em>From Segment End</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getToSegmentStart <em>To Segment Start</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getFromSegment <em>From Segment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getToSegment <em>To Segment</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getFromValueLine <em>From Value Line</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getToValueLine <em>To Value Line</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDStateSwitch()
 * @model
 * @generated
 */
public interface DStateSwitch extends DSegmentElement {
	/**
	 * Returns the value of the '<em><b>From Segment End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Segment End</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Segment End</em>' reference.
	 * @see #setFromSegmentEnd(DSegmentEnd)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDStateSwitch_FromSegmentEnd()
	 * @model
	 * @generated
	 */
	DSegmentEnd getFromSegmentEnd();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getFromSegmentEnd <em>From Segment End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Segment End</em>' reference.
	 * @see #getFromSegmentEnd()
	 * @generated
	 */
	void setFromSegmentEnd(DSegmentEnd value);

	/**
	 * Returns the value of the '<em><b>To Segment Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Segment Start</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Segment Start</em>' reference.
	 * @see #setToSegmentStart(DSegmentStart)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDStateSwitch_ToSegmentStart()
	 * @model
	 * @generated
	 */
	DSegmentStart getToSegmentStart();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getToSegmentStart <em>To Segment Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Segment Start</em>' reference.
	 * @see #getToSegmentStart()
	 * @generated
	 */
	void setToSegmentStart(DSegmentStart value);

	/**
	 * Returns the value of the '<em><b>From Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Segment</em>' reference.
	 * @see #setFromSegment(DSegment)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDStateSwitch_FromSegment()
	 * @model
	 * @generated
	 */
	DSegment getFromSegment();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getFromSegment <em>From Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Segment</em>' reference.
	 * @see #getFromSegment()
	 * @generated
	 */
	void setFromSegment(DSegment value);

	/**
	 * Returns the value of the '<em><b>To Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Segment</em>' reference.
	 * @see #setToSegment(DSegment)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDStateSwitch_ToSegment()
	 * @model
	 * @generated
	 */
	DSegment getToSegment();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getToSegment <em>To Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Segment</em>' reference.
	 * @see #getToSegment()
	 * @generated
	 */
	void setToSegment(DSegment value);

	/**
	 * Returns the value of the '<em><b>From Value Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Value Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Value Line</em>' reference.
	 * @see #setFromValueLine(DValueLine)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDStateSwitch_FromValueLine()
	 * @model
	 * @generated
	 */
	DValueLine getFromValueLine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getFromValueLine <em>From Value Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Value Line</em>' reference.
	 * @see #getFromValueLine()
	 * @generated
	 */
	void setFromValueLine(DValueLine value);

	/**
	 * Returns the value of the '<em><b>To Value Line</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Value Line</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Value Line</em>' reference.
	 * @see #setToValueLine(DValueLine)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDStateSwitch_ToValueLine()
	 * @model
	 * @generated
	 */
	DValueLine getToValueLine();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch#getToValueLine <em>To Value Line</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Value Line</em>' reference.
	 * @see #getToValueLine()
	 * @generated
	 */
	void setToValueLine(DValueLine value);

} // DStateSwitch
