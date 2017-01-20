/**
 */
package no.hal.learning.quiz;

import org.eclipse.emf.common.util.EList;
import no.hal.learning.exercise.Question;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Styled String Question</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.quiz.StyledStringQuestion#getStyledStrings <em>Styled Strings</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.quiz.QuizPackage#getStyledStringQuestion()
 * @model
 * @generated
 */
public interface StyledStringQuestion extends Question {

	/**
	 * Returns the value of the '<em><b>Styled Strings</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.learning.quiz.StyledString}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Styled Strings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Styled Strings</em>' containment reference list.
	 * @see no.hal.learning.quiz.QuizPackage#getStyledStringQuestion_StyledStrings()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyledString> getStyledStrings();
} // StyledStringQuestion
