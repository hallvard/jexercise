/**
 */
package no.hal.emfs;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Classpath Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.AbstractClasspathEntry#getKind <em>Kind</em>}</li>
 *   <li>{@link no.hal.emfs.AbstractClasspathEntry#getPath <em>Path</em>}</li>
 *   <li>{@link no.hal.emfs.AbstractClasspathEntry#isExported <em>Exported</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getAbstractClasspathEntry()
 * @model abstract="true"
 * @generated
 */
public interface AbstractClasspathEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link no.hal.emfs.ClasspathEntryKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see no.hal.emfs.ClasspathEntryKind
	 * @see no.hal.emfs.EmfsPackage#getAbstractClasspathEntry_Kind()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated
	 */
	ClasspathEntryKind getKind();

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see no.hal.emfs.EmfsPackage#getAbstractClasspathEntry_Path()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="platform:/plugin/no.hal.emfs/model/emfs.ecore java='org.eclipse.jdt.launching.JRE_CONTAINER/org.eclipse.jdt.internal.debug.ui.launcher.StandardVMType/JavaSE-${major}.${minor}' junit='org.eclipse.jdt.junit.JUNIT_CONTAINER/${major}' plugins='org.eclipse.pde.core.requiredPlugins'"
	 * @generated
	 */
	String getPath();

	/**
	 * Returns the value of the '<em><b>Exported</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exported</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exported</em>' attribute.
	 * @see #setExported(boolean)
	 * @see no.hal.emfs.EmfsPackage#getAbstractClasspathEntry_Exported()
	 * @model
	 * @generated
	 */
	boolean isExported();

	/**
	 * Sets the value of the '{@link no.hal.emfs.AbstractClasspathEntry#isExported <em>Exported</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exported</em>' attribute.
	 * @see #isExported()
	 * @generated
	 */
	void setExported(boolean value);

} // AbstractClasspathEntry
