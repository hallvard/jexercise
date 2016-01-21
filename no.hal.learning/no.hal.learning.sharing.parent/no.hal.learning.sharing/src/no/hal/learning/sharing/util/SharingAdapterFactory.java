/**
 */
package no.hal.learning.sharing.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import no.hal.learning.sharing.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.sharing.SharingPackage
 * @generated
 */
public class SharingAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SharingPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SharingPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharingSwitch<Adapter> modelSwitch =
		new SharingSwitch<Adapter>() {
			@Override
			public Adapter caseAbstractShare(AbstractShare object) {
				return createAbstractShareAdapter();
			}
			@Override
			public Adapter caseShareModel(ShareModel object) {
				return createShareModelAdapter();
			}
			@Override
			public Adapter caseShareEdits(ShareEdits object) {
				return createShareEditsAdapter();
			}
			@Override
			public Adapter caseModelEdit(ModelEdit object) {
				return createModelEditAdapter();
			}
			@Override
			public Adapter caseAbstractModelEdit(AbstractModelEdit object) {
				return createAbstractModelEditAdapter();
			}
			@Override
			public Adapter caseAbstractFeatureEdit(AbstractFeatureEdit object) {
				return createAbstractFeatureEditAdapter();
			}
			@Override
			public Adapter caseAbstractAttributeEdit(AbstractAttributeEdit object) {
				return createAbstractAttributeEditAdapter();
			}
			@Override
			public Adapter caseAbstractReferenceEdit(AbstractReferenceEdit object) {
				return createAbstractReferenceEditAdapter();
			}
			@Override
			public Adapter caseSetFeatureEdit(SetFeatureEdit object) {
				return createSetFeatureEditAdapter();
			}
			@Override
			public Adapter caseSetAttributeEdit(SetAttributeEdit object) {
				return createSetAttributeEditAdapter();
			}
			@Override
			public Adapter caseSetReferenceEdit(SetReferenceEdit object) {
				return createSetReferenceEditAdapter();
			}
			@Override
			public Adapter caseAddFeatureEdit(AddFeatureEdit object) {
				return createAddFeatureEditAdapter();
			}
			@Override
			public Adapter caseAddAttributeEdit(AddAttributeEdit object) {
				return createAddAttributeEditAdapter();
			}
			@Override
			public Adapter caseAddReferenceEdit(AddReferenceEdit object) {
				return createAddReferenceEditAdapter();
			}
			@Override
			public Adapter caseRemoveFeatureEdit(RemoveFeatureEdit object) {
				return createRemoveFeatureEditAdapter();
			}
			@Override
			public Adapter caseChangeEdit(ChangeEdit object) {
				return createChangeEditAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.AbstractShare <em>Abstract Share</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.AbstractShare
	 * @generated
	 */
	public Adapter createAbstractShareAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.ModelEdit <em>Model Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.ModelEdit
	 * @generated
	 */
	public Adapter createModelEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.AbstractModelEdit <em>Abstract Model Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.AbstractModelEdit
	 * @generated
	 */
	public Adapter createAbstractModelEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.AbstractFeatureEdit <em>Abstract Feature Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.AbstractFeatureEdit
	 * @generated
	 */
	public Adapter createAbstractFeatureEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.AbstractAttributeEdit <em>Abstract Attribute Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.AbstractAttributeEdit
	 * @generated
	 */
	public Adapter createAbstractAttributeEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.AbstractReferenceEdit <em>Abstract Reference Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.AbstractReferenceEdit
	 * @generated
	 */
	public Adapter createAbstractReferenceEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.SetFeatureEdit <em>Set Feature Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.SetFeatureEdit
	 * @generated
	 */
	public Adapter createSetFeatureEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.SetAttributeEdit <em>Set Attribute Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.SetAttributeEdit
	 * @generated
	 */
	public Adapter createSetAttributeEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.SetReferenceEdit <em>Set Reference Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.SetReferenceEdit
	 * @generated
	 */
	public Adapter createSetReferenceEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.AddFeatureEdit <em>Add Feature Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.AddFeatureEdit
	 * @generated
	 */
	public Adapter createAddFeatureEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.AddAttributeEdit <em>Add Attribute Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.AddAttributeEdit
	 * @generated
	 */
	public Adapter createAddAttributeEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.AddReferenceEdit <em>Add Reference Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.AddReferenceEdit
	 * @generated
	 */
	public Adapter createAddReferenceEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.RemoveFeatureEdit <em>Remove Feature Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.RemoveFeatureEdit
	 * @generated
	 */
	public Adapter createRemoveFeatureEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.ChangeEdit <em>Change Edit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.ChangeEdit
	 * @generated
	 */
	public Adapter createChangeEditAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.ShareModel <em>Share Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.ShareModel
	 * @generated
	 */
	public Adapter createShareModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link no.hal.learning.sharing.ShareEdits <em>Share Edits</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see no.hal.learning.sharing.ShareEdits
	 * @generated
	 */
	public Adapter createShareEditsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SharingAdapterFactory
