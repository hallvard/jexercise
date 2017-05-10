/**
 */
package no.hal.learning.exercise.workspace.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.Proposal;
import no.hal.learning.exercise.impl.StringEditAnswerImpl;
import no.hal.learning.exercise.workspace.SourceFileEditAnswer;
import no.hal.learning.exercise.workspace.SourceFileEditProposal;
import no.hal.learning.exercise.workspace.WorkspaceFactory;
import no.hal.learning.exercise.workspace.WorkspacePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Source File Edit Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.workspace.impl.SourceFileEditAnswerImpl#getResourcePath <em>Resource Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SourceFileEditAnswerImpl extends StringEditAnswerImpl implements SourceFileEditAnswer {
	/**
	 * The default value of the '{@link #getResourcePath() <em>Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePath()
	 * @generated
	 * @ordered
	 */
	protected static final String RESOURCE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResourcePath() <em>Resource Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourcePath()
	 * @generated
	 * @ordered
	 */
	protected String resourcePath = RESOURCE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SourceFileEditAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WorkspacePackage.Literals.SOURCE_FILE_EDIT_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getResourcePath() {
		return resourcePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourcePath(String newResourcePath) {
		String oldResourcePath = resourcePath;
		resourcePath = newResourcePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WorkspacePackage.SOURCE_FILE_EDIT_ANSWER__RESOURCE_PATH, oldResourcePath, resourcePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WorkspacePackage.SOURCE_FILE_EDIT_ANSWER__RESOURCE_PATH:
				return getResourcePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WorkspacePackage.SOURCE_FILE_EDIT_ANSWER__RESOURCE_PATH:
				setResourcePath((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case WorkspacePackage.SOURCE_FILE_EDIT_ANSWER__RESOURCE_PATH:
				setResourcePath(RESOURCE_PATH_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case WorkspacePackage.SOURCE_FILE_EDIT_ANSWER__RESOURCE_PATH:
				return RESOURCE_PATH_EDEFAULT == null ? resourcePath != null : !RESOURCE_PATH_EDEFAULT.equals(resourcePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (resourcePath: ");
		result.append(resourcePath);
		result.append(')');
		return result.toString();
	}
	
	//
	

	@Override
	public Proposal<?> createProposal() {
		SourceFileEditProposal proposal = WorkspaceFactory.eINSTANCE.createSourceFileEditProposal();
		proposal.setAnswer(this);
		return proposal;
	}

} //SourceFileEditAnswerImpl
