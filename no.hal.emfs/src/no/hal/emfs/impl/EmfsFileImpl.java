/**
 */
package no.hal.emfs.impl;

import java.io.InputStream;
import java.io.OutputStream;

import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsFileContentProvider;
import no.hal.emfs.EmfsPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>File</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.emfs.impl.EmfsFileImpl#getFile <em>File</em>}</li>
 *   <li>{@link no.hal.emfs.impl.EmfsFileImpl#getContentProvider <em>Content Provider</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EmfsFileImpl extends EmfsResourceImpl implements EmfsFile {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfsFileImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.EMFS_FILE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFile getFile() {
		if (eContainerFeatureID() != EmfsPackage.EMFS_FILE__FILE) return null;
		return (EmfsFile)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFile(EmfsFile newFile, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFile, EmfsPackage.EMFS_FILE__FILE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFile(EmfsFile newFile) {
		if (newFile != eInternalContainer() || (eContainerFeatureID() != EmfsPackage.EMFS_FILE__FILE && newFile != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.EMFS_FILE__FILE, newFile, newFile));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.EMFS_FILE__CONTENT_PROVIDER, oldContentProvider, newContentProvider);
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
				msgs = ((InternalEObject)contentProvider).eInverseRemove(this, EmfsPackage.EMFS_FILE_CONTENT_PROVIDER__FILE, EmfsFileContentProvider.class, msgs);
			if (newContentProvider != null)
				msgs = ((InternalEObject)newContentProvider).eInverseAdd(this, EmfsPackage.EMFS_FILE_CONTENT_PROVIDER__FILE, EmfsFileContentProvider.class, msgs);
			msgs = basicSetContentProvider(newContentProvider, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.EMFS_FILE__CONTENT_PROVIDER, newContentProvider, newContentProvider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public InputStream getInputStream(int options) {
		return getContentProvider().getInputStream(options);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OutputStream getOutputStream(int options) {
		return getContentProvider().getOutputStream(options);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.EMFS_FILE__FILE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFile((EmfsFile)otherEnd, msgs);
			case EmfsPackage.EMFS_FILE__CONTENT_PROVIDER:
				if (contentProvider != null)
					msgs = ((InternalEObject)contentProvider).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.EMFS_FILE__CONTENT_PROVIDER, null, msgs);
				return basicSetContentProvider((EmfsFileContentProvider)otherEnd, msgs);
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
			case EmfsPackage.EMFS_FILE__FILE:
				return basicSetFile(null, msgs);
			case EmfsPackage.EMFS_FILE__CONTENT_PROVIDER:
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
			case EmfsPackage.EMFS_FILE__FILE:
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
			case EmfsPackage.EMFS_FILE__FILE:
				return getFile();
			case EmfsPackage.EMFS_FILE__CONTENT_PROVIDER:
				return getContentProvider();
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
			case EmfsPackage.EMFS_FILE__FILE:
				setFile((EmfsFile)newValue);
				return;
			case EmfsPackage.EMFS_FILE__CONTENT_PROVIDER:
				setContentProvider((EmfsFileContentProvider)newValue);
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
			case EmfsPackage.EMFS_FILE__FILE:
				setFile((EmfsFile)null);
				return;
			case EmfsPackage.EMFS_FILE__CONTENT_PROVIDER:
				setContentProvider((EmfsFileContentProvider)null);
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
			case EmfsPackage.EMFS_FILE__FILE:
				return getFile() != null;
			case EmfsPackage.EMFS_FILE__CONTENT_PROVIDER:
				return contentProvider != null;
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
		if (baseClass == EmfsFileContentProvider.class) {
			switch (derivedFeatureID) {
				case EmfsPackage.EMFS_FILE__FILE: return EmfsPackage.EMFS_FILE_CONTENT_PROVIDER__FILE;
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
		if (baseClass == EmfsFileContentProvider.class) {
			switch (baseFeatureID) {
				case EmfsPackage.EMFS_FILE_CONTENT_PROVIDER__FILE: return EmfsPackage.EMFS_FILE__FILE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //EmfsFileImpl
