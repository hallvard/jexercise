/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package no.hal.jex.provider;


import java.util.Collection;
import java.util.List;

import no.hal.jex.ClassKind;
import no.hal.jex.JavaClass;
import no.hal.jex.JexFactory;
import no.hal.jex.JexPackage;
import no.hal.jex.impl.JexFactoryImpl;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link no.hal.jex.JavaClass} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaClassItemProvider
	extends MemberItemProvider
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
	public JavaClassItemProvider(AdapterFactory adapterFactory) {
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

			addClassKindPropertyDescriptor(object);
			addSuperclassesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Class Kind feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addClassKindPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaClass_classKind_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaClass_classKind_feature", "_UI_JavaClass_type"),
				 JexPackage.Literals.JAVA_CLASS__CLASS_KIND,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Superclasses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSuperclassesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_JavaClass_superclasses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_JavaClass_superclasses_feature", "_UI_JavaClass_type"),
				 JexPackage.Literals.JAVA_CLASS__SUPERCLASSES,
				 true,
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
			childrenFeatures.add(JexPackage.Literals.JAVA_CLASS__MEMBERS);
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
	 * This returns JavaClass.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
	 */
	@Override
	public Object getImage(Object object) {
		return super.getImage(object);
	}
	
	@Override
	public String getImageName(Object object) {
		JavaClass javaClass = (JavaClass)object;
		if (javaClass.getClassKind() == ClassKind.INTERFACE_KIND) {
			return JDT_UI_IMAGE_PREFIX + "int_obj.gif";
		} else if (javaClass.getClassKind() == ClassKind.ENUM_KIND) {
			String modifierString = getAccessModifierString(javaClass, JexFactoryImpl.getModifier("public"), null);
			return JDT_UI_IMAGE_PREFIX + "enum_" + (modifierString != null ? modifierString + "_" : "") + "obj.gif";
		}
		return JDT_UI_IMAGE_PREFIX + "class_obj.gif";
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @NOT generated
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

		switch (notification.getFeatureID(JavaClass.class)) {
			case JexPackage.JAVA_CLASS__CLASS_KIND:
			case JexPackage.JAVA_CLASS__SUPERCLASSES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case JexPackage.JAVA_CLASS__MEMBERS:
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
				(JexPackage.Literals.JAVA_CLASS__MEMBERS,
				 JexFactory.eINSTANCE.createJavaClass()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.JAVA_CLASS__MEMBERS,
				 JexFactory.eINSTANCE.createJavaField()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.JAVA_CLASS__MEMBERS,
				 JexFactory.eINSTANCE.createJavaMethod()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.JAVA_CLASS__MEMBERS,
				 JexFactory.eINSTANCE.createJavaClassTester()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.JAVA_CLASS__MEMBERS,
				 JexFactory.eINSTANCE.createJavaMethodTester()));

		newChildDescriptors.add
			(createChildParameter
				(JexPackage.Literals.JAVA_CLASS__MEMBERS,
				 JexFactory.eINSTANCE.createTestSuite()));
	}

}
