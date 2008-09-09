/**
 * <copyright>
 * </copyright>
 *
 * $Id: DTick.java,v 1.1 2008/09/09 17:00:33 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.OccurrenceSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DTick</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DTick#getOccurrence <em>Occurrence</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DTick#getBlock <em>Block</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DTick#getSubject <em>Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDTick()
 * @model
 * @generated
 */
public interface DTick extends EObject {
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
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDTick_Occurrence()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLOccurrenceSpecification"
	 * @generated
	 */
	OccurrenceSpecification getOccurrence();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DTick#getOccurrence <em>Occurrence</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Occurrence</em>' reference.
	 * @see #getOccurrence()
	 * @generated
	 */
	void setOccurrence(OccurrenceSpecification value);

	/**
	 * Returns the value of the '<em><b>Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getTicks <em>Ticks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' container reference.
	 * @see #setBlock(DBlock)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDTick_Block()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getTicks
	 * @model opposite="ticks" transient="false"
	 * @generated
	 */
	DBlock getBlock();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DTick#getBlock <em>Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' container reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(DBlock value);

	/**
	 * Returns the value of the '<em><b>Subject</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement#getTick <em>Tick</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subject</em>' reference.
	 * @see #setSubject(DSegmentElement)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDTick_Subject()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegmentElement#getTick
	 * @model opposite="tick"
	 * @generated
	 */
	DSegmentElement getSubject();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DTick#getSubject <em>Subject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subject</em>' reference.
	 * @see #getSubject()
	 * @generated
	 */
	void setSubject(DSegmentElement value);

} // DTick
