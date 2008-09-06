/**
 * <copyright>
 * </copyright>
 *
 * $Id: DFrameContainer.java,v 1.1 2008/09/06 19:44:14 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.timing.model.timingd;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DFrame Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer#getPakkage <em>Pakkage</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer#getFrames <em>Frames</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDFrameContainer()
 * @model
 * @generated
 */
public interface DFrameContainer extends EObject {
	/**
	 * Returns the value of the '<em><b>Pakkage</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pakkage</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pakkage</em>' reference.
	 * @see #setPakkage(org.eclipse.uml2.uml.Package)
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDFrameContainer_Pakkage()
	 * @model type="org.eclipse.uml2.diagram.timing.model.timingd.UMLPackage"
	 * @generated
	 */
	org.eclipse.uml2.uml.Package getPakkage();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer#getPakkage <em>Pakkage</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pakkage</em>' reference.
	 * @see #getPakkage()
	 * @generated
	 */
	void setPakkage(org.eclipse.uml2.uml.Package value);

	/**
	 * Returns the value of the '<em><b>Frames</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.uml2.diagram.timing.model.timingd.DFrame}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Frames</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Frames</em>' containment reference list.
	 * @see org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage#getDFrameContainer_Frames()
	 * @model containment="true"
	 * @generated
	 */
	EList<DFrame> getFrames();

} // DFrameContainer
