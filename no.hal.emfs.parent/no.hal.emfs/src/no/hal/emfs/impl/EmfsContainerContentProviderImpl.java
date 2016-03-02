/**
 */
package no.hal.emfs.impl;

import java.io.File;
import java.util.Collection;

import no.hal.emfs.EmfsContainer;
import no.hal.emfs.EmfsContainerContentProvider;
import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.EmfsResource;
import no.hal.emfs.URLContentProvider;
import no.hal.emfs.exporter.ExportSupport;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Content Provider</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class EmfsContainerContentProviderImpl extends MinimalEObjectImpl.Container implements EmfsContainerContentProvider {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EmfsContainerContentProviderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmfsPackage.Literals.EMFS_CONTAINER_CONTENT_PROVIDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmfsResource> importContent(ExportSupport importSupport) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	//

	protected EList<EmfsResource> importResources(String uri, ExportSupport importSupport) {
		EList<EmfsResource> emfsResources = new BasicEList<EmfsResource>();
		File file = null;
		if (importSupport != null) {
			file = importSupport.provideExport(uri);
		}
		if (file != null && file.isDirectory()) {
			String[] fileNames = file.list();
			for (int i = 0; i < fileNames.length; i++) {
				importResources(new File(file, fileNames[i]), emfsResources);
			}
		}
		return emfsResources;
	}

	protected void importResources(File file, Collection<EmfsResource> emfsResources) {
		EmfsResource emfsResource = null;
		if (! file.exists()) {
			return;
		}
		if (file.isDirectory()) {
			EmfsContainer emfsContainer = EmfsFactory.eINSTANCE.createEmfsContainer();
			String[] fileNames = file.list();
			for (int i = 0; i < fileNames.length; i++) {
				importResources(new File(file, fileNames[i]), emfsContainer.getResources());
			}
			emfsResource = emfsContainer;
		} else {
			EmfsFile emfsFile = EmfsFactory.eINSTANCE.createEmfsFile();
			URLContentProvider contentProvider = EmfsFactory.eINSTANCE.createURLContentProvider();
			contentProvider.setUrlString("file://" + file.getAbsolutePath());
			emfsFile.setContentProvider(contentProvider);
			emfsResource = emfsFile;
		}
		if (emfsResource != null) {
			emfsResource.setName(file.getName());
			if (emfsResources != null) {
				emfsResources.add(emfsResource);
			}
		}
	}

} //EmfsContainerContentProviderImpl
