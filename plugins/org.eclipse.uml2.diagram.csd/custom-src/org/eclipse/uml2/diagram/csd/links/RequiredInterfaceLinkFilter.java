package org.eclipse.uml2.diagram.csd.links;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.csd.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.csd.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.common.links.InterfaceLinkFilter;

public class RequiredInterfaceLinkFilter extends InterfaceLinkFilter<UMLLinkDescriptor> {

	public RequiredInterfaceLinkFilter(boolean hideDerived, boolean hideReferencedGenuine) {
		super(hideDerived, hideReferencedGenuine);
	}

	@Override
	protected boolean isInterfaceLink(UMLLinkDescriptor link) {
		return PortRequiredEditPart.VISUAL_ID == link.getVisualID() || UsageEditPart.VISUAL_ID == link.getVisualID();
	}

	@Override
	protected EObject getSource(UMLLinkDescriptor link) {
		return link.getSource();
	}
}
