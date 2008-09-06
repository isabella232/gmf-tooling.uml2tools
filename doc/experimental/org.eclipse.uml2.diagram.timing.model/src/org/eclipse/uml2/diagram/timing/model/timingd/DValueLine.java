/**
 * <copyright>
 * </copyright>
 *
 * $Id: DValueLine.java,v 1.1 2008/09/06 19:44:15 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Constraint;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DValue Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getBlock <em>Block</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getInvariantTemplate <em>Invariant Template</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getSegments <em>Segments</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getDisplayName <em>Display Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDValueLine()
 * @model
 * @generated
 */
public interface DValueLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Block</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Block</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Block</em>' container reference.
	 * @see #setBlock(DBlock)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDValueLine_Block()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DBlock#getStates
	 * @model opposite="states" transient="false"
	 * @generated
	 */
	DBlock getBlock();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getBlock <em>Block</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Block</em>' container reference.
	 * @see #getBlock()
	 * @generated
	 */
	void setBlock(DBlock value);

	/**
	 * Returns the value of the '<em><b>Invariant Template</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invariant Template</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariant Template</em>' containment reference.
	 * @see #setInvariantTemplate(Constraint)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDValueLine_InvariantTemplate()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLConstraint" containment="true"
	 * @generated
	 */
	Constraint getInvariantTemplate();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getInvariantTemplate <em>Invariant Template</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invariant Template</em>' containment reference.
	 * @see #getInvariantTemplate()
	 * @generated
	 */
	void setInvariantTemplate(Constraint value);

	/**
	 * Returns the value of the '<em><b>Segments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segments</em>' containment reference list.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDValueLine_Segments()
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.DSegment#getState
	 * @model opposite="state" containment="true"
	 * @generated
	 */
	EList<DSegment> getSegments();

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
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDValueLine_DisplayName()
	 * @model
	 * @generated
	 */
	String getDisplayName();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DValueLine#getDisplayName <em>Display Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Display Name</em>' attribute.
	 * @see #getDisplayName()
	 * @generated
	 */
	void setDisplayName(String value);

} // DValueLine
