/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TGenPackage.java,v 1.4 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenFactory
 * @model kind="package"
 * @generated
 */
public interface U2TGenPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "u2tgen";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.eclipse.org/modeling/mdt/uml2tools/gmf/GenModel";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "u2tgen";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	U2TGenPackage eINSTANCE = org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl.init();

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.AuxSecondaryDiagramNodeAttributeImpl <em>Aux Secondary Diagram Node Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.AuxSecondaryDiagramNodeAttributeImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getAuxSecondaryDiagramNodeAttribute()
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
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.CustomLocatorAttributesImpl <em>Custom Locator Attributes</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.CustomLocatorAttributesImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getCustomLocatorAttributes()
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
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.DetailsLevelAttributesImpl <em>Details Level Attributes</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.DetailsLevelAttributesImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getDetailsLevelAttributes()
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
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.SubstitutableByAttributesImpl <em>Substitutable By Attributes</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.SubstitutableByAttributesImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getSubstitutableByAttributes()
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
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.AbstractDynamicCanonicalContainerImpl <em>Abstract Dynamic Canonical Container</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.AbstractDynamicCanonicalContainerImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getAbstractDynamicCanonicalContainer()
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
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.DynamicCanonicalCompartmentImpl <em>Dynamic Canonical Compartment</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.DynamicCanonicalCompartmentImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getDynamicCanonicalCompartment()
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
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.InteractionDiagramAttributesImpl <em>Interaction Diagram Attributes</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.InteractionDiagramAttributesImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getInteractionDiagramAttributes()
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
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.RotatedLabelAttributesImpl <em>Rotated Label Attributes</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.RotatedLabelAttributesImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getRotatedLabelAttributes()
   * @generated
   */
	int ROTATED_LABEL_ATTRIBUTES = 7;

	/**
   * The number of structural features of the '<em>Rotated Label Attributes</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int ROTATED_LABEL_ATTRIBUTES_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.StereotypeSupportAttributeImpl <em>Stereotype Support Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.StereotypeSupportAttributeImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getStereotypeSupportAttribute()
   * @generated
   */
	int STEREOTYPE_SUPPORT_ATTRIBUTE = 8;

	/**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STEREOTYPE_SUPPORT_ATTRIBUTE__ROLE = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Stereotype Support Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int STEREOTYPE_SUPPORT_ATTRIBUTE_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackSupportAttributeImpl <em>Link Tool Stack Support Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackSupportAttributeImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getLinkToolStackSupportAttribute()
   * @generated
   */
	int LINK_TOOL_STACK_SUPPORT_ATTRIBUTE = 9;

	/**
   * The feature id for the '<em><b>Tool Class Provider Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Base Semantic Class Name</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Link Tool Stack Support Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LINK_TOOL_STACK_SUPPORT_ATTRIBUTE_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackInfoAttributeImpl <em>Link Tool Stack Info Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackInfoAttributeImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getLinkToolStackInfoAttribute()
   * @generated
   */
	int LINK_TOOL_STACK_INFO_ATTRIBUTE = 10;

	/**
   * The feature id for the '<em><b>Toolgroup Title</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LINK_TOOL_STACK_INFO_ATTRIBUTE__TOOLGROUP_TITLE = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Element Unique Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LINK_TOOL_STACK_INFO_ATTRIBUTE__ELEMENT_UNIQUE_IDENTIFIER = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Link Tool Stack Info Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int LINK_TOOL_STACK_INFO_ATTRIBUTE_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.GeneralizedLinkConstraintAttributeImpl <em>Generalized Link Constraint Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.GeneralizedLinkConstraintAttributeImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getGeneralizedLinkConstraintAttribute()
   * @generated
   */
	int GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE = 11;

	/**
   * The feature id for the '<em><b>Link Constraint</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE__LINK_CONSTRAINT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
   * The number of structural features of the '<em>Generalized Link Constraint Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.CounterpartSemanticHintAttributeImpl <em>Counterpart Semantic Hint Attribute</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.CounterpartSemanticHintAttributeImpl
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getCounterpartSemanticHintAttribute()
   * @generated
   */
	int COUNTERPART_SEMANTIC_HINT_ATTRIBUTE = 12;

	/**
   * The feature id for the '<em><b>Parent Visual Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__PARENT_VISUAL_ID = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 0;

	/**
   * The feature id for the '<em><b>Child Visual Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__CHILD_VISUAL_ID = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 1;

	/**
   * The number of structural features of the '<em>Counterpart Semantic Hint Attribute</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int COUNTERPART_SEMANTIC_HINT_ATTRIBUTE_FEATURE_COUNT = GMFGenPackage.ATTRIBUTES_FEATURE_COUNT + 2;

	/**
   * The meta object id for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportRole <em>Stereotype Support Role</em>}' enum.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportRole
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getStereotypeSupportRole()
   * @generated
   */
	int STEREOTYPE_SUPPORT_ROLE = 13;


	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute <em>Aux Secondary Diagram Node Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aux Secondary Diagram Node Attribute</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute
   * @generated
   */
	EClass getAuxSecondaryDiagramNodeAttribute();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute#isSubstituteWithCanvasElement <em>Substitute With Canvas Element</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Substitute With Canvas Element</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute#isSubstituteWithCanvasElement()
   * @see #getAuxSecondaryDiagramNodeAttribute()
   * @generated
   */
	EAttribute getAuxSecondaryDiagramNodeAttribute_SubstituteWithCanvasElement();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.CustomLocatorAttributes <em>Custom Locator Attributes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom Locator Attributes</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.CustomLocatorAttributes
   * @generated
   */
	EClass getCustomLocatorAttributes();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.CustomLocatorAttributes#getCustomLocatorFQN <em>Custom Locator FQN</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Custom Locator FQN</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.CustomLocatorAttributes#getCustomLocatorFQN()
   * @see #getCustomLocatorAttributes()
   * @generated
   */
	EAttribute getCustomLocatorAttributes_CustomLocatorFQN();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.DetailsLevelAttributes <em>Details Level Attributes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Details Level Attributes</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.DetailsLevelAttributes
   * @generated
   */
	EClass getDetailsLevelAttributes();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.DetailsLevelAttributes#isFilteringCompartment <em>Filtering Compartment</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Filtering Compartment</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.DetailsLevelAttributes#isFilteringCompartment()
   * @see #getDetailsLevelAttributes()
   * @generated
   */
	EAttribute getDetailsLevelAttributes_FilteringCompartment();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.DetailsLevelAttributes#isDetailsAwareParser <em>Details Aware Parser</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Details Aware Parser</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.DetailsLevelAttributes#isDetailsAwareParser()
   * @see #getDetailsLevelAttributes()
   * @generated
   */
	EAttribute getDetailsLevelAttributes_DetailsAwareParser();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes <em>Substitutable By Attributes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Substitutable By Attributes</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes
   * @generated
   */
	EClass getSubstitutableByAttributes();

	/**
   * Returns the meta object for the attribute list '{@link org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes#getSubstitutableByIDs <em>Substitutable By IDs</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Substitutable By IDs</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes#getSubstitutableByIDs()
   * @see #getSubstitutableByAttributes()
   * @generated
   */
	EAttribute getSubstitutableByAttributes_SubstitutableByIDs();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes#isRequiresAll <em>Requires All</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Requires All</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes#isRequiresAll()
   * @see #getSubstitutableByAttributes()
   * @generated
   */
	EAttribute getSubstitutableByAttributes_RequiresAll();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer <em>Abstract Dynamic Canonical Container</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Dynamic Canonical Container</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer
   * @generated
   */
	EClass getAbstractDynamicCanonicalContainer();

	/**
   * Returns the meta object for the attribute list '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer#getAlwaysCanonicalIDs <em>Always Canonical IDs</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Always Canonical IDs</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer#getAlwaysCanonicalIDs()
   * @see #getAbstractDynamicCanonicalContainer()
   * @generated
   */
	EAttribute getAbstractDynamicCanonicalContainer_AlwaysCanonicalIDs();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer#isInitiallyCanonical <em>Initially Canonical</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Initially Canonical</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer#isInitiallyCanonical()
   * @see #getAbstractDynamicCanonicalContainer()
   * @generated
   */
	EAttribute getAbstractDynamicCanonicalContainer_InitiallyCanonical();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.DynamicCanonicalCompartment <em>Dynamic Canonical Compartment</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dynamic Canonical Compartment</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.DynamicCanonicalCompartment
   * @generated
   */
	EClass getDynamicCanonicalCompartment();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.InteractionDiagramAttributes <em>Interaction Diagram Attributes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Interaction Diagram Attributes</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.InteractionDiagramAttributes
   * @generated
   */
	EClass getInteractionDiagramAttributes();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.InteractionDiagramAttributes#isMultiLayered <em>Multi Layered</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Multi Layered</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.InteractionDiagramAttributes#isMultiLayered()
   * @see #getInteractionDiagramAttributes()
   * @generated
   */
	EAttribute getInteractionDiagramAttributes_MultiLayered();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.RotatedLabelAttributes <em>Rotated Label Attributes</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Rotated Label Attributes</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.RotatedLabelAttributes
   * @generated
   */
	EClass getRotatedLabelAttributes();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportAttribute <em>Stereotype Support Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stereotype Support Attribute</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportAttribute
   * @generated
   */
	EClass getStereotypeSupportAttribute();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportAttribute#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportAttribute#getRole()
   * @see #getStereotypeSupportAttribute()
   * @generated
   */
	EAttribute getStereotypeSupportAttribute_Role();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute <em>Link Tool Stack Support Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Tool Stack Support Attribute</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute
   * @generated
   */
	EClass getLinkToolStackSupportAttribute();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute#getToolClassProviderName <em>Tool Class Provider Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Tool Class Provider Name</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute#getToolClassProviderName()
   * @see #getLinkToolStackSupportAttribute()
   * @generated
   */
	EAttribute getLinkToolStackSupportAttribute_ToolClassProviderName();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute#getBaseSemanticClassName <em>Base Semantic Class Name</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Base Semantic Class Name</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute#getBaseSemanticClassName()
   * @see #getLinkToolStackSupportAttribute()
   * @generated
   */
	EAttribute getLinkToolStackSupportAttribute_BaseSemanticClassName();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute <em>Link Tool Stack Info Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link Tool Stack Info Attribute</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute
   * @generated
   */
	EClass getLinkToolStackInfoAttribute();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute#getToolgroupTitle <em>Toolgroup Title</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Toolgroup Title</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute#getToolgroupTitle()
   * @see #getLinkToolStackInfoAttribute()
   * @generated
   */
	EAttribute getLinkToolStackInfoAttribute_ToolgroupTitle();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute#getElementUniqueIdentifier <em>Element Unique Identifier</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element Unique Identifier</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute#getElementUniqueIdentifier()
   * @see #getLinkToolStackInfoAttribute()
   * @generated
   */
	EAttribute getLinkToolStackInfoAttribute_ElementUniqueIdentifier();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute <em>Generalized Link Constraint Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Generalized Link Constraint Attribute</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute
   * @generated
   */
	EClass getGeneralizedLinkConstraintAttribute();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute#getLinkConstraint <em>Link Constraint</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Link Constraint</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute#getLinkConstraint()
   * @see #getGeneralizedLinkConstraintAttribute()
   * @generated
   */
	EAttribute getGeneralizedLinkConstraintAttribute_LinkConstraint();

	/**
   * Returns the meta object for class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute <em>Counterpart Semantic Hint Attribute</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Counterpart Semantic Hint Attribute</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute
   * @generated
   */
	EClass getCounterpartSemanticHintAttribute();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute#getParentVisualId <em>Parent Visual Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Parent Visual Id</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute#getParentVisualId()
   * @see #getCounterpartSemanticHintAttribute()
   * @generated
   */
	EAttribute getCounterpartSemanticHintAttribute_ParentVisualId();

	/**
   * Returns the meta object for the attribute '{@link org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute#getChildVisualId <em>Child Visual Id</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Child Visual Id</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.CounterpartSemanticHintAttribute#getChildVisualId()
   * @see #getCounterpartSemanticHintAttribute()
   * @generated
   */
	EAttribute getCounterpartSemanticHintAttribute_ChildVisualId();

	/**
   * Returns the meta object for enum '{@link org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportRole <em>Stereotype Support Role</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Stereotype Support Role</em>'.
   * @see org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportRole
   * @generated
   */
	EEnum getStereotypeSupportRole();

	/**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	U2TGenFactory getU2TGenFactory();

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
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.AuxSecondaryDiagramNodeAttributeImpl <em>Aux Secondary Diagram Node Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.AuxSecondaryDiagramNodeAttributeImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getAuxSecondaryDiagramNodeAttribute()
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
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.CustomLocatorAttributesImpl <em>Custom Locator Attributes</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.CustomLocatorAttributesImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getCustomLocatorAttributes()
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
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.DetailsLevelAttributesImpl <em>Details Level Attributes</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.DetailsLevelAttributesImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getDetailsLevelAttributes()
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
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.SubstitutableByAttributesImpl <em>Substitutable By Attributes</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.SubstitutableByAttributesImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getSubstitutableByAttributes()
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
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.AbstractDynamicCanonicalContainerImpl <em>Abstract Dynamic Canonical Container</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.AbstractDynamicCanonicalContainerImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getAbstractDynamicCanonicalContainer()
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
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.DynamicCanonicalCompartmentImpl <em>Dynamic Canonical Compartment</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.DynamicCanonicalCompartmentImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getDynamicCanonicalCompartment()
     * @generated
     */
		EClass DYNAMIC_CANONICAL_COMPARTMENT = eINSTANCE.getDynamicCanonicalCompartment();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.InteractionDiagramAttributesImpl <em>Interaction Diagram Attributes</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.InteractionDiagramAttributesImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getInteractionDiagramAttributes()
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

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.RotatedLabelAttributesImpl <em>Rotated Label Attributes</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.RotatedLabelAttributesImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getRotatedLabelAttributes()
     * @generated
     */
		EClass ROTATED_LABEL_ATTRIBUTES = eINSTANCE.getRotatedLabelAttributes();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.StereotypeSupportAttributeImpl <em>Stereotype Support Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.StereotypeSupportAttributeImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getStereotypeSupportAttribute()
     * @generated
     */
		EClass STEREOTYPE_SUPPORT_ATTRIBUTE = eINSTANCE.getStereotypeSupportAttribute();

		/**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute STEREOTYPE_SUPPORT_ATTRIBUTE__ROLE = eINSTANCE.getStereotypeSupportAttribute_Role();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackSupportAttributeImpl <em>Link Tool Stack Support Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackSupportAttributeImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getLinkToolStackSupportAttribute()
     * @generated
     */
		EClass LINK_TOOL_STACK_SUPPORT_ATTRIBUTE = eINSTANCE.getLinkToolStackSupportAttribute();

		/**
     * The meta object literal for the '<em><b>Tool Class Provider Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME = eINSTANCE.getLinkToolStackSupportAttribute_ToolClassProviderName();

		/**
     * The meta object literal for the '<em><b>Base Semantic Class Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME = eINSTANCE.getLinkToolStackSupportAttribute_BaseSemanticClassName();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackInfoAttributeImpl <em>Link Tool Stack Info Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.LinkToolStackInfoAttributeImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getLinkToolStackInfoAttribute()
     * @generated
     */
		EClass LINK_TOOL_STACK_INFO_ATTRIBUTE = eINSTANCE.getLinkToolStackInfoAttribute();

		/**
     * The meta object literal for the '<em><b>Toolgroup Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute LINK_TOOL_STACK_INFO_ATTRIBUTE__TOOLGROUP_TITLE = eINSTANCE.getLinkToolStackInfoAttribute_ToolgroupTitle();

		/**
     * The meta object literal for the '<em><b>Element Unique Identifier</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute LINK_TOOL_STACK_INFO_ATTRIBUTE__ELEMENT_UNIQUE_IDENTIFIER = eINSTANCE.getLinkToolStackInfoAttribute_ElementUniqueIdentifier();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.GeneralizedLinkConstraintAttributeImpl <em>Generalized Link Constraint Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.GeneralizedLinkConstraintAttributeImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getGeneralizedLinkConstraintAttribute()
     * @generated
     */
		EClass GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE = eINSTANCE.getGeneralizedLinkConstraintAttribute();

		/**
     * The meta object literal for the '<em><b>Link Constraint</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE__LINK_CONSTRAINT = eINSTANCE.getGeneralizedLinkConstraintAttribute_LinkConstraint();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.CounterpartSemanticHintAttributeImpl <em>Counterpart Semantic Hint Attribute</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.CounterpartSemanticHintAttributeImpl
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getCounterpartSemanticHintAttribute()
     * @generated
     */
		EClass COUNTERPART_SEMANTIC_HINT_ATTRIBUTE = eINSTANCE.getCounterpartSemanticHintAttribute();

		/**
     * The meta object literal for the '<em><b>Parent Visual Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__PARENT_VISUAL_ID = eINSTANCE.getCounterpartSemanticHintAttribute_ParentVisualId();

		/**
     * The meta object literal for the '<em><b>Child Visual Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @generated
     */
		EAttribute COUNTERPART_SEMANTIC_HINT_ATTRIBUTE__CHILD_VISUAL_ID = eINSTANCE.getCounterpartSemanticHintAttribute_ChildVisualId();

		/**
     * The meta object literal for the '{@link org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportRole <em>Stereotype Support Role</em>}' enum.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportRole
     * @see org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenPackageImpl#getStereotypeSupportRole()
     * @generated
     */
		EEnum STEREOTYPE_SUPPORT_ROLE = eINSTANCE.getStereotypeSupportRole();

	}

} //U2TGenPackage
