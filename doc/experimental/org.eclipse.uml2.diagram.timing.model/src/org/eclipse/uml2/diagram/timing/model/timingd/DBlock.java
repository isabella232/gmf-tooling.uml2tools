/**
 * <copyright>
 * </copyright>
 *
 * $Id: DBlock.java,v 1.1 2008/09/06 19:44:15 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DBlock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getFrame <em>Frame</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getDisplayName <em>Display Name</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getStates <em>States</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getSwitches <em>Switches</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getConstraint <em>Constraint</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDBlock()
 * @model
 * @generated
 */
public interface DBlock extends EObject {
	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' reference.
	 * @see #setLifeline(Lifeline)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDBlock_Lifeline()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLLifeline"
	 * @generated
	 */
	Lifeline getLifeline();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getLifeline <em>Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lifeline</em>' reference.
	 * @see #getLifeline()
	 * @generated
	 */
	void setLifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DFrame#getBlocks <em>Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' container reference.
	 * @see #setFrame(DFrame)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDBlock_Frame()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DFrame#getBlocks
	 * @model opposite="blocks" transient="false"
	 * @generated
	 */
	DFrame getFrame();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getFrame <em>Frame</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' container reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(DFrame value);

	/**
	 * Returns the value of the '<em><b>Display Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Display Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Display Name</em>' attribute.
	 * @see #setDisplayName(String)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDBlock_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDBlock_States()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getBlock
	 * @model opposite="block" containment="true"
	 * @generated
	 */
	EList<DValueLine> getStates();

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.timing.model.timingd.DStateSwitch}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Switches</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Switches</em>' containment reference list.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDBlock_Switches()
	 * @model containment="true"
	 * @generated
	 */
	EList<DStateSwitch> getSwitches();

	/**
	 * Returns the value of the '<em><b>Constraint</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.timing.model.timingd.DPointConstraint}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint</em>' containment reference list.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDBlock_Constraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<DPointConstraint> getConstraint();

} // DBlock
