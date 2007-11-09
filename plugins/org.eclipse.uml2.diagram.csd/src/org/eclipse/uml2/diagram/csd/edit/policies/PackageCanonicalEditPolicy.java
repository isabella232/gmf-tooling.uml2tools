package org.eclipse.uml2.diagram.csd.edit.policies;

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
import org.eclipse.gmf.runtime.notation.NotationPackage;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.csd.edit.parts.AssociationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Class2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Class3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ClassEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.CollaborationUse2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConnectorEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.DependencyEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ElementImportEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InstanceSpecificationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.InterfaceRealizationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.OperationEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Package2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.ParameterEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PortEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property2EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.Property3EditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.PropertyEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.SlotEditPart;
import org.eclipse.uml2.diagram.csd.edit.parts.UsageEditPart;
import org.eclipse.uml2.diagram.csd.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.csd.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.csd.part.UMLNodeDescriptor;
import org.eclipse.uml2.diagram.csd.part.UMLVisualIDRegistry;
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
	 * @NOT-generated
	 */
	@Override
	public void activate() {
		super.activate();
		addListenerFilter("NotationListener_Container" + getDiagram().toString(), this, getDiagram(), NotationPackage.eINSTANCE.getView_PersistedChildren());
	}

	/**
	 * @generated
	 */
	protected List getSemanticChildrenList() {
		View viewObject = (View) getHost().getModel();
		List result = new LinkedList();
		for (Iterator it = UMLDiagramUpdater.getSemanticChildren(viewObject).iterator(); it.hasNext();) {
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
		int actualID = UMLVisualIDRegistry.getVisualID(view);
		int suggestedID = UMLVisualIDRegistry.getNodeVisualID((View) getHost().getModel(), view.getElement());
		switch (actualID) {
		case CollaborationEditPart.VISUAL_ID:
		case Package2EditPart.VISUAL_ID:
		case InterfaceEditPart.VISUAL_ID:
		case InstanceSpecificationEditPart.VISUAL_ID:
		case ConstraintEditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement()) || actualID != suggestedID;
		case ClassEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
			return (actualID != suggestedID) && (suggestedID != Class3EditPart.VISUAL_ID) && true;
		case Class3EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
			return (actualID != suggestedID) && (suggestedID != ClassEditPart.VISUAL_ID) && true;
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
			myFeaturesToSynchronize.add(UMLPackage.eINSTANCE.getPackage_PackagedElement());
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
				if (diagramLinkObject == nextLinkDescriptor.getModelElement() && diagramLinkSrc == nextLinkDescriptor.getSource() && diagramLinkDst == nextLinkDescriptor.getDestination() &&
						diagramLinkVisualID == nextLinkDescriptor.getVisualID()) {
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
		case CollaborationEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCollaboration_2005ContainedLinks(view));
			break;
		}
		case ClassEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getClass_2006ContainedLinks(view));
			break;
		}
		case Package2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getPackage_2003ContainedLinks(view));
			break;
		}
		case Class3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getClass_2007ContainedLinks(view));
			break;
		}
		case InterfaceEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInterface_2009ContainedLinks(view));
			break;
		}
		case InstanceSpecificationEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInstanceSpecification_2011ContainedLinks(view));
			break;
		}
		case ConstraintEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getConstraint_2012ContainedLinks(view));
			break;
		}
		case CollaborationUse2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCollaborationUse_3002ContainedLinks(view));
			break;
		}
		case PropertyEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getProperty_3007ContainedLinks(view));
			break;
		}
		case ParameterEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getParameter_3013ContainedLinks(view));
			break;
		}
		case Property2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getProperty_3008ContainedLinks(view));
			break;
		}
		case OperationEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getOperation_3009ContainedLinks(view));
			break;
		}
		case Class2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getClass_3010ContainedLinks(view));
			break;
		}
		case PortEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getPort_3011ContainedLinks(view));
			break;
		}
		case ElementImportEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getElementImport_3004ContainedLinks(view));
			break;
		}
		case Property3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getProperty_3014ContainedLinks(view));
			break;
		}
		case SlotEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getSlot_3015ContainedLinks(view));
			break;
		}
		case ConnectorEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getConnector_4005ContainedLinks(view));
			break;
		}
		case DependencyEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getDependency_4006ContainedLinks(view));
			break;
		}
		case InterfaceRealizationEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInterfaceRealization_4007ContainedLinks(view));
			break;
		}
		case UsageEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getUsage_4008ContainedLinks(view));
			break;
		}
		case AssociationEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getAssociation_4011ContainedLinks(view));
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
