package org.eclipse.uml2.diagram.activity.part;

import java.util.Iterator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.*;
import org.eclipse.uml2.diagram.activity.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.activity.expressions.UMLOCLFactory;
import org.eclipse.uml2.diagram.common.genapi.IVisualIDRegistry;
import org.eclipse.uml2.uml.AcceptEventAction;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.ActivityFinalNode;
import org.eclipse.uml2.uml.AddStructuralFeatureValueAction;
import org.eclipse.uml2.uml.CallBehaviorAction;
import org.eclipse.uml2.uml.CallOperationAction;
import org.eclipse.uml2.uml.CentralBufferNode;
import org.eclipse.uml2.uml.ConditionalNode;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.CreateObjectAction;
import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.DecisionNode;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.ExpansionRegion;
import org.eclipse.uml2.uml.FlowFinalNode;
import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InitialNode;
import org.eclipse.uml2.uml.JoinNode;
import org.eclipse.uml2.uml.LoopNode;
import org.eclipse.uml2.uml.MergeNode;
import org.eclipse.uml2.uml.OpaqueAction;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Pin;
import org.eclipse.uml2.uml.SendSignalAction;
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
	private static final String DEBUG_KEY = "org.eclipse.uml2.diagram.activity/debug/visualID"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AcceptEventAction_3030_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AcceptEventAction_3031_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ActivityFinalNode_3032_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression DecisionNode_3033_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression MergeNode_3034_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression InitialNode_3035_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression DataStoreNode_3036_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CentralBufferNode_3037_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression OpaqueAction_3029_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression FlowFinalNode_3038_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ForkNode_3039_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression JoinNode_3040_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pin_3041_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CreateObjectAction_3042_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AddStructuralFeatureValueAction_3043_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CallBehaviorAction_3044_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CallOperationAction_3045_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression StructuredActivityNode_3046_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression StructuredActivityNode_3009_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression OpaqueAction_3011_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AcceptEventAction_3012_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AcceptEventAction_3013_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ActivityFinalNode_3014_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression DecisionNode_3015_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression FlowFinalNode_3016_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pin_3017_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CreateObjectAction_3018_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CallBehaviorAction_3019_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CallOperationAction_3020_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ForkNode_3021_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression JoinNode_3022_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AddStructuralFeatureValueAction_3023_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression DataStoreNode_3024_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CentralBufferNode_3025_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression SendSignalAction_3053_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AcceptEventAction_3059_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AcceptEventAction_3060_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ActivityFinalNode_3061_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression DecisionNode_3062_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression MergeNode_3063_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression InitialNode_3064_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression DataStoreNode_3065_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CentralBufferNode_3066_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression OpaqueAction_3067_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression FlowFinalNode_3068_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ForkNode_3069_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression JoinNode_3070_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression Pin_3071_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CreateObjectAction_3072_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression AddStructuralFeatureValueAction_3073_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CallBehaviorAction_3074_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression CallOperationAction_3075_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression StructuredActivityNode_3076_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression StructuredActivityNode_3079_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression SendSignalAction_3077_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression LoopNode_3078_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ConditionalNode_3083_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ExpansionRegion_3085_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression LoopNode_3058_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ConditionalNode_3082_Constraint;

	/**
	 * @generated
	 */
	private static UMLAbstractExpression ExpansionRegion_3084_Constraint;

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
		return org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.getVisualID(view.getType());
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
		if (UMLPackage.eINSTANCE.getPackage().isSuperTypeOf(domainElement.eClass()) && isDiagram((Package) domainElement)) {
			return PackageEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return -1;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case ActivityEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3030((AcceptEventAction) domainElement)) {
				return AcceptEventActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3031((AcceptEventAction) domainElement)) {
				return AcceptEventAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3032((ActivityFinalNode) domainElement)) {
				return ActivityFinalNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3033((DecisionNode) domainElement)) {
				return DecisionNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && isMergeNode_3034((MergeNode) domainElement)) {
				return MergeNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && isInitialNode_3035((InitialNode) domainElement)) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3036((DataStoreNode) domainElement)) {
				return DataStoreNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3037((CentralBufferNode) domainElement)) {
				return CentralBufferNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3029((OpaqueAction) domainElement)) {
				return OpaqueActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3038((FlowFinalNode) domainElement)) {
				return FlowFinalNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3039((ForkNode) domainElement)) {
				return ForkNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3040((JoinNode) domainElement)) {
				return JoinNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3041((Pin) domainElement)) {
				return PinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3042((CreateObjectAction) domainElement)) {
				return CreateObjectActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3043((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3044((CallBehaviorAction) domainElement)) {
				return CallBehaviorActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3045((CallOperationAction) domainElement)) {
				return CallOperationActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3046((StructuredActivityNode) domainElement)) {
				return StructuredActivityNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
				return OpaqueBehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityParameterNode().isSuperTypeOf(domainElement.eClass())) {
				return ActivityParameterNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && isSendSignalAction_3053((SendSignalAction) domainElement)) {
				return SendSignalActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartitionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && isLoopNode_3058((LoopNode) domainElement)) {
				return LoopNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConditionalNode().isSuperTypeOf(domainElement.eClass()) && isConditionalNode_3082((ConditionalNode) domainElement)) {
				return ConditionalNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExpansionRegion().isSuperTypeOf(domainElement.eClass()) && isExpansionRegion_3084((ExpansionRegion) domainElement)) {
				return ExpansionRegionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getParameterSet().isSuperTypeOf(domainElement.eClass())) {
				return ParameterSetEditPart.VISUAL_ID;
			}
			break;
		case OpaqueActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPinEditPart.VISUAL_ID;
			}
			break;
		case CreateObjectActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin2EditPart.VISUAL_ID;
			}
			break;
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin3EditPart.VISUAL_ID;
			}
			break;
		case CallBehaviorActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			break;
		case CallOperationActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin5EditPart.VISUAL_ID;
			}
			break;
		case OpaqueAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPinEditPart.VISUAL_ID;
			}
			break;
		case CreateObjectAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin2EditPart.VISUAL_ID;
			}
			break;
		case CallBehaviorAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			break;
		case CallOperationAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin5EditPart.VISUAL_ID;
			}
			break;
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin3EditPart.VISUAL_ID;
			}
			break;
		case ActivityPartitionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartition2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3059((AcceptEventAction) domainElement)) {
				return AcceptEventAction5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3060((AcceptEventAction) domainElement)) {
				return AcceptEventAction6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3061((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3062((DecisionNode) domainElement)) {
				return DecisionNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && isMergeNode_3063((MergeNode) domainElement)) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && isInitialNode_3064((InitialNode) domainElement)) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3065((DataStoreNode) domainElement)) {
				return DataStoreNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3066((CentralBufferNode) domainElement)) {
				return CentralBufferNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3067((OpaqueAction) domainElement)) {
				return OpaqueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3068((FlowFinalNode) domainElement)) {
				return FlowFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3069((ForkNode) domainElement)) {
				return ForkNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3070((JoinNode) domainElement)) {
				return JoinNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3071((Pin) domainElement)) {
				return Pin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3072((CreateObjectAction) domainElement)) {
				return CreateObjectAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3073((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3074((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3075((CallOperationAction) domainElement)) {
				return CallOperationAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3076((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && isSendSignalAction_3077((SendSignalAction) domainElement)) {
				return SendSignalAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && isLoopNode_3078((LoopNode) domainElement)) {
				return LoopNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConditionalNode().isSuperTypeOf(domainElement.eClass()) && isConditionalNode_3083((ConditionalNode) domainElement)) {
				return ConditionalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExpansionRegion().isSuperTypeOf(domainElement.eClass()) && isExpansionRegion_3085((ExpansionRegion) domainElement)) {
				return ExpansionRegion2EditPart.VISUAL_ID;
			}
			break;
		case ActivityPartition2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartition2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3059((AcceptEventAction) domainElement)) {
				return AcceptEventAction5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3060((AcceptEventAction) domainElement)) {
				return AcceptEventAction6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3061((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3062((DecisionNode) domainElement)) {
				return DecisionNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && isMergeNode_3063((MergeNode) domainElement)) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && isInitialNode_3064((InitialNode) domainElement)) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3065((DataStoreNode) domainElement)) {
				return DataStoreNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3066((CentralBufferNode) domainElement)) {
				return CentralBufferNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3067((OpaqueAction) domainElement)) {
				return OpaqueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3068((FlowFinalNode) domainElement)) {
				return FlowFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3069((ForkNode) domainElement)) {
				return ForkNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3070((JoinNode) domainElement)) {
				return JoinNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3071((Pin) domainElement)) {
				return Pin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3072((CreateObjectAction) domainElement)) {
				return CreateObjectAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3073((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3074((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3075((CallOperationAction) domainElement)) {
				return CallOperationAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3076((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && isSendSignalAction_3077((SendSignalAction) domainElement)) {
				return SendSignalAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && isLoopNode_3078((LoopNode) domainElement)) {
				return LoopNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConditionalNode().isSuperTypeOf(domainElement.eClass()) && isConditionalNode_3083((ConditionalNode) domainElement)) {
				return ConditionalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExpansionRegion().isSuperTypeOf(domainElement.eClass()) && isExpansionRegion_3085((ExpansionRegion) domainElement)) {
				return ExpansionRegion2EditPart.VISUAL_ID;
			}
			break;
		case OpaqueAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPinEditPart.VISUAL_ID;
			}
			break;
		case CreateObjectAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin2EditPart.VISUAL_ID;
			}
			break;
		case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin3EditPart.VISUAL_ID;
			}
			break;
		case CallBehaviorAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			break;
		case CallOperationAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin5EditPart.VISUAL_ID;
			}
			break;
		case ParameterSetEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3079((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin5EditPart.VISUAL_ID;
			}
			break;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3079((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin5EditPart.VISUAL_ID;
			}
			break;
		case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ConditionalNodeConditionalNodeCompartmentEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ConstraintPreconditionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElement.eClass())) {
				return LiteralStringEditPart.VISUAL_ID;
			}
			break;
		case ConstraintPostconditionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElement.eClass())) {
				return LiteralString2EditPart.VISUAL_ID;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass()) && isConstraint_2027((Constraint) domainElement)) {
				return ConstraintEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass()) && isConstraint_2028((Constraint) domainElement)) {
				return Constraint2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.getModelID(containerView);
		if (!PackageEditPart.MODEL_ID.equals(containerModelID)) {
			return false;
		}
		int containerVisualID;
		if (PackageEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = PackageEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case ActivityEditPart.VISUAL_ID:
			if (ActivityNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredActivityNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueBehaviorEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityParameterNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendSignalActionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityPartitionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalNodeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExpansionRegionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ParameterSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintEditPart.VISUAL_ID:
			if (ConstraintPreconditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Constraint2EditPart.VISUAL_ID:
			if (ConstraintPostconditionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcceptEventActionEditPart.VISUAL_ID:
			if (AcceptEventActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcceptEventAction2EditPart.VISUAL_ID:
			if (AcceptEventActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataStoreNodeEditPart.VISUAL_ID:
			if (DataStoreNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNodeOrderingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CentralBufferNodeEditPart.VISUAL_ID:
			if (CentralBufferNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNodeOrderingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueActionEditPart.VISUAL_ID:
			if (OpaqueActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPinEditPart.VISUAL_ID:
			if (OutputPinNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPinOrderingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PinEditPart.VISUAL_ID:
			if (PinNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PinName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PinOrderingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateObjectActionEditPart.VISUAL_ID:
			if (CreateObjectActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPin2EditPart.VISUAL_ID:
			if (OutputPinName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPinOrdering2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			if (AddStructuralFeatureValueActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPinEditPart.VISUAL_ID:
			if (InputPinNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinOrderingEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPin2EditPart.VISUAL_ID:
			if (InputPinName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinOrdering2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPin3EditPart.VISUAL_ID:
			if (InputPinName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinOrdering3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallBehaviorActionEditPart.VISUAL_ID:
			if (CallBehaviorActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPin3EditPart.VISUAL_ID:
			if (OutputPinName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPinOrdering3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPin4EditPart.VISUAL_ID:
			if (InputPinName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinOrdering4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallOperationActionEditPart.VISUAL_ID:
			if (CallOperationActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPin5EditPart.VISUAL_ID:
			if (InputPinName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinOrdering5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNodeEditPart.VISUAL_ID:
			if (StructuredActivityNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNode2EditPart.VISUAL_ID:
			if (StructuredActivityNodeName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueAction2EditPart.VISUAL_ID:
			if (OpaqueActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcceptEventAction3EditPart.VISUAL_ID:
			if (AcceptEventActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcceptEventAction4EditPart.VISUAL_ID:
			if (AcceptEventActionName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pin2EditPart.VISUAL_ID:
			if (PinName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PinName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PinOrdering2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateObjectAction2EditPart.VISUAL_ID:
			if (CreateObjectActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallBehaviorAction2EditPart.VISUAL_ID:
			if (CallBehaviorActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallOperationAction2EditPart.VISUAL_ID:
			if (CallOperationActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			if (AddStructuralFeatureValueActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataStoreNode2EditPart.VISUAL_ID:
			if (DataStoreNodeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNodeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNodeOrdering2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CentralBufferNode2EditPart.VISUAL_ID:
			if (CentralBufferNodeName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNodeName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNodeOrdering2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPin6EditPart.VISUAL_ID:
			if (InputPinName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinOrdering6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPin4EditPart.VISUAL_ID:
			if (OutputPinName4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPinOrdering4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueBehaviorEditPart.VISUAL_ID:
			if (OpaqueBehaviorNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityParameterNodeEditPart.VISUAL_ID:
			if (ActivityParameterNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendSignalActionEditPart.VISUAL_ID:
			if (SendSignalActionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityPartitionEditPart.VISUAL_ID:
			if (ActivityPartitionNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityPartition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredActivityNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendSignalAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExpansionRegion2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ActivityPartition2EditPart.VISUAL_ID:
			if (ActivityPartitionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityPartition2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (MergeNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InitialNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (StructuredActivityNode3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (SendSignalAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExpansionRegion2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcceptEventAction5EditPart.VISUAL_ID:
			if (AcceptEventActionName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AcceptEventAction6EditPart.VISUAL_ID:
			if (AcceptEventActionName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case DataStoreNode3EditPart.VISUAL_ID:
			if (DataStoreNodeName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNodeName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNodeOrdering3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CentralBufferNode3EditPart.VISUAL_ID:
			if (CentralBufferNodeName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNodeName6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNodeOrdering3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OpaqueAction3EditPart.VISUAL_ID:
			if (OpaqueActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case Pin3EditPart.VISUAL_ID:
			if (PinName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (PinOrdering3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CreateObjectAction3EditPart.VISUAL_ID:
			if (CreateObjectActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
			if (AddStructuralFeatureValueActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallBehaviorAction3EditPart.VISUAL_ID:
			if (CallBehaviorActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case CallOperationAction3EditPart.VISUAL_ID:
			if (CallOperationActionName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNode3EditPart.VISUAL_ID:
			if (StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNode4EditPart.VISUAL_ID:
			if (StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case InputPin7EditPart.VISUAL_ID:
			if (InputPinName7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPinOrdering7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case OutputPin5EditPart.VISUAL_ID:
			if (OutputPinName5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPinOrdering5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case SendSignalAction2EditPart.VISUAL_ID:
			if (SendSignalActionName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopNode2EditPart.VISUAL_ID:
			if (LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalNode2EditPart.VISUAL_ID:
			if (ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpansionRegion2EditPart.VISUAL_ID:
			if (ExpansionRegionMode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopNodeEditPart.VISUAL_ID:
			if (LoopNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalNodeEditPart.VISUAL_ID:
			if (ConditionalNodeNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConditionalNodeConditionalNodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpansionRegionEditPart.VISUAL_ID:
			if (ExpansionRegionModeEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ParameterSetEditPart.VISUAL_ID:
			if (ParameterEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
			if (StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
			if (StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
			if (StructuredActivityNode4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
			if (StructuredActivityNode4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin7EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin5EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
			if (StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID:
			if (StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID:
			if (StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID:
			if (StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConditionalNodeConditionalNodeCompartmentEditPart.VISUAL_ID:
			if (StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID:
			if (StructuredActivityNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OpaqueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AcceptEventAction4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ActivityFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DecisionNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (FlowFinalNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Pin2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CreateObjectAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallBehaviorAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CallOperationAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ForkNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (JoinNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (AddStructuralFeatureValueAction2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (DataStoreNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (CentralBufferNode2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (InputPin6EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (OutputPin4EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintPreconditionEditPart.VISUAL_ID:
			if (LiteralStringEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ConstraintPostconditionEditPart.VISUAL_ID:
			if (LiteralString2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (ActivityEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (Constraint2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ControlFlowEditPart.VISUAL_ID:
			if (ControlFlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlFlowName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ControlFlowName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ObjectFlowEditPart.VISUAL_ID:
			if (ObjectFlowNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectFlowName2EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (ObjectFlowName3EditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case ExceptionHandlerEditPart.VISUAL_ID:
			if (ExceptionHandlerLink_fixed_iconEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (UMLPackage.eINSTANCE.getControlFlow().isSuperTypeOf(domainElement.eClass())) {
			return ControlFlowEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getObjectFlow().isSuperTypeOf(domainElement.eClass())) {
			return ObjectFlowEditPart.VISUAL_ID;
		}
		if (UMLPackage.eINSTANCE.getExceptionHandler().isSuperTypeOf(domainElement.eClass())) {
			return ExceptionHandlerEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	 * User can change implementation of this method to handle some specific
	 * situations not covered by default logic.
	 * 
	 * @generated
	 */
	private static boolean isDiagram(Package element) {
		return true;
	}

	/**
	 * @generated NOT
	 */
	private static boolean isConstraint_2027(Constraint domainElement) {
		Element owner = domainElement.getOwner();
		if (owner instanceof Action) {
			EList<Constraint> preconditions = ((Action) owner).getLocalPreconditions();
			for (Iterator<Constraint> pcIterator = preconditions.iterator(); pcIterator.hasNext();) {
				if (domainElement.equals(pcIterator.next())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @generated NOT
	 */
	private static boolean isConstraint_2028(Constraint domainElement) {
		Element owner = domainElement.getOwner();
		if (owner instanceof Action) {
			EList<Constraint> postconditions = ((Action) owner).getLocalPostconditions();
			for (Iterator<Constraint> pcIterator = postconditions.iterator(); pcIterator.hasNext();) {
				if (domainElement.equals(pcIterator.next())) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static boolean isAcceptEventAction_3030(AcceptEventAction domainElement) {
		if (AcceptEventAction_3030_Constraint == null) { // lazy initialization
			AcceptEventAction_3030_Constraint = UMLOCLFactory.getExpression(
					"(self.trigger->isEmpty() or (not self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction()); //$NON-NLS-1$
		}
		Object result = AcceptEventAction_3030_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAcceptEventAction_3031(AcceptEventAction domainElement) {
		if (AcceptEventAction_3031_Constraint == null) { // lazy initialization
			AcceptEventAction_3031_Constraint = UMLOCLFactory.getExpression(
					"(not self.trigger->isEmpty()) and (self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent))) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction()); //$NON-NLS-1$
		}
		Object result = AcceptEventAction_3031_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isActivityFinalNode_3032(ActivityFinalNode domainElement) {
		if (ActivityFinalNode_3032_Constraint == null) { // lazy initialization
			ActivityFinalNode_3032_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getActivityFinalNode()); //$NON-NLS-1$
		}
		Object result = ActivityFinalNode_3032_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDecisionNode_3033(DecisionNode domainElement) {
		if (DecisionNode_3033_Constraint == null) { // lazy initialization
			DecisionNode_3033_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getDecisionNode()); //$NON-NLS-1$
		}
		Object result = DecisionNode_3033_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isMergeNode_3034(MergeNode domainElement) {
		if (MergeNode_3034_Constraint == null) { // lazy initialization
			MergeNode_3034_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getMergeNode()); //$NON-NLS-1$
		}
		Object result = MergeNode_3034_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isInitialNode_3035(InitialNode domainElement) {
		if (InitialNode_3035_Constraint == null) { // lazy initialization
			InitialNode_3035_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getInitialNode()); //$NON-NLS-1$
		}
		Object result = InitialNode_3035_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDataStoreNode_3036(DataStoreNode domainElement) {
		if (DataStoreNode_3036_Constraint == null) { // lazy initialization
			DataStoreNode_3036_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getDataStoreNode()); //$NON-NLS-1$
		}
		Object result = DataStoreNode_3036_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCentralBufferNode_3037(CentralBufferNode domainElement) {
		if (CentralBufferNode_3037_Constraint == null) { // lazy initialization
			CentralBufferNode_3037_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCentralBufferNode()); //$NON-NLS-1$
		}
		Object result = CentralBufferNode_3037_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isOpaqueAction_3029(OpaqueAction domainElement) {
		if (OpaqueAction_3029_Constraint == null) { // lazy initialization
			OpaqueAction_3029_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getOpaqueAction()); //$NON-NLS-1$
		}
		Object result = OpaqueAction_3029_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isFlowFinalNode_3038(FlowFinalNode domainElement) {
		if (FlowFinalNode_3038_Constraint == null) { // lazy initialization
			FlowFinalNode_3038_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getFlowFinalNode()); //$NON-NLS-1$
		}
		Object result = FlowFinalNode_3038_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isForkNode_3039(ForkNode domainElement) {
		if (ForkNode_3039_Constraint == null) { // lazy initialization
			ForkNode_3039_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getForkNode()); //$NON-NLS-1$
		}
		Object result = ForkNode_3039_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isJoinNode_3040(JoinNode domainElement) {
		if (JoinNode_3040_Constraint == null) { // lazy initialization
			JoinNode_3040_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getJoinNode()); //$NON-NLS-1$
		}
		Object result = JoinNode_3040_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPin_3041(Pin domainElement) {
		if (Pin_3041_Constraint == null) { // lazy initialization
			Pin_3041_Constraint = UMLOCLFactory.getExpression(
					"(not self.oclIsTypeOf(uml::InputPin)) and (not self.oclIsTypeOf(uml::OutputPin)) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getPin()); //$NON-NLS-1$
		}
		Object result = Pin_3041_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCreateObjectAction_3042(CreateObjectAction domainElement) {
		if (CreateObjectAction_3042_Constraint == null) { // lazy initialization
			CreateObjectAction_3042_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCreateObjectAction()); //$NON-NLS-1$
		}
		Object result = CreateObjectAction_3042_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAddStructuralFeatureValueAction_3043(AddStructuralFeatureValueAction domainElement) {
		if (AddStructuralFeatureValueAction_3043_Constraint == null) { // lazy initialization
			AddStructuralFeatureValueAction_3043_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction()); //$NON-NLS-1$
		}
		Object result = AddStructuralFeatureValueAction_3043_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCallBehaviorAction_3044(CallBehaviorAction domainElement) {
		if (CallBehaviorAction_3044_Constraint == null) { // lazy initialization
			CallBehaviorAction_3044_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCallBehaviorAction()); //$NON-NLS-1$
		}
		Object result = CallBehaviorAction_3044_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCallOperationAction_3045(CallOperationAction domainElement) {
		if (CallOperationAction_3045_Constraint == null) { // lazy initialization
			CallOperationAction_3045_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCallOperationAction()); //$NON-NLS-1$
		}
		Object result = CallOperationAction_3045_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isStructuredActivityNode_3046(StructuredActivityNode domainElement) {
		if (StructuredActivityNode_3046_Constraint == null) { // lazy initialization
			StructuredActivityNode_3046_Constraint = UMLOCLFactory
					.getExpression(
							"not self.oclIsTypeOf(uml::LoopNode) and not self.oclIsTypeOf(uml::ConditionalNode) and not self.oclIsTypeOf(uml::ExpansionRegion) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getStructuredActivityNode()); //$NON-NLS-1$
		}
		Object result = StructuredActivityNode_3046_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isStructuredActivityNode_3009(StructuredActivityNode domainElement) {
		if (StructuredActivityNode_3009_Constraint == null) { // lazy initialization
			StructuredActivityNode_3009_Constraint = UMLOCLFactory
					.getExpression(
							"not self.oclIsTypeOf(uml::LoopNode) and not self.oclIsTypeOf(uml::ConditionalNode) and not self.oclIsTypeOf(uml::ExpansionRegion) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getStructuredActivityNode()); //$NON-NLS-1$
		}
		Object result = StructuredActivityNode_3009_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isOpaqueAction_3011(OpaqueAction domainElement) {
		if (OpaqueAction_3011_Constraint == null) { // lazy initialization
			OpaqueAction_3011_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getOpaqueAction()); //$NON-NLS-1$
		}
		Object result = OpaqueAction_3011_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAcceptEventAction_3012(AcceptEventAction domainElement) {
		if (AcceptEventAction_3012_Constraint == null) { // lazy initialization
			AcceptEventAction_3012_Constraint = UMLOCLFactory.getExpression(
					"(self.trigger->isEmpty() or (not self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction()); //$NON-NLS-1$
		}
		Object result = AcceptEventAction_3012_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAcceptEventAction_3013(AcceptEventAction domainElement) {
		if (AcceptEventAction_3013_Constraint == null) { // lazy initialization
			AcceptEventAction_3013_Constraint = UMLOCLFactory.getExpression(
					"(not self.trigger->isEmpty()) and (self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent))) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction()); //$NON-NLS-1$
		}
		Object result = AcceptEventAction_3013_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isActivityFinalNode_3014(ActivityFinalNode domainElement) {
		if (ActivityFinalNode_3014_Constraint == null) { // lazy initialization
			ActivityFinalNode_3014_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getActivityFinalNode()); //$NON-NLS-1$
		}
		Object result = ActivityFinalNode_3014_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDecisionNode_3015(DecisionNode domainElement) {
		if (DecisionNode_3015_Constraint == null) { // lazy initialization
			DecisionNode_3015_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getDecisionNode()); //$NON-NLS-1$
		}
		Object result = DecisionNode_3015_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isFlowFinalNode_3016(FlowFinalNode domainElement) {
		if (FlowFinalNode_3016_Constraint == null) { // lazy initialization
			FlowFinalNode_3016_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getFlowFinalNode()); //$NON-NLS-1$
		}
		Object result = FlowFinalNode_3016_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPin_3017(Pin domainElement) {
		if (Pin_3017_Constraint == null) { // lazy initialization
			Pin_3017_Constraint = UMLOCLFactory.getExpression(
					"(not self.oclIsTypeOf(uml::InputPin)) and (not self.oclIsTypeOf(uml::OutputPin)) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getPin()); //$NON-NLS-1$
		}
		Object result = Pin_3017_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCreateObjectAction_3018(CreateObjectAction domainElement) {
		if (CreateObjectAction_3018_Constraint == null) { // lazy initialization
			CreateObjectAction_3018_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCreateObjectAction()); //$NON-NLS-1$
		}
		Object result = CreateObjectAction_3018_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCallBehaviorAction_3019(CallBehaviorAction domainElement) {
		if (CallBehaviorAction_3019_Constraint == null) { // lazy initialization
			CallBehaviorAction_3019_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCallBehaviorAction()); //$NON-NLS-1$
		}
		Object result = CallBehaviorAction_3019_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCallOperationAction_3020(CallOperationAction domainElement) {
		if (CallOperationAction_3020_Constraint == null) { // lazy initialization
			CallOperationAction_3020_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCallOperationAction()); //$NON-NLS-1$
		}
		Object result = CallOperationAction_3020_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isForkNode_3021(ForkNode domainElement) {
		if (ForkNode_3021_Constraint == null) { // lazy initialization
			ForkNode_3021_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getForkNode()); //$NON-NLS-1$
		}
		Object result = ForkNode_3021_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isJoinNode_3022(JoinNode domainElement) {
		if (JoinNode_3022_Constraint == null) { // lazy initialization
			JoinNode_3022_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getJoinNode()); //$NON-NLS-1$
		}
		Object result = JoinNode_3022_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAddStructuralFeatureValueAction_3023(AddStructuralFeatureValueAction domainElement) {
		if (AddStructuralFeatureValueAction_3023_Constraint == null) { // lazy initialization
			AddStructuralFeatureValueAction_3023_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction()); //$NON-NLS-1$
		}
		Object result = AddStructuralFeatureValueAction_3023_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDataStoreNode_3024(DataStoreNode domainElement) {
		if (DataStoreNode_3024_Constraint == null) { // lazy initialization
			DataStoreNode_3024_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getDataStoreNode()); //$NON-NLS-1$
		}
		Object result = DataStoreNode_3024_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCentralBufferNode_3025(CentralBufferNode domainElement) {
		if (CentralBufferNode_3025_Constraint == null) { // lazy initialization
			CentralBufferNode_3025_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCentralBufferNode()); //$NON-NLS-1$
		}
		Object result = CentralBufferNode_3025_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSendSignalAction_3053(SendSignalAction domainElement) {
		if (SendSignalAction_3053_Constraint == null) { // lazy initialization
			SendSignalAction_3053_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getSendSignalAction()); //$NON-NLS-1$
		}
		Object result = SendSignalAction_3053_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAcceptEventAction_3059(AcceptEventAction domainElement) {
		if (AcceptEventAction_3059_Constraint == null) { // lazy initialization
			AcceptEventAction_3059_Constraint = UMLOCLFactory.getExpression(
					"(self.trigger->isEmpty() or (not self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))) and self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction()); //$NON-NLS-1$
		}
		Object result = AcceptEventAction_3059_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAcceptEventAction_3060(AcceptEventAction domainElement) {
		if (AcceptEventAction_3060_Constraint == null) { // lazy initialization
			AcceptEventAction_3060_Constraint = UMLOCLFactory
					.getExpression(
							"(not self.trigger->isEmpty()) and (self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent))) and self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction()); //$NON-NLS-1$
		}
		Object result = AcceptEventAction_3060_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isActivityFinalNode_3061(ActivityFinalNode domainElement) {
		if (ActivityFinalNode_3061_Constraint == null) { // lazy initialization
			ActivityFinalNode_3061_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getActivityFinalNode()); //$NON-NLS-1$
		}
		Object result = ActivityFinalNode_3061_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDecisionNode_3062(DecisionNode domainElement) {
		if (DecisionNode_3062_Constraint == null) { // lazy initialization
			DecisionNode_3062_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getDecisionNode()); //$NON-NLS-1$
		}
		Object result = DecisionNode_3062_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isMergeNode_3063(MergeNode domainElement) {
		if (MergeNode_3063_Constraint == null) { // lazy initialization
			MergeNode_3063_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getMergeNode()); //$NON-NLS-1$
		}
		Object result = MergeNode_3063_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isInitialNode_3064(InitialNode domainElement) {
		if (InitialNode_3064_Constraint == null) { // lazy initialization
			InitialNode_3064_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getInitialNode()); //$NON-NLS-1$
		}
		Object result = InitialNode_3064_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isDataStoreNode_3065(DataStoreNode domainElement) {
		if (DataStoreNode_3065_Constraint == null) { // lazy initialization
			DataStoreNode_3065_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getDataStoreNode()); //$NON-NLS-1$
		}
		Object result = DataStoreNode_3065_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCentralBufferNode_3066(CentralBufferNode domainElement) {
		if (CentralBufferNode_3066_Constraint == null) { // lazy initialization
			CentralBufferNode_3066_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getCentralBufferNode()); //$NON-NLS-1$
		}
		Object result = CentralBufferNode_3066_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isOpaqueAction_3067(OpaqueAction domainElement) {
		if (OpaqueAction_3067_Constraint == null) { // lazy initialization
			OpaqueAction_3067_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getOpaqueAction()); //$NON-NLS-1$
		}
		Object result = OpaqueAction_3067_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isFlowFinalNode_3068(FlowFinalNode domainElement) {
		if (FlowFinalNode_3068_Constraint == null) { // lazy initialization
			FlowFinalNode_3068_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getFlowFinalNode()); //$NON-NLS-1$
		}
		Object result = FlowFinalNode_3068_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isForkNode_3069(ForkNode domainElement) {
		if (ForkNode_3069_Constraint == null) { // lazy initialization
			ForkNode_3069_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getForkNode()); //$NON-NLS-1$
		}
		Object result = ForkNode_3069_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isJoinNode_3070(JoinNode domainElement) {
		if (JoinNode_3070_Constraint == null) { // lazy initialization
			JoinNode_3070_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getJoinNode()); //$NON-NLS-1$
		}
		Object result = JoinNode_3070_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isPin_3071(Pin domainElement) {
		if (Pin_3071_Constraint == null) { // lazy initialization
			Pin_3071_Constraint = UMLOCLFactory.getExpression(
					"(not self.oclIsTypeOf(uml::InputPin)) and (not self.oclIsTypeOf(uml::OutputPin)) and self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getPin()); //$NON-NLS-1$
		}
		Object result = Pin_3071_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCreateObjectAction_3072(CreateObjectAction domainElement) {
		if (CreateObjectAction_3072_Constraint == null) { // lazy initialization
			CreateObjectAction_3072_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getCreateObjectAction()); //$NON-NLS-1$
		}
		Object result = CreateObjectAction_3072_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isAddStructuralFeatureValueAction_3073(AddStructuralFeatureValueAction domainElement) {
		if (AddStructuralFeatureValueAction_3073_Constraint == null) { // lazy initialization
			AddStructuralFeatureValueAction_3073_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction()); //$NON-NLS-1$
		}
		Object result = AddStructuralFeatureValueAction_3073_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCallBehaviorAction_3074(CallBehaviorAction domainElement) {
		if (CallBehaviorAction_3074_Constraint == null) { // lazy initialization
			CallBehaviorAction_3074_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getCallBehaviorAction()); //$NON-NLS-1$
		}
		Object result = CallBehaviorAction_3074_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isCallOperationAction_3075(CallOperationAction domainElement) {
		if (CallOperationAction_3075_Constraint == null) { // lazy initialization
			CallOperationAction_3075_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getCallOperationAction()); //$NON-NLS-1$
		}
		Object result = CallOperationAction_3075_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isStructuredActivityNode_3076(StructuredActivityNode domainElement) {
		if (StructuredActivityNode_3076_Constraint == null) { // lazy initialization
			StructuredActivityNode_3076_Constraint = UMLOCLFactory
					.getExpression(
							"not self.oclIsTypeOf(uml::LoopNode) and not self.oclIsTypeOf(uml::ConditionalNode) and not self.oclIsTypeOf(uml::ExpansionRegion) and self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getStructuredActivityNode()); //$NON-NLS-1$
		}
		Object result = StructuredActivityNode_3076_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isStructuredActivityNode_3079(StructuredActivityNode domainElement) {
		if (StructuredActivityNode_3079_Constraint == null) { // lazy initialization
			StructuredActivityNode_3079_Constraint = UMLOCLFactory
					.getExpression(
							"not self.oclIsTypeOf(uml::LoopNode) and not self.oclIsTypeOf(uml::ConditionalNode) and not self.oclIsTypeOf(uml::ExpansionRegion) and self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getStructuredActivityNode()); //$NON-NLS-1$
		}
		Object result = StructuredActivityNode_3079_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isSendSignalAction_3077(SendSignalAction domainElement) {
		if (SendSignalAction_3077_Constraint == null) { // lazy initialization
			SendSignalAction_3077_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getSendSignalAction()); //$NON-NLS-1$
		}
		Object result = SendSignalAction_3077_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLoopNode_3078(LoopNode domainElement) {
		if (LoopNode_3078_Constraint == null) { // lazy initialization
			LoopNode_3078_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getLoopNode()); //$NON-NLS-1$
		}
		Object result = LoopNode_3078_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConditionalNode_3083(ConditionalNode domainElement) {
		if (ConditionalNode_3083_Constraint == null) { // lazy initialization
			ConditionalNode_3083_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getConditionalNode()); //$NON-NLS-1$
		}
		Object result = ConditionalNode_3083_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isExpansionRegion_3085(ExpansionRegion domainElement) {
		if (ExpansionRegion_3085_Constraint == null) { // lazy initialization
			ExpansionRegion_3085_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getExpansionRegion()); //$NON-NLS-1$
		}
		Object result = ExpansionRegion_3085_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isLoopNode_3058(LoopNode domainElement) {
		if (LoopNode_3058_Constraint == null) { // lazy initialization
			LoopNode_3058_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getLoopNode()); //$NON-NLS-1$
		}
		Object result = LoopNode_3058_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isConditionalNode_3082(ConditionalNode domainElement) {
		if (ConditionalNode_3082_Constraint == null) { // lazy initialization
			ConditionalNode_3082_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getConditionalNode()); //$NON-NLS-1$
		}
		Object result = ConditionalNode_3082_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static boolean isExpansionRegion_3084(ExpansionRegion domainElement) {
		if (ExpansionRegion_3084_Constraint == null) { // lazy initialization
			ExpansionRegion_3084_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getExpansionRegion()); //$NON-NLS-1$
		}
		Object result = ExpansionRegion_3084_Constraint.evaluate(domainElement);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	protected static boolean hasViewChild(View containerView, EObject domainElement, int visualId) {
		if (containerView == null) {
			return false;
		}
		if (domainElement == null) {
			return false;
		}
		for (Object next : containerView.getChildren()) {
			View nextView = (View) next;
			if (domainElement.equals(nextView.getElement()) && getType(visualId).equals(nextView.getType())) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static int getChildDescriptorVisualID(UMLNodeDescriptor container, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		switch (container.getVisualID()) {
		case ActivityEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3030((AcceptEventAction) domainElement)) {
				return AcceptEventActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3031((AcceptEventAction) domainElement)) {
				return AcceptEventAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3032((ActivityFinalNode) domainElement)) {
				return ActivityFinalNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3033((DecisionNode) domainElement)) {
				return DecisionNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && isMergeNode_3034((MergeNode) domainElement)) {
				return MergeNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && isInitialNode_3035((InitialNode) domainElement)) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3036((DataStoreNode) domainElement)) {
				return DataStoreNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3037((CentralBufferNode) domainElement)) {
				return CentralBufferNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3029((OpaqueAction) domainElement)) {
				return OpaqueActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3038((FlowFinalNode) domainElement)) {
				return FlowFinalNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3039((ForkNode) domainElement)) {
				return ForkNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3040((JoinNode) domainElement)) {
				return JoinNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3041((Pin) domainElement)) {
				return PinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3042((CreateObjectAction) domainElement)) {
				return CreateObjectActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3043((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3044((CallBehaviorAction) domainElement)) {
				return CallBehaviorActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3045((CallOperationAction) domainElement)) {
				return CallOperationActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3046((StructuredActivityNode) domainElement)) {
				return StructuredActivityNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
				return OpaqueBehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityParameterNode().isSuperTypeOf(domainElement.eClass())) {
				return ActivityParameterNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && isSendSignalAction_3053((SendSignalAction) domainElement)) {
				return SendSignalActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartitionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && isLoopNode_3058((LoopNode) domainElement)) {
				return LoopNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConditionalNode().isSuperTypeOf(domainElement.eClass()) && isConditionalNode_3082((ConditionalNode) domainElement)) {
				return ConditionalNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExpansionRegion().isSuperTypeOf(domainElement.eClass()) && isExpansionRegion_3084((ExpansionRegion) domainElement)) {
				return ExpansionRegionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getParameterSet().isSuperTypeOf(domainElement.eClass())) {
				return ParameterSetEditPart.VISUAL_ID;
			}
			break;
		case ConstraintEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElement.eClass())) {
				return LiteralStringEditPart.VISUAL_ID;
			}
			break;
		case Constraint2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElement.eClass())) {
				return LiteralString2EditPart.VISUAL_ID;
			}
			break;
		case OpaqueActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPinEditPart.VISUAL_ID;
			}
			break;
		case CreateObjectActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin2EditPart.VISUAL_ID;
			}
			break;
		case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin3EditPart.VISUAL_ID;
			}
			break;
		case CallBehaviorActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			break;
		case CallOperationActionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin5EditPart.VISUAL_ID;
			}
			break;
		case StructuredActivityNodeEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case StructuredActivityNode2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case OpaqueAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPinEditPart.VISUAL_ID;
			}
			break;
		case CreateObjectAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin2EditPart.VISUAL_ID;
			}
			break;
		case CallBehaviorAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			break;
		case CallOperationAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin5EditPart.VISUAL_ID;
			}
			break;
		case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin3EditPart.VISUAL_ID;
			}
			break;
		case ActivityPartitionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartition2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3059((AcceptEventAction) domainElement)) {
				return AcceptEventAction5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3060((AcceptEventAction) domainElement)) {
				return AcceptEventAction6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3061((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3062((DecisionNode) domainElement)) {
				return DecisionNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && isMergeNode_3063((MergeNode) domainElement)) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && isInitialNode_3064((InitialNode) domainElement)) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3065((DataStoreNode) domainElement)) {
				return DataStoreNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3066((CentralBufferNode) domainElement)) {
				return CentralBufferNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3067((OpaqueAction) domainElement)) {
				return OpaqueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3068((FlowFinalNode) domainElement)) {
				return FlowFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3069((ForkNode) domainElement)) {
				return ForkNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3070((JoinNode) domainElement)) {
				return JoinNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3071((Pin) domainElement)) {
				return Pin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3072((CreateObjectAction) domainElement)) {
				return CreateObjectAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3073((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3074((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3075((CallOperationAction) domainElement)) {
				return CallOperationAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3076((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && isSendSignalAction_3077((SendSignalAction) domainElement)) {
				return SendSignalAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && isLoopNode_3078((LoopNode) domainElement)) {
				return LoopNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConditionalNode().isSuperTypeOf(domainElement.eClass()) && isConditionalNode_3083((ConditionalNode) domainElement)) {
				return ConditionalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExpansionRegion().isSuperTypeOf(domainElement.eClass()) && isExpansionRegion_3085((ExpansionRegion) domainElement)) {
				return ExpansionRegion2EditPart.VISUAL_ID;
			}
			break;
		case ActivityPartition2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartition2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3059((AcceptEventAction) domainElement)) {
				return AcceptEventAction5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3060((AcceptEventAction) domainElement)) {
				return AcceptEventAction6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3061((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3062((DecisionNode) domainElement)) {
				return DecisionNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && isMergeNode_3063((MergeNode) domainElement)) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && isInitialNode_3064((InitialNode) domainElement)) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3065((DataStoreNode) domainElement)) {
				return DataStoreNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3066((CentralBufferNode) domainElement)) {
				return CentralBufferNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3067((OpaqueAction) domainElement)) {
				return OpaqueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3068((FlowFinalNode) domainElement)) {
				return FlowFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3069((ForkNode) domainElement)) {
				return ForkNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3070((JoinNode) domainElement)) {
				return JoinNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3071((Pin) domainElement)) {
				return Pin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3072((CreateObjectAction) domainElement)) {
				return CreateObjectAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3073((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3074((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3075((CallOperationAction) domainElement)) {
				return CallOperationAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3076((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && isSendSignalAction_3077((SendSignalAction) domainElement)) {
				return SendSignalAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && isLoopNode_3078((LoopNode) domainElement)) {
				return LoopNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConditionalNode().isSuperTypeOf(domainElement.eClass()) && isConditionalNode_3083((ConditionalNode) domainElement)) {
				return ConditionalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getExpansionRegion().isSuperTypeOf(domainElement.eClass()) && isExpansionRegion_3085((ExpansionRegion) domainElement)) {
				return ExpansionRegion2EditPart.VISUAL_ID;
			}
			break;
		case OpaqueAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPinEditPart.VISUAL_ID;
			}
			break;
		case CreateObjectAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin2EditPart.VISUAL_ID;
			}
			break;
		case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin3EditPart.VISUAL_ID;
			}
			break;
		case CallBehaviorAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			break;
		case CallOperationAction3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin5EditPart.VISUAL_ID;
			}
			break;
		case StructuredActivityNode3EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3079((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin5EditPart.VISUAL_ID;
			}
			break;
		case StructuredActivityNode4EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3079((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin5EditPart.VISUAL_ID;
			}
			break;
		case LoopNode2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ConditionalNode2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ExpansionRegion2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case LoopNodeEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ConditionalNodeEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ExpansionRegionEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			break;
		case ParameterSetEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getParameter().isSuperTypeOf(domainElement.eClass())) {
				return ParameterEditPart.VISUAL_ID;
			}
			break;
		case PackageEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getActivity().isSuperTypeOf(domainElement.eClass())) {
				return ActivityEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass()) && isConstraint_2027((Constraint) domainElement)) {
				return ConstraintEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass()) && isConstraint_2028((Constraint) domainElement)) {
				return Constraint2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3079((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3079((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin7EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && isStructuredActivityNode_3009((StructuredActivityNode) domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && isOpaqueAction_3011((OpaqueAction) domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3012((AcceptEventAction) domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && isAcceptEventAction_3013((AcceptEventAction) domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && isActivityFinalNode_3014((ActivityFinalNode) domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && isDecisionNode_3015((DecisionNode) domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && isFlowFinalNode_3016((FlowFinalNode) domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && isPin_3017((Pin) domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && isCreateObjectAction_3018((CreateObjectAction) domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && isCallBehaviorAction_3019((CallBehaviorAction) domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && isCallOperationAction_3020((CallOperationAction) domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && isForkNode_3021((ForkNode) domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && isJoinNode_3022((JoinNode) domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass())
					&& isAddStructuralFeatureValueAction_3023((AddStructuralFeatureValueAction) domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && isDataStoreNode_3024((DataStoreNode) domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && isCentralBufferNode_3025((CentralBufferNode) domainElement)) {
				return CentralBufferNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInputPin().isSuperTypeOf(domainElement.eClass())) {
				return InputPin6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOutputPin().isSuperTypeOf(domainElement.eClass())) {
				return OutputPin4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElement.eClass())) {
				return LiteralStringEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLiteralString().isSuperTypeOf(domainElement.eClass())) {
				return LiteralString2EditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	 * @generated
	 */
	protected static boolean canSubstitute(int visualId, int substituteCandidate) {
		if (visualId == substituteCandidate) {
			return true;
		}
		switch (visualId) {
		case ConstraintEditPart.VISUAL_ID:
			return (substituteCandidate == Constraint2EditPart.VISUAL_ID);
		case Constraint2EditPart.VISUAL_ID:
			return (substituteCandidate == ConstraintEditPart.VISUAL_ID);

		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate || canSubstitute(basic, candidate);
	}

	/**
	 * @generated
	 */
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
		case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
		case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
		case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
		case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
		case ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID:
		case ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID:
		case LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID:
		case ConditionalNodeConditionalNodeCompartmentEditPart.VISUAL_ID:
		case ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID:
		case ConstraintPreconditionEditPart.VISUAL_ID:
		case ConstraintPostconditionEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case ConstraintEditPart.VISUAL_ID:
		case Constraint2EditPart.VISUAL_ID:
		case AcceptEventActionEditPart.VISUAL_ID:
		case AcceptEventAction2EditPart.VISUAL_ID:
		case ActivityFinalNodeEditPart.VISUAL_ID:
		case DecisionNodeEditPart.VISUAL_ID:
		case MergeNodeEditPart.VISUAL_ID:
		case InitialNodeEditPart.VISUAL_ID:
		case DataStoreNodeEditPart.VISUAL_ID:
		case CentralBufferNodeEditPart.VISUAL_ID:
		case OutputPinEditPart.VISUAL_ID:
		case FlowFinalNodeEditPart.VISUAL_ID:
		case ForkNodeEditPart.VISUAL_ID:
		case JoinNodeEditPart.VISUAL_ID:
		case PinEditPart.VISUAL_ID:
		case OutputPin2EditPart.VISUAL_ID:
		case InputPinEditPart.VISUAL_ID:
		case InputPin2EditPart.VISUAL_ID:
		case InputPin3EditPart.VISUAL_ID:
		case OutputPin3EditPart.VISUAL_ID:
		case InputPin4EditPart.VISUAL_ID:
		case InputPin5EditPart.VISUAL_ID:
		case StructuredActivityNodeEditPart.VISUAL_ID:
		case StructuredActivityNode2EditPart.VISUAL_ID:
		case AcceptEventAction3EditPart.VISUAL_ID:
		case AcceptEventAction4EditPart.VISUAL_ID:
		case ActivityFinalNode2EditPart.VISUAL_ID:
		case DecisionNode2EditPart.VISUAL_ID:
		case FlowFinalNode2EditPart.VISUAL_ID:
		case Pin2EditPart.VISUAL_ID:
		case ForkNode2EditPart.VISUAL_ID:
		case JoinNode2EditPart.VISUAL_ID:
		case DataStoreNode2EditPart.VISUAL_ID:
		case CentralBufferNode2EditPart.VISUAL_ID:
		case InputPin6EditPart.VISUAL_ID:
		case OutputPin4EditPart.VISUAL_ID:
		case OpaqueBehaviorEditPart.VISUAL_ID:
		case ActivityParameterNodeEditPart.VISUAL_ID:
		case SendSignalActionEditPart.VISUAL_ID:
		case AcceptEventAction5EditPart.VISUAL_ID:
		case AcceptEventAction6EditPart.VISUAL_ID:
		case ActivityFinalNode3EditPart.VISUAL_ID:
		case DecisionNode3EditPart.VISUAL_ID:
		case MergeNode2EditPart.VISUAL_ID:
		case InitialNode2EditPart.VISUAL_ID:
		case DataStoreNode3EditPart.VISUAL_ID:
		case CentralBufferNode3EditPart.VISUAL_ID:
		case FlowFinalNode3EditPart.VISUAL_ID:
		case ForkNode3EditPart.VISUAL_ID:
		case JoinNode3EditPart.VISUAL_ID:
		case Pin3EditPart.VISUAL_ID:
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
		case ParameterEditPart.VISUAL_ID:
		case LiteralStringEditPart.VISUAL_ID:
		case LiteralString2EditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	 * @generated
	 */
	public static final IVisualIDRegistry TYPED_ADAPTER = new IVisualIDRegistry() {

		/**
		 * @generated
		 */
		public String getModelID(View view) {
			return org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.getModelID(view);
		}

		/**
		 * @generated
		 */
		public int getVisualID(View view) {
			return org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.getVisualID(view);
		}

		/**
		 * @generated
		 */
		public int getNodeVisualID(View containerView, EObject domainElement) {
			return org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.getNodeVisualID(containerView, domainElement);
		}

		/**
		 * @generated
		 */
		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.checkNodeVisualID(containerView, domainElement, candidate);
		}

		/**
		 * @generated
		 */
		public boolean isCompartmentVisualID(int visualID) {
			return org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		 * @generated
		 */
		public boolean isSemanticLeafVisualID(int visualID) {
			return org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}

		/**
		 * @generated
		 */
		public boolean isShortcutDescendant(View view) {
			return org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry.isShortcutDescendant(view);
		}

	};

	/**
	 * @generated
	 */
	public static boolean isShortcutDescendant(View view) {
		View diagram = view.getDiagram();
		while (view != diagram && view != null) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return true;
			}
			view = (View) view.eContainer();
		}
		return false;
	}

}
