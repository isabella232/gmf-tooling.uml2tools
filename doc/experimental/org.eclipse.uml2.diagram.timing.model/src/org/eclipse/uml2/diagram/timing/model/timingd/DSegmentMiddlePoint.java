/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentMiddlePoint.java,v 1.1 2008/09/06 19:44:15 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSegment Middle Point</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint#getSegment <em>Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentMiddlePoint()
 * @model
 * @generated
 */
public interface DSegmentMiddlePoint extends DSegmentElement {
	/**
	 * Returns the value of the '<em><b>Segment</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getMiddlePoints <em>Middle Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment</em>' container reference.
	 * @see #setSegment(DSegment)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentMiddlePoint_Segment()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getMiddlePoints
	 * @model opposite="middlePoints" transient="false"
	 * @generated
	 */
	DSegment getSegment();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentMiddlePoint#getSegment <em>Segment</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Segment</em>' container reference.
	 * @see #getSegment()
	 * @generated
	 */
	void setSegment(DSegment value);

} // DSegmentMiddlePoint
