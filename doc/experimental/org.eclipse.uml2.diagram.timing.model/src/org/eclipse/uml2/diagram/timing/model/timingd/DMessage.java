/**
 * <copyright>
 * </copyright>
 *
 * $Id: DMessage.java,v 1.1 2008/09/09 00:39:32 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.Message;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DMessage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage#getUmlMessage <em>Uml Message</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage#getMessageSource <em>Message Source</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage#getMessageTarget <em>Message Target</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDMessage()
 * @model
 * @generated
 */
public interface DMessage extends EObject {
	/**
	 * Returns the value of the '<em><b>Uml Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Message</em>' reference.
	 * @see #setUmlMessage(Message)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDMessage_UmlMessage()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLMessage"
	 * @generated
	 */
	Message getUmlMessage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage#getUmlMessage <em>Uml Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Message</em>' reference.
	 * @see #getUmlMessage()
	 * @generated
	 */
	void setUmlMessage(Message value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DFrame#getMessages <em>Messages</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' container reference.
	 * @see #setFrame(DFrame)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDMessage_Frame()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DFrame#getMessages
	 * @model opposite="messages" transient="false"
	 * @generated
	 */
	DFrame getFrame();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage#getFrame <em>Frame</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' container reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(DFrame value);

	/**
	 * Returns the value of the '<em><b>Message Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Source</em>' reference.
	 * @see #setMessageSource(DSegmentElement)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDMessage_MessageSource()
	 * @model
	 * @generated
	 */
	DSegmentElement getMessageSource();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage#getMessageSource <em>Message Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Source</em>' reference.
	 * @see #getMessageSource()
	 * @generated
	 */
	void setMessageSource(DSegmentElement value);

	/**
	 * Returns the value of the '<em><b>Message Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message Target</em>' reference.
	 * @see #setMessageTarget(DSegmentElement)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDMessage_MessageTarget()
	 * @model
	 * @generated
	 */
	DSegmentElement getMessageTarget();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DMessage#getMessageTarget <em>Message Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message Target</em>' reference.
	 * @see #getMessageTarget()
	 * @generated
	 */
	void setMessageTarget(DSegmentElement value);

} // DMessage
