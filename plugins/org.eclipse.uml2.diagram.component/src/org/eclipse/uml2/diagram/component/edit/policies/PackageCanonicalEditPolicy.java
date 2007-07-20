package org.eclipse.uml2.diagram.component.edit.policies;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.diagram.core.util.ViewUtil;
import org.eclipse.gmf.runtime.diagram.ui.commands.DeferredLayoutCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalConnectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateConnectionViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.RequestConstants;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.component.edit.parts.Artifact2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ArtifactEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Component2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ComponentEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.ConnectorEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.Interface2EditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.component.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.component.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.component.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.component.part.UMLNodeDescriptor;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class PackageCanonicalEditPolicy extends CanonicalConnectionEditPolicy {

	/**
	 * @generated
	 */
	Set myFeaturesToSynchronize;

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = UMLDiagramUpdater.getPackage_1000SemanticChildren(viewObject).iterator(); it.hasNext();) {
			result.add(((UMLNodeDescriptor) it.next()).getModelElement());
		}
		return result;
	}

	/**
	 * @generated
	 */
	protected boolean shouldDeleteView(View view) {
		return true;
	}

	/**
	 * @generated
	 */
	protected boolean isOrphaned(Collection semanticChildren, final View view) {
		int visualID = UMLVisualIDRegistry.getVisualID(view);
		switch (visualID) {
		case ComponentEditPart.VISUAL_ID:
		case Artifact2EditPart.VISUAL_ID:
		case Interface2EditPart.VISUAL_ID:
		case Class2EditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement()) || visualID != UMLVisualIDRegistry.getNodeVisualID((View) getHost().getModel(), view.getElement());
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected String getDefaultFactoryHint() {
		return null;
	}

	/**
	 * @generated
	 */
	protected Set getFeaturesToSynchronize() {
		if (myFeaturesToSynchronize == null) {
			myFeaturesToSynchronize = new HashSet();
			myFeaturesToSynchronize.add(UMLPackage.eINSTANCE.getPackage_OwnedType());
		}
		return myFeaturesToSynchronize;
	}

	/**
	 * @generated
	 */
	protected List getSemanticConnectionsList() {
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	protected EObject getSourceElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected EObject getTargetElement(EObject relationship) {
		return null;
	}

	/**
	 * @generated
	 */
	protected boolean shouldIncludeConnection(Edge connector, Collection children) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void refreshSemantic() {
		List createdViews = new LinkedList();
		createdViews.addAll(refreshSemanticChildren());
		List createdConnectionViews = new LinkedList();
		createdConnectionViews.addAll(refreshSemanticConnections());
		createdConnectionViews.addAll(refreshConnections());

		if (createdViews.size() > 1) {
			// perform a layout of the container
			DeferredLayoutCommand layoutCmd = new DeferredLayoutCommand(host().getEditingDomain(), createdViews, host());
			executeCommand(new ICommandProxy(layoutCmd));
		}

		createdViews.addAll(createdConnectionViews);
		makeViewsImmutable(createdViews);
	}

	/**
	 * @generated
	 */
	private Diagram getDiagram() {
		return ((View) getHost().getModel()).getDiagram();
	}

	/**
	 * @generated
	 */
	private Collection refreshConnections() {
		Map domain2NotationMap = new HashMap();
		Collection linkDescriptors = collectAllLinks(getDiagram(), domain2NotationMap);
		Collection existingLinks = new LinkedList(getDiagram().getEdges());
		for (Iterator linksIterator = existingLinks.iterator(); linksIterator.hasNext();) {
			Edge nextDiagramLink = (Edge) linksIterator.next();
			EObject diagramLinkObject = nextDiagramLink.getElement();
			EObject diagramLinkSrc = nextDiagramLink.getSource().getElement();
			EObject diagramLinkDst = nextDiagramLink.getTarget().getElement();
			int diagramLinkVisualID = UMLVisualIDRegistry.getVisualID(nextDiagramLink);
			for (Iterator LinkDescriptorsIterator = linkDescriptors.iterator(); LinkDescriptorsIterator.hasNext();) {
				UMLLinkDescriptor nextLinkDescriptor = (UMLLinkDescriptor) LinkDescriptorsIterator.next();
				if (diagramLinkObject == nextLinkDescriptor.getModelElement() && diagramLinkSrc == nextLinkDescriptor.getSource() && diagramLinkDst == nextLinkDescriptor.getDestination()
						&& diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
					linksIterator.remove();
					LinkDescriptorsIterator.remove();
				}
			}
		}
		deleteViews(existingLinks.iterator());
		return createConnections(linkDescriptors, domain2NotationMap);
	}

	/**
	 * @generated
	 */
	private Collection collectAllLinks(View view, Map domain2NotationMap) {
		Collection result = new LinkedList();
		switch (UMLVisualIDRegistry.getVisualID(view)) {
		case PackageEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getPackage_1000ContainedLinks(view));
			break;
		}
		case ComponentEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getComponent_2001ContainedLinks(view));
			break;
		}
		case Artifact2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getArtifact_2002ContainedLinks(view));
			break;
		}
		case Interface2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInterface_2003ContainedLinks(view));
			break;
		}
		case Class2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getClass_2004ContainedLinks(view));
			break;
		}
		case Component2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getComponent_3001ContainedLinks(view));
			break;
		}
		case PortEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getPort_3002ContainedLinks(view));
			break;
		}
		case ArtifactEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getArtifact_3003ContainedLinks(view));
			break;
		}
		case ClassEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getClass_3004ContainedLinks(view));
			break;
		}
		case InterfaceEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInterface_3005ContainedLinks(view));
			break;
		}
		case PropertyEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getProperty_3006ContainedLinks(view));
			break;
		}
		case InterfaceRealizationEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInterfaceRealization_4001ContainedLinks(view));
			break;
		}
		case ConnectorEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getConnector_4008ContainedLinks(view));
			break;
		}
		}
		for (Iterator children = view.getChildren().iterator(); children.hasNext();) {
			result.addAll(collectAllLinks((View) children.next(), domain2NotationMap));
		}
		for (Iterator edges = view.getSourceEdges().iterator(); edges.hasNext();) {
			result.addAll(collectAllLinks((View) edges.next(), domain2NotationMap));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors, Map domain2NotationMap) {
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator.hasNext();) {
			final UMLLinkDescriptor nextLinkDescriptor = (UMLLinkDescriptor) linkDescriptorsIterator.next();
			EditPart sourceEditPart = getEditPart(nextLinkDescriptor.getSource(), domain2NotationMap);
			EditPart targetEditPart = getEditPart(nextLinkDescriptor.getDestination(), domain2NotationMap);
			if (sourceEditPart == null || targetEditPart == null) {
				continue;
			}
			CreateConnectionViewRequest.ConnectionViewDescriptor descriptor = new CreateConnectionViewRequest.ConnectionViewDescriptor(nextLinkDescriptor.getSemanticAdapter(), null, ViewUtil.APPEND,
					false, ((IGraphicalEditPart) getHost()).getDiagramPreferencesHint());
			CreateConnectionViewRequest ccr = new CreateConnectionViewRequest(descriptor);
			ccr.setType(RequestConstants.REQ_CONNECTION_START);
			ccr.setSourceEditPart(sourceEditPart);
			sourceEditPart.getCommand(ccr);
			ccr.setTargetEditPart(targetEditPart);
			ccr.setType(RequestConstants.REQ_CONNECTION_END);
			Command cmd = targetEditPart.getCommand(ccr);
			if (cmd != null && cmd.canExecute()) {
				executeCommand(cmd);
				IAdaptable viewAdapter = (IAdaptable) ccr.getNewObject();
				if (viewAdapter != null) {
					adapters.add(viewAdapter);
				}
			}
		}
		return adapters;
	}

	/**
	 * @generated
	 */
	private EditPart getEditPart(EObject domainModelElement, Map domain2NotationMap) {
		View view = (View) domain2NotationMap.get(domainModelElement);
		if (view != null) {
			return (EditPart) getHost().getViewer().getEditPartRegistry().get(view);
		}
		return null;
	}
}
