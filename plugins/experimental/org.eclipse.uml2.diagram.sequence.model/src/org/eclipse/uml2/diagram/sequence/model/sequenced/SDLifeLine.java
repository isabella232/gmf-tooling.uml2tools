/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDLifeLine.java,v 1.1 2009/01/28 05:27:46 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced;

import org.eclipse.uml2.uml.Lifeline;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine#getUmlLifeline <em>Uml Lifeline</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine#getFrame <em>Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage#getSDLifeLine()
 * @model
 * @generated
 */
public interface SDLifeLine extends SDBracketContainer {
	/**
	 * Returns the value of the '<em><b>Uml Lifeline</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Lifeline</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Lifeline</em>' reference.
	 * @see #setUmlLifeline(Lifeline)
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage#getSDLifeLine_UmlLifeline()
	 * @model type="org.eclipse.uml2.diagram.sequence.model.sequenced.UMLLifeline" required="true"
	 * @generated
	 */
	Lifeline getUmlLifeline();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDLifeLine#getUmlLifeline <em>Uml Lifeline</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Lifeline</em>' reference.
	 * @see #getUmlLifeline()
	 * @generated
	 */
	void setUmlLifeline(Lifeline value);

	/**
	 * Returns the value of the '<em><b>Frame</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame#getLifelines <em>Lifelines</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' container reference.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage#getSDLifeLine_Frame()
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame#getLifelines
	 * @model opposite="lifelines" required="true" transient="false" changeable="false"
	 * @generated
	 */
	SDFrame getFrame();

} // SDLifeLine
