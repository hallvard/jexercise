/**
 */
package no.hal.learning.fv;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.ConstantFeatureList#getFeatureNames <em>Feature Names</em>}</li>
 *   <li>{@link no.hal.learning.fv.ConstantFeatureList#getVal <em>Val</em>}</li>
 *   <li>{@link no.hal.learning.fv.ConstantFeatureList#getDefVal <em>Def Val</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getConstantFeatureList()
 * @model
 * @generated
 */
public interface ConstantFeatureList extends FeatureValued {
	/**
	 * Returns the value of the '<em><b>Feature Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature Names</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature Names</em>' attribute list.
	 * @see no.hal.learning.fv.FvPackage#getConstantFeatureList_FeatureNames()
	 * @model
	 * @generated
	 */
	EList<String> getFeatureNames();

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
	 * @see no.hal.learning.fv.FvPackage#getConstantFeatureList_Val()
	 * @model
	 * @generated
	 */
	double getVal();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.ConstantFeatureList#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(double value);

	/**
	 * Returns the value of the '<em><b>Def Val</b></em>' attribute.
	 * The default value is <code>"0.0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Def Val</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def Val</em>' attribute.
	 * @see #setDefVal(double)
	 * @see no.hal.learning.fv.FvPackage#getConstantFeatureList_DefVal()
	 * @model default="0.0"
	 * @generated
	 */
	double getDefVal();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.ConstantFeatureList#getDefVal <em>Def Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def Val</em>' attribute.
	 * @see #getDefVal()
	 * @generated
	 */
	void setDefVal(double value);

} // ConstantList
