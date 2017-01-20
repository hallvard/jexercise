/**
 */
package no.hal.learning.quiz;

import org.eclipse.emf.common.util.EList;
import no.hal.learning.exercise.Proposal;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Options Proposal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.quiz.OptionsProposal#getIndices <em>Indices</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.quiz.QuizPackage#getOptionsProposal()
 * @model
 * @generated
 */
public interface OptionsProposal extends Proposal<OptionsAnswer> {
	/**
	 * Returns the value of the '<em><b>Indices</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Indices</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Indices</em>' attribute list.
	 * @see no.hal.learning.quiz.QuizPackage#getOptionsProposal_Indices()
	 * @model
	 * @generated
	 */
	EList<Integer> getIndices();

} // OptionsProposal
