/**
 * <copyright>
 * </copyright>
 *
 * $Id: DInterval.java,v 1.2 2008/09/09 05:34:18 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DurationConstraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DInterval</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getDurationConstraint <em>Duration Constraint</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getFromTick <em>From Tick</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getToTick <em>To Tick</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval()
 * @model
 * @generated
 */
public interface DInterval extends EObject {
	/**
	 * Returns the value of the '<em><b>Duration Constraint</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration Constraint</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration Constraint</em>' reference.
	 * @see #setDurationConstraint(DurationConstraint)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval_DurationConstraint()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLDurationConstraint"
	 * @generated
	 */
	DurationConstraint getDurationConstraint();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getDurationConstraint <em>Duration Constraint</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration Constraint</em>' reference.
	 * @see #getDurationConstraint()
	 * @generated
	 */
	void setDurationConstraint(DurationConstraint value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(String)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval_Duration()
	 * @model
	 * @generated
	 */
	String getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(String value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DFrame#getIntervals <em>Intervals</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' container reference.
	 * @see #setFrame(DFrame)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval_Frame()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DFrame#getIntervals
	 * @model opposite="intervals" transient="false"
	 * @generated
	 */
	DFrame getFrame();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getFrame <em>Frame</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' container reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(DFrame value);

	/**
	 * Returns the value of the '<em><b>From Tick</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Tick</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Tick</em>' reference.
	 * @see #setFromTick(DTick)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval_FromTick()
	 * @model
	 * @generated
	 */
	DTick getFromTick();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getFromTick <em>From Tick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Tick</em>' reference.
	 * @see #getFromTick()
	 * @generated
	 */
	void setFromTick(DTick value);

	/**
	 * Returns the value of the '<em><b>To Tick</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To Tick</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To Tick</em>' reference.
	 * @see #setToTick(DTick)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDInterval_ToTick()
	 * @model
	 * @generated
	 */
	DTick getToTick();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DInterval#getToTick <em>To Tick</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To Tick</em>' reference.
	 * @see #getToTick()
	 * @generated
	 */
	void setToTick(DTick value);

} // DInterval
