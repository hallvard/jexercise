/**
 */
package no.hal.emfs.sync.impl;

import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.ImportSpec;
import no.hal.emfs.sync.SyncPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImportSpecImpl extends PortSpecImpl<ImportRule> implements ImportSpec {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.IMPORT_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<ImportRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<ImportRule>(ImportRule.class, this, SyncPackage.IMPORT_SPEC__RULES);
		}
		return rules;
	}

} //ImportSpecImpl
