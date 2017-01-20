/**
 */
package no.hal.learning.quiz.impl;

import no.hal.learning.exercise.ExercisePackage;

import no.hal.learning.quiz.BooleanAnswer;
import no.hal.learning.quiz.CharStyle;
import no.hal.learning.quiz.ManyOptionsAnswer;
import no.hal.learning.quiz.NumberAnswer;
import no.hal.learning.quiz.NumberRange;
import no.hal.learning.quiz.Option;
import no.hal.learning.quiz.OptionAnswer;
import no.hal.learning.quiz.OptionsAnswer;
import no.hal.learning.quiz.OptionsProposal;
import no.hal.learning.quiz.QuizFactory;
import no.hal.learning.quiz.QuizPackage;
import no.hal.learning.quiz.SimpleAnswer;
import no.hal.learning.quiz.SimpleProposal;
import no.hal.learning.quiz.SingleOptionsAnswer;
import no.hal.learning.quiz.StringAnswer;
import no.hal.learning.quiz.StyledString;
import no.hal.learning.quiz.StyledStringQuestion;

import no.hal.learning.quiz.util.QuizValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class QuizPackageImpl extends EPackageImpl implements QuizPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styledStringQuestionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass styledStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass charStyleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass numberRangeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass booleanAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionsProposalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass singleOptionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manyOptionsAnswerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType rgbEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see no.hal.learning.quiz.QuizPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private QuizPackageImpl() {
		super(eNS_URI, QuizFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link QuizPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static QuizPackage init() {
		if (isInited) return (QuizPackage)EPackage.Registry.INSTANCE.getEPackage(QuizPackage.eNS_URI);

		// Obtain or create and register package
		QuizPackageImpl theQuizPackage = (QuizPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof QuizPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new QuizPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ExercisePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theQuizPackage.createPackageContents();

		// Initialize created meta-data
		theQuizPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theQuizPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return QuizValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theQuizPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(QuizPackage.eNS_URI, theQuizPackage);
		return theQuizPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyledStringQuestion() {
		return styledStringQuestionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyledStringQuestion_StyledStrings() {
		return (EReference)styledStringQuestionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStyledString() {
		return styledStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyledString_CharStyle() {
		return (EReference)styledStringEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyledString_EffectiveCharStyle() {
		return (EReference)styledStringEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyledString_Prefix() {
		return (EAttribute)styledStringEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStyledString_StyledString() {
		return (EReference)styledStringEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStyledString_Suffix() {
		return (EAttribute)styledStringEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCharStyle() {
		return charStyleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Italic() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Bold() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Size() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Family() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Foreground() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCharStyle_Background() {
		return (EAttribute)charStyleEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionAnswer() {
		return optionAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleAnswer() {
		return simpleAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSimpleAnswer__GetValue() {
		return simpleAnswerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleProposal() {
		return simpleProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleProposal_Proposal() {
		return (EAttribute)simpleProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStringAnswer() {
		return stringAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_Value() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_Format() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_Regexp() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStringAnswer_IgnoreCase() {
		return (EAttribute)stringAnswerEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberAnswer() {
		return numberAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberAnswer_Value() {
		return (EAttribute)numberAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberAnswer_ErrorMargin() {
		return (EAttribute)numberAnswerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNumberAnswer_Range() {
		return (EReference)numberAnswerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNumberRange() {
		return numberRangeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberRange_Min() {
		return (EAttribute)numberRangeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberRange_Max() {
		return (EAttribute)numberRangeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNumberRange_Step() {
		return (EAttribute)numberRangeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBooleanAnswer() {
		return booleanAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBooleanAnswer_Value() {
		return (EAttribute)booleanAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionsAnswer() {
		return optionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionsAnswer_Options() {
		return (EReference)optionsAnswerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionsProposal() {
		return optionsProposalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionsProposal_Indices() {
		return (EAttribute)optionsProposalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOption() {
		return optionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOption_Correct() {
		return (EAttribute)optionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOption_Option() {
		return (EReference)optionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSingleOptionsAnswer() {
		return singleOptionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManyOptionsAnswer() {
		return manyOptionsAnswerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getRGB() {
		return rgbEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QuizFactory getQuizFactory() {
		return (QuizFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		styledStringQuestionEClass = createEClass(STYLED_STRING_QUESTION);
		createEReference(styledStringQuestionEClass, STYLED_STRING_QUESTION__STYLED_STRINGS);

		styledStringEClass = createEClass(STYLED_STRING);
		createEReference(styledStringEClass, STYLED_STRING__CHAR_STYLE);
		createEReference(styledStringEClass, STYLED_STRING__EFFECTIVE_CHAR_STYLE);
		createEAttribute(styledStringEClass, STYLED_STRING__PREFIX);
		createEReference(styledStringEClass, STYLED_STRING__STYLED_STRING);
		createEAttribute(styledStringEClass, STYLED_STRING__SUFFIX);

		charStyleEClass = createEClass(CHAR_STYLE);
		createEAttribute(charStyleEClass, CHAR_STYLE__ITALIC);
		createEAttribute(charStyleEClass, CHAR_STYLE__BOLD);
		createEAttribute(charStyleEClass, CHAR_STYLE__SIZE);
		createEAttribute(charStyleEClass, CHAR_STYLE__FAMILY);
		createEAttribute(charStyleEClass, CHAR_STYLE__FOREGROUND);
		createEAttribute(charStyleEClass, CHAR_STYLE__BACKGROUND);

		optionAnswerEClass = createEClass(OPTION_ANSWER);

		simpleAnswerEClass = createEClass(SIMPLE_ANSWER);
		createEOperation(simpleAnswerEClass, SIMPLE_ANSWER___GET_VALUE);

		simpleProposalEClass = createEClass(SIMPLE_PROPOSAL);
		createEAttribute(simpleProposalEClass, SIMPLE_PROPOSAL__PROPOSAL);

		stringAnswerEClass = createEClass(STRING_ANSWER);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__VALUE);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__FORMAT);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__REGEXP);
		createEAttribute(stringAnswerEClass, STRING_ANSWER__IGNORE_CASE);

		numberAnswerEClass = createEClass(NUMBER_ANSWER);
		createEAttribute(numberAnswerEClass, NUMBER_ANSWER__VALUE);
		createEAttribute(numberAnswerEClass, NUMBER_ANSWER__ERROR_MARGIN);
		createEReference(numberAnswerEClass, NUMBER_ANSWER__RANGE);

		numberRangeEClass = createEClass(NUMBER_RANGE);
		createEAttribute(numberRangeEClass, NUMBER_RANGE__MIN);
		createEAttribute(numberRangeEClass, NUMBER_RANGE__MAX);
		createEAttribute(numberRangeEClass, NUMBER_RANGE__STEP);

		booleanAnswerEClass = createEClass(BOOLEAN_ANSWER);
		createEAttribute(booleanAnswerEClass, BOOLEAN_ANSWER__VALUE);

		optionsAnswerEClass = createEClass(OPTIONS_ANSWER);
		createEReference(optionsAnswerEClass, OPTIONS_ANSWER__OPTIONS);

		optionsProposalEClass = createEClass(OPTIONS_PROPOSAL);
		createEAttribute(optionsProposalEClass, OPTIONS_PROPOSAL__INDICES);

		optionEClass = createEClass(OPTION);
		createEAttribute(optionEClass, OPTION__CORRECT);
		createEReference(optionEClass, OPTION__OPTION);

		singleOptionsAnswerEClass = createEClass(SINGLE_OPTIONS_ANSWER);

		manyOptionsAnswerEClass = createEClass(MANY_OPTIONS_ANSWER);

		// Create data types
		rgbEDataType = createEDataType(RGB);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ExercisePackage theExercisePackage = (ExercisePackage)EPackage.Registry.INSTANCE.getEPackage(ExercisePackage.eNS_URI);

		// Create type parameters
		ETypeParameter simpleAnswerEClass_T = addETypeParameter(simpleAnswerEClass, "T");
		ETypeParameter simpleProposalEClass_A = addETypeParameter(simpleProposalEClass, "A");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getSimpleAnswer());
		EGenericType g2 = createEGenericType();
		g1.getETypeArguments().add(g2);
		simpleProposalEClass_A.getEBounds().add(g1);

		// Add supertypes to classes
		styledStringQuestionEClass.getESuperTypes().add(theExercisePackage.getQuestion());
		optionAnswerEClass.getESuperTypes().add(theExercisePackage.getAnswer());
		simpleAnswerEClass.getESuperTypes().add(this.getOptionAnswer());
		g1 = createEGenericType(theExercisePackage.getProposal());
		g2 = createEGenericType(simpleProposalEClass_A);
		g1.getETypeArguments().add(g2);
		simpleProposalEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType(ecorePackage.getEString());
		g1.getETypeArguments().add(g2);
		stringAnswerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType(ecorePackage.getEDoubleObject());
		g1.getETypeArguments().add(g2);
		numberAnswerEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getSimpleAnswer());
		g2 = createEGenericType(ecorePackage.getEBooleanObject());
		g1.getETypeArguments().add(g2);
		booleanAnswerEClass.getEGenericSuperTypes().add(g1);
		optionsAnswerEClass.getESuperTypes().add(theExercisePackage.getAnswer());
		g1 = createEGenericType(theExercisePackage.getProposal());
		g2 = createEGenericType(this.getOptionsAnswer());
		g1.getETypeArguments().add(g2);
		optionsProposalEClass.getEGenericSuperTypes().add(g1);
		singleOptionsAnswerEClass.getESuperTypes().add(this.getOptionsAnswer());
		manyOptionsAnswerEClass.getESuperTypes().add(this.getOptionsAnswer());

		// Initialize classes, features, and operations; add parameters
		initEClass(styledStringQuestionEClass, StyledStringQuestion.class, "StyledStringQuestion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyledStringQuestion_StyledStrings(), this.getStyledString(), null, "styledStrings", null, 0, -1, StyledStringQuestion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(styledStringEClass, StyledString.class, "StyledString", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStyledString_CharStyle(), this.getCharStyle(), null, "charStyle", null, 0, 1, StyledString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyledString_EffectiveCharStyle(), this.getCharStyle(), null, "effectiveCharStyle", null, 0, 1, StyledString.class, IS_TRANSIENT, IS_VOLATILE, !IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyledString_Prefix(), ecorePackage.getEString(), "prefix", null, 0, 1, StyledString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStyledString_StyledString(), this.getStyledString(), null, "styledString", null, 0, 1, StyledString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStyledString_Suffix(), ecorePackage.getEString(), "suffix", null, 0, 1, StyledString.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(charStyleEClass, CharStyle.class, "CharStyle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCharStyle_Italic(), ecorePackage.getEBooleanObject(), "italic", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Bold(), ecorePackage.getEBooleanObject(), "bold", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Size(), ecorePackage.getEFloat(), "size", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Family(), ecorePackage.getEString(), "family", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Foreground(), this.getRGB(), "foreground", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCharStyle_Background(), this.getRGB(), "background", null, 0, 1, CharStyle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionAnswerEClass, OptionAnswer.class, "OptionAnswer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleAnswerEClass, SimpleAnswer.class, "SimpleAnswer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getSimpleAnswer__GetValue(), null, "getValue", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(simpleAnswerEClass_T);
		initEOperation(op, g1);

		initEClass(simpleProposalEClass, SimpleProposal.class, "SimpleProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSimpleProposal_Proposal(), ecorePackage.getEJavaObject(), "proposal", null, 0, 1, SimpleProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stringAnswerEClass, StringAnswer.class, "StringAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStringAnswer_Value(), ecorePackage.getEString(), "value", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringAnswer_Format(), ecorePackage.getEString(), "format", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringAnswer_Regexp(), ecorePackage.getEBoolean(), "regexp", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStringAnswer_IgnoreCase(), ecorePackage.getEBoolean(), "ignoreCase", null, 0, 1, StringAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberAnswerEClass, NumberAnswer.class, "NumberAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberAnswer_Value(), ecorePackage.getEDoubleObject(), "value", null, 0, 1, NumberAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberAnswer_ErrorMargin(), ecorePackage.getEDouble(), "errorMargin", null, 0, 1, NumberAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getNumberAnswer_Range(), this.getNumberRange(), null, "range", null, 0, 1, NumberAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(numberRangeEClass, NumberRange.class, "NumberRange", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNumberRange_Min(), ecorePackage.getEDoubleObject(), "min", null, 0, 1, NumberRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberRange_Max(), ecorePackage.getEDoubleObject(), "max", null, 0, 1, NumberRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNumberRange_Step(), ecorePackage.getEDoubleObject(), "step", null, 0, 1, NumberRange.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(booleanAnswerEClass, BooleanAnswer.class, "BooleanAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBooleanAnswer_Value(), ecorePackage.getEBooleanObject(), "value", null, 0, 1, BooleanAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsAnswerEClass, OptionsAnswer.class, "OptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptionsAnswer_Options(), this.getOption(), null, "options", null, 0, -1, OptionsAnswer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionsProposalEClass, OptionsProposal.class, "OptionsProposal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionsProposal_Indices(), ecorePackage.getEInt(), "indices", null, 0, -1, OptionsProposal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(optionEClass, Option.class, "Option", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOption_Correct(), ecorePackage.getEBoolean(), "correct", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOption_Option(), this.getOptionAnswer(), null, "option", null, 0, 1, Option.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(singleOptionsAnswerEClass, SingleOptionsAnswer.class, "SingleOptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(manyOptionsAnswerEClass, ManyOptionsAnswer.class, "ManyOptionsAnswer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize data types
		initEDataType(rgbEDataType, no.hal.learning.exercise.util.RGB.class, "RGB", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/Ecore
		createEcoreAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createEcoreAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/Ecore";	
		addAnnotation
		  (singleOptionsAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "SingleCorrectOption"
		   });	
		addAnnotation
		  (manyOptionsAnswerEClass, 
		   source, 
		   new String[] {
			 "constraints", "AtLeastOneCorrectOption"
		   });
	}

} //QuizPackageImpl
