/**
 * <copyright>
 * </copyright>
 *
 * $Id: DInterval.java,v 1.1 2008/09/06 19:44:15 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DInterval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getFromPoint <em>From Point</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getToPoint <em>To Point</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval()
 * @model
 * @generated
 */
public interface DInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>From Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Point</em>' reference.
	 * @see #setFromPoint(DSegmentElement)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval_FromPoint()
	 * @model
	 * @generated
	 */
	DSegmentElement getFromPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getFromPoint <em>From Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Point</em>' reference.
	 * @see #getFromPoint()
	 * @generated
	 */
	void setFromPoint(DSegmentElement value);

	/**
	 * Returns the value of the '<em><b>To Point</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Point</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Point</em>' reference.
	 * @see #setToPoint(DSegmentElement)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval_ToPoint()
	 * @model
	 * @generated
	 */
	DSegmentElement getToPoint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getToPoint <em>To Point</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Point</em>' reference.
	 * @see #getToPoint()
	 * @generated
	 */
	void setToPoint(DSegmentElement value);

} // DInterval
