package org.eclipse.uml2.diagram.component.links;

import java.util.Collection;

import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.links.ILinkDetector;
import org.eclipse.uml2.diagram.common.links.RefreshComplementaryLinksHelper.IDiagramLinkInfoProvider;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentRequiredEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortProvidedEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortRequiredEditPart;
import org.eclipse.uml2.diagram.component.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Classifier;
import org.eclipse.uml2.uml.Interface;
import org.eclipse.uml2.uml.InterfaceRealization;
import org.eclipse.uml2.uml.Usage;

public class DiagramLinkInfoProvider implements IDiagramLinkInfoProvider {

	private static final DiagramLinkInfoProvider INSTANCE = new DiagramLinkInfoProvider();

	private final ILinkDetector myLinkDetector;

	private DiagramLinkInfoProvider() {
		myLinkDetector = new LinkDetector();
	}

	public static DiagramLinkInfoProvider getInstance() {
		return INSTANCE;
	}

	public Collection<? extends IUpdaterLinkDescriptor> getContainedLinks(View view) {
		return UMLDiagramUpdater.TYPED_ADAPTER.getContainedLinks(view);
	}

	public String getType(int visualId) {
		return UMLVisualIDRegistry.getType(visualId);
	}

	public boolean hasVisualId(Edge edge, int visualId) {
		return UMLVisualIDRegistry.getVisualID(edge) == visualId;
	}

	public boolean isInterfaceRealizationEdge(Edge edge) {
		return UMLVisualIDRegistry.getVisualID(edge) == InterfaceRealizationEditPart.VISUAL_ID;
	}

	public boolean isPortProvidedEdge(Edge edge) {
		return UMLVisualIDRegistry.getVisualID(edge) == PortProvidedEditPart.VISUAL_ID;
	}

	public boolean isPortRequiredEdge(Edge edge) {
		return UMLVisualIDRegistry.getVisualID(edge) == PortRequiredEditPart.VISUAL_ID;
	}

	public boolean isUsageEdge(Edge edge) {
		return UMLVisualIDRegistry.getVisualID(edge) == ComponentRequiredEditPart.VISUAL_ID;
	}

	public IUpdaterLinkDescriptor createInterfaceRealizationLinkDescriptor(Classifier source, Interface target, InterfaceRealization link) {
		return new UMLLinkDescriptor(source, target, link, UMLElementTypes.InterfaceRealization_4001, InterfaceRealizationEditPart.VISUAL_ID);
	}

	public IUpdaterLinkDescriptor createUsageLinkDescriptor(Classifier source, Interface target, Usage link) {
		return new UMLLinkDescriptor(source, target, UMLElementTypes.ComponentRequired_4007, ComponentRequiredEditPart.VISUAL_ID);
	}

	public ILinkDetector getLinkDetector() {
		return myLinkDetector;
	}
}
