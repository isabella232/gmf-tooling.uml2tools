/**
 * <copyright>
 * </copyright>
 *
 * $Id: NewMenuContextImpl.java,v 1.2 2009/02/16 16:05:57 mgolubev Exp $
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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.diagram.codegen.u2tmap.AbstractNewMenuEntry;
import org.eclipse.uml2.diagram.codegen.u2tmap.NewMenuContext;
import org.eclipse.uml2.diagram.codegen.u2tmap.U2TMapPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>New Menu Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuContextImpl#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuContextImpl#isIncludeSubClasses <em>Include Sub Classes</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuContextImpl#getEntries <em>Entries</em>}</li>
 *   <li>{@link org.eclipse.uml2.diagram.codegen.u2tmap.impl.NewMenuContextImpl#getImportedEntries <em>Imported Entries</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewMenuContextImpl extends EObjectImpl implements NewMenuContext {
	/**
	 * The cached value of the '{@link #getMetaclass() <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclass()
	 * @generated
	 * @ordered
	 */
	protected EClass metaclass;

	/**
	 * The default value of the '{@link #isIncludeSubClasses() <em>Include Sub Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubClasses()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INCLUDE_SUB_CLASSES_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIncludeSubClasses() <em>Include Sub Classes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIncludeSubClasses()
	 * @generated
	 * @ordered
	 */
	protected boolean includeSubClasses = INCLUDE_SUB_CLASSES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNewMenuEntry> entries;

	/**
	 * The cached value of the '{@link #getImportedEntries() <em>Imported Entries</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractNewMenuEntry> importedEntries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewMenuContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return U2TMapPackage.Literals.NEW_MENU_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMetaclass() {
		if (metaclass != null && metaclass.eIsProxy()) {
			InternalEObject oldMetaclass = (InternalEObject)metaclass;
			metaclass = (EClass)eResolveProxy(oldMetaclass);
			if (metaclass != oldMetaclass) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, U2TMapPackage.NEW_MENU_CONTEXT__METACLASS, oldMetaclass, metaclass));
			}
		}
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass basicGetMetaclass() {
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaclass(EClass newMetaclass) {
		EClass oldMetaclass = metaclass;
		metaclass = newMetaclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TMapPackage.NEW_MENU_CONTEXT__METACLASS, oldMetaclass, metaclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIncludeSubClasses() {
		return includeSubClasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIncludeSubClasses(boolean newIncludeSubClasses) {
		boolean oldIncludeSubClasses = includeSubClasses;
		includeSubClasses = newIncludeSubClasses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, U2TMapPackage.NEW_MENU_CONTEXT__INCLUDE_SUB_CLASSES, oldIncludeSubClasses, includeSubClasses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNewMenuEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentWithInverseEList<AbstractNewMenuEntry>(AbstractNewMenuEntry.class, this, U2TMapPackage.NEW_MENU_CONTEXT__ENTRIES, U2TMapPackage.ABSTRACT_NEW_MENU_ENTRY__CONTEXT);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractNewMenuEntry> getImportedEntries() {
		if (importedEntries == null) {
			importedEntries = new EObjectResolvingEList<AbstractNewMenuEntry>(AbstractNewMenuEntry.class, this, U2TMapPackage.NEW_MENU_CONTEXT__IMPORTED_ENTRIES);
		}
		return importedEntries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case U2TMapPackage.NEW_MENU_CONTEXT__ENTRIES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntries()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case U2TMapPackage.NEW_MENU_CONTEXT__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
		switch (featureID) {
			case U2TMapPackage.NEW_MENU_CONTEXT__METACLASS:
				if (resolve) return getMetaclass();
				return basicGetMetaclass();
			case U2TMapPackage.NEW_MENU_CONTEXT__INCLUDE_SUB_CLASSES:
				return isIncludeSubClasses();
			case U2TMapPackage.NEW_MENU_CONTEXT__ENTRIES:
				return getEntries();
			case U2TMapPackage.NEW_MENU_CONTEXT__IMPORTED_ENTRIES:
				return getImportedEntries();
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
		switch (featureID) {
			case U2TMapPackage.NEW_MENU_CONTEXT__METACLASS:
				setMetaclass((EClass)newValue);
				return;
			case U2TMapPackage.NEW_MENU_CONTEXT__INCLUDE_SUB_CLASSES:
				setIncludeSubClasses((Boolean)newValue);
				return;
			case U2TMapPackage.NEW_MENU_CONTEXT__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends AbstractNewMenuEntry>)newValue);
				return;
			case U2TMapPackage.NEW_MENU_CONTEXT__IMPORTED_ENTRIES:
				getImportedEntries().clear();
				getImportedEntries().addAll((Collection<? extends AbstractNewMenuEntry>)newValue);
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
		switch (featureID) {
			case U2TMapPackage.NEW_MENU_CONTEXT__METACLASS:
				setMetaclass((EClass)null);
				return;
			case U2TMapPackage.NEW_MENU_CONTEXT__INCLUDE_SUB_CLASSES:
				setIncludeSubClasses(INCLUDE_SUB_CLASSES_EDEFAULT);
				return;
			case U2TMapPackage.NEW_MENU_CONTEXT__ENTRIES:
				getEntries().clear();
				return;
			case U2TMapPackage.NEW_MENU_CONTEXT__IMPORTED_ENTRIES:
				getImportedEntries().clear();
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
		switch (featureID) {
			case U2TMapPackage.NEW_MENU_CONTEXT__METACLASS:
				return metaclass != null;
			case U2TMapPackage.NEW_MENU_CONTEXT__INCLUDE_SUB_CLASSES:
				return includeSubClasses != INCLUDE_SUB_CLASSES_EDEFAULT;
			case U2TMapPackage.NEW_MENU_CONTEXT__ENTRIES:
				return entries != null && !entries.isEmpty();
			case U2TMapPackage.NEW_MENU_CONTEXT__IMPORTED_ENTRIES:
				return importedEntries != null && !importedEntries.isEmpty();
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
		result.append(" (includeSubClasses: ");
		result.append(includeSubClasses);
		result.append(')');
		return result.toString();
	}

} //NewMenuContextImpl
