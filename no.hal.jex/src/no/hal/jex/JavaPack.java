/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex;


import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link no.hal.jex.JavaPack#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.jex.JavaPack#getClasses <em>Classes</em>}</li>
 *   <li>{@link no.hal.jex.JavaPack#getSourceLocation <em>Source Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see no.hal.jex.JexPackage#getJavaPack()
 * @model
 * @generated
 */
public interface JavaPack extends JavaElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see no.hal.jex.JexPackage#getJavaPack_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaPack#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Classes</b></em>' containment reference list.
	 * The list contents are of type {@link no.hal.jex.JavaClass}.
	 * It is bidirectional and its opposite is '{@link no.hal.jex.JavaClass#getPack <em>Pack</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Classes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Classes</em>' containment reference list.
	 * @see no.hal.jex.JexPackage#getJavaPack_Classes()
	 * @see no.hal.jex.JavaClass#getPack
	 * @model opposite="pack" containment="true"
	 * @generated
	 */
	EList<JavaClass> getClasses();

	/**
	 * Returns the value of the '<em><b>Source Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Location</em>' attribute.
	 * @see #setSourceLocation(String)
	 * @see no.hal.jex.JexPackage#getJavaPack_SourceLocation()
	 * @model
	 * @generated
	 */
	String getSourceLocation();

	/**
	 * Sets the value of the '{@link no.hal.jex.JavaPack#getSourceLocation <em>Source Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Location</em>' attribute.
	 * @see #getSourceLocation()
	 * @generated
	 */
	void setSourceLocation(String value);

} // JavaPack
