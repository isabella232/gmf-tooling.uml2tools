package org.eclipse.uml2.diagram.common.sheet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositePropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.uml2.uml.edit.providers.ElementItemProvider;

public class PropertySourceExtension extends EMFCompositePropertySource {

	private final AdapterFactory myItemProvidersAdapterFactory;

	private List<IItemPropertyDescriptor> stereotypeApplicationItemPropertyDescriptors = null;

	protected PropertySourceExtension(Object object, IItemPropertySource itemPropertySource, String category, AdapterFactory itemProvidersAdapterFactory) {
		super(object, itemPropertySource, category);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
	}

	public PropertySourceExtension(Object object, IItemPropertySource itemPropertySource, AdapterFactory itemProvidersAdapterFactory) {
		super(object, itemPropertySource);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
	}

	@Override
	public IPropertyDescriptor[] getPropertyDescriptors() {
		List<IPropertyDescriptor> propertyDescriptors = new ArrayList<IPropertyDescriptor>();
		propertyDescriptors.addAll(Arrays.asList(super.getPropertyDescriptors()));

		if (itemPropertySource instanceof ElementItemProvider) {
			ElementItemProvider elementItemProvider = (ElementItemProvider) itemPropertySource;
			stereotypeApplicationItemPropertyDescriptors = elementItemProvider.getStereotypeApplicationPropertyDescriptors(object);

			if (stereotypeApplicationItemPropertyDescriptors != null) {

				for (IItemPropertyDescriptor itemPropertyDescriptor : stereotypeApplicationItemPropertyDescriptors) {
					propertyDescriptors.add(createPropertyDescriptor(itemPropertyDescriptor));
				}
			}
		}

		return propertyDescriptors.toArray(new IPropertyDescriptor[propertyDescriptors.size()]);
	}

	@Override
	protected IPropertyDescriptor newPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
        if (itemPropertyDescriptor.getFeature(object) instanceof EReference && !itemPropertyDescriptor.isMany(object)) {
			return new ReferencePropertyDescriptor(object, itemPropertyDescriptor, getCategory(), myItemProvidersAdapterFactory);
		}
		return super.newPropertyDescriptor(itemPropertyDescriptor);
	}

}
