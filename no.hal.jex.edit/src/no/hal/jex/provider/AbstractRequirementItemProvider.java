/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.provider;


import java.util.Collection;
import java.util.List;

import no.hal.jex.provider.JexEditPlugin;
import no.hal.jex.AbstractRequirement;
import no.hal.jex.JexFactory;
import no.hal.jex.JexPackage;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.ResourceLocator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
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
 * This is the item provider adapter for a {@link no.hal.jex.ex.AbstractRequirement} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AbstractRequirementItemProvider
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
	public AbstractRequirementItemProvider(AdapterFactory adapterFactory) {
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

			addTextPropertyDescriptor(object);
			addDescriptionPropertyDescriptor(object);
			addCommentPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Text feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRequirement_text_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRequirement_text_feature", "_UI_AbstractRequirement_type"),
				 JexPackage.Literals.ABSTRACT_REQUIREMENT__TEXT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Description feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDescriptionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRequirement_description_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRequirement_description_feature", "_UI_AbstractRequirement_type"),
				 JexPackage.Literals.ABSTRACT_REQUIREMENT__DESCRIPTION,
				 true,
				 true,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCommentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_AbstractRequirement_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_AbstractRequirement_comment_feature", "_UI_AbstractRequirement_type"),
				 JexPackage.Literals.ABSTRACT_REQUIREMENT__COMMENT,
				 true,
				 true,
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
			childrenFeatures.add(JexPackage.Literals.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS);
			childrenFeatures.add(JexPackage.Literals.ABSTRACT_REQUIREMENT__REQUIREMENTS);
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
	 * This returns AbstractRequirement.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getImage(getImageName(object)));
	}
	@Override
	public Object getImage(String imageName) {
		return getResourceLocator().getImage("full/obj16/" + imageName);
	}
	protected String getImageName(Object object) {
		return ((EObject)object).eClass().getName();
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((AbstractRequirement)object).getText();
		return label;
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

		switch (notification.getFeatureID(AbstractRequirement.class)) {
			case JexPackage.ABSTRACT_REQUIREMENT__TEXT:
			case JexPackage.ABSTRACT_REQUIREMENT__DESCRIPTION:
			case JexPackage.ABSTRACT_REQUIREMENT__COMMENT:
			case JexPackage.ABSTRACT_REQUIREMENT__CHILDREN_SATISFIED:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JexPackage.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS:
			case JexPackage.ABSTRACT_REQUIREMENT__REQUIREMENTS:
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
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS,
				 JexFactory.eINSTANCE.createJavaPack()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS,
				 JexFactory.eINSTANCE.createJavaClass()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS,
				 JexFactory.eINSTANCE.createJavaField()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS,
				 JexFactory.eINSTANCE.createJavaMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS,
				 JexFactory.eINSTANCE.createJavaClassTester()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS,
				 JexFactory.eINSTANCE.createJavaMethodTester()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__JAVA_ELEMENTS,
				 JexFactory.eINSTANCE.createTestSuite()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__REQUIREMENTS,
				 JexFactory.eINSTANCE.createJavaRequirement()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__REQUIREMENTS,
				 JexFactory.eINSTANCE.createJUnitTest()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__REQUIREMENTS,
				 JexFactory.eINSTANCE.createExercise()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.ABSTRACT_REQUIREMENT__REQUIREMENTS,
				 JexFactory.eINSTANCE.createExercisePart()));
	}

	/**
	 * This returns the icon image for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getCreateChildImage(Object owner, Object feature, Object child, Collection<?> selection) {
		if (feature instanceof EStructuralFeature && FeatureMapUtil.isFeatureMap((EStructuralFeature)feature)) {
			FeatureMap.Entry entry = (FeatureMap.Entry)child;
			feature = entry.getEStructuralFeature();
			child = entry.getValue();
		}

		if (feature instanceof EReference && child instanceof EObject) {
			String name = "full/obj16/" + ((EObject)child).eClass().getName();

			try {
				return getResourceLocator().getImage(name);
			}
			catch (Exception e) {
				JexEditPlugin.INSTANCE.log(e);
			}
		}

		return super.getCreateChildImage(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return JexEditPlugin.INSTANCE;
	}

}
