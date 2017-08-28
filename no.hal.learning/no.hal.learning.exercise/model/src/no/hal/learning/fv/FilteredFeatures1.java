/**
 */
package no.hal.learning.fv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtered Features1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.FilteredFeatures1#getPred <em>Pred</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures1()
 * @model
 * @generated
 */
public interface FilteredFeatures1 extends FilteredFeatures {
	/**
	 * Returns the value of the '<em><b>Pred</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.learning.fv.Pred1Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pred</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' attribute.
	 * @see no.hal.learning.fv.Pred1Kind
	 * @see #setPred(Pred1Kind)
	 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures1_Pred()
	 * @model
	 * @generated
	 */
	Pred1Kind getPred();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.FilteredFeatures1#getPred <em>Pred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred</em>' attribute.
	 * @see no.hal.learning.fv.Pred1Kind
	 * @see #getPred()
	 * @generated
	 */
	void setPred(Pred1Kind value);

} // FilteredFeatures1
