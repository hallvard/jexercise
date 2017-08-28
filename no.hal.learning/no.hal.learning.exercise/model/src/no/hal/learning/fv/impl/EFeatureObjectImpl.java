/**
 */
package no.hal.learning.fv.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EModelElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.learning.fv.EFeatureObject;
import no.hal.learning.fv.FeatureList;
import no.hal.learning.fv.FvPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EFeature Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EFeatureObjectImpl extends MinimalEObjectImpl.Container implements EFeatureObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EFeatureObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.EFEATURE_OBJECT;
	}

	private EList<String> featureNames = null;
	
	private boolean hasAnnotation(EModelElement model, String key) {
		String annotation = EcoreUtil.getAnnotation(model, FvPackage.eNS_URI, key);
		return (annotation != null && Boolean.valueOf(annotation).booleanValue());
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getFeatureNames() {
		if (featureNames != null) {
			featureNames = new BasicEList<String>();
			for (EAttribute attr : eClass().getEAllAttributes()) {
				if (! attr.isMany()) {
					EClassifier eType = attr.getEType();
					if ((eType == EcorePackage.eINSTANCE.getEDouble() && (! hasAnnotation(attr, "exclude"))) ||
						((eType == EcorePackage.eINSTANCE.getEInt() || eType == EcorePackage.eINSTANCE.getELong()) && hasAnnotation(attr, "include"))) {
						featureNames.add(attr.getName());
					}
				}
			}
		}
		return featureNames;
	}

	private double getAnnotationValue(EModelElement model, String key, double def) {
		String annotation = EcoreUtil.getAnnotation(model, FvPackage.eNS_URI, key);
		return (annotation != null ? Double.valueOf(annotation) : def);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public double getFeatureValue(String featureName) {
		EStructuralFeature feature = eClass().getEStructuralFeature(featureName);
		Object value = eGet(feature);
		return (value instanceof Number ? ((Number) value).doubleValue() : getAnnotationValue(feature, "default", 0.0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean hasFeature(String featureName) {
		return getFeatureNames().contains(featureName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public FeatureList toFeatureList() {
		return FeatureListImpl.toFeatureList(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case FvPackage.EFEATURE_OBJECT___GET_FEATURE_NAMES:
				return getFeatureNames();
			case FvPackage.EFEATURE_OBJECT___GET_FEATURE_VALUE__STRING:
				return getFeatureValue((String)arguments.get(0));
			case FvPackage.EFEATURE_OBJECT___HAS_FEATURE__STRING:
				return hasFeature((String)arguments.get(0));
			case FvPackage.EFEATURE_OBJECT___TO_FEATURE_LIST:
				return toFeatureList();
		}
		return super.eInvoke(operationID, arguments);
	}

} //EFeatureObjectImpl
