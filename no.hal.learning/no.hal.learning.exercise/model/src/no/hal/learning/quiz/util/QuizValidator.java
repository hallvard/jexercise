/**
 */
package no.hal.learning.quiz.util;

import java.util.Map;

import no.hal.learning.exercise.util.RGB;

import no.hal.learning.quiz.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.quiz.QuizPackage
 * @generated
 */
public class QuizValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final QuizValidator INSTANCE = new QuizValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.learning.quiz";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return QuizPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case QuizPackage.STYLED_STRING_QUESTION:
				return validateStyledStringQuestion((StyledStringQuestion)value, diagnostics, context);
			case QuizPackage.STYLED_STRING:
				return validateStyledString((StyledString)value, diagnostics, context);
			case QuizPackage.CHAR_STYLE:
				return validateCharStyle((CharStyle)value, diagnostics, context);
			case QuizPackage.OPTION_ANSWER:
				return validateOptionAnswer((OptionAnswer)value, diagnostics, context);
			case QuizPackage.SIMPLE_ANSWER:
				return validateSimpleAnswer((SimpleAnswer<?>)value, diagnostics, context);
			case QuizPackage.SIMPLE_PROPOSAL:
				return validateSimpleProposal((SimpleProposal<?>)value, diagnostics, context);
			case QuizPackage.STRING_ANSWER:
				return validateStringAnswer((StringAnswer)value, diagnostics, context);
			case QuizPackage.NUMBER_ANSWER:
				return validateNumberAnswer((NumberAnswer)value, diagnostics, context);
			case QuizPackage.NUMBER_RANGE:
				return validateNumberRange((NumberRange)value, diagnostics, context);
			case QuizPackage.BOOLEAN_ANSWER:
				return validateBooleanAnswer((BooleanAnswer)value, diagnostics, context);
			case QuizPackage.OPTIONS_ANSWER:
				return validateOptionsAnswer((OptionsAnswer)value, diagnostics, context);
			case QuizPackage.OPTIONS_PROPOSAL:
				return validateOptionsProposal((OptionsProposal)value, diagnostics, context);
			case QuizPackage.OPTION:
				return validateOption((Option)value, diagnostics, context);
			case QuizPackage.SINGLE_OPTIONS_ANSWER:
				return validateSingleOptionsAnswer((SingleOptionsAnswer)value, diagnostics, context);
			case QuizPackage.MANY_OPTIONS_ANSWER:
				return validateManyOptionsAnswer((ManyOptionsAnswer)value, diagnostics, context);
			case QuizPackage.RGB:
				return validateRGB((RGB)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyledStringQuestion(StyledStringQuestion styledStringQuestion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styledStringQuestion, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStyledString(StyledString styledString, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(styledString, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCharStyle(CharStyle charStyle, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(charStyle, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionAnswer(OptionAnswer optionAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleAnswer(SimpleAnswer<?> simpleAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSimpleProposal(SimpleProposal<?> simpleProposal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(simpleProposal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStringAnswer(StringAnswer stringAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(stringAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberAnswer(NumberAnswer numberAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNumberRange(NumberRange numberRange, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(numberRange, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBooleanAnswer(BooleanAnswer booleanAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(booleanAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionsAnswer(OptionsAnswer optionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionsAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOptionsProposal(OptionsProposal optionsProposal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(optionsProposal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOption(Option option, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(option, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSingleOptionsAnswer(SingleOptionsAnswer singleOptionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(singleOptionsAnswer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(singleOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validateSingleOptionsAnswer_SingleCorrectOption(singleOptionsAnswer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the SingleCorrectOption constraint of '<em>Single Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateSingleOptionsAnswer_SingleCorrectOption(SingleOptionsAnswer singleOptionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (countCorrectOptions(singleOptionsAnswer) != 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "SingleCorrectOption", getObjectLabel(singleOptionsAnswer, context) },
						 new Object[] { singleOptionsAnswer },
						 context));
			}
			return false;
		}
		return true;
	}

	private int countCorrectOptions(OptionsAnswer answer) {
		int count = 0;
		for (Option option : answer.getOptions()) {
			if (option.isCorrect()) {
				count++;
			}
		}
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManyOptionsAnswer(ManyOptionsAnswer manyOptionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(manyOptionsAnswer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(manyOptionsAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validateManyOptionsAnswer_AtLeastOneCorrectOption(manyOptionsAnswer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the AtLeastOneCorrectOption constraint of '<em>Many Options Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateManyOptionsAnswer_AtLeastOneCorrectOption(ManyOptionsAnswer manyOptionsAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (countCorrectOptions(manyOptionsAnswer) < 1) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "AtLeastOneCorrectOption", getObjectLabel(manyOptionsAnswer, context) },
						 new Object[] { manyOptionsAnswer },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateRGB(RGB rgb, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //QuizValidator
