/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TDiagramCanonicalStyleImpl.java,v 1.1 2008/09/08 10:23:26 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.common.notation.u2tnotation.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.gmf.runtime.notation.impl.CanonicalStyleImpl;

import org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle;
import org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>U2T Diagram Canonical Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TDiagramCanonicalStyleImpl#isSyncNodes <em>Sync Nodes</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TDiagramCanonicalStyleImpl#isSyncLinks <em>Sync Links</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TDiagramCanonicalStyleImpl#getNodeTypesToIgnore <em>Node Types To Ignore</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TDiagramCanonicalStyleImpl#getLinkTypesToIgnore <em>Link Types To Ignore</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class U2TDiagramCanonicalStyleImpl extends CanonicalStyleImpl implements U2TDiagramCanonicalStyle {
	/**
	 * The default value of the '{@link #isSyncNodes() <em>Sync Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyncNodes()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNC_NODES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSyncNodes() <em>Sync Nodes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyncNodes()
	 * @generated
	 * @ordered
	 */
	protected boolean syncNodes = SYNC_NODES_EDEFAULT;

	/**
	 * The default value of the '{@link #isSyncLinks() <em>Sync Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyncLinks()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNC_LINKS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSyncLinks() <em>Sync Links</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyncLinks()
	 * @generated
	 * @ordered
	 */
	protected boolean syncLinks = SYNC_LINKS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNodeTypesToIgnore() <em>Node Types To Ignore</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodeTypesToIgnore()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> nodeTypesToIgnore;

	/**
	 * The cached value of the '{@link #getLinkTypesToIgnore() <em>Link Types To Ignore</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinkTypesToIgnore()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> linkTypesToIgnore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected U2TDiagramCanonicalStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return U2TNotationPackage.Literals.U2T_DIAGRAM_CANONICAL_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSyncNodes() {
		return syncNodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncNodes(boolean newSyncNodes) {
		boolean oldSyncNodes = syncNodes;
		syncNodes = newSyncNodes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_NODES, oldSyncNodes, syncNodes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSyncLinks() {
		return syncLinks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSyncLinks(boolean newSyncLinks) {
		boolean oldSyncLinks = syncLinks;
		syncLinks = newSyncLinks;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_LINKS, oldSyncLinks, syncLinks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getNodeTypesToIgnore() {
		if (nodeTypesToIgnore == null) {
			nodeTypesToIgnore = new EDataTypeUniqueEList<Integer>(Integer.class, this, U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__NODE_TYPES_TO_IGNORE);
		}
		return nodeTypesToIgnore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Integer> getLinkTypesToIgnore() {
		if (linkTypesToIgnore == null) {
			linkTypesToIgnore = new EDataTypeUniqueEList<Integer>(Integer.class, this, U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__LINK_TYPES_TO_IGNORE);
		}
		return linkTypesToIgnore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_NODES:
				return isSyncNodes() ? Boolean.TRUE : Boolean.FALSE;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_LINKS:
				return isSyncLinks() ? Boolean.TRUE : Boolean.FALSE;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__NODE_TYPES_TO_IGNORE:
				return getNodeTypesToIgnore();
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__LINK_TYPES_TO_IGNORE:
				return getLinkTypesToIgnore();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_NODES:
				setSyncNodes(((Boolean)newValue).booleanValue());
				return;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_LINKS:
				setSyncLinks(((Boolean)newValue).booleanValue());
				return;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__NODE_TYPES_TO_IGNORE:
				getNodeTypesToIgnore().clear();
				getNodeTypesToIgnore().addAll((Collection<? extends Integer>)newValue);
				return;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__LINK_TYPES_TO_IGNORE:
				getLinkTypesToIgnore().clear();
				getLinkTypesToIgnore().addAll((Collection<? extends Integer>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_NODES:
				setSyncNodes(SYNC_NODES_EDEFAULT);
				return;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_LINKS:
				setSyncLinks(SYNC_LINKS_EDEFAULT);
				return;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__NODE_TYPES_TO_IGNORE:
				getNodeTypesToIgnore().clear();
				return;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__LINK_TYPES_TO_IGNORE:
				getLinkTypesToIgnore().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_NODES:
				return syncNodes != SYNC_NODES_EDEFAULT;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__SYNC_LINKS:
				return syncLinks != SYNC_LINKS_EDEFAULT;
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__NODE_TYPES_TO_IGNORE:
				return nodeTypesToIgnore != null && !nodeTypesToIgnore.isEmpty();
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE__LINK_TYPES_TO_IGNORE:
				return linkTypesToIgnore != null && !linkTypesToIgnore.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (syncNodes: ");
		result.append(syncNodes);
		result.append(", syncLinks: ");
		result.append(syncLinks);
		result.append(", nodeTypesToIgnore: ");
		result.append(nodeTypesToIgnore);
		result.append(", linkTypesToIgnore: ");
		result.append(linkTypesToIgnore);
		result.append(')');
		return result.toString();
	}

} //U2TDiagramCanonicalStyleImpl
