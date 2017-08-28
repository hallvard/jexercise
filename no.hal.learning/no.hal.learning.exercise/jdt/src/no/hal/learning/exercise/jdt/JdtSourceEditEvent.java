/**
 */
package no.hal.learning.exercise.jdt;

import no.hal.learning.exercise.workspace.SourceFileEditEvent;
import no.hal.learning.fv.FeatureValued;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.JdtSourceEditEvent#getMetrics <em>Metrics</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditEvent()
 * @model annotation="exp4j codeIssues='errorCount * 5 + warningCount'"
 * @generated
 */
public interface JdtSourceEditEvent extends SourceFileEditEvent {

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
	 * @see no.hal.learning.exercise.jdt.JdtPackage#getJdtSourceEditEvent_Metrics()
	 * @model mapType="no.hal.learning.exercise.jdt.StringToFeatureValued<org.eclipse.emf.ecore.EString, no.hal.learning.fv.FeatureValued>"
	 * @generated
	 */
	EMap<String, FeatureValued> getMetrics();

} // JdtClassEvent
