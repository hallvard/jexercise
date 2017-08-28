/**
 */
package no.hal.learning.fv;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

import no.hal.learning.fv.util.Pred1;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Pred1 Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see no.hal.learning.fv.FvPackage#getPred1Kind()
 * @model
 * @generated
 */
public enum Pred1Kind implements Enumerator {
	/**
	 * The '<em><b>GT0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GT0_VALUE
	 * @generated
	 * @ordered
	 */
	GT0(0, "GT0", ">0"),

	/**
	 * The '<em><b>GE0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GE0_VALUE
	 * @generated
	 * @ordered
	 */
	GE0(1, "GE0", ">=0"),

	/**
	 * The '<em><b>ZERO</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ZERO_VALUE
	 * @generated
	 * @ordered
	 */
	ZERO(2, "ZERO", "==0"),

	/**
	 * The '<em><b>LE0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LE0_VALUE
	 * @generated
	 * @ordered
	 */
	LE0(3, "LE0", "<=0"),

	/**
	 * The '<em><b>LT0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LT0_VALUE
	 * @generated
	 * @ordered
	 */
	LT0(4, "LT0", "<0");

	/**
	 * The '<em><b>GT0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GT0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GT0
	 * @model literal=">0"
	 * @generated
	 * @ordered
	 */
	public static final int GT0_VALUE = 0;

	/**
	 * The '<em><b>GE0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GE0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GE0
	 * @model literal=">=0"
	 * @generated
	 * @ordered
	 */
	public static final int GE0_VALUE = 1;

	/**
	 * The '<em><b>ZERO</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ZERO</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ZERO
	 * @model literal="==0"
	 * @generated
	 * @ordered
	 */
	public static final int ZERO_VALUE = 2;

	/**
	 * The '<em><b>LE0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LE0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LE0
	 * @model literal="<=0"
	 * @generated
	 * @ordered
	 */
	public static final int LE0_VALUE = 3;

	/**
	 * The '<em><b>LT0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>LT0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LT0
	 * @model literal="<0"
	 * @generated
	 * @ordered
	 */
	public static final int LT0_VALUE = 4;

	/**
	 * An array of all the '<em><b>Pred1 Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final Pred1Kind[] VALUES_ARRAY =
		new Pred1Kind[] {
			GT0,
			GE0,
			ZERO,
			LE0,
			LT0,
		};

	/**
	 * A public read-only list of all the '<em><b>Pred1 Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<Pred1Kind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pred1 Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Pred1Kind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Pred1Kind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pred1 Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Pred1Kind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Pred1Kind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pred1 Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static Pred1Kind get(int value) {
		switch (value) {
			case GT0_VALUE: return GT0;
			case GE0_VALUE: return GE0;
			case ZERO_VALUE: return ZERO;
			case LE0_VALUE: return LE0;
			case LT0_VALUE: return LT0;
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
	private Pred1Kind(int value, String name, String literal) {
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

	public Pred1 getPred1() {
		return Op1Kind.getFunction(Pred1.class, getName());
	}
} //Pred1Kind
