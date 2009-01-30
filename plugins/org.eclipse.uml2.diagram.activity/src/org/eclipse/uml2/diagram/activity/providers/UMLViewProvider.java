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
				if (domainElement != null && !UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, visualID)) {
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
				case AcceptTimeEventActionEditPart.VISUAL_ID:
				case ActivityFinalNodeEditPart.VISUAL_ID:
				case DecisionNodeEditPart.VISUAL_ID:
				case MergeNodeEditPart.VISUAL_ID:
				case InitialNodeEditPart.VISUAL_ID:
				case DataStoreNodeEditPart.VISUAL_ID:
				case CentralBufferNodeEditPart.VISUAL_ID:
				case OpaqueActionEditPart.VISUAL_ID:
				case OpaqueAction_OutputPinEditPart.VISUAL_ID:
				case FlowFinalNodeEditPart.VISUAL_ID:
				case ForkNodeEditPart.VISUAL_ID:
				case JoinNodeEditPart.VISUAL_ID:
				case PinEditPart.VISUAL_ID:
				case CreateObjectActionEditPart.VISUAL_ID:
				case CreateObjectAction_OutputPinEditPart.VISUAL_ID:
				case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction_insertAt_InputPinEditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction_value_InputPinEditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction_object_InputPinEditPart.VISUAL_ID:
				case CallBehaviorActionEditPart.VISUAL_ID:
				case CallAction_OutputPinEditPart.VISUAL_ID:
				case CallAction_InputPinEditPart.VISUAL_ID:
				case CallOperationActionEditPart.VISUAL_ID:
				case CallOperationAction_InputPinEditPart.VISUAL_ID:
				case StructuredActivityNodeEditPart.VISUAL_ID:
				case StructuredActivityNode2EditPart.VISUAL_ID:
				case OpaqueAction2EditPart.VISUAL_ID:
				case AcceptEventAction3EditPart.VISUAL_ID:
				case AcceptEventAction4EditPart.VISUAL_ID:
				case ActivityFinalNode2EditPart.VISUAL_ID:
				case DecisionNode2EditPart.VISUAL_ID:
				case FlowFinalNode2EditPart.VISUAL_ID:
				case StructuredActivityNode_PinEditPart.VISUAL_ID:
				case CreateObjectAction2EditPart.VISUAL_ID:
				case CallBehaviorAction2EditPart.VISUAL_ID:
				case CallOperationAction2EditPart.VISUAL_ID:
				case ForkNode2EditPart.VISUAL_ID:
				case JoinNode2EditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
				case DataStoreNode2EditPart.VISUAL_ID:
				case CentralBufferNode2EditPart.VISUAL_ID:
				case StructuredActivityNode_InputPinEditPart.VISUAL_ID:
				case StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
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
				case ActivityPartition_PinEditPart.VISUAL_ID:
				case CreateObjectAction3EditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
				case CallBehaviorAction3EditPart.VISUAL_ID:
				case CallOperationAction3EditPart.VISUAL_ID:
				case StructuredActivityNode3EditPart.VISUAL_ID:
				case StructuredActivityNode4EditPart.VISUAL_ID:
				case StructuredActivityNode_StructuredActivityNode_InputPinEditPart.VISUAL_ID:
				case StructuredActivityNode_StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
				case SendSignalAction2EditPart.VISUAL_ID:
				case LoopNode2EditPart.VISUAL_ID:
				case ConditionalNode2EditPart.VISUAL_ID:
				case ExpansionRegion2EditPart.VISUAL_ID:
				case ValueSpecificationActionEditPart.VISUAL_ID:
				case OutputPin6EditPart.VISUAL_ID:
				case LoopNodeEditPart.VISUAL_ID:
				case ConditionalNodeEditPart.VISUAL_ID:
				case ExpansionRegionEditPart.VISUAL_ID:
				case ParameterSetEditPart.VISUAL_ID:
				case ParameterEditPart.VISUAL_ID:
				case ValueSpecificationAction2EditPart.VISUAL_ID:
				case LiteralStringEditPart.VISUAL_ID:
				case LiteralString2EditPart.VISUAL_ID:
					if (domainElement == null || visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null; // visual id in semantic hint should match visual id for domain element
					}
					break;
				case ActivityNameEditPart.VISUAL_ID:
				case ActivityStereotypeEditPart.VISUAL_ID:
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
				case AcceptEventActionStereotypeEditPart.VISUAL_ID:
					if (AcceptEventActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptTimeEventActionNameEditPart.VISUAL_ID:
					if (AcceptTimeEventActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DataStoreNodeNameEditPart.VISUAL_ID:
				case DataStoreNodeInStateEditPart.VISUAL_ID:
				case DataStoreNodeOrderingEditPart.VISUAL_ID:
				case DataStoreNodeStereotypeEditPart.VISUAL_ID:
					if (DataStoreNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CentralBufferNodeNameEditPart.VISUAL_ID:
				case CentralBufferNodeInStateEditPart.VISUAL_ID:
				case CentralBufferNodeOrderingEditPart.VISUAL_ID:
				case CentralBufferNodeStereotypeEditPart.VISUAL_ID:
					if (CentralBufferNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueActionNameEditPart.VISUAL_ID:
				case OpaqueActionStereotypeEditPart.VISUAL_ID:
					if (OpaqueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueAction_OutputPinNameEditPart.VISUAL_ID:
				case OpaqueAction_OutputPinOrderingEditPart.VISUAL_ID:
					if (OpaqueAction_OutputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case PinNameEditPart.VISUAL_ID:
				case PinInStateEditPart.VISUAL_ID:
				case PinOrderingEditPart.VISUAL_ID:
				case PinStereotypeEditPart.VISUAL_ID:
					if (PinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CreateObjectActionNameEditPart.VISUAL_ID:
				case CreateObjectActionStereotypeEditPart.VISUAL_ID:
					if (CreateObjectActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CreateObjectAction_OutputPinNameEditPart.VISUAL_ID:
				case CreateObjectAction_OutputPinOrderingEditPart.VISUAL_ID:
					if (CreateObjectAction_OutputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
				case AddStructuralFeatureValueActionStereotypeEditPart.VISUAL_ID:
					if (AddStructuralFeatureValueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueAction_insertAt_InputPinNameEditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction_insertAt_InputPinOrderingEditPart.VISUAL_ID:
					if (AddStructuralFeatureValueAction_insertAt_InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueAction_value_InputPinNameEditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction_value_InputPinOrderingEditPart.VISUAL_ID:
					if (AddStructuralFeatureValueAction_value_InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueAction_object_InputPinNameEditPart.VISUAL_ID:
				case AddStructuralFeatureValueAction_object_InputPinOrderingEditPart.VISUAL_ID:
					if (AddStructuralFeatureValueAction_object_InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallBehaviorActionNameEditPart.VISUAL_ID:
				case CallBehaviorActionStereotypeEditPart.VISUAL_ID:
					if (CallBehaviorActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallAction_OutputPinNameEditPart.VISUAL_ID:
				case CallAction_OutputPinOrderingEditPart.VISUAL_ID:
					if (CallAction_OutputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallAction_InputPinNameEditPart.VISUAL_ID:
				case CallAction_InputPinOrderingEditPart.VISUAL_ID:
					if (CallAction_InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallOperationActionNameEditPart.VISUAL_ID:
				case CallOperationActionStereotypeEditPart.VISUAL_ID:
					if (CallOperationActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallOperationAction_InputPinNameEditPart.VISUAL_ID:
				case CallOperationAction_InputPinOrderingEditPart.VISUAL_ID:
					if (CallOperationAction_InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNodeNameEditPart.VISUAL_ID:
				case StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
				case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
					if (StructuredActivityNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNodeName2EditPart.VISUAL_ID:
				case StructuredActivityNodeStereotype2EditPart.VISUAL_ID:
				case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
					if (StructuredActivityNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueActionName2EditPart.VISUAL_ID:
				case OpaqueActionStereotype2EditPart.VISUAL_ID:
					if (OpaqueAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionName2EditPart.VISUAL_ID:
				case AcceptEventActionStereotype2EditPart.VISUAL_ID:
					if (AcceptEventAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionName4EditPart.VISUAL_ID:
					if (AcceptEventAction4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_PinNameEditPart.VISUAL_ID:
				case StructuredActivityNode_PinInStateEditPart.VISUAL_ID:
				case StructuredActivityNode_PinOrderingEditPart.VISUAL_ID:
				case StructuredActivityNode_PinStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_PinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CreateObjectActionName2EditPart.VISUAL_ID:
				case CreateObjectActionStereotype2EditPart.VISUAL_ID:
					if (CreateObjectAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallBehaviorActionName2EditPart.VISUAL_ID:
				case CallBehaviorActionStereotype2EditPart.VISUAL_ID:
					if (CallBehaviorAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallOperationActionName2EditPart.VISUAL_ID:
				case CallOperationActionStereotype2EditPart.VISUAL_ID:
					if (CallOperationAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:
				case AddStructuralFeatureValueActionStereotype2EditPart.VISUAL_ID:
					if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DataStoreNodeName2EditPart.VISUAL_ID:
				case DataStoreNodeInState2EditPart.VISUAL_ID:
				case DataStoreNodeOrdering2EditPart.VISUAL_ID:
				case DataStoreNodeStereotype2EditPart.VISUAL_ID:
					if (DataStoreNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CentralBufferNodeName2EditPart.VISUAL_ID:
				case CentralBufferNodeInState2EditPart.VISUAL_ID:
				case CentralBufferNodeOrdering2EditPart.VISUAL_ID:
				case CentralBufferNodeStereotype2EditPart.VISUAL_ID:
					if (CentralBufferNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_InputPinNameEditPart.VISUAL_ID:
				case StructuredActivityNode_InputPinOrderingEditPart.VISUAL_ID:
					if (StructuredActivityNode_InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_OutputPinNameEditPart.VISUAL_ID:
				case StructuredActivityNode_OutputPinOrderingEditPart.VISUAL_ID:
					if (StructuredActivityNode_OutputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueBehaviorNameEditPart.VISUAL_ID:
					if (OpaqueBehaviorEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityParameterNodeNameEditPart.VISUAL_ID:
				case ActivityParameterNodeStereotypeEditPart.VISUAL_ID:
					if (ActivityParameterNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SendSignalActionNameEditPart.VISUAL_ID:
				case SendSignalActionStereotypeEditPart.VISUAL_ID:
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
				case AcceptEventActionStereotype5EditPart.VISUAL_ID:
					if (AcceptEventAction5EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AcceptEventActionName6EditPart.VISUAL_ID:
					if (AcceptEventAction6EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case DataStoreNodeName3EditPart.VISUAL_ID:
				case DataStoreNodeInState3EditPart.VISUAL_ID:
				case DataStoreNodeOrdering3EditPart.VISUAL_ID:
				case DataStoreNodeStereotype3EditPart.VISUAL_ID:
					if (DataStoreNode3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CentralBufferNodeName3EditPart.VISUAL_ID:
				case CentralBufferNodeInState3EditPart.VISUAL_ID:
				case CentralBufferNodeOrdering3EditPart.VISUAL_ID:
				case CentralBufferNodeStereotype3EditPart.VISUAL_ID:
					if (CentralBufferNode3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OpaqueActionName3EditPart.VISUAL_ID:
				case OpaqueActionStereotype3EditPart.VISUAL_ID:
					if (OpaqueAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_PinNameEditPart.VISUAL_ID:
				case ActivityPartition_PinInStateEditPart.VISUAL_ID:
				case ActivityPartition_PinOrderingEditPart.VISUAL_ID:
				case ActivityPartition_PinStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_PinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CreateObjectActionName3EditPart.VISUAL_ID:
				case CreateObjectActionStereotype3EditPart.VISUAL_ID:
					if (CreateObjectAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case AddStructuralFeatureValueActionName3EditPart.VISUAL_ID:
				case AddStructuralFeatureValueActionStereotype3EditPart.VISUAL_ID:
					if (AddStructuralFeatureValueAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallBehaviorActionName3EditPart.VISUAL_ID:
				case CallBehaviorActionStereotype3EditPart.VISUAL_ID:
					if (CallBehaviorAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case CallOperationActionName3EditPart.VISUAL_ID:
				case CallOperationActionStereotype3EditPart.VISUAL_ID:
					if (CallOperationAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNodeStereotype3EditPart.VISUAL_ID:
				case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
					if (StructuredActivityNode3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNodeStereotype4EditPart.VISUAL_ID:
				case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
					if (StructuredActivityNode4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_StructuredActivityNode_InputPinNameEditPart.VISUAL_ID:
				case StructuredActivityNode_StructuredActivityNode_InputPinOrderingEditPart.VISUAL_ID:
					if (StructuredActivityNode_StructuredActivityNode_InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_StructuredActivityNode_OutputPinNameEditPart.VISUAL_ID:
				case StructuredActivityNode_StructuredActivityNode_OutputPinOrderingEditPart.VISUAL_ID:
					if (StructuredActivityNode_StructuredActivityNode_OutputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case SendSignalActionName2EditPart.VISUAL_ID:
				case SendSignalActionStereotype2EditPart.VISUAL_ID:
					if (SendSignalAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LoopNodeStereotype2EditPart.VISUAL_ID:
				case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
					if (LoopNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConditionalNodeStereotypeEditPart.VISUAL_ID:
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
				case ValueSpecificationActionNameEditPart.VISUAL_ID:
				case ValueSpecificationActionStereotypeEditPart.VISUAL_ID:
					if (ValueSpecificationActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case OutputPinName6EditPart.VISUAL_ID:
				case OutputPinOrdering6EditPart.VISUAL_ID:
					if (OutputPin6EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case LoopNodeNameEditPart.VISUAL_ID:
				case LoopNodeStereotypeEditPart.VISUAL_ID:
				case LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID:
					if (LoopNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ConditionalNodeNameEditPart.VISUAL_ID:
				case ConditionalNodeStereotype2EditPart.VISUAL_ID:
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
				case ValueSpecificationActionName2EditPart.VISUAL_ID:
				case ValueSpecificationActionStereotype2EditPart.VISUAL_ID:
					if (ValueSpecificationAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		case ActivityStereotypeEditPart.VISUAL_ID:
			return ActivityStereotypeViewFactory.class;
		case ConstraintEditPart.VISUAL_ID:
			return ConstraintViewFactory.class;
		case Constraint2EditPart.VISUAL_ID:
			return Constraint2ViewFactory.class;
		case AcceptEventActionEditPart.VISUAL_ID:
			return AcceptEventActionViewFactory.class;
		case AcceptEventActionNameEditPart.VISUAL_ID:
			return AcceptEventActionNameViewFactory.class;
		case AcceptEventActionStereotypeEditPart.VISUAL_ID:
			return AcceptEventActionStereotypeViewFactory.class;
		case AcceptTimeEventActionEditPart.VISUAL_ID:
			return AcceptTimeEventActionViewFactory.class;
		case AcceptTimeEventActionNameEditPart.VISUAL_ID:
			return AcceptTimeEventActionNameViewFactory.class;
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
		case DataStoreNodeInStateEditPart.VISUAL_ID:
			return DataStoreNodeInStateViewFactory.class;
		case DataStoreNodeOrderingEditPart.VISUAL_ID:
			return DataStoreNodeOrderingViewFactory.class;
		case DataStoreNodeStereotypeEditPart.VISUAL_ID:
			return DataStoreNodeStereotypeViewFactory.class;
		case CentralBufferNodeEditPart.VISUAL_ID:
			return CentralBufferNodeViewFactory.class;
		case CentralBufferNodeNameEditPart.VISUAL_ID:
			return CentralBufferNodeNameViewFactory.class;
		case CentralBufferNodeInStateEditPart.VISUAL_ID:
			return CentralBufferNodeInStateViewFactory.class;
		case CentralBufferNodeOrderingEditPart.VISUAL_ID:
			return CentralBufferNodeOrderingViewFactory.class;
		case CentralBufferNodeStereotypeEditPart.VISUAL_ID:
			return CentralBufferNodeStereotypeViewFactory.class;
		case OpaqueActionEditPart.VISUAL_ID:
			return OpaqueActionViewFactory.class;
		case OpaqueActionNameEditPart.VISUAL_ID:
			return OpaqueActionNameViewFactory.class;
		case OpaqueActionStereotypeEditPart.VISUAL_ID:
			return OpaqueActionStereotypeViewFactory.class;
		case OpaqueAction_OutputPinEditPart.VISUAL_ID:
			return OpaqueAction_OutputPinViewFactory.class;
		case OpaqueAction_OutputPinNameEditPart.VISUAL_ID:
			return OpaqueAction_OutputPinNameViewFactory.class;
		case OpaqueAction_OutputPinOrderingEditPart.VISUAL_ID:
			return OpaqueAction_OutputPinOrderingViewFactory.class;
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
		case PinInStateEditPart.VISUAL_ID:
			return PinInStateViewFactory.class;
		case PinOrderingEditPart.VISUAL_ID:
			return PinOrderingViewFactory.class;
		case PinStereotypeEditPart.VISUAL_ID:
			return PinStereotypeViewFactory.class;
		case CreateObjectActionEditPart.VISUAL_ID:
			return CreateObjectActionViewFactory.class;
		case CreateObjectActionNameEditPart.VISUAL_ID:
			return CreateObjectActionNameViewFactory.class;
		case CreateObjectActionStereotypeEditPart.VISUAL_ID:
			return CreateObjectActionStereotypeViewFactory.class;
		case CreateObjectAction_OutputPinEditPart.VISUAL_ID:
			return CreateObjectAction_OutputPinViewFactory.class;
		case CreateObjectAction_OutputPinNameEditPart.VISUAL_ID:
			return CreateObjectAction_OutputPinNameViewFactory.class;
		case CreateObjectAction_OutputPinOrderingEditPart.VISUAL_ID:
			return CreateObjectAction_OutputPinOrderingViewFactory.class;
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionViewFactory.class;
		case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionNameViewFactory.class;
		case AddStructuralFeatureValueActionStereotypeEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionStereotypeViewFactory.class;
		case AddStructuralFeatureValueAction_insertAt_InputPinEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_insertAt_InputPinViewFactory.class;
		case AddStructuralFeatureValueAction_insertAt_InputPinNameEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_insertAt_InputPinNameViewFactory.class;
		case AddStructuralFeatureValueAction_insertAt_InputPinOrderingEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_insertAt_InputPinOrderingViewFactory.class;
		case AddStructuralFeatureValueAction_value_InputPinEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_value_InputPinViewFactory.class;
		case AddStructuralFeatureValueAction_value_InputPinNameEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_value_InputPinNameViewFactory.class;
		case AddStructuralFeatureValueAction_value_InputPinOrderingEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_value_InputPinOrderingViewFactory.class;
		case AddStructuralFeatureValueAction_object_InputPinEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_object_InputPinViewFactory.class;
		case AddStructuralFeatureValueAction_object_InputPinNameEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_object_InputPinNameViewFactory.class;
		case AddStructuralFeatureValueAction_object_InputPinOrderingEditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction_object_InputPinOrderingViewFactory.class;
		case CallBehaviorActionEditPart.VISUAL_ID:
			return CallBehaviorActionViewFactory.class;
		case CallBehaviorActionNameEditPart.VISUAL_ID:
			return CallBehaviorActionNameViewFactory.class;
		case CallBehaviorActionStereotypeEditPart.VISUAL_ID:
			return CallBehaviorActionStereotypeViewFactory.class;
		case CallAction_OutputPinEditPart.VISUAL_ID:
			return CallAction_OutputPinViewFactory.class;
		case CallAction_OutputPinNameEditPart.VISUAL_ID:
			return CallAction_OutputPinNameViewFactory.class;
		case CallAction_OutputPinOrderingEditPart.VISUAL_ID:
			return CallAction_OutputPinOrderingViewFactory.class;
		case CallAction_InputPinEditPart.VISUAL_ID:
			return CallAction_InputPinViewFactory.class;
		case CallAction_InputPinNameEditPart.VISUAL_ID:
			return CallAction_InputPinNameViewFactory.class;
		case CallAction_InputPinOrderingEditPart.VISUAL_ID:
			return CallAction_InputPinOrderingViewFactory.class;
		case CallOperationActionEditPart.VISUAL_ID:
			return CallOperationActionViewFactory.class;
		case CallOperationActionNameEditPart.VISUAL_ID:
			return CallOperationActionNameViewFactory.class;
		case CallOperationActionStereotypeEditPart.VISUAL_ID:
			return CallOperationActionStereotypeViewFactory.class;
		case CallOperationAction_InputPinEditPart.VISUAL_ID:
			return CallOperationAction_InputPinViewFactory.class;
		case CallOperationAction_InputPinNameEditPart.VISUAL_ID:
			return CallOperationAction_InputPinNameViewFactory.class;
		case CallOperationAction_InputPinOrderingEditPart.VISUAL_ID:
			return CallOperationAction_InputPinOrderingViewFactory.class;
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return StructuredActivityNodeViewFactory.class;
		case StructuredActivityNodeNameEditPart.VISUAL_ID:
			return StructuredActivityNodeNameViewFactory.class;
		case StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNodeStereotypeViewFactory.class;
		case StructuredActivityNode2EditPart.VISUAL_ID:
			return StructuredActivityNode2ViewFactory.class;
		case StructuredActivityNodeName2EditPart.VISUAL_ID:
			return StructuredActivityNodeName2ViewFactory.class;
		case StructuredActivityNodeStereotype2EditPart.VISUAL_ID:
			return StructuredActivityNodeStereotype2ViewFactory.class;
		case OpaqueAction2EditPart.VISUAL_ID:
			return OpaqueAction2ViewFactory.class;
		case OpaqueActionName2EditPart.VISUAL_ID:
			return OpaqueActionName2ViewFactory.class;
		case OpaqueActionStereotype2EditPart.VISUAL_ID:
			return OpaqueActionStereotype2ViewFactory.class;
		case AcceptEventAction3EditPart.VISUAL_ID:
			return AcceptEventAction3ViewFactory.class;
		case AcceptEventActionName2EditPart.VISUAL_ID:
			return AcceptEventActionName2ViewFactory.class;
		case AcceptEventActionStereotype2EditPart.VISUAL_ID:
			return AcceptEventActionStereotype2ViewFactory.class;
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
		case StructuredActivityNode_PinEditPart.VISUAL_ID:
			return StructuredActivityNode_PinViewFactory.class;
		case StructuredActivityNode_PinNameEditPart.VISUAL_ID:
			return StructuredActivityNode_PinNameViewFactory.class;
		case StructuredActivityNode_PinInStateEditPart.VISUAL_ID:
			return PinInState2ViewFactory.class;
		case StructuredActivityNode_PinOrderingEditPart.VISUAL_ID:
			return StructuredActivityNode_PinOrderingViewFactory.class;
		case StructuredActivityNode_PinStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_PinStereotypeViewFactory.class;
		case CreateObjectAction2EditPart.VISUAL_ID:
			return CreateObjectAction2ViewFactory.class;
		case CreateObjectActionName2EditPart.VISUAL_ID:
			return CreateObjectActionName2ViewFactory.class;
		case CreateObjectActionStereotype2EditPart.VISUAL_ID:
			return CreateObjectActionStereotype2ViewFactory.class;
		case CallBehaviorAction2EditPart.VISUAL_ID:
			return CallBehaviorAction2ViewFactory.class;
		case CallBehaviorActionName2EditPart.VISUAL_ID:
			return CallBehaviorActionName2ViewFactory.class;
		case CallBehaviorActionStereotype2EditPart.VISUAL_ID:
			return CallBehaviorActionStereotype2ViewFactory.class;
		case CallOperationAction2EditPart.VISUAL_ID:
			return CallOperationAction2ViewFactory.class;
		case CallOperationActionName2EditPart.VISUAL_ID:
			return CallOperationActionName2ViewFactory.class;
		case CallOperationActionStereotype2EditPart.VISUAL_ID:
			return CallOperationActionStereotype2ViewFactory.class;
		case ForkNode2EditPart.VISUAL_ID:
			return ForkNode2ViewFactory.class;
		case JoinNode2EditPart.VISUAL_ID:
			return JoinNode2ViewFactory.class;
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction2ViewFactory.class;
		case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionName2ViewFactory.class;
		case AddStructuralFeatureValueActionStereotype2EditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionStereotype2ViewFactory.class;
		case DataStoreNode2EditPart.VISUAL_ID:
			return DataStoreNode2ViewFactory.class;
		case DataStoreNodeName2EditPart.VISUAL_ID:
			return DataStoreNodeName2ViewFactory.class;
		case DataStoreNodeInState2EditPart.VISUAL_ID:
			return DataStoreNodeInState2ViewFactory.class;
		case DataStoreNodeOrdering2EditPart.VISUAL_ID:
			return DataStoreNodeOrdering2ViewFactory.class;
		case DataStoreNodeStereotype2EditPart.VISUAL_ID:
			return DataStoreNodeStereotype2ViewFactory.class;
		case CentralBufferNode2EditPart.VISUAL_ID:
			return CentralBufferNode2ViewFactory.class;
		case CentralBufferNodeName2EditPart.VISUAL_ID:
			return CentralBufferNodeName2ViewFactory.class;
		case CentralBufferNodeInState2EditPart.VISUAL_ID:
			return CentralBufferNodeInState2ViewFactory.class;
		case CentralBufferNodeOrdering2EditPart.VISUAL_ID:
			return CentralBufferNodeOrdering2ViewFactory.class;
		case CentralBufferNodeStereotype2EditPart.VISUAL_ID:
			return CentralBufferNodeStereotype2ViewFactory.class;
		case StructuredActivityNode_InputPinEditPart.VISUAL_ID:
			return StructuredActivityNode_InputPinViewFactory.class;
		case StructuredActivityNode_InputPinNameEditPart.VISUAL_ID:
			return StructuredActivityNode_InputPinNameViewFactory.class;
		case StructuredActivityNode_InputPinOrderingEditPart.VISUAL_ID:
			return StructuredActivityNode_InputPinOrderingViewFactory.class;
		case StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
			return StructuredActivityNode_OutputPinViewFactory.class;
		case StructuredActivityNode_OutputPinNameEditPart.VISUAL_ID:
			return StructuredActivityNode_OutputPinNameViewFactory.class;
		case StructuredActivityNode_OutputPinOrderingEditPart.VISUAL_ID:
			return StructuredActivityNode_OutputPinOrderingViewFactory.class;
		case OpaqueBehaviorEditPart.VISUAL_ID:
			return OpaqueBehaviorViewFactory.class;
		case OpaqueBehaviorNameEditPart.VISUAL_ID:
			return OpaqueBehaviorNameViewFactory.class;
		case ActivityParameterNodeEditPart.VISUAL_ID:
			return ActivityParameterNodeViewFactory.class;
		case ActivityParameterNodeNameEditPart.VISUAL_ID:
			return ActivityParameterNodeNameViewFactory.class;
		case ActivityParameterNodeStereotypeEditPart.VISUAL_ID:
			return ActivityParameterNodeStereotypeViewFactory.class;
		case SendSignalActionEditPart.VISUAL_ID:
			return SendSignalActionViewFactory.class;
		case SendSignalActionNameEditPart.VISUAL_ID:
			return SendSignalActionNameViewFactory.class;
		case SendSignalActionStereotypeEditPart.VISUAL_ID:
			return SendSignalActionStereotypeViewFactory.class;
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
		case AcceptEventActionStereotype5EditPart.VISUAL_ID:
			return AcceptEventActionStereotype5ViewFactory.class;
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
		case DataStoreNodeName3EditPart.VISUAL_ID:
			return DataStoreNodeName3ViewFactory.class;
		case DataStoreNodeInState3EditPart.VISUAL_ID:
			return DataStoreNodeInState3ViewFactory.class;
		case DataStoreNodeOrdering3EditPart.VISUAL_ID:
			return DataStoreNodeOrdering3ViewFactory.class;
		case DataStoreNodeStereotype3EditPart.VISUAL_ID:
			return DataStoreNodeStereotype3ViewFactory.class;
		case CentralBufferNode3EditPart.VISUAL_ID:
			return CentralBufferNode3ViewFactory.class;
		case CentralBufferNodeName3EditPart.VISUAL_ID:
			return CentralBufferNodeName3ViewFactory.class;
		case CentralBufferNodeInState3EditPart.VISUAL_ID:
			return CentralBufferNodeInState3ViewFactory.class;
		case CentralBufferNodeOrdering3EditPart.VISUAL_ID:
			return CentralBufferNodeOrdering3ViewFactory.class;
		case CentralBufferNodeStereotype3EditPart.VISUAL_ID:
			return CentralBufferNodeStereotype3ViewFactory.class;
		case OpaqueAction3EditPart.VISUAL_ID:
			return OpaqueAction3ViewFactory.class;
		case OpaqueActionName3EditPart.VISUAL_ID:
			return OpaqueActionName3ViewFactory.class;
		case OpaqueActionStereotype3EditPart.VISUAL_ID:
			return OpaqueActionStereotype3ViewFactory.class;
		case FlowFinalNode3EditPart.VISUAL_ID:
			return FlowFinalNode3ViewFactory.class;
		case ForkNode3EditPart.VISUAL_ID:
			return ForkNode3ViewFactory.class;
		case JoinNode3EditPart.VISUAL_ID:
			return JoinNode3ViewFactory.class;
		case ActivityPartition_PinEditPart.VISUAL_ID:
			return ActivityPartition_PinViewFactory.class;
		case ActivityPartition_PinNameEditPart.VISUAL_ID:
			return ActivityPartition_PinNameViewFactory.class;
		case ActivityPartition_PinInStateEditPart.VISUAL_ID:
			return ActivityPartition_PinInStateViewFactory.class;
		case ActivityPartition_PinOrderingEditPart.VISUAL_ID:
			return ActivityPartition_PinOrderingViewFactory.class;
		case ActivityPartition_PinStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_PinStereotypeViewFactory.class;
		case CreateObjectAction3EditPart.VISUAL_ID:
			return CreateObjectAction3ViewFactory.class;
		case CreateObjectActionName3EditPart.VISUAL_ID:
			return CreateObjectActionName3ViewFactory.class;
		case CreateObjectActionStereotype3EditPart.VISUAL_ID:
			return CreateObjectActionStereotype3ViewFactory.class;
		case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
			return AddStructuralFeatureValueAction3ViewFactory.class;
		case AddStructuralFeatureValueActionName3EditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionName3ViewFactory.class;
		case AddStructuralFeatureValueActionStereotype3EditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionStereotype3ViewFactory.class;
		case CallBehaviorAction3EditPart.VISUAL_ID:
			return CallBehaviorAction3ViewFactory.class;
		case CallBehaviorActionName3EditPart.VISUAL_ID:
			return CallBehaviorActionName3ViewFactory.class;
		case CallBehaviorActionStereotype3EditPart.VISUAL_ID:
			return CallBehaviorActionStereotype3ViewFactory.class;
		case CallOperationAction3EditPart.VISUAL_ID:
			return CallOperationAction3ViewFactory.class;
		case CallOperationActionName3EditPart.VISUAL_ID:
			return CallOperationActionName3ViewFactory.class;
		case CallOperationActionStereotype3EditPart.VISUAL_ID:
			return CallOperationActionStereotype3ViewFactory.class;
		case StructuredActivityNode3EditPart.VISUAL_ID:
			return StructuredActivityNode3ViewFactory.class;
		case StructuredActivityNodeStereotype3EditPart.VISUAL_ID:
			return StructuredActivityNodeStereotype3ViewFactory.class;
		case StructuredActivityNode4EditPart.VISUAL_ID:
			return StructuredActivityNode4ViewFactory.class;
		case StructuredActivityNodeStereotype4EditPart.VISUAL_ID:
			return StructuredActivityNodeStereotype4ViewFactory.class;
		case StructuredActivityNode_StructuredActivityNode_InputPinEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNode_InputPinViewFactory.class;
		case StructuredActivityNode_StructuredActivityNode_InputPinNameEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNode_InputPinNameViewFactory.class;
		case StructuredActivityNode_StructuredActivityNode_InputPinOrderingEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNode_InputPinOrderingViewFactory.class;
		case StructuredActivityNode_StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNode_OutputPinViewFactory.class;
		case StructuredActivityNode_StructuredActivityNode_OutputPinNameEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNode_OutputPinNameViewFactory.class;
		case StructuredActivityNode_StructuredActivityNode_OutputPinOrderingEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNode_OutputPinOrderingViewFactory.class;
		case SendSignalAction2EditPart.VISUAL_ID:
			return SendSignalAction2ViewFactory.class;
		case SendSignalActionName2EditPart.VISUAL_ID:
			return SendSignalActionName2ViewFactory.class;
		case SendSignalActionStereotype2EditPart.VISUAL_ID:
			return SendSignalActionStereotype2ViewFactory.class;
		case LoopNode2EditPart.VISUAL_ID:
			return LoopNode2ViewFactory.class;
		case LoopNodeStereotype2EditPart.VISUAL_ID:
			return LoopNodeStereotype2ViewFactory.class;
		case ConditionalNode2EditPart.VISUAL_ID:
			return ConditionalNode2ViewFactory.class;
		case ConditionalNodeStereotypeEditPart.VISUAL_ID:
			return ConditionalNodeStereotypeViewFactory.class;
		case ExpansionRegion2EditPart.VISUAL_ID:
			return ExpansionRegion2ViewFactory.class;
		case ExpansionRegionMode2EditPart.VISUAL_ID:
			return ExpansionRegionMode2ViewFactory.class;
		case ValueSpecificationActionEditPart.VISUAL_ID:
			return ValueSpecificationActionViewFactory.class;
		case ValueSpecificationActionNameEditPart.VISUAL_ID:
			return ValueSpecificationActionNameViewFactory.class;
		case ValueSpecificationActionStereotypeEditPart.VISUAL_ID:
			return ValueSpecificationActionStereotypeViewFactory.class;
		case OutputPin6EditPart.VISUAL_ID:
			return OutputPin6ViewFactory.class;
		case OutputPinName6EditPart.VISUAL_ID:
			return OutputPinName6ViewFactory.class;
		case OutputPinOrdering6EditPart.VISUAL_ID:
			return OutputPinOrdering6ViewFactory.class;
		case LoopNodeEditPart.VISUAL_ID:
			return LoopNodeViewFactory.class;
		case LoopNodeNameEditPart.VISUAL_ID:
			return LoopNodeNameViewFactory.class;
		case LoopNodeStereotypeEditPart.VISUAL_ID:
			return LoopNodeStereotypeViewFactory.class;
		case ConditionalNodeEditPart.VISUAL_ID:
			return ConditionalNodeViewFactory.class;
		case ConditionalNodeNameEditPart.VISUAL_ID:
			return ConditionalNodeNameViewFactory.class;
		case ConditionalNodeStereotype2EditPart.VISUAL_ID:
			return ConditionalNodeStereotype2ViewFactory.class;
		case ExpansionRegionEditPart.VISUAL_ID:
			return ExpansionRegionViewFactory.class;
		case ExpansionRegionModeEditPart.VISUAL_ID:
			return ExpansionRegionModeViewFactory.class;
		case ParameterSetEditPart.VISUAL_ID:
			return ParameterSetViewFactory.class;
		case ParameterEditPart.VISUAL_ID:
			return ParameterViewFactory.class;
		case ValueSpecificationAction2EditPart.VISUAL_ID:
			return ValueSpecificationAction2ViewFactory.class;
		case ValueSpecificationActionName2EditPart.VISUAL_ID:
			return ValueSpecificationActionName2ViewFactory.class;
		case ValueSpecificationActionStereotype2EditPart.VISUAL_ID:
			return ValueSpecificationActionStereotype2ViewFactory.class;
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
