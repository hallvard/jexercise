/**
 */
package no.hal.emfs.impl;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import no.hal.emfs.AbstractURLContentProvider;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Abstract URL Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.AbstractURLContentProviderImpl#getFile <em>File</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class AbstractURLContentProviderImpl extends MinimalEObjectImpl.Container implements AbstractURLContentProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractURLContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.ABSTRACT_URL_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFile getFile() {
		if (eContainerFeatureID() != EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE) return null;
		return (EmfsFile)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(EmfsFile newFile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFile, EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(EmfsFile newFile) {
		if (newFile != eInternalContainer() || (eContainerFeatureID() != EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE && newFile != null)) {
			if (EcoreUtil.isAncestor(this, newFile))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFile != null)
				msgs = ((InternalEObject)newFile).eInverseAdd(this, EmfsPackage.EMFS_FILE__CONTENT_PROVIDER, EmfsFile.class, msgs);
			msgs = basicSetFile(newFile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlString() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	private URL getURL() throws Exception {
		try {
			String urlString = getUrlString();
			return new URL(urlString);
		} catch (MalformedURLException mue) {
			throw new IOException(mue);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputStream getInputStream(int options) {
		URL url = null;
		try {
			url = getURL();
			return url.openStream();
		} catch (Exception e) {
			throw new RuntimeException("Couldn't open InputStream for " + url + ": " + e, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputStream getOutputStream(int options) {
		URL url = null;
		try {
			url = getURL();
			return url.openConnection().getOutputStream();
		} catch (Exception e) {
			throw new RuntimeException("Couldn't open OutputStream for " + url + ": " + e, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFile((EmfsFile)otherEnd, msgs);
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
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE:
				return basicSetFile(null, msgs);
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
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE:
				return eInternalContainer().eInverseRemove(this, EmfsPackage.EMFS_FILE__CONTENT_PROVIDER, EmfsFile.class, msgs);
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
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE:
				return getFile();
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
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE:
				setFile((EmfsFile)newValue);
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
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE:
				setFile((EmfsFile)null);
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
			case EmfsPackage.ABSTRACT_URL_CONTENT_PROVIDER__FILE:
				return getFile() != null;
		}
		return super.eIsSet(featureID);
	}

} //AbstractURLContentProviderImpl
