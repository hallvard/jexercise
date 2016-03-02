/**
 */
package no.hal.emfs.ui.provider;


import java.util.Collection;
import java.util.List;

import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsFile;
import no.hal.emfs.EmfsPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.ui.IEditorRegistry;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

/**
 * This is the item provider adapter for a {@link no.hal.emfs.EmfsFile} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class EmfsFileItemProvider extends EmfsResourceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmfsFileItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER);
			childrenFeatures.add(EmfsPackage.Literals.EMFS_FILE__VERSIONS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	private IEditorRegistry editorRegistry= null;

	private IEditorRegistry getEditorRegistry() {
		if (editorRegistry == null) {
			editorRegistry= PlatformUI.getWorkbench().getEditorRegistry();
		}
		return editorRegistry;
	}

	/**
	 * This returns EmfsFile.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public Object getImage(Object object) {
		IEditorRegistry editorRegistry = getEditorRegistry();
		ImageDescriptor imageDescriptor = editorRegistry.getImageDescriptor(((EmfsFile) object).getName());
		return (imageDescriptor != null ? imageDescriptor : PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_FILE));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
		return super.getText(object);
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(EmfsFile.class)) {
			case EmfsPackage.EMFS_FILE__CONTENT_PROVIDER:
			case EmfsPackage.EMFS_FILE__VERSIONS:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createEmfsFile()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createByteArrayContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createStringContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createWrappingStringContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createURLContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createGitURLContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createCachingContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createDotClasspathFileContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createDotProjectFileContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createXmlStringContents()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER,
				 EmfsFactory.eINSTANCE.createEmfResourceStringContents()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createEmfsFile()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createByteArrayContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createStringContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createWrappingStringContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createURLContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createGitURLContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createCachingContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createDotClasspathFileContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createDotProjectFileContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createXmlStringContents()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.EMFS_FILE__VERSIONS,
				 EmfsFactory.eINSTANCE.createEmfResourceStringContents()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == EmfsPackage.Literals.EMFS_FILE__CONTENT_PROVIDER ||
			childFeature == EmfsPackage.Literals.EMFS_FILE__VERSIONS;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
