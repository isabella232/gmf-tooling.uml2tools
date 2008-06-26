package org.eclipse.uml2.diagram.activity.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.*;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.view.factories.*;

/**
 * @generated
 */
public class UMLViewProvider extends AbstractViewProvider {

	/**
	 * @generated
	 */
	protected Class getDiagramViewClass(IAdaptable semanticAdapter, String diagramKind) {
		EObject semanticElement = getSemanticElement(semanticAdapter);
		if (PackageEditPart.MODEL_ID.equals(diagramKind) && UMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return PackageViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		if (containerView == null) {
			return null;
		}
		IElementType elementType = getSemanticElementType(semanticAdapter);
		EObject domainElement = getSemanticElement(semanticAdapter);
		int visualID;
		if (semanticHint == null) {
			// Semantic hint is not specified. Can be a result of call from CanonicalEditPolicy.
			// In this situation there should be NO elementType, visualID will be determined
			// by VisualIDRegistry.getNodeVisualID() for domainElement.
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				// Semantic hint is specified together with element type.
				// Both parameters should describe exactly the same diagram element.
				// In addition we check that visualID returned by VisualIDRegistry.getNodeVisualID() for
				// domainElement (if specified) is the same as in element type.
				if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
					return null; // foreign element type
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null; // if semantic hint is specified it should be the same as in element type
				}
				if (domainElement != null && UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, visualID)) {
					return null; // visual id for node EClass should match visual id from element type, or at least be substitutable for it
				}
			} else {
				// Element type is not specified. Domain element should be present.
				// This method is called with EObjectAdapter as parameter from:
				//   - ViewService.createNode(View container, EObject eObject, String type, PreferencesHint preferencesHint) 
				//   - generated ViewFactory.decorateView() for parent element
				if (!PackageEditPart.MODEL_ID.equals(UMLVisualIDRegistry.getModelID(containerView))) {
					return null; // foreign diagram
				}
				switch (visualID) {
				case ConstraintEditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && Constraint2EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case Constraint2EditPart.VISUAL_ID: {
					if (domainElement == null) {
						return null;
					}

					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && ConstraintEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case ActivityEditPart.VISUAL_ID:
				case AcceptEventActionEditPart.VISUAL_ID:
				case AcceptEventAction2EditPart.VISUAL_ID:
				case ActivityFinalNodeEditPart.VISUAL_ID:
				case DecisionNodeEditPart.VISUAL_ID:
				case MergeNodeEditPart.VISUAL_ID:
				case InitialNodeEditPart.VISUAL_ID:
				case DataStoreNodeEditPart.VISUAL_ID:
				case CentralBufferNodeEditPart.VISUAL_ID:
				case OpaqueActionEditPart.VISUAL_ID:
				case OutputPinEditPart.VISUAL_ID:
				case FlowFinalNodeEditPart.VISUAL_ID:
				case ForkNodeEditPart.VISUAL_ID:
				case JoinNodeEditPart.VISUAL_ID:
				case PinEditPart.VISUAL_ID:
				case CreateObjectActionEditPart.VISUAL_ID:
				case OutputPin2EditPart.VISUAL_ID:
				case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				case InputPinEditPart.VISUAL_ID:
				case InputPin2EditPart.VISUAL_ID:
				case InputPin3EditPart.VISUAL_ID:
				case CallBehaviorActionEditPart.VISUAL_ID:
				case OutputPin3EditPart.VISUAL_ID:
				case InputPin4EditPart.VISUAL_ID:
				case CallOperationActionEditPart.VISUAL_ID:
				case InputPin5EditPart.VISUAL_ID:
				case StructuredActivityNodeEditPart.VISUAL_ID:
				case StructuredActivityNode2EditPart.VISUAL_ID:
				case OpaqueAction2EditPart.VISUAL_ID:
				case AcceptEventAction3EditPart.VISUAL_ID:
				case AcceptEventAction4EditPart.VISUAL_ID:
				case ActivityFinalNode2EditPart.VISUAL_ID:
				case DecisionNode2EditPart.VISUAL_ID:
				case FlowFinalNode2EditPart.VISUAL_ID:
				case Pin2EditPart.VISUAL_ID:
				case CreateObjectAction2EditPart.VISUAL_ID:
				case CallBehaviorAction2EditPart.VISUAL_ID:
				case CallOperationAction2EditPart.VISUAL_ID:
				case ForkNode2EditPart.VISUAL_ID:
				case JoinNode2EditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
				case DataStoreNode2EditPart.VISUAL_ID:
				case CentralBufferNode2EditPart.VISUAL_ID:
				case InputPin6EditPart.VISUAL_ID:
				case OutputPin4EditPart.VISUAL_ID:
				case OpaqueBehaviorEditPart.VISUAL_ID:
				case ActivityParameterNodeEditPart.VISUAL_ID:
				case SendSignalActionEditPart.VISUAL_ID:
				case ActivityPartitionEditPart.VISUAL_ID:
				case ActivityPartition2EditPart.VISUAL_ID:
				case AcceptEventAction5EditPart.VISUAL_ID:
				case AcceptEventAction6EditPart.VISUAL_ID:
				case ActivityFinalNode3EditPart.VISUAL_ID:
				case DecisionNode3EditPart.VISUAL_ID:
				case MergeNode2EditPart.VISUAL_ID:
				case InitialNode2EditPart.VISUAL_ID:
				case DataStoreNode3EditPart.VISUAL_ID:
				case CentralBufferNode3EditPart.VISUAL_ID:
				case OpaqueAction3EditPart.VISUAL_ID:
				case FlowFinalNode3EditPart.VISUAL_ID:
				case ForkNode3EditPart.VISUAL_ID:
				case JoinNode3EditPart.VISUAL_ID:
				case Pin3EditPart.VISUAL_ID:
				case CreateObjectAction3EditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
				case CallBehaviorAction3EditPart.VISUAL_ID:
				case CallOperationAction3EditPart.VISUAL_ID:
				case StructuredActivityNode3EditPart.VISUAL_ID:
				case StructuredActivityNode4EditPart.VISUAL_ID:
				case InputPin7EditPart.VISUAL_ID:
				case OutputPin5EditPart.VISUAL_ID:
				case SendSignalAction2EditPart.VISUAL_ID:
				case LoopNode2EditPart.VISUAL_ID:
				case ConditionalNode2EditPart.VISUAL_ID:
				case ExpansionRegion2EditPart.VISUAL_ID:
				case LoopNodeEditPart.VISUAL_ID:
				case ConditionalNodeEditPart.VISUAL_ID:
				case ExpansionRegionEditPart.VISUAL_ID:
				case LiteralStringEditPart.VISUAL_ID:
				case LiteralString2EditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case ActivityNameEditPart.VISUAL_ID:
					if (ActivityEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConstraintPreconditionEditPart.VISUAL_ID:
					if (ConstraintEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConstraintPostconditionEditPart.VISUAL_ID:
					if (Constraint2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionNameEditPart.VISUAL_ID:
					if (AcceptEventActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionName3EditPart.VISUAL_ID:
					if (AcceptEventAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DataStoreNodeNameEditPart.VISUAL_ID:
				case DataStoreNodeName2EditPart.VISUAL_ID:
				case DataStoreNodeOrderingEditPart.VISUAL_ID:
					if (DataStoreNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CentralBufferNodeNameEditPart.VISUAL_ID:
				case CentralBufferNodeName2EditPart.VISUAL_ID:
				case CentralBufferNodeOrderingEditPart.VISUAL_ID:
					if (CentralBufferNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueActionNameEditPart.VISUAL_ID:
					if (OpaqueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutputPinNameEditPart.VISUAL_ID:
				case OutputPinOrderingEditPart.VISUAL_ID:
					if (OutputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PinNameEditPart.VISUAL_ID:
				case PinName4EditPart.VISUAL_ID:
				case PinOrderingEditPart.VISUAL_ID:
					if (PinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CreateObjectActionNameEditPart.VISUAL_ID:
					if (CreateObjectActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutputPinName2EditPart.VISUAL_ID:
				case OutputPinOrdering2EditPart.VISUAL_ID:
					if (OutputPin2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
					if (AddStructuralFeatureValueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InputPinNameEditPart.VISUAL_ID:
				case InputPinOrderingEditPart.VISUAL_ID:
					if (InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InputPinName2EditPart.VISUAL_ID:
				case InputPinOrdering2EditPart.VISUAL_ID:
					if (InputPin2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InputPinName3EditPart.VISUAL_ID:
				case InputPinOrdering3EditPart.VISUAL_ID:
					if (InputPin3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallBehaviorActionNameEditPart.VISUAL_ID:
					if (CallBehaviorActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutputPinName3EditPart.VISUAL_ID:
				case OutputPinOrdering3EditPart.VISUAL_ID:
					if (OutputPin3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InputPinName4EditPart.VISUAL_ID:
				case InputPinOrdering4EditPart.VISUAL_ID:
					if (InputPin4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallOperationActionNameEditPart.VISUAL_ID:
					if (CallOperationActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InputPinName5EditPart.VISUAL_ID:
				case InputPinOrdering5EditPart.VISUAL_ID:
					if (InputPin5EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
					if (StructuredActivityNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
					if (StructuredActivityNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueActionName2EditPart.VISUAL_ID:
					if (OpaqueAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionName2EditPart.VISUAL_ID:
					if (AcceptEventAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionName4EditPart.VISUAL_ID:
					if (AcceptEventAction4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PinName2EditPart.VISUAL_ID:
				case PinName5EditPart.VISUAL_ID:
				case PinOrdering2EditPart.VISUAL_ID:
					if (Pin2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CreateObjectActionName2EditPart.VISUAL_ID:
					if (CreateObjectAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallBehaviorActionName2EditPart.VISUAL_ID:
					if (CallBehaviorAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallOperationActionName2EditPart.VISUAL_ID:
					if (CallOperationAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:
					if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DataStoreNodeName3EditPart.VISUAL_ID:
				case DataStoreNodeName4EditPart.VISUAL_ID:
				case DataStoreNodeOrdering2EditPart.VISUAL_ID:
					if (DataStoreNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CentralBufferNodeName3EditPart.VISUAL_ID:
				case CentralBufferNodeName4EditPart.VISUAL_ID:
				case CentralBufferNodeOrdering2EditPart.VISUAL_ID:
					if (CentralBufferNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InputPinName6EditPart.VISUAL_ID:
				case InputPinOrdering6EditPart.VISUAL_ID:
					if (InputPin6EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutputPinName4EditPart.VISUAL_ID:
				case OutputPinOrdering4EditPart.VISUAL_ID:
					if (OutputPin4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueBehaviorNameEditPart.VISUAL_ID:
					if (OpaqueBehaviorEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityParameterNodeNameEditPart.VISUAL_ID:
					if (ActivityParameterNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SendSignalActionNameEditPart.VISUAL_ID:
					if (SendSignalActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartitionNameEditPart.VISUAL_ID:
					if (ActivityPartitionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartitionName2EditPart.VISUAL_ID:
					if (ActivityPartition2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionName5EditPart.VISUAL_ID:
					if (AcceptEventAction5EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionName6EditPart.VISUAL_ID:
					if (AcceptEventAction6EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DataStoreNodeName5EditPart.VISUAL_ID:
				case DataStoreNodeName6EditPart.VISUAL_ID:
				case DataStoreNodeOrdering3EditPart.VISUAL_ID:
					if (DataStoreNode3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CentralBufferNodeName5EditPart.VISUAL_ID:
				case CentralBufferNodeName6EditPart.VISUAL_ID:
				case CentralBufferNodeOrdering3EditPart.VISUAL_ID:
					if (CentralBufferNode3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueActionName3EditPart.VISUAL_ID:
					if (OpaqueAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PinName3EditPart.VISUAL_ID:
				case PinOrdering3EditPart.VISUAL_ID:
					if (Pin3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CreateObjectActionName3EditPart.VISUAL_ID:
					if (CreateObjectAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueActionName3EditPart.VISUAL_ID:
					if (AddStructuralFeatureValueAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallBehaviorActionName3EditPart.VISUAL_ID:
					if (CallBehaviorAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallOperationActionName3EditPart.VISUAL_ID:
					if (CallOperationAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
					if (StructuredActivityNode3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
					if (StructuredActivityNode4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case InputPinName7EditPart.VISUAL_ID:
				case InputPinOrdering7EditPart.VISUAL_ID:
					if (InputPin7EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutputPinName5EditPart.VISUAL_ID:
				case OutputPinOrdering5EditPart.VISUAL_ID:
					if (OutputPin5EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SendSignalActionName2EditPart.VISUAL_ID:
					if (SendSignalAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
					if (LoopNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID:
					if (ConditionalNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExpansionRegionMode2EditPart.VISUAL_ID:
				case ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID:
					if (ExpansionRegion2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID:
					if (LoopNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConditionalNodeConditionalNodeCompartmentEditPart.VISUAL_ID:
					if (ConditionalNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExpansionRegionModeEditPart.VISUAL_ID:
				case ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID:
					if (ExpansionRegionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ControlFlowNameEditPart.VISUAL_ID:
				case ControlFlowName2EditPart.VISUAL_ID:
				case ControlFlowName3EditPart.VISUAL_ID:
					if (ControlFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ObjectFlowNameEditPart.VISUAL_ID:
				case ObjectFlowName2EditPart.VISUAL_ID:
				case ObjectFlowName3EditPart.VISUAL_ID:
					if (ObjectFlowEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ExceptionHandlerLink_fixed_iconEditPart.VISUAL_ID:
					if (ExceptionHandlerEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				default:
					return null;
				}
			}
		}
		return getNodeViewClass(containerView, visualID);
	}

	/**
	 * @generated
	 */
	protected Class getNodeViewClass(View containerView, int visualID) {
		if (containerView == null || !UMLVisualIDRegistry.canCreateNode(containerView, visualID)) {
			return null;
		}
		switch (visualID) {
		case ActivityEditPart.VISUAL_ID:
			return ActivityViewFactory.class;
		case ActivityNameEditPart.VISUAL_ID:
			return ActivityNameViewFactory.class;
		case ConstraintEditPart.VISUAL_ID:
			return ConstraintViewFactory.class;
		case Constraint2EditPart.VISUAL_ID:
			return Constraint2ViewFactory.class;
		case AcceptEventActionEditPart.VISUAL_ID:
			return AcceptEventActionViewFactory.class;
		case AcceptEventActionNameEditPart.VISUAL_ID:
			return AcceptEventActionNameViewFactory.class;
		case AcceptEventAction2EditPart.VISUAL_ID:
			return AcceptEventAction2ViewFactory.class;
		case AcceptEventActionName3EditPart.VISUAL_ID:
			return AcceptEventActionName3ViewFactory.class;
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return ActivityFinalNodeViewFactory.class;
		case DecisionNodeEditPart.VISUAL_ID:
			return DecisionNodeViewFactory.class;
		case MergeNodeEditPart.VISUAL_ID:
			return MergeNodeViewFactory.class;
		case InitialNodeEditPart.VISUAL_ID:
			return InitialNodeViewFactory.class;
		case DataStoreNodeEditPart.VISUAL_ID:
			return DataStoreNodeViewFactory.class;
		case DataStoreNodeNameEditPart.VISUAL_ID:
			return DataStoreNodeNameViewFactory.class;
		case DataStoreNodeName2EditPart.VISUAL_ID:
			return DataStoreNodeName2ViewFactory.class;
		case DataStoreNodeOrderingEditPart.VISUAL_ID:
			return DataStoreNodeOrderingViewFactory.class;
		case CentralBufferNodeEditPart.VISUAL_ID:
			return CentralBufferNodeViewFactory.class;
		case CentralBufferNodeNameEditPart.VISUAL_ID:
			return CentralBufferNodeNameViewFactory.class;
		case CentralBufferNodeName2EditPart.VISUAL_ID:
			return CentralBufferNodeName2ViewFactory.class;
		case CentralBufferNodeOrderingEditPart.VISUAL_ID:
			return CentralBufferNodeOrderingViewFactory.class;
		case OpaqueActionEditPart.VISUAL_ID:
			return OpaqueActionViewFactory.class;
		case OpaqueActionNameEditPart.VISUAL_ID:
			return OpaqueActionNameViewFactory.class;
		case OutputPinEditPart.VISUAL_ID:
			return OutputPinViewFactory.class;
		case OutputPinNameEditPart.VISUAL_ID:
			return OutputPinNameViewFactory.class;
		case OutputPinOrderingEditPart.VISUAL_ID:
			return OutputPinOrderingViewFactory.class;
		case FlowFinalNodeEditPart.VISUAL_ID:
			return FlowFinalNodeViewFactory.class;
		case ForkNodeEditPart.VISUAL_ID:
			return ForkNodeViewFactory.class;
		case JoinNodeEditPart.VISUAL_ID:
			return JoinNodeViewFactory.class;
		case PinEditPart.VISUAL_ID:
			return PinViewFactory.class;
		case PinNameEditPart.VISUAL_ID:
			return PinNameViewFactory.class;
		case PinName4EditPart.VISUAL_ID:
			return PinName4ViewFactory.class;
		case PinOrderingEditPart.VISUAL_ID:
			return PinOrderingViewFactory.class;
		case CreateObjectActionEditPart.VISUAL_ID:
			return CreateObjectActionViewFactory.class;
		case CreateObjectActionNameEditPart.VISUAL_ID:
			return CreateObjectActionNameViewFactory.class;
		case OutputPin2EditPart.VISUAL_ID:
			return OutputPin2ViewFactory.class;
		case OutputPinName2EditPart.VISUAL_ID:
			return OutputPinName2ViewFactory.class;
		case OutputPinOrdering2EditPart.VISUAL_ID:
			return OutputPinOrdering2ViewFactory.class;
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionViewFactory.class;
		case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionNameViewFactory.class;
		case InputPinEditPart.VISUAL_ID:
			return InputPinViewFactory.class;
		case InputPinNameEditPart.VISUAL_ID:
			return InputPinNameViewFactory.class;
		case InputPinOrderingEditPart.VISUAL_ID:
			return InputPinOrderingViewFactory.class;
		case InputPin2EditPart.VISUAL_ID:
			return InputPin2ViewFactory.class;
		case InputPinName2EditPart.VISUAL_ID:
			return InputPinName2ViewFactory.class;
		case InputPinOrdering2EditPart.VISUAL_ID:
			return InputPinOrdering2ViewFactory.class;
		case InputPin3EditPart.VISUAL_ID:
			return InputPin3ViewFactory.class;
		case InputPinName3EditPart.VISUAL_ID:
			return InputPinName3ViewFactory.class;
		case InputPinOrdering3EditPart.VISUAL_ID:
			return InputPinOrdering3ViewFactory.class;
		case CallBehaviorActionEditPart.VISUAL_ID:
			return CallBehaviorActionViewFactory.class;
		case CallBehaviorActionNameEditPart.VISUAL_ID:
			return CallBehaviorActionNameViewFactory.class;
		case OutputPin3EditPart.VISUAL_ID:
			return OutputPin3ViewFactory.class;
		case OutputPinName3EditPart.VISUAL_ID:
			return OutputPinName3ViewFactory.class;
		case OutputPinOrdering3EditPart.VISUAL_ID:
			return OutputPinOrdering3ViewFactory.class;
		case InputPin4EditPart.VISUAL_ID:
			return InputPin4ViewFactory.class;
		case InputPinName4EditPart.VISUAL_ID:
			return InputPinName4ViewFactory.class;
		case InputPinOrdering4EditPart.VISUAL_ID:
			return InputPinOrdering4ViewFactory.class;
		case CallOperationActionEditPart.VISUAL_ID:
			return CallOperationActionViewFactory.class;
		case CallOperationActionNameEditPart.VISUAL_ID:
			return CallOperationActionNameViewFactory.class;
		case InputPin5EditPart.VISUAL_ID:
			return InputPin5ViewFactory.class;
		case InputPinName5EditPart.VISUAL_ID:
			return InputPinName5ViewFactory.class;
		case InputPinOrdering5EditPart.VISUAL_ID:
			return InputPinOrdering5ViewFactory.class;
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return StructuredActivityNodeViewFactory.class;
		case StructuredActivityNode2EditPart.VISUAL_ID:
			return StructuredActivityNode2ViewFactory.class;
		case OpaqueAction2EditPart.VISUAL_ID:
			return OpaqueAction2ViewFactory.class;
		case OpaqueActionName2EditPart.VISUAL_ID:
			return OpaqueActionName2ViewFactory.class;
		case AcceptEventAction3EditPart.VISUAL_ID:
			return AcceptEventAction3ViewFactory.class;
		case AcceptEventActionName2EditPart.VISUAL_ID:
			return AcceptEventActionName2ViewFactory.class;
		case AcceptEventAction4EditPart.VISUAL_ID:
			return AcceptEventAction4ViewFactory.class;
		case AcceptEventActionName4EditPart.VISUAL_ID:
			return AcceptEventActionName4ViewFactory.class;
		case ActivityFinalNode2EditPart.VISUAL_ID:
			return ActivityFinalNode2ViewFactory.class;
		case DecisionNode2EditPart.VISUAL_ID:
			return DecisionNode2ViewFactory.class;
		case FlowFinalNode2EditPart.VISUAL_ID:
			return FlowFinalNode2ViewFactory.class;
		case Pin2EditPart.VISUAL_ID:
			return Pin2ViewFactory.class;
		case PinName2EditPart.VISUAL_ID:
			return PinName2ViewFactory.class;
		case PinName5EditPart.VISUAL_ID:
			return PinName5ViewFactory.class;
		case PinOrdering2EditPart.VISUAL_ID:
			return PinOrdering2ViewFactory.class;
		case CreateObjectAction2EditPart.VISUAL_ID:
			return CreateObjectAction2ViewFactory.class;
		case CreateObjectActionName2EditPart.VISUAL_ID:
			return CreateObjectActionName2ViewFactory.class;
		case CallBehaviorAction2EditPart.VISUAL_ID:
			return CallBehaviorAction2ViewFactory.class;
		case CallBehaviorActionName2EditPart.VISUAL_ID:
			return CallBehaviorActionName2ViewFactory.class;
		case CallOperationAction2EditPart.VISUAL_ID:
			return CallOperationAction2ViewFactory.class;
		case CallOperationActionName2EditPart.VISUAL_ID:
			return CallOperationActionName2ViewFactory.class;
		case ForkNode2EditPart.VISUAL_ID:
			return ForkNode2ViewFactory.class;
		case JoinNode2EditPart.VISUAL_ID:
			return JoinNode2ViewFactory.class;
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction2ViewFactory.class;
		case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionName2ViewFactory.class;
		case DataStoreNode2EditPart.VISUAL_ID:
			return DataStoreNode2ViewFactory.class;
		case DataStoreNodeName3EditPart.VISUAL_ID:
			return DataStoreNodeName3ViewFactory.class;
		case DataStoreNodeName4EditPart.VISUAL_ID:
			return DataStoreNodeName4ViewFactory.class;
		case DataStoreNodeOrdering2EditPart.VISUAL_ID:
			return DataStoreNodeOrdering2ViewFactory.class;
		case CentralBufferNode2EditPart.VISUAL_ID:
			return CentralBufferNode2ViewFactory.class;
		case CentralBufferNodeName3EditPart.VISUAL_ID:
			return CentralBufferNodeName3ViewFactory.class;
		case CentralBufferNodeName4EditPart.VISUAL_ID:
			return CentralBufferNodeName4ViewFactory.class;
		case CentralBufferNodeOrdering2EditPart.VISUAL_ID:
			return CentralBufferNodeOrdering2ViewFactory.class;
		case InputPin6EditPart.VISUAL_ID:
			return InputPin6ViewFactory.class;
		case InputPinName6EditPart.VISUAL_ID:
			return InputPinName6ViewFactory.class;
		case InputPinOrdering6EditPart.VISUAL_ID:
			return InputPinOrdering6ViewFactory.class;
		case OutputPin4EditPart.VISUAL_ID:
			return OutputPin4ViewFactory.class;
		case OutputPinName4EditPart.VISUAL_ID:
			return OutputPinName4ViewFactory.class;
		case OutputPinOrdering4EditPart.VISUAL_ID:
			return OutputPinOrdering4ViewFactory.class;
		case OpaqueBehaviorEditPart.VISUAL_ID:
			return OpaqueBehaviorViewFactory.class;
		case OpaqueBehaviorNameEditPart.VISUAL_ID:
			return OpaqueBehaviorNameViewFactory.class;
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return ActivityParameterNodeViewFactory.class;
		case ActivityParameterNodeNameEditPart.VISUAL_ID:
			return ActivityParameterNodeNameViewFactory.class;
		case SendSignalActionEditPart.VISUAL_ID:
			return SendSignalActionViewFactory.class;
		case SendSignalActionNameEditPart.VISUAL_ID:
			return SendSignalActionNameViewFactory.class;
		case ActivityPartitionEditPart.VISUAL_ID:
			return ActivityPartitionViewFactory.class;
		case ActivityPartitionNameEditPart.VISUAL_ID:
			return ActivityPartitionNameViewFactory.class;
		case ActivityPartition2EditPart.VISUAL_ID:
			return ActivityPartition2ViewFactory.class;
		case ActivityPartitionName2EditPart.VISUAL_ID:
			return ActivityPartitionName2ViewFactory.class;
		case AcceptEventAction5EditPart.VISUAL_ID:
			return AcceptEventAction5ViewFactory.class;
		case AcceptEventActionName5EditPart.VISUAL_ID:
			return AcceptEventActionName5ViewFactory.class;
		case AcceptEventAction6EditPart.VISUAL_ID:
			return AcceptEventAction6ViewFactory.class;
		case AcceptEventActionName6EditPart.VISUAL_ID:
			return AcceptEventActionName6ViewFactory.class;
		case ActivityFinalNode3EditPart.VISUAL_ID:
			return ActivityFinalNode3ViewFactory.class;
		case DecisionNode3EditPart.VISUAL_ID:
			return DecisionNode3ViewFactory.class;
		case MergeNode2EditPart.VISUAL_ID:
			return MergeNode2ViewFactory.class;
		case InitialNode2EditPart.VISUAL_ID:
			return InitialNode2ViewFactory.class;
		case DataStoreNode3EditPart.VISUAL_ID:
			return DataStoreNode3ViewFactory.class;
		case DataStoreNodeName5EditPart.VISUAL_ID:
			return DataStoreNodeName5ViewFactory.class;
		case DataStoreNodeName6EditPart.VISUAL_ID:
			return DataStoreNodeName6ViewFactory.class;
		case DataStoreNodeOrdering3EditPart.VISUAL_ID:
			return DataStoreNodeOrdering3ViewFactory.class;
		case CentralBufferNode3EditPart.VISUAL_ID:
			return CentralBufferNode3ViewFactory.class;
		case CentralBufferNodeName5EditPart.VISUAL_ID:
			return CentralBufferNodeName5ViewFactory.class;
		case CentralBufferNodeName6EditPart.VISUAL_ID:
			return CentralBufferNodeName6ViewFactory.class;
		case CentralBufferNodeOrdering3EditPart.VISUAL_ID:
			return CentralBufferNodeOrdering3ViewFactory.class;
		case OpaqueAction3EditPart.VISUAL_ID:
			return OpaqueAction3ViewFactory.class;
		case OpaqueActionName3EditPart.VISUAL_ID:
			return OpaqueActionName3ViewFactory.class;
		case FlowFinalNode3EditPart.VISUAL_ID:
			return FlowFinalNode3ViewFactory.class;
		case ForkNode3EditPart.VISUAL_ID:
			return ForkNode3ViewFactory.class;
		case JoinNode3EditPart.VISUAL_ID:
			return JoinNode3ViewFactory.class;
		case Pin3EditPart.VISUAL_ID:
			return Pin3ViewFactory.class;
		case PinName3EditPart.VISUAL_ID:
			return PinName3ViewFactory.class;
		case PinOrdering3EditPart.VISUAL_ID:
			return PinOrdering3ViewFactory.class;
		case CreateObjectAction3EditPart.VISUAL_ID:
			return CreateObjectAction3ViewFactory.class;
		case CreateObjectActionName3EditPart.VISUAL_ID:
			return CreateObjectActionName3ViewFactory.class;
		case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction3ViewFactory.class;
		case AddStructuralFeatureValueActionName3EditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionName3ViewFactory.class;
		case CallBehaviorAction3EditPart.VISUAL_ID:
			return CallBehaviorAction3ViewFactory.class;
		case CallBehaviorActionName3EditPart.VISUAL_ID:
			return CallBehaviorActionName3ViewFactory.class;
		case CallOperationAction3EditPart.VISUAL_ID:
			return CallOperationAction3ViewFactory.class;
		case CallOperationActionName3EditPart.VISUAL_ID:
			return CallOperationActionName3ViewFactory.class;
		case StructuredActivityNode3EditPart.VISUAL_ID:
			return StructuredActivityNode3ViewFactory.class;
		case StructuredActivityNode4EditPart.VISUAL_ID:
			return StructuredActivityNode4ViewFactory.class;
		case InputPin7EditPart.VISUAL_ID:
			return InputPin7ViewFactory.class;
		case InputPinName7EditPart.VISUAL_ID:
			return InputPinName7ViewFactory.class;
		case InputPinOrdering7EditPart.VISUAL_ID:
			return InputPinOrdering7ViewFactory.class;
		case OutputPin5EditPart.VISUAL_ID:
			return OutputPin5ViewFactory.class;
		case OutputPinName5EditPart.VISUAL_ID:
			return OutputPinName5ViewFactory.class;
		case OutputPinOrdering5EditPart.VISUAL_ID:
			return OutputPinOrdering5ViewFactory.class;
		case SendSignalAction2EditPart.VISUAL_ID:
			return SendSignalAction2ViewFactory.class;
		case SendSignalActionName2EditPart.VISUAL_ID:
			return SendSignalActionName2ViewFactory.class;
		case LoopNode2EditPart.VISUAL_ID:
			return LoopNode2ViewFactory.class;
		case ConditionalNode2EditPart.VISUAL_ID:
			return ConditionalNode2ViewFactory.class;
		case ExpansionRegion2EditPart.VISUAL_ID:
			return ExpansionRegion2ViewFactory.class;
		case ExpansionRegionMode2EditPart.VISUAL_ID:
			return ExpansionRegionMode2ViewFactory.class;
		case LoopNodeEditPart.VISUAL_ID:
			return LoopNodeViewFactory.class;
		case ConditionalNodeEditPart.VISUAL_ID:
			return ConditionalNodeViewFactory.class;
		case ExpansionRegionEditPart.VISUAL_ID:
			return ExpansionRegionViewFactory.class;
		case ExpansionRegionModeEditPart.VISUAL_ID:
			return ExpansionRegionModeViewFactory.class;
		case LiteralStringEditPart.VISUAL_ID:
			return LiteralStringViewFactory.class;
		case LiteralString2EditPart.VISUAL_ID:
			return LiteralString2ViewFactory.class;
		case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
			return StructuredActivityNodeStructuredActivityContentPaneCompartmentViewFactory.class;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
			return StructuredActivityNodeStructuredActivityContentPaneCompartment2ViewFactory.class;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
			return StructuredActivityNodeStructuredActivityContentPaneCompartment3ViewFactory.class;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
			return StructuredActivityNodeStructuredActivityContentPaneCompartment4ViewFactory.class;
		case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
			return LoopNodeLoopNodeContentPaneCompartment2ViewFactory.class;
		case ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID:
			return ConditionalNodeConditionalNodeCompartment2ViewFactory.class;
		case ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID:
			return ExpansionRegionExpansionRegionNodeCompartment2ViewFactory.class;
		case LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID:
			return LoopNodeLoopNodeContentPaneCompartmentViewFactory.class;
		case ConditionalNodeConditionalNodeCompartmentEditPart.VISUAL_ID:
			return ConditionalNodeConditionalNodeCompartmentViewFactory.class;
		case ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID:
			return ExpansionRegionExpansionRegionNodeCompartmentViewFactory.class;
		case ConstraintPreconditionEditPart.VISUAL_ID:
			return ConstraintPreconditionViewFactory.class;
		case ConstraintPostconditionEditPart.VISUAL_ID:
			return ConstraintPostconditionViewFactory.class;
		case ControlFlowNameEditPart.VISUAL_ID:
			return ControlFlowNameViewFactory.class;
		case ControlFlowName2EditPart.VISUAL_ID:
			return ControlFlowName2ViewFactory.class;
		case ControlFlowName3EditPart.VISUAL_ID:
			return ControlFlowName3ViewFactory.class;
		case ObjectFlowNameEditPart.VISUAL_ID:
			return ObjectFlowNameViewFactory.class;
		case ObjectFlowName2EditPart.VISUAL_ID:
			return ObjectFlowName2ViewFactory.class;
		case ObjectFlowName3EditPart.VISUAL_ID:
			return ObjectFlowName3ViewFactory.class;
		case ExceptionHandlerLink_fixed_iconEditPart.VISUAL_ID:
			return ExceptionHandlerLink_fixed_iconViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (!UMLElementTypes.isKnownElementType(elementType) || (!(elementType instanceof IHintedType))) {
			return null; // foreign element type
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null; // our hint is visual id and must be specified
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null; // if semantic hint is specified it should be the same as in element type
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null; // visual id for link EClass should match visual id from element type
		}
		return getEdgeViewClass(visualID);
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(int visualID) {
		switch (visualID) {
		case ControlFlowEditPart.VISUAL_ID:
			return ControlFlowViewFactory.class;
		case ObjectFlowEditPart.VISUAL_ID:
			return ObjectFlowViewFactory.class;
		case ActionLocalPreconditionEditPart.VISUAL_ID:
			return ActionLocalPreconditionViewFactory.class;
		case ActionLocalPostconditionEditPart.VISUAL_ID:
			return ActionLocalPostconditionViewFactory.class;
		case ObjectNodeSelectionEditPart.VISUAL_ID:
			return ObjectNodeSelectionViewFactory.class;
		case ExceptionHandlerEditPart.VISUAL_ID:
			return ExceptionHandlerViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	private IElementType getSemanticElementType(IAdaptable semanticAdapter) {
		if (semanticAdapter == null) {
			return null;
		}
		return (IElementType) semanticAdapter.getAdapter(IElementType.class);
	}

}
