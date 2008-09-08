/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TDiagramCanonicalStyle.java,v 1.1 2008/09/08 10:23:26 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.common.notation.u2tnotation;

import org.eclipse.emf.common.util.EList;

import org.eclipse.gmf.runtime.notation.CanonicalStyle;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>U2T Diagram Canonical Style</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#isSyncNodes <em>Sync Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#isSyncLinks <em>Sync Links</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#getNodeTypesToIgnore <em>Node Types To Ignore</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#getLinkTypesToIgnore <em>Link Types To Ignore</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage#getU2TDiagramCanonicalStyle()
 * @model
 * @generated
 */
public interface U2TDiagramCanonicalStyle extends CanonicalStyle {
	/**
	 * Returns the value of the '<em><b>Sync Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Replacement for CanonicalStyle for diagram nodes. Provides detailed information about synchronization mode. Allows to force diagram to synchronize nodes/links only, or select specific \"synchronized\" visual IDs
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sync Nodes</em>' attribute.
	 * @see #setSyncNodes(boolean)
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage#getU2TDiagramCanonicalStyle_SyncNodes()
	 * @model
	 * @generated
	 */
	boolean isSyncNodes();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#isSyncNodes <em>Sync Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Nodes</em>' attribute.
	 * @see #isSyncNodes()
	 * @generated
	 */
	void setSyncNodes(boolean value);

	/**
	 * Returns the value of the '<em><b>Sync Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sync Links</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sync Links</em>' attribute.
	 * @see #setSyncLinks(boolean)
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage#getU2TDiagramCanonicalStyle_SyncLinks()
	 * @model
	 * @generated
	 */
	boolean isSyncLinks();

	/**
	 * Sets the value of the '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#isSyncLinks <em>Sync Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sync Links</em>' attribute.
	 * @see #isSyncLinks()
	 * @generated
	 */
	void setSyncLinks(boolean value);

	/**
	 * Returns the value of the '<em><b>Node Types To Ignore</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Node Types To Ignore</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Node Types To Ignore</em>' attribute list.
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage#getU2TDiagramCanonicalStyle_NodeTypesToIgnore()
	 * @model
	 * @generated
	 */
	EList<Integer> getNodeTypesToIgnore();

	/**
	 * Returns the value of the '<em><b>Link Types To Ignore</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Link Types To Ignore</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Link Types To Ignore</em>' attribute list.
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage#getU2TDiagramCanonicalStyle_LinkTypesToIgnore()
	 * @model
	 * @generated
	 */
	EList<Integer> getLinkTypesToIgnore();

} // U2TDiagramCanonicalStyle
