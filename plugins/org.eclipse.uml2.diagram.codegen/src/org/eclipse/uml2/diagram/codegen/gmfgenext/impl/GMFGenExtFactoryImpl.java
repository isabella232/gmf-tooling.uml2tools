/**
 * <copyright>
 * </copyright>
 *
 * $Id: GMFGenExtFactoryImpl.java,v 1.1 2007/04/05 17:07:04 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.diagram.codegen.gmfgenext.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GMFGenExtFactoryImpl extends EFactoryImpl implements GMFGenExtFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "";

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
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GMFGenExtPackage.AUX_SECONDARY_DIAGRAM_NODE_ATTRIBUTE: return createAuxSecondaryDiagramNodeAttribute();
			case GMFGenExtPackage.CUSTOM_LOCATOR_ATTRIBUTES: return createCustomLocatorAttributes();
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
	public GMFGenExtPackage getGMFGenExtPackage() {
		return (GMFGenExtPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	public static GMFGenExtPackage getPackage() {
		return GMFGenExtPackage.eINSTANCE;
	}

} //GMFGenExtFactoryImpl
