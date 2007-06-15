package org.eclipse.uml2.diagram.activity.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.type.core.IHintedType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActionLocalPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivitySubverticesEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Constraint2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintPostconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintPreconditionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExceptionHandlerEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExceptionHandlerLink_fixed_iconEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinName5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralString2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LiteralStringEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectNodeSelectionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventAction2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventAction3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventAction4ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventActionName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventActionName3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventActionName4ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActionLocalPreconditionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivityFinalNode2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivityFinalNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivityNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivityParameterNodeNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivityParameterNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivitySubverticesViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivityViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AddStructuralFeatureValueAction2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AddStructuralFeatureValueActionName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AddStructuralFeatureValueActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AddStructuralFeatureValueActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallBehaviorAction2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallBehaviorActionName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallBehaviorActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallBehaviorActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallOperationAction2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallOperationActionName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallOperationActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallOperationActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CentralBufferNode2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CentralBufferNodeName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CentralBufferNodeName3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CentralBufferNodeName4ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CentralBufferNodeNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CentralBufferNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.Constraint2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ConstraintPostconditionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ConstraintPreconditionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ConstraintViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ControlFlowViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CreateObjectAction2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CreateObjectActionName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CreateObjectActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CreateObjectActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DataStoreNode2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DataStoreNodeName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DataStoreNodeName3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DataStoreNodeName4ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DataStoreNodeNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DataStoreNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DecisionNode2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DecisionNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ExceptionHandlerLink_fixed_iconViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ExceptionHandlerViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.FlowFinalNode2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.FlowFinalNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ForkNode2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ForkNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InitialNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPin2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPin3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPin4ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPin5ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPinName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPinName3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPinName4ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPinName5ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPinNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.InputPinViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.JoinNode2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.JoinNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.LiteralString2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.LiteralStringViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.MergeNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ObjectFlowViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ObjectNodeSelectionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OpaqueAction2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OpaqueActionName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OpaqueActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OpaqueActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OpaqueBehaviorNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OpaqueBehaviorViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPin2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPin3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPinName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPinName3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPinNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPinViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.PackageViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.Pin2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.PinName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.PinNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.PinViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.SendSignalActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.SendSignalActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.StructuredActivityNode2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.StructuredActivityNodeStructuredActivityContentPaneCompartment2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.StructuredActivityNodeStructuredActivityContentPaneCompartmentViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.StructuredActivityNodeViewFactory;

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
			if (elementType != null || domainElement == null) {
				return null;
			}
			visualID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		} else {
			visualID = UMLVisualIDRegistry.getVisualID(semanticHint);
			if (elementType != null) {
				if (!UMLElementTypes.isKnownElementType(elementType) || false == elementType instanceof IHintedType) {
					return null;
				}
				String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
				if (!semanticHint.equals(elementTypeHint)) {
					return null;
				}
				if (domainElement != null && visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
					return null;
				}
			} else {
				if (domainElement == null) {
					return null;
				}
				switch (visualID) {
				case ConstraintEditPart.VISUAL_ID: {
					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && Constraint2EditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case Constraint2EditPart.VISUAL_ID: {
					int suggestedID = UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
					if (visualID != suggestedID && ConstraintEditPart.VISUAL_ID != suggestedID && true) {
						return null;
					}
					break;
				}
				case PackageEditPart.VISUAL_ID:
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
				case OpaqueBehaviorEditPart.VISUAL_ID:
				case ActivityParameterNodeEditPart.VISUAL_ID:
				case SendSignalActionEditPart.VISUAL_ID:
				case LiteralStringEditPart.VISUAL_ID:
				case LiteralString2EditPart.VISUAL_ID:
				case ControlFlowEditPart.VISUAL_ID:
				case ObjectFlowEditPart.VISUAL_ID:
				case ActionLocalPreconditionEditPart.VISUAL_ID:
				case ObjectNodeSelectionEditPart.VISUAL_ID:
				case ExceptionHandlerEditPart.VISUAL_ID:
					if (visualID != UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement)) {
						return null;
					}
					break;
				case ActivityNameEditPart.VISUAL_ID:
				case ActivitySubverticesEditPart.VISUAL_ID:
					if (ActivityEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				case ConstraintPreconditionEditPart.VISUAL_ID:
					if (ConstraintEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				case ConstraintPostconditionEditPart.VISUAL_ID:
					if (Constraint2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case AcceptEventActionNameEditPart.VISUAL_ID:

					if (AcceptEventActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case AcceptEventActionName3EditPart.VISUAL_ID:

					if (AcceptEventAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				case DataStoreNodeNameEditPart.VISUAL_ID:
				case DataStoreNodeName2EditPart.VISUAL_ID:

					if (DataStoreNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case CentralBufferNodeNameEditPart.VISUAL_ID:
				case CentralBufferNodeName2EditPart.VISUAL_ID:

					if (CentralBufferNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case OpaqueActionNameEditPart.VISUAL_ID:

					if (OpaqueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case OutputPinNameEditPart.VISUAL_ID:

					if (OutputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				case PinNameEditPart.VISUAL_ID:

					if (PinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case CreateObjectActionNameEditPart.VISUAL_ID:

					if (CreateObjectActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case OutputPinName2EditPart.VISUAL_ID:

					if (OutputPin2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:

					if (AddStructuralFeatureValueActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case InputPinNameEditPart.VISUAL_ID:

					if (InputPinEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case InputPinName2EditPart.VISUAL_ID:

					if (InputPin2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case InputPinName3EditPart.VISUAL_ID:

					if (InputPin3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case CallBehaviorActionNameEditPart.VISUAL_ID:

					if (CallBehaviorActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case OutputPinName3EditPart.VISUAL_ID:

					if (OutputPin3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case InputPinName4EditPart.VISUAL_ID:

					if (InputPin4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case CallOperationActionNameEditPart.VISUAL_ID:

					if (CallOperationActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case InputPinName5EditPart.VISUAL_ID:

					if (InputPin5EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
					if (StructuredActivityNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
					if (StructuredActivityNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case OpaqueActionName2EditPart.VISUAL_ID:

					if (OpaqueAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case AcceptEventActionName2EditPart.VISUAL_ID:

					if (AcceptEventAction3EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case AcceptEventActionName4EditPart.VISUAL_ID:

					if (AcceptEventAction4EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				case PinName2EditPart.VISUAL_ID:

					if (Pin2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case CreateObjectActionName2EditPart.VISUAL_ID:

					if (CreateObjectAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case CallBehaviorActionName2EditPart.VISUAL_ID:

					if (CallBehaviorAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case CallOperationActionName2EditPart.VISUAL_ID:

					if (CallOperationAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:

					if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case DataStoreNodeName3EditPart.VISUAL_ID:
				case DataStoreNodeName4EditPart.VISUAL_ID:

					if (DataStoreNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case CentralBufferNodeName3EditPart.VISUAL_ID:
				case CentralBufferNodeName4EditPart.VISUAL_ID:

					if (CentralBufferNode2EditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case OpaqueBehaviorNameEditPart.VISUAL_ID:

					if (OpaqueBehaviorEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case ActivityParameterNodeNameEditPart.VISUAL_ID:

					if (ActivityParameterNodeEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;
				case SendSignalActionNameEditPart.VISUAL_ID:

					if (SendSignalActionEditPart.VISUAL_ID != UMLVisualIDRegistry.getVisualID(containerView) || containerView.getElement() != domainElement) {
						return null;
					}
					break;

				default:
					return null;
				}
			}
		}
		if (!UMLVisualIDRegistry.canCreateNode(containerView, visualID)) {
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
		case CentralBufferNodeEditPart.VISUAL_ID:
			return CentralBufferNodeViewFactory.class;
		case CentralBufferNodeNameEditPart.VISUAL_ID:
			return CentralBufferNodeNameViewFactory.class;
		case CentralBufferNodeName2EditPart.VISUAL_ID:
			return CentralBufferNodeName2ViewFactory.class;
		case OpaqueActionEditPart.VISUAL_ID:
			return OpaqueActionViewFactory.class;
		case OpaqueActionNameEditPart.VISUAL_ID:
			return OpaqueActionNameViewFactory.class;
		case OutputPinEditPart.VISUAL_ID:
			return OutputPinViewFactory.class;
		case OutputPinNameEditPart.VISUAL_ID:
			return OutputPinNameViewFactory.class;
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
		case CreateObjectActionEditPart.VISUAL_ID:
			return CreateObjectActionViewFactory.class;
		case CreateObjectActionNameEditPart.VISUAL_ID:
			return CreateObjectActionNameViewFactory.class;
		case OutputPin2EditPart.VISUAL_ID:
			return OutputPin2ViewFactory.class;
		case OutputPinName2EditPart.VISUAL_ID:
			return OutputPinName2ViewFactory.class;
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionViewFactory.class;
		case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionNameViewFactory.class;
		case InputPinEditPart.VISUAL_ID:
			return InputPinViewFactory.class;
		case InputPinNameEditPart.VISUAL_ID:
			return InputPinNameViewFactory.class;
		case InputPin2EditPart.VISUAL_ID:
			return InputPin2ViewFactory.class;
		case InputPinName2EditPart.VISUAL_ID:
			return InputPinName2ViewFactory.class;
		case InputPin3EditPart.VISUAL_ID:
			return InputPin3ViewFactory.class;
		case InputPinName3EditPart.VISUAL_ID:
			return InputPinName3ViewFactory.class;
		case CallBehaviorActionEditPart.VISUAL_ID:
			return CallBehaviorActionViewFactory.class;
		case CallBehaviorActionNameEditPart.VISUAL_ID:
			return CallBehaviorActionNameViewFactory.class;
		case OutputPin3EditPart.VISUAL_ID:
			return OutputPin3ViewFactory.class;
		case OutputPinName3EditPart.VISUAL_ID:
			return OutputPinName3ViewFactory.class;
		case InputPin4EditPart.VISUAL_ID:
			return InputPin4ViewFactory.class;
		case InputPinName4EditPart.VISUAL_ID:
			return InputPinName4ViewFactory.class;
		case CallOperationActionEditPart.VISUAL_ID:
			return CallOperationActionViewFactory.class;
		case CallOperationActionNameEditPart.VISUAL_ID:
			return CallOperationActionNameViewFactory.class;
		case InputPin5EditPart.VISUAL_ID:
			return InputPin5ViewFactory.class;
		case InputPinName5EditPart.VISUAL_ID:
			return InputPinName5ViewFactory.class;
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
		case CentralBufferNode2EditPart.VISUAL_ID:
			return CentralBufferNode2ViewFactory.class;
		case CentralBufferNodeName3EditPart.VISUAL_ID:
			return CentralBufferNodeName3ViewFactory.class;
		case CentralBufferNodeName4EditPart.VISUAL_ID:
			return CentralBufferNodeName4ViewFactory.class;
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
		case LiteralStringEditPart.VISUAL_ID:
			return LiteralStringViewFactory.class;
		case LiteralString2EditPart.VISUAL_ID:
			return LiteralString2ViewFactory.class;
		case ActivitySubverticesEditPart.VISUAL_ID:
			return ActivitySubverticesViewFactory.class;
		case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
			return StructuredActivityNodeStructuredActivityContentPaneCompartmentViewFactory.class;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
			return StructuredActivityNodeStructuredActivityContentPaneCompartment2ViewFactory.class;
		case ConstraintPreconditionEditPart.VISUAL_ID:
			return ConstraintPreconditionViewFactory.class;
		case ConstraintPostconditionEditPart.VISUAL_ID:
			return ConstraintPostconditionViewFactory.class;
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
		if (elementType == null) {
			return null;
		}
		if (!UMLElementTypes.isKnownElementType(elementType) || false == elementType instanceof IHintedType) {
			return null;
		}
		String elementTypeHint = ((IHintedType) elementType).getSemanticHint();
		if (elementTypeHint == null) {
			return null;
		}
		if (semanticHint != null && !semanticHint.equals(elementTypeHint)) {
			return null;
		}
		int visualID = UMLVisualIDRegistry.getVisualID(elementTypeHint);
		EObject domainElement = getSemanticElement(semanticAdapter);
		if (domainElement != null && visualID != UMLVisualIDRegistry.getLinkWithClassVisualID(domainElement)) {
			return null;
		}
		switch (visualID) {
		case ControlFlowEditPart.VISUAL_ID:
			return ControlFlowViewFactory.class;
		case ObjectFlowEditPart.VISUAL_ID:
			return ObjectFlowViewFactory.class;
		case ActionLocalPreconditionEditPart.VISUAL_ID:
			return ActionLocalPreconditionViewFactory.class;
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
