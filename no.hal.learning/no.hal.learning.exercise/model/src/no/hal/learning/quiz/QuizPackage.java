/**
 */
package no.hal.learning.quiz;

import no.hal.learning.exercise.ExercisePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see no.hal.learning.quiz.QuizFactory
 * @model kind="package"
 * @generated
 */
public interface QuizPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "quiz";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "platform:/plugin/no.hal.learning.exercise.model/model/quiz.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "quiz";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	QuizPackage eINSTANCE = no.hal.learning.quiz.impl.QuizPackageImpl.init();

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.StyledStringQuestionImpl <em>Styled String Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.StyledStringQuestionImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getStyledStringQuestion()
	 * @generated
	 */
	int STYLED_STRING_QUESTION = 0;

	/**
	 * The feature id for the '<em><b>Styled Strings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION__STYLED_STRINGS = ExercisePackage.QUESTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Styled String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION_FEATURE_COUNT = ExercisePackage.QUESTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Styled String Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_QUESTION_OPERATION_COUNT = ExercisePackage.QUESTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.StyledStringImpl <em>Styled String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.StyledStringImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getStyledString()
	 * @generated
	 */
	int STYLED_STRING = 1;

	/**
	 * The feature id for the '<em><b>Char Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__CHAR_STYLE = 0;

	/**
	 * The feature id for the '<em><b>Effective Char Style</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__EFFECTIVE_CHAR_STYLE = 1;

	/**
	 * The feature id for the '<em><b>Prefix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__PREFIX = 2;

	/**
	 * The feature id for the '<em><b>Styled String</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__STYLED_STRING = 3;

	/**
	 * The feature id for the '<em><b>Suffix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING__SUFFIX = 4;

	/**
	 * The number of structural features of the '<em>Styled String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Styled String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STYLED_STRING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.CharStyleImpl <em>Char Style</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.CharStyleImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getCharStyle()
	 * @generated
	 */
	int CHAR_STYLE = 2;

	/**
	 * The feature id for the '<em><b>Italic</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__ITALIC = 0;

	/**
	 * The feature id for the '<em><b>Bold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__BOLD = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Family</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__FAMILY = 3;

	/**
	 * The feature id for the '<em><b>Foreground</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__FOREGROUND = 4;

	/**
	 * The feature id for the '<em><b>Background</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE__BACKGROUND = 5;

	/**
	 * The number of structural features of the '<em>Char Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Char Style</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAR_STYLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.OptionAnswerImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getOptionAnswer()
	 * @generated
	 */
	int OPTION_ANSWER = 3;

	/**
	 * The number of structural features of the '<em>Option Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER_FEATURE_COUNT = ExercisePackage.ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___ACCEPT__OBJECT = ExercisePackage.ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___VALIDATE__OBJECT = ExercisePackage.ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER___CREATE_PROPOSAL = ExercisePackage.ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Option Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_ANSWER_OPERATION_COUNT = ExercisePackage.ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.SimpleAnswerImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getSimpleAnswer()
	 * @generated
	 */
	int SIMPLE_ANSWER = 4;

	/**
	 * The number of structural features of the '<em>Simple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER_FEATURE_COUNT = OPTION_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___ACCEPT__OBJECT = OPTION_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___VALIDATE__OBJECT = OPTION_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___CREATE_PROPOSAL = OPTION_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER___GET_VALUE = OPTION_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_ANSWER_OPERATION_COUNT = OPTION_ANSWER_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.SimpleProposalImpl <em>Simple Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.SimpleProposalImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getSimpleProposal()
	 * @generated
	 */
	int SIMPLE_PROPOSAL = 5;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__QUESTION = ExercisePackage.PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__ANSWER = ExercisePackage.PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Proposal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL__PROPOSAL = ExercisePackage.PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Simple Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL_FEATURE_COUNT = ExercisePackage.PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___GET_PROPOSAL = ExercisePackage.PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___ACCEPT = ExercisePackage.PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL___VALIDATE = ExercisePackage.PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Simple Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_PROPOSAL_OPERATION_COUNT = ExercisePackage.PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.StringAnswerImpl <em>String Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.StringAnswerImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getStringAnswer()
	 * @generated
	 */
	int STRING_ANSWER = 6;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__FORMAT = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Regexp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__REGEXP = SIMPLE_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ignore Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER__IGNORE_CASE = SIMPLE_ANSWER_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>String Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>String Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STRING_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.NumberAnswerImpl <em>Number Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.NumberAnswerImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getNumberAnswer()
	 * @generated
	 */
	int NUMBER_ANSWER = 7;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Error Margin</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__ERROR_MARGIN = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Range</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER__RANGE = SIMPLE_ANSWER_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Number Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>Number Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.NumberRangeImpl <em>Number Range</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.NumberRangeImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getNumberRange()
	 * @generated
	 */
	int NUMBER_RANGE = 8;

	/**
	 * The feature id for the '<em><b>Min</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__MIN = 0;

	/**
	 * The feature id for the '<em><b>Max</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__MAX = 1;

	/**
	 * The feature id for the '<em><b>Step</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE__STEP = 2;

	/**
	 * The number of structural features of the '<em>Number Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Number Range</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NUMBER_RANGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.BooleanAnswerImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getBooleanAnswer()
	 * @generated
	 */
	int BOOLEAN_ANSWER = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER__VALUE = SIMPLE_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Boolean Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER_FEATURE_COUNT = SIMPLE_ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___ACCEPT__OBJECT = SIMPLE_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___VALIDATE__OBJECT = SIMPLE_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___CREATE_PROPOSAL = SIMPLE_ANSWER___CREATE_PROPOSAL;

	/**
	 * The operation id for the '<em>Get Value</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER___GET_VALUE = SIMPLE_ANSWER___GET_VALUE;

	/**
	 * The number of operations of the '<em>Boolean Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOLEAN_ANSWER_OPERATION_COUNT = SIMPLE_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.OptionsAnswerImpl <em>Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.OptionsAnswerImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getOptionsAnswer()
	 * @generated
	 */
	int OPTIONS_ANSWER = 10;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER__OPTIONS = ExercisePackage.ANSWER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER_FEATURE_COUNT = ExercisePackage.ANSWER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___ACCEPT__OBJECT = ExercisePackage.ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___VALIDATE__OBJECT = ExercisePackage.ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER___CREATE_PROPOSAL = ExercisePackage.ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_ANSWER_OPERATION_COUNT = ExercisePackage.ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.OptionsProposalImpl <em>Options Proposal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.OptionsProposalImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getOptionsProposal()
	 * @generated
	 */
	int OPTIONS_PROPOSAL = 11;

	/**
	 * The feature id for the '<em><b>Question</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__QUESTION = ExercisePackage.PROPOSAL__QUESTION;

	/**
	 * The feature id for the '<em><b>Answer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__ANSWER = ExercisePackage.PROPOSAL__ANSWER;

	/**
	 * The feature id for the '<em><b>Indices</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL__INDICES = ExercisePackage.PROPOSAL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Options Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL_FEATURE_COUNT = ExercisePackage.PROPOSAL_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Get Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___GET_PROPOSAL = ExercisePackage.PROPOSAL___GET_PROPOSAL;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___ACCEPT = ExercisePackage.PROPOSAL___ACCEPT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL___VALIDATE = ExercisePackage.PROPOSAL___VALIDATE;

	/**
	 * The number of operations of the '<em>Options Proposal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIONS_PROPOSAL_OPERATION_COUNT = ExercisePackage.PROPOSAL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.OptionImpl <em>Option</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.OptionImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getOption()
	 * @generated
	 */
	int OPTION = 12;

	/**
	 * The feature id for the '<em><b>Correct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__CORRECT = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION__OPTION = 1;

	/**
	 * The number of structural features of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Option</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.SingleOptionsAnswerImpl <em>Single Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.SingleOptionsAnswerImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getSingleOptionsAnswer()
	 * @generated
	 */
	int SINGLE_OPTIONS_ANSWER = 13;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER__OPTIONS = OPTIONS_ANSWER__OPTIONS;

	/**
	 * The number of structural features of the '<em>Single Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER_FEATURE_COUNT = OPTIONS_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___ACCEPT__OBJECT = OPTIONS_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___VALIDATE__OBJECT = OPTIONS_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER___CREATE_PROPOSAL = OPTIONS_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Single Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SINGLE_OPTIONS_ANSWER_OPERATION_COUNT = OPTIONS_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link no.hal.learning.quiz.impl.ManyOptionsAnswerImpl <em>Many Options Answer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.quiz.impl.ManyOptionsAnswerImpl
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getManyOptionsAnswer()
	 * @generated
	 */
	int MANY_OPTIONS_ANSWER = 14;

	/**
	 * The feature id for the '<em><b>Options</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER__OPTIONS = OPTIONS_ANSWER__OPTIONS;

	/**
	 * The number of structural features of the '<em>Many Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER_FEATURE_COUNT = OPTIONS_ANSWER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Accept</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___ACCEPT__OBJECT = OPTIONS_ANSWER___ACCEPT__OBJECT;

	/**
	 * The operation id for the '<em>Validate</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___VALIDATE__OBJECT = OPTIONS_ANSWER___VALIDATE__OBJECT;

	/**
	 * The operation id for the '<em>Create Proposal</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER___CREATE_PROPOSAL = OPTIONS_ANSWER___CREATE_PROPOSAL;

	/**
	 * The number of operations of the '<em>Many Options Answer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANY_OPTIONS_ANSWER_OPERATION_COUNT = OPTIONS_ANSWER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '<em>RGB</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see no.hal.learning.exercise.util.RGB
	 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getRGB()
	 * @generated
	 */
	int RGB = 15;


	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.StyledStringQuestion <em>Styled String Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled String Question</em>'.
	 * @see no.hal.learning.quiz.StyledStringQuestion
	 * @generated
	 */
	EClass getStyledStringQuestion();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.quiz.StyledStringQuestion#getStyledStrings <em>Styled Strings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Styled Strings</em>'.
	 * @see no.hal.learning.quiz.StyledStringQuestion#getStyledStrings()
	 * @see #getStyledStringQuestion()
	 * @generated
	 */
	EReference getStyledStringQuestion_StyledStrings();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.StyledString <em>Styled String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Styled String</em>'.
	 * @see no.hal.learning.quiz.StyledString
	 * @generated
	 */
	EClass getStyledString();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.quiz.StyledString#getCharStyle <em>Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Char Style</em>'.
	 * @see no.hal.learning.quiz.StyledString#getCharStyle()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_CharStyle();

	/**
	 * Returns the meta object for the reference '{@link no.hal.learning.quiz.StyledString#getEffectiveCharStyle <em>Effective Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Effective Char Style</em>'.
	 * @see no.hal.learning.quiz.StyledString#getEffectiveCharStyle()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_EffectiveCharStyle();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.StyledString#getPrefix <em>Prefix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prefix</em>'.
	 * @see no.hal.learning.quiz.StyledString#getPrefix()
	 * @see #getStyledString()
	 * @generated
	 */
	EAttribute getStyledString_Prefix();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.quiz.StyledString#getStyledString <em>Styled String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Styled String</em>'.
	 * @see no.hal.learning.quiz.StyledString#getStyledString()
	 * @see #getStyledString()
	 * @generated
	 */
	EReference getStyledString_StyledString();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.StyledString#getSuffix <em>Suffix</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Suffix</em>'.
	 * @see no.hal.learning.quiz.StyledString#getSuffix()
	 * @see #getStyledString()
	 * @generated
	 */
	EAttribute getStyledString_Suffix();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.CharStyle <em>Char Style</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Char Style</em>'.
	 * @see no.hal.learning.quiz.CharStyle
	 * @generated
	 */
	EClass getCharStyle();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.CharStyle#getItalic <em>Italic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Italic</em>'.
	 * @see no.hal.learning.quiz.CharStyle#getItalic()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Italic();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.CharStyle#getBold <em>Bold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bold</em>'.
	 * @see no.hal.learning.quiz.CharStyle#getBold()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Bold();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.CharStyle#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see no.hal.learning.quiz.CharStyle#getSize()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Size();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.CharStyle#getFamily <em>Family</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Family</em>'.
	 * @see no.hal.learning.quiz.CharStyle#getFamily()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Family();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.CharStyle#getForeground <em>Foreground</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Foreground</em>'.
	 * @see no.hal.learning.quiz.CharStyle#getForeground()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Foreground();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.CharStyle#getBackground <em>Background</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Background</em>'.
	 * @see no.hal.learning.quiz.CharStyle#getBackground()
	 * @see #getCharStyle()
	 * @generated
	 */
	EAttribute getCharStyle_Background();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.OptionAnswer <em>Option Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Answer</em>'.
	 * @see no.hal.learning.quiz.OptionAnswer
	 * @generated
	 */
	EClass getOptionAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.SimpleAnswer <em>Simple Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Answer</em>'.
	 * @see no.hal.learning.quiz.SimpleAnswer
	 * @generated
	 */
	EClass getSimpleAnswer();

	/**
	 * Returns the meta object for the '{@link no.hal.learning.quiz.SimpleAnswer#getValue() <em>Get Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Value</em>' operation.
	 * @see no.hal.learning.quiz.SimpleAnswer#getValue()
	 * @generated
	 */
	EOperation getSimpleAnswer__GetValue();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.SimpleProposal <em>Simple Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Proposal</em>'.
	 * @see no.hal.learning.quiz.SimpleProposal
	 * @generated
	 */
	EClass getSimpleProposal();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.SimpleProposal#getProposal <em>Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Proposal</em>'.
	 * @see no.hal.learning.quiz.SimpleProposal#getProposal()
	 * @see #getSimpleProposal()
	 * @generated
	 */
	EAttribute getSimpleProposal_Proposal();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.StringAnswer <em>String Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>String Answer</em>'.
	 * @see no.hal.learning.quiz.StringAnswer
	 * @generated
	 */
	EClass getStringAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.StringAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.learning.quiz.StringAnswer#getValue()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Value();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.StringAnswer#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see no.hal.learning.quiz.StringAnswer#getFormat()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Format();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.StringAnswer#isRegexp <em>Regexp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Regexp</em>'.
	 * @see no.hal.learning.quiz.StringAnswer#isRegexp()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_Regexp();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.StringAnswer#isIgnoreCase <em>Ignore Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ignore Case</em>'.
	 * @see no.hal.learning.quiz.StringAnswer#isIgnoreCase()
	 * @see #getStringAnswer()
	 * @generated
	 */
	EAttribute getStringAnswer_IgnoreCase();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.NumberAnswer <em>Number Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Answer</em>'.
	 * @see no.hal.learning.quiz.NumberAnswer
	 * @generated
	 */
	EClass getNumberAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.NumberAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.learning.quiz.NumberAnswer#getValue()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EAttribute getNumberAnswer_Value();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.NumberAnswer#getErrorMargin <em>Error Margin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Margin</em>'.
	 * @see no.hal.learning.quiz.NumberAnswer#getErrorMargin()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EAttribute getNumberAnswer_ErrorMargin();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.quiz.NumberAnswer#getRange <em>Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Range</em>'.
	 * @see no.hal.learning.quiz.NumberAnswer#getRange()
	 * @see #getNumberAnswer()
	 * @generated
	 */
	EReference getNumberAnswer_Range();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.NumberRange <em>Number Range</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Number Range</em>'.
	 * @see no.hal.learning.quiz.NumberRange
	 * @generated
	 */
	EClass getNumberRange();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.NumberRange#getMin <em>Min</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min</em>'.
	 * @see no.hal.learning.quiz.NumberRange#getMin()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Min();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.NumberRange#getMax <em>Max</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max</em>'.
	 * @see no.hal.learning.quiz.NumberRange#getMax()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Max();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.NumberRange#getStep <em>Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Step</em>'.
	 * @see no.hal.learning.quiz.NumberRange#getStep()
	 * @see #getNumberRange()
	 * @generated
	 */
	EAttribute getNumberRange_Step();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.BooleanAnswer <em>Boolean Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Boolean Answer</em>'.
	 * @see no.hal.learning.quiz.BooleanAnswer
	 * @generated
	 */
	EClass getBooleanAnswer();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.BooleanAnswer#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see no.hal.learning.quiz.BooleanAnswer#getValue()
	 * @see #getBooleanAnswer()
	 * @generated
	 */
	EAttribute getBooleanAnswer_Value();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.OptionsAnswer <em>Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Answer</em>'.
	 * @see no.hal.learning.quiz.OptionsAnswer
	 * @generated
	 */
	EClass getOptionsAnswer();

	/**
	 * Returns the meta object for the containment reference list '{@link no.hal.learning.quiz.OptionsAnswer#getOptions <em>Options</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Options</em>'.
	 * @see no.hal.learning.quiz.OptionsAnswer#getOptions()
	 * @see #getOptionsAnswer()
	 * @generated
	 */
	EReference getOptionsAnswer_Options();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.OptionsProposal <em>Options Proposal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Options Proposal</em>'.
	 * @see no.hal.learning.quiz.OptionsProposal
	 * @generated
	 */
	EClass getOptionsProposal();

	/**
	 * Returns the meta object for the attribute list '{@link no.hal.learning.quiz.OptionsProposal#getIndices <em>Indices</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Indices</em>'.
	 * @see no.hal.learning.quiz.OptionsProposal#getIndices()
	 * @see #getOptionsProposal()
	 * @generated
	 */
	EAttribute getOptionsProposal_Indices();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.Option <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option</em>'.
	 * @see no.hal.learning.quiz.Option
	 * @generated
	 */
	EClass getOption();

	/**
	 * Returns the meta object for the attribute '{@link no.hal.learning.quiz.Option#isCorrect <em>Correct</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Correct</em>'.
	 * @see no.hal.learning.quiz.Option#isCorrect()
	 * @see #getOption()
	 * @generated
	 */
	EAttribute getOption_Correct();

	/**
	 * Returns the meta object for the containment reference '{@link no.hal.learning.quiz.Option#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Option</em>'.
	 * @see no.hal.learning.quiz.Option#getOption()
	 * @see #getOption()
	 * @generated
	 */
	EReference getOption_Option();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.SingleOptionsAnswer <em>Single Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Single Options Answer</em>'.
	 * @see no.hal.learning.quiz.SingleOptionsAnswer
	 * @generated
	 */
	EClass getSingleOptionsAnswer();

	/**
	 * Returns the meta object for class '{@link no.hal.learning.quiz.ManyOptionsAnswer <em>Many Options Answer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Many Options Answer</em>'.
	 * @see no.hal.learning.quiz.ManyOptionsAnswer
	 * @generated
	 */
	EClass getManyOptionsAnswer();

	/**
	 * Returns the meta object for data type '{@link no.hal.learning.exercise.util.RGB <em>RGB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>RGB</em>'.
	 * @see no.hal.learning.exercise.util.RGB
	 * @model instanceClass="no.hal.learning.exercise.util.RGB"
	 * @generated
	 */
	EDataType getRGB();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	QuizFactory getQuizFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.StyledStringQuestionImpl <em>Styled String Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.StyledStringQuestionImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getStyledStringQuestion()
		 * @generated
		 */
		EClass STYLED_STRING_QUESTION = eINSTANCE.getStyledStringQuestion();

		/**
		 * The meta object literal for the '<em><b>Styled Strings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING_QUESTION__STYLED_STRINGS = eINSTANCE.getStyledStringQuestion_StyledStrings();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.StyledStringImpl <em>Styled String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.StyledStringImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getStyledString()
		 * @generated
		 */
		EClass STYLED_STRING = eINSTANCE.getStyledString();

		/**
		 * The meta object literal for the '<em><b>Char Style</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__CHAR_STYLE = eINSTANCE.getStyledString_CharStyle();

		/**
		 * The meta object literal for the '<em><b>Effective Char Style</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__EFFECTIVE_CHAR_STYLE = eINSTANCE.getStyledString_EffectiveCharStyle();

		/**
		 * The meta object literal for the '<em><b>Prefix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_STRING__PREFIX = eINSTANCE.getStyledString_Prefix();

		/**
		 * The meta object literal for the '<em><b>Styled String</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STYLED_STRING__STYLED_STRING = eINSTANCE.getStyledString_StyledString();

		/**
		 * The meta object literal for the '<em><b>Suffix</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STYLED_STRING__SUFFIX = eINSTANCE.getStyledString_Suffix();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.CharStyleImpl <em>Char Style</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.CharStyleImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getCharStyle()
		 * @generated
		 */
		EClass CHAR_STYLE = eINSTANCE.getCharStyle();

		/**
		 * The meta object literal for the '<em><b>Italic</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__ITALIC = eINSTANCE.getCharStyle_Italic();

		/**
		 * The meta object literal for the '<em><b>Bold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__BOLD = eINSTANCE.getCharStyle_Bold();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__SIZE = eINSTANCE.getCharStyle_Size();

		/**
		 * The meta object literal for the '<em><b>Family</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__FAMILY = eINSTANCE.getCharStyle_Family();

		/**
		 * The meta object literal for the '<em><b>Foreground</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__FOREGROUND = eINSTANCE.getCharStyle_Foreground();

		/**
		 * The meta object literal for the '<em><b>Background</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAR_STYLE__BACKGROUND = eINSTANCE.getCharStyle_Background();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.OptionAnswerImpl <em>Option Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.OptionAnswerImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getOptionAnswer()
		 * @generated
		 */
		EClass OPTION_ANSWER = eINSTANCE.getOptionAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.SimpleAnswerImpl <em>Simple Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.SimpleAnswerImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getSimpleAnswer()
		 * @generated
		 */
		EClass SIMPLE_ANSWER = eINSTANCE.getSimpleAnswer();

		/**
		 * The meta object literal for the '<em><b>Get Value</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SIMPLE_ANSWER___GET_VALUE = eINSTANCE.getSimpleAnswer__GetValue();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.SimpleProposalImpl <em>Simple Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.SimpleProposalImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getSimpleProposal()
		 * @generated
		 */
		EClass SIMPLE_PROPOSAL = eINSTANCE.getSimpleProposal();

		/**
		 * The meta object literal for the '<em><b>Proposal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMPLE_PROPOSAL__PROPOSAL = eINSTANCE.getSimpleProposal_Proposal();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.StringAnswerImpl <em>String Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.StringAnswerImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getStringAnswer()
		 * @generated
		 */
		EClass STRING_ANSWER = eINSTANCE.getStringAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__VALUE = eINSTANCE.getStringAnswer_Value();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__FORMAT = eINSTANCE.getStringAnswer_Format();

		/**
		 * The meta object literal for the '<em><b>Regexp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__REGEXP = eINSTANCE.getStringAnswer_Regexp();

		/**
		 * The meta object literal for the '<em><b>Ignore Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STRING_ANSWER__IGNORE_CASE = eINSTANCE.getStringAnswer_IgnoreCase();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.NumberAnswerImpl <em>Number Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.NumberAnswerImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getNumberAnswer()
		 * @generated
		 */
		EClass NUMBER_ANSWER = eINSTANCE.getNumberAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ANSWER__VALUE = eINSTANCE.getNumberAnswer_Value();

		/**
		 * The meta object literal for the '<em><b>Error Margin</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_ANSWER__ERROR_MARGIN = eINSTANCE.getNumberAnswer_ErrorMargin();

		/**
		 * The meta object literal for the '<em><b>Range</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NUMBER_ANSWER__RANGE = eINSTANCE.getNumberAnswer_Range();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.NumberRangeImpl <em>Number Range</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.NumberRangeImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getNumberRange()
		 * @generated
		 */
		EClass NUMBER_RANGE = eINSTANCE.getNumberRange();

		/**
		 * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__MIN = eINSTANCE.getNumberRange_Min();

		/**
		 * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__MAX = eINSTANCE.getNumberRange_Max();

		/**
		 * The meta object literal for the '<em><b>Step</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NUMBER_RANGE__STEP = eINSTANCE.getNumberRange_Step();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.BooleanAnswerImpl <em>Boolean Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.BooleanAnswerImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getBooleanAnswer()
		 * @generated
		 */
		EClass BOOLEAN_ANSWER = eINSTANCE.getBooleanAnswer();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOLEAN_ANSWER__VALUE = eINSTANCE.getBooleanAnswer_Value();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.OptionsAnswerImpl <em>Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.OptionsAnswerImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getOptionsAnswer()
		 * @generated
		 */
		EClass OPTIONS_ANSWER = eINSTANCE.getOptionsAnswer();

		/**
		 * The meta object literal for the '<em><b>Options</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIONS_ANSWER__OPTIONS = eINSTANCE.getOptionsAnswer_Options();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.OptionsProposalImpl <em>Options Proposal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.OptionsProposalImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getOptionsProposal()
		 * @generated
		 */
		EClass OPTIONS_PROPOSAL = eINSTANCE.getOptionsProposal();

		/**
		 * The meta object literal for the '<em><b>Indices</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIONS_PROPOSAL__INDICES = eINSTANCE.getOptionsProposal_Indices();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.OptionImpl <em>Option</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.OptionImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getOption()
		 * @generated
		 */
		EClass OPTION = eINSTANCE.getOption();

		/**
		 * The meta object literal for the '<em><b>Correct</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION__CORRECT = eINSTANCE.getOption_Correct();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION__OPTION = eINSTANCE.getOption_Option();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.SingleOptionsAnswerImpl <em>Single Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.SingleOptionsAnswerImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getSingleOptionsAnswer()
		 * @generated
		 */
		EClass SINGLE_OPTIONS_ANSWER = eINSTANCE.getSingleOptionsAnswer();

		/**
		 * The meta object literal for the '{@link no.hal.learning.quiz.impl.ManyOptionsAnswerImpl <em>Many Options Answer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.quiz.impl.ManyOptionsAnswerImpl
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getManyOptionsAnswer()
		 * @generated
		 */
		EClass MANY_OPTIONS_ANSWER = eINSTANCE.getManyOptionsAnswer();

		/**
		 * The meta object literal for the '<em>RGB</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see no.hal.learning.exercise.util.RGB
		 * @see no.hal.learning.quiz.impl.QuizPackageImpl#getRGB()
		 * @generated
		 */
		EDataType RGB = eINSTANCE.getRGB();

	}

} //QuizPackage
