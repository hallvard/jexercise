/**
 */
package no.hal.learning.exercise.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import no.hal.learning.exercise.CharStyle;
import no.hal.learning.exercise.ExercisePackage;
import no.hal.learning.exercise.util.RGB;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Char Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.exercise.impl.CharStyleImpl#getItalic <em>Italic</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.CharStyleImpl#getBold <em>Bold</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.CharStyleImpl#getSize <em>Size</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.CharStyleImpl#getFamily <em>Family</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.CharStyleImpl#getForeground <em>Foreground</em>}</li>
 *   <li>{@link no.hal.learning.exercise.impl.CharStyleImpl#getBackground <em>Background</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CharStyleImpl extends MinimalEObjectImpl.Container implements CharStyle {
	/**
	 * The default value of the '{@link #getItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalic()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ITALIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItalic() <em>Italic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItalic()
	 * @generated
	 * @ordered
	 */
	protected Boolean italic = ITALIC_EDEFAULT;

	/**
	 * The default value of the '{@link #getBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBold()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOLD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBold() <em>Bold</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBold()
	 * @generated
	 * @ordered
	 */
	protected Boolean bold = BOLD_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final float SIZE_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected float size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFamily() <em>Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFamily()
	 * @generated
	 * @ordered
	 */
	protected String family = FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected static final RGB FOREGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getForeground() <em>Foreground</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getForeground()
	 * @generated
	 * @ordered
	 */
	protected RGB foreground = FOREGROUND_EDEFAULT;

	/**
	 * The default value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected static final RGB BACKGROUND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBackground() <em>Background</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBackground()
	 * @generated
	 * @ordered
	 */
	protected RGB background = BACKGROUND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CharStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExercisePackage.Literals.CHAR_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getItalic() {
		return italic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setItalic(Boolean newItalic) {
		Boolean oldItalic = italic;
		italic = newItalic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.CHAR_STYLE__ITALIC, oldItalic, italic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBold() {
		return bold;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBold(Boolean newBold) {
		Boolean oldBold = bold;
		bold = newBold;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.CHAR_STYLE__BOLD, oldBold, bold));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(float newSize) {
		float oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.CHAR_STYLE__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFamily() {
		return family;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFamily(String newFamily) {
		String oldFamily = family;
		family = newFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.CHAR_STYLE__FAMILY, oldFamily, family));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGB getForeground() {
		return foreground;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setForeground(RGB newForeground) {
		RGB oldForeground = foreground;
		foreground = newForeground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.CHAR_STYLE__FOREGROUND, oldForeground, foreground));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RGB getBackground() {
		return background;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBackground(RGB newBackground) {
		RGB oldBackground = background;
		background = newBackground;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExercisePackage.CHAR_STYLE__BACKGROUND, oldBackground, background));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExercisePackage.CHAR_STYLE__ITALIC:
				return getItalic();
			case ExercisePackage.CHAR_STYLE__BOLD:
				return getBold();
			case ExercisePackage.CHAR_STYLE__SIZE:
				return getSize();
			case ExercisePackage.CHAR_STYLE__FAMILY:
				return getFamily();
			case ExercisePackage.CHAR_STYLE__FOREGROUND:
				return getForeground();
			case ExercisePackage.CHAR_STYLE__BACKGROUND:
				return getBackground();
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
			case ExercisePackage.CHAR_STYLE__ITALIC:
				setItalic((Boolean)newValue);
				return;
			case ExercisePackage.CHAR_STYLE__BOLD:
				setBold((Boolean)newValue);
				return;
			case ExercisePackage.CHAR_STYLE__SIZE:
				setSize((Float)newValue);
				return;
			case ExercisePackage.CHAR_STYLE__FAMILY:
				setFamily((String)newValue);
				return;
			case ExercisePackage.CHAR_STYLE__FOREGROUND:
				setForeground((RGB)newValue);
				return;
			case ExercisePackage.CHAR_STYLE__BACKGROUND:
				setBackground((RGB)newValue);
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
			case ExercisePackage.CHAR_STYLE__ITALIC:
				setItalic(ITALIC_EDEFAULT);
				return;
			case ExercisePackage.CHAR_STYLE__BOLD:
				setBold(BOLD_EDEFAULT);
				return;
			case ExercisePackage.CHAR_STYLE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case ExercisePackage.CHAR_STYLE__FAMILY:
				setFamily(FAMILY_EDEFAULT);
				return;
			case ExercisePackage.CHAR_STYLE__FOREGROUND:
				setForeground(FOREGROUND_EDEFAULT);
				return;
			case ExercisePackage.CHAR_STYLE__BACKGROUND:
				setBackground(BACKGROUND_EDEFAULT);
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
			case ExercisePackage.CHAR_STYLE__ITALIC:
				return ITALIC_EDEFAULT == null ? italic != null : !ITALIC_EDEFAULT.equals(italic);
			case ExercisePackage.CHAR_STYLE__BOLD:
				return BOLD_EDEFAULT == null ? bold != null : !BOLD_EDEFAULT.equals(bold);
			case ExercisePackage.CHAR_STYLE__SIZE:
				return size != SIZE_EDEFAULT;
			case ExercisePackage.CHAR_STYLE__FAMILY:
				return FAMILY_EDEFAULT == null ? family != null : !FAMILY_EDEFAULT.equals(family);
			case ExercisePackage.CHAR_STYLE__FOREGROUND:
				return FOREGROUND_EDEFAULT == null ? foreground != null : !FOREGROUND_EDEFAULT.equals(foreground);
			case ExercisePackage.CHAR_STYLE__BACKGROUND:
				return BACKGROUND_EDEFAULT == null ? background != null : !BACKGROUND_EDEFAULT.equals(background);
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
		result.append(" (italic: ");
		result.append(italic);
		result.append(", bold: ");
		result.append(bold);
		result.append(", size: ");
		result.append(size);
		result.append(", family: ");
		result.append(family);
		result.append(", foreground: ");
		result.append(foreground);
		result.append(", background: ");
		result.append(background);
		result.append(')');
		return result.toString();
	}

} //CharStyleImpl
