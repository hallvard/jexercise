/**
 */
package no.hal.emfs.impl;

import no.hal.emfs.EmfsPackage;
import no.hal.emfs.GitContentRef;
import no.hal.emfs.GitURLContentProvider;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Raw Github Content Provider</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link no.hal.emfs.impl.GitURLContentProviderImpl#getGitRef <em>Git Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GitURLContentProviderImpl extends AbstractURLContentProviderImpl implements GitURLContentProvider {
	/**
	 * The cached value of the '{@link #getGitRef() <em>Git Ref</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGitRef()
	 * @generated
	 * @ordered
	 */
	protected GitContentRef gitRef;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitURLContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.GIT_URL_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GitContentRef getGitRef() {
		return gitRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGitRef(GitContentRef newGitRef, NotificationChain msgs) {
		GitContentRef oldGitRef = gitRef;
		gitRef = newGitRef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF, oldGitRef, newGitRef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGitRef(GitContentRef newGitRef) {
		if (newGitRef != gitRef) {
			NotificationChain msgs = null;
			if (gitRef != null)
				msgs = ((InternalEObject)gitRef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF, null, msgs);
			if (newGitRef != null)
				msgs = ((InternalEObject)newGitRef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF, null, msgs);
			msgs = basicSetGitRef(newGitRef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF, newGitRef, newGitRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF:
				return basicSetGitRef(null, msgs);
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
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF:
				return getGitRef();
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
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF:
				setGitRef((GitContentRef)newValue);
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
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF:
				setGitRef((GitContentRef)null);
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
			case EmfsPackage.GIT_URL_CONTENT_PROVIDER__GIT_REF:
				return gitRef != null;
		}
		return super.eIsSet(featureID);
	}

	//
	
	@Override
	public String getUrlString() {
		return gitRef.getUrlString();
	}

} //RawGithubContentProviderImpl
