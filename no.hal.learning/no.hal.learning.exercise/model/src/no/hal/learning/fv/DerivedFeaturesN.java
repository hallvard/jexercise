/**
 */
package no.hal.learning.fv;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dervived Features N</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.DerivedFeaturesN#getOthers <em>Others</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getDerivedFeaturesN()
 * @model
 * @generated
 */
public interface DerivedFeaturesN extends OpDerivedFeatures {
	/**
	 * Returns the value of the '<em><b>Others</b></em>' reference list.
	 * The list contents are of type {@link no.hal.learning.fv.FeatureValued}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Others</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Others</em>' reference list.
	 * @see no.hal.learning.fv.FvPackage#getDerivedFeaturesN_Others()
	 * @model
	 * @generated
	 */
	EList<FeatureValued> getOthers();

} // DervivedFeaturesN
