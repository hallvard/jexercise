/**
 */
package no.hal.emfs.sync.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.SyncPackage;
import no.hal.emfs.sync.TagsCondition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tags Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.impl.TagsConditionImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.TagsConditionImpl#getExcludes <em>Excludes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TagsConditionImpl extends MinimalEObjectImpl.Container implements TagsCondition {
	/**
	 * The cached value of the '{@link #getIncludes() <em>Includes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncludes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> includes;

	/**
	 * The cached value of the '{@link #getExcludes() <em>Excludes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> excludes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TagsConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.TAGS_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getIncludes() {
		if (includes == null) {
			includes = new EDataTypeUniqueEList<String>(String.class, this, SyncPackage.TAGS_CONDITION__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getExcludes() {
		if (excludes == null) {
			excludes = new EDataTypeUniqueEList<String>(String.class, this, SyncPackage.TAGS_CONDITION__EXCLUDES);
		}
		return excludes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean accept(EmfsResource resource) {
		for (String exclude : getExcludes()) {
			if (resource.getTags().contains(exclude)) {
				return false;
			}
		}
		for (String include : getIncludes()) {
			if (! resource.getTags().contains(include)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SyncPackage.TAGS_CONDITION__INCLUDES:
				return getIncludes();
			case SyncPackage.TAGS_CONDITION__EXCLUDES:
				return getExcludes();
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
			case SyncPackage.TAGS_CONDITION__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends String>)newValue);
				return;
			case SyncPackage.TAGS_CONDITION__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends String>)newValue);
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
			case SyncPackage.TAGS_CONDITION__INCLUDES:
				getIncludes().clear();
				return;
			case SyncPackage.TAGS_CONDITION__EXCLUDES:
				getExcludes().clear();
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
			case SyncPackage.TAGS_CONDITION__INCLUDES:
				return includes != null && !includes.isEmpty();
			case SyncPackage.TAGS_CONDITION__EXCLUDES:
				return excludes != null && !excludes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SyncPackage.TAGS_CONDITION___ACCEPT__EMFSRESOURCE:
				return accept((EmfsResource)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (includes: ");
		result.append(includes);
		result.append(", excludes: ");
		result.append(excludes);
		result.append(')');
		return result.toString();
	}

} //TagsConditionImpl
