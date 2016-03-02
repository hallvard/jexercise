/**
 */
package no.hal.emfs.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;

import no.hal.emfs.EmfResourceStringContents;
import no.hal.emfs.EmfsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Emf Resource String Contents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.EmfResourceStringContentsImpl#getEObject <em>EObject</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfResourceStringContentsImpl#getFactory <em>Factory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EmfResourceStringContentsImpl extends AbstractStringContentProviderImpl implements EmfResourceStringContents {
	/**
	 * The cached value of the '{@link #getEObject() <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEObject()
	 * @generated
	 * @ordered
	 */
	protected EObject eObject;

	/**
	 * The default value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected static final String FACTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFactory() <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFactory()
	 * @generated
	 * @ordered
	 */
	protected String factory = FACTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfResourceStringContentsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.EMF_RESOURCE_STRING_CONTENTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject getEObject() {
		if (eObject != null && eObject.eIsProxy()) {
			InternalEObject oldEObject = (InternalEObject)eObject;
			eObject = eResolveProxy(oldEObject);
			if (eObject != oldEObject) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__EOBJECT, oldEObject, eObject));
			}
		}
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EObject basicGetEObject() {
		return eObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEObject(EObject newEObject) {
		EObject oldEObject = eObject;
		eObject = newEObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__EOBJECT, oldEObject, eObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFactory() {
		return factory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFactory(String newFactory) {
		String oldFactory = factory;
		factory = newFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__FACTORY, oldFactory, factory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__EOBJECT:
				if (resolve) return getEObject();
				return basicGetEObject();
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__FACTORY:
				return getFactory();
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
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__EOBJECT:
				setEObject((EObject)newValue);
				return;
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__FACTORY:
				setFactory((String)newValue);
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
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__EOBJECT:
				setEObject((EObject)null);
				return;
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__FACTORY:
				setFactory(FACTORY_EDEFAULT);
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
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__EOBJECT:
				return eObject != null;
			case EmfsPackage.EMF_RESOURCE_STRING_CONTENTS__FACTORY:
				return FACTORY_EDEFAULT == null ? factory != null : !FACTORY_EDEFAULT.equals(factory);
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
		result.append(" (factory: ");
		result.append(factory);
		result.append(')');
		return result.toString();
	}
	
	//
	
	@Override
	public String getStringContent() {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		try {
			Resource resource = getEObject().eResource();
			Resource.Factory factory = Resource.Factory.Registry.INSTANCE.getFactory(URI.createURI(getFactory()));
			if (factory != null) {
				Resource altResource = factory.createResource(resource.getURI());
				if (altResource.getClass() != resource.getClass()) {
					altResource.getContents().addAll(EcoreUtil.copyAll(resource.getContents()));
					resource = altResource;
				}
			}
			resource.save(output, null);
			output.close();
		} catch (IOException e) {
		} finally {
		}
		return new String(output.toByteArray());
	}

} //EmfResourceStringContentsImpl
