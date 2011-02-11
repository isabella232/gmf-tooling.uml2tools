/**
 * <copyright>
 * </copyright>
 *
 * $Id: FakeImpl.java,v 1.2 2011/02/11 14:16:05 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tmap.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.gmf.gmfgraph.Canvas;

import org.eclipse.gmf.tooldef.ToolRegistry;

import org.eclipse.uml2.diagram.codegen.u2tmap.Fake;
import org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fake</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.FakeImpl#getExplicitGraphdefReference <em>Explicit Graphdef Reference</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.FakeImpl#getExplicitTooldefReference <em>Explicit Tooldef Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class FakeImpl extends EObjectImpl implements Fake {
	/**
   * The cached value of the '{@link #getExplicitGraphdefReference() <em>Explicit Graphdef Reference</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExplicitGraphdefReference()
   * @generated
   * @ordered
   */
	protected Canvas explicitGraphdefReference;

	/**
   * The cached value of the '{@link #getExplicitTooldefReference() <em>Explicit Tooldef Reference</em>}' reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getExplicitTooldefReference()
   * @generated
   * @ordered
   */
	protected ToolRegistry explicitTooldefReference;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FakeImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return U2TMapPackage.Literals.FAKE;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Canvas getExplicitGraphdefReference() {
    if (explicitGraphdefReference != null && explicitGraphdefReference.eIsProxy())
    {
      InternalEObject oldExplicitGraphdefReference = (InternalEObject)explicitGraphdefReference;
      explicitGraphdefReference = (Canvas)eResolveProxy(oldExplicitGraphdefReference);
      if (explicitGraphdefReference != oldExplicitGraphdefReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, U2TMapPackage.FAKE__EXPLICIT_GRAPHDEF_REFERENCE, oldExplicitGraphdefReference, explicitGraphdefReference));
      }
    }
    return explicitGraphdefReference;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Canvas basicGetExplicitGraphdefReference() {
    return explicitGraphdefReference;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setExplicitGraphdefReference(Canvas newExplicitGraphdefReference) {
    Canvas oldExplicitGraphdefReference = explicitGraphdefReference;
    explicitGraphdefReference = newExplicitGraphdefReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TMapPackage.FAKE__EXPLICIT_GRAPHDEF_REFERENCE, oldExplicitGraphdefReference, explicitGraphdefReference));
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ToolRegistry getExplicitTooldefReference() {
    if (explicitTooldefReference != null && explicitTooldefReference.eIsProxy())
    {
      InternalEObject oldExplicitTooldefReference = (InternalEObject)explicitTooldefReference;
      explicitTooldefReference = (ToolRegistry)eResolveProxy(oldExplicitTooldefReference);
      if (explicitTooldefReference != oldExplicitTooldefReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, U2TMapPackage.FAKE__EXPLICIT_TOOLDEF_REFERENCE, oldExplicitTooldefReference, explicitTooldefReference));
      }
    }
    return explicitTooldefReference;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public ToolRegistry basicGetExplicitTooldefReference() {
    return explicitTooldefReference;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public void setExplicitTooldefReference(ToolRegistry newExplicitTooldefReference) {
    ToolRegistry oldExplicitTooldefReference = explicitTooldefReference;
    explicitTooldefReference = newExplicitTooldefReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, U2TMapPackage.FAKE__EXPLICIT_TOOLDEF_REFERENCE, oldExplicitTooldefReference, explicitTooldefReference));
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
      case U2TMapPackage.FAKE__EXPLICIT_GRAPHDEF_REFERENCE:
        if (resolve) return getExplicitGraphdefReference();
        return basicGetExplicitGraphdefReference();
      case U2TMapPackage.FAKE__EXPLICIT_TOOLDEF_REFERENCE:
        if (resolve) return getExplicitTooldefReference();
        return basicGetExplicitTooldefReference();
    }
    return super.eGet(featureID, resolve, coreType);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public void eSet(int featureID, Object newValue) {
    switch (featureID)
    {
      case U2TMapPackage.FAKE__EXPLICIT_GRAPHDEF_REFERENCE:
        setExplicitGraphdefReference((Canvas)newValue);
        return;
      case U2TMapPackage.FAKE__EXPLICIT_TOOLDEF_REFERENCE:
        setExplicitTooldefReference((ToolRegistry)newValue);
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
      case U2TMapPackage.FAKE__EXPLICIT_GRAPHDEF_REFERENCE:
        setExplicitGraphdefReference((Canvas)null);
        return;
      case U2TMapPackage.FAKE__EXPLICIT_TOOLDEF_REFERENCE:
        setExplicitTooldefReference((ToolRegistry)null);
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
      case U2TMapPackage.FAKE__EXPLICIT_GRAPHDEF_REFERENCE:
        return explicitGraphdefReference != null;
      case U2TMapPackage.FAKE__EXPLICIT_TOOLDEF_REFERENCE:
        return explicitTooldefReference != null;
    }
    return super.eIsSet(featureID);
  }

} //FakeImpl
