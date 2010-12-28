/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
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
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IParent;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.Signature;

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

	public boolean overrides(Member other) {
		if (! (other instanceof JavaMethod && super.overrides(other))) {
			return false;
		}
		JavaMethod otherMethod = (JavaMethod)other;
		List params = getParameters(), otherParams = otherMethod.getParameters();
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

	public void initFrom(IMember member) throws JavaModelException {
		if (! (member instanceof IMethod)) {
			throw new IllegalArgumentException("Cannot init JavaMethod from " + member);
		}
		super.initFrom(member);
		getParameters().clear();
		IMethod method = (IMethod)member;
		String[] types = method.getParameterTypes();
		for (int i = 0; i < types.length; i++) {
			getParameters().add(Signature.toString(types[i]));
		}
		setReturnType(Signature.toString(method.getReturnType()));
		getThrowables().addAll(Arrays.asList(method.getExceptionTypes()));
	}

	//
	
	private static IMethod findJavaMethod(List methods, String resultType, List parameters) {
		if (methods == null) {
			return null;
		}
		for (Iterator it = methods.iterator(); it.hasNext();) {
			IMethod method = (IMethod)it.next();
			if (validateTypes(resultType, parameters, method) == Boolean.TRUE) {
				return method;
			}
		}
		return null;
	}

	private IMethod findJavaMethod(IJavaElement javaClass, String resultType, List parameters) {
		if (javaClass instanceof IParent) {
			return findJavaMethod(JavaClassImpl.findJavaMembers((IParent)javaClass, getSimpleName(), IJavaElement.METHOD, IMethod.class), resultType, parameters);
		}
		return null;
	}
	
	private IMethod findJavaMethod(IJavaElement javaClass) {
		return findJavaMethod(javaClass, getReturnType(), getParameters());
	}

	public static IMember findJavaMethod(IJavaElement javaClass, String name, String resultType, List parameters) {
		return findJavaMethod(JavaClassImpl.findJavaMembers((IParent)javaClass, name, IJavaElement.METHOD, IMethod.class), resultType, parameters);
	}

	private static Boolean validateTypes(List types, String[] types2, boolean isOrdered) {
		if (types == null) {
			return Boolean.TRUE;
		}
		if (isOrdered && types2.length != types.size()) {
			return Boolean.FALSE;
		}
		for (int i = 0; i < types.size(); i++) {
			String type = (String)types.get(i);
			if (isOrdered) {
				if (! testTypeString(type, types2[i])) {
					return Boolean.FALSE;
				}
			} else {
				for (int j = 0; j < types2.length; j++) {
					if (! testTypeString(type, types2[j])) {
						return Boolean.FALSE;
					}
				}
			}
		}
		return Boolean.TRUE;
	}

	private static Boolean validateTypes(String returnType, List parameterTypes, IMethod method) {
		if (returnType != null) {
			try {
				if (! testTypeString(returnType, method.getReturnType())) {
					return Boolean.FALSE;
				}
			} catch (JavaModelException e) {
				return null;
			}
		}
		return validateTypes(parameterTypes, method.getParameterTypes(), true);
	}
	
	private static Boolean validateThrowables(List throwables, IMethod method) {
		try {
			return validateTypes(throwables, method.getExceptionTypes(), false);
		} catch (JavaModelException e) {
			return null;
		}
	}

	public Boolean validateTypes(IMethod method) {
		Boolean result = validateTypes(getReturnType(), getParameters(), method);
		if (result != Boolean.TRUE) {
			return result;
		}
		return validateThrowables(getThrowables(), method);
	}

	public IJavaElement findJavaCoreElement(IJavaProject project) {
		IJavaElement javaClass = getOwner().findJavaCoreElement(project);
		return findJavaMethod(javaClass);
	}

} //JavaMethodImpl
