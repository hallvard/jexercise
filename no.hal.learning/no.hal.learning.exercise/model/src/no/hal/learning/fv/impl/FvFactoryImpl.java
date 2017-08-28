/**
 */
package no.hal.learning.fv.impl;

import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import no.hal.learning.fv.*;
import no.hal.learning.fv.util.Op1;
import no.hal.learning.fv.util.Op2;
import no.hal.learning.fv.util.Pred1;
import no.hal.learning.fv.util.Pred2;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FvFactoryImpl extends EFactoryImpl implements FvFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FvFactory init() {
		try {
			FvFactory theFvFactory = (FvFactory)EPackage.Registry.INSTANCE.getEFactory(FvPackage.eNS_URI);
			if (theFvFactory != null) {
				return theFvFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FvFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FvFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case FvPackage.DELEGATED_FEATURES: return createDelegatedFeatures();
			case FvPackage.STRING_TO_DOUBLE: return (EObject)createStringToDouble();
			case FvPackage.FEATURE_LIST: return createFeatureList();
			case FvPackage.CONSTANT_FEATURE_LIST: return createConstantFeatureList();
			case FvPackage.DERIVED_FEATURES1: return createDerivedFeatures1();
			case FvPackage.DERIVED_FEATURES_N: return createDerivedFeaturesN();
			case FvPackage.FILTERED_FEATURES1: return createFilteredFeatures1();
			case FvPackage.FILTERED_FEATURES2: return createFilteredFeatures2();
			case FvPackage.STRING_TO_STRING: return (EObject)createStringToString();
			case FvPackage.EXPRESSION_FEATURES: return createExpressionFeatures();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FvPackage.OP1_KIND:
				return createOp1KindFromString(eDataType, initialValue);
			case FvPackage.OP2_KIND:
				return createOp2KindFromString(eDataType, initialValue);
			case FvPackage.PRED1_KIND:
				return createPred1KindFromString(eDataType, initialValue);
			case FvPackage.PRED2_KIND:
				return createPred2KindFromString(eDataType, initialValue);
			case FvPackage.OP1:
				return createOp1FromString(eDataType, initialValue);
			case FvPackage.OP2:
				return createOp2FromString(eDataType, initialValue);
			case FvPackage.PRED1:
				return createPred1FromString(eDataType, initialValue);
			case FvPackage.PRED2:
				return createPred2FromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FvPackage.OP1_KIND:
				return convertOp1KindToString(eDataType, instanceValue);
			case FvPackage.OP2_KIND:
				return convertOp2KindToString(eDataType, instanceValue);
			case FvPackage.PRED1_KIND:
				return convertPred1KindToString(eDataType, instanceValue);
			case FvPackage.PRED2_KIND:
				return convertPred2KindToString(eDataType, instanceValue);
			case FvPackage.OP1:
				return convertOp1ToString(eDataType, instanceValue);
			case FvPackage.OP2:
				return convertOp2ToString(eDataType, instanceValue);
			case FvPackage.PRED1:
				return convertPred1ToString(eDataType, instanceValue);
			case FvPackage.PRED2:
				return convertPred2ToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelegatedFeatures createDelegatedFeatures() {
		DelegatedFeaturesImpl delegatedFeatures = new DelegatedFeaturesImpl();
		return delegatedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Double> createStringToDouble() {
		StringToDoubleImpl stringToDouble = new StringToDoubleImpl();
		return stringToDouble;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureList createFeatureList() {
		FeatureListImpl featureList = new FeatureListImpl();
		return featureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstantFeatureList createConstantFeatureList() {
		ConstantFeatureListImpl constantFeatureList = new ConstantFeatureListImpl();
		return constantFeatureList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFeatures1 createDerivedFeatures1() {
		DerivedFeatures1Impl derivedFeatures1 = new DerivedFeatures1Impl();
		return derivedFeatures1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DerivedFeaturesN createDerivedFeaturesN() {
		DerivedFeaturesNImpl derivedFeaturesN = new DerivedFeaturesNImpl();
		return derivedFeaturesN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteredFeatures1 createFilteredFeatures1() {
		FilteredFeatures1Impl filteredFeatures1 = new FilteredFeatures1Impl();
		return filteredFeatures1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FilteredFeatures2 createFilteredFeatures2() {
		FilteredFeatures2Impl filteredFeatures2 = new FilteredFeatures2Impl();
		return filteredFeatures2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createStringToString() {
		StringToStringImpl stringToString = new StringToStringImpl();
		return stringToString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExpressionFeatures createExpressionFeatures() {
		ExpressionFeaturesImpl expressionFeatures = new ExpressionFeaturesImpl();
		return expressionFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Op1Kind createOp1KindFromString(EDataType eDataType, String initialValue) {
		Op1Kind result = Op1Kind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOp1KindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Op2Kind createOp2KindFromString(EDataType eDataType, String initialValue) {
		Op2Kind result = Op2Kind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOp2KindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pred1Kind createPred1KindFromString(EDataType eDataType, String initialValue) {
		Pred1Kind result = Pred1Kind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPred1KindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pred2Kind createPred2KindFromString(EDataType eDataType, String initialValue) {
		Pred2Kind result = Pred2Kind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPred2KindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Op1 createOp1FromString(EDataType eDataType, String initialValue) {
		return (Op1)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOp1ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Op2 createOp2FromString(EDataType eDataType, String initialValue) {
		return (Op2)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOp2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pred1 createPred1FromString(EDataType eDataType, String initialValue) {
		return (Pred1)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPred1ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pred2 createPred2FromString(EDataType eDataType, String initialValue) {
		return (Pred2)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPred2ToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FvPackage getFvPackage() {
		return (FvPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FvPackage getPackage() {
		return FvPackage.eINSTANCE;
	}

} //FvFactoryImpl
