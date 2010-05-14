/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TGenFactory.java,v 1.2 2010/05/14 17:15:02 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage
 * @generated
 */
public interface U2TGenFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	U2TGenFactory eINSTANCE = org.eclipse.uml2.diagram.codegen.u2tgen.impl.U2TGenFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Aux Secondary Diagram Node Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Aux Secondary Diagram Node Attribute</em>'.
	 * @generated
	 */
	AuxSecondaryDiagramNodeAttribute createAuxSecondaryDiagramNodeAttribute();

	/**
	 * Returns a new object of class '<em>Custom Locator Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Custom Locator Attributes</em>'.
	 * @generated
	 */
	CustomLocatorAttributes createCustomLocatorAttributes();

	/**
	 * Returns a new object of class '<em>Details Level Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Details Level Attributes</em>'.
	 * @generated
	 */
	DetailsLevelAttributes createDetailsLevelAttributes();

	/**
	 * Returns a new object of class '<em>Substitutable By Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Substitutable By Attributes</em>'.
	 * @generated
	 */
	SubstitutableByAttributes createSubstitutableByAttributes();

	/**
	 * Returns a new object of class '<em>Dynamic Canonical Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dynamic Canonical Compartment</em>'.
	 * @generated
	 */
	DynamicCanonicalCompartment createDynamicCanonicalCompartment();

	/**
	 * Returns a new object of class '<em>Interaction Diagram Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interaction Diagram Attributes</em>'.
	 * @generated
	 */
	InteractionDiagramAttributes createInteractionDiagramAttributes();

	/**
	 * Returns a new object of class '<em>Rotated Label Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rotated Label Attributes</em>'.
	 * @generated
	 */
	RotatedLabelAttributes createRotatedLabelAttributes();

	/**
	 * Returns a new object of class '<em>Stereotype Support Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stereotype Support Attribute</em>'.
	 * @generated
	 */
	StereotypeSupportAttribute createStereotypeSupportAttribute();

	/**
	 * Returns a new object of class '<em>Link Tool Stack Support Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Tool Stack Support Attribute</em>'.
	 * @generated
	 */
	LinkToolStackSupportAttribute createLinkToolStackSupportAttribute();

	/**
	 * Returns a new object of class '<em>Link Tool Stack Info Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Link Tool Stack Info Attribute</em>'.
	 * @generated
	 */
	LinkToolStackInfoAttribute createLinkToolStackInfoAttribute();

	/**
	 * Returns a new object of class '<em>Generalized Link Constraint Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Generalized Link Constraint Attribute</em>'.
	 * @generated
	 */
	GeneralizedLinkConstraintAttribute createGeneralizedLinkConstraintAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	U2TGenPackage getU2TGenPackage();

} //U2TGenFactory
