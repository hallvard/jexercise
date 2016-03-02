/**
 */
package no.hal.emfs.impl;

import java.util.Collection;

import no.hal.emfs.AbstractClasspathEntry;
import no.hal.emfs.DotClasspathFileContentProvider;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.util.Util;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dot Classpath File Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.impl.DotClasspathFileContentProviderImpl#getEntries <em>Entries</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DotClasspathFileContentProviderImpl extends AbstractStringContentProviderImpl implements DotClasspathFileContentProvider {
	/**
	 * The cached value of the '{@link #getEntries() <em>Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractClasspathEntry> entries;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DotClasspathFileContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.DOT_CLASSPATH_FILE_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractClasspathEntry> getEntries() {
		if (entries == null) {
			entries = new EObjectContainmentEList<AbstractClasspathEntry>(AbstractClasspathEntry.class, this, EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES);
		}
		return entries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES:
				return ((InternalEList<?>)getEntries()).basicRemove(otherEnd, msgs);
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
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES:
				return getEntries();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES:
				getEntries().clear();
				getEntries().addAll((Collection<? extends AbstractClasspathEntry>)newValue);
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
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES:
				getEntries().clear();
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
			case EmfsPackage.DOT_CLASSPATH_FILE_CONTENT_PROVIDER__ENTRIES:
				return entries != null && !entries.isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	//

	@Override
	public String getStringContent() {
		StringBuilder buffer = new StringBuilder();
		buffer.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n<classpath>\n");
		for (AbstractClasspathEntry classpathEntry : getEntries()) {
			buffer.append("\t<classpathentry");
			buffer.append(" kind=\"" + classpathEntry.getKind() + "\"");
			String path = classpathEntry.getPath();
			path = replaceAnnotationProperties(path, EmfsPackage.eINSTANCE.getAbstractClasspathEntry_Path(), classpathEntry);
			buffer.append(" path=\"" + path + "\"");
			buffer.append("/>\n");
		}
		buffer.append("</classpath>");
		return buffer.toString();
	}
	
	private String replaceAnnotationProperties(String s, ENamedElement element, EObject properties) {
		EAnnotation annotations = element.getEAnnotation(EmfsPackage.eNS_URI);
		String value = annotations.getDetails().get(s);
		if (value != null) {
			s = value;
		}
		return Util.replaceProperties(s, properties);
	}

} //DotClasspathFileContentImpl
