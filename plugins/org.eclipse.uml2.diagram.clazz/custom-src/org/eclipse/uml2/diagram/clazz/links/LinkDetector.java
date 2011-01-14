package org.eclipse.uml2.diagram.clazz.links;

import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.links.ILinkDetector;

public class LinkDetector implements ILinkDetector {

	public boolean isProvidedInterfaceLink(IUpdaterLinkDescriptor link) {
		return PortProvidedEditPart.VISUAL_ID == link.getVisualID();
	}

	public boolean isRequiredInterfaceLink(IUpdaterLinkDescriptor link) {
		return PortRequiredEditPart.VISUAL_ID == link.getVisualID();
	}

	public boolean isInterfaceRealizationLink(IUpdaterLinkDescriptor link) {
		return InterfaceRealizationEditPart.VISUAL_ID == link.getVisualID();
	}

	public boolean isUsageLink(IUpdaterLinkDescriptor link) {
		return UsageEditPart.VISUAL_ID == link.getVisualID();
	}
}
