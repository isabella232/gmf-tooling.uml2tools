/**
 * <copyright>
 * </copyright>
 *
 * $Id: GMFGenExtSwitch.java,v 1.6 2009/01/14 20:47:10 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.codegen.gmfgen.Attributes;
import org.eclipse.uml2.diagram.codegen.gmfgenext.*;
import org.eclipse.uml2.diagram.codegen.gmfgenext.AbstractDynamicCanonicalContainer;
import org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute;
import org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes;
import org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes;
import org.eclipse.uml2.diagram.codegen.gmfgenext.DynamicCanonicalCompartment;
import org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage;
import org.eclipse.uml2.diagram.codegen.gmfgenext.InteractionDiagramAttributes;
import org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage
 * @generated
 */
public class GMFGenExtSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMFGenExtPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenExtSwitch() {
		if (modelPackage == null) {
			modelPackage = GMFGenExtPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GMFGenExtPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE: {
				AuxSecondaryDiagramNodeAttribute auxSecondaryDiagramNodeAttribute = (AuxSecondaryDiagramNodeAttribute)theEObject;
				T result = caseAuxSecondaryDiagramNodeAttribute(auxSecondaryDiagramNodeAttribute);
				if (result == null) result = caseAttributes(auxSecondaryDiagramNodeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenExtPackage.CUSTOM_LOCATOR_ATTRIBUTES: {
				CustomLocatorAttributes customLocatorAttributes = (CustomLocatorAttributes)theEObject;
				T result = caseCustomLocatorAttributes(customLocatorAttributes);
				if (result == null) result = caseAttributes(customLocatorAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenExtPackage.DETAILS_LEVEL_ATTRIBUTES: {
				DetailsLevelAttributes detailsLevelAttributes = (DetailsLevelAttributes)theEObject;
				T result = caseDetailsLevelAttributes(detailsLevelAttributes);
				if (result == null) result = caseAttributes(detailsLevelAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenExtPackage.SUBSTITUTABLE_BY_ATTRIBUTES: {
				SubstitutableByAttributes substitutableByAttributes = (SubstitutableByAttributes)theEObject;
				T result = caseSubstitutableByAttributes(substitutableByAttributes);
				if (result == null) result = caseAttributes(substitutableByAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenExtPackage.ABSTRACT_DYNAMIC_CANONICAL_CONTAINER: {
				AbstractDynamicCanonicalContainer abstractDynamicCanonicalContainer = (AbstractDynamicCanonicalContainer)theEObject;
				T result = caseAbstractDynamicCanonicalContainer(abstractDynamicCanonicalContainer);
				if (result == null) result = caseAttributes(abstractDynamicCanonicalContainer);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenExtPackage.DYNAMIC_CANONICAL_COMPARTMENT: {
				DynamicCanonicalCompartment dynamicCanonicalCompartment = (DynamicCanonicalCompartment)theEObject;
				T result = caseDynamicCanonicalCompartment(dynamicCanonicalCompartment);
				if (result == null) result = caseAbstractDynamicCanonicalContainer(dynamicCanonicalCompartment);
				if (result == null) result = caseAttributes(dynamicCanonicalCompartment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenExtPackage.INTERACTION_DIAGRAM_ATTRIBUTES: {
				InteractionDiagramAttributes interactionDiagramAttributes = (InteractionDiagramAttributes)theEObject;
				T result = caseInteractionDiagramAttributes(interactionDiagramAttributes);
				if (result == null) result = caseAttributes(interactionDiagramAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GMFGenExtPackage.ROTATED_LABEL_ATTRIBUTES: {
				RotatedLabelAttributes rotatedLabelAttributes = (RotatedLabelAttributes)theEObject;
				T result = caseRotatedLabelAttributes(rotatedLabelAttributes);
				if (result == null) result = caseAttributes(rotatedLabelAttributes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Aux Secondary Diagram Node Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Aux Secondary Diagram Node Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuxSecondaryDiagramNodeAttribute(AuxSecondaryDiagramNodeAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Custom Locator Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Custom Locator Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCustomLocatorAttributes(CustomLocatorAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Details Level Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Details Level Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetailsLevelAttributes(DetailsLevelAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Substitutable By Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Substitutable By Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubstitutableByAttributes(SubstitutableByAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Dynamic Canonical Container</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Dynamic Canonical Container</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractDynamicCanonicalContainer(AbstractDynamicCanonicalContainer object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dynamic Canonical Compartment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dynamic Canonical Compartment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDynamicCanonicalCompartment(DynamicCanonicalCompartment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interaction Diagram Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interaction Diagram Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInteractionDiagramAttributes(InteractionDiagramAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rotated Label Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rotated Label Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRotatedLabelAttributes(RotatedLabelAttributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Attributes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAttributes(Attributes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //GMFGenExtSwitch
