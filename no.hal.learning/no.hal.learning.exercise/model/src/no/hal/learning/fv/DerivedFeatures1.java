/**
 */
package no.hal.learning.fv;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Features1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.DerivedFeatures1#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getDerivedFeatures1()
 * @model
 * @generated
 */
public interface DerivedFeatures1 extends OpDerivedFeatures {
	/**
	 * Returns the value of the '<em><b>Other</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other</em>' reference.
	 * @see #setOther(FeatureValued)
	 * @see no.hal.learning.fv.FvPackage#getDerivedFeatures1_Other()
	 * @model
	 * @generated
	 */
	FeatureValued getOther();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.DerivedFeatures1#getOther <em>Other</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' reference.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(FeatureValued value);

} // DerivedFeatures1
