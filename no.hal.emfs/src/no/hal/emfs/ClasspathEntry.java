/**
 */
package no.hal.emfs;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classpath Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.emfs.ClasspathEntry#getExplicitKind <em>Explicit Kind</em>}</li>
 *   <li>{@link no.hal.emfs.ClasspathEntry#getExplicitPath <em>Explicit Path</em>}</li>
 *   <li>{@link no.hal.emfs.ClasspathEntry#getMajor <em>Major</em>}</li>
 *   <li>{@link no.hal.emfs.ClasspathEntry#getMinor <em>Minor</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.emfs.EmfsPackage#getClasspathEntry()
 * @model
 * @generated
 */
public interface ClasspathEntry extends AbstractClasspathEntry {
	/**
	 * Returns the value of the '<em><b>Explicit Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.emfs.ClasspathEntryKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Kind</em>' attribute.
	 * @see no.hal.emfs.ClasspathEntryKind
	 * @see #setExplicitKind(ClasspathEntryKind)
	 * @see no.hal.emfs.EmfsPackage#getClasspathEntry_ExplicitKind()
	 * @model
	 * @generated
	 */
	ClasspathEntryKind getExplicitKind();

	/**
	 * Sets the value of the '{@link no.hal.emfs.ClasspathEntry#getExplicitKind <em>Explicit Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Kind</em>' attribute.
	 * @see no.hal.emfs.ClasspathEntryKind
	 * @see #getExplicitKind()
	 * @generated
	 */
	void setExplicitKind(ClasspathEntryKind value);

	/**
	 * Returns the value of the '<em><b>Explicit Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Explicit Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Explicit Path</em>' attribute.
	 * @see #setExplicitPath(String)
	 * @see no.hal.emfs.EmfsPackage#getClasspathEntry_ExplicitPath()
	 * @model
	 * @generated
	 */
	String getExplicitPath();

	/**
	 * Sets the value of the '{@link no.hal.emfs.ClasspathEntry#getExplicitPath <em>Explicit Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Explicit Path</em>' attribute.
	 * @see #getExplicitPath()
	 * @generated
	 */
	void setExplicitPath(String value);

	/**
	 * Returns the value of the '<em><b>Major</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Major</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Major</em>' attribute.
	 * @see #setMajor(int)
	 * @see no.hal.emfs.EmfsPackage#getClasspathEntry_Major()
	 * @model
	 * @generated
	 */
	int getMajor();

	/**
	 * Sets the value of the '{@link no.hal.emfs.ClasspathEntry#getMajor <em>Major</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Major</em>' attribute.
	 * @see #getMajor()
	 * @generated
	 */
	void setMajor(int value);

	/**
	 * Returns the value of the '<em><b>Minor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Minor</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minor</em>' attribute.
	 * @see #setMinor(int)
	 * @see no.hal.emfs.EmfsPackage#getClasspathEntry_Minor()
	 * @model
	 * @generated
	 */
	int getMinor();

	/**
	 * Sets the value of the '{@link no.hal.emfs.ClasspathEntry#getMinor <em>Minor</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minor</em>' attribute.
	 * @see #getMinor()
	 * @generated
	 */
	void setMinor(int value);

} // ClasspathEntry
