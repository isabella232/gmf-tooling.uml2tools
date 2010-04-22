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

	@Override
	public void visit(IUpdaterLinkDescriptor link) {
		if (!myLinkDetector.isProvidedInterfaceLink(link) && //
				!myLinkDetector.isRequiredInterfaceLink(link) && //
				!myLinkDetector.isInterfaceRealizationLink(link) && //
				!myLinkDetector.isUsageLink(link)) {
			myLinks.add(link);
		}
	}

	@Override
	public Collection<IUpdaterLinkDescriptor> getFilteredLinks() {
		return Collections.unmodifiableCollection(myLinks);
	}

}
