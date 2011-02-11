/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TMapFactoryImpl.java,v 1.2 2011/02/11 14:16:05 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.uml2.diagram.codegen.u2tmap.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class U2TMapFactoryImpl extends EFactoryImpl implements U2TMapFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static U2TMapFactory init() {
    try
    {
      U2TMapFactory theU2TMapFactory = (U2TMapFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/modeling/mdt/uml2tools/gmf/mapping"); 
      if (theU2TMapFactory != null)
      {
        return theU2TMapFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new U2TMapFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public U2TMapFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case U2TMapPackage.MAPPING_EXT: return createMappingExt();
      case U2TMapPackage.NEW_MENU_DEFINITIONS: return createNewMenuDefinitions();
      case U2TMapPackage.NEW_MENU_CONTEXT: return createNewMenuContext();
      case U2TMapPackage.NEW_MENU_ENTRY: return createNewMenuEntry();
      case U2TMapPackage.NEW_MENU_ALL_CHOICES: return createNewMenuAllChoices();
      case U2TMapPackage.SEPARATOR: return createSeparator();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MappingExt createMappingExt() {
    MappingExtImpl mappingExt = new MappingExtImpl();
    return mappingExt;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NewMenuDefinitions createNewMenuDefinitions() {
    NewMenuDefinitionsImpl newMenuDefinitions = new NewMenuDefinitionsImpl();
    return newMenuDefinitions;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NewMenuContext createNewMenuContext() {
    NewMenuContextImpl newMenuContext = new NewMenuContextImpl();
    return newMenuContext;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NewMenuEntry createNewMenuEntry() {
    NewMenuEntryImpl newMenuEntry = new NewMenuEntryImpl();
    return newMenuEntry;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public NewMenuAllChoices createNewMenuAllChoices() {
    NewMenuAllChoicesImpl newMenuAllChoices = new NewMenuAllChoicesImpl();
    return newMenuAllChoices;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Separator createSeparator() {
    SeparatorImpl separator = new SeparatorImpl();
    return separator;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public U2TMapPackage getU2TMapPackage() {
    return (U2TMapPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static U2TMapPackage getPackage() {
    return U2TMapPackage.eINSTANCE;
  }

} //U2TMapFactoryImpl
