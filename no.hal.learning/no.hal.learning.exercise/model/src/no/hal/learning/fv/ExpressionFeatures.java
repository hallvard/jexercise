/**
 */
package no.hal.learning.fv;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.ExpressionFeatures#getFeatures <em>Features</em>}</li>
 *   <li>{@link no.hal.learning.fv.ExpressionFeatures#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getExpressionFeatures()
 * @model
 * @generated
 */
public interface ExpressionFeatures extends DerivedFeatures {
	/**
	 * Returns the value of the '<em><b>Features</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Features</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Features</em>' map.
	 * @see no.hal.learning.fv.FvPackage#getExpressionFeatures_Features()
	 * @model mapType="no.hal.learning.fv.StringToString<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getFeatures();

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
	 * @see no.hal.learning.fv.FvPackage#getExpressionFeatures_Other()
	 * @model
	 * @generated
	 */
	FeatureValued getOther();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.ExpressionFeatures#getOther <em>Other</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' reference.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(FeatureValued value);

} // ExpressionFeatures
