/**
 * <copyright>
 * </copyright>
 *
 * $Id: StereotypeSupportRole.java,v 1.1 2009/02/16 16:05:57 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.gmfgenext;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stereotype Support Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.codegen.gmfgenext.GMFGenExtPackage#getStereotypeSupportRole()
 * @model
 * @generated
 */
public enum StereotypeSupportRole implements Enumerator {
	/**
	 * The '<em><b>CONTAINER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONTAINER_VALUE
	 * @generated
	 * @ordered
	 */
	CONTAINER(0, "CONTAINER", "CONTAINER"),

	/**
	 * The '<em><b>NAME LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NAME_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	NAME_LABEL(1, "NAME_LABEL", "NAME_LABEL"),

	/**
	 * The '<em><b>STEREOTYPE LABEL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STEREOTYPE_LABEL_VALUE
	 * @generated
	 * @ordered
	 */
	STEREOTYPE_LABEL(2, "STEREOTYPE_LABEL", "STEREOTYPE_LABEL");

	/**
	 * The '<em><b>CONTAINER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONTAINER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONTAINER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONTAINER_VALUE = 0;

	/**
	 * The '<em><b>NAME LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NAME LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NAME_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int NAME_LABEL_VALUE = 1;

	/**
	 * The '<em><b>STEREOTYPE LABEL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STEREOTYPE LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STEREOTYPE_LABEL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STEREOTYPE_LABEL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Stereotype Support Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StereotypeSupportRole[] VALUES_ARRAY =
		new StereotypeSupportRole[] {
			CONTAINER,
			NAME_LABEL,
			STEREOTYPE_LABEL,
		};

	/**
	 * A public read-only list of all the '<em><b>Stereotype Support Role</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StereotypeSupportRole> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stereotype Support Role</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StereotypeSupportRole get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StereotypeSupportRole result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stereotype Support Role</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StereotypeSupportRole getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StereotypeSupportRole result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stereotype Support Role</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StereotypeSupportRole get(int value) {
		switch (value) {
			case CONTAINER_VALUE: return CONTAINER;
			case NAME_LABEL_VALUE: return NAME_LABEL;
			case STEREOTYPE_LABEL_VALUE: return STEREOTYPE_LABEL;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private StereotypeSupportRole(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //StereotypeSupportRole
