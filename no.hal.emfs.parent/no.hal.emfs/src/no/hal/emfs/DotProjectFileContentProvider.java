/**
 */
package no.hal.emfs;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot Project File Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.DotProjectFileContentProvider#getKeys <em>Keys</em>}</li>
 *   <li>{@link no.hal.emfs.DotProjectFileContentProvider#getLinkedResources <em>Linked Resources</em>}</li>
 * </ul>
 *
 * @see no.hal.emfs.EmfsPackage#getDotProjectFileContentProvider()
 * @model annotation="org.eclipse.core.resources.natures java='org.eclipse.jdt.core.javanature' pde='org.eclipse.pde.PluginNature'"
 *        annotation="org.eclipse.core.resources.builders java='org.eclipse.jdt.core.javabuilder' pde='org.eclipse.pde.ManifestBuilder,org.eclipse.pde.SchemaBuilder'"
 * @generated
 */
public interface DotProjectFileContentProvider extends AbstractStringContentProvider {
	/**
	 * Returns the value of the '<em><b>Keys</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keys</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keys</em>' attribute list.
	 * @see no.hal.emfs.EmfsPackage#getDotProjectFileContentProvider_Keys()
	 * @model
	 * @generated
	 */
	EList<String> getKeys();

	/**
	 * Returns the value of the '<em><b>Linked Resources</b></em>' reference list.
	 * The list contents are of type {@link no.hal.emfs.EmfsResource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Linked Resources</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Linked Resources</em>' reference list.
	 * @see no.hal.emfs.EmfsPackage#getDotProjectFileContentProvider_LinkedResources()
	 * @model
	 * @generated
	 */
	EList<EmfsResource> getLinkedResources();

} // DotProjectFileContent
