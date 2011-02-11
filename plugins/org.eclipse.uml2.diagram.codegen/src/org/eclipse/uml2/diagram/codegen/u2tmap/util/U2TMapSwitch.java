/**
 * <copyright>
 * </copyright>
 *
 * $Id: U2TMapSwitch.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.mappings.Mapping;

import org.eclipse.uml2.diagram.codegen.u2tmap.*;

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
 * @see org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage
 * @generated
 */
public class U2TMapSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static U2TMapPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public U2TMapSwitch() {
    if (modelPackage == null)
    {
      modelPackage = U2TMapPackage.eINSTANCE;
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
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
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
    switch (classifierID)
    {
      case U2TMapPackage.MAPPING_EXT:
      {
        MappingExt mappingExt = (MappingExt)theEObject;
        T result = caseMappingExt(mappingExt);
        if (result == null) result = caseMapping(mappingExt);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case U2TMapPackage.NEW_MENU_DEFINITIONS:
      {
        NewMenuDefinitions newMenuDefinitions = (NewMenuDefinitions)theEObject;
        T result = caseNewMenuDefinitions(newMenuDefinitions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case U2TMapPackage.NEW_MENU_CONTEXT:
      {
        NewMenuContext newMenuContext = (NewMenuContext)theEObject;
        T result = caseNewMenuContext(newMenuContext);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY:
      {
        AbstractNewMenuEntry abstractNewMenuEntry = (AbstractNewMenuEntry)theEObject;
        T result = caseAbstractNewMenuEntry(abstractNewMenuEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case U2TMapPackage.NEW_MENU_ENTRY:
      {
        NewMenuEntry newMenuEntry = (NewMenuEntry)theEObject;
        T result = caseNewMenuEntry(newMenuEntry);
        if (result == null) result = caseAbstractNewMenuEntry(newMenuEntry);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case U2TMapPackage.NEW_MENU_ALL_CHOICES:
      {
        NewMenuAllChoices newMenuAllChoices = (NewMenuAllChoices)theEObject;
        T result = caseNewMenuAllChoices(newMenuAllChoices);
        if (result == null) result = caseNewMenuEntry(newMenuAllChoices);
        if (result == null) result = caseAbstractNewMenuEntry(newMenuAllChoices);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case U2TMapPackage.SEPARATOR:
      {
        Separator separator = (Separator)theEObject;
        T result = caseSeparator(separator);
        if (result == null) result = caseAbstractNewMenuEntry(separator);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case U2TMapPackage.FAKE:
      {
        Fake fake = (Fake)theEObject;
        T result = caseFake(fake);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mapping Ext</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping Ext</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMappingExt(MappingExt object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>New Menu Definitions</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Menu Definitions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNewMenuDefinitions(NewMenuDefinitions object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>New Menu Context</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Menu Context</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNewMenuContext(NewMenuContext object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Abstract New Menu Entry</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract New Menu Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAbstractNewMenuEntry(AbstractNewMenuEntry object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>New Menu Entry</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Menu Entry</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNewMenuEntry(NewMenuEntry object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>New Menu All Choices</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>New Menu All Choices</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseNewMenuAllChoices(NewMenuAllChoices object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Separator</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Separator</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSeparator(Separator object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Fake</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Fake</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseFake(Fake object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Mapping</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMapping(Mapping object) {
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

} //U2TMapSwitch
