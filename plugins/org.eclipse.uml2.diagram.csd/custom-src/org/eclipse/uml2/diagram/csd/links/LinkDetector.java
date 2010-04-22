package org.eclipse.uml2.diagram.csd.links;

import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.links.ILinkDetector;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.UsageEditPart;

public class LinkDetector implements ILinkDetector {

	@Override
	public boolean isProvidedInterfaceLink(IUpdaterLinkDescriptor link) {
		return PortProvidedEditPart.VISUAL_ID == link.getVisualID();
	}

	@Override
	public boolean isRequiredInterfaceLink(IUpdaterLinkDescriptor link) {
		return PortRequiredEditPart.VISUAL_ID == link.getVisualID();
	}

	@Override
	public boolean isInterfaceRealizationLink(IUpdaterLinkDescriptor link) {
		return InterfaceRealizationEditPart.VISUAL_ID == link.getVisualID();
	}

	@Override
	public boolean isUsageLink(IUpdaterLinkDescriptor link) {
		return UsageEditPart.VISUAL_ID == link.getVisualID();
	}
}
