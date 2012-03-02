/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.impl;

import java.util.Collection;

import no.hal.jex.JavaClass;
import no.hal.jex.JavaPack;
import no.hal.jex.JexPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pack</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.jex.impl.JavaPackImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.jex.impl.JavaPackImpl#getClasses <em>Classes</em>}</li>
 *   <li>{@link no.hal.jex.impl.JavaPackImpl#getSourceLocation <em>Source Location</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaPackImpl extends JavaElementImpl implements JavaPack {
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
	 * The cached value of the '{@link #getClasses() <em>Classes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClasses()
	 * @generated
	 * @ordered
	 */
	protected EList<JavaClass> classes;

	/**
	 * The default value of the '{@link #getSourceLocation() <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLocation()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LOCATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLocation() <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLocation()
	 * @generated
	 * @ordered
	 */
	protected String sourceLocation = SOURCE_LOCATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaPackImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JexPackage.Literals.JAVA_PACK;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JAVA_PACK__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	public EList<JavaClass> getClasses() {
		if (classes == null) {
			classes = new EObjectContainmentWithInverseEList.Resolving<JavaClass>(JavaClass.class, this, JexPackage.JAVA_PACK__CLASSES, JexPackage.JAVA_CLASS__PACK);
		}
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLocation() {
		return sourceLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLocation(String newSourceLocation) {
		String oldSourceLocation = sourceLocation;
		sourceLocation = newSourceLocation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JexPackage.JAVA_PACK__SOURCE_LOCATION, oldSourceLocation, sourceLocation));
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
			case JexPackage.JAVA_PACK__CLASSES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getClasses()).basicAdd(otherEnd, msgs);
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
			case JexPackage.JAVA_PACK__CLASSES:
				return ((InternalEList<?>)getClasses()).basicRemove(otherEnd, msgs);
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
			case JexPackage.JAVA_PACK__NAME:
				return getName();
			case JexPackage.JAVA_PACK__CLASSES:
				return getClasses();
			case JexPackage.JAVA_PACK__SOURCE_LOCATION:
				return getSourceLocation();
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
			case JexPackage.JAVA_PACK__NAME:
				setName((String)newValue);
				return;
			case JexPackage.JAVA_PACK__CLASSES:
				getClasses().clear();
				getClasses().addAll((Collection<? extends JavaClass>)newValue);
				return;
			case JexPackage.JAVA_PACK__SOURCE_LOCATION:
				setSourceLocation((String)newValue);
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
			case JexPackage.JAVA_PACK__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JexPackage.JAVA_PACK__CLASSES:
				getClasses().clear();
				return;
			case JexPackage.JAVA_PACK__SOURCE_LOCATION:
				setSourceLocation(SOURCE_LOCATION_EDEFAULT);
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
			case JexPackage.JAVA_PACK__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JexPackage.JAVA_PACK__CLASSES:
				return classes != null && !classes.isEmpty();
			case JexPackage.JAVA_PACK__SOURCE_LOCATION:
				return SOURCE_LOCATION_EDEFAULT == null ? sourceLocation != null : !SOURCE_LOCATION_EDEFAULT.equals(sourceLocation);
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

		return "package " + getName();
		/*
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", sourceLocation: ");
		result.append(sourceLocation);
		result.append(')');
		return result.toString();
		*/
	}

} //JavaPackImpl
