/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TNotationPackage.java,v 1.1 2008/09/08 10:23:27 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.common.notation.u2tnotation;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.gmf.runtime.notation.NotationPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationFactory
 * @model kind="package"
 * @generated
 */
public interface U2TNotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "u2tnotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdt/uml2tools/gmf/notation/ext/2008";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml2tools.notation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	U2TNotationPackage eINSTANCE = org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TNotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TDiagramCanonicalStyleImpl <em>U2T Diagram Canonical Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TDiagramCanonicalStyleImpl
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TNotationPackageImpl#getU2TDiagramCanonicalStyle()
	 * @generated
	 */
	int U2T_DIAGRAM_CANONICAL_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Canonical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int U2T_DIAGRAM_CANONICAL_STYLE__CANONICAL = NotationPackage.CANONICAL_STYLE__CANONICAL;

	/**
	 * The feature id for the '<em><b>Sync Nodes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int U2T_DIAGRAM_CANONICAL_STYLE__SYNC_NODES = NotationPackage.CANONICAL_STYLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Sync Links</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int U2T_DIAGRAM_CANONICAL_STYLE__SYNC_LINKS = NotationPackage.CANONICAL_STYLE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Node Types To Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int U2T_DIAGRAM_CANONICAL_STYLE__NODE_TYPES_TO_IGNORE = NotationPackage.CANONICAL_STYLE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Link Types To Ignore</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int U2T_DIAGRAM_CANONICAL_STYLE__LINK_TYPES_TO_IGNORE = NotationPackage.CANONICAL_STYLE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>U2T Diagram Canonical Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int U2T_DIAGRAM_CANONICAL_STYLE_FEATURE_COUNT = NotationPackage.CANONICAL_STYLE_FEATURE_COUNT + 4;


	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle <em>U2T Diagram Canonical Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>U2T Diagram Canonical Style</em>'.
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle
	 * @generated
	 */
	EClass getU2TDiagramCanonicalStyle();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#isSyncNodes <em>Sync Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Nodes</em>'.
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#isSyncNodes()
	 * @see #getU2TDiagramCanonicalStyle()
	 * @generated
	 */
	EAttribute getU2TDiagramCanonicalStyle_SyncNodes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#isSyncLinks <em>Sync Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sync Links</em>'.
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#isSyncLinks()
	 * @see #getU2TDiagramCanonicalStyle()
	 * @generated
	 */
	EAttribute getU2TDiagramCanonicalStyle_SyncLinks();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#getNodeTypesToIgnore <em>Node Types To Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Node Types To Ignore</em>'.
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#getNodeTypesToIgnore()
	 * @see #getU2TDiagramCanonicalStyle()
	 * @generated
	 */
	EAttribute getU2TDiagramCanonicalStyle_NodeTypesToIgnore();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#getLinkTypesToIgnore <em>Link Types To Ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Link Types To Ignore</em>'.
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle#getLinkTypesToIgnore()
	 * @see #getU2TDiagramCanonicalStyle()
	 * @generated
	 */
	EAttribute getU2TDiagramCanonicalStyle_LinkTypesToIgnore();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	U2TNotationFactory getU2TNotationFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TDiagramCanonicalStyleImpl <em>U2T Diagram Canonical Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TDiagramCanonicalStyleImpl
		 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.impl.U2TNotationPackageImpl#getU2TDiagramCanonicalStyle()
		 * @generated
		 */
		EClass U2T_DIAGRAM_CANONICAL_STYLE = eINSTANCE.getU2TDiagramCanonicalStyle();

		/**
		 * The meta object literal for the '<em><b>Sync Nodes</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute U2T_DIAGRAM_CANONICAL_STYLE__SYNC_NODES = eINSTANCE.getU2TDiagramCanonicalStyle_SyncNodes();

		/**
		 * The meta object literal for the '<em><b>Sync Links</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute U2T_DIAGRAM_CANONICAL_STYLE__SYNC_LINKS = eINSTANCE.getU2TDiagramCanonicalStyle_SyncLinks();

		/**
		 * The meta object literal for the '<em><b>Node Types To Ignore</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute U2T_DIAGRAM_CANONICAL_STYLE__NODE_TYPES_TO_IGNORE = eINSTANCE.getU2TDiagramCanonicalStyle_NodeTypesToIgnore();

		/**
		 * The meta object literal for the '<em><b>Link Types To Ignore</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute U2T_DIAGRAM_CANONICAL_STYLE__LINK_TYPES_TO_IGNORE = eINSTANCE.getU2TDiagramCanonicalStyle_LinkTypesToIgnore();

	}

} //U2TNotationPackage
