/**
 */
package no.hal.learning.sharing.impl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import no.hal.learning.sharing.SetFeatureEdit;
import no.hal.learning.sharing.SharingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Feature Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class SetFeatureEditImpl extends AbstractFeatureEditImpl implements SetFeatureEdit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetFeatureEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharingPackage.Literals.SET_FEATURE_EDIT;
	}
	
	//

	@Override
	public void performEdit() {
		EStructuralFeature structuralFeature = getStructuralFeature();
		if (structuralFeature.isMany()) {
			EList<Object> list = (EList<Object>) getEObject().eGet(structuralFeature);
			list.set(getIndex(), getValue());
		} else {
			getEObject().eSet(structuralFeature, getValue());
		}
	}

	@Override
	public Command createEditCommand(EditingDomain editingDomain) {
		return new SetCommand(editingDomain, getEObject(), getStructuralFeature(), getValue());
	}
	
} //SetFeatureEditImpl
