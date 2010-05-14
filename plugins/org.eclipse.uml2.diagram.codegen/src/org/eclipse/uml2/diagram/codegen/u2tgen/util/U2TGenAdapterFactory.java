/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TGenAdapterFactory.java,v 1.2 2010/05/14 17:15:02 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

import org.eclipse.uml2.diagram.codegen.u2tgen.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage
 * @generated
 */
public class U2TGenAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static U2TGenPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U2TGenAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = U2TGenPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected U2TGenSwitch<Adapter> modelSwitch =
		new U2TGenSwitch<Adapter>() {
			@Override
			public Adapter caseAuxSecondaryDiagramNodeAttribute(AuxSecondaryDiagramNodeAttribute object) {
				return createAuxSecondaryDiagramNodeAttributeAdapter();
			}
			@Override
			public Adapter caseCustomLocatorAttributes(CustomLocatorAttributes object) {
				return createCustomLocatorAttributesAdapter();
			}
			@Override
			public Adapter caseDetailsLevelAttributes(DetailsLevelAttributes object) {
				return createDetailsLevelAttributesAdapter();
			}
			@Override
			public Adapter caseSubstitutableByAttributes(SubstitutableByAttributes object) {
				return createSubstitutableByAttributesAdapter();
			}
			@Override
			public Adapter caseAbstractDynamicCanonicalContainer(AbstractDynamicCanonicalContainer object) {
				return createAbstractDynamicCanonicalContainerAdapter();
			}
			@Override
			public Adapter caseDynamicCanonicalCompartment(DynamicCanonicalCompartment object) {
				return createDynamicCanonicalCompartmentAdapter();
			}
			@Override
			public Adapter caseInteractionDiagramAttributes(InteractionDiagramAttributes object) {
				return createInteractionDiagramAttributesAdapter();
			}
			@Override
			public Adapter caseRotatedLabelAttributes(RotatedLabelAttributes object) {
				return createRotatedLabelAttributesAdapter();
			}
			@Override
			public Adapter caseStereotypeSupportAttribute(StereotypeSupportAttribute object) {
				return createStereotypeSupportAttributeAdapter();
			}
			@Override
			public Adapter caseLinkToolStackSupportAttribute(LinkToolStackSupportAttribute object) {
				return createLinkToolStackSupportAttributeAdapter();
			}
			@Override
			public Adapter caseLinkToolStackInfoAttribute(LinkToolStackInfoAttribute object) {
				return createLinkToolStackInfoAttributeAdapter();
			}
			@Override
			public Adapter caseGeneralizedLinkConstraintAttribute(GeneralizedLinkConstraintAttribute object) {
				return createGeneralizedLinkConstraintAttributeAdapter();
			}
			@Override
			public Adapter caseAttributes(Attributes object) {
				return createAttributesAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute <em>Aux Secondary Diagram Node Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.AuxSecondaryDiagramNodeAttribute
	 * @generated
	 */
	public Adapter createAuxSecondaryDiagramNodeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.CustomLocatorAttributes <em>Custom Locator Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.CustomLocatorAttributes
	 * @generated
	 */
	public Adapter createCustomLocatorAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.DetailsLevelAttributes <em>Details Level Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.DetailsLevelAttributes
	 * @generated
	 */
	public Adapter createDetailsLevelAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes <em>Substitutable By Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes
	 * @generated
	 */
	public Adapter createSubstitutableByAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer <em>Abstract Dynamic Canonical Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.AbstractDynamicCanonicalContainer
	 * @generated
	 */
	public Adapter createAbstractDynamicCanonicalContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.DynamicCanonicalCompartment <em>Dynamic Canonical Compartment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.DynamicCanonicalCompartment
	 * @generated
	 */
	public Adapter createDynamicCanonicalCompartmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.InteractionDiagramAttributes <em>Interaction Diagram Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.InteractionDiagramAttributes
	 * @generated
	 */
	public Adapter createInteractionDiagramAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.RotatedLabelAttributes <em>Rotated Label Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.RotatedLabelAttributes
	 * @generated
	 */
	public Adapter createRotatedLabelAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportAttribute <em>Stereotype Support Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.StereotypeSupportAttribute
	 * @generated
	 */
	public Adapter createStereotypeSupportAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute <em>Link Tool Stack Support Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute
	 * @generated
	 */
	public Adapter createLinkToolStackSupportAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute <em>Link Tool Stack Info Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackInfoAttribute
	 * @generated
	 */
	public Adapter createLinkToolStackInfoAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute <em>Generalized Link Constraint Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.u2tgen.GeneralizedLinkConstraintAttribute
	 * @generated
	 */
	public Adapter createGeneralizedLinkConstraintAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.gmf.codegen.gmfgen.Attributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.gmf.codegen.gmfgen.Attributes
	 * @generated
	 */
	public Adapter createAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //U2TGenAdapterFactory
