/**
 */
package no.hal.emfs.sync.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.FullPathCondition;
import no.hal.emfs.sync.SyncPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Full Path Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class FullPathConditionImpl extends StringConditionImpl implements FullPathCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FullPathConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.FULL_PATH_CONDITION;
	}

	//

	@Override
	public boolean accept(EmfsResource resource) {
		return accept(resource.getFullPath());
	}
	
} //FullPathConditionImpl
