/**
 */
package no.hal.learning.sharing.impl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import no.hal.learning.sharing.RemoveFeatureEdit;
import no.hal.learning.sharing.SharingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Feature Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveFeatureEditImpl extends AbstractFeatureEditImpl implements RemoveFeatureEdit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveFeatureEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharingPackage.Literals.REMOVE_FEATURE_EDIT;
	}

	//
	
	@Override
	public void performEdit() {
		EStructuralFeature structuralFeature = getStructuralFeature();
		EList<Object> list = (EList<Object>) getEObject().eGet(structuralFeature);
		list.remove(getIndex());
	}
	
	@Override
	public Command createEditCommand(EditingDomain editingDomain) {
		return new RemoveCommand(editingDomain, getEObject(), getStructuralFeature(), getIndex());
	}

} //RemoveFeatureEditImpl
