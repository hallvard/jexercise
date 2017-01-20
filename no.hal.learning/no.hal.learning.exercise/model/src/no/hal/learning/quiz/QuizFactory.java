/**
 */
package no.hal.learning.quiz;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.quiz.QuizPackage
 * @generated
 */
public interface QuizFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuizFactory eINSTANCE = no.hal.learning.quiz.impl.QuizFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Styled String Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styled String Question</em>'.
	 * @generated
	 */
	StyledStringQuestion createStyledStringQuestion();

	/**
	 * Returns a new object of class '<em>Styled String</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Styled String</em>'.
	 * @generated
	 */
	StyledString createStyledString();

	/**
	 * Returns a new object of class '<em>Char Style</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Char Style</em>'.
	 * @generated
	 */
	CharStyle createCharStyle();

	/**
	 * Returns a new object of class '<em>Simple Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Proposal</em>'.
	 * @generated
	 */
	<A extends SimpleAnswer<?>> SimpleProposal<A> createSimpleProposal();

	/**
	 * Returns a new object of class '<em>String Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>String Answer</em>'.
	 * @generated
	 */
	StringAnswer createStringAnswer();

	/**
	 * Returns a new object of class '<em>Number Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Answer</em>'.
	 * @generated
	 */
	NumberAnswer createNumberAnswer();

	/**
	 * Returns a new object of class '<em>Number Range</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Number Range</em>'.
	 * @generated
	 */
	NumberRange createNumberRange();

	/**
	 * Returns a new object of class '<em>Boolean Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Boolean Answer</em>'.
	 * @generated
	 */
	BooleanAnswer createBooleanAnswer();

	/**
	 * Returns a new object of class '<em>Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options Answer</em>'.
	 * @generated
	 */
	OptionsAnswer createOptionsAnswer();

	/**
	 * Returns a new object of class '<em>Options Proposal</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Options Proposal</em>'.
	 * @generated
	 */
	OptionsProposal createOptionsProposal();

	/**
	 * Returns a new object of class '<em>Option</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Option</em>'.
	 * @generated
	 */
	Option createOption();

	/**
	 * Returns a new object of class '<em>Single Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Single Options Answer</em>'.
	 * @generated
	 */
	SingleOptionsAnswer createSingleOptionsAnswer();

	/**
	 * Returns a new object of class '<em>Many Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Many Options Answer</em>'.
	 * @generated
	 */
	ManyOptionsAnswer createManyOptionsAnswer();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	QuizPackage getQuizPackage();

} //QuizFactory
