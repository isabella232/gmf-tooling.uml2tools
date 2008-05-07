/**
 * <copyright>
 * </copyright>
 *
 * $Id: GMFGenExtPackageImpl.java,v 1.6 2008/05/07 17:37:33 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer;
import org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute;
import org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes;
import org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes;
import org.eclipse.uml2.diagram.codegen.gmfgenext.DynamicCanonicalCompartment;
import org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtFactory;
import org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage;
import org.eclipse.uml2.diagram.codegen.gmfgenext.InteractionDiagramAttributes;
import org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFGenExtPackageImpl extends EPackageImpl implements GMFGenExtPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auxSecondaryDiagramNodeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass customLocatorAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass detailsLevelAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass substitutableByAttributesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractDynamicCanonicalContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dynamicCanonicalCompartmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionDiagramAttributesEClass = null;

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
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GMFGenExtPackageImpl() {
		super(eNS_URI, GMFGenExtFactory.eINSTANCE);
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
	public static GMFGenExtPackage init() {
		if (isInited) return (GMFGenExtPackage)EPackage.Registry.INSTANCE.getEPackage(GMFGenExtPackage.eNS_URI);

		// Obtain or create and register package
		GMFGenExtPackageImpl theGMFGenExtPackage = (GMFGenExtPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof GMFGenExtPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new GMFGenExtPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GMFGenPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGMFGenExtPackage.createPackageContents();

		// Initialize created meta-data
		theGMFGenExtPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGMFGenExtPackage.freeze();

		return theGMFGenExtPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuxSecondaryDiagramNodeAttribute() {
		return auxSecondaryDiagramNodeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuxSecondaryDiagramNodeAttribute_SubstituteWithCanvasElement() {
		return (EAttribute)auxSecondaryDiagramNodeAttributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCustomLocatorAttributes() {
		return customLocatorAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCustomLocatorAttributes_CustomLocatorFQN() {
		return (EAttribute)customLocatorAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetailsLevelAttributes() {
		return detailsLevelAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsLevelAttributes_FilteringCompartment() {
		return (EAttribute)detailsLevelAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDetailsLevelAttributes_DetailsAwareParser() {
		return (EAttribute)detailsLevelAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubstitutableByAttributes() {
		return substitutableByAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutableByAttributes_SubstitutableByIDs() {
		return (EAttribute)substitutableByAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubstitutableByAttributes_RequiresAll() {
		return (EAttribute)substitutableByAttributesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractDynamicCanonicalContainer() {
		return abstractDynamicCanonicalContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDynamicCanonicalContainer_AlwaysCanonicalIDs() {
		return (EAttribute)abstractDynamicCanonicalContainerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbstractDynamicCanonicalContainer_InitiallyCanonical() {
		return (EAttribute)abstractDynamicCanonicalContainerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDynamicCanonicalCompartment() {
		return dynamicCanonicalCompartmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionDiagramAttributes() {
		return interactionDiagramAttributesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionDiagramAttributes_MultiLayered() {
		return (EAttribute)interactionDiagramAttributesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenExtFactory getGMFGenExtFactory() {
		return (GMFGenExtFactory)getEFactoryInstance();
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
		auxSecondaryDiagramNodeAttributeEClass = createEClass(AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE);
		createEAttribute(auxSecondaryDiagramNodeAttributeEClass, AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE__SUBSTITUTE_WITH_CANVAS_ELEMENT);

		customLocatorAttributesEClass = createEClass(CUSTOM_LOCATOR_ATTRIBUTES);
		createEAttribute(customLocatorAttributesEClass, CUSTOM_LOCATOR_ATTRIBUTES__CUSTOM_LOCATOR_FQN);

		detailsLevelAttributesEClass = createEClass(DETAILS_LEVEL_ATTRIBUTES);
		createEAttribute(detailsLevelAttributesEClass, DETAILS_LEVEL_ATTRIBUTES__FILTERING_COMPARTMENT);
		createEAttribute(detailsLevelAttributesEClass, DETAILS_LEVEL_ATTRIBUTES__DETAILS_AWARE_PARSER);

		substitutableByAttributesEClass = createEClass(SUBSTITUTABLE_BY_ATTRIBUTES);
		createEAttribute(substitutableByAttributesEClass, SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY_IDS);
		createEAttribute(substitutableByAttributesEClass, SUBSTITUTABLE_BY_ATTRIBUTES__REQUIRES_ALL);

		abstractDynamicCanonicalContainerEClass = createEClass(ABSTRACT_DYNAMIC_CANONICAL_CONTAINER);
		createEAttribute(abstractDynamicCanonicalContainerEClass, ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS);
		createEAttribute(abstractDynamicCanonicalContainerEClass, ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL);

		dynamicCanonicalCompartmentEClass = createEClass(DYNAMIC_CANONICAL_COMPARTMENT);

		interactionDiagramAttributesEClass = createEClass(INTERACTION_DIAGRAM_ATTRIBUTES);
		createEAttribute(interactionDiagramAttributesEClass, INTERACTION_DIAGRAM_ATTRIBUTES__MULTI_LAYERED);
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
		GMFGenPackage theGMFGenPackage = (GMFGenPackage)EPackage.Registry.INSTANCE.getEPackage(GMFGenPackage.eNS_URI);

		// Add supertypes to classes
		auxSecondaryDiagramNodeAttributeEClass.getESuperTypes().add(theGMFGenPackage.getAttributes());
		customLocatorAttributesEClass.getESuperTypes().add(theGMFGenPackage.getAttributes());
		detailsLevelAttributesEClass.getESuperTypes().add(theGMFGenPackage.getAttributes());
		substitutableByAttributesEClass.getESuperTypes().add(theGMFGenPackage.getAttributes());
		abstractDynamicCanonicalContainerEClass.getESuperTypes().add(theGMFGenPackage.getAttributes());
		dynamicCanonicalCompartmentEClass.getESuperTypes().add(this.getAbstractDynamicCanonicalContainer());
		interactionDiagramAttributesEClass.getESuperTypes().add(theGMFGenPackage.getAttributes());

		// Initialize classes and features; add operations and parameters
		initEClass(auxSecondaryDiagramNodeAttributeEClass, AuxSecondaryDiagramNodeAttribute.class, "AuxSecondaryDiagramNodeAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuxSecondaryDiagramNodeAttribute_SubstituteWithCanvasElement(), ecorePackage.getEBoolean(), "substituteWithCanvasElement", null, 0, 1, AuxSecondaryDiagramNodeAttribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(customLocatorAttributesEClass, CustomLocatorAttributes.class, "CustomLocatorAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCustomLocatorAttributes_CustomLocatorFQN(), ecorePackage.getEString(), "customLocatorFQN", null, 0, 1, CustomLocatorAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(detailsLevelAttributesEClass, DetailsLevelAttributes.class, "DetailsLevelAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDetailsLevelAttributes_FilteringCompartment(), ecorePackage.getEBoolean(), "filteringCompartment", null, 0, 1, DetailsLevelAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDetailsLevelAttributes_DetailsAwareParser(), ecorePackage.getEBoolean(), "detailsAwareParser", null, 0, 1, DetailsLevelAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(substitutableByAttributesEClass, SubstitutableByAttributes.class, "SubstitutableByAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubstitutableByAttributes_SubstitutableByIDs(), ecorePackage.getEInt(), "substitutableByIDs", null, 0, -1, SubstitutableByAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubstitutableByAttributes_RequiresAll(), ecorePackage.getEBoolean(), "requiresAll", null, 0, 1, SubstitutableByAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(substitutableByAttributesEClass, theGMFGenPackage.getGenCommonBase(), "getSubstitutableByNodes", 0, -1);

		initEClass(abstractDynamicCanonicalContainerEClass, AbstractDynamicCanonicalContainer.class, "AbstractDynamicCanonicalContainer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractDynamicCanonicalContainer_AlwaysCanonicalIDs(), ecorePackage.getEInt(), "alwaysCanonicalIDs", null, 0, -1, AbstractDynamicCanonicalContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractDynamicCanonicalContainer_InitiallyCanonical(), ecorePackage.getEBoolean(), "initiallyCanonical", "false", 0, 1, AbstractDynamicCanonicalContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(abstractDynamicCanonicalContainerEClass, theGMFGenPackage.getGenCommonBase(), "getAlwaysCanonicalChildren", 0, -1);

		initEClass(dynamicCanonicalCompartmentEClass, DynamicCanonicalCompartment.class, "DynamicCanonicalCompartment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interactionDiagramAttributesEClass, InteractionDiagramAttributes.class, "InteractionDiagramAttributes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInteractionDiagramAttributes_MultiLayered(), ecorePackage.getEBoolean(), "multiLayered", "true", 0, 1, InteractionDiagramAttributes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GMFGenExtPackageImpl
