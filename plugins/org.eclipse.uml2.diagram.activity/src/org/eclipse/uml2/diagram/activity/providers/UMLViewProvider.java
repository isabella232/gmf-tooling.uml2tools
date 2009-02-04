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
				case StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_OpaqueActionEditPart.VISUAL_ID:
				case StructuredActivityNode_AcceptEventActionEditPart.VISUAL_ID:
				case StructuredActivityNode_AcceptTimeEventActionEditPart.VISUAL_ID:
				case StructuredActivityNode_ActivityFinalNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_DecisionNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_FlowFinalNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_PinEditPart.VISUAL_ID:
				case StructuredActivityNode_CreateObjectActionEditPart.VISUAL_ID:
				case StructuredActivityNode_CallBehaviorActionEditPart.VISUAL_ID:
				case StructuredActivityNode_CallOperationActionEditPart.VISUAL_ID:
				case StructuredActivityNode_ForkNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_JoinNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				case StructuredActivityNode_DataStoreNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_CentralBufferNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_InputPinEditPart.VISUAL_ID:
				case StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
				case OpaqueBehaviorEditPart.VISUAL_ID:
				case ActivityParameterNodeEditPart.VISUAL_ID:
				case SendSignalActionEditPart.VISUAL_ID:
				case ActivityPartitionEditPart.VISUAL_ID:
				case ActivityPartition_ActivityPartitionEditPart.VISUAL_ID:
				case ActivityPartition_AcceptEventActionEditPart.VISUAL_ID:
				case ActivityPartition_AcceptTimeEventActionEditPart.VISUAL_ID:
				case ActivityPartition_ActivityFinalNodeEditPart.VISUAL_ID:
				case ActivityPartition_DecisionNodeEditPart.VISUAL_ID:
				case ActivityPartition_MergeNodeEditPart.VISUAL_ID:
				case ActivityPartition_InitialNodeEditPart.VISUAL_ID:
				case ActivityPartition_DataStoreNodeEditPart.VISUAL_ID:
				case ActivityPartition_CentralBufferNodeEditPart.VISUAL_ID:
				case ActivityPartition_OpaqueActionEditPart.VISUAL_ID:
				case ActivityPartition_FlowFinalNodeEditPart.VISUAL_ID:
				case ActivityPartition_ForkNodeEditPart.VISUAL_ID:
				case ActivityPartition_JoinNodeEditPart.VISUAL_ID:
				case ActivityPartition_PinEditPart.VISUAL_ID:
				case ActivityPartition_CreateObjectActionEditPart.VISUAL_ID:
				case ActivityPartition_AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				case ActivityPartition_CallBehaviorActionEditPart.VISUAL_ID:
				case ActivityPartition_CallOperationActionEditPart.VISUAL_ID:
				case ActivityPartition_StructuredActivityNodeEditPart.VISUAL_ID:
				case ActivityPartition_StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID:
				case StructuredActivityNode_StructuredActivityNode_InputPinEditPart.VISUAL_ID:
				case StructuredActivityNode_StructuredActivityNode_OutputPinEditPart.VISUAL_ID:
				case ActivityPartition_SendSignalActionEditPart.VISUAL_ID:
				case ActivityPartition_LoopNodeEditPart.VISUAL_ID:
				case ActivityPartition_ConditionalNodeEditPart.VISUAL_ID:
				case ActivityPartition_ExpansionRegionEditPart.VISUAL_ID:
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
				case StructuredActivityNode_StructuredActivityNodeNameEditPart.VISUAL_ID:
				case StructuredActivityNode_StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
				case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
					if (StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_OpaqueActionNameEditPart.VISUAL_ID:
				case StructuredActivityNode_OpaqueActionStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_OpaqueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_AcceptEventActionNameEditPart.VISUAL_ID:
				case StructuredActivityNode_AcceptEventActionStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_AcceptEventActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_AcceptTimeEventActionNameEditPart.VISUAL_ID:
					if (StructuredActivityNode_AcceptTimeEventActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
				case StructuredActivityNode_CreateObjectActionNameEditPart.VISUAL_ID:
				case StructuredActivityNode_CreateObjectActionStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_CreateObjectActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_CallBehaviorActionNameEditPart.VISUAL_ID:
				case StructuredActivityNode_CallBehaviorActionStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_CallBehaviorActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_CallOperationActionNameEditPart.VISUAL_ID:
				case StructuredActivityNode_CallOperationActionStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_CallOperationActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
				case StructuredActivityNode_AddStructuralFeatureValueActionStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_AddStructuralFeatureValueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_DataStoreNodeNameEditPart.VISUAL_ID:
				case StructuredActivityNode_DataStoreNodeInStateEditPart.VISUAL_ID:
				case StructuredActivityNode_DataStoreNodeOrderingEditPart.VISUAL_ID:
				case StructuredActivityNode_DataStoreNodeStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_DataStoreNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case StructuredActivityNode_CentralBufferNodeNameEditPart.VISUAL_ID:
				case StructuredActivityNode_CentralBufferNodeInStateEditPart.VISUAL_ID:
				case StructuredActivityNode_CentralBufferNodeOrderingEditPart.VISUAL_ID:
				case StructuredActivityNode_CentralBufferNodeStereotypeEditPart.VISUAL_ID:
					if (StructuredActivityNode_CentralBufferNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
				case ActivityPartition_ActivityPartitionNameEditPart.VISUAL_ID:
					if (ActivityPartition_ActivityPartitionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_AcceptEventActionNameEditPart.VISUAL_ID:
				case ActivityPartition_AcceptEventActionStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_AcceptEventActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_AcceptTimeEventActionNameEditPart.VISUAL_ID:
					if (ActivityPartition_AcceptTimeEventActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_DataStoreNodeNameEditPart.VISUAL_ID:
				case ActivityPartition_DataStoreNodeInStateEditPart.VISUAL_ID:
				case ActivityPartition_DataStoreNodeOrderingEditPart.VISUAL_ID:
				case ActivityPartition_DataStoreNodeStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_DataStoreNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_CentralBufferNodeNameEditPart.VISUAL_ID:
				case ActivityPartition_CentralBufferNodeInStateEditPart.VISUAL_ID:
				case ActivityPartition_CentralBufferNodeOrderingEditPart.VISUAL_ID:
				case ActivityPartition_CentralBufferNodeStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_CentralBufferNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_OpaqueActionNameEditPart.VISUAL_ID:
				case ActivityPartition_OpaqueActionStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_OpaqueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
				case ActivityPartition_CreateObjectActionNameEditPart.VISUAL_ID:
				case ActivityPartition_CreateObjectActionStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_CreateObjectActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
				case ActivityPartition_AddStructuralFeatureValueActionStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_AddStructuralFeatureValueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_CallBehaviorActionNameEditPart.VISUAL_ID:
				case ActivityPartition_CallBehaviorActionStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_CallBehaviorActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_CallOperationActionNameEditPart.VISUAL_ID:
				case ActivityPartition_CallOperationActionStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_CallOperationActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
				case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
					if (ActivityPartition_StructuredActivityNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_StructuredActivityNode_StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
				case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
					if (ActivityPartition_StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView)
							|| containerView.getElement() != domainElement) {
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
				case ActivityPartition_SendSignalActionNameEditPart.VISUAL_ID:
				case ActivityPartition_SendSignalActionStereotypeEditPart.VISUAL_ID:
					if (ActivityPartition_SendSignalActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_LoopNodeStereotypeEditPart.VISUAL_ID:
				case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
					if (ActivityPartition_LoopNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_ConditionalNodeStereotypeEditPart.VISUAL_ID:
				case ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID:
					if (ActivityPartition_ConditionalNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null; // wrong container
					}
					break;
				case ActivityPartition_ExpansionRegionModeEditPart.VISUAL_ID:
				case ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID:
					if (ActivityPartition_ExpansionRegionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
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
		case StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNodeViewFactory.class;
		case StructuredActivityNode_StructuredActivityNodeNameEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNodeNameViewFactory.class;
		case StructuredActivityNode_StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_StructuredActivityNodeStereotypeViewFactory.class;
		case StructuredActivityNode_OpaqueActionEditPart.VISUAL_ID:
			return StructuredActivityNode_OpaqueActionViewFactory.class;
		case StructuredActivityNode_OpaqueActionNameEditPart.VISUAL_ID:
			return StructuredActivityNode_OpaqueActionNameViewFactory.class;
		case StructuredActivityNode_OpaqueActionStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_OpaqueActionStereotypeViewFactory.class;
		case StructuredActivityNode_AcceptEventActionEditPart.VISUAL_ID:
			return StructuredActivityNode_AcceptEventActionViewFactory.class;
		case StructuredActivityNode_AcceptEventActionNameEditPart.VISUAL_ID:
			return StructuredActivityNode_AcceptEventActionNameViewFactory.class;
		case StructuredActivityNode_AcceptEventActionStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_AcceptEventActionStereotypeViewFactory.class;
		case StructuredActivityNode_AcceptTimeEventActionEditPart.VISUAL_ID:
			return StructuredActivityNode_AcceptTimeEventActionViewFactory.class;
		case StructuredActivityNode_AcceptTimeEventActionNameEditPart.VISUAL_ID:
			return StructuredActivityNode_AcceptTimeEventActionNameViewFactory.class;
		case StructuredActivityNode_ActivityFinalNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_ActivityFinalNodeViewFactory.class;
		case StructuredActivityNode_DecisionNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_DecisionNodeViewFactory.class;
		case StructuredActivityNode_FlowFinalNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_FlowFinalNodeViewFactory.class;
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
		case StructuredActivityNode_CreateObjectActionEditPart.VISUAL_ID:
			return StructuredActivityNode_CreateObjectActionViewFactory.class;
		case StructuredActivityNode_CreateObjectActionNameEditPart.VISUAL_ID:
			return StructuredActivityNode_CreateObjectActionNameViewFactory.class;
		case StructuredActivityNode_CreateObjectActionStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_CreateObjectActionStereotypeViewFactory.class;
		case StructuredActivityNode_CallBehaviorActionEditPart.VISUAL_ID:
			return StructuredActivityNode_CallBehaviorActionViewFactory.class;
		case StructuredActivityNode_CallBehaviorActionNameEditPart.VISUAL_ID:
			return StructuredActivityNode_CallBehaviorActionNameViewFactory.class;
		case StructuredActivityNode_CallBehaviorActionStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_CallBehaviorActionStereotypeViewFactory.class;
		case StructuredActivityNode_CallOperationActionEditPart.VISUAL_ID:
			return StructuredActivityNode_CallOperationActionViewFactory.class;
		case StructuredActivityNode_CallOperationActionNameEditPart.VISUAL_ID:
			return StructuredActivityNode_CallOperationActionNameViewFactory.class;
		case StructuredActivityNode_CallOperationActionStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_CallOperationActionStereotypeViewFactory.class;
		case StructuredActivityNode_ForkNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_ForkNodeViewFactory.class;
		case StructuredActivityNode_JoinNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_JoinNodeViewFactory.class;
		case StructuredActivityNode_AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return StructuredActivityNode_AddStructuralFeatureValueActionViewFactory.class;
		case StructuredActivityNode_AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return StructuredActivityNode_AddStructuralFeatureValueActionNameViewFactory.class;
		case StructuredActivityNode_AddStructuralFeatureValueActionStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_AddStructuralFeatureValueActionStereotypeViewFactory.class;
		case StructuredActivityNode_DataStoreNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_DataStoreNodeViewFactory.class;
		case StructuredActivityNode_DataStoreNodeNameEditPart.VISUAL_ID:
			return StructuredActivityNode_DataStoreNodeNameViewFactory.class;
		case StructuredActivityNode_DataStoreNodeInStateEditPart.VISUAL_ID:
			return StructuredActivityNode_DataStoreNodeInStateViewFactory.class;
		case StructuredActivityNode_DataStoreNodeOrderingEditPart.VISUAL_ID:
			return StructuredActivityNode_DataStoreNodeOrderingViewFactory.class;
		case StructuredActivityNode_DataStoreNodeStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_DataStoreNodeStereotypeViewFactory.class;
		case StructuredActivityNode_CentralBufferNodeEditPart.VISUAL_ID:
			return StructuredActivityNode_CentralBufferNodeViewFactory.class;
		case StructuredActivityNode_CentralBufferNodeNameEditPart.VISUAL_ID:
			return StructuredActivityNode_CentralBufferNodeNameViewFactory.class;
		case StructuredActivityNode_CentralBufferNodeInStateEditPart.VISUAL_ID:
			return StructuredActivityNode_CentralBufferNodeInStateViewFactory.class;
		case StructuredActivityNode_CentralBufferNodeOrderingEditPart.VISUAL_ID:
			return StructuredActivityNode_CentralBufferNodeOrderingViewFactory.class;
		case StructuredActivityNode_CentralBufferNodeStereotypeEditPart.VISUAL_ID:
			return StructuredActivityNode_CentralBufferNodeStereotypeViewFactory.class;
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
		case ActivityPartition_ActivityPartitionEditPart.VISUAL_ID:
			return ActivityPartition_ActivityPartitionViewFactory.class;
		case ActivityPartition_ActivityPartitionNameEditPart.VISUAL_ID:
			return ActivityPartition_ActivityPartitionNameViewFactory.class;
		case ActivityPartition_AcceptEventActionEditPart.VISUAL_ID:
			return ActivityPartition_AcceptEventActionViewFactory.class;
		case ActivityPartition_AcceptEventActionNameEditPart.VISUAL_ID:
			return ActivityPartition_AcceptEventActionNameViewFactory.class;
		case ActivityPartition_AcceptEventActionStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_AcceptEventActionStereotypeViewFactory.class;
		case ActivityPartition_AcceptTimeEventActionEditPart.VISUAL_ID:
			return ActivityPartition_AcceptTimeEventActionViewFactory.class;
		case ActivityPartition_AcceptTimeEventActionNameEditPart.VISUAL_ID:
			return ActivityPartition_AcceptTimeEventActionNameViewFactory.class;
		case ActivityPartition_ActivityFinalNodeEditPart.VISUAL_ID:
			return ActivityPartition_ActivityFinalNodeViewFactory.class;
		case ActivityPartition_DecisionNodeEditPart.VISUAL_ID:
			return ActivityPartition_DecisionNodeViewFactory.class;
		case ActivityPartition_MergeNodeEditPart.VISUAL_ID:
			return ActivityPartition_MergeNodeViewFactory.class;
		case ActivityPartition_InitialNodeEditPart.VISUAL_ID:
			return ActivityPartition_InitialNodeViewFactory.class;
		case ActivityPartition_DataStoreNodeEditPart.VISUAL_ID:
			return ActivityPartition_DataStoreNodeViewFactory.class;
		case ActivityPartition_DataStoreNodeNameEditPart.VISUAL_ID:
			return ActivityPartition_DataStoreNodeNameViewFactory.class;
		case ActivityPartition_DataStoreNodeInStateEditPart.VISUAL_ID:
			return ActivityPartition_DataStoreNodeInStateViewFactory.class;
		case ActivityPartition_DataStoreNodeOrderingEditPart.VISUAL_ID:
			return ActivityPartition_DataStoreNodeOrderingViewFactory.class;
		case ActivityPartition_DataStoreNodeStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_DataStoreNodeStereotypeViewFactory.class;
		case ActivityPartition_CentralBufferNodeEditPart.VISUAL_ID:
			return ActivityPartition_CentralBufferNodeViewFactory.class;
		case ActivityPartition_CentralBufferNodeNameEditPart.VISUAL_ID:
			return ActivityPartition_CentralBufferNodeNameViewFactory.class;
		case ActivityPartition_CentralBufferNodeInStateEditPart.VISUAL_ID:
			return ActivityPartition_CentralBufferNodeInStateViewFactory.class;
		case ActivityPartition_CentralBufferNodeOrderingEditPart.VISUAL_ID:
			return ActivityPartition_CentralBufferNodeOrderingViewFactory.class;
		case ActivityPartition_CentralBufferNodeStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_CentralBufferNodeStereotypeViewFactory.class;
		case ActivityPartition_OpaqueActionEditPart.VISUAL_ID:
			return ActivityPartition_OpaqueActionViewFactory.class;
		case ActivityPartition_OpaqueActionNameEditPart.VISUAL_ID:
			return ActivityPartition_OpaqueActionNameViewFactory.class;
		case ActivityPartition_OpaqueActionStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_OpaqueActionStereotypeViewFactory.class;
		case ActivityPartition_FlowFinalNodeEditPart.VISUAL_ID:
			return ActivityPartition_FlowFinalNodeViewFactory.class;
		case ActivityPartition_ForkNodeEditPart.VISUAL_ID:
			return ActivityPartition_ForkNodeViewFactory.class;
		case ActivityPartition_JoinNodeEditPart.VISUAL_ID:
			return ActivityPartition_JoinNodeViewFactory.class;
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
		case ActivityPartition_CreateObjectActionEditPart.VISUAL_ID:
			return ActivityPartition_CreateObjectActionViewFactory.class;
		case ActivityPartition_CreateObjectActionNameEditPart.VISUAL_ID:
			return ActivityPartition_CreateObjectActionNameViewFactory.class;
		case ActivityPartition_CreateObjectActionStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_CreateObjectActionStereotypeViewFactory.class;
		case ActivityPartition_AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return ActivityPartition_AddStructuralFeatureValueActionViewFactory.class;
		case ActivityPartition_AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return ActivityPartition_AddStructuralFeatureValueActionNameViewFactory.class;
		case ActivityPartition_AddStructuralFeatureValueActionStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_AddStructuralFeatureValueActionStereotypeViewFactory.class;
		case ActivityPartition_CallBehaviorActionEditPart.VISUAL_ID:
			return ActivityPartition_CallBehaviorActionViewFactory.class;
		case ActivityPartition_CallBehaviorActionNameEditPart.VISUAL_ID:
			return ActivityPartition_CallBehaviorActionNameViewFactory.class;
		case ActivityPartition_CallBehaviorActionStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_CallBehaviorActionStereotypeViewFactory.class;
		case ActivityPartition_CallOperationActionEditPart.VISUAL_ID:
			return ActivityPartition_CallOperationActionViewFactory.class;
		case ActivityPartition_CallOperationActionNameEditPart.VISUAL_ID:
			return ActivityPartition_CallOperationActionNameViewFactory.class;
		case ActivityPartition_CallOperationActionStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_CallOperationActionStereotypeViewFactory.class;
		case ActivityPartition_StructuredActivityNodeEditPart.VISUAL_ID:
			return ActivityPartition_StructuredActivityNodeViewFactory.class;
		case ActivityPartition_StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_StructuredActivityNodeStereotypeViewFactory.class;
		case ActivityPartition_StructuredActivityNode_StructuredActivityNodeEditPart.VISUAL_ID:
			return ActivityPartition_StructuredActivityNode_StructuredActivityNodeViewFactory.class;
		case ActivityPartition_StructuredActivityNode_StructuredActivityNodeStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_StructuredActivityNode_StructuredActivityNodeStereotypeViewFactory.class;
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
		case ActivityPartition_SendSignalActionEditPart.VISUAL_ID:
			return ActivityPartition_SendSignalActionViewFactory.class;
		case ActivityPartition_SendSignalActionNameEditPart.VISUAL_ID:
			return ActivityPartition_SendSignalActionNameViewFactory.class;
		case ActivityPartition_SendSignalActionStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_SendSignalActionStereotypeViewFactory.class;
		case ActivityPartition_LoopNodeEditPart.VISUAL_ID:
			return ActivityPartition_LoopNodeViewFactory.class;
		case ActivityPartition_LoopNodeStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_LoopNodeStereotypeViewFactory.class;
		case ActivityPartition_ConditionalNodeEditPart.VISUAL_ID:
			return ActivityPartition_ConditionalNodeViewFactory.class;
		case ActivityPartition_ConditionalNodeStereotypeEditPart.VISUAL_ID:
			return ActivityPartition_ConditionalNodeStereotypeViewFactory.class;
		case ActivityPartition_ExpansionRegionEditPart.VISUAL_ID:
			return ActivityPartition_ExpansionRegionViewFactory.class;
		case ActivityPartition_ExpansionRegionModeEditPart.VISUAL_ID:
			return ActivityPartition_ExpansionRegionModeViewFactory.class;
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
