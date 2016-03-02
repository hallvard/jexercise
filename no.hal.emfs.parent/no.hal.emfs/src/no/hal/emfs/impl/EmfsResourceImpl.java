/**
 */
package no.hal.emfs.impl;

import java.util.Collection;
import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.Property;
import no.hal.emfs.PropertyOwner;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.EmfsResourceImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfsResourceImpl#isWriteable <em>Writeable</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfsResourceImpl#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfsResourceImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfsResourceImpl#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfsResourceImpl#getContainerPath <em>Container Path</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfsResourceImpl#getFullName <em>Full Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfsResourceImpl extends TagsOwnerImpl implements EmfsResource {
	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> properties;

	/**
	 * The default value of the '{@link #isWriteable() <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WRITEABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWriteable() <em>Writeable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWriteable()
	 * @generated
	 * @ordered
	 */
	protected boolean writeable = WRITEABLE_EDEFAULT;

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
	 * The default value of the '{@link #getFullPath() <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getContainerPath() <em>Container Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainerPath()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTAINER_PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getFullName() <em>Full Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullName()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfsResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.EMFS_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, EmfsPackage.EMFS_RESOURCE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWriteable() {
		return writeable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWriteable(boolean newWriteable) {
		boolean oldWriteable = writeable;
		writeable = newWriteable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.EMFS_RESOURCE__WRITEABLE, oldWriteable, writeable));
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.EMFS_RESOURCE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsContainer getContainer() {
		if (eContainerFeatureID() != EmfsPackage.EMFS_RESOURCE__CONTAINER) return null;
		return (EmfsContainer)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContainer(EmfsContainer newContainer, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newContainer, EmfsPackage.EMFS_RESOURCE__CONTAINER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContainer(EmfsContainer newContainer) {
		if (newContainer != eInternalContainer() || (eContainerFeatureID() != EmfsPackage.EMFS_RESOURCE__CONTAINER && newContainer != null)) {
			if (EcoreUtil.isAncestor(this, newContainer))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newContainer != null)
				msgs = ((InternalEObject)newContainer).eInverseAdd(this, EmfsPackage.EMFS_CONTAINER__RESOURCES, EmfsContainer.class, msgs);
			msgs = basicSetContainer(newContainer, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.EMFS_RESOURCE__CONTAINER, newContainer, newContainer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFullPath() {
		return no.hal.emfs.util.EmfsResourceImpl.getFullString(this, "/", "/", null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getContainerPath() {
		return no.hal.emfs.util.EmfsResourceImpl.getFullString(getContainer(), "/", "/", null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getFullName() {
		return no.hal.emfs.util.EmfsResourceImpl.getFullString(this, null, ".", null);
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
			case EmfsPackage.EMFS_RESOURCE__CONTAINER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetContainer((EmfsContainer)otherEnd, msgs);
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
			case EmfsPackage.EMFS_RESOURCE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case EmfsPackage.EMFS_RESOURCE__CONTAINER:
				return basicSetContainer(null, msgs);
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
			case EmfsPackage.EMFS_RESOURCE__CONTAINER:
				return eInternalContainer().eInverseRemove(this, EmfsPackage.EMFS_CONTAINER__RESOURCES, EmfsContainer.class, msgs);
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
			case EmfsPackage.EMFS_RESOURCE__PROPERTIES:
				return getProperties();
			case EmfsPackage.EMFS_RESOURCE__WRITEABLE:
				return isWriteable();
			case EmfsPackage.EMFS_RESOURCE__NAME:
				return getName();
			case EmfsPackage.EMFS_RESOURCE__CONTAINER:
				return getContainer();
			case EmfsPackage.EMFS_RESOURCE__FULL_PATH:
				return getFullPath();
			case EmfsPackage.EMFS_RESOURCE__CONTAINER_PATH:
				return getContainerPath();
			case EmfsPackage.EMFS_RESOURCE__FULL_NAME:
				return getFullName();
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
			case EmfsPackage.EMFS_RESOURCE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case EmfsPackage.EMFS_RESOURCE__WRITEABLE:
				setWriteable((Boolean)newValue);
				return;
			case EmfsPackage.EMFS_RESOURCE__NAME:
				setName((String)newValue);
				return;
			case EmfsPackage.EMFS_RESOURCE__CONTAINER:
				setContainer((EmfsContainer)newValue);
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
			case EmfsPackage.EMFS_RESOURCE__PROPERTIES:
				getProperties().clear();
				return;
			case EmfsPackage.EMFS_RESOURCE__WRITEABLE:
				setWriteable(WRITEABLE_EDEFAULT);
				return;
			case EmfsPackage.EMFS_RESOURCE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case EmfsPackage.EMFS_RESOURCE__CONTAINER:
				setContainer((EmfsContainer)null);
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
			case EmfsPackage.EMFS_RESOURCE__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case EmfsPackage.EMFS_RESOURCE__WRITEABLE:
				return writeable != WRITEABLE_EDEFAULT;
			case EmfsPackage.EMFS_RESOURCE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case EmfsPackage.EMFS_RESOURCE__CONTAINER:
				return getContainer() != null;
			case EmfsPackage.EMFS_RESOURCE__FULL_PATH:
				return FULL_PATH_EDEFAULT == null ? getFullPath() != null : !FULL_PATH_EDEFAULT.equals(getFullPath());
			case EmfsPackage.EMFS_RESOURCE__CONTAINER_PATH:
				return CONTAINER_PATH_EDEFAULT == null ? getContainerPath() != null : !CONTAINER_PATH_EDEFAULT.equals(getContainerPath());
			case EmfsPackage.EMFS_RESOURCE__FULL_NAME:
				return FULL_NAME_EDEFAULT == null ? getFullName() != null : !FULL_NAME_EDEFAULT.equals(getFullName());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == PropertyOwner.class) {
			switch (derivedFeatureID) {
				case EmfsPackage.EMFS_RESOURCE__PROPERTIES: return EmfsPackage.PROPERTY_OWNER__PROPERTIES;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == PropertyOwner.class) {
			switch (baseFeatureID) {
				case EmfsPackage.PROPERTY_OWNER__PROPERTIES: return EmfsPackage.EMFS_RESOURCE__PROPERTIES;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (writeable: ");
		result.append(writeable);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EmfsResourceImpl
