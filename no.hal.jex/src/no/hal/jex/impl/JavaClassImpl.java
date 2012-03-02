/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.Collection;

import no.hal.jex.ClassKind;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaPack;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.JavaClassImpl#getClassKind <em>Class Kind</em>}</li>
 *   <li>{@link no.hal.jex.impl.JavaClassImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link no.hal.jex.impl.JavaClassImpl#getPack <em>Pack</em>}</li>
 *   <li>{@link no.hal.jex.impl.JavaClassImpl#getSuperclasses <em>Superclasses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaClassImpl extends MemberImpl implements JavaClass {
	/**
	 * The default value of the '{@link #getClassKind() <em>Class Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassKind()
	 * @generated
	 * @ordered
	 */
	protected static final ClassKind CLASS_KIND_EDEFAULT = ClassKind.CLASS_KIND;

	/**
	 * The cached value of the '{@link #getClassKind() <em>Class Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassKind()
	 * @generated
	 * @ordered
	 */
	protected ClassKind classKind = CLASS_KIND_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembers()
	 * @generated
	 * @ordered
	 */
	protected EList<Member> members;

	/**
	 * The cached value of the '{@link #getSuperclasses() <em>Superclasses</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperclasses()
	 * @generated
	 * @ordered
	 */
	protected EList<String> superclasses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.JAVA_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassKind getClassKind() {
		return classKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassKind(ClassKind newClassKind) {
		ClassKind oldClassKind = classKind;
		classKind = newClassKind == null ? CLASS_KIND_EDEFAULT : newClassKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JAVA_CLASS__CLASS_KIND, oldClassKind, classKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSuperclasses() {
		if (superclasses == null) {
			superclasses = new EDataTypeUniqueEList<String>(String.class, this, JexPackage.JAVA_CLASS__SUPERCLASSES);
		}
		return superclasses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
		@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JexPackage.JAVA_CLASS__MEMBERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
			case JexPackage.JAVA_CLASS__PACK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetPack((JavaPack)otherEnd, msgs);
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
			case JexPackage.JAVA_CLASS__MEMBERS:
				return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
			case JexPackage.JAVA_CLASS__PACK:
				return basicSetPack(null, msgs);
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
			case JexPackage.JAVA_CLASS__PACK:
				return eInternalContainer().eInverseRemove(this, JexPackage.JAVA_PACK__CLASSES, JavaPack.class, msgs);
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
			case JexPackage.JAVA_CLASS__CLASS_KIND:
				return getClassKind();
			case JexPackage.JAVA_CLASS__MEMBERS:
				return getMembers();
			case JexPackage.JAVA_CLASS__PACK:
				return getPack();
			case JexPackage.JAVA_CLASS__SUPERCLASSES:
				return getSuperclasses();
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
			case JexPackage.JAVA_CLASS__CLASS_KIND:
				setClassKind((ClassKind)newValue);
				return;
			case JexPackage.JAVA_CLASS__MEMBERS:
				getMembers().clear();
				getMembers().addAll((Collection<? extends Member>)newValue);
				return;
			case JexPackage.JAVA_CLASS__PACK:
				setPack((JavaPack)newValue);
				return;
			case JexPackage.JAVA_CLASS__SUPERCLASSES:
				getSuperclasses().clear();
				getSuperclasses().addAll((Collection<? extends String>)newValue);
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
			case JexPackage.JAVA_CLASS__CLASS_KIND:
				setClassKind(CLASS_KIND_EDEFAULT);
				return;
			case JexPackage.JAVA_CLASS__MEMBERS:
				getMembers().clear();
				return;
			case JexPackage.JAVA_CLASS__PACK:
				setPack((JavaPack)null);
				return;
			case JexPackage.JAVA_CLASS__SUPERCLASSES:
				getSuperclasses().clear();
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
			case JexPackage.JAVA_CLASS__CLASS_KIND:
				return classKind != CLASS_KIND_EDEFAULT;
			case JexPackage.JAVA_CLASS__MEMBERS:
				return members != null && !members.isEmpty();
			case JexPackage.JAVA_CLASS__PACK:
				return getPack() != null;
			case JexPackage.JAVA_CLASS__SUPERCLASSES:
				return superclasses != null && !superclasses.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Member> getMembers() {
		if (members == null) {
			members = new EObjectContainmentWithInverseEList<Member>(Member.class, this, JexPackage.JAVA_CLASS__MEMBERS, JexPackage.MEMBER__OWNER);
		}
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaPack getPack() {
		if (eContainerFeatureID() != JexPackage.JAVA_CLASS__PACK) return null;
		return (JavaPack)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPack(JavaPack newPack, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newPack, JexPackage.JAVA_CLASS__PACK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPack(JavaPack newPack) {
		if (newPack != eInternalContainer() || (eContainerFeatureID() != JexPackage.JAVA_CLASS__PACK && newPack != null)) {
			if (EcoreUtil.isAncestor(this, newPack))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPack != null)
				msgs = ((InternalEObject)newPack).eInverseAdd(this, JexPackage.JAVA_PACK__CLASSES, JavaPack.class, msgs);
			msgs = basicSetPack(newPack, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JAVA_CLASS__PACK, newPack, newPack));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public String toString() {
		if (eIsProxy()) return super.toString();

		JavaPack pack = getPack();
		String kind = "class";
		if (getClassKind() == ClassKind.INTERFACE_KIND) {
			kind = "interface";
		} else if (getClassKind() == ClassKind.ENUM_KIND) {
			kind = "enum";
		}
		return toString(kind + " " + super.toString() + (pack != null ? " in " + pack : ""));
	}

	public boolean overrides(Member other) {
		return (other instanceof JavaClass) && super.overrides(other);
	}
} //JavaClassImpl
