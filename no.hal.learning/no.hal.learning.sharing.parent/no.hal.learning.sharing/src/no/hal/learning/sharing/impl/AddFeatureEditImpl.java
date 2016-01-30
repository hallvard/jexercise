/**
 */
package no.hal.learning.sharing.impl;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import no.hal.learning.sharing.AddFeatureEdit;
import no.hal.learning.sharing.SharingPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Feature Edit</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class AddFeatureEditImpl extends AbstractFeatureEditImpl implements AddFeatureEdit {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddFeatureEditImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SharingPackage.Literals.ADD_FEATURE_EDIT;
	}
	
	//
	
	@Override
	public void performEdit() {
		EStructuralFeature structuralFeature = getStructuralFeature();
		EList<Object> list = (EList<Object>) getEObject().eGet(structuralFeature);
		list.add(getIndex(), getValue());
	}
	
	@Override
	public Command createEditCommand(EditingDomain editingDomain) {
		return new AddCommand(editingDomain, getEObject(), getStructuralFeature(), getValue(), getIndex());
	}

} //AddFeatureEditImpl
