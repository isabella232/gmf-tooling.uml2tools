/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TNotationFactoryImpl.java,v 1.1 2008/09/08 10:23:25 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.common.notation.u2tnotation.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.diagram.common.notation.u2tnotation.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class U2TNotationFactoryImpl extends EFactoryImpl implements U2TNotationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static U2TNotationFactory init() {
		try {
			U2TNotationFactory theU2TNotationFactory = (U2TNotationFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/mdt/uml2tools/gmf/notation/ext/2008"); 
			if (theU2TNotationFactory != null) {
				return theU2TNotationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new U2TNotationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U2TNotationFactoryImpl() {
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
			case U2TNotationPackage.U2T_DIAGRAM_CANONICAL_STYLE: return createU2TDiagramCanonicalStyle();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U2TDiagramCanonicalStyle createU2TDiagramCanonicalStyle() {
		U2TDiagramCanonicalStyleImpl u2TDiagramCanonicalStyle = new U2TDiagramCanonicalStyleImpl();
		return u2TDiagramCanonicalStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public U2TNotationPackage getU2TNotationPackage() {
		return (U2TNotationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static U2TNotationPackage getPackage() {
		return U2TNotationPackage.eINSTANCE;
	}

} //U2TNotationFactoryImpl
