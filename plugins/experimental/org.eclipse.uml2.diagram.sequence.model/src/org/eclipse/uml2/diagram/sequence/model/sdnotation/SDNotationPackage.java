/**
 * <copyright>
 * </copyright>
 *
 * $Id: SDNotationPackage.java,v 1.1 2009/01/28 13:08:52 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.sequence.model.sdnotation;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.gmf.runtime.notation.NotationPackage;

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
 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.SDNotationFactory
 * @model kind="package"
 * @generated
 */
public interface SDNotationPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "sdnotation";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/mdt/uml2tools/sequence-diagram/notation/2008";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "uml2t.seqd.notation";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SDNotationPackage eINSTANCE = org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDNotationPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDModelAccessStyleImpl <em>SD Model Access Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDModelAccessStyleImpl
	 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDNotationPackageImpl#getSDModelAccessStyle()
	 * @generated
	 */
	int SD_MODEL_ACCESS_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MODEL_ACCESS_STYLE__NAME = NotationPackage.NAMED_STYLE__NAME;

	/**
	 * The feature id for the '<em><b>Frame</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MODEL_ACCESS_STYLE__FRAME = NotationPackage.NAMED_STYLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>SD Model Access Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SD_MODEL_ACCESS_STYLE_FEATURE_COUNT = NotationPackage.NAMED_STYLE_FEATURE_COUNT + 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle <em>SD Model Access Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SD Model Access Style</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle
	 * @generated
	 */
	EClass getSDModelAccessStyle();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle#getFrame <em>Frame</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Frame</em>'.
	 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.SDModelAccessStyle#getFrame()
	 * @see #getSDModelAccessStyle()
	 * @generated
	 */
	EReference getSDModelAccessStyle_Frame();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SDNotationFactory getSDNotationFactory();

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
		 * The meta object literal for the '{@link org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDModelAccessStyleImpl <em>SD Model Access Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDModelAccessStyleImpl
		 * @see org.eclipse.uml2.diagram.sequence.model.sdnotation.impl.SDNotationPackageImpl#getSDModelAccessStyle()
		 * @generated
		 */
		EClass SD_MODEL_ACCESS_STYLE = eINSTANCE.getSDModelAccessStyle();

		/**
		 * The meta object literal for the '<em><b>Frame</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SD_MODEL_ACCESS_STYLE__FRAME = eINSTANCE.getSDModelAccessStyle_Frame();

	}

} //SDNotationPackage
