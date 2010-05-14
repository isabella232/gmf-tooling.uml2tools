/**
 * <copyright>
 * </copyright>
 *
 * $Id: LinkToolStackSupportAttributeItemProvider.java,v 1.1 2010/05/14 17:15:05 mgolubev Exp $
 */
package org.eclipse.uml2.diagram.codegen.u2tgen.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

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

import org.eclipse.uml2.diagram.codegen.edit.GMFExtEditPlugin;

import org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute;
import org.eclipse.uml2.diagram.codegen.u2tgen.U2TGenPackage;

/**
 * This is the item provider adapter for a {@link org.eclipse.uml2.diagram.codegen.u2tgen.LinkToolStackSupportAttribute} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LinkToolStackSupportAttributeItemProvider
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
	public LinkToolStackSupportAttributeItemProvider(AdapterFactory adapterFactory) {
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

			addToolClassProviderNamePropertyDescriptor(object);
			addBaseSemanticClassNamePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Tool Class Provider Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addToolClassProviderNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinkToolStackSupportAttribute_toolClassProviderName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinkToolStackSupportAttribute_toolClassProviderName_feature", "_UI_LinkToolStackSupportAttribute_type"),
				 U2TGenPackage.Literals.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Base Semantic Class Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBaseSemanticClassNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_LinkToolStackSupportAttribute_baseSemanticClassName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_LinkToolStackSupportAttribute_baseSemanticClassName_feature", "_UI_LinkToolStackSupportAttribute_type"),
				 U2TGenPackage.Literals.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns LinkToolStackSupportAttribute.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LinkToolStackSupportAttribute"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((LinkToolStackSupportAttribute)object).getToolClassProviderName();
		return label == null || label.length() == 0 ?
			getString("_UI_LinkToolStackSupportAttribute_type") :
			getString("_UI_LinkToolStackSupportAttribute_type") + " " + label;
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

		switch (notification.getFeatureID(LinkToolStackSupportAttribute.class)) {
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__TOOL_CLASS_PROVIDER_NAME:
			case U2TGenPackage.LINK_TOOL_STACK_SUPPORT_ATTRIBUTE__BASE_SEMANTIC_CLASS_NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GMFExtEditPlugin.INSTANCE;
	}

}
