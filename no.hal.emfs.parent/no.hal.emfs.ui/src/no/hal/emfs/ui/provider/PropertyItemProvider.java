/**
 */
package no.hal.emfs.ui.provider;


import java.util.Collection;
import java.util.List;

import no.hal.emfs.EmfsFactory;
import no.hal.emfs.EmfsPackage;
import no.hal.emfs.Property;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link no.hal.emfs.Property} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class PropertyItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addValuePropertyDescriptor(object);
			addERefPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_name_feature", "_UI_Property_type"),
				 EmfsPackage.Literals.PROPERTY__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Value feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addValuePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_value_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_value_feature", "_UI_Property_type"),
				 EmfsPackage.Literals.PROPERTY__VALUE,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the ERef feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addERefPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Property_eRef_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Property_eRef_feature", "_UI_Property_type"),
				 EmfsPackage.Literals.PROPERTY__EREF,
				 true,
				 false,
				 true,
				 null,
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
			childrenFeatures.add(EmfsPackage.Literals.PROPERTY__EOBJECT);
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
	 * This returns Property.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Property"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Property)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Property_type") :
			getString("_UI_Property_type") + " " + label;
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

		switch (notification.getFeatureID(Property.class)) {
			case EmfsPackage.PROPERTY__NAME:
			case EmfsPackage.PROPERTY__VALUE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case EmfsPackage.PROPERTY__EOBJECT:
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
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createTagsOwner()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createEmfsResource()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createPropertyOwner()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createProperty()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createEmfsContainer()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createEmfsResourcesRef()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createGitContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createEmfsFile()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createByteArrayContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createStringContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createVerbatimStringContents()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createPropertyValueString()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createWrappingStringContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createURLContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createGitURLContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createGitRepoRef()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createGitContentRef()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createCachingContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createDotClasspathFileContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createClasspathEntry()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createDotProjectFileContentProvider()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createXmlStringContents()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createXmlContents()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createXmlPIElement()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createXmlTagElement()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createXmlTag()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createXmlAttribute()));

		newChildDescriptors.add
			(createChildParameter
				(EmfsPackage.Literals.PROPERTY__EOBJECT,
				 EmfsFactory.eINSTANCE.createEmfResourceStringContents()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return EmfsEditPlugin.INSTANCE;
	}

}
