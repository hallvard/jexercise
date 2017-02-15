/**
 */
package no.hal.learning.exercise.jdt;

import no.hal.learning.exercise.MarkerInfo;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Marker Info</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtMarkerInfo#getProblemCategory <em>Problem Category</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtMarkerInfo#getProblemType <em>Problem Type</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtMarkerInfo()
 * @model
 * @generated
 */
public interface JdtMarkerInfo extends MarkerInfo {
	/**
	 * Returns the value of the '<em><b>Problem Category</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Category</em>' attribute.
	 * @see #setProblemCategory(int)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtMarkerInfo_ProblemCategory()
	 * @model annotation="no.hal.learning.exercise.MarkerInfo valueClass='org.eclipse.jdt.core.compiler.CategorizedProblem' fieldPattern='CAT_.*'"
	 * @generated
	 */
	int getProblemCategory();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtMarkerInfo#getProblemCategory <em>Problem Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Category</em>' attribute.
	 * @see #getProblemCategory()
	 * @generated
	 */
	void setProblemCategory(int value);

	/**
	 * Returns the value of the '<em><b>Problem Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Problem Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Problem Type</em>' attribute.
	 * @see #setProblemType(int)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtMarkerInfo_ProblemType()
	 * @model annotation="no.hal.learning.exercise.MarkerInfo valueClass='org.eclipse.jdt.core.compiler.IProblem'"
	 * @generated
	 */
	int getProblemType();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtMarkerInfo#getProblemType <em>Problem Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Problem Type</em>' attribute.
	 * @see #getProblemType()
	 * @generated
	 */
	void setProblemType(int value);

} // MarkerInfo
