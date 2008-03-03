package org.eclipse.uml2.diagram.clazz.links;

import org.eclipse.uml2.diagram.clazz.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLLinkDescriptor;

public class RequiredInterfaceLinkFilter extends InterfaceLinkFilter {

	public RequiredInterfaceLinkFilter(boolean hideDerived, boolean hideReferencedGenuine) {
		super(hideDerived, hideReferencedGenuine);
	}

	@Override
	protected boolean isInterfaceLink(UMLLinkDescriptor link) {
		return PortRequiredEditPart.VISUAL_ID == link.getVisualID() || UsageEditPart.VISUAL_ID == link.getVisualID();
	}

}
