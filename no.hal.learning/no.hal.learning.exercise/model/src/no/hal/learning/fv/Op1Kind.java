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
	 * The '<em><b>IDENTITY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IDENTITY_VALUE
	 * @generated
	 * @ordered
	 */
	IDENTITY(0, "IDENTITY", "IDENTITY"), /**
	 * The '<em><b>NEG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NEG_VALUE
	 * @generated
	 * @ordered
	 */
	NEG(1, "NEG", "-"),

	/**
	 * The '<em><b>INV</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INV_VALUE
	 * @generated
	 * @ordered
	 */
	INV(2, "INV", "!"),

	/**
	 * The '<em><b>ABS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ABS_VALUE
	 * @generated
	 * @ordered
	 */
	ABS(3, "ABS", "ABS"),

	/**
	 * The '<em><b>SIGNUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIGNUM_VALUE
	 * @generated
	 * @ordered
	 */
	SIGNUM(4, "SIGNUM", "SIGNUM"), /**
	 * The '<em><b>ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO(-1, "ZERO", "0"), /**
	 * The '<em><b>HALF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HALF_VALUE
	 * @generated
	 * @ordered
	 */
	HALF(-2, "HALF", "0.5"), /**
	 * The '<em><b>ONE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ONE_VALUE
	 * @generated
	 * @ordered
	 */
	ONE(-3, "ONE", "1");

	/**
	 * The '<em><b>IDENTITY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>IDENTITY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IDENTITY
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int IDENTITY_VALUE = 0;

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
	public static final int NEG_VALUE = 1;

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
	public static final int INV_VALUE = 2;

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
	public static final int ABS_VALUE = 3;

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
	public static final int SIGNUM_VALUE = 4;

	/**
	 * The '<em><b>ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO
	 * @model literal="0"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_VALUE = -1;

	/**
	 * The '<em><b>HALF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>HALF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HALF
	 * @model literal="0.5"
	 * @generated
	 * @ordered
	 */
	public static final int HALF_VALUE = -2;

	/**
	 * The '<em><b>ONE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ONE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ONE
	 * @model literal="1"
	 * @generated
	 * @ordered
	 */
	public static final int ONE_VALUE = -3;

	/**
	 * An array of all the '<em><b>Op1 Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Op1Kind[] VALUES_ARRAY =
		new Op1Kind[] {
			IDENTITY,
			NEG,
			INV,
			ABS,
			SIGNUM,
			ZERO,
			HALF,
			ONE,
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
			case IDENTITY_VALUE: return IDENTITY;
			case NEG_VALUE: return NEG;
			case INV_VALUE: return INV;
			case ABS_VALUE: return ABS;
			case SIGNUM_VALUE: return SIGNUM;
			case ZERO_VALUE: return ZERO;
			case HALF_VALUE: return HALF;
			case ONE_VALUE: return ONE;
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

	public Op1 getOp1() {
		try {
			return createConstantOp1(Double.valueOf(getLiteral()));
		} catch (NumberFormatException e) {
		}
		return Op1Kind.getFunction(Op1.class, getName());
	}
	
	
	public static Op1 createConstantOp1(final double d) {
		return new Op1() {
			@Override
			public double apply(double val) {
				return d;
			}
		};
	}

} //Op1Kind
