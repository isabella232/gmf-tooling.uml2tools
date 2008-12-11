package org.eclipse.uml2.diagram.common.sheet;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositePropertySource;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.ui.views.properties.IPropertyDescriptor;

public class PropertySourceExtension extends EMFCompositePropertySource {

	private final AdapterFactory myItemProvidersAdapterFactory;
	private final IDialogSettings myDialogSettings;

	protected PropertySourceExtension(Object object, IItemPropertySource itemPropertySource, String category, AdapterFactory itemProvidersAdapterFactory, IDialogSettings dialogSettings) {
		super(object, itemPropertySource, category);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		myDialogSettings = dialogSettings;
	}

	public PropertySourceExtension(Object object, IItemPropertySource itemPropertySource, AdapterFactory itemProvidersAdapterFactory, IDialogSettings dialogSettings) {
		super(object, itemPropertySource);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		myDialogSettings = dialogSettings;
	}

	public PropertySourceExtension(Object object, IItemPropertySource itemPropertySource, AdapterFactory itemProvidersAdapterFactory) {
		super(object, itemPropertySource);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
		myDialogSettings = null;
	}

	@Override
	protected IPropertyDescriptor newPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
        if (itemPropertyDescriptor.getFeature(object) instanceof EReference && !itemPropertyDescriptor.isMany(object)) {
			return new ReferencePropertyDescriptor(object, itemPropertyDescriptor, getCategory(), myItemProvidersAdapterFactory, myDialogSettings);
		}
		return super.newPropertyDescriptor(itemPropertyDescriptor);
	}

}
