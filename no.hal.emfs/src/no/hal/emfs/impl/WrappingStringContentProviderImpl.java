/**
 */
package no.hal.emfs.impl;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import no.hal.emfs.AbstractStringContentProvider;
import no.hal.emfs.AbstractStringContents;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsFileContentProvider;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.WrappingStringContentProvider;
import no.hal.emfs.util.Util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delegating String Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.emfs.impl.WrappingStringContentProviderImpl#getFile <em>File</em>}</li>
 *   <li>{@link no.hal.emfs.impl.WrappingStringContentProviderImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link no.hal.emfs.impl.WrappingStringContentProviderImpl#getContentProvider <em>Content Provider</em>}</li>
 *   <li>{@link no.hal.emfs.impl.WrappingStringContentProviderImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WrappingStringContentProviderImpl extends MinimalEObjectImpl.Container implements WrappingStringContentProvider {
	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected AbstractStringContents prefix;

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
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected AbstractStringContents suffix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WrappingStringContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.WRAPPING_STRING_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFile getFile() {
		if (eContainerFeatureID() != EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE) return null;
		return (EmfsFile)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(EmfsFile newFile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFile, EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(EmfsFile newFile) {
		if (newFile != eInternalContainer() || (eContainerFeatureID() != EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE && newFile != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE, newFile, newFile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringContents getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrefix(AbstractStringContents newPrefix, NotificationChain msgs) {
		AbstractStringContents oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX, oldPrefix, newPrefix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrefix(AbstractStringContents newPrefix) {
		if (newPrefix != prefix) {
			NotificationChain msgs = null;
			if (prefix != null)
				msgs = ((InternalEObject)prefix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX, null, msgs);
			if (newPrefix != null)
				msgs = ((InternalEObject)newPrefix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX, null, msgs);
			msgs = basicSetPrefix(newPrefix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX, newPrefix, newPrefix));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER, oldContentProvider, newContentProvider);
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
				msgs = ((InternalEObject)contentProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER, null, msgs);
			if (newContentProvider != null)
				msgs = ((InternalEObject)newContentProvider).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER, null, msgs);
			msgs = basicSetContentProvider(newContentProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER, newContentProvider, newContentProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractStringContents getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSuffix(AbstractStringContents newSuffix, NotificationChain msgs) {
		AbstractStringContents oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX, oldSuffix, newSuffix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuffix(AbstractStringContents newSuffix) {
		if (newSuffix != suffix) {
			NotificationChain msgs = null;
			if (suffix != null)
				msgs = ((InternalEObject)suffix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX, null, msgs);
			if (newSuffix != null)
				msgs = ((InternalEObject)newSuffix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX, null, msgs);
			msgs = basicSetSuffix(newSuffix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX, newSuffix, newSuffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputStream getInputStream(int options) {
		return Util.getInputStream(getPrefix().getStringContent(), getContentProvider().getInputStream(options), getSuffix().getStringContent(), options);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputStream getOutputStream(final int options) {
		return new ByteArrayOutputStream() {
			@Override
			public void close() throws IOException {
				super.close();
				String contents = this.toString();
				String prefix2 = getPrefix().getStringContent();
				if (prefix2 != null && contents.startsWith(prefix2)) {
					contents = contents.substring(prefix2.length());
				} else {
					setPrefix(null);
				}
				String suffix2 = getSuffix().getStringContent();
				if (suffix2 != null && contents.startsWith(suffix2)) {
					contents = contents.substring(0, contents.length() - suffix2.length());
				} else {
					setSuffix(null);
				}
				if (contentProvider instanceof AbstractStringContentProvider) {
					((AbstractStringContentProvider) contentProvider).setStringContent(contents);
				} else {
					OutputStream outputStream = contentProvider.getOutputStream(options);
					try {
						outputStream.write(contents.getBytes());
					} finally {
						outputStream.close();
					}
				}
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
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE:
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
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE:
				return basicSetFile(null, msgs);
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX:
				return basicSetPrefix(null, msgs);
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				return basicSetContentProvider(null, msgs);
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX:
				return basicSetSuffix(null, msgs);
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
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE:
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
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE:
				return getFile();
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX:
				return getPrefix();
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				return getContentProvider();
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX:
				return getSuffix();
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
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE:
				setFile((EmfsFile)newValue);
				return;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX:
				setPrefix((AbstractStringContents)newValue);
				return;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				setContentProvider((EmfsFileContentProvider)newValue);
				return;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX:
				setSuffix((AbstractStringContents)newValue);
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
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE:
				setFile((EmfsFile)null);
				return;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX:
				setPrefix((AbstractStringContents)null);
				return;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				setContentProvider((EmfsFileContentProvider)null);
				return;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX:
				setSuffix((AbstractStringContents)null);
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
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__FILE:
				return getFile() != null;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__PREFIX:
				return prefix != null;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__CONTENT_PROVIDER:
				return contentProvider != null;
			case EmfsPackage.WRAPPING_STRING_CONTENT_PROVIDER__SUFFIX:
				return suffix != null;
		}
		return super.eIsSet(featureID);
	}

} //DelegatingStringContentProviderImpl
