/**
 */
package no.hal.emfs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Emf Resource String Contents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.EmfResourceStringContents#getEObject <em>EObject</em>}</li>
 *   <li>{@link no.hal.emfs.EmfResourceStringContents#getFactory <em>Factory</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getEmfResourceStringContents()
 * @model
 * @generated
 */
public interface EmfResourceStringContents extends AbstractStringContentProvider {
	/**
	 * Returns the value of the '<em><b>EObject</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EObject</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EObject</em>' reference.
	 * @see #setEObject(EObject)
	 * @see no.hal.emfs.EmfsPackage#getEmfResourceStringContents_EObject()
	 * @model
	 * @generated
	 */
	EObject getEObject();

	/**
	 * Sets the value of the '{@link no.hal.emfs.EmfResourceStringContents#getEObject <em>EObject</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EObject</em>' reference.
	 * @see #getEObject()
	 * @generated
	 */
	void setEObject(EObject value);

	/**
	 * Returns the value of the '<em><b>Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Factory</em>' attribute.
	 * @see #setFactory(String)
	 * @see no.hal.emfs.EmfsPackage#getEmfResourceStringContents_Factory()
	 * @model
	 * @generated
	 */
	String getFactory();

	/**
	 * Sets the value of the '{@link no.hal.emfs.EmfResourceStringContents#getFactory <em>Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Factory</em>' attribute.
	 * @see #getFactory()
	 * @generated
	 */
	void setFactory(String value);

} // EmfResourceStringContents
