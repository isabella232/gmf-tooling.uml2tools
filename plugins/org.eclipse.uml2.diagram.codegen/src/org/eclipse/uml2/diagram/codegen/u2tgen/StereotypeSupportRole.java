/**
 * <copyright>
 * </copyright>
 *
 * $Id: StereotypeSupportRole.java,v 1.3 2011/02/11 14:16:06 cwaniek Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Stereotype Support Role</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage#getStereotypeSupportRole()
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
	STEREOTYPE_LABEL(2, "STEREOTYPE_LABEL", "STEREOTYPE_LABEL"),

	/**
   * The '<em><b>COMBINED LABEL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #COMBINED_LABEL_VALUE
   * @generated
   * @ordered
   */
	COMBINED_LABEL(3, "COMBINED_LABEL", "COMBINED_LABEL"), /**
   * The '<em><b>DIAGRAM LABEL</b></em>' literal object.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #DIAGRAM_LABEL_VALUE
   * @generated
   * @ordered
   */
	DIAGRAM_LABEL(4, "DIAGRAM_LABEL", "DIAGRAM_LABEL");

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
   * The '<em><b>COMBINED LABEL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMBINED LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #COMBINED_LABEL
   * @model
   * @generated
   * @ordered
   */
	public static final int COMBINED_LABEL_VALUE = 3;

	/**
   * The '<em><b>DIAGRAM LABEL</b></em>' literal value.
   * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DIAGRAM LABEL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
   * @see #DIAGRAM_LABEL
   * @model
   * @generated
   * @ordered
   */
	public static final int DIAGRAM_LABEL_VALUE = 4;

	/**
   * An array of all the '<em><b>Stereotype Support Role</b></em>' enumerators.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final StereotypeSupportRole[] VALUES_ARRAY =
		new StereotypeSupportRole[]
    {
      CONTAINER,
      NAME_LABEL,
      STEREOTYPE_LABEL,
      COMBINED_LABEL,
      DIAGRAM_LABEL,
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
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StereotypeSupportRole result = VALUES_ARRAY[i];
      if (result.toString().equals(literal))
      {
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
    for (int i = 0; i < VALUES_ARRAY.length; ++i)
    {
      StereotypeSupportRole result = VALUES_ARRAY[i];
      if (result.getName().equals(name))
      {
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
    switch (value)
    {
      case CONTAINER_VALUE: return CONTAINER;
      case NAME_LABEL_VALUE: return NAME_LABEL;
      case STEREOTYPE_LABEL_VALUE: return STEREOTYPE_LABEL;
      case COMBINED_LABEL_VALUE: return COMBINED_LABEL;
      case DIAGRAM_LABEL_VALUE: return DIAGRAM_LABEL;
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
