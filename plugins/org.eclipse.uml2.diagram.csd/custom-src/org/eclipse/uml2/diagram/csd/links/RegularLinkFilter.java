package org.eclipse.uml2.diagram.csd.links;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.csd.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.common.links.InterfaceLinkFilter;

public class RegularLinkFilter extends InterfaceLinkFilter<UMLLinkDescriptor> {

	private final Collection<UMLLinkDescriptor> myRegularLinks = new LinkedList<UMLLinkDescriptor>();

	public RegularLinkFilter(boolean hideDerived, boolean hideReferencedGenuine) {
		super(hideDerived, hideReferencedGenuine);
	}

	@Override
	public void visit(UMLLinkDescriptor link) {
		if (isRegularLink(link)) {
			myRegularLinks.add(link);
		}
	}

	private boolean isRegularLink(UMLLinkDescriptor link) {
		int vid = link.getVisualID();
		return PortProvidedEditPart.VISUAL_ID != vid && InterfaceRealizationEditPart.VISUAL_ID != vid && PortRequiredEditPart.VISUAL_ID != vid && UsageEditPart.VISUAL_ID != vid;
	}

	@Override
	public Collection<UMLLinkDescriptor> getFilteredLinks() {
		return myRegularLinks;
	}

	@Override
	protected EObject getSource(UMLLinkDescriptor link) {
		return link.getSource();
	}
}
