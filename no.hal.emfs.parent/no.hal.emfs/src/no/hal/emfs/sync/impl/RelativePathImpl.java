/**
 */
package no.hal.emfs.sync.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeEList;

import no.hal.emfs.sync.RelativePath;
import no.hal.emfs.sync.ResourcePath;
import no.hal.emfs.sync.SyncPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Path</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link no.hal.emfs.sync.impl.RelativePathImpl#getSegments <em>Segments</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.RelativePathImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link no.hal.emfs.sync.impl.RelativePathImpl#getFullPath <em>Full Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RelativePathImpl extends MinimalEObjectImpl.Container implements RelativePath {
	/**
	 * The cached value of the '{@link #getSegments() <em>Segments</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegments()
	 * @generated
	 * @ordered
	 */
	protected EList<String> segments;

	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected ResourcePath container;

	/**
	 * The default value of the '{@link #getFullPath() <em>Full Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPath()
	 * @generated
	 * @ordered
	 */
	protected static final String FULL_PATH_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelativePathImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SyncPackage.Literals.RELATIVE_PATH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<String> getSegments() {
		if (segments == null) {
			segments = new EDataTypeEList<String>(String.class, this, SyncPackage.RELATIVE_PATH__SEGMENTS);
		}
		return segments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourcePath getContainer() {
		if (container != null && container.eIsProxy()) {
			InternalEObject oldContainer = (InternalEObject)container;
			container = (ResourcePath)eResolveProxy(oldContainer);
			if (container != oldContainer) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SyncPackage.RELATIVE_PATH__CONTAINER, oldContainer, container));
			}
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourcePath basicGetContainer() {
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContainer(ResourcePath newContainer) {
		ResourcePath oldContainer = container;
		container = newContainer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SyncPackage.RELATIVE_PATH__CONTAINER, oldContainer, container));
	}

	static void buildFullPath(Iterable<String> segments, StringBuilder buffer) {
		for (String segment : segments) {
			buffer.append("/");
			buffer.append(segment);
		}
	}

	static void buildFullPath(ResourcePath path, StringBuilder buffer) {
		if (path instanceof RelativePath) {
			buildFullPath(((RelativePath) path).getContainer(), buffer);
		}
		if (path instanceof RelativePath) {
			buildFullPath(((RelativePath) path).getSegments(), buffer); 
		} else if (path != null) {
			buildFullPath(((RelativePath) path).getPath(), buffer);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getFullPath() {
		StringBuilder buffer = new StringBuilder();
		buildFullPath(this, buffer);
		return buffer.toString();
	}

	static void buildFullPath(Iterable<String> segments, Collection<String> buffer) {
		for (String segment : segments) {
			String[] ss = segment.split("/");
			buffer.addAll(Arrays.asList(ss));
		}
	}

	static void buildFullPath(ResourcePath path, Collection<String> buffer) {
		if (path instanceof RelativePath) {
			buildFullPath(((RelativePath) path).getContainer(), buffer);
		}
		if (path instanceof RelativePath) {
			buffer.addAll(((RelativePath) path).getSegments());
		} else if (path != null) {
			buffer.addAll(((RelativePath) path).getPath());
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<String> getPath() {
		EList<String> result = new BasicEList<String>();
		buildFullPath(this, result);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SyncPackage.RELATIVE_PATH__SEGMENTS:
				return getSegments();
			case SyncPackage.RELATIVE_PATH__CONTAINER:
				if (resolve) return getContainer();
				return basicGetContainer();
			case SyncPackage.RELATIVE_PATH__FULL_PATH:
				return getFullPath();
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
			case SyncPackage.RELATIVE_PATH__SEGMENTS:
				getSegments().clear();
				getSegments().addAll((Collection<? extends String>)newValue);
				return;
			case SyncPackage.RELATIVE_PATH__CONTAINER:
				setContainer((ResourcePath)newValue);
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
			case SyncPackage.RELATIVE_PATH__SEGMENTS:
				getSegments().clear();
				return;
			case SyncPackage.RELATIVE_PATH__CONTAINER:
				setContainer((ResourcePath)null);
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
			case SyncPackage.RELATIVE_PATH__SEGMENTS:
				return segments != null && !segments.isEmpty();
			case SyncPackage.RELATIVE_PATH__CONTAINER:
				return container != null;
			case SyncPackage.RELATIVE_PATH__FULL_PATH:
				return FULL_PATH_EDEFAULT == null ? getFullPath() != null : !FULL_PATH_EDEFAULT.equals(getFullPath());
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SyncPackage.RELATIVE_PATH___GET_PATH:
				return getPath();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (segments: ");
		result.append(segments);
		result.append(')');
		return result.toString();
	}

} //RelativePathImpl
