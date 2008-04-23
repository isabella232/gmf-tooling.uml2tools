package org.eclipse.uml2.diagram.common.sheet;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.gmf.runtime.emf.ui.properties.descriptors.EMFCompositePropertySource;
import org.eclipse.ui.views.properties.IPropertyDescriptor;
import org.eclipse.uml2.uml.UMLPackage;

public class PropertySourceExtension extends EMFCompositePropertySource {

	private final AdapterFactory myItemProvidersAdapterFactory;

	protected PropertySourceExtension(Object object, IItemPropertySource itemPropertySource, String category, AdapterFactory itemProvidersAdapterFactory) {
		super(object, itemPropertySource, category);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
	}

	public PropertySourceExtension(Object object, IItemPropertySource itemPropertySource, AdapterFactory itemProvidersAdapterFactory) {
		super(object, itemPropertySource);
		myItemProvidersAdapterFactory = itemProvidersAdapterFactory;
	}

	@Override
	protected IPropertyDescriptor newPropertyDescriptor(IItemPropertyDescriptor itemPropertyDescriptor) {
		if (UMLPackage.Literals.TYPED_ELEMENT__TYPE.equals(itemPropertyDescriptor.getFeature(object))) {
			return new TypeSourcePropertyDescriptor(object, itemPropertyDescriptor, getCategory(), myItemProvidersAdapterFactory);
		}
		return super.newPropertyDescriptor(itemPropertyDescriptor);
	}

}
