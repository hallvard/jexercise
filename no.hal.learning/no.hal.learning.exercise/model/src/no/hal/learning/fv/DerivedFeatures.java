/**
 */
package no.hal.learning.fv;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Derived Features</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.DerivedFeatures#getContained <em>Contained</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getDerivedFeatures()
 * @model abstract="true"
 * @generated
 */
public interface DerivedFeatures extends FeatureValued {
	/**
	 * Returns the value of the '<em><b>Contained</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.fv.FeatureValued}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contained</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contained</em>' containment reference list.
	 * @see no.hal.learning.fv.FvPackage#getDerivedFeatures_Contained()
	 * @model containment="true"
	 * @generated
	 */
	EList<FeatureValued> getContained();

} // DerivedFeatures
