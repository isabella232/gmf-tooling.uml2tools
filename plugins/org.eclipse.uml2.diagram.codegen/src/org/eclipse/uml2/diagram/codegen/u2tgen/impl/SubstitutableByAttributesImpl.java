/**
 * <copyright>
 * </copyright>
 *
 * $Id: SubstitutableByAttributesImpl.java,v 1.2 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.impl;

import java.util.Collection;
import java.util.HashMap;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.eclipse.gmf.codegen.gmfgen.GenCommonBase;
import org.eclipse.gmf.codegen.gmfgen.GenDiagram;
import org.eclipse.gmf.codegen.gmfgen.GenNode;

import org.eclipse.uml2.diagram.codegen.u2tgen.SubstitutableByAttributes;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Substitutable By Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.SubstitutableByAttributesImpl#getSubstitutableByIDs <em>Substitutable By IDs</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tgen.impl.SubstitutableByAttributesImpl#isRequiresAll <em>Requires All</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SubstitutableByAttributesImpl extends EObjectImpl implements SubstitutableByAttributes {
	/**
   * The cached value of the '{@link #getSubstitutableByIDs() <em>Substitutable By IDs</em>}' attribute list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getSubstitutableByIDs()
   * @generated
   * @ordered
   */
	protected EList<Integer> substitutableByIDs;

	/**
   * The default value of the '{@link #isRequiresAll() <em>Requires All</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isRequiresAll()
   * @generated
   * @ordered
   */
	protected static final boolean REQUIRES_ALL_EDEFAULT = false;

	/**
   * The cached value of the '{@link #isRequiresAll() <em>Requires All</em>}' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #isRequiresAll()
   * @generated
   * @ordered
   */
	protected boolean requiresAll = REQUIRES_ALL_EDEFAULT;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected SubstitutableByAttributesImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return U2TGenPackage.Literals.SUBSTITUTABLE_BY_ATTRIBUTES;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<Integer> getSubstitutableByIDs() {
    if (substitutableByIDs == null)
    {
      substitutableByIDs = new EDataTypeUniqueEList<Integer>(Integer.class, this, U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY_IDS);
    }
    return substitutableByIDs;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean isRequiresAll() {
    return requiresAll;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setRequiresAll(boolean newRequiresAll) {
    boolean oldRequiresAll = requiresAll;
    requiresAll = newRequiresAll;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__REQUIRES_ALL, oldRequiresAll, requiresAll));
  }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList getSubstitutableByNodes() {
		EList<GenCommonBase> result = new BasicEList<GenCommonBase>();
		if (getSubstitutableByIDs().isEmpty()){
			return result;
		}
		
		GenDiagram diagram = findDiagram();
		if (diagram == null){
			return result;
		}
		
		HashMap<Integer, GenNode> nodesMap = new HashMap<Integer, GenNode>();
		for (GenNode next : diagram.getAllNodes()){
			nodesMap.put(next.getVisualID(), next);
		}

		for (Object next : getSubstitutableByIDs()){
			Integer nextId = (Integer)next;
			GenNode nextNode = nodesMap.get(nextId);
			if (nextNode != null){
				result.add(nextNode);
			}
		}
		return result;
	}
	
	/**
	 * @NOT-generated
	 */
	private GenDiagram findDiagram() {
		EObject next = this;
		while(next != null && false == next instanceof GenDiagram){
			next = next.eContainer();
		}
		return (GenDiagram)next;
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
      case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY_IDS:
        return getSubstitutableByIDs();
      case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__REQUIRES_ALL:
        return isRequiresAll();
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
      case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY_IDS:
        getSubstitutableByIDs().clear();
        getSubstitutableByIDs().addAll((Collection<? extends Integer>)newValue);
        return;
      case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__REQUIRES_ALL:
        setRequiresAll((Boolean)newValue);
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
      case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY_IDS:
        getSubstitutableByIDs().clear();
        return;
      case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__REQUIRES_ALL:
        setRequiresAll(REQUIRES_ALL_EDEFAULT);
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
      case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__SUBSTITUTABLE_BY_IDS:
        return substitutableByIDs != null && !substitutableByIDs.isEmpty();
      case U2TGenPackage.SUBSTITUTABLE_BY_ATTRIBUTES__REQUIRES_ALL:
        return requiresAll != REQUIRES_ALL_EDEFAULT;
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
    result.append(" (substitutableByIDs: ");
    result.append(substitutableByIDs);
    result.append(", requiresAll: ");
    result.append(requiresAll);
    result.append(')');
    return result.toString();
  }

} //SubstitutableByAttributesImpl
