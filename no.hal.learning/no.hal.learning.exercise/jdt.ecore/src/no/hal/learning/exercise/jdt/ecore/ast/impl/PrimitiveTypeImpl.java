/**
 */
package no.hal.learning.exercise.jdt.ecore.ast.impl;

import java.util.Collection;

import no.hal.learning.exercise.jdt.ecore.ast.Annotation;
import no.hal.learning.exercise.jdt.ecore.ast.AstPackage;
import no.hal.learning.exercise.jdt.ecore.ast.PrimitiveType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.PrimitiveTypeImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.PrimitiveTypeImpl#getPrimitiveTypeCode <em>Primitive Type Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PrimitiveTypeImpl extends AnnotatableTypeImpl implements PrimitiveType {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The default value of the '{@link #getPrimitiveTypeCode() <em>Primitive Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypeCode()
	 * @generated
	 * @ordered
	 */
	protected static final org.eclipse.jdt.core.dom.PrimitiveType.Code PRIMITIVE_TYPE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrimitiveTypeCode() <em>Primitive Type Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimitiveTypeCode()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.jdt.core.dom.PrimitiveType.Code primitiveTypeCode = PRIMITIVE_TYPE_CODE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.PRIMITIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, AstPackage.PRIMITIVE_TYPE__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.jdt.core.dom.PrimitiveType.Code getPrimitiveTypeCode() {
		return primitiveTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimitiveTypeCode(org.eclipse.jdt.core.dom.PrimitiveType.Code newPrimitiveTypeCode) {
		org.eclipse.jdt.core.dom.PrimitiveType.Code oldPrimitiveTypeCode = primitiveTypeCode;
		primitiveTypeCode = newPrimitiveTypeCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_CODE, oldPrimitiveTypeCode, primitiveTypeCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.PRIMITIVE_TYPE__ANNOTATIONS:
				return ((InternalEList<?>)getAnnotations()).basicRemove(otherEnd, msgs);
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
			case AstPackage.PRIMITIVE_TYPE__ANNOTATIONS:
				return getAnnotations();
			case AstPackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_CODE:
				return getPrimitiveTypeCode();
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
			case AstPackage.PRIMITIVE_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				getAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AstPackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_CODE:
				setPrimitiveTypeCode((org.eclipse.jdt.core.dom.PrimitiveType.Code)newValue);
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
			case AstPackage.PRIMITIVE_TYPE__ANNOTATIONS:
				getAnnotations().clear();
				return;
			case AstPackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_CODE:
				setPrimitiveTypeCode(PRIMITIVE_TYPE_CODE_EDEFAULT);
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
			case AstPackage.PRIMITIVE_TYPE__ANNOTATIONS:
				return annotations != null && !annotations.isEmpty();
			case AstPackage.PRIMITIVE_TYPE__PRIMITIVE_TYPE_CODE:
				return PRIMITIVE_TYPE_CODE_EDEFAULT == null ? primitiveTypeCode != null : !PRIMITIVE_TYPE_CODE_EDEFAULT.equals(primitiveTypeCode);
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
		result.append(" (primitiveTypeCode: ");
		result.append(primitiveTypeCode);
		result.append(')');
		return result.toString();
	}

} //PrimitiveTypeImpl
