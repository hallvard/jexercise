/**
 */
package no.hal.learning.fv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtered Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.FilteredFeatures#getOther <em>Other</em>}</li>
 *   <li>{@link no.hal.learning.fv.FilteredFeatures#getNameFilter <em>Name Filter</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures()
 * @model abstract="true"
 * @generated
 */
public interface FilteredFeatures extends DerivedFeatures {

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
	 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures_Other()
	 * @model
	 * @generated
	 */
	FeatureValued getOther();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.FilteredFeatures#getOther <em>Other</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' reference.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(FeatureValued value);

	/**
	 * Returns the value of the '<em><b>Name Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Filter</em>' attribute.
	 * @see #setNameFilter(String)
	 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures_NameFilter()
	 * @model
	 * @generated
	 */
	String getNameFilter();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.FilteredFeatures#getNameFilter <em>Name Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Filter</em>' attribute.
	 * @see #getNameFilter()
	 * @generated
	 */
	void setNameFilter(String value);
} // FilteredFeatures
