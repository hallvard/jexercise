/**
 */
package no.hal.learning.exercise.workbench.util;

import java.util.Map;

import no.hal.learning.exercise.workbench.*;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see no.hal.learning.exercise.workbench.WorkbenchPackage
 * @generated
 */
public class WorkbenchValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WorkbenchValidator INSTANCE = new WorkbenchValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "no.hal.learning.exercise.workbench";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkbenchValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WorkbenchPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WorkbenchPackage.WORKBENCH_TASK_ANSWER:
				return validateWorkbenchTaskAnswer((WorkbenchTaskAnswer)value, diagnostics, context);
			case WorkbenchPackage.PART_TASK_ANSWER:
				return validatePartTaskAnswer((PartTaskAnswer)value, diagnostics, context);
			case WorkbenchPackage.PART_TASK_PROPOSAL:
				return validatePartTaskProposal((PartTaskProposal)value, diagnostics, context);
			case WorkbenchPackage.PERSPECTIVE_TASK_ANSWER:
				return validatePerspectiveTaskAnswer((PerspectiveTaskAnswer)value, diagnostics, context);
			case WorkbenchPackage.PERSPECTIVE_TASK_PROPOSAL:
				return validatePerspectiveTaskProposal((PerspectiveTaskProposal)value, diagnostics, context);
			case WorkbenchPackage.COMMAND_EXECUTION_ANSWER:
				return validateCommandExecutionAnswer((CommandExecutionAnswer)value, diagnostics, context);
			case WorkbenchPackage.COMMAND_EXECUTION_PROPOSAL:
				return validateCommandExecutionProposal((CommandExecutionProposal)value, diagnostics, context);
			case WorkbenchPackage.DEBUG_EVENT_ANSWER:
				return validateDebugEventAnswer((DebugEventAnswer)value, diagnostics, context);
			case WorkbenchPackage.DEBUG_EVENT_PROPOSAL:
				return validateDebugEventProposal((DebugEventProposal)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkbenchTaskAnswer(WorkbenchTaskAnswer workbenchTaskAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workbenchTaskAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartTaskAnswer(PartTaskAnswer partTaskAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(partTaskAnswer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(partTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(partTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(partTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(partTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(partTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(partTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(partTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(partTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePartTaskAnswer_knownPartId(partTaskAnswer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the knownPartId constraint of '<em>Part Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePartTaskAnswer_knownPartId(PartTaskAnswer partTaskAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (! (ExtensionsUtil.isKnownExtensionId(partTaskAnswer, "org.eclipse.ui.editors", "editor", null) || ExtensionsUtil.isKnownExtensionId(partTaskAnswer, "org.eclipse.ui.views", "view", null))) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "knownPartId", getObjectLabel(partTaskAnswer, context) },
						 new Object[] { partTaskAnswer },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePartTaskProposal(PartTaskProposal partTaskProposal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(partTaskProposal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveTaskAnswer(PerspectiveTaskAnswer perspectiveTaskAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(perspectiveTaskAnswer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(perspectiveTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(perspectiveTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(perspectiveTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(perspectiveTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(perspectiveTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(perspectiveTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(perspectiveTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(perspectiveTaskAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validatePerspectiveTaskAnswer_knownPerspectiveId(perspectiveTaskAnswer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the knownPerspectiveId constraint of '<em>Perspective Task Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validatePerspectiveTaskAnswer_knownPerspectiveId(PerspectiveTaskAnswer perspectiveTaskAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (! ExtensionsUtil.isKnownExtensionId(perspectiveTaskAnswer, "org.eclipse.ui.perspectives", "perspective", null)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "knownPerspectiveId", getObjectLabel(perspectiveTaskAnswer, context) },
						 new Object[] { perspectiveTaskAnswer },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePerspectiveTaskProposal(PerspectiveTaskProposal perspectiveTaskProposal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(perspectiveTaskProposal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandExecutionAnswer(CommandExecutionAnswer commandExecutionAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(commandExecutionAnswer, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(commandExecutionAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(commandExecutionAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(commandExecutionAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(commandExecutionAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(commandExecutionAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(commandExecutionAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(commandExecutionAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(commandExecutionAnswer, diagnostics, context);
		if (result || diagnostics != null) result &= validateCommandExecutionAnswer_knownCommandId(commandExecutionAnswer, diagnostics, context);
		return result;
	}

	/**
	 * Validates the knownCommandId constraint of '<em>Command Execution Answer</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCommandExecutionAnswer_knownCommandId(CommandExecutionAnswer commandExecutionAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (! ExtensionsUtil.isKnownExtensionId(commandExecutionAnswer, "org.eclipse.ui.commands", "command", null)) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "knownCommandId", getObjectLabel(commandExecutionAnswer, context) },
						 new Object[] { commandExecutionAnswer },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCommandExecutionProposal(CommandExecutionProposal commandExecutionProposal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(commandExecutionProposal, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDebugEventAnswer(DebugEventAnswer debugEventAnswer, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(debugEventAnswer, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDebugEventProposal(DebugEventProposal debugEventProposal, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(debugEventProposal, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WorkbenchValidator
