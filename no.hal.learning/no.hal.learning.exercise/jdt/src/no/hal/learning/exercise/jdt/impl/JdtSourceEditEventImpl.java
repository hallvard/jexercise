/**
 */
package no.hal.learning.exercise.jdt.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.learning.exercise.TaskAnswer;
import no.hal.learning.exercise.jdt.JdtPackage;
import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditEvent;
import no.hal.learning.exercise.workspace.impl.SourceFileEditEventImpl;
import no.hal.learning.fv.FeatureValued;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditEventImpl#getMetrics <em>Metrics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JdtSourceEditEventImpl extends SourceFileEditEventImpl implements JdtSourceEditEvent {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getMetrics() <em>Metrics</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetrics()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, FeatureValued> metrics;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JdtSourceEditEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdtPackage.Literals.JDT_SOURCE_EDIT_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getClassName() {
		if (className == null && getProposal() != null) {
			TaskAnswer answer = getProposal().getAnswer();
			if (answer instanceof JdtSourceEditAnswer) {
				return ((JdtSourceEditAnswer) answer).getClassName();
			}
		}
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_SOURCE_EDIT_EVENT__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, FeatureValued> getMetrics() {
		if (metrics == null) {
			metrics = new EcoreEMap<String,FeatureValued>(JdtPackage.Literals.STRING_TO_FEATURE_VALUED, StringToFeatureValuedImpl.class, this, JdtPackage.JDT_SOURCE_EDIT_EVENT__METRICS);
		}
		return metrics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__METRICS:
				return ((InternalEList<?>)getMetrics()).basicRemove(otherEnd, msgs);
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
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__CLASS_NAME:
				return getClassName();
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__METRICS:
				if (coreType) return getMetrics();
				else return getMetrics().map();
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
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__METRICS:
				((EStructuralFeature.Setting)getMetrics()).set(newValue);
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
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__METRICS:
				getMetrics().clear();
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
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case JdtPackage.JDT_SOURCE_EDIT_EVENT__METRICS:
				return metrics != null && !metrics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (className: ");
		result.append(className);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public String getText() {
		return String.format("%s: %s lines with %s error(s), %s warning(s)", getTaskProposal().getText(), getSizeMeasure(), getErrorCount(), getWarningCount());
	}

} //JdtClassEventImpl
