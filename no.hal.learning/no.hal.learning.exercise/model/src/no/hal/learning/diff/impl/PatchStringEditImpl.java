/**
 */
package no.hal.learning.diff.impl;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import no.hal.learning.diff.DiffPackage;
import no.hal.learning.diff.PatchStringEdit;

import no.hal.learning.exercise.AbstractStringEdit;
import no.hal.learning.exercise.impl.RelativeStringEditImpl;
import no.hal.learning.exercise.util.Util;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import difflib.DiffUtils;
import difflib.Patch;
import difflib.PatchFailedException;
import difflib.StringUtills;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patch String Edit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.diff.impl.PatchStringEditImpl#getPatches <em>Patches</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PatchStringEditImpl extends RelativeStringEditImpl implements PatchStringEdit {
	/**
	 * The cached value of the '{@link #getPatches() <em>Patches</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatches()
	 * @generated
	 * @ordered
	 */
	protected EList<String> patches;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatchStringEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DiffPackage.Literals.PATCH_STRING_EDIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getPatches() {
		if (patches == null) {
			patches = new EDataTypeUniqueEList<String>(String.class, this, DiffPackage.PATCH_STRING_EDIT__PATCHES);
		}
		return patches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DiffPackage.PATCH_STRING_EDIT__PATCHES:
				return getPatches();
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
			case DiffPackage.PATCH_STRING_EDIT__PATCHES:
				getPatches().clear();
				getPatches().addAll((Collection<? extends String>)newValue);
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
			case DiffPackage.PATCH_STRING_EDIT__PATCHES:
				getPatches().clear();
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
			case DiffPackage.PATCH_STRING_EDIT__PATCHES:
				return patches != null && !patches.isEmpty();
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
		result.append(" (patches: ");
		result.append(patches);
		result.append(')');
		return result.toString();
	}
	
	
	//
	
	@Override
	public String getString() {
		Patch<String> diff = DiffUtils.parseUnifiedDiff(getPatches());
		String lastString = getEdit().getString();
		try {
			List<String> lines = DiffUtils.patch(Arrays.asList(lastString.split("\n")), diff);
			return StringUtills.join(lines, "\n");
		} catch (PatchFailedException e) {
			return null;
		}
	}
	
	@Override
	public Boolean initStringEdit(String string, AbstractStringEdit lastEdit) {
		String lastString = lastEdit.getString();
		Patch<String> diff = DiffUtils.diff(Util.splitLines(lastString), Util.splitLines(string));
		List<String> patches = DiffUtils.generateUnifiedDiff("0", "1", null, diff, 0);
		setEdit(lastEdit);
		getPatches().addAll(patches);
		return true;
	}

} //PatchStringEditImpl
