/**
 */
package no.hal.emfs.impl;

import no.hal.emfs.ClasspathEntry;
import no.hal.emfs.ClasspathEntryKind;
import no.hal.emfs.EmfsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Classpath Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.emfs.impl.ClasspathEntryImpl#getExplicitKind <em>Explicit Kind</em>}</li>
 *   <li>{@link no.hal.emfs.impl.ClasspathEntryImpl#getExplicitPath <em>Explicit Path</em>}</li>
 *   <li>{@link no.hal.emfs.impl.ClasspathEntryImpl#getMajor <em>Major</em>}</li>
 *   <li>{@link no.hal.emfs.impl.ClasspathEntryImpl#getMinor <em>Minor</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClasspathEntryImpl extends AbstractClasspathEntryImpl implements ClasspathEntry {
	/**
	 * The default value of the '{@link #getExplicitKind() <em>Explicit Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitKind()
	 * @generated
	 * @ordered
	 */
	protected static final ClasspathEntryKind EXPLICIT_KIND_EDEFAULT = ClasspathEntryKind.SRC;

	/**
	 * The cached value of the '{@link #getExplicitKind() <em>Explicit Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitKind()
	 * @generated
	 * @ordered
	 */
	protected ClasspathEntryKind explicitKind = EXPLICIT_KIND_EDEFAULT;

	/**
	 * The default value of the '{@link #getExplicitPath() <em>Explicit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitPath()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPLICIT_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExplicitPath() <em>Explicit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExplicitPath()
	 * @generated
	 * @ordered
	 */
	protected String explicitPath = EXPLICIT_PATH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected static final int MAJOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMajor() <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajor()
	 * @generated
	 * @ordered
	 */
	protected int major = MAJOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected static final int MINOR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinor() <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinor()
	 * @generated
	 * @ordered
	 */
	protected int minor = MINOR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClasspathEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.CLASSPATH_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClasspathEntryKind getExplicitKind() {
		return explicitKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitKind(ClasspathEntryKind newExplicitKind) {
		ClasspathEntryKind oldExplicitKind = explicitKind;
		explicitKind = newExplicitKind == null ? EXPLICIT_KIND_EDEFAULT : newExplicitKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_KIND, oldExplicitKind, explicitKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExplicitPath() {
		return explicitPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExplicitPath(String newExplicitPath) {
		String oldExplicitPath = explicitPath;
		explicitPath = newExplicitPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_PATH, oldExplicitPath, explicitPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMajor() {
		return major;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajor(int newMajor) {
		int oldMajor = major;
		major = newMajor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.CLASSPATH_ENTRY__MAJOR, oldMajor, major));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinor() {
		return minor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinor(int newMinor) {
		int oldMinor = minor;
		minor = newMinor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.CLASSPATH_ENTRY__MINOR, oldMinor, minor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_KIND:
				return getExplicitKind();
			case EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_PATH:
				return getExplicitPath();
			case EmfsPackage.CLASSPATH_ENTRY__MAJOR:
				return getMajor();
			case EmfsPackage.CLASSPATH_ENTRY__MINOR:
				return getMinor();
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
			case EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_KIND:
				setExplicitKind((ClasspathEntryKind)newValue);
				return;
			case EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_PATH:
				setExplicitPath((String)newValue);
				return;
			case EmfsPackage.CLASSPATH_ENTRY__MAJOR:
				setMajor((Integer)newValue);
				return;
			case EmfsPackage.CLASSPATH_ENTRY__MINOR:
				setMinor((Integer)newValue);
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
			case EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_KIND:
				setExplicitKind(EXPLICIT_KIND_EDEFAULT);
				return;
			case EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_PATH:
				setExplicitPath(EXPLICIT_PATH_EDEFAULT);
				return;
			case EmfsPackage.CLASSPATH_ENTRY__MAJOR:
				setMajor(MAJOR_EDEFAULT);
				return;
			case EmfsPackage.CLASSPATH_ENTRY__MINOR:
				setMinor(MINOR_EDEFAULT);
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
			case EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_KIND:
				return explicitKind != EXPLICIT_KIND_EDEFAULT;
			case EmfsPackage.CLASSPATH_ENTRY__EXPLICIT_PATH:
				return EXPLICIT_PATH_EDEFAULT == null ? explicitPath != null : !EXPLICIT_PATH_EDEFAULT.equals(explicitPath);
			case EmfsPackage.CLASSPATH_ENTRY__MAJOR:
				return major != MAJOR_EDEFAULT;
			case EmfsPackage.CLASSPATH_ENTRY__MINOR:
				return minor != MINOR_EDEFAULT;
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
		result.append(" (explicitKind: ");
		result.append(explicitKind);
		result.append(", explicitPath: ");
		result.append(explicitPath);
		result.append(", major: ");
		result.append(major);
		result.append(", minor: ");
		result.append(minor);
		result.append(')');
		return result.toString();
	}

	//
	
	@Override
	public ClasspathEntryKind getKind() {
		return getExplicitKind();
	}
	
	@Override
	public String getPath() {
		return getExplicitPath();
	}
	
} //ClasspathEntryImpl
