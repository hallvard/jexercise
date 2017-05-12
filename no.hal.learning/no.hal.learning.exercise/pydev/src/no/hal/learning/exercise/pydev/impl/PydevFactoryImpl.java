/**
 */
package no.hal.learning.exercise.pydev.impl;

import no.hal.learning.exercise.pydev.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PydevFactoryImpl extends EFactoryImpl implements PydevFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PydevFactory init() {
		try {
			PydevFactory thePydevFactory = (PydevFactory)EPackage.Registry.INSTANCE.getEFactory(PydevPackage.eNS_URI);
			if (thePydevFactory != null) {
				return thePydevFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PydevFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PydevPackage.PYDEV_SOURCE_EDIT_ANSWER: return createPydevSourceEditAnswer();
			case PydevPackage.PYDEV_SOURCE_EDIT_PROPOSAL: return createPydevSourceEditProposal();
			case PydevPackage.PYDEV_SOURCE_EDIT_EVENT: return createPydevSourceEditEvent();
			case PydevPackage.PYDEV_MARKER_INFO: return createPydevMarkerInfo();
			case PydevPackage.PYDEV_LAUNCH_ANSWER: return createPydevLaunchAnswer();
			case PydevPackage.PYDEV_LAUNCH_PROPOSAL: return createPydevLaunchProposal();
			case PydevPackage.PYDEV_LAUNCH_EVENT: return createPydevLaunchEvent();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevSourceEditAnswer createPydevSourceEditAnswer() {
		PydevSourceEditAnswerImpl pydevSourceEditAnswer = new PydevSourceEditAnswerImpl();
		return pydevSourceEditAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevSourceEditProposal createPydevSourceEditProposal() {
		PydevSourceEditProposalImpl pydevSourceEditProposal = new PydevSourceEditProposalImpl();
		return pydevSourceEditProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevSourceEditEvent createPydevSourceEditEvent() {
		PydevSourceEditEventImpl pydevSourceEditEvent = new PydevSourceEditEventImpl();
		return pydevSourceEditEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevMarkerInfo createPydevMarkerInfo() {
		PydevMarkerInfoImpl pydevMarkerInfo = new PydevMarkerInfoImpl();
		return pydevMarkerInfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevLaunchAnswer createPydevLaunchAnswer() {
		PydevLaunchAnswerImpl pydevLaunchAnswer = new PydevLaunchAnswerImpl();
		return pydevLaunchAnswer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevLaunchProposal createPydevLaunchProposal() {
		PydevLaunchProposalImpl pydevLaunchProposal = new PydevLaunchProposalImpl();
		return pydevLaunchProposal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevLaunchEvent createPydevLaunchEvent() {
		PydevLaunchEventImpl pydevLaunchEvent = new PydevLaunchEventImpl();
		return pydevLaunchEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PydevPackage getPydevPackage() {
		return (PydevPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PydevPackage getPackage() {
		return PydevPackage.eINSTANCE;
	}

} //PydevFactoryImpl
