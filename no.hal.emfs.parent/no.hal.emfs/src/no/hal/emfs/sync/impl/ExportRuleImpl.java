/**
 */
package no.hal.emfs.sync.impl;

import no.hal.emfs.sync.ExportRule;
import no.hal.emfs.sync.SyncPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Export Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ExportRuleImpl extends PathRuleImpl<ExportRule> implements ExportRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExportRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.EXPORT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<ExportRule> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<ExportRule>(ExportRule.class, this, SyncPackage.EXPORT_RULE__INCLUDES);
		}
		return includes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<ExportRule> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectContainmentEList<ExportRule>(ExportRule.class, this, SyncPackage.EXPORT_RULE__EXCLUDES);
		}
		return excludes;
	}

} //ExportRuleImpl
