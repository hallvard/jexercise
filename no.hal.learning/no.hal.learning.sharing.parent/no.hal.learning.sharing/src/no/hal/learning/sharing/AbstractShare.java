/**
 */
package no.hal.learning.sharing;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Share</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.learning.sharing.AbstractShare#getName <em>Name</em>}</li>
 *   <li>{@link no.hal.learning.sharing.AbstractShare#getOwner <em>Owner</em>}</li>
 *   <li>{@link no.hal.learning.sharing.AbstractShare#getSharer <em>Sharer</em>}</li>
 *   <li>{@link no.hal.learning.sharing.AbstractShare#getMode <em>Mode</em>}</li>
 * </ul>
 *
 * @see no.hal.learning.sharing.SharingPackage#getAbstractShare()
 * @model
 * @generated
 */
public interface AbstractShare extends EObject {
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
	 * @see no.hal.learning.sharing.SharingPackage#getAbstractShare_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link no.hal.learning.sharing.AbstractShare#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Owner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' attribute.
	 * @see #setOwner(String)
	 * @see no.hal.learning.sharing.SharingPackage#getAbstractShare_Owner()
	 * @model
	 * @generated
	 */
	String getOwner();

	/**
	 * Sets the value of the '{@link no.hal.learning.sharing.AbstractShare#getOwner <em>Owner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' attribute.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(String value);

	/**
	 * Returns the value of the '<em><b>Sharer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sharer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sharer</em>' attribute.
	 * @see #setSharer(String)
	 * @see no.hal.learning.sharing.SharingPackage#getAbstractShare_Sharer()
	 * @model
	 * @generated
	 */
	String getSharer();

	/**
	 * Sets the value of the '{@link no.hal.learning.sharing.AbstractShare#getSharer <em>Sharer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharer</em>' attribute.
	 * @see #getSharer()
	 * @generated
	 */
	void setSharer(String value);

	/**
	 * Returns the value of the '<em><b>Mode</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.learning.sharing.ShareMode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mode</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mode</em>' attribute.
	 * @see no.hal.learning.sharing.ShareMode
	 * @see #setMode(ShareMode)
	 * @see no.hal.learning.sharing.SharingPackage#getAbstractShare_Mode()
	 * @model
	 * @generated
	 */
	ShareMode getMode();

	/**
	 * Sets the value of the '{@link no.hal.learning.sharing.AbstractShare#getMode <em>Mode</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mode</em>' attribute.
	 * @see no.hal.learning.sharing.ShareMode
	 * @see #getMode()
	 * @generated
	 */
	void setMode(ShareMode value);

} // AbstractShare
