/**
 */
package no.hal.emfs.impl;

import no.hal.emfs.EmfsPackage;
import no.hal.emfs.GitRepoRef;
import no.hal.emfs.util.PropertyResolver;
import no.hal.emfs.util.Util;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Git Repo Ref</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.GitRepoRefImpl#getHost <em>Host</em>}</li>
 *   <li>{@link no.hal.emfs.impl.GitRepoRefImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link no.hal.emfs.impl.GitRepoRefImpl#getRepo <em>Repo</em>}</li>
 *   <li>{@link no.hal.emfs.impl.GitRepoRefImpl#getRemoteString <em>Remote String</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GitRepoRefImpl extends MinimalEObjectImpl.Container implements GitRepoRef {
	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHost() <em>Host</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected String host = HOST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected static final String OWNER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOwner() <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwner()
	 * @generated
	 * @ordered
	 */
	protected String owner = OWNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getRepo() <em>Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepo()
	 * @generated
	 * @ordered
	 */
	protected static final String REPO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRepo() <em>Repo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepo()
	 * @generated
	 * @ordered
	 */
	protected String repo = REPO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRemoteString() <em>Remote String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoteString()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOTE_STRING_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GitRepoRefImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.GIT_REPO_REF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getHost() {
		return (host != null ? host : "github.com");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHost(String newHost) {
		String oldHost = host;
		host = newHost;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.GIT_REPO_REF__HOST, oldHost, host));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(String newOwner) {
		String oldOwner = owner;
		owner = newOwner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.GIT_REPO_REF__OWNER, oldOwner, owner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRepo() {
		return repo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRepo(String newRepo) {
		String oldRepo = repo;
		repo = newRepo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, EmfsPackage.GIT_REPO_REF__REPO, oldRepo, repo));
	}

	protected static PropertyResolver propertyResolver = new PropertyResolver(true, true); 
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String getRemoteString() {
		String remoteString = Util.getGitRemoteString(this, null);
		String resolved = PropertyResolver.resolveProperties(remoteString, this, propertyResolver);
		System.out.println("Resolved: " + resolved);
		return resolved; // .replace("//", "/");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case EmfsPackage.GIT_REPO_REF__HOST:
				return getHost();
			case EmfsPackage.GIT_REPO_REF__OWNER:
				return getOwner();
			case EmfsPackage.GIT_REPO_REF__REPO:
				return getRepo();
			case EmfsPackage.GIT_REPO_REF__REMOTE_STRING:
				return getRemoteString();
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
			case EmfsPackage.GIT_REPO_REF__HOST:
				setHost((String)newValue);
				return;
			case EmfsPackage.GIT_REPO_REF__OWNER:
				setOwner((String)newValue);
				return;
			case EmfsPackage.GIT_REPO_REF__REPO:
				setRepo((String)newValue);
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
			case EmfsPackage.GIT_REPO_REF__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case EmfsPackage.GIT_REPO_REF__OWNER:
				setOwner(OWNER_EDEFAULT);
				return;
			case EmfsPackage.GIT_REPO_REF__REPO:
				setRepo(REPO_EDEFAULT);
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
			case EmfsPackage.GIT_REPO_REF__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case EmfsPackage.GIT_REPO_REF__OWNER:
				return OWNER_EDEFAULT == null ? owner != null : !OWNER_EDEFAULT.equals(owner);
			case EmfsPackage.GIT_REPO_REF__REPO:
				return REPO_EDEFAULT == null ? repo != null : !REPO_EDEFAULT.equals(repo);
			case EmfsPackage.GIT_REPO_REF__REMOTE_STRING:
				return REMOTE_STRING_EDEFAULT == null ? getRemoteString() != null : !REMOTE_STRING_EDEFAULT.equals(getRemoteString());
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
		result.append(" (host: ");
		result.append(host);
		result.append(", owner: ");
		result.append(owner);
		result.append(", repo: ");
		result.append(repo);
		result.append(')');
		return result.toString();
	}

} //GitRepoRefImpl
