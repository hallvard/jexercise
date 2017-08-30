/**
 */
package no.hal.learning.exercise.jdt.ecore.ast.impl;

import java.util.Collection;

import no.hal.learning.exercise.jdt.ecore.ast.AnnotationTypeMemberDeclaration;
import no.hal.learning.exercise.jdt.ecore.ast.AstPackage;
import no.hal.learning.exercise.jdt.ecore.ast.Expression;
import no.hal.learning.exercise.jdt.ecore.ast.IExtendedModifier;
import no.hal.learning.exercise.jdt.ecore.ast.Javadoc;
import no.hal.learning.exercise.jdt.ecore.ast.SimpleName;
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
 * An implementation of the model object '<em><b>Annotation Type Member Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.AnnotationTypeMemberDeclarationImpl#getJavadoc <em>Javadoc</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.AnnotationTypeMemberDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.AnnotationTypeMemberDeclarationImpl#getType <em>Type</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.AnnotationTypeMemberDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.AnnotationTypeMemberDeclarationImpl#getDefault <em>Default</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationTypeMemberDeclarationImpl extends BodyDeclarationImpl implements AnnotationTypeMemberDeclaration {
	/**
	 * The cached value of the '{@link #getJavadoc() <em>Javadoc</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavadoc()
	 * @generated
	 * @ordered
	 */
	protected Javadoc javadoc;

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
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected SimpleName name;

	/**
	 * The cached value of the '{@link #getDefault() <em>Default</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault()
	 * @generated
	 * @ordered
	 */
	protected Expression default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationTypeMemberDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.ANNOTATION_TYPE_MEMBER_DECLARATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Javadoc getJavadoc() {
		return javadoc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavadoc(Javadoc newJavadoc, NotificationChain msgs) {
		Javadoc oldJavadoc = javadoc;
		javadoc = newJavadoc;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC, oldJavadoc, newJavadoc);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavadoc(Javadoc newJavadoc) {
		if (newJavadoc != javadoc) {
			NotificationChain msgs = null;
			if (javadoc != null)
				msgs = ((InternalEObject)javadoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC, null, msgs);
			if (newJavadoc != null)
				msgs = ((InternalEObject)newJavadoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC, null, msgs);
			msgs = basicSetJavadoc(newJavadoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC, newJavadoc, newJavadoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IExtendedModifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<IExtendedModifier>(IExtendedModifier.class, this, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIERS);
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, oldType, newType);
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
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE, newType, newType));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getDefault() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault(Expression newDefault, NotificationChain msgs) {
		Expression oldDefault = default_;
		default_ = newDefault;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, oldDefault, newDefault);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefault(Expression newDefault) {
		if (newDefault != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, null, msgs);
			if (newDefault != null)
				msgs = ((InternalEObject)newDefault).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, null, msgs);
			msgs = basicSetDefault(newDefault, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT, newDefault, newDefault));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC:
				return basicSetJavadoc(null, msgs);
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return basicSetType(null, msgs);
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				return basicSetName(null, msgs);
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return basicSetDefault(null, msgs);
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
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC:
				return getJavadoc();
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIERS:
				return getModifiers();
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return getType();
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				return getName();
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return getDefault();
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
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC:
				setJavadoc((Javadoc)newValue);
				return;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends IExtendedModifier>)newValue);
				return;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				setType((Type)newValue);
				return;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				setName((SimpleName)newValue);
				return;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				setDefault((Expression)newValue);
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
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC:
				setJavadoc((Javadoc)null);
				return;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIERS:
				getModifiers().clear();
				return;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				setType((Type)null);
				return;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				setName((SimpleName)null);
				return;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				setDefault((Expression)null);
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
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__JAVADOC:
				return javadoc != null;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__TYPE:
				return type != null;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__NAME:
				return name != null;
			case AstPackage.ANNOTATION_TYPE_MEMBER_DECLARATION__DEFAULT:
				return default_ != null;
		}
		return super.eIsSet(featureID);
	}

} //AnnotationTypeMemberDeclarationImpl
