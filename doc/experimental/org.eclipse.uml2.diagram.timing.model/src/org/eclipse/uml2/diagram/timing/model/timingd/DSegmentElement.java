/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentElement.java,v 1.1 2008/09/06 19:44:14 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DSegment Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement#getOccurrence <em>Occurrence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentElement()
 * @model
 * @generated
 */
public interface DSegmentElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Occurrence</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Occurrence</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Occurrence</em>' reference.
	 * @see #setOccurrence(OccurrenceSpecification)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentElement_Occurrence()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLOccurrenceSpecification"
	 * @generated
	 */
	OccurrenceSpecification getOccurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement#getOccurrence <em>Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' reference.
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(OccurrenceSpecification value);

} // DSegmentElement
