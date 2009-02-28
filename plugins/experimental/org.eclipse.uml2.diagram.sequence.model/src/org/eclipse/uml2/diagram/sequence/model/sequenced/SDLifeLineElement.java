/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDLifeLineElement.java,v 1.2 2009/02/28 23:44:29 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sequenced;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Line Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage#getSDLifeLineElement()
 * @model abstract="true"
 * @generated
 */
public interface SDLifeLineElement extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	SDLifeLine getCoveredLifeLine();
} // SDLifeLineElement
