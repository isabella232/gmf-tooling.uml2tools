package org.eclipse.uml2.diagram.common.links;

import java.util.Collection;

import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;

public interface ILinkFilter {

	void visit(IUpdaterLinkDescriptor link);

	Collection<IUpdaterLinkDescriptor> getFilteredLinks();
}
