/**
 * <copyright>
 * </copyright>
 *
 * $Id: NewMenuDefinitionsImpl.java,v 1.2 2011/02/11 14:16:05 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext;
import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuDefinitions;
import org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Menu Definitions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuDefinitionsImpl#getDefID <em>Def ID</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuDefinitionsImpl#getContexts <em>Contexts</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuDefinitionsImpl#getImportedContexts <em>Imported Contexts</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuDefinitionsImpl#getImportedDefinitions <em>Imported Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewMenuDefinitionsImpl extends EObjectImpl implements NewMenuDefinitions {
	/**
   * The default value of the '{@link #getDefID() <em>Def ID</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDefID()
   * @generated
   * @ordered
   */
	protected static final String DEF_ID_EDEFAULT = null;

	/**
   * The cached value of the '{@link #getDefID() <em>Def ID</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getDefID()
   * @generated
   * @ordered
   */
	protected String defID = DEF_ID_EDEFAULT;

	/**
   * The cached value of the '{@link #getContexts() <em>Contexts</em>}' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getContexts()
   * @generated
   * @ordered
   */
	protected EList<NewMenuContext> contexts;

	/**
   * The cached value of the '{@link #getImportedContexts() <em>Imported Contexts</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImportedContexts()
   * @generated
   * @ordered
   */
	protected EList<NewMenuContext> importedContexts;

	/**
   * The cached value of the '{@link #getImportedDefinitions() <em>Imported Definitions</em>}' reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getImportedDefinitions()
   * @generated
   * @ordered
   */
	protected EList<NewMenuDefinitions> importedDefinitions;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected NewMenuDefinitionsImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return U2TMapPackage.Literals.NEW_MENU_DEFINITIONS;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public String getDefID() {
    return defID;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setDefID(String newDefID) {
    String oldDefID = defID;
    defID = newDefID;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TMapPackage.NEW_MENU_DEFINITIONS__DEF_ID, oldDefID, defID));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NewMenuContext> getContexts() {
    if (contexts == null)
    {
      contexts = new EObjectContainmentEList<NewMenuContext>(NewMenuContext.class, this, U2TMapPackage.NEW_MENU_DEFINITIONS__CONTEXTS);
    }
    return contexts;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NewMenuContext> getImportedContexts() {
    if (importedContexts == null)
    {
      importedContexts = new EObjectResolvingEList<NewMenuContext>(NewMenuContext.class, this, U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_CONTEXTS);
    }
    return importedContexts;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<NewMenuDefinitions> getImportedDefinitions() {
    if (importedDefinitions == null)
    {
      importedDefinitions = new EObjectResolvingEList<NewMenuDefinitions>(NewMenuDefinitions.class, this, U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_DEFINITIONS);
    }
    return importedDefinitions;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
    switch (featureID)
    {
      case U2TMapPackage.NEW_MENU_DEFINITIONS__CONTEXTS:
        return ((InternalEList<?>)getContexts()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID)
    {
      case U2TMapPackage.NEW_MENU_DEFINITIONS__DEF_ID:
        return getDefID();
      case U2TMapPackage.NEW_MENU_DEFINITIONS__CONTEXTS:
        return getContexts();
      case U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_CONTEXTS:
        return getImportedContexts();
      case U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_DEFINITIONS:
        return getImportedDefinitions();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case U2TMapPackage.NEW_MENU_DEFINITIONS__DEF_ID:
        setDefID((String)newValue);
        return;
      case U2TMapPackage.NEW_MENU_DEFINITIONS__CONTEXTS:
        getContexts().clear();
        getContexts().addAll((Collection<? extends NewMenuContext>)newValue);
        return;
      case U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_CONTEXTS:
        getImportedContexts().clear();
        getImportedContexts().addAll((Collection<? extends NewMenuContext>)newValue);
        return;
      case U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_DEFINITIONS:
        getImportedDefinitions().clear();
        getImportedDefinitions().addAll((Collection<? extends NewMenuDefinitions>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eUnset(int featureID) {
    switch (featureID)
    {
      case U2TMapPackage.NEW_MENU_DEFINITIONS__DEF_ID:
        setDefID(DEF_ID_EDEFAULT);
        return;
      case U2TMapPackage.NEW_MENU_DEFINITIONS__CONTEXTS:
        getContexts().clear();
        return;
      case U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_CONTEXTS:
        getImportedContexts().clear();
        return;
      case U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_DEFINITIONS:
        getImportedDefinitions().clear();
        return;
    }
    super.eUnset(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean eIsSet(int featureID) {
    switch (featureID)
    {
      case U2TMapPackage.NEW_MENU_DEFINITIONS__DEF_ID:
        return DEF_ID_EDEFAULT == null ? defID != null : !DEF_ID_EDEFAULT.equals(defID);
      case U2TMapPackage.NEW_MENU_DEFINITIONS__CONTEXTS:
        return contexts != null && !contexts.isEmpty();
      case U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_CONTEXTS:
        return importedContexts != null && !importedContexts.isEmpty();
      case U2TMapPackage.NEW_MENU_DEFINITIONS__IMPORTED_DEFINITIONS:
        return importedDefinitions != null && !importedDefinitions.isEmpty();
    }
    return super.eIsSet(featureID);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public String toString() {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (defID: ");
    result.append(defID);
    result.append(')');
    return result.toString();
  }

} //NewMenuDefinitionsImpl
