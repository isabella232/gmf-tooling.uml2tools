/**
 * <copyright>
 * </copyright>
 *
 * $Id: DPointConstraint.java,v 1.1 2008/09/09 17:00:33 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DPoint Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint#getConstraint <em>Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint#getConstraintedSegmentElement <em>Constrainted Segment Element</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDPointConstraint()
 * @model
 * @generated
 */
public interface DPointConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' reference.
	 * @see #setConstraint(Constraint)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDPointConstraint_Constraint()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLConstraint"
	 * @generated
	 */
	Constraint getConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint#getConstraint <em>Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint</em>' reference.
	 * @see #getConstraint()
	 * @generated
	 */
	void setConstraint(Constraint value);

	/**
	 * Returns the value of the '<em><b>Constrainted Segment Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constrainted Segment Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constrainted Segment Element</em>' reference.
	 * @see #setConstraintedSegmentElement(DSegmentElement)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDPointConstraint_ConstraintedSegmentElement()
	 * @model
	 * @generated
	 */
	DSegmentElement getConstraintedSegmentElement();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint#getConstraintedSegmentElement <em>Constrainted Segment Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constrainted Segment Element</em>' reference.
	 * @see #getConstraintedSegmentElement()
	 * @generated
	 */
	void setConstraintedSegmentElement(DSegmentElement value);

} // DPointConstraint
