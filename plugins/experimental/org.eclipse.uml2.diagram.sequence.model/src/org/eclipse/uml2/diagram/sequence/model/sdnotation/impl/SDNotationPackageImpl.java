/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDNotationPackageImpl.java,v 1.1 2009/01/28 13:08:52 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sdnotation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.gmf.runtime.notation.NotationPackage;

import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle;
import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationFactory;
import org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationPackage;

import org.eclipse.uml2.diagram.sequence.model.sequenced.SDPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SDNotationPackageImpl extends EPackageImpl implements SDNotationPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sdModelAccessStyleEClass = null;

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
	 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SDNotationPackageImpl() {
		super(eNS_URI, SDNotationFactory.eINSTANCE);
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
	public static SDNotationPackage init() {
		if (isInited) return (SDNotationPackage)EPackage.Registry.INSTANCE.getEPackage(SDNotationPackage.eNS_URI);

		// Obtain or create and register package
		SDNotationPackageImpl theSDNotationPackage = (SDNotationPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SDNotationPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SDNotationPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		NotationPackage.eINSTANCE.eClass();
		SDPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSDNotationPackage.createPackageContents();

		// Initialize created meta-data
		theSDNotationPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSDNotationPackage.freeze();

		return theSDNotationPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSDModelAccessStyle() {
		return sdModelAccessStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSDModelAccessStyle_Frame() {
		return (EReference)sdModelAccessStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SDNotationFactory getSDNotationFactory() {
		return (SDNotationFactory)getEFactoryInstance();
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
		sdModelAccessStyleEClass = createEClass(SD_MODEL_ACCESS_STYLE);
		createEReference(sdModelAccessStyleEClass, SD_MODEL_ACCESS_STYLE__FRAME);
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
		SDPackage theSDPackage = (SDPackage)EPackage.Registry.INSTANCE.getEPackage(SDPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		sdModelAccessStyleEClass.getESuperTypes().add(theNotationPackage.getNamedStyle());

		// Initialize classes and features; add operations and parameters
		initEClass(sdModelAccessStyleEClass, SDModelAccessStyle.class, "SDModelAccessStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSDModelAccessStyle_Frame(), theSDPackage.getSDFrame(), null, "frame", null, 0, 1, SDModelAccessStyle.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //SDNotationPackageImpl
