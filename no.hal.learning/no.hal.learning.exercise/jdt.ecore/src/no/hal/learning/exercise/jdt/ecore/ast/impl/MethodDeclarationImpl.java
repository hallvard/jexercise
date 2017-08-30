/**
 */
package no.hal.learning.exercise.jdt.ecore.ast.impl;

import java.util.Collection;

import no.hal.learning.exercise.jdt.ecore.ast.AstPackage;
import no.hal.learning.exercise.jdt.ecore.ast.Block;
import no.hal.learning.exercise.jdt.ecore.ast.Dimension;
import no.hal.learning.exercise.jdt.ecore.ast.IExtendedModifier;
import no.hal.learning.exercise.jdt.ecore.ast.Javadoc;
import no.hal.learning.exercise.jdt.ecore.ast.MethodDeclaration;
import no.hal.learning.exercise.jdt.ecore.ast.SimpleName;
import no.hal.learning.exercise.jdt.ecore.ast.SingleVariableDeclaration;
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
 * An implementation of the model object '<em><b>Method Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getJavadoc <em>Javadoc</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#isConstructor <em>Constructor</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getTypeParameters <em>Type Parameters</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getReturnType2 <em>Return Type2</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getReceiverType <em>Receiver Type</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getReceiverQualifier <em>Receiver Qualifier</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getExtraDimensions2 <em>Extra Dimensions2</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getThrownExceptionTypes <em>Thrown Exception Types</em>}</li>
 *   <li>{@link no.hal.learning.exercise.jdt.ecore.ast.impl.MethodDeclarationImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MethodDeclarationImpl extends BodyDeclarationImpl implements MethodDeclaration {
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
	 * The default value of the '{@link #isConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstructor()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CONSTRUCTOR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isConstructor() <em>Constructor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isConstructor()
	 * @generated
	 * @ordered
	 */
	protected boolean constructor = CONSTRUCTOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypeParameters() <em>Type Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeParameter> typeParameters;

	/**
	 * The cached value of the '{@link #getReturnType2() <em>Return Type2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReturnType2()
	 * @generated
	 * @ordered
	 */
	protected Type returnType2;

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
	 * The cached value of the '{@link #getReceiverType() <em>Receiver Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverType()
	 * @generated
	 * @ordered
	 */
	protected Type receiverType;

	/**
	 * The cached value of the '{@link #getReceiverQualifier() <em>Receiver Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiverQualifier()
	 * @generated
	 * @ordered
	 */
	protected SimpleName receiverQualifier;

	/**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<SingleVariableDeclaration> parameters;

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
	 * The cached value of the '{@link #getThrownExceptionTypes() <em>Thrown Exception Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThrownExceptionTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> thrownExceptionTypes;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected Block body;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MethodDeclarationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AstPackage.Literals.METHOD_DECLARATION;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__JAVADOC, oldJavadoc, newJavadoc);
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
				msgs = ((InternalEObject)javadoc).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__JAVADOC, null, msgs);
			if (newJavadoc != null)
				msgs = ((InternalEObject)newJavadoc).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__JAVADOC, null, msgs);
			msgs = basicSetJavadoc(newJavadoc, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__JAVADOC, newJavadoc, newJavadoc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IExtendedModifier> getModifiers() {
		if (modifiers == null) {
			modifiers = new EObjectContainmentEList<IExtendedModifier>(IExtendedModifier.class, this, AstPackage.METHOD_DECLARATION__MODIFIERS);
		}
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isConstructor() {
		return constructor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstructor(boolean newConstructor) {
		boolean oldConstructor = constructor;
		constructor = newConstructor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__CONSTRUCTOR, oldConstructor, constructor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeParameter> getTypeParameters() {
		if (typeParameters == null) {
			typeParameters = new EObjectContainmentEList<TypeParameter>(TypeParameter.class, this, AstPackage.METHOD_DECLARATION__TYPE_PARAMETERS);
		}
		return typeParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReturnType2() {
		return returnType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReturnType2(Type newReturnType2, NotificationChain msgs) {
		Type oldReturnType2 = returnType2;
		returnType2 = newReturnType2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__RETURN_TYPE2, oldReturnType2, newReturnType2);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReturnType2(Type newReturnType2) {
		if (newReturnType2 != returnType2) {
			NotificationChain msgs = null;
			if (returnType2 != null)
				msgs = ((InternalEObject)returnType2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__RETURN_TYPE2, null, msgs);
			if (newReturnType2 != null)
				msgs = ((InternalEObject)newReturnType2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__RETURN_TYPE2, null, msgs);
			msgs = basicSetReturnType2(newReturnType2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__RETURN_TYPE2, newReturnType2, newReturnType2));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getReceiverType() {
		return receiverType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiverType(Type newReceiverType, NotificationChain msgs) {
		Type oldReceiverType = receiverType;
		receiverType = newReceiverType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__RECEIVER_TYPE, oldReceiverType, newReceiverType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverType(Type newReceiverType) {
		if (newReceiverType != receiverType) {
			NotificationChain msgs = null;
			if (receiverType != null)
				msgs = ((InternalEObject)receiverType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__RECEIVER_TYPE, null, msgs);
			if (newReceiverType != null)
				msgs = ((InternalEObject)newReceiverType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__RECEIVER_TYPE, null, msgs);
			msgs = basicSetReceiverType(newReceiverType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__RECEIVER_TYPE, newReceiverType, newReceiverType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleName getReceiverQualifier() {
		return receiverQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiverQualifier(SimpleName newReceiverQualifier, NotificationChain msgs) {
		SimpleName oldReceiverQualifier = receiverQualifier;
		receiverQualifier = newReceiverQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER, oldReceiverQualifier, newReceiverQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiverQualifier(SimpleName newReceiverQualifier) {
		if (newReceiverQualifier != receiverQualifier) {
			NotificationChain msgs = null;
			if (receiverQualifier != null)
				msgs = ((InternalEObject)receiverQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER, null, msgs);
			if (newReceiverQualifier != null)
				msgs = ((InternalEObject)newReceiverQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER, null, msgs);
			msgs = basicSetReceiverQualifier(newReceiverQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER, newReceiverQualifier, newReceiverQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SingleVariableDeclaration> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<SingleVariableDeclaration>(SingleVariableDeclaration.class, this, AstPackage.METHOD_DECLARATION__PARAMETERS);
		}
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dimension> getExtraDimensions2() {
		if (extraDimensions2 == null) {
			extraDimensions2 = new EObjectContainmentEList<Dimension>(Dimension.class, this, AstPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS2);
		}
		return extraDimensions2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getThrownExceptionTypes() {
		if (thrownExceptionTypes == null) {
			thrownExceptionTypes = new EObjectContainmentEList<Type>(Type.class, this, AstPackage.METHOD_DECLARATION__THROWN_EXCEPTION_TYPES);
		}
		return thrownExceptionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBody(Block newBody, NotificationChain msgs) {
		Block oldBody = body;
		body = newBody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__BODY, oldBody, newBody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(Block newBody) {
		if (newBody != body) {
			NotificationChain msgs = null;
			if (body != null)
				msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__BODY, null, msgs);
			if (newBody != null)
				msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AstPackage.METHOD_DECLARATION__BODY, null, msgs);
			msgs = basicSetBody(newBody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AstPackage.METHOD_DECLARATION__BODY, newBody, newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AstPackage.METHOD_DECLARATION__JAVADOC:
				return basicSetJavadoc(null, msgs);
			case AstPackage.METHOD_DECLARATION__MODIFIERS:
				return ((InternalEList<?>)getModifiers()).basicRemove(otherEnd, msgs);
			case AstPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				return ((InternalEList<?>)getTypeParameters()).basicRemove(otherEnd, msgs);
			case AstPackage.METHOD_DECLARATION__RETURN_TYPE2:
				return basicSetReturnType2(null, msgs);
			case AstPackage.METHOD_DECLARATION__NAME:
				return basicSetName(null, msgs);
			case AstPackage.METHOD_DECLARATION__RECEIVER_TYPE:
				return basicSetReceiverType(null, msgs);
			case AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER:
				return basicSetReceiverQualifier(null, msgs);
			case AstPackage.METHOD_DECLARATION__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
			case AstPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS2:
				return ((InternalEList<?>)getExtraDimensions2()).basicRemove(otherEnd, msgs);
			case AstPackage.METHOD_DECLARATION__THROWN_EXCEPTION_TYPES:
				return ((InternalEList<?>)getThrownExceptionTypes()).basicRemove(otherEnd, msgs);
			case AstPackage.METHOD_DECLARATION__BODY:
				return basicSetBody(null, msgs);
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
			case AstPackage.METHOD_DECLARATION__JAVADOC:
				return getJavadoc();
			case AstPackage.METHOD_DECLARATION__MODIFIERS:
				return getModifiers();
			case AstPackage.METHOD_DECLARATION__CONSTRUCTOR:
				return isConstructor();
			case AstPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				return getTypeParameters();
			case AstPackage.METHOD_DECLARATION__RETURN_TYPE2:
				return getReturnType2();
			case AstPackage.METHOD_DECLARATION__NAME:
				return getName();
			case AstPackage.METHOD_DECLARATION__RECEIVER_TYPE:
				return getReceiverType();
			case AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER:
				return getReceiverQualifier();
			case AstPackage.METHOD_DECLARATION__PARAMETERS:
				return getParameters();
			case AstPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS2:
				return getExtraDimensions2();
			case AstPackage.METHOD_DECLARATION__THROWN_EXCEPTION_TYPES:
				return getThrownExceptionTypes();
			case AstPackage.METHOD_DECLARATION__BODY:
				return getBody();
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
			case AstPackage.METHOD_DECLARATION__JAVADOC:
				setJavadoc((Javadoc)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__MODIFIERS:
				getModifiers().clear();
				getModifiers().addAll((Collection<? extends IExtendedModifier>)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__CONSTRUCTOR:
				setConstructor((Boolean)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				getTypeParameters().addAll((Collection<? extends TypeParameter>)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__RETURN_TYPE2:
				setReturnType2((Type)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__NAME:
				setName((SimpleName)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__RECEIVER_TYPE:
				setReceiverType((Type)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER:
				setReceiverQualifier((SimpleName)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends SingleVariableDeclaration>)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS2:
				getExtraDimensions2().clear();
				getExtraDimensions2().addAll((Collection<? extends Dimension>)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__THROWN_EXCEPTION_TYPES:
				getThrownExceptionTypes().clear();
				getThrownExceptionTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case AstPackage.METHOD_DECLARATION__BODY:
				setBody((Block)newValue);
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
			case AstPackage.METHOD_DECLARATION__JAVADOC:
				setJavadoc((Javadoc)null);
				return;
			case AstPackage.METHOD_DECLARATION__MODIFIERS:
				getModifiers().clear();
				return;
			case AstPackage.METHOD_DECLARATION__CONSTRUCTOR:
				setConstructor(CONSTRUCTOR_EDEFAULT);
				return;
			case AstPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				getTypeParameters().clear();
				return;
			case AstPackage.METHOD_DECLARATION__RETURN_TYPE2:
				setReturnType2((Type)null);
				return;
			case AstPackage.METHOD_DECLARATION__NAME:
				setName((SimpleName)null);
				return;
			case AstPackage.METHOD_DECLARATION__RECEIVER_TYPE:
				setReceiverType((Type)null);
				return;
			case AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER:
				setReceiverQualifier((SimpleName)null);
				return;
			case AstPackage.METHOD_DECLARATION__PARAMETERS:
				getParameters().clear();
				return;
			case AstPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS2:
				getExtraDimensions2().clear();
				return;
			case AstPackage.METHOD_DECLARATION__THROWN_EXCEPTION_TYPES:
				getThrownExceptionTypes().clear();
				return;
			case AstPackage.METHOD_DECLARATION__BODY:
				setBody((Block)null);
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
			case AstPackage.METHOD_DECLARATION__JAVADOC:
				return javadoc != null;
			case AstPackage.METHOD_DECLARATION__MODIFIERS:
				return modifiers != null && !modifiers.isEmpty();
			case AstPackage.METHOD_DECLARATION__CONSTRUCTOR:
				return constructor != CONSTRUCTOR_EDEFAULT;
			case AstPackage.METHOD_DECLARATION__TYPE_PARAMETERS:
				return typeParameters != null && !typeParameters.isEmpty();
			case AstPackage.METHOD_DECLARATION__RETURN_TYPE2:
				return returnType2 != null;
			case AstPackage.METHOD_DECLARATION__NAME:
				return name != null;
			case AstPackage.METHOD_DECLARATION__RECEIVER_TYPE:
				return receiverType != null;
			case AstPackage.METHOD_DECLARATION__RECEIVER_QUALIFIER:
				return receiverQualifier != null;
			case AstPackage.METHOD_DECLARATION__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
			case AstPackage.METHOD_DECLARATION__EXTRA_DIMENSIONS2:
				return extraDimensions2 != null && !extraDimensions2.isEmpty();
			case AstPackage.METHOD_DECLARATION__THROWN_EXCEPTION_TYPES:
				return thrownExceptionTypes != null && !thrownExceptionTypes.isEmpty();
			case AstPackage.METHOD_DECLARATION__BODY:
				return body != null;
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
		result.append(" (constructor: ");
		result.append(constructor);
		result.append(')');
		return result.toString();
	}

} //MethodDeclarationImpl
