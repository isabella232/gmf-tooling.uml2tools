package org.eclipse.uml2.diagram.activity.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.diagram.core.providers.AbstractViewProvider;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventAction2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AcceptEventActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivityFinalNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ActivityViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AddStructuralFeatureValueActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.AddStructuralFeatureValueActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallBehaviorActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallBehaviorActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallOperationActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CallOperationActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CentralBufferNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ControlFlowViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CreateObjectActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.CreateObjectActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DataStoreNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.DecisionNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.FlowFinalNodeViewFactory;
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
import org.eclipse.uml2.diagram.activity.view.factories.JoinNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.MergeNodeViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.ObjectFlowViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OpaqueActionNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OpaqueActionViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPin2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPin3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPinName2ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPinName3ViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPinNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.OutputPinViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.PinNameViewFactory;
import org.eclipse.uml2.diagram.activity.view.factories.PinViewFactory;
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
		if (ActivityEditPart.MODEL_ID.equals(diagramKind) && UMLVisualIDRegistry.getDiagramVisualID(semanticElement) != -1) {
			return ActivityViewFactory.class;
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
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int nodeVID = UMLVisualIDRegistry.getNodeVisualID(containerView, semanticElement, semanticType, semanticHint);
		switch (nodeVID) {
		case AcceptEventActionEditPart.VISUAL_ID:
			return AcceptEventActionViewFactory.class;
		case AcceptEventAction2EditPart.VISUAL_ID:
			return AcceptEventAction2ViewFactory.class;
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return ActivityFinalNodeViewFactory.class;
		case DecisionNodeEditPart.VISUAL_ID:
			return DecisionNodeViewFactory.class;
		case MergeNodeEditPart.VISUAL_ID:
			return MergeNodeViewFactory.class;
		case InitialNodeEditPart.VISUAL_ID:
			return InitialNodeViewFactory.class;
		case StructuredActivityNodeEditPart.VISUAL_ID:
			return StructuredActivityNodeViewFactory.class;
		case DataStoreNodeEditPart.VISUAL_ID:
			return DataStoreNodeViewFactory.class;
		case CentralBufferNodeEditPart.VISUAL_ID:
			return CentralBufferNodeViewFactory.class;
		case OpaqueActionEditPart.VISUAL_ID:
			return OpaqueActionViewFactory.class;
		case OpaqueActionNameEditPart.VISUAL_ID:
			return OpaqueActionNameViewFactory.class;
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
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionViewFactory.class;
		case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
			return AddStructuralFeatureValueActionNameViewFactory.class;
		case CallBehaviorActionEditPart.VISUAL_ID:
			return CallBehaviorActionViewFactory.class;
		case CallBehaviorActionNameEditPart.VISUAL_ID:
			return CallBehaviorActionNameViewFactory.class;
		case CallOperationActionEditPart.VISUAL_ID:
			return CallOperationActionViewFactory.class;
		case CallOperationActionNameEditPart.VISUAL_ID:
			return CallOperationActionNameViewFactory.class;
		case OutputPinEditPart.VISUAL_ID:
			return OutputPinViewFactory.class;
		case OutputPinNameEditPart.VISUAL_ID:
			return OutputPinNameViewFactory.class;
		case OutputPin2EditPart.VISUAL_ID:
			return OutputPin2ViewFactory.class;
		case OutputPinName2EditPart.VISUAL_ID:
			return OutputPinName2ViewFactory.class;
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
		case OutputPin3EditPart.VISUAL_ID:
			return OutputPin3ViewFactory.class;
		case OutputPinName3EditPart.VISUAL_ID:
			return OutputPinName3ViewFactory.class;
		case InputPin4EditPart.VISUAL_ID:
			return InputPin4ViewFactory.class;
		case InputPinName4EditPart.VISUAL_ID:
			return InputPinName4ViewFactory.class;
		case InputPin5EditPart.VISUAL_ID:
			return InputPin5ViewFactory.class;
		case InputPinName5EditPart.VISUAL_ID:
			return InputPinName5ViewFactory.class;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Class getEdgeViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		IElementType elementType = getSemanticElementType(semanticAdapter);
		if (elementType != null && !UMLElementTypes.isKnownElementType(elementType)) {
			return null;
		}
		EClass semanticType = getSemanticEClass(semanticAdapter);
		if (semanticType == null) {
			return null;
		}
		EObject semanticElement = getSemanticElement(semanticAdapter);
		int linkVID = UMLVisualIDRegistry.getLinkWithClassVisualID(semanticElement, semanticType);
		switch (linkVID) {
		case ControlFlowEditPart.VISUAL_ID:
			return ControlFlowViewFactory.class;
		case ObjectFlowEditPart.VISUAL_ID:
			return ObjectFlowViewFactory.class;
		}
		return getUnrecognizedConnectorViewClass(semanticAdapter, containerView, semanticHint);
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

	/**
	 * @generated
	 */
	private Class getUnrecognizedConnectorViewClass(IAdaptable semanticAdapter, View containerView, String semanticHint) {
		// Handle unrecognized child node classes here
		return null;
	}

}
