/**
 * <copyright>
 * </copyright>
 *
 * $Id: GMFGenExtPackage.java,v 1.5 2008/05/07 17:37:33 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.gmf.codegen.gmfgen.GMFGenPackage;

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
 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtFactory
 * @model kind="package"
 * @generated
 */
public interface GMFGenExtPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gmfgenext";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/uml2/diagram/gmfgenext/DiagramFigure/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml2.gmfgenext";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GMFGenExtPackage eINSTANCE = org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AuxSecondaryDiagramNodeAttributeImpl <em>Aux Secondary Diagram Node Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AuxSecondaryDiagramNodeAttributeImpl
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getAuxSecondaryDiagramNodeAttribute()
	 * @generated
	 */
	int AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Substitute With Canvas Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE__SUBSTITUTE_WITH_CANVAS_ELEMENT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Aux Secondary Diagram Node Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.CustomLocatorAttributesImpl <em>Custom Locator Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.CustomLocatorAttributesImpl
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getCustomLocatorAttributes()
	 * @generated
	 */
	int CUSTOM_LOCATOR_ATTRIBUTES = 1;

	/**
	 * The feature id for the '<em><b>Custom Locator FQN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LOCATOR_ATTRIBUTES__CUSTOM_LOCATOR_FQN = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Custom Locator Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CUSTOM_LOCATOR_ATTRIBUTES_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;


	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DetailsLevelAttributesImpl <em>Details Level Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DetailsLevelAttributesImpl
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getDetailsLevelAttributes()
	 * @generated
	 */
	int DETAILS_LEVEL_ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Filtering Compartment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_LEVEL_ATTRIBUTES__FILTERING_COMPARTMENT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Details Aware Parser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_LEVEL_ATTRIBUTES__DETAILS_AWARE_PARSER = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Details Level Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETAILS_LEVEL_ATTRIBUTES_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.SubstitutableByAttributesImpl <em>Substitutable By Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.SubstitutableByAttributesImpl
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getSubstitutableByAttributes()
	 * @generated
	 */
	int SUBSTITUTABLE_BY_ATTRIBUTES = 3;

	/**
	 * The feature id for the '<em><b>Substitutable By IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY_IDS = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Requires All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_BY_ATTRIBUTES__REQUIRES_ALL = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Substitutable By Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBSTITUTABLE_BY_ATTRIBUTES_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 2;


	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AbstractDynamicCanonicalContainerImpl <em>Abstract Dynamic Canonical Container</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AbstractDynamicCanonicalContainerImpl
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getAbstractDynamicCanonicalContainer()
	 * @generated
	 */
	int ABSTRACT_DYNAMIC_CANONICAL_CONTAINER = 4;

	/**
	 * The feature id for the '<em><b>Always Canonical IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Initially Canonical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Abstract Dynamic Canonical Container</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_DYNAMIC_CANONICAL_CONTAINER_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DynamicCanonicalCompartmentImpl <em>Dynamic Canonical Compartment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DynamicCanonicalCompartmentImpl
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getDynamicCanonicalCompartment()
	 * @generated
	 */
	int DYNAMIC_CANONICAL_COMPARTMENT = 5;

	/**
	 * The feature id for the '<em><b>Always Canonical IDs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CANONICAL_COMPARTMENT__ALWAYS_CANONICAL_IDS = ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS;

	/**
	 * The feature id for the '<em><b>Initially Canonical</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CANONICAL_COMPARTMENT__INITIALLY_CANONICAL = ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL;

	/**
	 * The number of structural features of the '<em>Dynamic Canonical Compartment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DYNAMIC_CANONICAL_COMPARTMENT_FEATURE_COUNT = ABSTRACT_DYNAMIC_CANONICAL_CONTAINER_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.InteractionDiagramAttributesImpl <em>Interaction Diagram Attributes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.InteractionDiagramAttributesImpl
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getInteractionDiagramAttributes()
	 * @generated
	 */
	int INTERACTION_DIAGRAM_ATTRIBUTES = 6;

	/**
	 * The feature id for the '<em><b>Multi Layered</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_DIAGRAM_ATTRIBUTES__MULTI_LAYERED = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Interaction Diagram Attributes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERACTION_DIAGRAM_ATTRIBUTES_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute <em>Aux Secondary Diagram Node Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aux Secondary Diagram Node Attribute</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute
	 * @generated
	 */
	EClass getAuxSecondaryDiagramNodeAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute#isSubstituteWithCanvasElement <em>Substitute With Canvas Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Substitute With Canvas Element</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute#isSubstituteWithCanvasElement()
	 * @see #getAuxSecondaryDiagramNodeAttribute()
	 * @generated
	 */
	EAttribute getAuxSecondaryDiagramNodeAttribute_SubstituteWithCanvasElement();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes <em>Custom Locator Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Custom Locator Attributes</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes
	 * @generated
	 */
	EClass getCustomLocatorAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes#getCustomLocatorFQN <em>Custom Locator FQN</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Custom Locator FQN</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes#getCustomLocatorFQN()
	 * @see #getCustomLocatorAttributes()
	 * @generated
	 */
	EAttribute getCustomLocatorAttributes_CustomLocatorFQN();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes <em>Details Level Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Details Level Attributes</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes
	 * @generated
	 */
	EClass getDetailsLevelAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes#isFilteringCompartment <em>Filtering Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filtering Compartment</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes#isFilteringCompartment()
	 * @see #getDetailsLevelAttributes()
	 * @generated
	 */
	EAttribute getDetailsLevelAttributes_FilteringCompartment();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes#isDetailsAwareParser <em>Details Aware Parser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Details Aware Parser</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes#isDetailsAwareParser()
	 * @see #getDetailsLevelAttributes()
	 * @generated
	 */
	EAttribute getDetailsLevelAttributes_DetailsAwareParser();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes <em>Substitutable By Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Substitutable By Attributes</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes
	 * @generated
	 */
	EClass getSubstitutableByAttributes();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes#getSubstitutableByIDs <em>Substitutable By IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Substitutable By IDs</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes#getSubstitutableByIDs()
	 * @see #getSubstitutableByAttributes()
	 * @generated
	 */
	EAttribute getSubstitutableByAttributes_SubstitutableByIDs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes#isRequiresAll <em>Requires All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Requires All</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes#isRequiresAll()
	 * @see #getSubstitutableByAttributes()
	 * @generated
	 */
	EAttribute getSubstitutableByAttributes_RequiresAll();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer <em>Abstract Dynamic Canonical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Dynamic Canonical Container</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer
	 * @generated
	 */
	EClass getAbstractDynamicCanonicalContainer();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer#getAlwaysCanonicalIDs <em>Always Canonical IDs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Always Canonical IDs</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer#getAlwaysCanonicalIDs()
	 * @see #getAbstractDynamicCanonicalContainer()
	 * @generated
	 */
	EAttribute getAbstractDynamicCanonicalContainer_AlwaysCanonicalIDs();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer#isInitiallyCanonical <em>Initially Canonical</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Initially Canonical</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer#isInitiallyCanonical()
	 * @see #getAbstractDynamicCanonicalContainer()
	 * @generated
	 */
	EAttribute getAbstractDynamicCanonicalContainer_InitiallyCanonical();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.DynamicCanonicalCompartment <em>Dynamic Canonical Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dynamic Canonical Compartment</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.DynamicCanonicalCompartment
	 * @generated
	 */
	EClass getDynamicCanonicalCompartment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.InteractionDiagramAttributes <em>Interaction Diagram Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interaction Diagram Attributes</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.InteractionDiagramAttributes
	 * @generated
	 */
	EClass getInteractionDiagramAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.InteractionDiagramAttributes#isMultiLayered <em>Multi Layered</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi Layered</em>'.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.InteractionDiagramAttributes#isMultiLayered()
	 * @see #getInteractionDiagramAttributes()
	 * @generated
	 */
	EAttribute getInteractionDiagramAttributes_MultiLayered();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GMFGenExtFactory getGMFGenExtFactory();

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
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AuxSecondaryDiagramNodeAttributeImpl <em>Aux Secondary Diagram Node Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AuxSecondaryDiagramNodeAttributeImpl
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getAuxSecondaryDiagramNodeAttribute()
		 * @generated
		 */
		EClass AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE = eINSTANCE.getAuxSecondaryDiagramNodeAttribute();

		/**
		 * The meta object literal for the '<em><b>Substitute With Canvas Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE__SUBSTITUTE_WITH_CANVAS_ELEMENT = eINSTANCE.getAuxSecondaryDiagramNodeAttribute_SubstituteWithCanvasElement();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.CustomLocatorAttributesImpl <em>Custom Locator Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.CustomLocatorAttributesImpl
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getCustomLocatorAttributes()
		 * @generated
		 */
		EClass CUSTOM_LOCATOR_ATTRIBUTES = eINSTANCE.getCustomLocatorAttributes();

		/**
		 * The meta object literal for the '<em><b>Custom Locator FQN</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CUSTOM_LOCATOR_ATTRIBUTES__CUSTOM_LOCATOR_FQN = eINSTANCE.getCustomLocatorAttributes_CustomLocatorFQN();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DetailsLevelAttributesImpl <em>Details Level Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DetailsLevelAttributesImpl
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getDetailsLevelAttributes()
		 * @generated
		 */
		EClass DETAILS_LEVEL_ATTRIBUTES = eINSTANCE.getDetailsLevelAttributes();

		/**
		 * The meta object literal for the '<em><b>Filtering Compartment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_LEVEL_ATTRIBUTES__FILTERING_COMPARTMENT = eINSTANCE.getDetailsLevelAttributes_FilteringCompartment();

		/**
		 * The meta object literal for the '<em><b>Details Aware Parser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DETAILS_LEVEL_ATTRIBUTES__DETAILS_AWARE_PARSER = eINSTANCE.getDetailsLevelAttributes_DetailsAwareParser();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.SubstitutableByAttributesImpl <em>Substitutable By Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.SubstitutableByAttributesImpl
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getSubstitutableByAttributes()
		 * @generated
		 */
		EClass SUBSTITUTABLE_BY_ATTRIBUTES = eINSTANCE.getSubstitutableByAttributes();

		/**
		 * The meta object literal for the '<em><b>Substitutable By IDs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY_IDS = eINSTANCE.getSubstitutableByAttributes_SubstitutableByIDs();

		/**
		 * The meta object literal for the '<em><b>Requires All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBSTITUTABLE_BY_ATTRIBUTES__REQUIRES_ALL = eINSTANCE.getSubstitutableByAttributes_RequiresAll();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AbstractDynamicCanonicalContainerImpl <em>Abstract Dynamic Canonical Container</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.AbstractDynamicCanonicalContainerImpl
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getAbstractDynamicCanonicalContainer()
		 * @generated
		 */
		EClass ABSTRACT_DYNAMIC_CANONICAL_CONTAINER = eINSTANCE.getAbstractDynamicCanonicalContainer();

		/**
		 * The meta object literal for the '<em><b>Always Canonical IDs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__ALWAYS_CANONICAL_IDS = eINSTANCE.getAbstractDynamicCanonicalContainer_AlwaysCanonicalIDs();

		/**
		 * The meta object literal for the '<em><b>Initially Canonical</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_DYNAMIC_CANONICAL_CONTAINER__INITIALLY_CANONICAL = eINSTANCE.getAbstractDynamicCanonicalContainer_InitiallyCanonical();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DynamicCanonicalCompartmentImpl <em>Dynamic Canonical Compartment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.DynamicCanonicalCompartmentImpl
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getDynamicCanonicalCompartment()
		 * @generated
		 */
		EClass DYNAMIC_CANONICAL_COMPARTMENT = eINSTANCE.getDynamicCanonicalCompartment();

		/**
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.impl.InteractionDiagramAttributesImpl <em>Interaction Diagram Attributes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.InteractionDiagramAttributesImpl
		 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.impl.GMFGenExtPackageImpl#getInteractionDiagramAttributes()
		 * @generated
		 */
		EClass INTERACTION_DIAGRAM_ATTRIBUTES = eINSTANCE.getInteractionDiagramAttributes();

		/**
		 * The meta object literal for the '<em><b>Multi Layered</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERACTION_DIAGRAM_ATTRIBUTES__MULTI_LAYERED = eINSTANCE.getInteractionDiagramAttributes_MultiLayered();

	}

} //GMFGenExtPackage
