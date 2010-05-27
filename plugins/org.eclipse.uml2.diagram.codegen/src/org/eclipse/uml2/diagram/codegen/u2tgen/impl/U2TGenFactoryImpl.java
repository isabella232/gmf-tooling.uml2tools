/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TGenFactoryImpl.java,v 1.3 2010/05/27 11:50:59 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.diagram.codegen.u2tgen.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class U2TGenFactoryImpl extends EFactoryImpl implements U2TGenFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static U2TGenFactory init() {
		try {
			U2TGenFactory theU2TGenFactory = (U2TGenFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/modeling/mdt/uml2tools/gmf/GenModel"); 
			if (theU2TGenFactory != null) {
				return theU2TGenFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new U2TGenFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U2TGenFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case U2TGenPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE: return createAuxSecondaryDiagramNodeAttribute();
			case U2TGenPackage.CUSTOM_LOCATOR_ATTRIBUTES: return createCustomLocatorAttributes();
			case U2TGenPackage.DETAILS_LEVEL_ATTRIBUTES: return createDetailsLevelAttributes();
			case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES: return createSubstitutableByAttributes();
			case U2TGenPackage.DYNAMIC_CANONICAL_COMPARTMENT: return createDynamicCanonicalCompartment();
			case U2TGenPackage.INTERACTION_DIAGRAM_ATTRIBUTES: return createInteractionDiagramAttributes();
			case U2TGenPackage.ROTATED_LABEL_ATTRIBUTES: return createRotatedLabelAttributes();
			case U2TGenPackage.STEREOTYPE_SUPPORT_ATTRIBUTE: return createStereotypeSupportAttribute();
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE: return createLinkToolStackSupportAttribute();
			case U2TGenPackage.LINK_TOOL_STACK_INFO_ATTRIBUTE: return createLinkToolStackInfoAttribute();
			case U2TGenPackage.GENERALIZED_LINK_CONSTRAINT_ATTRIBUTE: return createGeneralizedLinkConstraintAttribute();
			case U2TGenPackage.COUNTERPART_SEMANTIC_HINT_ATTRIBUTE: return createCounterpartSemanticHintAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case U2TGenPackage.STEREOTYPE_SUPPORT_ROLE:
				return createStereotypeSupportRoleFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case U2TGenPackage.STEREOTYPE_SUPPORT_ROLE:
				return convertStereotypeSupportRoleToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuxSecondaryDiagramNodeAttribute createAuxSecondaryDiagramNodeAttribute() {
		AuxSecondaryDiagramNodeAttributeImpl auxSecondaryDiagramNodeAttribute = new AuxSecondaryDiagramNodeAttributeImpl();
		return auxSecondaryDiagramNodeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CustomLocatorAttributes createCustomLocatorAttributes() {
		CustomLocatorAttributesImpl customLocatorAttributes = new CustomLocatorAttributesImpl();
		return customLocatorAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetailsLevelAttributes createDetailsLevelAttributes() {
		DetailsLevelAttributesImpl detailsLevelAttributes = new DetailsLevelAttributesImpl();
		return detailsLevelAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubstitutableByAttributes createSubstitutableByAttributes() {
		SubstitutableByAttributesImpl substitutableByAttributes = new SubstitutableByAttributesImpl();
		return substitutableByAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DynamicCanonicalCompartment createDynamicCanonicalCompartment() {
		DynamicCanonicalCompartmentImpl dynamicCanonicalCompartment = new DynamicCanonicalCompartmentImpl();
		return dynamicCanonicalCompartment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionDiagramAttributes createInteractionDiagramAttributes() {
		InteractionDiagramAttributesImpl interactionDiagramAttributes = new InteractionDiagramAttributesImpl();
		return interactionDiagramAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RotatedLabelAttributes createRotatedLabelAttributes() {
		RotatedLabelAttributesImpl rotatedLabelAttributes = new RotatedLabelAttributesImpl();
		return rotatedLabelAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeSupportAttribute createStereotypeSupportAttribute() {
		StereotypeSupportAttributeImpl stereotypeSupportAttribute = new StereotypeSupportAttributeImpl();
		return stereotypeSupportAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkToolStackSupportAttribute createLinkToolStackSupportAttribute() {
		LinkToolStackSupportAttributeImpl linkToolStackSupportAttribute = new LinkToolStackSupportAttributeImpl();
		return linkToolStackSupportAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkToolStackInfoAttribute createLinkToolStackInfoAttribute() {
		LinkToolStackInfoAttributeImpl linkToolStackInfoAttribute = new LinkToolStackInfoAttributeImpl();
		return linkToolStackInfoAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GeneralizedLinkConstraintAttribute createGeneralizedLinkConstraintAttribute() {
		GeneralizedLinkConstraintAttributeImpl generalizedLinkConstraintAttribute = new GeneralizedLinkConstraintAttributeImpl();
		return generalizedLinkConstraintAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CounterpartSemanticHintAttribute createCounterpartSemanticHintAttribute() {
		CounterpartSemanticHintAttributeImpl counterpartSemanticHintAttribute = new CounterpartSemanticHintAttributeImpl();
		return counterpartSemanticHintAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StereotypeSupportRole createStereotypeSupportRoleFromString(EDataType eDataType, String initialValue) {
		StereotypeSupportRole result = StereotypeSupportRole.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStereotypeSupportRoleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U2TGenPackage getU2TGenPackage() {
		return (U2TGenPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static U2TGenPackage getPackage() {
		return U2TGenPackage.eINSTANCE;
	}

} //U2TGenFactoryImpl
