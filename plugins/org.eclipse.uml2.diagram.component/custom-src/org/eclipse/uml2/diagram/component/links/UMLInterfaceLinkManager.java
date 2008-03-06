package org.eclipse.uml2.diagram.component.links;

import java.util.Collection;

import org.eclipse.uml2.diagram.component.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.common.links.InterfaceLinkManager;

public class UMLInterfaceLinkManager extends InterfaceLinkManager<UMLLinkDescriptor> {

	public UMLInterfaceLinkManager(Collection<?> linkDescriptors) {
		super(linkDescriptors, UMLDiagramEditorPlugin.getInstance().getPreferenceStore());
	}

	@Override
	protected void initFilters() {
		myLinkManagers.add(new RequiredInterfaceLinkFilter(ourHideDerived, ourHideReferencedGenuine));
		myLinkManagers.add(new ProvidedInterfaceLinkFilter(ourHideDerived, ourHideReferencedGenuine));
		myLinkManagers.add(new RegularLinkFilter(ourHideDerived, ourHideReferencedGenuine));
	}

}
