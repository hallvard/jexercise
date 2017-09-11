/**
 */
package no.hal.learning.fv.impl;

import no.hal.learning.fv.ExpressionFeatures;
import no.hal.learning.fv.FeatureValued;
import no.hal.learning.fv.FvPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Features</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.fv.impl.ExpressionFeaturesImpl#getFeatures <em>Features</em>}</li>
 *   <li>{@link no.hal.learning.fv.impl.ExpressionFeaturesImpl#getOther <em>Other</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionFeaturesImpl extends DerivedFeaturesImpl implements ExpressionFeatures {
	/**
	 * The cached value of the '{@link #getFeatures() <em>Features</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatures()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> features;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected FeatureValued other;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionFeaturesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FvPackage.Literals.EXPRESSION_FEATURES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getFeatures() {
		if (features == null) {
			features = new EcoreEMap<String,String>(FvPackage.Literals.STRING_TO_STRING, StringToStringImpl.class, this, FvPackage.EXPRESSION_FEATURES__FEATURES);
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValued getOther() {
		if (other != null && other.eIsProxy()) {
			InternalEObject oldOther = (InternalEObject)other;
			other = (FeatureValued)eResolveProxy(oldOther);
			if (other != oldOther) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FvPackage.EXPRESSION_FEATURES__OTHER, oldOther, other));
			}
		}
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValued basicGetOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOther(FeatureValued newOther) {
		FeatureValued oldOther = other;
		other = newOther;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FvPackage.EXPRESSION_FEATURES__OTHER, oldOther, other));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FvPackage.EXPRESSION_FEATURES__FEATURES:
				return ((InternalEList<?>)getFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FvPackage.EXPRESSION_FEATURES__FEATURES:
				if (coreType) return getFeatures();
				else return getFeatures().map();
			case FvPackage.EXPRESSION_FEATURES__OTHER:
				if (resolve) return getOther();
				return basicGetOther();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FvPackage.EXPRESSION_FEATURES__FEATURES:
				((EStructuralFeature.Setting)getFeatures()).set(newValue);
				return;
			case FvPackage.EXPRESSION_FEATURES__OTHER:
				setOther((FeatureValued)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FvPackage.EXPRESSION_FEATURES__FEATURES:
				getFeatures().clear();
				return;
			case FvPackage.EXPRESSION_FEATURES__OTHER:
				setOther((FeatureValued)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FvPackage.EXPRESSION_FEATURES__FEATURES:
				return features != null && !features.isEmpty();
			case FvPackage.EXPRESSION_FEATURES__OTHER:
				return other != null;
		}
		return super.eIsSet(featureID);
	}
	
	//
	
	@Override
	public EList<String> getFeatureNames() {
		return new BasicEList<String>(getFeatures().keySet());
	}
	
	public double getFeatureValue(String featureName) {
		ExpressionBuilder builder = new ExpressionBuilder(features.get(featureName));
		EList<String> variables = getOther().getFeatureNames();
		for (String var : variables) {
			builder.variable(mangle(var));
		}
		Expression expr = builder.build();
		for (String var : variables) {
			double value = getOther().getFeatureValue(var);
			expr.setVariable(mangle(var), value);
		}
		return expr.evaluate();
	}
	
	protected String mangle(String var) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < var.length(); i++) {
			char c = var.charAt(i);
			if (Character.isAlphabetic(c) || Character.isDigit(c)) {
				builder.append(c);
			} else {
				builder.append('_');				
			}
		}
		return builder.toString();
	}

	@Override
	public boolean hasFeature(String featureName) {
		return features.containsKey(featureName);
	}

	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();
		return FeatureListImpl.toString(this);
	}

} //ExpressionFeaturesImpl
