/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.Collection;
import java.util.List;

import no.hal.jex.JavaMethod;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.JavaMethodImpl#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link no.hal.jex.impl.JavaMethodImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.jex.impl.JavaMethodImpl#getThrowables <em>Throwables</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaMethodImpl extends MemberImpl implements JavaMethod {
	/**
	 * The default value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected static final String RETURN_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReturnType() <em>Return Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType()
	 * @generated
	 * @ordered
	 */
	protected String returnType = RETURN_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<String> parameters;

	/**
	 * The cached value of the '{@link #getThrowables() <em>Throwables</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrowables()
	 * @generated
	 * @ordered
	 */
	protected EList<String> throwables;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaMethodImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.JAVA_METHOD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReturnType() {
		return returnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType(String newReturnType) {
		String oldReturnType = returnType;
		returnType = newReturnType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JAVA_METHOD__RETURN_TYPE, oldReturnType, returnType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getParameters() {
		if (parameters == null) {
			parameters = new EDataTypeEList<String>(String.class, this, JexPackage.JAVA_METHOD__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getThrowables() {
		if (throwables == null) {
			throwables = new EDataTypeUniqueEList<String>(String.class, this, JexPackage.JAVA_METHOD__THROWABLES);
		}
		return throwables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JexPackage.JAVA_METHOD__RETURN_TYPE:
				return getReturnType();
			case JexPackage.JAVA_METHOD__PARAMETERS:
				return getParameters();
			case JexPackage.JAVA_METHOD__THROWABLES:
				return getThrowables();
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
			case JexPackage.JAVA_METHOD__RETURN_TYPE:
				setReturnType((String)newValue);
				return;
			case JexPackage.JAVA_METHOD__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends String>)newValue);
				return;
			case JexPackage.JAVA_METHOD__THROWABLES:
				getThrowables().clear();
				getThrowables().addAll((Collection<? extends String>)newValue);
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
			case JexPackage.JAVA_METHOD__RETURN_TYPE:
				setReturnType(RETURN_TYPE_EDEFAULT);
				return;
			case JexPackage.JAVA_METHOD__PARAMETERS:
				getParameters().clear();
				return;
			case JexPackage.JAVA_METHOD__THROWABLES:
				getThrowables().clear();
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
			case JexPackage.JAVA_METHOD__RETURN_TYPE:
				return RETURN_TYPE_EDEFAULT == null ? returnType != null : !RETURN_TYPE_EDEFAULT.equals(returnType);
			case JexPackage.JAVA_METHOD__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case JexPackage.JAVA_METHOD__THROWABLES:
				return throwables != null && !throwables.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		String type = getReturnType(), kind = " method";
		if (type == null && getSimpleName().equals(getOwner().getSimpleName())) {
			type = "";
			kind = "constructor";
		}
		return toString(type + kind + " " + super.toString());
	}

	@Override
	public boolean overrides(Member other) {
		if (! (other instanceof JavaMethod && super.overrides(other))) {
			return false;
		}
		JavaMethod otherMethod = (JavaMethod)other;
		List<String> params = getParameters(), otherParams = otherMethod.getParameters();
		if (params.size() != otherParams.size()) {
			return false;
		}
		for (int i = 0; i < params.size(); i++) {
			if (! params.get(i).equals(otherParams.get(i))) {
				return false;
			}
		}
		return true;
	}

	//

} //JavaMethodImpl
