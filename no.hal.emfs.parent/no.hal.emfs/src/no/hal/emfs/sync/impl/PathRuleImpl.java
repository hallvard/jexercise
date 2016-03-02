/**
 */
package no.hal.emfs.sync.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.PathRule;
import no.hal.emfs.sync.PropertiesRule;
import no.hal.emfs.sync.ResourcePath;
import no.hal.emfs.sync.SyncPackage;
import no.hal.emfs.sync.TagsRule;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Path Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.impl.PathRuleImpl#getPath <em>Path</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PathRuleImpl#getFullPath <em>Full Path</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PathRuleImpl#getTargetPath <em>Target Path</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PathRuleImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PathRuleImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PathRuleImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.PathRuleImpl#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PathRuleImpl<R extends PathRule<R>> extends EmfsResourceRuleImpl implements PathRule<R> {
	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected ResourcePath path;

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
	 * The cached value of the '{@link #getTargetPath() <em>Target Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPath()
	 * @generated
	 * @ordered
	 */
	protected ResourcePath targetPath;

	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<R> includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<R> excludes;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected EList<TagsRule> tags;

	/**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertiesRule> properties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PathRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.PATH_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePath getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPath(ResourcePath newPath, NotificationChain msgs) {
		ResourcePath oldPath = path;
		path = newPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncPackage.PATH_RULE__PATH, oldPath, newPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(ResourcePath newPath) {
		if (newPath != path) {
			NotificationChain msgs = null;
			if (path != null)
				msgs = ((InternalEObject)path).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncPackage.PATH_RULE__PATH, null, msgs);
			if (newPath != null)
				msgs = ((InternalEObject)newPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncPackage.PATH_RULE__PATH, null, msgs);
			msgs = basicSetPath(newPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncPackage.PATH_RULE__PATH, newPath, newPath));
	}

	protected void buildFullPath(PathRule<?> rule, StringBuilder buffer) {
		if (rule.eContainer() instanceof PathRule) {
			buildFullPath((ImportRule) rule.eContainer(), buffer);
		}
		if (rule.getPath() != null) {
			RelativePathImpl.buildFullPath(rule.getPath(), buffer);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getFullPath() {
		StringBuilder buffer = new StringBuilder();
		buildFullPath(this, buffer);
		return buffer.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePath getTargetPath() {
		return targetPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPath(ResourcePath newTargetPath, NotificationChain msgs) {
		ResourcePath oldTargetPath = targetPath;
		targetPath = newTargetPath;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SyncPackage.PATH_RULE__TARGET_PATH, oldTargetPath, newTargetPath);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTargetPath(ResourcePath newTargetPath) {
		if (newTargetPath != targetPath) {
			NotificationChain msgs = null;
			if (targetPath != null)
				msgs = ((InternalEObject)targetPath).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SyncPackage.PATH_RULE__TARGET_PATH, null, msgs);
			if (newTargetPath != null)
				msgs = ((InternalEObject)newTargetPath).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SyncPackage.PATH_RULE__TARGET_PATH, null, msgs);
			msgs = basicSetTargetPath(newTargetPath, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncPackage.PATH_RULE__TARGET_PATH, newTargetPath, newTargetPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<R> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<R>(PathRule.class, this, SyncPackage.PATH_RULE__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<R> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectContainmentEList<R>(PathRule.class, this, SyncPackage.PATH_RULE__EXCLUDES);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TagsRule> getTags() {
		if (tags == null) {
			tags = new EObjectContainmentEList<TagsRule>(TagsRule.class, this, SyncPackage.PATH_RULE__TAGS);
		}
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PropertiesRule> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<PropertiesRule>(PropertiesRule.class, this, SyncPackage.PATH_RULE__PROPERTIES);
		}
		return properties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SyncPackage.PATH_RULE__PATH:
				return basicSetPath(null, msgs);
			case SyncPackage.PATH_RULE__TARGET_PATH:
				return basicSetTargetPath(null, msgs);
			case SyncPackage.PATH_RULE__INCLUDES:
				return ((InternalEList<?>)getIncludes()).basicRemove(otherEnd, msgs);
			case SyncPackage.PATH_RULE__EXCLUDES:
				return ((InternalEList<?>)getExcludes()).basicRemove(otherEnd, msgs);
			case SyncPackage.PATH_RULE__TAGS:
				return ((InternalEList<?>)getTags()).basicRemove(otherEnd, msgs);
			case SyncPackage.PATH_RULE__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
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
			case SyncPackage.PATH_RULE__PATH:
				return getPath();
			case SyncPackage.PATH_RULE__FULL_PATH:
				return getFullPath();
			case SyncPackage.PATH_RULE__TARGET_PATH:
				return getTargetPath();
			case SyncPackage.PATH_RULE__INCLUDES:
				return getIncludes();
			case SyncPackage.PATH_RULE__EXCLUDES:
				return getExcludes();
			case SyncPackage.PATH_RULE__TAGS:
				return getTags();
			case SyncPackage.PATH_RULE__PROPERTIES:
				return getProperties();
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
			case SyncPackage.PATH_RULE__PATH:
				setPath((ResourcePath)newValue);
				return;
			case SyncPackage.PATH_RULE__TARGET_PATH:
				setTargetPath((ResourcePath)newValue);
				return;
			case SyncPackage.PATH_RULE__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends R>)newValue);
				return;
			case SyncPackage.PATH_RULE__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends R>)newValue);
				return;
			case SyncPackage.PATH_RULE__TAGS:
				getTags().clear();
				getTags().addAll((Collection<? extends TagsRule>)newValue);
				return;
			case SyncPackage.PATH_RULE__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends PropertiesRule>)newValue);
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
			case SyncPackage.PATH_RULE__PATH:
				setPath((ResourcePath)null);
				return;
			case SyncPackage.PATH_RULE__TARGET_PATH:
				setTargetPath((ResourcePath)null);
				return;
			case SyncPackage.PATH_RULE__INCLUDES:
				getIncludes().clear();
				return;
			case SyncPackage.PATH_RULE__EXCLUDES:
				getExcludes().clear();
				return;
			case SyncPackage.PATH_RULE__TAGS:
				getTags().clear();
				return;
			case SyncPackage.PATH_RULE__PROPERTIES:
				getProperties().clear();
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
			case SyncPackage.PATH_RULE__PATH:
				return path != null;
			case SyncPackage.PATH_RULE__FULL_PATH:
				return FULL_PATH_EDEFAULT == null ? getFullPath() != null : !FULL_PATH_EDEFAULT.equals(getFullPath());
			case SyncPackage.PATH_RULE__TARGET_PATH:
				return targetPath != null;
			case SyncPackage.PATH_RULE__INCLUDES:
				return includes != null && !includes.isEmpty();
			case SyncPackage.PATH_RULE__EXCLUDES:
				return excludes != null && !excludes.isEmpty();
			case SyncPackage.PATH_RULE__TAGS:
				return tags != null && !tags.isEmpty();
			case SyncPackage.PATH_RULE__PROPERTIES:
				return properties != null && !properties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PathRuleImpl
