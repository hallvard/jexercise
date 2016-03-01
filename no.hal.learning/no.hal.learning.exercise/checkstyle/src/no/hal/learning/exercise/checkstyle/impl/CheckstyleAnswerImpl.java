/**
 */
package no.hal.learning.exercise.checkstyle.impl;

import java.util.Collection;

import no.hal.learning.exercise.checkstyle.CheckstyleAnswer;
import no.hal.learning.exercise.checkstyle.CheckstylePackage;
import no.hal.learning.exercise.impl.TaskAnswerImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.checkstyle.impl.CheckstyleAnswerImpl#getClassNames <em>Class Names</em>}</li>
 *   <li>{@link no.hal.learning.exercise.checkstyle.impl.CheckstyleAnswerImpl#getStyleName <em>Style Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CheckstyleAnswerImpl extends TaskAnswerImpl implements CheckstyleAnswer {
	/**
	 * The cached value of the '{@link #getClassNames() <em>Class Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> classNames;

	/**
	 * The default value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected static final String STYLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStyleName() <em>Style Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyleName()
	 * @generated
	 * @ordered
	 */
	protected String styleName = STYLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CheckstyleAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CheckstylePackage.Literals.CHECKSTYLE_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getClassNames() {
		if (classNames == null) {
			classNames = new EDataTypeUniqueEList<String>(String.class, this, CheckstylePackage.CHECKSTYLE_ANSWER__CLASS_NAMES);
		}
		return classNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStyleName() {
		return styleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStyleName(String newStyleName) {
		String oldStyleName = styleName;
		styleName = newStyleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CheckstylePackage.CHECKSTYLE_ANSWER__STYLE_NAME, oldStyleName, styleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CheckstylePackage.CHECKSTYLE_ANSWER__CLASS_NAMES:
				return getClassNames();
			case CheckstylePackage.CHECKSTYLE_ANSWER__STYLE_NAME:
				return getStyleName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CheckstylePackage.CHECKSTYLE_ANSWER__CLASS_NAMES:
				getClassNames().clear();
				getClassNames().addAll((Collection<? extends String>)newValue);
				return;
			case CheckstylePackage.CHECKSTYLE_ANSWER__STYLE_NAME:
				setStyleName((String)newValue);
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
			case CheckstylePackage.CHECKSTYLE_ANSWER__CLASS_NAMES:
				getClassNames().clear();
				return;
			case CheckstylePackage.CHECKSTYLE_ANSWER__STYLE_NAME:
				setStyleName(STYLE_NAME_EDEFAULT);
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
			case CheckstylePackage.CHECKSTYLE_ANSWER__CLASS_NAMES:
				return classNames != null && !classNames.isEmpty();
			case CheckstylePackage.CHECKSTYLE_ANSWER__STYLE_NAME:
				return STYLE_NAME_EDEFAULT == null ? styleName != null : !STYLE_NAME_EDEFAULT.equals(styleName);
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
		result.append(" (classNames: ");
		result.append(classNames);
		result.append(", styleName: ");
		result.append(styleName);
		result.append(')');
		return result.toString();
	}

} //CheckstyleAnswerImpl
