/**
 */
package no.hal.learning.exercise.jdt;

import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.fv.FeatureValued;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Answer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtSourceEditAnswer#getClassName <em>Class Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtSourceEditAnswer#getMethodNames <em>Method Names</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtSourceEditAnswer#getMetrics <em>Metrics</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditAnswer()
 * @model
 * @generated
 */
public interface JdtSourceEditAnswer extends SourceFileEditAnswer {
	/**
	 * Returns the value of the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Name</em>' attribute.
	 * @see #setClassName(String)
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditAnswer_ClassName()
	 * @model
	 * @generated
	 */
	String getClassName();

	/**
	 * Sets the value of the '{@link no.hal.learning.exercise.jdt.JdtSourceEditAnswer#getClassName <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Name</em>' attribute.
	 * @see #getClassName()
	 * @generated
	 */
	void setClassName(String value);

	/**
	 * Returns the value of the '<em><b>Method Names</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Names</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Names</em>' attribute list.
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditAnswer_MethodNames()
	 * @model
	 * @generated
	 */
	EList<String> getMethodNames();

	/**
	 * Returns the value of the '<em><b>Metrics</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link no.hal.learning.fv.FeatureValued},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metrics</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metrics</em>' map.
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditAnswer_Metrics()
	 * @model mapType="no.hal.learning.exercise.jdt.StringToFeatureValued<org.eclipse.emf.ecore.EString, no.hal.learning.fv.FeatureValued>"
	 * @generated
	 */
	EMap<String, FeatureValued> getMetrics();

} // JdtClassAnswer
