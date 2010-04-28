package org.eclipse.uml2.diagram.common.links;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;

public class InterfaceRealizationLinkFilter implements ILinkFilter {

	private final ILinkDetector myLinkDetector;

	private Collection<IUpdaterLinkDescriptor> myLinks;

	public InterfaceRealizationLinkFilter(ILinkDetector linkDetector) {
		myLinkDetector = linkDetector;
		myLinks = new LinkedList<IUpdaterLinkDescriptor>();
	}

	public void visit(IUpdaterLinkDescriptor link) {
		if (myLinkDetector.isInterfaceRealizationLink(link)) {
			myLinks.add(link);
		}
	}

	public Collection<IUpdaterLinkDescriptor> getFilteredLinks() {
		return Collections.unmodifiableCollection(myLinks);
	}

}
