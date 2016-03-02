/**
 */
package no.hal.emfs.sync.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;

import no.hal.emfs.sync.ImportRule;
import no.hal.emfs.sync.SyncPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ImportRuleImpl extends PathRuleImpl<ImportRule> implements ImportRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.IMPORT_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * This is specialized for the more specific element type known in this context.
	 * @generated
	 */
	@Override
	public EList<ImportRule> getIncludes() {
		if (includes == null) {
			includes = new EObjectContainmentEList<ImportRule>(ImportRule.class, this, SyncPackage.IMPORT_RULE__INCLUDES);
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
	public EList<ImportRule> getExcludes() {
		if (excludes == null) {
			excludes = new EObjectContainmentEList<ImportRule>(ImportRule.class, this, SyncPackage.IMPORT_RULE__EXCLUDES);
		}
		return excludes;
	}

} //ImportRuleImpl
