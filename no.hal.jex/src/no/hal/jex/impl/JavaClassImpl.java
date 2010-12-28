/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import no.hal.jex.ClassKind;
import no.hal.jex.JavaClass;
import no.hal.jex.JavaPack;
import no.hal.jex.JexPackage;
import no.hal.jex.Member;

import org.eclipse.core.runtime.Path;
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
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IParent;
import org.eclipse.jdt.core.ISourceReference;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

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
	
	public void initFrom(IMember member) throws JavaModelException {
		if (! (member instanceof IType)) {
			throw new IllegalArgumentException("Cannot init JavaClass from " + member);
		}
		super.initFrom(member);
		IType type = (IType)member;
		ClassKind kind = ClassKind.CLASS_KIND;
		if (type.isInterface()) {
			kind = ClassKind.INTERFACE_KIND;
		} else if (type.isEnum()) {
			kind = ClassKind.ENUM_KIND;
		}
		setClassKind(kind);
		String superclassName = type.getSuperclassName();
		if (superclassName != null && (! "Object".equals(superclassName))) {
			getSuperclasses().add(superclassName);
		}
		getSuperclasses().addAll(Arrays.asList(type.getSuperInterfaceNames()));
	}
	
	//

	public static List<IMember> findJavaMembers(IParent parent, String name, int type, Class<? extends IMember> c) {
		IJavaElement[] members = null;
		try {
			members = parent.getChildren();
		} catch (JavaModelException e) {
			return null;
		}
		if (name != null) {
			int pos = name.lastIndexOf('.');
			if (pos >= 0) {
				name = name.substring(pos + 1);
			}
		}
		List<IMember> result = new ArrayList<IMember>();
		for (int i = 0; i < members.length; i++) {
			IMember member = null;
			if (members[i] instanceof ICompilationUnit) {
				member = ((ICompilationUnit)members[i]).findPrimaryType();
			} else if (members[i] instanceof IMember) {
				member = (IMember)members[i];
			}
			if (member == null) {
				continue;
			}
			if (c != null && (! c.isInstance(member))) {
				continue;
			}
			if (type == member.getElementType() && (name == null || name.equals(member.getElementName()))) {
				result.add(member);
			}
		}
		return result;
	}
	public static IMember findJavaMember(IJavaElement javaClass, String name, int type, Class<? extends IMember> c) {
		if (javaClass instanceof ISourceReference && javaClass instanceof IParent) {
			List<IMember> members = findJavaMembers((IParent)javaClass, name, type, c);
			return (members != null && members.size() > 0 ? (IMember)members.get(0) : null);
		}
		return null;
	}

	// Support methods
	
	public Boolean validateSuperclasses(IType type) {
		outer: for (String superClass: getSuperclasses()) {
			try {
				if (superClass.equals(type.getSuperclassName())) {
					continue;
				}
				String[] interfaceNames = type.getSuperInterfaceNames();
				for (int j = 0; j < interfaceNames.length; j++) {
					if (superClass.equals(interfaceNames[j])) {
						continue outer;
					}
				}
				return Boolean.FALSE;
			} catch (JavaModelException e) {
				return null;
			}
		}
		return Boolean.TRUE;
	}
	
	public static IType findJavaClassCoreElement(IJavaProject project, String name) {
		String ext = ".java";
		int pos = name.lastIndexOf('.');
		if (pos >= 0 && Character.isLowerCase(name.charAt(pos + 1))) {
			ext = name.substring(pos);
			name = name.substring(0, pos);
		}
		String sourcePathName = name.replace('.', Path.SEPARATOR) + ext;
		try {
			IJavaElement sourceElement = project.findElement(new Path(sourcePathName));
			if (sourceElement != null) {
				return (IType)findJavaMember(sourceElement, getSimpleName(name), IJavaElement.TYPE, IType.class);
			}
		} catch (JavaModelException e) {
		}
		return null;
	}
	
	public IJavaElement findJavaCoreElement(IJavaProject project) {
		return findJavaClassCoreElement(project, getFullName());
	}
} //JavaClassImpl
