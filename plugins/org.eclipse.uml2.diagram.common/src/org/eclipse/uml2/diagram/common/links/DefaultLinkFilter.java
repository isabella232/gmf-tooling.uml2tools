package org.eclipse.uml2.diagram.common.links;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;

public class DefaultLinkFilter implements ILinkFilter {

	private final ILinkDetector myLinkDetector;

	private Collection<IUpdaterLinkDescriptor> myLinks;

	public DefaultLinkFilter(ILinkDetector linkDetector) {
		myLinkDetector = linkDetector;
		myLinks = new LinkedList<IUpdaterLinkDescriptor>();
	}

	public void visit(IUpdaterLinkDescriptor link) {
		if (!myLinkDetector.isProvidedInterfaceLink(link) && //
				!myLinkDetector.isRequiredInterfaceLink(link) && //
				!myLinkDetector.isInterfaceRealizationLink(link) && //
				!myLinkDetector.isUsageLink(link)) {
			myLinks.add(link);
		}
	}

	public Collection<IUpdaterLinkDescriptor> getFilteredLinks() {
		return Collections.unmodifiableCollection(myLinks);
	}

}
