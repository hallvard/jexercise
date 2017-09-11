/**
 */
package no.hal.learning.fv;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filtered Features2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.FilteredFeatures2#getPred <em>Pred</em>}</li>
 *   <li>{@link no.hal.learning.fv.FilteredFeatures2#getVal <em>Val</em>}</li>
 *   <li>{@link no.hal.learning.fv.FilteredFeatures2#getValFeatures <em>Val Features</em>}</li>
 *   <li>{@link no.hal.learning.fv.FilteredFeatures2#isSwap <em>Swap</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures2()
 * @model
 * @generated
 */
public interface FilteredFeatures2 extends FilteredFeatures {
	/**
	 * Returns the value of the '<em><b>Pred</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.learning.fv.Pred2Kind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pred</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pred</em>' attribute.
	 * @see no.hal.learning.fv.Pred2Kind
	 * @see #setPred(Pred2Kind)
	 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures2_Pred()
	 * @model
	 * @generated
	 */
	Pred2Kind getPred();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.FilteredFeatures2#getPred <em>Pred</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pred</em>' attribute.
	 * @see no.hal.learning.fv.Pred2Kind
	 * @see #getPred()
	 * @generated
	 */
	void setPred(Pred2Kind value);

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
	 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures2_Val()
	 * @model
	 * @generated
	 */
	double getVal();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.FilteredFeatures2#getVal <em>Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val</em>' attribute.
	 * @see #getVal()
	 * @generated
	 */
	void setVal(double value);

	/**
	 * Returns the value of the '<em><b>Val Features</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Val Features</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Val Features</em>' reference.
	 * @see #setValFeatures(FeatureValued)
	 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures2_ValFeatures()
	 * @model
	 * @generated
	 */
	FeatureValued getValFeatures();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.FilteredFeatures2#getValFeatures <em>Val Features</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Val Features</em>' reference.
	 * @see #getValFeatures()
	 * @generated
	 */
	void setValFeatures(FeatureValued value);

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
	 * @see no.hal.learning.fv.FvPackage#getFilteredFeatures2_Swap()
	 * @model
	 * @generated
	 */
	boolean isSwap();

	/**
	 * Sets the value of the '{@link no.hal.learning.fv.FilteredFeatures2#isSwap <em>Swap</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Swap</em>' attribute.
	 * @see #isSwap()
	 * @generated
	 */
	void setSwap(boolean value);

} // FilteredFeatures2
