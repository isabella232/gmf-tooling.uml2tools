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

	@Override
	public void visit(IUpdaterLinkDescriptor link) {
		if (myLinkDetector.isInterfaceRealizationLink(link)) {
			myLinks.add(link);
		}
	}

	@Override
	public Collection<IUpdaterLinkDescriptor> getFilteredLinks() {
		return Collections.unmodifiableCollection(myLinks);
	}

}
