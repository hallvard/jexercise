/**
 */
package no.hal.learning.exercise.jdt.ecore.ast.impl;

import java.util.Collection;

import no.hal.learning.exercise.jdt.ecore.ast.AstPackage;
import no.hal.learning.exercise.jdt.ecore.ast.IExtendedModifier;
import no.hal.learning.exercise.jdt.ecore.ast.SimpleName;
import no.hal.learning.exercise.jdt.ecore.ast.Type;
import no.hal.learning.exercise.jdt.ecore.ast.TypeParameter;

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
 * An implementation of the model object '<em><b>Type Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.TypeParameterImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.TypeParameterImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.TypeParameterImpl#getTypeBounds <em>Type Bounds</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TypeParameterImpl extends ASTNodeImpl implements TypeParameter {
	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected EList<IExtendedModifier> modifiers;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected SimpleName name;

	/**
	 * The cached value of the '{@link #getTypeBounds() <em>Type Bounds</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeBounds()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> typeBounds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.TYPE_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IExtendedModifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<IExtendedModifier>(IExtendedModifier.class, this, AstPackage.TYPE_PARAMETER__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(SimpleName newName, NotificationChain msgs) {
		SimpleName oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.TYPE_PARAMETER__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(SimpleName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.TYPE_PARAMETER__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.TYPE_PARAMETER__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.TYPE_PARAMETER__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypeBounds() {
		if (typeBounds == null) {
			typeBounds = new EObjectContainmentEList<Type>(Type.class, this, AstPackage.TYPE_PARAMETER__TYPE_BOUNDS);
		}
		return typeBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.TYPE_PARAMETER__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case AstPackage.TYPE_PARAMETER__NAME:
				return basicSetName(null, msgs);
			case AstPackage.TYPE_PARAMETER__TYPE_BOUNDS:
				return ((InternalEList<?>)getTypeBounds()).basicRemove(otherEnd, msgs);
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
			case AstPackage.TYPE_PARAMETER__MODIFIERS:
				return getModifiers();
			case AstPackage.TYPE_PARAMETER__NAME:
				return getName();
			case AstPackage.TYPE_PARAMETER__TYPE_BOUNDS:
				return getTypeBounds();
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
			case AstPackage.TYPE_PARAMETER__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends IExtendedModifier>)newValue);
				return;
			case AstPackage.TYPE_PARAMETER__NAME:
				setName((SimpleName)newValue);
				return;
			case AstPackage.TYPE_PARAMETER__TYPE_BOUNDS:
				getTypeBounds().clear();
				getTypeBounds().addAll((Collection<? extends Type>)newValue);
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
			case AstPackage.TYPE_PARAMETER__MODIFIERS:
				getModifiers().clear();
				return;
			case AstPackage.TYPE_PARAMETER__NAME:
				setName((SimpleName)null);
				return;
			case AstPackage.TYPE_PARAMETER__TYPE_BOUNDS:
				getTypeBounds().clear();
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
			case AstPackage.TYPE_PARAMETER__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case AstPackage.TYPE_PARAMETER__NAME:
				return name != null;
			case AstPackage.TYPE_PARAMETER__TYPE_BOUNDS:
				return typeBounds != null && !typeBounds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeParameterImpl
