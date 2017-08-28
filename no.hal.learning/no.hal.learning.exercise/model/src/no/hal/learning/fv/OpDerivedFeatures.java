/**
 */
package no.hal.learning.fv;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Op Derived Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.OpDerivedFeatures#getOp <em>Op</em>}</li>
 *   <li>{@link no.hal.learning.fv.OpDerivedFeatures#getVal <em>Val</em>}</li>
 *   <li>{@link no.hal.learning.fv.OpDerivedFeatures#isSwap <em>Swap</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getOpDerivedFeatures()
 * @model abstract="true"
 * @generated
 */
public interface OpDerivedFeatures extends DerivedFeatures {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.learning.fv.Op2Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Op</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' attribute.
	 * @see no.hal.learning.fv.Op2Kind
	 * @see #setOp(Op2Kind)
	 * @see no.hal.learning.fv.FvPackage#getOpDerivedFeatures_Op()
	 * @model
	 * @generated
	 */
	Op2Kind getOp();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.OpDerivedFeatures#getOp <em>Op</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' attribute.
	 * @see no.hal.learning.fv.Op2Kind
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Op2Kind value);

	/**
	 * Returns the value of the '<em><b>Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val</em>' attribute.
	 * @see #setVal(double)
	 * @see no.hal.learning.fv.FvPackage#getOpDerivedFeatures_Val()
	 * @model
	 * @generated
	 */
	double getVal();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.OpDerivedFeatures#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(double value);

	/**
	 * Returns the value of the '<em><b>Swap</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Swap</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Swap</em>' attribute.
	 * @see #setSwap(boolean)
	 * @see no.hal.learning.fv.FvPackage#getOpDerivedFeatures_Swap()
	 * @model
	 * @generated
	 */
	boolean isSwap();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.OpDerivedFeatures#isSwap <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap</em>' attribute.
	 * @see #isSwap()
	 * @generated
	 */
	void setSwap(boolean value);

} // OpDerivedFeatures
