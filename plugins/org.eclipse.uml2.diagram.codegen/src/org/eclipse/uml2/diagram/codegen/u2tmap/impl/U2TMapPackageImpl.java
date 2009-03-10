/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TMapPackageImpl.java,v 1.2 2009/03/10 13:47:22 tfesenko Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;
import org.eclipse.gmf.gmfgraph.GMFGraphPackage;
import org.eclipse.gmf.mappings.GMFMapPackage;
import org.eclipse.gmf.tooldef.GMFToolPackage;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;
import org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl;
import org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry;
import org.eclipse.uml2.diagram.codegen.u2tmap.Fake;
import org.eclipse.uml2.diagram.codegen.u2tmap.MappingExt;
import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuAllChoices;
import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext;
import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions;
import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry;
import org.eclipse.uml2.diagram.codegen.u2tmap.Separator;
import org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapFactory;
import org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class U2TMapPackageImpl extends EPackageImpl implements U2TMapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingExtEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newMenuDefinitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newMenuContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractNewMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newMenuEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass newMenuAllChoicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass separatorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fakeEClass = null;

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
	 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private U2TMapPackageImpl() {
		super(eNS_URI, U2TMapFactory.eINSTANCE);
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
	public static U2TMapPackage init() {
		if (isInited) return (U2TMapPackage)EPackage.Registry.INSTANCE.getEPackage(U2TMapPackage.eNS_URI);

		// Obtain or create and register package
		U2TMapPackageImpl theU2TMapPackage = (U2TMapPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof U2TMapPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new U2TMapPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		GMFGenPackage.eINSTANCE.eClass();
		GMFMapPackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		U2TGenPackageImpl theU2TGenPackage = (U2TGenPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(U2TGenPackage.eNS_URI) instanceof U2TGenPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(U2TGenPackage.eNS_URI) : U2TGenPackage.eINSTANCE);

		// Create package meta-data objects
		theU2TMapPackage.createPackageContents();
		theU2TGenPackage.createPackageContents();

		// Initialize created meta-data
		theU2TMapPackage.initializePackageContents();
		theU2TGenPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theU2TMapPackage.freeze();

		return theU2TMapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMappingExt() {
		return mappingExtEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMappingExt_NewMenuDefs() {
		return (EReference)mappingExtEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewMenuDefinitions() {
		return newMenuDefinitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewMenuDefinitions_DefID() {
		return (EAttribute)newMenuDefinitionsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuDefinitions_Contexts() {
		return (EReference)newMenuDefinitionsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuDefinitions_ImportedContexts() {
		return (EReference)newMenuDefinitionsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuDefinitions_ImportedDefinitions() {
		return (EReference)newMenuDefinitionsEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewMenuContext() {
		return newMenuContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuContext_Metaclass() {
		return (EReference)newMenuContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewMenuContext_IncludeSubClasses() {
		return (EAttribute)newMenuContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuContext_Entries() {
		return (EReference)newMenuContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuContext_ImportedEntries() {
		return (EReference)newMenuContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractNewMenuEntry() {
		return abstractNewMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractNewMenuEntry_Context() {
		return (EReference)abstractNewMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewMenuEntry() {
		return newMenuEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuEntry_Containment() {
		return (EReference)newMenuEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNewMenuEntry_DisplayName() {
		return (EAttribute)newMenuEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuEntry_Children() {
		return (EReference)newMenuEntryEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNewMenuAllChoices() {
		return newMenuAllChoicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNewMenuAllChoices_Exclusions() {
		return (EReference)newMenuAllChoicesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSeparator() {
		return separatorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFake() {
		return fakeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFake_ExplicitGraphdefReference() {
		return (EReference)fakeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFake_ExplicitTooldefReference() {
		return (EReference)fakeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U2TMapFactory getU2TMapFactory() {
		return (U2TMapFactory)getEFactoryInstance();
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
		mappingExtEClass = createEClass(MAPPING_EXT);
		createEReference(mappingExtEClass, MAPPING_EXT__NEW_MENU_DEFS);

		newMenuDefinitionsEClass = createEClass(NEW_MENU_DEFINITIONS);
		createEAttribute(newMenuDefinitionsEClass, NEW_MENU_DEFINITIONS__DEF_ID);
		createEReference(newMenuDefinitionsEClass, NEW_MENU_DEFINITIONS__CONTEXTS);
		createEReference(newMenuDefinitionsEClass, NEW_MENU_DEFINITIONS__IMPORTED_CONTEXTS);
		createEReference(newMenuDefinitionsEClass, NEW_MENU_DEFINITIONS__IMPORTED_DEFINITIONS);

		newMenuContextEClass = createEClass(NEW_MENU_CONTEXT);
		createEReference(newMenuContextEClass, NEW_MENU_CONTEXT__METACLASS);
		createEAttribute(newMenuContextEClass, NEW_MENU_CONTEXT__INCLUDE_SUB_CLASSES);
		createEReference(newMenuContextEClass, NEW_MENU_CONTEXT__ENTRIES);
		createEReference(newMenuContextEClass, NEW_MENU_CONTEXT__IMPORTED_ENTRIES);

		abstractNewMenuEntryEClass = createEClass(ABSTRACT_NEW_MENU_ENTRY);
		createEReference(abstractNewMenuEntryEClass, ABSTRACT_NEW_MENU_ENTRY__CONTEXT);

		newMenuEntryEClass = createEClass(NEW_MENU_ENTRY);
		createEReference(newMenuEntryEClass, NEW_MENU_ENTRY__CONTAINMENT);
		createEAttribute(newMenuEntryEClass, NEW_MENU_ENTRY__DISPLAY_NAME);
		createEReference(newMenuEntryEClass, NEW_MENU_ENTRY__CHILDREN);

		newMenuAllChoicesEClass = createEClass(NEW_MENU_ALL_CHOICES);
		createEReference(newMenuAllChoicesEClass, NEW_MENU_ALL_CHOICES__EXCLUSIONS);

		separatorEClass = createEClass(SEPARATOR);

		fakeEClass = createEClass(FAKE);
		createEReference(fakeEClass, FAKE__EXPLICIT_GRAPHDEF_REFERENCE);
		createEReference(fakeEClass, FAKE__EXPLICIT_TOOLDEF_REFERENCE);
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
		GMFMapPackage theGMFMapPackage = (GMFMapPackage)EPackage.Registry.INSTANCE.getEPackage(GMFMapPackage.eNS_URI);
		GMFGraphPackage theGMFGraphPackage = (GMFGraphPackage)EPackage.Registry.INSTANCE.getEPackage(GMFGraphPackage.eNS_URI);
		GMFToolPackage theGMFToolPackage = (GMFToolPackage)EPackage.Registry.INSTANCE.getEPackage(GMFToolPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mappingExtEClass.getESuperTypes().add(theGMFMapPackage.getMapping());
		newMenuEntryEClass.getESuperTypes().add(this.getAbstractNewMenuEntry());
		newMenuAllChoicesEClass.getESuperTypes().add(this.getNewMenuEntry());
		separatorEClass.getESuperTypes().add(this.getAbstractNewMenuEntry());

		// Initialize classes and features; add operations and parameters
		initEClass(mappingExtEClass, MappingExt.class, "MappingExt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingExt_NewMenuDefs(), this.getNewMenuDefinitions(), null, "newMenuDefs", null, 0, 1, MappingExt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newMenuDefinitionsEClass, NewMenuDefinitions.class, "NewMenuDefinitions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNewMenuDefinitions_DefID(), ecorePackage.getEString(), "defID", null, 0, 1, NewMenuDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewMenuDefinitions_Contexts(), this.getNewMenuContext(), null, "contexts", null, 0, -1, NewMenuDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewMenuDefinitions_ImportedContexts(), this.getNewMenuContext(), null, "importedContexts", null, 0, -1, NewMenuDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewMenuDefinitions_ImportedDefinitions(), this.getNewMenuDefinitions(), null, "importedDefinitions", null, 0, -1, NewMenuDefinitions.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newMenuContextEClass, NewMenuContext.class, "NewMenuContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewMenuContext_Metaclass(), ecorePackage.getEClass(), null, "metaclass", null, 0, 1, NewMenuContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewMenuContext_IncludeSubClasses(), ecorePackage.getEBoolean(), "includeSubClasses", "true", 0, 1, NewMenuContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewMenuContext_Entries(), this.getAbstractNewMenuEntry(), this.getAbstractNewMenuEntry_Context(), "entries", null, 0, -1, NewMenuContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewMenuContext_ImportedEntries(), this.getAbstractNewMenuEntry(), null, "importedEntries", null, 0, -1, NewMenuContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(abstractNewMenuEntryEClass, AbstractNewMenuEntry.class, "AbstractNewMenuEntry", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractNewMenuEntry_Context(), this.getNewMenuContext(), this.getNewMenuContext_Entries(), "context", null, 0, 1, AbstractNewMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newMenuEntryEClass, NewMenuEntry.class, "NewMenuEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewMenuEntry_Containment(), ecorePackage.getEReference(), null, "containment", null, 0, 1, NewMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNewMenuEntry_DisplayName(), ecorePackage.getEString(), "displayName", null, 0, 1, NewMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNewMenuEntry_Children(), ecorePackage.getEClass(), null, "children", null, 1, -1, NewMenuEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(newMenuAllChoicesEClass, NewMenuAllChoices.class, "NewMenuAllChoices", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getNewMenuAllChoices_Exclusions(), ecorePackage.getEClass(), null, "exclusions", null, 0, -1, NewMenuAllChoices.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(separatorEClass, Separator.class, "Separator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(fakeEClass, Fake.class, "Fake", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFake_ExplicitGraphdefReference(), theGMFGraphPackage.getCanvas(), null, "explicitGraphdefReference", null, 0, 1, Fake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFake_ExplicitTooldefReference(), theGMFToolPackage.getToolRegistry(), null, "explicitTooldefReference", null, 0, 1, Fake.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //U2TMapPackageImpl
