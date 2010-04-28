package org.eclipse.uml2.diagram.component.links;

import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.links.ILinkDetector;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentRequiredEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;

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
		return ComponentRequiredEditPart.VISUAL_ID == link.getVisualID();
	}

}
