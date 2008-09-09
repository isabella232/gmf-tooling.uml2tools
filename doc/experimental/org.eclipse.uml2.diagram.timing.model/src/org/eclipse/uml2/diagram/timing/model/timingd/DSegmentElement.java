/**
 * <copyright>
 * </copyright>
 *
 * $Id: DSegmentElement.java,v 1.3 2008/09/09 00:39:32 mgolubev Exp $
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
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement#getDebugId <em>Debug Id</em>}</li>
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

	/**
	 * Returns the value of the '<em><b>Debug Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Debug Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Debug Id</em>' attribute.
	 * @see #setDebugId(String)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDSegmentElement_DebugId()
	 * @model
	 * @generated
	 */
	String getDebugId();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement#getDebugId <em>Debug Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Debug Id</em>' attribute.
	 * @see #getDebugId()
	 * @generated
	 */
	void setDebugId(String value);

} // DSegmentElement
