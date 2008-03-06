package org.eclipse.uml2.diagram.csd.links;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.csd.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.common.links.InterfaceLinkFilter;


public class ProvidedInterfaceLinkFilter extends InterfaceLinkFilter<UMLLinkDescriptor> {

	public ProvidedInterfaceLinkFilter(boolean hideDerived, boolean hideReferencedGenuine) {
		super(hideDerived, hideReferencedGenuine);
	}

	@Override
	protected boolean isInterfaceLink(UMLLinkDescriptor link) {
		return PortProvidedEditPart.VISUAL_ID == link.getVisualID() || InterfaceRealizationEditPart.VISUAL_ID == link.getVisualID();
	}

	@Override
	protected EObject getSource(UMLLinkDescriptor link) {
		return link.getSource();
	}

}
