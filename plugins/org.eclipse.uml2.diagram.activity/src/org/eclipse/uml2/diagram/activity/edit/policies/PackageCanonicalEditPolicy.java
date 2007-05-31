package org.eclipse.uml2.diagram.activity.edit.policies;

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
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Constraint2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralString2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.activity.part.UMLLinkDescriptor;
import org.eclipse.uml2.diagram.activity.part.UMLNodeDescriptor;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
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
		int actualID = UMLVisualIDRegistry.getVisualID(view);
		int suggestedID = UMLVisualIDRegistry.getNodeVisualID((View) getHost().getModel(), view.getElement());
		switch (actualID) {
		case ActivityEditPart.VISUAL_ID:
			return !semanticChildren.contains(view.getElement()) || actualID != suggestedID;
		case ConstraintEditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
			return (actualID != suggestedID) && (suggestedID != Constraint2EditPart.VISUAL_ID) && true;
		case Constraint2EditPart.VISUAL_ID:
			if (!semanticChildren.contains(view.getElement())) {
				return true;
			}
			return (actualID != suggestedID) && (suggestedID != ConstraintEditPart.VISUAL_ID) && true;
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
		case ActivityEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getActivity_2026ContainedLinks(view));
			break;
		}
		case ConstraintEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getConstraint_2027ContainedLinks(view));
			break;
		}
		case Constraint2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getConstraint_2028ContainedLinks(view));
			break;
		}
		case AcceptEventActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getAcceptEventAction_3030ContainedLinks(view));
			break;
		}
		case AcceptEventAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getAcceptEventAction_3031ContainedLinks(view));
			break;
		}
		case ActivityFinalNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getActivityFinalNode_3032ContainedLinks(view));
			break;
		}
		case DecisionNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getDecisionNode_3033ContainedLinks(view));
			break;
		}
		case MergeNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getMergeNode_3034ContainedLinks(view));
			break;
		}
		case InitialNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInitialNode_3035ContainedLinks(view));
			break;
		}
		case DataStoreNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getDataStoreNode_3036ContainedLinks(view));
			break;
		}
		case CentralBufferNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCentralBufferNode_3037ContainedLinks(view));
			break;
		}
		case OpaqueActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getOpaqueAction_3029ContainedLinks(view));
			break;
		}
		case OutputPinEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getOutputPin_3001ContainedLinks(view));
			break;
		}
		case FlowFinalNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getFlowFinalNode_3038ContainedLinks(view));
			break;
		}
		case ForkNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getForkNode_3039ContainedLinks(view));
			break;
		}
		case JoinNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getJoinNode_3040ContainedLinks(view));
			break;
		}
		case PinEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getPin_3041ContainedLinks(view));
			break;
		}
		case CreateObjectActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCreateObjectAction_3042ContainedLinks(view));
			break;
		}
		case OutputPin2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getOutputPin_3002ContainedLinks(view));
			break;
		}
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getAddStructuralFeatureValueAction_3043ContainedLinks(view));
			break;
		}
		case InputPinEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInputPin_3003ContainedLinks(view));
			break;
		}
		case InputPin2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInputPin_3004ContainedLinks(view));
			break;
		}
		case InputPin3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInputPin_3005ContainedLinks(view));
			break;
		}
		case CallBehaviorActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCallBehaviorAction_3044ContainedLinks(view));
			break;
		}
		case OutputPin3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getOutputPin_3006ContainedLinks(view));
			break;
		}
		case InputPin4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInputPin_3007ContainedLinks(view));
			break;
		}
		case CallOperationActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCallOperationAction_3045ContainedLinks(view));
			break;
		}
		case InputPin5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getInputPin_3008ContainedLinks(view));
			break;
		}
		case StructuredActivityNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getStructuredActivityNode_3046ContainedLinks(view));
			break;
		}
		case StructuredActivityNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getStructuredActivityNode_3009ContainedLinks(view));
			break;
		}
		case OpaqueAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getOpaqueAction_3011ContainedLinks(view));
			break;
		}
		case AcceptEventAction3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getAcceptEventAction_3012ContainedLinks(view));
			break;
		}
		case AcceptEventAction4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getAcceptEventAction_3013ContainedLinks(view));
			break;
		}
		case ActivityFinalNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getActivityFinalNode_3014ContainedLinks(view));
			break;
		}
		case DecisionNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getDecisionNode_3015ContainedLinks(view));
			break;
		}
		case FlowFinalNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getFlowFinalNode_3016ContainedLinks(view));
			break;
		}
		case Pin2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getPin_3017ContainedLinks(view));
			break;
		}
		case CreateObjectAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCreateObjectAction_3018ContainedLinks(view));
			break;
		}
		case CallBehaviorAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCallBehaviorAction_3019ContainedLinks(view));
			break;
		}
		case CallOperationAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCallOperationAction_3020ContainedLinks(view));
			break;
		}
		case ForkNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getForkNode_3021ContainedLinks(view));
			break;
		}
		case JoinNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getJoinNode_3022ContainedLinks(view));
			break;
		}
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getAddStructuralFeatureValueAction_3023ContainedLinks(view));
			break;
		}
		case DataStoreNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getDataStoreNode_3024ContainedLinks(view));
			break;
		}
		case CentralBufferNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getCentralBufferNode_3025ContainedLinks(view));
			break;
		}
		case OpaqueBehaviorEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getOpaqueBehavior_3047ContainedLinks(view));
			break;
		}
		case ActivityParameterNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getActivityParameterNode_3052ContainedLinks(view));
			break;
		}
		case SendSignalActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getSendSignalAction_3053ContainedLinks(view));
			break;
		}
		case LiteralStringEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getLiteralString_3049ContainedLinks(view));
			break;
		}
		case LiteralString2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getLiteralString_3051ContainedLinks(view));
			break;
		}
		case ControlFlowEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getControlFlow_4001ContainedLinks(view));
			break;
		}
		case ObjectFlowEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getObjectFlow_4002ContainedLinks(view));
			break;
		}
		case ExceptionHandlerEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getExceptionHandler_4005ContainedLinks(view));
			break;
		}
		case PackageEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			result.addAll(UMLDiagramUpdater.getPackage_1000ContainedLinks(view));
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
