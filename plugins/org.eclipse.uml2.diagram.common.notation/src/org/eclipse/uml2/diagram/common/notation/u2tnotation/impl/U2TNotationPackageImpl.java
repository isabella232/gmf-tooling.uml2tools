/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TNotationPackageImpl.java,v 1.1 2008/09/08 10:23:25 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.common.notation.u2tnotation.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmf.runtime.notation.NotationPackage;

import org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TDiagramCanonicalStyle;
import org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationFactory;
import org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class U2TNotationPackageImpl extends EPackageImpl implements U2TNotationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass u2TDiagramCanonicalStyleEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.uml2.diagram.common.notation.u2tnotation.U2TNotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private U2TNotationPackageImpl() {
		super(eNS_URI, U2TNotationFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static U2TNotationPackage init() {
		if (isInited) return (U2TNotationPackage)EPackage.Registry.INSTANCE.getEPackage(U2TNotationPackage.eNS_URI);

		// Obtain or create and register package
		U2TNotationPackageImpl theU2TNotationPackage = (U2TNotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof U2TNotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new U2TNotationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NotationPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theU2TNotationPackage.createPackageContents();

		// Initialize created meta-data
		theU2TNotationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theU2TNotationPackage.freeze();

		return theU2TNotationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getU2TDiagramCanonicalStyle() {
		return u2TDiagramCanonicalStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getU2TDiagramCanonicalStyle_SyncNodes() {
		return (EAttribute)u2TDiagramCanonicalStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getU2TDiagramCanonicalStyle_SyncLinks() {
		return (EAttribute)u2TDiagramCanonicalStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getU2TDiagramCanonicalStyle_NodeTypesToIgnore() {
		return (EAttribute)u2TDiagramCanonicalStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getU2TDiagramCanonicalStyle_LinkTypesToIgnore() {
		return (EAttribute)u2TDiagramCanonicalStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U2TNotationFactory getU2TNotationFactory() {
		return (U2TNotationFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		u2TDiagramCanonicalStyleEClass = createEClass(U2T_DIAGRAM_CANONICAL_STYLE);
		createEAttribute(u2TDiagramCanonicalStyleEClass, U2T_DIAGRAM_CANONICAL_STYLE__SYNC_NODES);
		createEAttribute(u2TDiagramCanonicalStyleEClass, U2T_DIAGRAM_CANONICAL_STYLE__SYNC_LINKS);
		createEAttribute(u2TDiagramCanonicalStyleEClass, U2T_DIAGRAM_CANONICAL_STYLE__NODE_TYPES_TO_IGNORE);
		createEAttribute(u2TDiagramCanonicalStyleEClass, U2T_DIAGRAM_CANONICAL_STYLE__LINK_TYPES_TO_IGNORE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		NotationPackage theNotationPackage = (NotationPackage)EPackage.Registry.INSTANCE.getEPackage(NotationPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		u2TDiagramCanonicalStyleEClass.getESuperTypes().add(theNotationPackage.getCanonicalStyle());

		// Initialize classes and features; add operations and parameters
		initEClass(u2TDiagramCanonicalStyleEClass, U2TDiagramCanonicalStyle.class, "U2TDiagramCanonicalStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getU2TDiagramCanonicalStyle_SyncNodes(), ecorePackage.getEBoolean(), "syncNodes", null, 0, 1, U2TDiagramCanonicalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getU2TDiagramCanonicalStyle_SyncLinks(), ecorePackage.getEBoolean(), "syncLinks", null, 0, 1, U2TDiagramCanonicalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getU2TDiagramCanonicalStyle_NodeTypesToIgnore(), ecorePackage.getEInt(), "nodeTypesToIgnore", null, 0, -1, U2TDiagramCanonicalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getU2TDiagramCanonicalStyle_LinkTypesToIgnore(), ecorePackage.getEInt(), "linkTypesToIgnore", null, 0, -1, U2TDiagramCanonicalStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //U2TNotationPackageImpl
