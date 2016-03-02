/**
 */
package no.hal.emfs.sync.provider;


import java.util.Collection;
import java.util.List;

import no.hal.emfs.sync.PathRule;
import no.hal.emfs.sync.SyncFactory;
import no.hal.emfs.sync.SyncPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link no.hal.emfs.sync.PathRule} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PathRuleItemProvider extends EmfsResourceRuleItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PathRuleItemProvider(AdapterFactory adapterFactory) {
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

			addFullPathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Full Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFullPathPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_PathRule_fullPath_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_PathRule_fullPath_feature", "_UI_PathRule_type"),
				 SyncPackage.Literals.PATH_RULE__FULL_PATH,
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
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
			childrenFeatures.add(SyncPackage.Literals.PATH_RULE__PATH);
			childrenFeatures.add(SyncPackage.Literals.PATH_RULE__TARGET_PATH);
			childrenFeatures.add(SyncPackage.Literals.PATH_RULE__INCLUDES);
			childrenFeatures.add(SyncPackage.Literals.PATH_RULE__EXCLUDES);
			childrenFeatures.add(SyncPackage.Literals.PATH_RULE__TAGS);
			childrenFeatures.add(SyncPackage.Literals.PATH_RULE__PROPERTIES);
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

	/**
	 * This returns PathRule.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/PathRule"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((PathRule<?>)object).getFullPath();
		return label == null || label.length() == 0 ?
			getString("_UI_PathRule_type") :
			getString("_UI_PathRule_type") + " " + label;
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

		switch (notification.getFeatureID(PathRule.class)) {
			case SyncPackage.PATH_RULE__FULL_PATH:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SyncPackage.PATH_RULE__PATH:
			case SyncPackage.PATH_RULE__TARGET_PATH:
			case SyncPackage.PATH_RULE__INCLUDES:
			case SyncPackage.PATH_RULE__EXCLUDES:
			case SyncPackage.PATH_RULE__TAGS:
			case SyncPackage.PATH_RULE__PROPERTIES:
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
				(SyncPackage.Literals.PATH_RULE__PATH,
				 SyncFactory.eINSTANCE.createRelativePath()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__TARGET_PATH,
				 SyncFactory.eINSTANCE.createRelativePath()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__INCLUDES,
				 SyncFactory.eINSTANCE.createPathRule()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__INCLUDES,
				 SyncFactory.eINSTANCE.createExportRule()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__INCLUDES,
				 SyncFactory.eINSTANCE.createImportRule()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__EXCLUDES,
				 SyncFactory.eINSTANCE.createPathRule()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__EXCLUDES,
				 SyncFactory.eINSTANCE.createExportRule()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__EXCLUDES,
				 SyncFactory.eINSTANCE.createImportRule()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__TAGS,
				 SyncFactory.eINSTANCE.createTagsRule()));

		newChildDescriptors.add
			(createChildParameter
				(SyncPackage.Literals.PATH_RULE__PROPERTIES,
				 SyncFactory.eINSTANCE.createPropertiesRule()));
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
			childFeature == SyncPackage.Literals.PATH_RULE__PATH ||
			childFeature == SyncPackage.Literals.PATH_RULE__TARGET_PATH ||
			childFeature == SyncPackage.Literals.PATH_RULE__INCLUDES ||
			childFeature == SyncPackage.Literals.PATH_RULE__EXCLUDES;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
