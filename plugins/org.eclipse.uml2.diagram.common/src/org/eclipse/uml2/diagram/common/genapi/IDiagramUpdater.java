package org.eclipse.uml2.diagram.common.genapi;

import java.util.List;

import org.eclipse.gmf.runtime.notation.View;


public interface IDiagramUpdater {
	public List<? extends IUpdaterNodeDescriptor> getSemanticChildren(View view);
	public List<? extends IUpdaterLinkDescriptor> getContainedLinks(View view);
	public List<? extends IUpdaterLinkDescriptor> getIncomingLinks(View view);
	public List<? extends IUpdaterLinkDescriptor> getOutgoingLinks(View view);
}
