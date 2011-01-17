package org.eclipse.uml2.diagram.common.links;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.preferences.UMLPreferencesConstants;

public class InterfaceLinkManager {

	private boolean ourHideProvidedInterfaceLinks;

	private boolean ourHideRequiredInterfaceLinks;

	private boolean ourHideInterfaceRealizationLinks;

	private boolean ourHideUsageLinks;

	private final List<ILinkFilter> myLinkManagers;

	private final ILinkDetector myLinkDetector;

	public InterfaceLinkManager(Collection<IUpdaterLinkDescriptor> linkDescriptors, IPreferenceStore store, ILinkDetector linkDetector) {
		myLinkDetector = linkDetector;
		myLinkManagers = new ArrayList<ILinkFilter>(5);

		refreshOptions(store);
		buildTable(linkDescriptors);
	}

	public Collection<IUpdaterLinkDescriptor> getFilteredLinkDescriptors() {
		Collection<IUpdaterLinkDescriptor> result = new ArrayList<IUpdaterLinkDescriptor>();
		for (ILinkFilter manager : myLinkManagers) {
			result.addAll(manager.getFilteredLinks());
		}
		return result;
	}

	private void initFilters() {
		if (!ourHideProvidedInterfaceLinks) {
			myLinkManagers.add(new ProvidedInterfaceLinkFilter(myLinkDetector));
		}

		if (!ourHideRequiredInterfaceLinks) {
			myLinkManagers.add(new RequiredInterfaceLinkFilter(myLinkDetector));
		}

		if (!ourHideInterfaceRealizationLinks) {
			myLinkManagers.add(new InterfaceRealizationLinkFilter(myLinkDetector));
		}

		if (!ourHideUsageLinks) {
			myLinkManagers.add(new UsageLinkFilter(myLinkDetector));
		}

		myLinkManagers.add(new DefaultLinkFilter(myLinkDetector));
	}

	private void refreshOptions(IPreferenceStore store) {
		ourHideProvidedInterfaceLinks = store.getBoolean(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_PROVIDED_INTERFACE_LINKS);
		ourHideRequiredInterfaceLinks = store.getBoolean(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_REQUIRED_INTERFACE_LINKS);
		ourHideInterfaceRealizationLinks = store.getBoolean(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_INTERFACE_REALIZATION_LINKS);
		ourHideUsageLinks = store.getBoolean(UMLPreferencesConstants.PREF_MANAGE_LINKS_HIDE_USAGE_LINKS);
	}

	private void buildTable(Collection<IUpdaterLinkDescriptor> linkDescriptors) {
		initFilters();
		for (IUpdaterLinkDescriptor next : linkDescriptors) {
			for (ILinkFilter manager : myLinkManagers) {
				manager.visit(next);
			}
		}
	}

}
