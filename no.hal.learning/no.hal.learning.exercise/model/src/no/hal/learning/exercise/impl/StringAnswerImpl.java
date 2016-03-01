/**
 */
package no.hal.learning.exercise.impl;

import java.util.regex.Pattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.StringAnswer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Answer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.StringAnswerImpl#getValue <em>Value</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.StringAnswerImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.StringAnswerImpl#isRegexp <em>Regexp</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.StringAnswerImpl#isIgnoreCase <em>Ignore Case</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringAnswerImpl extends SimpleAnswerImpl<String> implements StringAnswer {
	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormat()
	 * @generated
	 * @ordered
	 */
	protected String format = FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #isRegexp() <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegexp()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REGEXP_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRegexp() <em>Regexp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRegexp()
	 * @generated
	 * @ordered
	 */
	protected boolean regexp = REGEXP_EDEFAULT;

	/**
	 * The default value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_CASE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreCase() <em>Ignore Case</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreCase()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreCase = IGNORE_CASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringAnswerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.STRING_ANSWER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.STRING_ANSWER__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormat() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFormat(String newFormat) {
		String oldFormat = format;
		format = newFormat;
		invalidateFormatPattern();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.STRING_ANSWER__FORMAT, oldFormat, format));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRegexp() {
		return regexp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setRegexp(boolean newRegexp) {
		boolean oldRegexp = regexp;
		regexp = newRegexp;
		invalidateValuePattern();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.STRING_ANSWER__REGEXP, oldRegexp, regexp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIgnoreCase() {
		return ignoreCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIgnoreCase(boolean newIgnoreCase) {
		boolean oldIgnoreCase = ignoreCase;
		ignoreCase = newIgnoreCase;
		invalidateValuePattern();
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.STRING_ANSWER__IGNORE_CASE, oldIgnoreCase, ignoreCase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.STRING_ANSWER__VALUE:
				return getValue();
			case ExercisePackage.STRING_ANSWER__FORMAT:
				return getFormat();
			case ExercisePackage.STRING_ANSWER__REGEXP:
				return isRegexp();
			case ExercisePackage.STRING_ANSWER__IGNORE_CASE:
				return isIgnoreCase();
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
			case ExercisePackage.STRING_ANSWER__VALUE:
				setValue((String)newValue);
				return;
			case ExercisePackage.STRING_ANSWER__FORMAT:
				setFormat((String)newValue);
				return;
			case ExercisePackage.STRING_ANSWER__REGEXP:
				setRegexp((Boolean)newValue);
				return;
			case ExercisePackage.STRING_ANSWER__IGNORE_CASE:
				setIgnoreCase((Boolean)newValue);
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
			case ExercisePackage.STRING_ANSWER__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ExercisePackage.STRING_ANSWER__FORMAT:
				setFormat(FORMAT_EDEFAULT);
				return;
			case ExercisePackage.STRING_ANSWER__REGEXP:
				setRegexp(REGEXP_EDEFAULT);
				return;
			case ExercisePackage.STRING_ANSWER__IGNORE_CASE:
				setIgnoreCase(IGNORE_CASE_EDEFAULT);
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
			case ExercisePackage.STRING_ANSWER__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case ExercisePackage.STRING_ANSWER__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case ExercisePackage.STRING_ANSWER__REGEXP:
				return regexp != REGEXP_EDEFAULT;
			case ExercisePackage.STRING_ANSWER__IGNORE_CASE:
				return ignoreCase != IGNORE_CASE_EDEFAULT;
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
		result.append(" (value: ");
		result.append(value);
		result.append(", format: ");
		result.append(format);
		result.append(", regexp: ");
		result.append(regexp);
		result.append(", ignoreCase: ");
		result.append(ignoreCase);
		result.append(')');
		return result.toString();
	}
	
	//

	private Pattern valuePattern = null, formatPattern = null; 
	
	private void invalidateValuePattern() {
		valuePattern = null;
	}

	private void invalidateFormatPattern() {
		formatPattern = null;
	}

	@Override
	public Double accept(Object proposal) {
		String s = proposal.toString();
		if (format != null) {
			if (formatPattern == null) {
				formatPattern = Pattern.compile(format);
			}
			if (! formatPattern.matcher(s).matches()) {
				return null;
			}
		}
		if (isRegexp()) {
			String regex = getValue();
			if (valuePattern == null) {
				valuePattern = Pattern.compile(regex, isIgnoreCase() ? (Pattern.CASE_INSENSITIVE | Pattern.UNICODE_CASE) : 0);
			}
			return accept(valuePattern.matcher(s).matches());
		} else if (isIgnoreCase()) {
			return accept(getValue().equalsIgnoreCase(s));
		}
		return super.accept(s);
	}

} //StringAnswerImpl
