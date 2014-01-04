/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import no.hal.jex.JavaClass;
import no.hal.jex.JavaPack;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.MemberImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.jex.impl.MemberImpl#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link no.hal.jex.impl.MemberImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link no.hal.jex.impl.MemberImpl#getRequired <em>Required</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MemberImpl extends JavaElementImpl implements Member {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected static final int MODIFIERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getModifiers() <em>Modifiers</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifiers()
	 * @generated
	 * @ordered
	 */
	protected int modifiers = MODIFIERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean REQUIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected Boolean required = REQUIRED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MemberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.MEMBER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.MEMBER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getModifiers() {
		return modifiers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifiers(int newModifiers) {
		int oldModifiers = modifiers;
		modifiers = newModifiers;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.MEMBER__MODIFIERS, oldModifiers, modifiers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaClass getOwner() {
		if (eContainerFeatureID() != JexPackage.MEMBER__OWNER) return null;
		return (JavaClass)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(JavaClass newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, JexPackage.MEMBER__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(JavaClass newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != JexPackage.MEMBER__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, JexPackage.JAVA_CLASS__MEMBERS, JavaClass.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.MEMBER__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getRequired() {
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequired(Boolean newRequired) {
		Boolean oldRequired = required;
		required = newRequired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.MEMBER__REQUIRED, oldRequired, required));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JexPackage.MEMBER__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((JavaClass)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JexPackage.MEMBER__OWNER:
				return basicSetOwner(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JexPackage.MEMBER__OWNER:
				return eInternalContainer().eInverseRemove(this, JexPackage.JAVA_CLASS__MEMBERS, JavaClass.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JexPackage.MEMBER__NAME:
				return getName();
			case JexPackage.MEMBER__MODIFIERS:
				return getModifiers();
			case JexPackage.MEMBER__OWNER:
				return getOwner();
			case JexPackage.MEMBER__REQUIRED:
				return getRequired();
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
			case JexPackage.MEMBER__NAME:
				setName((String)newValue);
				return;
			case JexPackage.MEMBER__MODIFIERS:
				setModifiers((Integer)newValue);
				return;
			case JexPackage.MEMBER__OWNER:
				setOwner((JavaClass)newValue);
				return;
			case JexPackage.MEMBER__REQUIRED:
				setRequired((Boolean)newValue);
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
			case JexPackage.MEMBER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JexPackage.MEMBER__MODIFIERS:
				setModifiers(MODIFIERS_EDEFAULT);
				return;
			case JexPackage.MEMBER__OWNER:
				setOwner((JavaClass)null);
				return;
			case JexPackage.MEMBER__REQUIRED:
				setRequired(REQUIRED_EDEFAULT);
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
			case JexPackage.MEMBER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JexPackage.MEMBER__MODIFIERS:
				return modifiers != MODIFIERS_EDEFAULT;
			case JexPackage.MEMBER__OWNER:
				return getOwner() != null;
			case JexPackage.MEMBER__REQUIRED:
				return REQUIRED_EDEFAULT == null ? required != null : !REQUIRED_EDEFAULT.equals(required);
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

		JavaClass parent = getOwner();
		return getName() + (parent != null ? " in " + parent : "");
	}

	protected String toString(String s) {
		String modifiers = getModifierString(getModifiers());
		if (modifiers != null && modifiers.length() > 0) {
			s = modifiers + " " + s;
		}
		if (getRequired() == Boolean.FALSE) {
			s = "No " + s;
		}
		return s;
	}

	public static String getModifierString(int modifiers) {
		return EcoreUtil.convertToString(JexPackage.eINSTANCE.getModifiers(), new Integer(modifiers));
	}

	// this method is used for testing if a member already exists in the members list
	public boolean overrides(Member other) {
		return getSimpleName().equals(other.getSimpleName());
	}

	// Support methods

	public static String getSimpleName(String name) {
		if (name == null) {
			return "";
		}
		int pos = name.lastIndexOf('.');
		if (pos >= 0) {
			name = name.substring(pos + 1);
		}
		return name;
	}

	public static String getNamePrefix(String name) {
		int pos = name.lastIndexOf('.');
		if (pos >= 0) {
			name = name.substring(0, pos);
		}
		return name;
	}

	public String getSimpleName() {
		return getSimpleName(getName());
	}
	
	public String getFullName() {
		JavaClass javaClass = (this instanceof JavaClass ? (JavaClass) this : getOwner());
		JavaPack pack = (javaClass != null ? javaClass.getPack() : null);
		String packageName = (pack != null ? pack.getName() : null);
		String className = (packageName != null && packageName.length() > 0 ? packageName + "." : "") + javaClass.getName();
		return (javaClass == null ? getName() : (javaClass == this ? className : className + "." + getName()));
	}
	
	public String getNamePrefix() {
		return getNamePrefix(getFullName());
	}
} //MemberImpl

