package org.eclipse.uml2.diagram.activity.part;

import org.eclipse.core.runtime.Platform;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart;

import org.eclipse.uml2.diagram.activity.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.activity.expressions.UMLOCLFactory;

import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Activity;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.ActivityParameterNode;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.ControlFlow;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.InputPin;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.LiteralString;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.OpaqueBehavior;
import org.eclipse.uml2.uml.OutputPin;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.StructuredActivityNode;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented 
 * by a domain model object.
 *
 * @generated
 */
public class UMLVisualIDRegistry {

	/**
	 * @generated
	 */
	private static final String DEBUG_KEY = UMLDiagramEditorPlugin.getInstance().getBundle().getSymbolicName() + "/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (PackageEditPart.MODEL_ID.equals(view.getType())) {
				return PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return getVisualID(view.getType());
	}

	/**
	 * @generated
	 */
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	 * @generated
	 */
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				UMLDiagramEditorPlugin.getInstance().logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static String getType(int visualID) {
		return String.valueOf(visualID);
	}

	/**
	 * @generated
	 */
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getDiagramVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	private static int getDiagramVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElementMetaclass) && isDiagramPackage_1000((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
		}
		return getUnrecognizedDiagramID(domainElement);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getNodeVisualID(containerView, domainElement, domainElementMetaclass, null);
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement, EClass domainElementMetaclass, String semanticHint) {
		String containerModelID = getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		int nodeVisualID = semanticHint != null ? getVisualID(semanticHint) : -1;
		switch (containerVisualID) {
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return ActivityNameEditPart.VISUAL_ID;
			}
			if (ActivitySubverticesEditPart.VISUAL_ID == nodeVisualID) {
				return ActivitySubverticesEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ActivityParameterNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getActivityParameterNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeActivityParameterNode_3052((ActivityParameterNode) domainElement))) {
				return ActivityParameterNodeEditPart.VISUAL_ID;
			}
			return getUnrecognizedActivity_2026ChildNodeID(domainElement, semanticHint);
		case ConstraintEditPart.VISUAL_ID:
			if (ConstraintPreconditionEditPart.VISUAL_ID == nodeVisualID) {
				return ConstraintPreconditionEditPart.VISUAL_ID;
			}
			return getUnrecognizedConstraint_2027ChildNodeID(domainElement, semanticHint);
		case Constraint2EditPart.VISUAL_ID:
			if (ConstraintPostconditionEditPart.VISUAL_ID == nodeVisualID) {
				return ConstraintPostconditionEditPart.VISUAL_ID;
			}
			return getUnrecognizedConstraint_2028ChildNodeID(domainElement, semanticHint);
		case AcceptEventActionEditPart.VISUAL_ID:
			return getUnrecognizedAcceptEventAction_3030ChildNodeID(domainElement, semanticHint);
		case AcceptEventAction2EditPart.VISUAL_ID:
			return getUnrecognizedAcceptEventAction_3031ChildNodeID(domainElement, semanticHint);
		case ActivityFinalNodeEditPart.VISUAL_ID:
			return getUnrecognizedActivityFinalNode_3032ChildNodeID(domainElement, semanticHint);
		case DecisionNodeEditPart.VISUAL_ID:
			return getUnrecognizedDecisionNode_3033ChildNodeID(domainElement, semanticHint);
		case MergeNodeEditPart.VISUAL_ID:
			return getUnrecognizedMergeNode_3034ChildNodeID(domainElement, semanticHint);
		case InitialNodeEditPart.VISUAL_ID:
			return getUnrecognizedInitialNode_3035ChildNodeID(domainElement, semanticHint);
		case DataStoreNodeEditPart.VISUAL_ID:
			return getUnrecognizedDataStoreNode_3036ChildNodeID(domainElement, semanticHint);
		case CentralBufferNodeEditPart.VISUAL_ID:
			return getUnrecognizedCentralBufferNode_3037ChildNodeID(domainElement, semanticHint);
		case OpaqueActionEditPart.VISUAL_ID:
			if (OpaqueActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return OpaqueActionNameEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OutputPinEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOutputPin_3001((OutputPin) domainElement))) {
				return OutputPinEditPart.VISUAL_ID;
			}
			return getUnrecognizedOpaqueAction_3029ChildNodeID(domainElement, semanticHint);
		case OutputPinEditPart.VISUAL_ID:
			if (OutputPinNameEditPart.VISUAL_ID == nodeVisualID) {
				return OutputPinNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedOutputPin_3001ChildNodeID(domainElement, semanticHint);
		case FlowFinalNodeEditPart.VISUAL_ID:
			return getUnrecognizedFlowFinalNode_3038ChildNodeID(domainElement, semanticHint);
		case ForkNodeEditPart.VISUAL_ID:
			return getUnrecognizedForkNode_3039ChildNodeID(domainElement, semanticHint);
		case JoinNodeEditPart.VISUAL_ID:
			return getUnrecognizedJoinNode_3040ChildNodeID(domainElement, semanticHint);
		case PinEditPart.VISUAL_ID:
			if (PinNameEditPart.VISUAL_ID == nodeVisualID) {
				return PinNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedPin_3041ChildNodeID(domainElement, semanticHint);
		case CreateObjectActionEditPart.VISUAL_ID:
			if (CreateObjectActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return CreateObjectActionNameEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OutputPin2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOutputPin_3002((OutputPin) domainElement))) {
				return OutputPin2EditPart.VISUAL_ID;
			}
			return getUnrecognizedCreateObjectAction_3042ChildNodeID(domainElement, semanticHint);
		case OutputPin2EditPart.VISUAL_ID:
			if (OutputPinName2EditPart.VISUAL_ID == nodeVisualID) {
				return OutputPinName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedOutputPin_3002ChildNodeID(domainElement, semanticHint);
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			if (AddStructuralFeatureValueActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return AddStructuralFeatureValueActionNameEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPinEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3003((InputPin) domainElement))) {
				return InputPinEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3004((InputPin) domainElement))) {
				return InputPin2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3005((InputPin) domainElement))) {
				return InputPin3EditPart.VISUAL_ID;
			}
			return getUnrecognizedAddStructuralFeatureValueAction_3043ChildNodeID(domainElement, semanticHint);
		case InputPinEditPart.VISUAL_ID:
			if (InputPinNameEditPart.VISUAL_ID == nodeVisualID) {
				return InputPinNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedInputPin_3003ChildNodeID(domainElement, semanticHint);
		case InputPin2EditPart.VISUAL_ID:
			if (InputPinName2EditPart.VISUAL_ID == nodeVisualID) {
				return InputPinName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedInputPin_3004ChildNodeID(domainElement, semanticHint);
		case InputPin3EditPart.VISUAL_ID:
			if (InputPinName3EditPart.VISUAL_ID == nodeVisualID) {
				return InputPinName3EditPart.VISUAL_ID;
			}
			return getUnrecognizedInputPin_3005ChildNodeID(domainElement, semanticHint);
		case CallBehaviorActionEditPart.VISUAL_ID:
			if (CallBehaviorActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return CallBehaviorActionNameEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OutputPin3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOutputPin_3006((OutputPin) domainElement))) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3007((InputPin) domainElement))) {
				return InputPin4EditPart.VISUAL_ID;
			}
			return getUnrecognizedCallBehaviorAction_3044ChildNodeID(domainElement, semanticHint);
		case OutputPin3EditPart.VISUAL_ID:
			if (OutputPinName3EditPart.VISUAL_ID == nodeVisualID) {
				return OutputPinName3EditPart.VISUAL_ID;
			}
			return getUnrecognizedOutputPin_3006ChildNodeID(domainElement, semanticHint);
		case InputPin4EditPart.VISUAL_ID:
			if (InputPinName4EditPart.VISUAL_ID == nodeVisualID) {
				return InputPinName4EditPart.VISUAL_ID;
			}
			return getUnrecognizedInputPin_3007ChildNodeID(domainElement, semanticHint);
		case CallOperationActionEditPart.VISUAL_ID:
			if (CallOperationActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return CallOperationActionNameEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OutputPin3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOutputPin_3006((OutputPin) domainElement))) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3007((InputPin) domainElement))) {
				return InputPin4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3008((InputPin) domainElement))) {
				return InputPin5EditPart.VISUAL_ID;
			}
			return getUnrecognizedCallOperationAction_3045ChildNodeID(domainElement, semanticHint);
		case InputPin5EditPart.VISUAL_ID:
			if (InputPinName5EditPart.VISUAL_ID == nodeVisualID) {
				return InputPinName5EditPart.VISUAL_ID;
			}
			return getUnrecognizedInputPin_3008ChildNodeID(domainElement, semanticHint);
		case StructuredActivityNodeEditPart.VISUAL_ID:
			if (StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID;
			}
			return getUnrecognizedStructuredActivityNode_3046ChildNodeID(domainElement, semanticHint);
		case StructuredActivityNode2EditPart.VISUAL_ID:
			if (StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID;
			}
			return getUnrecognizedStructuredActivityNode_3009ChildNodeID(domainElement, semanticHint);
		case OpaqueAction2EditPart.VISUAL_ID:
			if (OpaqueActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return OpaqueActionName2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OutputPinEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOutputPin_3001((OutputPin) domainElement))) {
				return OutputPinEditPart.VISUAL_ID;
			}
			return getUnrecognizedOpaqueAction_3011ChildNodeID(domainElement, semanticHint);
		case AcceptEventAction3EditPart.VISUAL_ID:
			return getUnrecognizedAcceptEventAction_3012ChildNodeID(domainElement, semanticHint);
		case AcceptEventAction4EditPart.VISUAL_ID:
			return getUnrecognizedAcceptEventAction_3013ChildNodeID(domainElement, semanticHint);
		case ActivityFinalNode2EditPart.VISUAL_ID:
			return getUnrecognizedActivityFinalNode_3014ChildNodeID(domainElement, semanticHint);
		case DecisionNode2EditPart.VISUAL_ID:
			return getUnrecognizedDecisionNode_3015ChildNodeID(domainElement, semanticHint);
		case FlowFinalNode2EditPart.VISUAL_ID:
			return getUnrecognizedFlowFinalNode_3016ChildNodeID(domainElement, semanticHint);
		case Pin2EditPart.VISUAL_ID:
			if (PinName2EditPart.VISUAL_ID == nodeVisualID) {
				return PinName2EditPart.VISUAL_ID;
			}
			return getUnrecognizedPin_3017ChildNodeID(domainElement, semanticHint);
		case CreateObjectAction2EditPart.VISUAL_ID:
			if (CreateObjectActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return CreateObjectActionName2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OutputPin2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOutputPin_3002((OutputPin) domainElement))) {
				return OutputPin2EditPart.VISUAL_ID;
			}
			return getUnrecognizedCreateObjectAction_3018ChildNodeID(domainElement, semanticHint);
		case CallBehaviorAction2EditPart.VISUAL_ID:
			if (CallBehaviorActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return CallBehaviorActionName2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OutputPin3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOutputPin_3006((OutputPin) domainElement))) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3007((InputPin) domainElement))) {
				return InputPin4EditPart.VISUAL_ID;
			}
			return getUnrecognizedCallBehaviorAction_3019ChildNodeID(domainElement, semanticHint);
		case CallOperationAction2EditPart.VISUAL_ID:
			if (CallOperationActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return CallOperationActionName2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OutputPin3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOutputPin_3006((OutputPin) domainElement))) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3007((InputPin) domainElement))) {
				return InputPin4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin5EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3008((InputPin) domainElement))) {
				return InputPin5EditPart.VISUAL_ID;
			}
			return getUnrecognizedCallOperationAction_3020ChildNodeID(domainElement, semanticHint);
		case ForkNode2EditPart.VISUAL_ID:
			return getUnrecognizedForkNode_3021ChildNodeID(domainElement, semanticHint);
		case JoinNode2EditPart.VISUAL_ID:
			return getUnrecognizedJoinNode_3022ChildNodeID(domainElement, semanticHint);
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			if (AddStructuralFeatureValueActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return AddStructuralFeatureValueActionName2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPinEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3003((InputPin) domainElement))) {
				return InputPinEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3004((InputPin) domainElement))) {
				return InputPin2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InputPin3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInputPin_3005((InputPin) domainElement))) {
				return InputPin3EditPart.VISUAL_ID;
			}
			return getUnrecognizedAddStructuralFeatureValueAction_3023ChildNodeID(domainElement, semanticHint);
		case DataStoreNode2EditPart.VISUAL_ID:
			return getUnrecognizedDataStoreNode_3024ChildNodeID(domainElement, semanticHint);
		case CentralBufferNode2EditPart.VISUAL_ID:
			return getUnrecognizedCentralBufferNode_3025ChildNodeID(domainElement, semanticHint);
		case OpaqueBehaviorEditPart.VISUAL_ID:
			if (OpaqueBehaviorNameEditPart.VISUAL_ID == nodeVisualID) {
				return OpaqueBehaviorNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedOpaqueBehavior_3047ChildNodeID(domainElement, semanticHint);
		case ActivityParameterNodeEditPart.VISUAL_ID:
			if (ActivityParameterNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return ActivityParameterNodeNameEditPart.VISUAL_ID;
			}
			return getUnrecognizedActivityParameterNode_3052ChildNodeID(domainElement, semanticHint);
		case LiteralStringEditPart.VISUAL_ID:
			return getUnrecognizedLiteralString_3049ChildNodeID(domainElement, semanticHint);
		case LiteralString2EditPart.VISUAL_ID:
			return getUnrecognizedLiteralString_3051ChildNodeID(domainElement, semanticHint);
		case ActivitySubverticesEditPart.VISUAL_ID:
			if ((semanticHint == null || AcceptEventActionEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAcceptEventAction_3030((AcceptEventAction) domainElement))) {
				return AcceptEventActionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AcceptEventAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAcceptEventAction_3031((AcceptEventAction) domainElement))) {
				return AcceptEventAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ActivityFinalNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeActivityFinalNode_3032((ActivityFinalNode) domainElement))) {
				return ActivityFinalNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DecisionNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDecisionNode_3033((DecisionNode) domainElement))) {
				return DecisionNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || MergeNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeMergeNode_3034((MergeNode) domainElement))) {
				return MergeNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || InitialNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeInitialNode_3035((InitialNode) domainElement))) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DataStoreNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDataStoreNode_3036((DataStoreNode) domainElement))) {
				return DataStoreNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CentralBufferNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCentralBufferNode_3037((CentralBufferNode) domainElement))) {
				return CentralBufferNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OpaqueActionEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOpaqueAction_3029((OpaqueAction) domainElement))) {
				return OpaqueActionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || FlowFinalNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeFlowFinalNode_3038((FlowFinalNode) domainElement))) {
				return FlowFinalNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ForkNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeForkNode_3039((ForkNode) domainElement))) {
				return ForkNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || JoinNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeJoinNode_3040((JoinNode) domainElement))) {
				return JoinNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || PinEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePin_3041((Pin) domainElement))) {
				return PinEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CreateObjectActionEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCreateObjectAction_3042((CreateObjectAction) domainElement))) {
				return CreateObjectActionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AddStructuralFeatureValueActionEditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAddStructuralFeatureValueAction_3043((AddStructuralFeatureValueAction) domainElement))) {
				return AddStructuralFeatureValueActionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CallBehaviorActionEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCallBehaviorAction_3044((CallBehaviorAction) domainElement))) {
				return CallBehaviorActionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CallOperationActionEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCallOperationAction_3045((CallOperationAction) domainElement))) {
				return CallOperationActionEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || StructuredActivityNodeEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeStructuredActivityNode_3046((StructuredActivityNode) domainElement))) {
				return StructuredActivityNodeEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OpaqueBehaviorEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOpaqueBehavior_3047((OpaqueBehavior) domainElement))) {
				return OpaqueBehaviorEditPart.VISUAL_ID;
			}
			return getUnrecognizedActivitySubvertices_7010ChildNodeID(domainElement, semanticHint);
		case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
			if ((semanticHint == null || StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeStructuredActivityNode_3009((StructuredActivityNode) domainElement))) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOpaqueAction_3011((OpaqueAction) domainElement))) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAcceptEventAction_3012((AcceptEventAction) domainElement))) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAcceptEventAction_3013((AcceptEventAction) domainElement))) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeActivityFinalNode_3014((ActivityFinalNode) domainElement))) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DecisionNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDecisionNode_3015((DecisionNode) domainElement))) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeFlowFinalNode_3016((FlowFinalNode) domainElement))) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pin2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePin_3017((Pin) domainElement))) {
				return Pin2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCreateObjectAction_3018((CreateObjectAction) domainElement))) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCallBehaviorAction_3019((CallBehaviorAction) domainElement))) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCallOperationAction_3020((CallOperationAction) domainElement))) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ForkNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeForkNode_3021((ForkNode) domainElement))) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || JoinNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeJoinNode_3022((JoinNode) domainElement))) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement))) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDataStoreNode_3024((DataStoreNode) domainElement))) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCentralBufferNode_3025((CentralBufferNode) domainElement))) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			return getUnrecognizedStructuredActivityNodeStructuredActivityContentPaneCompartment_7008ChildNodeID(domainElement, semanticHint);
		case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
			if ((semanticHint == null || StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeStructuredActivityNode_3009((StructuredActivityNode) domainElement))) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeOpaqueAction_3011((OpaqueAction) domainElement))) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAcceptEventAction_3012((AcceptEventAction) domainElement))) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAcceptEventAction_3013((AcceptEventAction) domainElement))) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeActivityFinalNode_3014((ActivityFinalNode) domainElement))) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DecisionNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDecisionNode_3015((DecisionNode) domainElement))) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeFlowFinalNode_3016((FlowFinalNode) domainElement))) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Pin2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodePin_3017((Pin) domainElement))) {
				return Pin2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCreateObjectAction_3018((CreateObjectAction) domainElement))) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCallBehaviorAction_3019((CallBehaviorAction) domainElement))) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCallOperationAction_3020((CallOperationAction) domainElement))) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ForkNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeForkNode_3021((ForkNode) domainElement))) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || JoinNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeJoinNode_3022((JoinNode) domainElement))) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID)
					&& UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement))) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeDataStoreNode_3024((DataStoreNode) domainElement))) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if ((semanticHint == null || CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeCentralBufferNode_3025((CentralBufferNode) domainElement))) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			return getUnrecognizedStructuredActivityNodeStructuredActivityContentPaneCompartment_7002ChildNodeID(domainElement, semanticHint);
		case ConstraintPreconditionEditPart.VISUAL_ID:
			if ((semanticHint == null || LiteralStringEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeLiteralString_3049((LiteralString) domainElement))) {
				return LiteralStringEditPart.VISUAL_ID;
			}
			return getUnrecognizedConstraintPrecondition_7013ChildNodeID(domainElement, semanticHint);
		case ConstraintPostconditionEditPart.VISUAL_ID:
			if ((semanticHint == null || LiteralString2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeLiteralString_3051((LiteralString) domainElement))) {
				return LiteralString2EditPart.VISUAL_ID;
			}
			return getUnrecognizedConstraintPostcondition_7014ChildNodeID(domainElement, semanticHint);
		case PackageEditPart.VISUAL_ID:
			if ((semanticHint == null || ActivityEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeActivity_2026((Activity) domainElement))) {
				return ActivityEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || ConstraintEditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeConstraint_2027((Constraint) domainElement))) {
				return ConstraintEditPart.VISUAL_ID;
			}
			if ((semanticHint == null || Constraint2EditPart.VISUAL_ID == nodeVisualID) && UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElementMetaclass)
					&& (domainElement == null || isNodeConstraint_2028((Constraint) domainElement))) {
				return Constraint2EditPart.VISUAL_ID;
			}
			return getUnrecognizedPackage_1000ChildNodeID(domainElement, semanticHint);
		case ExceptionHandlerEditPart.VISUAL_ID:
			if (ExceptionHandlerLink_fixed_iconEditPart.VISUAL_ID == nodeVisualID) {
				return ExceptionHandlerLink_fixed_iconEditPart.VISUAL_ID;
			}
			return getUnrecognizedExceptionHandler_4005LinkLabelID(semanticHint);
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		EClass domainElementMetaclass = domainElement.eClass();
		return getLinkWithClassVisualID(domainElement, domainElementMetaclass);
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement, EClass domainElementMetaclass) {
		if (UMLPackage.eINSTANCE.getControlFlow().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassControlFlow_4001((ControlFlow) domainElement))) {
			return ControlFlowEditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getObjectFlow().isSuperTypeOf(domainElementMetaclass) && (domainElement == null || isLinkWithClassObjectFlow_4002((ObjectFlow) domainElement))) {
			return ObjectFlowEditPart.VISUAL_ID;
		} else if (UMLPackage.eINSTANCE.getExceptionHandler().isSuperTypeOf(domainElementMetaclass)
				&& (domainElement == null || isLinkWithClassExceptionHandler_4005((ExceptionHandler) domainElement))) {
			return ExceptionHandlerEditPart.VISUAL_ID;
		} else {
			return getUnrecognizedLinkWithClassID(domainElement);
		}
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isDiagramPackage_1000(Package element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDiagramID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeActivity_2026(Activity element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeConstraint_2027(Constraint element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeConstraint_2028(Constraint element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAcceptEventAction_3030(AcceptEventAction element) {
		return AcceptEventAction_3030.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAcceptEventAction_3031(AcceptEventAction element) {
		return AcceptEventAction_3031.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeActivityFinalNode_3032(ActivityFinalNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDecisionNode_3033(DecisionNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeMergeNode_3034(MergeNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInitialNode_3035(InitialNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDataStoreNode_3036(DataStoreNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCentralBufferNode_3037(CentralBufferNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOpaqueAction_3029(OpaqueAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOutputPin_3001(OutputPin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeFlowFinalNode_3038(FlowFinalNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeForkNode_3039(ForkNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeJoinNode_3040(JoinNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePin_3041(Pin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCreateObjectAction_3042(CreateObjectAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOutputPin_3002(OutputPin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAddStructuralFeatureValueAction_3043(AddStructuralFeatureValueAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInputPin_3003(InputPin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInputPin_3004(InputPin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInputPin_3005(InputPin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCallBehaviorAction_3044(CallBehaviorAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOutputPin_3006(OutputPin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInputPin_3007(InputPin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCallOperationAction_3045(CallOperationAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeInputPin_3008(InputPin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeStructuredActivityNode_3046(StructuredActivityNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeStructuredActivityNode_3009(StructuredActivityNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOpaqueAction_3011(OpaqueAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAcceptEventAction_3012(AcceptEventAction element) {
		return AcceptEventAction_3012.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAcceptEventAction_3013(AcceptEventAction element) {
		return AcceptEventAction_3013.matches(element);
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeActivityFinalNode_3014(ActivityFinalNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDecisionNode_3015(DecisionNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeFlowFinalNode_3016(FlowFinalNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodePin_3017(Pin element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCreateObjectAction_3018(CreateObjectAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCallBehaviorAction_3019(CallBehaviorAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCallOperationAction_3020(CallOperationAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeForkNode_3021(ForkNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeJoinNode_3022(JoinNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeAddStructuralFeatureValueAction_3023(AddStructuralFeatureValueAction element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeDataStoreNode_3024(DataStoreNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeCentralBufferNode_3025(CentralBufferNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeOpaqueBehavior_3047(OpaqueBehavior element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeActivityParameterNode_3052(ActivityParameterNode element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeLiteralString_3049(LiteralString element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isNodeLiteralString_3051(LiteralString element) {
		return true;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedActivity_2026ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedConstraint_2027ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedConstraint_2028ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAcceptEventAction_3030ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAcceptEventAction_3031ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedActivityFinalNode_3032ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDecisionNode_3033ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedMergeNode_3034ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInitialNode_3035ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDataStoreNode_3036ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCentralBufferNode_3037ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOpaqueAction_3029ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOutputPin_3001ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedFlowFinalNode_3038ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedForkNode_3039ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedJoinNode_3040ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPin_3041ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCreateObjectAction_3042ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOutputPin_3002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAddStructuralFeatureValueAction_3043ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInputPin_3003ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInputPin_3004ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInputPin_3005ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCallBehaviorAction_3044ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOutputPin_3006ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInputPin_3007ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCallOperationAction_3045ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedInputPin_3008ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedStructuredActivityNode_3046ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedStructuredActivityNode_3009ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOpaqueAction_3011ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAcceptEventAction_3012ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAcceptEventAction_3013ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedActivityFinalNode_3014ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDecisionNode_3015ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedFlowFinalNode_3016ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPin_3017ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCreateObjectAction_3018ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCallBehaviorAction_3019ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCallOperationAction_3020ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedForkNode_3021ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedJoinNode_3022ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedAddStructuralFeatureValueAction_3023ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedDataStoreNode_3024ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedCentralBufferNode_3025ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedOpaqueBehavior_3047ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedActivityParameterNode_3052ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLiteralString_3049ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLiteralString_3051ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedActivitySubvertices_7010ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedStructuredActivityNodeStructuredActivityContentPaneCompartment_7008ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedStructuredActivityNodeStructuredActivityContentPaneCompartment_7002ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedConstraintPrecondition_7013ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedConstraintPostcondition_7014ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedPackage_1000ChildNodeID(EObject domainElement, String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedExceptionHandler_4005LinkLabelID(String semanticHint) {
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 *
	 * @generated
	 */
	private static int getUnrecognizedLinkWithClassID(EObject domainElement) {
		return -1;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassControlFlow_4001(ControlFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassObjectFlow_4002(ObjectFlow element) {
		return true;
	}

	/**
	 * User can change implementation of this method to check some additional 
	 * conditions here.
	 *
	 * @generated
	 */
	private static boolean isLinkWithClassExceptionHandler_4005(ExceptionHandler element) {
		return true;
	}

	/**
	 * @generated
	 */
	private static final Matcher AcceptEventAction_3030 = new Matcher(UMLOCLFactory.getExpression("self.trigger->isEmpty() or (not self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getAcceptEventAction()));

	/**
	 * @generated
	 */
	private static final Matcher AcceptEventAction_3031 = new Matcher(UMLOCLFactory.getExpression(
			"(not self.trigger->isEmpty()) and (self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getAcceptEventAction()));

	/**
	 * @generated
	 */
	private static final Matcher AcceptEventAction_3012 = new Matcher(UMLOCLFactory.getExpression("self.trigger->isEmpty() or (not self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getAcceptEventAction()));

	/**
	 * @generated
	 */
	private static final Matcher AcceptEventAction_3013 = new Matcher(UMLOCLFactory.getExpression(
			"(not self.trigger->isEmpty()) and (self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))", //$NON-NLS-1$
			UMLPackage.eINSTANCE.getAcceptEventAction()));

	/**
	 * @generated	
	 */
	static class Matcher {

		/**
		 * @generated	
		 */
		private UMLAbstractExpression condition;

		/**
		 * @generated	
		 */
		Matcher(UMLAbstractExpression conditionExpression) {
			this.condition = conditionExpression;
		}

		/**
		 * @generated	
		 */
		boolean matches(EObject object) {
			Object result = condition.evaluate(object);
			return result instanceof Boolean && ((Boolean) result).booleanValue();
		}
	}// Matcher
}
