/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDModelAccessStyle.java,v 1.1 2009/01/28 13:08:52 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sdnotation;

import org.eclipse.gmf.runtime.notation.NamedStyle;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SD Model Access Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle#getFrame <em>Frame</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationPackage#getSDModelAccessStyle()
 * @model
 * @generated
 */
public interface SDModelAccessStyle extends NamedStyle {
	public static final String STYLE_NAME = "SDModelAccess";
	
	/**
	 * Returns the value of the '<em><b>Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frame</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frame</em>' reference.
	 * @see #setFrame(SDFrame)
	 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationPackage#getSDModelAccessStyle_Frame()
	 * @model transient="true"
	 * @generated
	 */
	SDFrame getFrame();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle#getFrame <em>Frame</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Frame</em>' reference.
	 * @see #getFrame()
	 * @generated
	 */
	void setFrame(SDFrame value);

} // SDModelAccessStyle
