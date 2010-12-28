/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Class Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.hal.jex.JexPackage#getClassKind()
 * @model
 * @generated
 */
public enum ClassKind implements Enumerator {
	/**
	 * The '<em><b>Class Kind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLASS_KIND_VALUE
	 * @generated
	 * @ordered
	 */
	CLASS_KIND(0, "classKind", "classKind"),

	/**
	 * The '<em><b>Interface Kind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_KIND_VALUE
	 * @generated
	 * @ordered
	 */
	INTERFACE_KIND(1, "interfaceKind", "interfaceKind"),

	/**
	 * The '<em><b>Enum Kind</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ENUM_KIND_VALUE
	 * @generated
	 * @ordered
	 */
	ENUM_KIND(2, "enumKind", "enumKind");

	/**
	 * The '<em><b>Class Kind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Class Kind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLASS_KIND
	 * @model name="classKind"
	 * @generated
	 * @ordered
	 */
	public static final int CLASS_KIND_VALUE = 0;

	/**
	 * The '<em><b>Interface Kind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Interface Kind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INTERFACE_KIND
	 * @model name="interfaceKind"
	 * @generated
	 * @ordered
	 */
	public static final int INTERFACE_KIND_VALUE = 1;

	/**
	 * The '<em><b>Enum Kind</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Enum Kind</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ENUM_KIND
	 * @model name="enumKind"
	 * @generated
	 * @ordered
	 */
	public static final int ENUM_KIND_VALUE = 2;

	/**
	 * An array of all the '<em><b>Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClassKind[] VALUES_ARRAY =
		new ClassKind[] {
			CLASS_KIND,
			INTERFACE_KIND,
			ENUM_KIND,
		};

	/**
	 * A public read-only list of all the '<em><b>Class Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClassKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Class Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClassKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Class Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClassKind get(int value) {
		switch (value) {
			case CLASS_KIND_VALUE: return CLASS_KIND;
			case INTERFACE_KIND_VALUE: return INTERFACE_KIND;
			case ENUM_KIND_VALUE: return ENUM_KIND;
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
	private ClassKind(int value, String name, String literal) {
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

	//
	
	public boolean isKind(IType coreElement) {
		try {
			switch (this) {
			case CLASS_KIND: return coreElement.isClass();
			case INTERFACE_KIND: return coreElement.isInterface();
			case ENUM_KIND: return coreElement.isEnum();
			}
		} catch (JavaModelException e) {
		}
		return false;
	}
	
} //ClassKind
