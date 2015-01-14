/**
 */
package no.hal.emfs;

import no.hal.emfs.util.ImportSupport;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see no.hal.emfs.EmfsPackage#getEmfsContainerContentProvider()
 * @model abstract="true"
 * @generated
 */
public interface EmfsContainerContentProvider extends EObject {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model importSupportDataType="no.hal.emfs.ImportSupport"
	 * @generated
	 */
	EList<EmfsResource> importContent(ImportSupport importSupport);
} // EmfsContainerContentProvider
