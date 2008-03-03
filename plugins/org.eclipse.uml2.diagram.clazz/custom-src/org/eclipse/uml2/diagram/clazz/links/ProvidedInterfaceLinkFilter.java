package org.eclipse.uml2.diagram.clazz.links;

import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLLinkDescriptor;


public class ProvidedInterfaceLinkFilter extends InterfaceLinkFilter {

	public ProvidedInterfaceLinkFilter(boolean hideDerived, boolean hideReferencedGenuine) {
		super(hideDerived, hideReferencedGenuine);
	}

	@Override
	protected boolean isInterfaceLink(UMLLinkDescriptor link) {
		return PortProvidedEditPart.VISUAL_ID == link.getVisualID() || InterfaceRealizationEditPart.VISUAL_ID == link.getVisualID();
	}

}
