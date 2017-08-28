/**
 */
package no.hal.learning.fv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delegated Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.DelegatedFeatures#getFeatures <em>Features</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getDelegatedFeatures()
 * @model
 * @generated
 */
public interface DelegatedFeatures extends FeatureValued {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' containment reference.
	 * @see #setFeatures(FeatureValued)
	 * @see no.hal.learning.fv.FvPackage#getDelegatedFeatures_Features()
	 * @model containment="true"
	 * @generated
	 */
	FeatureValued getFeatures();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.DelegatedFeatures#getFeatures <em>Features</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Features</em>' containment reference.
	 * @see #getFeatures()
	 * @generated
	 */
	void setFeatures(FeatureValued value);

} // DelegatedFeatures
