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
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectNodeSelectionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.activity.part.UMLNodeDescriptor;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityEdge;
import org.eclipse.uml2.uml.ActivityNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.ExecutableNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.StructuredActivityNode;
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
		return UMLDiagramUpdater.isPackage_1000DomainMetaChild(visualID)
				&& (!semanticChildren.contains(view.getElement()) || visualID != UMLVisualIDRegistry.getNodeVisualID((View) getHost().getModel(), view.getElement()));
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
				LinkDescriptor nextLinkDescriptor = (LinkDescriptor) LinkDescriptorsIterator.next();
				if (diagramLinkObject == nextLinkDescriptor.getLinkElement() && diagramLinkSrc == nextLinkDescriptor.getSource() && diagramLinkDst == nextLinkDescriptor.getDestination()
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
			Activity modelElement = (Activity) view.getElement();
			result.addAll(getContainedTypeModelFacetLinks_ControlFlow_4001(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ObjectFlow_4002(modelElement));
			break;
		}
		case ConstraintEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Constraint2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case AcceptEventActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case AcceptEventAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case ActivityFinalNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case DecisionNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case MergeNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case InitialNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case DataStoreNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			DataStoreNode modelElement = (DataStoreNode) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case CentralBufferNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			CentralBufferNode modelElement = (CentralBufferNode) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case OpaqueActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			OpaqueAction modelElement = (OpaqueAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case OutputPinEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			OutputPin modelElement = (OutputPin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case FlowFinalNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case ForkNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case JoinNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case PinEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			Pin modelElement = (Pin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case CreateObjectActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case OutputPin2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			OutputPin modelElement = (OutputPin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case InputPinEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			InputPin modelElement = (InputPin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case InputPin2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			InputPin modelElement = (InputPin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case InputPin3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			InputPin modelElement = (InputPin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case CallBehaviorActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case OutputPin3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			OutputPin modelElement = (OutputPin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case InputPin4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			InputPin modelElement = (InputPin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case CallOperationActionEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			CallOperationAction modelElement = (CallOperationAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case InputPin5EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			InputPin modelElement = (InputPin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case StructuredActivityNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case StructuredActivityNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			StructuredActivityNode modelElement = (StructuredActivityNode) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case OpaqueAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			OpaqueAction modelElement = (OpaqueAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case AcceptEventAction3EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case AcceptEventAction4EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			AcceptEventAction modelElement = (AcceptEventAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case ActivityFinalNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case DecisionNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case FlowFinalNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case Pin2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			Pin modelElement = (Pin) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case CreateObjectAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			CreateObjectAction modelElement = (CreateObjectAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case CallBehaviorAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			CallBehaviorAction modelElement = (CallBehaviorAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case CallOperationAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			CallOperationAction modelElement = (CallOperationAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case ForkNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case JoinNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			AddStructuralFeatureValueAction modelElement = (AddStructuralFeatureValueAction) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(modelElement));
			result.addAll(getContainedTypeModelFacetLinks_ExceptionHandler_4005(modelElement));
			break;
		}
		case DataStoreNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			DataStoreNode modelElement = (DataStoreNode) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case CentralBufferNode2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			CentralBufferNode modelElement = (CentralBufferNode) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case OpaqueBehaviorEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case ActivityParameterNodeEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			ActivityParameterNode modelElement = (ActivityParameterNode) view.getElement();
			result.addAll(getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(modelElement));
			break;
		}
		case LiteralStringEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case LiteralString2EditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case ControlFlowEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case ObjectFlowEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
			break;
		}
		case ExceptionHandlerEditPart.VISUAL_ID: {
			domain2NotationMap.put(view.getElement(), view);
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
	private Collection getContainedTypeModelFacetLinks_ControlFlow_4001(Activity container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getEdges().iterator(); links.hasNext();) {
			ActivityEdge link = (ActivityEdge) links.next();
			int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(link);
			if (linkVID == ControlFlowEditPart.VISUAL_ID) {
				ActivityNode dst = link.getTarget();
				ActivityNode src = link.getSource();
				result.add(new LinkDescriptor(src, dst, link, UMLElementTypes.ControlFlow_4001, linkVID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getContainedTypeModelFacetLinks_ObjectFlow_4002(Activity container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getEdges().iterator(); links.hasNext();) {
			ActivityEdge link = (ActivityEdge) links.next();
			int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(link);
			if (linkVID == ObjectFlowEditPart.VISUAL_ID) {
				ActivityNode dst = link.getTarget();
				ActivityNode src = link.getSource();
				result.add(new LinkDescriptor(src, dst, link, UMLElementTypes.ObjectFlow_4002, linkVID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getContainedFeatureModelFacetLinks_Action_LocalPrecondition_4003(Action container) {
		Collection result = new LinkedList();
		for (Iterator destinations = container.getLocalPreconditions().iterator(); destinations.hasNext();) {
			Constraint destination = (Constraint) destinations.next();
			result.add(new LinkDescriptor(container, destination, UMLElementTypes.ActionLocalPrecondition_4003, ActionLocalPreconditionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getContainedFeatureModelFacetLinks_ObjectNode_Selection_4004(ObjectNode container) {
		Collection result = new LinkedList();
		Behavior destination = container.getSelection();
		result.add(new LinkDescriptor(container, destination, UMLElementTypes.ObjectNodeSelection_4004, ObjectNodeSelectionEditPart.VISUAL_ID));
		return result;
	}

	/**
	 * @generated
	 */
	private Collection getContainedTypeModelFacetLinks_ExceptionHandler_4005(ExecutableNode container) {
		Collection result = new LinkedList();
		for (Iterator links = container.getHandlers().iterator(); links.hasNext();) {
			ExceptionHandler link = (ExceptionHandler) links.next();
			int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(link);
			if (linkVID == ExceptionHandlerEditPart.VISUAL_ID) {
				ExecutableNode dst = link.getHandlerBody();
				ExecutableNode src = link.getProtectedNode();
				result.add(new LinkDescriptor(src, dst, link, UMLElementTypes.ExceptionHandler_4005, linkVID));
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection createConnections(Collection linkDescriptors, Map domain2NotationMap) {
		List adapters = new LinkedList();
		for (Iterator linkDescriptorsIterator = linkDescriptors.iterator(); linkDescriptorsIterator.hasNext();) {
			final LinkDescriptor nextLinkDescriptor = (LinkDescriptor) linkDescriptorsIterator.next();
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

	/**
	 * @generated
	 */
	private class LinkDescriptor {

		/**
		 * @generated
		 */
		private EObject mySource;

		/**
		 * @generated
		 */
		private EObject myDestination;

		/**
		 * @generated
		 */
		private EObject myLinkElement;

		/**
		 * @generated
		 */
		private int myVisualID;

		/**
		 * @generated
		 */
		private IAdaptable mySemanticAdapter;

		/**
		 * @generated
		 */
		private LinkDescriptor(EObject source, EObject destination, int linkVID) {
			mySource = source;
			myDestination = destination;
			myVisualID = linkVID;
		}

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination, IElementType elementType, int linkVID) {
			this(source, destination, linkVID);
			final IElementType elementTypeCopy = elementType;
			myLinkElement = null;
			mySemanticAdapter = new IAdaptable() {

				public Object getAdapter(Class adapter) {
					if (IElementType.class.equals(adapter)) {
						return elementTypeCopy;
					}
					return null;
				}
			};
		}

		/**
		 * @generated
		 */
		protected LinkDescriptor(EObject source, EObject destination, EObject linkElement, IElementType elementType, int linkVID) {
			this(source, destination, linkVID);
			final IElementType elementTypeCopy = elementType;
			myLinkElement = linkElement;
			mySemanticAdapter = new EObjectAdapter(linkElement) {

				public Object getAdapter(Class adapter) {
					if (IElementType.class.equals(adapter)) {
						return elementTypeCopy;
					}
					return super.getAdapter(adapter);
				}
			};
		}

		/**
		 * @generated
		 */
		protected EObject getSource() {
			return mySource;
		}

		/**
		 * @generated
		 */
		protected EObject getDestination() {
			return myDestination;
		}

		/**
		 * @generated
		 */
		protected EObject getLinkElement() {
			return myLinkElement;
		}

		/**
		 * @generated
		 */
		protected int getVisualID() {
			return myVisualID;
		}

		/**
		 * @generated
		 */
		protected IAdaptable getSemanticAdapter() {
			return mySemanticAdapter;
		}

	}
}
