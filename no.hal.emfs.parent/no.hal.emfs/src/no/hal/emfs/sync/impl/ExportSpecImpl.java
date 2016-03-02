/**
 */
package no.hal.emfs.sync.impl;

import no.hal.emfs.sync.ExportRule;
import no.hal.emfs.sync.ExportSpec;
import no.hal.emfs.sync.SyncPackage;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExportSpecImpl extends PortSpecImpl<ExportRule> implements ExportSpec {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportSpecImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.EXPORT_SPEC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<ExportRule> getRules() {
		if (rules == null) {
			rules = new EObjectContainmentEList<ExportRule>(ExportRule.class, this, SyncPackage.EXPORT_SPEC__RULES);
		}
		return rules;
	}

} //ExportSpecImpl
