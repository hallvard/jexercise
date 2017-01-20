/**
 */
package no.hal.learning.quiz.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import no.hal.learning.exercise.impl.QuestionImpl;
import no.hal.learning.quiz.QuizPackage;
import no.hal.learning.quiz.StyledString;
import no.hal.learning.quiz.StyledStringQuestion;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Styled String Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.quiz.impl.StyledStringQuestionImpl#getStyledStrings <em>Styled Strings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyledStringQuestionImpl extends QuestionImpl implements StyledStringQuestion {
	/**
	 * The cached value of the '{@link #getStyledStrings() <em>Styled Strings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyledStrings()
	 * @generated
	 * @ordered
	 */
	protected EList<StyledString> styledStrings;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyledStringQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.STYLED_STRING_QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StyledString> getStyledStrings() {
		if (styledStrings == null) {
			styledStrings = new EObjectContainmentEList<StyledString>(StyledString.class, this, QuizPackage.STYLED_STRING_QUESTION__STYLED_STRINGS);
		}
		return styledStrings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizPackage.STYLED_STRING_QUESTION__STYLED_STRINGS:
				return ((InternalEList<?>)getStyledStrings()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case QuizPackage.STYLED_STRING_QUESTION__STYLED_STRINGS:
				return getStyledStrings();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case QuizPackage.STYLED_STRING_QUESTION__STYLED_STRINGS:
				getStyledStrings().clear();
				getStyledStrings().addAll((Collection<? extends StyledString>)newValue);
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
			case QuizPackage.STYLED_STRING_QUESTION__STYLED_STRINGS:
				getStyledStrings().clear();
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
			case QuizPackage.STYLED_STRING_QUESTION__STYLED_STRINGS:
				return styledStrings != null && !styledStrings.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StyledStringQuestionImpl
