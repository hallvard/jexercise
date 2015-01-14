/**
 */
package no.hal.emfs.impl;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FilterInputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import no.hal.emfs.CachingContentProvider;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsFileContentProvider;
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
 * An implementation of the model object '<em><b>Caching Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.emfs.impl.CachingContentProviderImpl#getFile <em>File</em>}</li>
 *   <li>{@link no.hal.emfs.impl.CachingContentProviderImpl#getContentProvider <em>Content Provider</em>}</li>
 *   <li>{@link no.hal.emfs.impl.CachingContentProviderImpl#getCache <em>Cache</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CachingContentProviderImpl extends MinimalEObjectImpl.Container implements CachingContentProvider {
	/**
	 * The cached value of the '{@link #getContentProvider() <em>Content Provider</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContentProvider()
	 * @generated
	 * @ordered
	 */
	protected EmfsFileContentProvider contentProvider;

	/**
	 * The default value of the '{@link #getCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] CACHE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCache() <em>Cache</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCache()
	 * @generated
	 * @ordered
	 */
	protected byte[] cache = CACHE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachingContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.CACHING_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFile getFile() {
		if (eContainerFeatureID() != EmfsPackage.CACHING_CONTENT_PROVIDER__FILE) return null;
		return (EmfsFile)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(EmfsFile newFile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFile, EmfsPackage.CACHING_CONTENT_PROVIDER__FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(EmfsFile newFile) {
		if (newFile != eInternalContainer() || (eContainerFeatureID() != EmfsPackage.CACHING_CONTENT_PROVIDER__FILE && newFile != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.CACHING_CONTENT_PROVIDER__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFileContentProvider getContentProvider() {
		return contentProvider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContentProvider(EmfsFileContentProvider newContentProvider, NotificationChain msgs) {
		EmfsFileContentProvider oldContentProvider = contentProvider;
		contentProvider = newContentProvider;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER, oldContentProvider, newContentProvider);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContentProvider(EmfsFileContentProvider newContentProvider) {
		if (newContentProvider != contentProvider) {
			NotificationChain msgs = null;
			if (contentProvider != null)
				msgs = ((InternalEObject)contentProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER, null, msgs);
			if (newContentProvider != null)
				msgs = ((InternalEObject)newContentProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER, null, msgs);
			msgs = basicSetContentProvider(newContentProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER, newContentProvider, newContentProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getCache() {
		return cache;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCache(byte[] newCache) {
		byte[] oldCache = cache;
		cache = newCache;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.CACHING_CONTENT_PROVIDER__CACHE, oldCache, cache));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputStream getInputStream(int options) {
		if (cache != null) {
			return new ByteArrayInputStream(cache);
		}
		return new FilterInputStream(getContentProvider().getInputStream(options)) {
			
			private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			
			@Override
			public int read() throws IOException {
				int b = super.read();
				outputStream.write(b);
				return b;
			}
			
			@Override
			public int read(byte[] bytes, int off, int len) throws IOException {
				len = super.read(bytes, off, len);
				outputStream.write(bytes, off, len);
				return len;
			}
			
			@Override
			public void close() throws IOException {
				cache = outputStream.toByteArray();
				super.close();
			}
		};
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputStream getOutputStream(int options) {
		return new FilterOutputStream(getContentProvider().getOutputStream(options)) {

			private ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			
			@Override
			public void write(int b) throws IOException {
				super.write(b);
				outputStream.write(b);
			}
	
			@Override
			public void write(byte[] bytes, int off, int len) throws IOException {
				super.write(bytes, off, len);
				outputStream.write(bytes, off, len);
			}
			
			@Override
			public void close() throws IOException {
				cache = outputStream.toByteArray();
				super.close();
			}
		};
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.CACHING_CONTENT_PROVIDER__FILE:
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
			case EmfsPackage.CACHING_CONTENT_PROVIDER__FILE:
				return basicSetFile(null, msgs);
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				return basicSetContentProvider(null, msgs);
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
			case EmfsPackage.CACHING_CONTENT_PROVIDER__FILE:
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
			case EmfsPackage.CACHING_CONTENT_PROVIDER__FILE:
				return getFile();
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				return getContentProvider();
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CACHE:
				return getCache();
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
			case EmfsPackage.CACHING_CONTENT_PROVIDER__FILE:
				setFile((EmfsFile)newValue);
				return;
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				setContentProvider((EmfsFileContentProvider)newValue);
				return;
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CACHE:
				setCache((byte[])newValue);
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
			case EmfsPackage.CACHING_CONTENT_PROVIDER__FILE:
				setFile((EmfsFile)null);
				return;
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				setContentProvider((EmfsFileContentProvider)null);
				return;
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CACHE:
				setCache(CACHE_EDEFAULT);
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
			case EmfsPackage.CACHING_CONTENT_PROVIDER__FILE:
				return getFile() != null;
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				return contentProvider != null;
			case EmfsPackage.CACHING_CONTENT_PROVIDER__CACHE:
				return CACHE_EDEFAULT == null ? cache != null : !CACHE_EDEFAULT.equals(cache);
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
		result.append(" (cache: ");
		result.append(cache);
		result.append(')');
		return result.toString();
	}

} //CachingContentProviderImpl
