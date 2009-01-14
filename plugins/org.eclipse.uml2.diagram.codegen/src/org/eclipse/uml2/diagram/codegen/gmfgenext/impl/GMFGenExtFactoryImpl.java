/**
 * <copyright>
 * </copyright>
 *
 * $Id: GMFGenExtFactoryImpl.java,v 1.6 2009/01/14 20:47:10 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.uml2.diagram.codegen.gmfgenext.*;
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
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFGenExtFactoryImpl extends EFactoryImpl implements GMFGenExtFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GMFGenExtFactory init() {
		try {
			GMFGenExtFactory theGMFGenExtFactory = (GMFGenExtFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/uml2/diagram/gmfgenext/DiagramFigure/1.0"); 
			if (theGMFGenExtFactory != null) {
				return theGMFGenExtFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GMFGenExtFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenExtFactoryImpl() {
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
			case GMFGenExtPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE: return createAuxSecondaryDiagramNodeAttribute();
			case GMFGenExtPackage.CUSTOM_LOCATOR_ATTRIBUTES: return createCustomLocatorAttributes();
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES: return createDetailsLevelAttributes();
			case GMFGenExtPackage.SUBSTITUTABLE_BY_ATTRIBUTES: return createSubstitutableByAttributes();
			case GMFGenExtPackage.DYNAMIC_CANONICAL_COMPARTMENT: return createDynamicCanonicalCompartment();
			case GMFGenExtPackage.INTERACTION_DIAGRAM_ATTRIBUTES: return createInteractionDiagramAttributes();
			case GMFGenExtPackage.ROTATED_LABEL_ATTRIBUTES: return createRotatedLabelAttributes();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
	public GMFGenExtPackage getGMFGenExtPackage() {
		return (GMFGenExtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GMFGenExtPackage getPackage() {
		return GMFGenExtPackage.eINSTANCE;
	}

} //GMFGenExtFactoryImpl
