package org.eclipse.uml2.diagram.clazz.links;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.uml2.diagram.clazz.part.UMLDiagramEditorPlugin;
import org.eclipse.uml2.diagram.clazz.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.common.preferences.UMLPreferencesConstants;

/*
 * This class is to get rid of litter Required Interface links. One RequiredInterface link can be shown on the diagram several times - the Genuine(original) 
 * going out of Classifier and Derived, which is got by Port#getRequireds(), going out of Port. 
 * We call links that are not RequiredInterface links Regular, they are untouched by our algorithm.   
 * This class allows user to manage such links. Either genuine, or derived, or both genuine and derived links can be hidden. 
 * Genuine links are hidden only if its derived exists on the diagram.    
 */
public class InterfaceLinkManager {

	private static boolean ourHideReferencedGenuine;

	private static boolean ourHideDerived;
	
	private final List<InterfaceLinkFilter> myLinkManagers = new ArrayList<InterfaceLinkFilter>(3);

	public InterfaceLinkManager(Collection<?> linkDescriptors) {
		refreshOptions(UMLDiagramEditorPlugin.getInstance().getPreferenceStore());
		buildTable(linkDescriptors);		
	}

	private static void refreshOptions(IPreferenceStore store) {
		ourHideDerived = store.getBoolean(UMLPreferencesConstants.PREF_MANAGE_REQUIRED_LINKS_HIDE_DERIVED);
		ourHideReferencedGenuine = store.getBoolean(UMLPreferencesConstants.PREF_MANAGE_REQUIRED_LINKS_HIDE_GENUINE);
	}

	private void buildTable(Collection<?> linkDescriptors) {
		myLinkManagers.add(new RequiredInterfaceLinkFilter(ourHideDerived, ourHideReferencedGenuine));
		myLinkManagers.add(new ProvidedInterfaceLinkFilter(ourHideDerived, ourHideReferencedGenuine));
		myLinkManagers.add(new RegularLinkFilter(ourHideDerived, ourHideReferencedGenuine));
		for (Object next : linkDescriptors) {
			UMLLinkDescriptor linkDescriptor = (UMLLinkDescriptor) next;
			for (InterfaceLinkFilter manager: myLinkManagers) {
				manager.visit(linkDescriptor);
			}
		}
	}

	public Collection<UMLLinkDescriptor> getFilteredLinkDescriptors() {
		Collection<UMLLinkDescriptor> result = new ArrayList<UMLLinkDescriptor>();
		for (InterfaceLinkFilter manager: myLinkManagers) {
			result.addAll(manager.getFilteredLinks());
		}
		return result;
	}

}
