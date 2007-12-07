package org.eclipse.uml2.diagram.activity.part;

import java.util.Iterator;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.parts.*;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionName4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityNameEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeNameEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.ControlFlowNameEditPart;
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
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectFlowNameEditPart;
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
import org.eclipse.uml2.diagram.activity.expressions.UMLAbstractExpression;
import org.eclipse.uml2.diagram.activity.expressions.UMLOCLFactory;
import org.eclipse.uml2.uml.Action;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Package;
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
	private static final UMLAbstractExpression AcceptEventAction_3030_Constraint = UMLOCLFactory.getExpression(
			"(self.trigger->isEmpty() or (not self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression AcceptEventAction_3031_Constraint = UMLOCLFactory.getExpression(
			"(not self.trigger->isEmpty()) and (self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent))) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ActivityFinalNode_3032_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getActivityFinalNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression DecisionNode_3033_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getDecisionNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression MergeNode_3034_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getMergeNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression InitialNode_3035_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getInitialNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression DataStoreNode_3036_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getDataStoreNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CentralBufferNode_3037_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCentralBufferNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression OpaqueAction_3029_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getOpaqueAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression FlowFinalNode_3038_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getFlowFinalNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ForkNode_3039_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getForkNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression JoinNode_3040_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getJoinNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pin_3041_Constraint = UMLOCLFactory.getExpression(
			"(not self.oclIsTypeOf(uml::InputPin)) and (not self.oclIsTypeOf(uml::OutputPin)) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getPin());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CreateObjectAction_3042_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCreateObjectAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression AddStructuralFeatureValueAction_3043_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE
			.getAddStructuralFeatureValueAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CallBehaviorAction_3044_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCallBehaviorAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CallOperationAction_3045_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCallOperationAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression StructuredActivityNode_3046_Constraint = UMLOCLFactory.getExpression("not self.oclIsTypeOf(uml::LoopNode) and self.inPartition->isEmpty()",
			UMLPackage.eINSTANCE.getStructuredActivityNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression StructuredActivityNode_3009_Constraint = UMLOCLFactory.getExpression("not self.oclIsTypeOf(uml::LoopNode) and self.inPartition->isEmpty()",
			UMLPackage.eINSTANCE.getStructuredActivityNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression OpaqueAction_3011_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getOpaqueAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression AcceptEventAction_3012_Constraint = UMLOCLFactory.getExpression(
			"(self.trigger->isEmpty() or (not self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression AcceptEventAction_3013_Constraint = UMLOCLFactory.getExpression(
			"(not self.trigger->isEmpty()) and (self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent))) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ActivityFinalNode_3014_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getActivityFinalNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression DecisionNode_3015_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getDecisionNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression FlowFinalNode_3016_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getFlowFinalNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pin_3017_Constraint = UMLOCLFactory.getExpression(
			"(not self.oclIsTypeOf(uml::InputPin)) and (not self.oclIsTypeOf(uml::OutputPin)) and self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getPin());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CreateObjectAction_3018_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCreateObjectAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CallBehaviorAction_3019_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCallBehaviorAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CallOperationAction_3020_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCallOperationAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ForkNode_3021_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getForkNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression JoinNode_3022_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getJoinNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression AddStructuralFeatureValueAction_3023_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE
			.getAddStructuralFeatureValueAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression DataStoreNode_3024_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getDataStoreNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CentralBufferNode_3025_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getCentralBufferNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression SendSignalAction_3053_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getSendSignalAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression AcceptEventAction_3059_Constraint = UMLOCLFactory.getExpression(
			"(self.trigger->isEmpty() or (not self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent)))) and self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression AcceptEventAction_3060_Constraint = UMLOCLFactory.getExpression(
			"(not self.trigger->isEmpty()) and (self.trigger->forAll(tr | tr.event.oclIsKindOf(uml::TimeEvent))) and self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getAcceptEventAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ActivityFinalNode_3061_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getActivityFinalNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression DecisionNode_3062_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getDecisionNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression MergeNode_3063_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getMergeNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression InitialNode_3064_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getInitialNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression DataStoreNode_3065_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getDataStoreNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CentralBufferNode_3066_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getCentralBufferNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression OpaqueAction_3067_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getOpaqueAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression FlowFinalNode_3068_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getFlowFinalNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression ForkNode_3069_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getForkNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression JoinNode_3070_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getJoinNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression Pin_3071_Constraint = UMLOCLFactory.getExpression(
			"(not self.oclIsTypeOf(uml::InputPin)) and (not self.oclIsTypeOf(uml::OutputPin)) and self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getPin());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CreateObjectAction_3072_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getCreateObjectAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression AddStructuralFeatureValueAction_3073_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE
			.getAddStructuralFeatureValueAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CallBehaviorAction_3074_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getCallBehaviorAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression CallOperationAction_3075_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getCallOperationAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression StructuredActivityNode_3076_Constraint = UMLOCLFactory.getExpression("not self.oclIsTypeOf(uml::LoopNode) and self.inPartition->notEmpty()",
			UMLPackage.eINSTANCE.getStructuredActivityNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression StructuredActivityNode_3079_Constraint = UMLOCLFactory.getExpression("not self.oclIsTypeOf(uml::LoopNode) and self.inPartition->notEmpty()",
			UMLPackage.eINSTANCE.getStructuredActivityNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression SendSignalAction_3077_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getSendSignalAction());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression LoopNode_3078_Constraint = UMLOCLFactory.getExpression("self.inPartition->notEmpty()", UMLPackage.eINSTANCE.getLoopNode());

	/**
	 * @generated
	 */
	private static final UMLAbstractExpression LoopNode_3058_Constraint = UMLOCLFactory.getExpression("self.inPartition->isEmpty()", UMLPackage.eINSTANCE.getLoopNode());

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
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3030_Constraint, domainElement)) {
				return AcceptEventActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3031_Constraint, domainElement)) {
				return AcceptEventAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3032_Constraint, domainElement)) {
				return ActivityFinalNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3033_Constraint, domainElement)) {
				return DecisionNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && evaluate(MergeNode_3034_Constraint, domainElement)) {
				return MergeNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && evaluate(InitialNode_3035_Constraint, domainElement)) {
				return InitialNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3036_Constraint, domainElement)) {
				return DataStoreNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3037_Constraint, domainElement)) {
				return CentralBufferNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3029_Constraint, domainElement)) {
				return OpaqueActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3038_Constraint, domainElement)) {
				return FlowFinalNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3039_Constraint, domainElement)) {
				return ForkNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3040_Constraint, domainElement)) {
				return JoinNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3041_Constraint, domainElement)) {
				return PinEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3042_Constraint, domainElement)) {
				return CreateObjectActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3043_Constraint, domainElement)) {
				return AddStructuralFeatureValueActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3044_Constraint, domainElement)) {
				return CallBehaviorActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3045_Constraint, domainElement)) {
				return CallOperationActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3046_Constraint, domainElement)) {
				return StructuredActivityNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueBehavior().isSuperTypeOf(domainElement.eClass())) {
				return OpaqueBehaviorEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityParameterNode().isSuperTypeOf(domainElement.eClass())) {
				return ActivityParameterNodeEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && evaluate(SendSignalAction_3053_Constraint, domainElement)) {
				return SendSignalActionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartitionEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && evaluate(LoopNode_3058_Constraint, domainElement)) {
				return LoopNodeEditPart.VISUAL_ID;
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
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3059_Constraint, domainElement)) {
				return AcceptEventAction5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3060_Constraint, domainElement)) {
				return AcceptEventAction6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3061_Constraint, domainElement)) {
				return ActivityFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3062_Constraint, domainElement)) {
				return DecisionNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && evaluate(MergeNode_3063_Constraint, domainElement)) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && evaluate(InitialNode_3064_Constraint, domainElement)) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3065_Constraint, domainElement)) {
				return DataStoreNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3066_Constraint, domainElement)) {
				return CentralBufferNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3067_Constraint, domainElement)) {
				return OpaqueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3068_Constraint, domainElement)) {
				return FlowFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3069_Constraint, domainElement)) {
				return ForkNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3070_Constraint, domainElement)) {
				return JoinNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3071_Constraint, domainElement)) {
				return Pin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3072_Constraint, domainElement)) {
				return CreateObjectAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3073_Constraint, domainElement)) {
				return AddStructuralFeatureValueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3074_Constraint, domainElement)) {
				return CallBehaviorAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3075_Constraint, domainElement)) {
				return CallOperationAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3076_Constraint, domainElement)) {
				return StructuredActivityNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && evaluate(SendSignalAction_3077_Constraint, domainElement)) {
				return SendSignalAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && evaluate(LoopNode_3078_Constraint, domainElement)) {
				return LoopNode2EditPart.VISUAL_ID;
			}
			break;
		case ActivityPartition2EditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getActivityPartition().isSuperTypeOf(domainElement.eClass())) {
				return ActivityPartition2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3059_Constraint, domainElement)) {
				return AcceptEventAction5EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3060_Constraint, domainElement)) {
				return AcceptEventAction6EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3061_Constraint, domainElement)) {
				return ActivityFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3062_Constraint, domainElement)) {
				return DecisionNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getMergeNode().isSuperTypeOf(domainElement.eClass()) && evaluate(MergeNode_3063_Constraint, domainElement)) {
				return MergeNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getInitialNode().isSuperTypeOf(domainElement.eClass()) && evaluate(InitialNode_3064_Constraint, domainElement)) {
				return InitialNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3065_Constraint, domainElement)) {
				return DataStoreNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3066_Constraint, domainElement)) {
				return CentralBufferNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3067_Constraint, domainElement)) {
				return OpaqueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3068_Constraint, domainElement)) {
				return FlowFinalNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3069_Constraint, domainElement)) {
				return ForkNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3070_Constraint, domainElement)) {
				return JoinNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3071_Constraint, domainElement)) {
				return Pin3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3072_Constraint, domainElement)) {
				return CreateObjectAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3073_Constraint, domainElement)) {
				return AddStructuralFeatureValueAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3074_Constraint, domainElement)) {
				return CallBehaviorAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3075_Constraint, domainElement)) {
				return CallOperationAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3076_Constraint, domainElement)) {
				return StructuredActivityNode3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getSendSignalAction().isSuperTypeOf(domainElement.eClass()) && evaluate(SendSignalAction_3077_Constraint, domainElement)) {
				return SendSignalAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getLoopNode().isSuperTypeOf(domainElement.eClass()) && evaluate(LoopNode_3078_Constraint, domainElement)) {
				return LoopNode2EditPart.VISUAL_ID;
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
		case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3009_Constraint, domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3011_Constraint, domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3012_Constraint, domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3013_Constraint, domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3014_Constraint, domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3015_Constraint, domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3016_Constraint, domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3017_Constraint, domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3018_Constraint, domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3019_Constraint, domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3020_Constraint, domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3021_Constraint, domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3022_Constraint, domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3023_Constraint, domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3024_Constraint, domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3025_Constraint, domainElement)) {
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
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3009_Constraint, domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3011_Constraint, domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3012_Constraint, domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3013_Constraint, domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3014_Constraint, domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3015_Constraint, domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3016_Constraint, domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3017_Constraint, domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3018_Constraint, domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3019_Constraint, domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3020_Constraint, domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3021_Constraint, domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3022_Constraint, domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3023_Constraint, domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3024_Constraint, domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3025_Constraint, domainElement)) {
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
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3079_Constraint, domainElement)) {
				return StructuredActivityNode4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3011_Constraint, domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3012_Constraint, domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3013_Constraint, domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3014_Constraint, domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3015_Constraint, domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3016_Constraint, domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3017_Constraint, domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3018_Constraint, domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3019_Constraint, domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3020_Constraint, domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3021_Constraint, domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3022_Constraint, domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3023_Constraint, domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3024_Constraint, domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3025_Constraint, domainElement)) {
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
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3079_Constraint, domainElement)) {
				return StructuredActivityNode4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3011_Constraint, domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3012_Constraint, domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3013_Constraint, domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3014_Constraint, domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3015_Constraint, domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3016_Constraint, domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3017_Constraint, domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3018_Constraint, domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3019_Constraint, domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3020_Constraint, domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3021_Constraint, domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3022_Constraint, domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3023_Constraint, domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3024_Constraint, domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3025_Constraint, domainElement)) {
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
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3009_Constraint, domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3011_Constraint, domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3012_Constraint, domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3013_Constraint, domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3014_Constraint, domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3015_Constraint, domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3016_Constraint, domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3017_Constraint, domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3018_Constraint, domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3019_Constraint, domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3020_Constraint, domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3021_Constraint, domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3022_Constraint, domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3023_Constraint, domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3024_Constraint, domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3025_Constraint, domainElement)) {
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
			if (UMLPackage.eINSTANCE.getStructuredActivityNode().isSuperTypeOf(domainElement.eClass()) && evaluate(StructuredActivityNode_3009_Constraint, domainElement)) {
				return StructuredActivityNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getOpaqueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(OpaqueAction_3011_Constraint, domainElement)) {
				return OpaqueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3012_Constraint, domainElement)) {
				return AcceptEventAction3EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAcceptEventAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AcceptEventAction_3013_Constraint, domainElement)) {
				return AcceptEventAction4EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getActivityFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ActivityFinalNode_3014_Constraint, domainElement)) {
				return ActivityFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDecisionNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DecisionNode_3015_Constraint, domainElement)) {
				return DecisionNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getFlowFinalNode().isSuperTypeOf(domainElement.eClass()) && evaluate(FlowFinalNode_3016_Constraint, domainElement)) {
				return FlowFinalNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getPin().isSuperTypeOf(domainElement.eClass()) && evaluate(Pin_3017_Constraint, domainElement)) {
				return Pin2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCreateObjectAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CreateObjectAction_3018_Constraint, domainElement)) {
				return CreateObjectAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallBehaviorAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallBehaviorAction_3019_Constraint, domainElement)) {
				return CallBehaviorAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCallOperationAction().isSuperTypeOf(domainElement.eClass()) && evaluate(CallOperationAction_3020_Constraint, domainElement)) {
				return CallOperationAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getForkNode().isSuperTypeOf(domainElement.eClass()) && evaluate(ForkNode_3021_Constraint, domainElement)) {
				return ForkNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getJoinNode().isSuperTypeOf(domainElement.eClass()) && evaluate(JoinNode_3022_Constraint, domainElement)) {
				return JoinNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getAddStructuralFeatureValueAction().isSuperTypeOf(domainElement.eClass()) && evaluate(AddStructuralFeatureValueAction_3023_Constraint, domainElement)) {
				return AddStructuralFeatureValueAction2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getDataStoreNode().isSuperTypeOf(domainElement.eClass()) && evaluate(DataStoreNode_3024_Constraint, domainElement)) {
				return DataStoreNode2EditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getCentralBufferNode().isSuperTypeOf(domainElement.eClass()) && evaluate(CentralBufferNode_3025_Constraint, domainElement)) {
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
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass()) && JavaConstraints.isLocalPrecondition((Constraint) domainElement).booleanValue()) {
				return ConstraintEditPart.VISUAL_ID;
			}
			if (UMLPackage.eINSTANCE.getConstraint().isSuperTypeOf(domainElement.eClass()) && JavaConstraints.isLocalPostcondition((Constraint) domainElement).booleanValue()) {
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
			if (StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case StructuredActivityNode2EditPart.VISUAL_ID:
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
		case LoopNodeEditPart.VISUAL_ID:
			if (LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID == nodeVisualID) {
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
	 * @generated
	 */
	private static boolean evaluate(UMLAbstractExpression expression, Object element) {
		Object result = expression.evaluate(element);
		return result instanceof Boolean && ((Boolean) result).booleanValue();
	}

	/**
	 * @generated
	 */
	private static class JavaConstraints {

		/**
		 * @generated NOT
		 */
		private static java.lang.Boolean isLocalPrecondition(Constraint self) {
			Element owner = self.getOwner();
			if (owner instanceof Action) {
				EList<Constraint> preconditions = ((Action) owner).getLocalPreconditions();
				for (Iterator<Constraint> pcIterator = preconditions.iterator(); pcIterator.hasNext();) {
					if (self.equals(pcIterator.next())) {
						return Boolean.TRUE;
					}
				}
			}
			return Boolean.FALSE;
		}

		/**
		 * @generated NOT
		 */
		private static java.lang.Boolean isLocalPostcondition(Constraint self) {
			Element owner = self.getOwner();
			if (owner instanceof Action) {
				EList<Constraint> postconditions = ((Action) owner).getLocalPostconditions();
				for (Iterator<Constraint> pcIterator = postconditions.iterator(); pcIterator.hasNext();) {
					if (self.equals(pcIterator.next())) {
						return Boolean.TRUE;
					}
				}
			}
			return Boolean.FALSE;
		}

	}

	/**
	 * @generated
	 */
	protected static boolean hasViewChild(View containerView, EObject domainElement, int visualId) {
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

}
