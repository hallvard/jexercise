/**
 */
package no.hal.learning.fv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import no.hal.learning.fv.util.Op1;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Op1 Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.hal.learning.fv.FvPackage#getOp1Kind()
 * @model
 * @generated
 */
public enum Op1Kind implements Enumerator {
	/**
	 * The '<em><b>NEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEG_VALUE
	 * @generated
	 * @ordered
	 */
	NEG(0, "NEG", "-"),

	/**
	 * The '<em><b>INV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INV_VALUE
	 * @generated
	 * @ordered
	 */
	INV(1, "INV", "!"),

	/**
	 * The '<em><b>ABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS_VALUE
	 * @generated
	 * @ordered
	 */
	ABS(2, "ABS", "ABS"),

	/**
	 * The '<em><b>SIGNUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNUM_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNUM(3, "SIGNUM", "SIGNUM");

	/**
	 * The '<em><b>NEG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NEG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NEG
	 * @model literal="-"
	 * @generated
	 * @ordered
	 */
	public static final int NEG_VALUE = 0;

	/**
	 * The '<em><b>INV</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INV</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INV
	 * @model literal="!"
	 * @generated
	 * @ordered
	 */
	public static final int INV_VALUE = 1;

	/**
	 * The '<em><b>ABS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ABS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ABS
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ABS_VALUE = 2;

	/**
	 * The '<em><b>SIGNUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SIGNUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIGNUM
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SIGNUM_VALUE = 3;

	/**
	 * An array of all the '<em><b>Op1 Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Op1Kind[] VALUES_ARRAY =
		new Op1Kind[] {
			NEG,
			INV,
			ABS,
			SIGNUM,
		};

	/**
	 * A public read-only list of all the '<em><b>Op1 Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Op1Kind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Op1 Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Op1Kind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Op1Kind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Op1 Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Op1Kind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Op1Kind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Op1 Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Op1Kind get(int value) {
		switch (value) {
			case NEG_VALUE: return NEG;
			case INV_VALUE: return INV;
			case ABS_VALUE: return ABS;
			case SIGNUM_VALUE: return SIGNUM;
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
	private Op1Kind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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
	
	static <T> T getFunction(Class<T> clazz, String functionName) {
		try {
			return (T) clazz.getField(functionName).get(null);
		} catch (Exception e) {
			throw new UnsupportedOperationException("Unknown implementation of " + functionName);
		}
	}

	Op1 getOp1() {
		return Op1Kind.getFunction(Op1.class, getName());
	}
	
} //Op1Kind
