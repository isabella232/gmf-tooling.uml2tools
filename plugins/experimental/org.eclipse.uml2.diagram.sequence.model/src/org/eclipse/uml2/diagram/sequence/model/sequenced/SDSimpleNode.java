/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDSimpleNode.java,v 1.1 2009/01/28 05:27:46 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced;

import org.eclipse.uml2.uml.InteractionFragment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode#getUmlFragment <em>Uml Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage#getSDSimpleNode()
 * @model
 * @generated
 */
public interface SDSimpleNode extends SDBracket {
	/**
	 * Returns the value of the '<em><b>Uml Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Uml Fragment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uml Fragment</em>' reference.
	 * @see #setUmlFragment(InteractionFragment)
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage#getSDSimpleNode_UmlFragment()
	 * @model type="org.eclipse.uml2.diagram.sequence.model.sequenced.UMLInteractionFragment"
	 * @generated
	 */
	InteractionFragment getUmlFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDSimpleNode#getUmlFragment <em>Uml Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uml Fragment</em>' reference.
	 * @see #getUmlFragment()
	 * @generated
	 */
	void setUmlFragment(InteractionFragment value);

} // SDSimpleNode
