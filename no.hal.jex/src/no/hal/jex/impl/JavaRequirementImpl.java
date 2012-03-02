/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import no.hal.jex.JavaElement;
import no.hal.jex.JavaRequirement;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.JavaRequirementImpl#getJavaElement <em>Java Element</em>}</li>
 *   <li>{@link no.hal.jex.impl.JavaRequirementImpl#getRequiredFeatures <em>Required Features</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaRequirementImpl extends RequirementImpl implements JavaRequirement {
	/**
	 * The cached value of the '{@link #getJavaElement() <em>Java Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaElement()
	 * @generated
	 * @ordered
	 */
	protected JavaElement javaElement;

	/**
	 * The default value of the '{@link #getRequiredFeatures() <em>Required Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final String REQUIRED_FEATURES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequiredFeatures() <em>Required Features</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredFeatures()
	 * @generated
	 * @ordered
	 */
	protected String requiredFeatures = REQUIRED_FEATURES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaRequirementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.JAVA_REQUIREMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaElement getJavaElement() {
		if (javaElement != null && javaElement.eIsProxy()) {
			InternalEObject oldJavaElement = (InternalEObject)javaElement;
			javaElement = (JavaElement)eResolveProxy(oldJavaElement);
			if (javaElement != oldJavaElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JexPackage.JAVA_REQUIREMENT__JAVA_ELEMENT, oldJavaElement, javaElement));
			}
		}
		return javaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaElement basicGetJavaElement() {
		return javaElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaElement(JavaElement newJavaElement) {
		JavaElement oldJavaElement = javaElement;
		javaElement = newJavaElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JAVA_REQUIREMENT__JAVA_ELEMENT, oldJavaElement, javaElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRequiredFeatures() {
		return requiredFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequiredFeatures(String newRequiredFeatures) {
		String oldRequiredFeatures = requiredFeatures;
		requiredFeatures = newRequiredFeatures;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JAVA_REQUIREMENT__REQUIRED_FEATURES, oldRequiredFeatures, requiredFeatures));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JexPackage.JAVA_REQUIREMENT__JAVA_ELEMENT:
				if (resolve) return getJavaElement();
				return basicGetJavaElement();
			case JexPackage.JAVA_REQUIREMENT__REQUIRED_FEATURES:
				return getRequiredFeatures();
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
			case JexPackage.JAVA_REQUIREMENT__JAVA_ELEMENT:
				setJavaElement((JavaElement)newValue);
				return;
			case JexPackage.JAVA_REQUIREMENT__REQUIRED_FEATURES:
				setRequiredFeatures((String)newValue);
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
			case JexPackage.JAVA_REQUIREMENT__JAVA_ELEMENT:
				setJavaElement((JavaElement)null);
				return;
			case JexPackage.JAVA_REQUIREMENT__REQUIRED_FEATURES:
				setRequiredFeatures(REQUIRED_FEATURES_EDEFAULT);
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
			case JexPackage.JAVA_REQUIREMENT__JAVA_ELEMENT:
				return javaElement != null;
			case JexPackage.JAVA_REQUIREMENT__REQUIRED_FEATURES:
				return REQUIRED_FEATURES_EDEFAULT == null ? requiredFeatures != null : !REQUIRED_FEATURES_EDEFAULT.equals(requiredFeatures);
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
		result.append(" (requiredFeatures: ");
		result.append(requiredFeatures);
		result.append(')');
		return result.toString();
	}

	protected String getDefaultURIFragment() {
		JavaElement javaElement = getJavaElement();
		if (javaElement instanceof Member) {
			return "#" + ((Member)javaElement).getFullName();
		}
		return null;
	}

} //JavaRequirementImpl
