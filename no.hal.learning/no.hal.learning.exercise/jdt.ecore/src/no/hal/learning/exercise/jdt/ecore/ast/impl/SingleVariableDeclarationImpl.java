/**
 */
package no.hal.learning.exercise.jdt.ecore.ast.impl;

import java.util.Collection;

import no.hal.learning.exercise.jdt.ecore.ast.Annotation;
import no.hal.learning.exercise.jdt.ecore.ast.AstPackage;
import no.hal.learning.exercise.jdt.ecore.ast.Dimension;
import no.hal.learning.exercise.jdt.ecore.ast.Expression;
import no.hal.learning.exercise.jdt.ecore.ast.IExtendedModifier;
import no.hal.learning.exercise.jdt.ecore.ast.SimpleName;
import no.hal.learning.exercise.jdt.ecore.ast.SingleVariableDeclaration;
import no.hal.learning.exercise.jdt.ecore.ast.Type;

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
 * An implementation of the model object '<em><b>Single Variable Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.SingleVariableDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.SingleVariableDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.SingleVariableDeclarationImpl#getVarargsAnnotations <em>Varargs Annotations</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.SingleVariableDeclarationImpl#isVarargs <em>Varargs</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.SingleVariableDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.SingleVariableDeclarationImpl#getExtraDimensions2 <em>Extra Dimensions2</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.SingleVariableDeclarationImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SingleVariableDeclarationImpl extends VariableDeclarationImpl implements SingleVariableDeclaration {
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
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getVarargsAnnotations() <em>Varargs Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarargsAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> varargsAnnotations;

	/**
	 * The default value of the '{@link #isVarargs() <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarargs()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VARARGS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVarargs() <em>Varargs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVarargs()
	 * @generated
	 * @ordered
	 */
	protected boolean varargs = VARARGS_EDEFAULT;

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
	 * The cached value of the '{@link #getExtraDimensions2() <em>Extra Dimensions2</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtraDimensions2()
	 * @generated
	 * @ordered
	 */
	protected EList<Dimension> extraDimensions2;

	/**
	 * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitializer()
	 * @generated
	 * @ordered
	 */
	protected Expression initializer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SingleVariableDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.SINGLE_VARIABLE_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IExtendedModifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<IExtendedModifier>(IExtendedModifier.class, this, AstPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(Type newType, NotificationChain msgs) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getVarargsAnnotations() {
		if (varargsAnnotations == null) {
			varargsAnnotations = new EObjectContainmentEList<Annotation>(Annotation.class, this, AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS_ANNOTATIONS);
		}
		return varargsAnnotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVarargs() {
		return varargs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarargs(boolean newVarargs) {
		boolean oldVarargs = varargs;
		varargs = newVarargs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS, oldVarargs, varargs));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.SINGLE_VARIABLE_DECLARATION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.SINGLE_VARIABLE_DECLARATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.SINGLE_VARIABLE_DECLARATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.SINGLE_VARIABLE_DECLARATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getExtraDimensions2() {
		if (extraDimensions2 == null) {
			extraDimensions2 = new EObjectContainmentEList<Dimension>(Dimension.class, this, AstPackage.SINGLE_VARIABLE_DECLARATION__EXTRA_DIMENSIONS2);
		}
		return extraDimensions2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getInitializer() {
		return initializer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitializer(Expression newInitializer, NotificationChain msgs) {
		Expression oldInitializer = initializer;
		initializer = newInitializer;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER, oldInitializer, newInitializer);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitializer(Expression newInitializer) {
		if (newInitializer != initializer) {
			NotificationChain msgs = null;
			if (initializer != null)
				msgs = ((InternalEObject)initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER, null, msgs);
			if (newInitializer != null)
				msgs = ((InternalEObject)newInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER, null, msgs);
			msgs = basicSetInitializer(newInitializer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER, newInitializer, newInitializer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				return basicSetType(null, msgs);
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS_ANNOTATIONS:
				return ((InternalEList<?>)getVarargsAnnotations()).basicRemove(otherEnd, msgs);
			case AstPackage.SINGLE_VARIABLE_DECLARATION__NAME:
				return basicSetName(null, msgs);
			case AstPackage.SINGLE_VARIABLE_DECLARATION__EXTRA_DIMENSIONS2:
				return ((InternalEList<?>)getExtraDimensions2()).basicRemove(otherEnd, msgs);
			case AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER:
				return basicSetInitializer(null, msgs);
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
			case AstPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return getModifiers();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				return getType();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS_ANNOTATIONS:
				return getVarargsAnnotations();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return isVarargs();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__NAME:
				return getName();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__EXTRA_DIMENSIONS2:
				return getExtraDimensions2();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER:
				return getInitializer();
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
			case AstPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends IExtendedModifier>)newValue);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				setType((Type)newValue);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS_ANNOTATIONS:
				getVarargsAnnotations().clear();
				getVarargsAnnotations().addAll((Collection<? extends Annotation>)newValue);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				setVarargs((Boolean)newValue);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__NAME:
				setName((SimpleName)newValue);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__EXTRA_DIMENSIONS2:
				getExtraDimensions2().clear();
				getExtraDimensions2().addAll((Collection<? extends Dimension>)newValue);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER:
				setInitializer((Expression)newValue);
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
			case AstPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				getModifiers().clear();
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				setType((Type)null);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS_ANNOTATIONS:
				getVarargsAnnotations().clear();
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				setVarargs(VARARGS_EDEFAULT);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__NAME:
				setName((SimpleName)null);
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__EXTRA_DIMENSIONS2:
				getExtraDimensions2().clear();
				return;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER:
				setInitializer((Expression)null);
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
			case AstPackage.SINGLE_VARIABLE_DECLARATION__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__TYPE:
				return type != null;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS_ANNOTATIONS:
				return varargsAnnotations != null && !varargsAnnotations.isEmpty();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__VARARGS:
				return varargs != VARARGS_EDEFAULT;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__NAME:
				return name != null;
			case AstPackage.SINGLE_VARIABLE_DECLARATION__EXTRA_DIMENSIONS2:
				return extraDimensions2 != null && !extraDimensions2.isEmpty();
			case AstPackage.SINGLE_VARIABLE_DECLARATION__INITIALIZER:
				return initializer != null;
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
		result.append(" (varargs: ");
		result.append(varargs);
		result.append(')');
		return result.toString();
	}

} //SingleVariableDeclarationImpl
