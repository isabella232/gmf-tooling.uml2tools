/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDFrameContainer.java,v 1.1 2009/02/28 21:17:05 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Frame Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrameContainer#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage#getSDFrameContainer()
 * @model abstract="true"
 * @generated
 */
public interface SDFrameContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame#getFrameContainer <em>Frame Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frames</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference list.
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage#getSDFrameContainer_Frames()
	 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDFrame#getFrameContainer
	 * @model opposite="frameContainer" containment="true"
	 * @generated
	 */
	EList<SDFrame> getFrames();

} // SDFrameContainer
