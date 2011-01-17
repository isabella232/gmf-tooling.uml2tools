package org.eclipse.uml2.diagram.common.navigator;

import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ILabelProviderListener;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;
import org.eclipse.uml2.diagram.common.navigator.UMLDomainNavigatorItem;
import org.eclipse.uml2.diagram.common.UMLCommonPlugin;

;

public class UMLDomainNavigatorLabelProvider implements ICommonLabelProvider {

	private AdapterFactoryLabelProvider myAdapterFactoryLabelProvider = new AdapterFactoryLabelProvider(UMLCommonPlugin.getInstance().getItemProvidersAdapterFactory());

	public void init(ICommonContentExtensionSite aConfig) {
	}

	public Image getImage(Object element) {
		if (element instanceof UMLDomainNavigatorItem) {
			return myAdapterFactoryLabelProvider.getImage(((UMLDomainNavigatorItem) element).getEObject());
		}
		return null;
	}

	public String getText(Object element) {
		if (element instanceof UMLDomainNavigatorItem) {
			return myAdapterFactoryLabelProvider.getText(((UMLDomainNavigatorItem) element).getEObject());
		}
		return null;
	}

	public void addListener(ILabelProviderListener listener) {
		myAdapterFactoryLabelProvider.addListener(listener);
	}

	public void dispose() {
		myAdapterFactoryLabelProvider.dispose();
	}

	public boolean isLabelProperty(Object element, String property) {
		return myAdapterFactoryLabelProvider.isLabelProperty(element, property);
	}

	public void removeListener(ILabelProviderListener listener) {
		myAdapterFactoryLabelProvider.removeListener(listener);
	}

	public void restoreState(IMemento aMemento) {
	}

	public void saveState(IMemento aMemento) {
	}

	public String getDescription(Object anElement) {
		return null;
	}
}
