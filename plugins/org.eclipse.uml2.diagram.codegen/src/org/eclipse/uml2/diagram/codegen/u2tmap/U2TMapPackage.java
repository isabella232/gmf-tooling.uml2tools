/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TMapPackage.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmf.mappings.GMFMapPackage;

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
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapFactory
 * @model kind="package"
 * @generated
 */
public interface U2TMapPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "u2tmap";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.eclipse.org/modeling/mdt/uml2tools/gmf/mapping";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "u2tmap";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	U2TMapPackage eINSTANCE = org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl.init();

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.MappingExtImpl <em>Mapping Ext</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.MappingExtImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getMappingExt()
   * @generated
   */
	int MAPPING_EXT = 0;

	/**
   * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPING_EXT__NODES = GMFMapPackage.MAPPING__NODES;

	/**
   * The feature id for the '<em><b>Links</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPING_EXT__LINKS = GMFMapPackage.MAPPING__LINKS;

	/**
   * The feature id for the '<em><b>Diagram</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPING_EXT__DIAGRAM = GMFMapPackage.MAPPING__DIAGRAM;

	/**
   * The feature id for the '<em><b>Appearance Styles</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPING_EXT__APPEARANCE_STYLES = GMFMapPackage.MAPPING__APPEARANCE_STYLES;

	/**
   * The feature id for the '<em><b>Audits</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPING_EXT__AUDITS = GMFMapPackage.MAPPING__AUDITS;

	/**
   * The feature id for the '<em><b>Metrics</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPING_EXT__METRICS = GMFMapPackage.MAPPING__METRICS;

	/**
   * The feature id for the '<em><b>New Menu Defs</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPING_EXT__NEW_MENU_DEFS = GMFMapPackage.MAPPING_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Mapping Ext</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MAPPING_EXT_FEATURE_COUNT = GMFMapPackage.MAPPING_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuDefinitionsImpl <em>New Menu Definitions</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuDefinitionsImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getNewMenuDefinitions()
   * @generated
   */
	int NEW_MENU_DEFINITIONS = 1;

	/**
   * The feature id for the '<em><b>Def ID</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_DEFINITIONS__DEF_ID = 0;

	/**
   * The feature id for the '<em><b>Contexts</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_DEFINITIONS__CONTEXTS = 1;

	/**
   * The feature id for the '<em><b>Imported Contexts</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_DEFINITIONS__IMPORTED_CONTEXTS = 2;

	/**
   * The feature id for the '<em><b>Imported Definitions</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_DEFINITIONS__IMPORTED_DEFINITIONS = 3;

	/**
   * The number of structural features of the '<em>New Menu Definitions</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_DEFINITIONS_FEATURE_COUNT = 4;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuContextImpl <em>New Menu Context</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuContextImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getNewMenuContext()
   * @generated
   */
	int NEW_MENU_CONTEXT = 2;

	/**
   * The feature id for the '<em><b>Metaclass</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_CONTEXT__METACLASS = 0;

	/**
   * The feature id for the '<em><b>Include Sub Classes</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_CONTEXT__INCLUDE_SUB_CLASSES = 1;

	/**
   * The feature id for the '<em><b>Entries</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_CONTEXT__ENTRIES = 2;

	/**
   * The feature id for the '<em><b>Imported Entries</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_CONTEXT__IMPORTED_ENTRIES = 3;

	/**
   * The number of structural features of the '<em>New Menu Context</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_CONTEXT_FEATURE_COUNT = 4;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.AbstractNewMenuEntryImpl <em>Abstract New Menu Entry</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.AbstractNewMenuEntryImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getAbstractNewMenuEntry()
   * @generated
   */
	int ABSTRACT_NEW_MENU_ENTRY = 3;

	/**
   * The feature id for the '<em><b>Context</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NEW_MENU_ENTRY__CONTEXT = 0;

	/**
   * The number of structural features of the '<em>Abstract New Menu Entry</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ABSTRACT_NEW_MENU_ENTRY_FEATURE_COUNT = 1;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuEntryImpl <em>New Menu Entry</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuEntryImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getNewMenuEntry()
   * @generated
   */
	int NEW_MENU_ENTRY = 4;

	/**
   * The feature id for the '<em><b>Context</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ENTRY__CONTEXT = ABSTRACT_NEW_MENU_ENTRY__CONTEXT;

	/**
   * The feature id for the '<em><b>Containment</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ENTRY__CONTAINMENT = ABSTRACT_NEW_MENU_ENTRY_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ENTRY__DISPLAY_NAME = ABSTRACT_NEW_MENU_ENTRY_FEATURE_COUNT + 1;

	/**
   * The feature id for the '<em><b>Children</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ENTRY__CHILDREN = ABSTRACT_NEW_MENU_ENTRY_FEATURE_COUNT + 2;

	/**
   * The number of structural features of the '<em>New Menu Entry</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ENTRY_FEATURE_COUNT = ABSTRACT_NEW_MENU_ENTRY_FEATURE_COUNT + 3;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuAllChoicesImpl <em>New Menu All Choices</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuAllChoicesImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getNewMenuAllChoices()
   * @generated
   */
	int NEW_MENU_ALL_CHOICES = 5;

	/**
   * The feature id for the '<em><b>Context</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ALL_CHOICES__CONTEXT = NEW_MENU_ENTRY__CONTEXT;

	/**
   * The feature id for the '<em><b>Containment</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ALL_CHOICES__CONTAINMENT = NEW_MENU_ENTRY__CONTAINMENT;

	/**
   * The feature id for the '<em><b>Display Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ALL_CHOICES__DISPLAY_NAME = NEW_MENU_ENTRY__DISPLAY_NAME;

	/**
   * The feature id for the '<em><b>Children</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ALL_CHOICES__CHILDREN = NEW_MENU_ENTRY__CHILDREN;

	/**
   * The feature id for the '<em><b>Exclusions</b></em>' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ALL_CHOICES__EXCLUSIONS = NEW_MENU_ENTRY_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>New Menu All Choices</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int NEW_MENU_ALL_CHOICES_FEATURE_COUNT = NEW_MENU_ENTRY_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.SeparatorImpl <em>Separator</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.SeparatorImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getSeparator()
   * @generated
   */
	int SEPARATOR = 6;

	/**
   * The feature id for the '<em><b>Context</b></em>' container reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SEPARATOR__CONTEXT = ABSTRACT_NEW_MENU_ENTRY__CONTEXT;

	/**
   * The number of structural features of the '<em>Separator</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int SEPARATOR_FEATURE_COUNT = ABSTRACT_NEW_MENU_ENTRY_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.FakeImpl <em>Fake</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.FakeImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getFake()
   * @generated
   */
	int FAKE = 7;

	/**
   * The feature id for the '<em><b>Explicit Graphdef Reference</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FAKE__EXPLICIT_GRAPHDEF_REFERENCE = 0;

	/**
   * The feature id for the '<em><b>Explicit Tooldef Reference</b></em>' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FAKE__EXPLICIT_TOOLDEF_REFERENCE = 1;

	/**
   * The number of structural features of the '<em>Fake</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int FAKE_FEATURE_COUNT = 2;


	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tmap.MappingExt <em>Mapping Ext</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Mapping Ext</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.MappingExt
   * @generated
   */
	EClass getMappingExt();

	/**
   * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.codegen.u2tmap.MappingExt#getNewMenuDefs <em>New Menu Defs</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>New Menu Defs</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.MappingExt#getNewMenuDefs()
   * @see #getMappingExt()
   * @generated
   */
	EReference getMappingExt_NewMenuDefs();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions <em>New Menu Definitions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Menu Definitions</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions
   * @generated
   */
	EClass getNewMenuDefinitions();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getDefID <em>Def ID</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Def ID</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getDefID()
   * @see #getNewMenuDefinitions()
   * @generated
   */
	EAttribute getNewMenuDefinitions_DefID();

	/**
   * Returns the meta object for the containment reference list '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getContexts <em>Contexts</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Contexts</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getContexts()
   * @see #getNewMenuDefinitions()
   * @generated
   */
	EReference getNewMenuDefinitions_Contexts();

	/**
   * Returns the meta object for the reference list '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getImportedContexts <em>Imported Contexts</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Contexts</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getImportedContexts()
   * @see #getNewMenuDefinitions()
   * @generated
   */
	EReference getNewMenuDefinitions_ImportedContexts();

	/**
   * Returns the meta object for the reference list '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getImportedDefinitions <em>Imported Definitions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Definitions</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions#getImportedDefinitions()
   * @see #getNewMenuDefinitions()
   * @generated
   */
	EReference getNewMenuDefinitions_ImportedDefinitions();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext <em>New Menu Context</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Menu Context</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext
   * @generated
   */
	EClass getNewMenuContext();

	/**
   * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getMetaclass <em>Metaclass</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Metaclass</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getMetaclass()
   * @see #getNewMenuContext()
   * @generated
   */
	EReference getNewMenuContext_Metaclass();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#isIncludeSubClasses <em>Include Sub Classes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Include Sub Classes</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#isIncludeSubClasses()
   * @see #getNewMenuContext()
   * @generated
   */
	EAttribute getNewMenuContext_IncludeSubClasses();

	/**
   * Returns the meta object for the containment reference list '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getEntries <em>Entries</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entries</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getEntries()
   * @see #getNewMenuContext()
   * @generated
   */
	EReference getNewMenuContext_Entries();

	/**
   * Returns the meta object for the reference list '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getImportedEntries <em>Imported Entries</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Entries</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext#getImportedEntries()
   * @see #getNewMenuContext()
   * @generated
   */
	EReference getNewMenuContext_ImportedEntries();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry <em>Abstract New Menu Entry</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract New Menu Entry</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry
   * @generated
   */
	EClass getAbstractNewMenuEntry();

	/**
   * Returns the meta object for the container reference '{@link org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry#getContext <em>Context</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the container reference '<em>Context</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry#getContext()
   * @see #getAbstractNewMenuEntry()
   * @generated
   */
	EReference getAbstractNewMenuEntry_Context();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry <em>New Menu Entry</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Menu Entry</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry
   * @generated
   */
	EClass getNewMenuEntry();

	/**
   * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getContainment <em>Containment</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Containment</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getContainment()
   * @see #getNewMenuEntry()
   * @generated
   */
	EReference getNewMenuEntry_Containment();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getDisplayName <em>Display Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Display Name</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getDisplayName()
   * @see #getNewMenuEntry()
   * @generated
   */
	EAttribute getNewMenuEntry_DisplayName();

	/**
   * Returns the meta object for the reference list '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Children</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuEntry#getChildren()
   * @see #getNewMenuEntry()
   * @generated
   */
	EReference getNewMenuEntry_Children();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuAllChoices <em>New Menu All Choices</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>New Menu All Choices</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuAllChoices
   * @generated
   */
	EClass getNewMenuAllChoices();

	/**
   * Returns the meta object for the reference list '{@link org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuAllChoices#getExclusions <em>Exclusions</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Exclusions</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuAllChoices#getExclusions()
   * @see #getNewMenuAllChoices()
   * @generated
   */
	EReference getNewMenuAllChoices_Exclusions();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tmap.Separator <em>Separator</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Separator</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.Separator
   * @generated
   */
	EClass getSeparator();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tmap.Fake <em>Fake</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Fake</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.Fake
   * @generated
   */
	EClass getFake();

	/**
   * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.codegen.u2tmap.Fake#getExplicitGraphdefReference <em>Explicit Graphdef Reference</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Explicit Graphdef Reference</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.Fake#getExplicitGraphdefReference()
   * @see #getFake()
   * @generated
   */
	EReference getFake_ExplicitGraphdefReference();

	/**
   * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.codegen.u2tmap.Fake#getExplicitTooldefReference <em>Explicit Tooldef Reference</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Explicit Tooldef Reference</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tmap.Fake#getExplicitTooldefReference()
   * @see #getFake()
   * @generated
   */
	EReference getFake_ExplicitTooldefReference();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	U2TMapFactory getU2TMapFactory();

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
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.MappingExtImpl <em>Mapping Ext</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.MappingExtImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getMappingExt()
     * @generated
     */
		EClass MAPPING_EXT = eINSTANCE.getMappingExt();

		/**
     * The meta object literal for the '<em><b>New Menu Defs</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference MAPPING_EXT__NEW_MENU_DEFS = eINSTANCE.getMappingExt_NewMenuDefs();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuDefinitionsImpl <em>New Menu Definitions</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuDefinitionsImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getNewMenuDefinitions()
     * @generated
     */
		EClass NEW_MENU_DEFINITIONS = eINSTANCE.getNewMenuDefinitions();

		/**
     * The meta object literal for the '<em><b>Def ID</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NEW_MENU_DEFINITIONS__DEF_ID = eINSTANCE.getNewMenuDefinitions_DefID();

		/**
     * The meta object literal for the '<em><b>Contexts</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_DEFINITIONS__CONTEXTS = eINSTANCE.getNewMenuDefinitions_Contexts();

		/**
     * The meta object literal for the '<em><b>Imported Contexts</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_DEFINITIONS__IMPORTED_CONTEXTS = eINSTANCE.getNewMenuDefinitions_ImportedContexts();

		/**
     * The meta object literal for the '<em><b>Imported Definitions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_DEFINITIONS__IMPORTED_DEFINITIONS = eINSTANCE.getNewMenuDefinitions_ImportedDefinitions();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuContextImpl <em>New Menu Context</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuContextImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getNewMenuContext()
     * @generated
     */
		EClass NEW_MENU_CONTEXT = eINSTANCE.getNewMenuContext();

		/**
     * The meta object literal for the '<em><b>Metaclass</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_CONTEXT__METACLASS = eINSTANCE.getNewMenuContext_Metaclass();

		/**
     * The meta object literal for the '<em><b>Include Sub Classes</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NEW_MENU_CONTEXT__INCLUDE_SUB_CLASSES = eINSTANCE.getNewMenuContext_IncludeSubClasses();

		/**
     * The meta object literal for the '<em><b>Entries</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_CONTEXT__ENTRIES = eINSTANCE.getNewMenuContext_Entries();

		/**
     * The meta object literal for the '<em><b>Imported Entries</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_CONTEXT__IMPORTED_ENTRIES = eINSTANCE.getNewMenuContext_ImportedEntries();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.AbstractNewMenuEntryImpl <em>Abstract New Menu Entry</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.AbstractNewMenuEntryImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getAbstractNewMenuEntry()
     * @generated
     */
		EClass ABSTRACT_NEW_MENU_ENTRY = eINSTANCE.getAbstractNewMenuEntry();

		/**
     * The meta object literal for the '<em><b>Context</b></em>' container reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference ABSTRACT_NEW_MENU_ENTRY__CONTEXT = eINSTANCE.getAbstractNewMenuEntry_Context();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuEntryImpl <em>New Menu Entry</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuEntryImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getNewMenuEntry()
     * @generated
     */
		EClass NEW_MENU_ENTRY = eINSTANCE.getNewMenuEntry();

		/**
     * The meta object literal for the '<em><b>Containment</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_ENTRY__CONTAINMENT = eINSTANCE.getNewMenuEntry_Containment();

		/**
     * The meta object literal for the '<em><b>Display Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute NEW_MENU_ENTRY__DISPLAY_NAME = eINSTANCE.getNewMenuEntry_DisplayName();

		/**
     * The meta object literal for the '<em><b>Children</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_ENTRY__CHILDREN = eINSTANCE.getNewMenuEntry_Children();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuAllChoicesImpl <em>New Menu All Choices</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuAllChoicesImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getNewMenuAllChoices()
     * @generated
     */
		EClass NEW_MENU_ALL_CHOICES = eINSTANCE.getNewMenuAllChoices();

		/**
     * The meta object literal for the '<em><b>Exclusions</b></em>' reference list feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference NEW_MENU_ALL_CHOICES__EXCLUSIONS = eINSTANCE.getNewMenuAllChoices_Exclusions();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.SeparatorImpl <em>Separator</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.SeparatorImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getSeparator()
     * @generated
     */
		EClass SEPARATOR = eINSTANCE.getSeparator();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.FakeImpl <em>Fake</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.FakeImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tmap.impl.U2TMapPackageImpl#getFake()
     * @generated
     */
		EClass FAKE = eINSTANCE.getFake();

		/**
     * The meta object literal for the '<em><b>Explicit Graphdef Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference FAKE__EXPLICIT_GRAPHDEF_REFERENCE = eINSTANCE.getFake_ExplicitGraphdefReference();

		/**
     * The meta object literal for the '<em><b>Explicit Tooldef Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EReference FAKE__EXPLICIT_TOOLDEF_REFERENCE = eINSTANCE.getFake_ExplicitTooldefReference();

	}

} //U2TMapPackage
