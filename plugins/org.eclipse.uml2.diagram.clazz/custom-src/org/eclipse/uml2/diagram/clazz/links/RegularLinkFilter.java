package org.eclipse.uml2.diagram.clazz.links;

import java.util.Collection;
import java.util.LinkedList;

import org.eclipse.uml2.diagram.clazz.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.clazz.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.clazz.part.UMLLinkDescriptor;

public class RegularLinkFilter extends InterfaceLinkFilter {

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

}
