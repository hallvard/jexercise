/**
 */
package no.hal.learning.quiz.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.learning.quiz.CharStyle;
import no.hal.learning.quiz.QuizFactory;
import no.hal.learning.quiz.QuizPackage;
import no.hal.learning.quiz.StyledString;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Styled String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.quiz.impl.StyledStringImpl#getCharStyle <em>Char Style</em>}</li>
 *   <li>{@link no.hal.learning.quiz.impl.StyledStringImpl#getEffectiveCharStyle <em>Effective Char Style</em>}</li>
 *   <li>{@link no.hal.learning.quiz.impl.StyledStringImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link no.hal.learning.quiz.impl.StyledStringImpl#getStyledString <em>Styled String</em>}</li>
 *   <li>{@link no.hal.learning.quiz.impl.StyledStringImpl#getSuffix <em>Suffix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StyledStringImpl extends MinimalEObjectImpl.Container implements StyledString {
	/**
	 * The cached value of the '{@link #getCharStyle() <em>Char Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharStyle()
	 * @generated
	 * @ordered
	 */
	protected CharStyle charStyle;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected String prefix = PREFIX_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStyledString() <em>Styled String</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStyledString()
	 * @generated
	 * @ordered
	 */
	protected StyledString styledString;

	/**
	 * The default value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected static final String SUFFIX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSuffix() <em>Suffix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuffix()
	 * @generated
	 * @ordered
	 */
	protected String suffix = SUFFIX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StyledStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return QuizPackage.Literals.STYLED_STRING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharStyle getCharStyle() {
		return charStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCharStyle(CharStyle newCharStyle, NotificationChain msgs) {
		CharStyle oldCharStyle = charStyle;
		charStyle = newCharStyle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuizPackage.STYLED_STRING__CHAR_STYLE, oldCharStyle, newCharStyle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCharStyle(CharStyle newCharStyle) {
		if (newCharStyle != charStyle) {
			NotificationChain msgs = null;
			if (charStyle != null)
				msgs = ((InternalEObject)charStyle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuizPackage.STYLED_STRING__CHAR_STYLE, null, msgs);
			if (newCharStyle != null)
				msgs = ((InternalEObject)newCharStyle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuizPackage.STYLED_STRING__CHAR_STYLE, null, msgs);
			msgs = basicSetCharStyle(newCharStyle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.STYLED_STRING__CHAR_STYLE, newCharStyle, newCharStyle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CharStyle getEffectiveCharStyle() {
		CharStyle effectiveCharStyle = basicGetEffectiveCharStyle();
		return effectiveCharStyle != null && effectiveCharStyle.eIsProxy() ? (CharStyle)eResolveProxy((InternalEObject)effectiveCharStyle) : effectiveCharStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public CharStyle basicGetEffectiveCharStyle() {
		CharStyle effectiveCharStyle = QuizFactory.eINSTANCE.createCharStyle();
		computeEffectiveCharStyle(this, effectiveCharStyle);
		return effectiveCharStyle;
	}
	
	private void setFeaturesIfNonNull(CharStyle effectiveCharStyle, StyledString styledString, EStructuralFeature... features) {
		for (EStructuralFeature feature : features) {
			Object value = styledString.getCharStyle().eGet(feature);
			if (value != null) {
				effectiveCharStyle.eSet(feature, value);
			}
		}
	}

	private void computeEffectiveCharStyle(StyledString styledString, CharStyle effectiveCharStyle) {
		if (styledString.eContainer() instanceof StyledString) {
			computeEffectiveCharStyle((StyledString) styledString.eContainer(), effectiveCharStyle);
		}
		setFeaturesIfNonNull(effectiveCharStyle, styledString,
				QuizPackage.eINSTANCE.getCharStyle_Italic(), QuizPackage.eINSTANCE.getCharStyle_Bold(),
				QuizPackage.eINSTANCE.getCharStyle_Size(), QuizPackage.eINSTANCE.getCharStyle_Family(),
				QuizPackage.eINSTANCE.getCharStyle_Foreground(), QuizPackage.eINSTANCE.getCharStyle_Background()
		);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return prefix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		String oldPrefix = prefix;
		prefix = newPrefix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.STYLED_STRING__PREFIX, oldPrefix, prefix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StyledString getStyledString() {
		return styledString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStyledString(StyledString newStyledString, NotificationChain msgs) {
		StyledString oldStyledString = styledString;
		styledString = newStyledString;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, QuizPackage.STYLED_STRING__STYLED_STRING, oldStyledString, newStyledString);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStyledString(StyledString newStyledString) {
		if (newStyledString != styledString) {
			NotificationChain msgs = null;
			if (styledString != null)
				msgs = ((InternalEObject)styledString).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - QuizPackage.STYLED_STRING__STYLED_STRING, null, msgs);
			if (newStyledString != null)
				msgs = ((InternalEObject)newStyledString).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - QuizPackage.STYLED_STRING__STYLED_STRING, null, msgs);
			msgs = basicSetStyledString(newStyledString, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.STYLED_STRING__STYLED_STRING, newStyledString, newStyledString));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSuffix() {
		return suffix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSuffix(String newSuffix) {
		String oldSuffix = suffix;
		suffix = newSuffix;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, QuizPackage.STYLED_STRING__SUFFIX, oldSuffix, suffix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case QuizPackage.STYLED_STRING__CHAR_STYLE:
				return basicSetCharStyle(null, msgs);
			case QuizPackage.STYLED_STRING__STYLED_STRING:
				return basicSetStyledString(null, msgs);
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
			case QuizPackage.STYLED_STRING__CHAR_STYLE:
				return getCharStyle();
			case QuizPackage.STYLED_STRING__EFFECTIVE_CHAR_STYLE:
				if (resolve) return getEffectiveCharStyle();
				return basicGetEffectiveCharStyle();
			case QuizPackage.STYLED_STRING__PREFIX:
				return getPrefix();
			case QuizPackage.STYLED_STRING__STYLED_STRING:
				return getStyledString();
			case QuizPackage.STYLED_STRING__SUFFIX:
				return getSuffix();
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
			case QuizPackage.STYLED_STRING__CHAR_STYLE:
				setCharStyle((CharStyle)newValue);
				return;
			case QuizPackage.STYLED_STRING__PREFIX:
				setPrefix((String)newValue);
				return;
			case QuizPackage.STYLED_STRING__STYLED_STRING:
				setStyledString((StyledString)newValue);
				return;
			case QuizPackage.STYLED_STRING__SUFFIX:
				setSuffix((String)newValue);
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
			case QuizPackage.STYLED_STRING__CHAR_STYLE:
				setCharStyle((CharStyle)null);
				return;
			case QuizPackage.STYLED_STRING__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case QuizPackage.STYLED_STRING__STYLED_STRING:
				setStyledString((StyledString)null);
				return;
			case QuizPackage.STYLED_STRING__SUFFIX:
				setSuffix(SUFFIX_EDEFAULT);
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
			case QuizPackage.STYLED_STRING__CHAR_STYLE:
				return charStyle != null;
			case QuizPackage.STYLED_STRING__EFFECTIVE_CHAR_STYLE:
				return basicGetEffectiveCharStyle() != null;
			case QuizPackage.STYLED_STRING__PREFIX:
				return PREFIX_EDEFAULT == null ? prefix != null : !PREFIX_EDEFAULT.equals(prefix);
			case QuizPackage.STYLED_STRING__STYLED_STRING:
				return styledString != null;
			case QuizPackage.STYLED_STRING__SUFFIX:
				return SUFFIX_EDEFAULT == null ? suffix != null : !SUFFIX_EDEFAULT.equals(suffix);
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
		result.append(" (prefix: ");
		result.append(prefix);
		result.append(", suffix: ");
		result.append(suffix);
		result.append(')');
		return result.toString();
	}

} //StyledStringImpl
