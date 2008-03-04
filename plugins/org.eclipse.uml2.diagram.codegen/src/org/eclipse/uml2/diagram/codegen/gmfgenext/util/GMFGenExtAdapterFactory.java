/**
 * <copyright>
 * </copyright>
 *
 * $Id: GMFGenExtAdapterFactory.java,v 1.4 2008/03/04 13:03:29 tfesenko Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.codegen.gmfgen.Attributes;

import org.eclipse.uml2.diagram.codegen.gmfgenext.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage
 * @generated
 */
public class GMFGenExtAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GMFGenExtPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GMFGenExtAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GMFGenExtPackage.eINSTANCE;
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
	protected GMFGenExtSwitch modelSwitch =
		new GMFGenExtSwitch() {
			public Object caseAuxSecondaryDiagramNodeAttribute(AuxSecondaryDiagramNodeAttribute object) {
				return createAuxSecondaryDiagramNodeAttributeAdapter();
			}
			public Object caseCustomLocatorAttributes(CustomLocatorAttributes object) {
				return createCustomLocatorAttributesAdapter();
			}
			public Object caseDetailsLevelAttributes(DetailsLevelAttributes object) {
				return createDetailsLevelAttributesAdapter();
			}
			public Object caseSubstitutableByAttributes(SubstitutableByAttributes object) {
				return createSubstitutableByAttributesAdapter();
			}
			public Object caseAttributes(Attributes object) {
				return createAttributesAdapter();
			}
			public Object defaultCase(EObject object) {
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
	public Adapter createAdapter(Notifier target) {
		return (Adapter)modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute <em>Aux Secondary Diagram Node Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.AuxSecondaryDiagramNodeAttribute
	 * @generated
	 */
	public Adapter createAuxSecondaryDiagramNodeAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes <em>Custom Locator Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.CustomLocatorAttributes
	 * @generated
	 */
	public Adapter createCustomLocatorAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes <em>Details Level Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.DetailsLevelAttributes
	 * @generated
	 */
	public Adapter createDetailsLevelAttributesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes <em>Substitutable By Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.SubstitutableByAttributes
	 * @generated
	 */
	public Adapter createSubstitutableByAttributesAdapter() {
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

} //GMFGenExtAdapterFactory
