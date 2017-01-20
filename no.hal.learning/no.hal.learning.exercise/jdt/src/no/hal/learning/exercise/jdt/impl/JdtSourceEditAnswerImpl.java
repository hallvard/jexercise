/**
 */
package no.hal.learning.exercise.jdt.impl;

import java.util.Collection;

import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.impl.StringEditAnswerImpl;
import no.hal.learning.exercise.jdt.JdtSourceEditAnswer;
import no.hal.learning.exercise.jdt.JdtSourceEditProposal;
import no.hal.learning.exercise.jdt.JdtFactory;
import no.hal.learning.exercise.jdt.JdtPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditAnswerImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.impl.JdtSourceEditAnswerImpl#getMethodNames <em>Method Names</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JdtSourceEditAnswerImpl extends StringEditAnswerImpl implements JdtSourceEditAnswer {
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
	 * The cached value of the '{@link #getMethodNames() <em>Method Names</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethodNames()
	 * @generated
	 * @ordered
	 */
	protected EList<String> methodNames;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JdtSourceEditAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JdtPackage.Literals.JDT_SOURCE_EDIT_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
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
			eNotify(new ENotificationImpl(this, Notification.SET, JdtPackage.JDT_SOURCE_EDIT_ANSWER__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getMethodNames() {
		if (methodNames == null) {
			methodNames = new EDataTypeUniqueEList<String>(String.class, this, JdtPackage.JDT_SOURCE_EDIT_ANSWER__METHOD_NAMES);
		}
		return methodNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER__CLASS_NAME:
				return getClassName();
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER__METHOD_NAMES:
				return getMethodNames();
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
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER__METHOD_NAMES:
				getMethodNames().clear();
				getMethodNames().addAll((Collection<? extends String>)newValue);
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
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER__METHOD_NAMES:
				getMethodNames().clear();
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
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case JdtPackage.JDT_SOURCE_EDIT_ANSWER__METHOD_NAMES:
				return methodNames != null && !methodNames.isEmpty();
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
		result.append(", methodNames: ");
		result.append(methodNames);
		result.append(')');
		return result.toString();
	}
	
	//

	@Override
	public Proposal<?> createProposal() {
		JdtSourceEditProposal proposal = JdtFactory.eINSTANCE.createJdtSourceEditProposal();
		proposal.setAnswer(this);
		return proposal;
	}

	@Override
	public String getEditorPath() {
		return String.valueOf(IPath.SEPARATOR) + getClassName().replace('.', IPath.SEPARATOR) + ".java";
	}

} //JdtClassAnswerImpl
