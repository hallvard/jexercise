/**
 */
package no.hal.emfs.sync.impl;

import org.eclipse.emf.ecore.EClass;

import no.hal.emfs.EmfsResource;
import no.hal.emfs.sync.NameCondition;
import no.hal.emfs.sync.SyncPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Name Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NameConditionImpl extends StringConditionImpl implements NameCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NameConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.NAME_CONDITION;
	}

	//

	@Override
	public boolean accept(EmfsResource resource) {
		return accept(resource.getName());
	}

} //NameConditionImpl
