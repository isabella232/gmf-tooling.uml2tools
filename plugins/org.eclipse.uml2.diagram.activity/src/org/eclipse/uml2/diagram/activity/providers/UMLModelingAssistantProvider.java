package org.eclipse.uml2.diagram.activity.providers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.modelingassistant.ModelingAssistantProvider;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction_insertAt_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction_object_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction_value_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallAction_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallAction_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeConditionalNodeCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeConditionalNodeCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Constraint2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegion2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionExpansionRegionNodeCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionExpansionRegionNodeCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeLoopNodeContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeLoopNodeContentPaneCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin6EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ParameterSetEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AcceptTimeEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_StructuredActivityNode_InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode_StructuredActivityNode_OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ValueSpecificationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ValueSpecificationActionEditPart;
import org.eclipse.uml2.diagram.activity.part.Messages;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin;

/**
 * @generated
 */

public class UMLModelingAssistantProvider extends ModelingAssistantProvider {

	/**
	 * @generated
	 */
	public List<?> getTypesForPopupBar(IAdaptable host) {
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);

		if (editPart instanceof ActivityEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.AcceptEventAction_3030);
			types.add(UMLElementTypes.AcceptEventAction_3031);
			types.add(UMLElementTypes.ActivityFinalNode_3032);
			types.add(UMLElementTypes.DecisionNode_3033);
			types.add(UMLElementTypes.MergeNode_3034);
			types.add(UMLElementTypes.InitialNode_3035);
			types.add(UMLElementTypes.DataStoreNode_3036);
			types.add(UMLElementTypes.CentralBufferNode_3037);
			types.add(UMLElementTypes.OpaqueAction_3029);
			types.add(UMLElementTypes.FlowFinalNode_3038);
			types.add(UMLElementTypes.ForkNode_3039);
			types.add(UMLElementTypes.JoinNode_3040);
			types.add(UMLElementTypes.Pin_3041);
			types.add(UMLElementTypes.CreateObjectAction_3042);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
			types.add(UMLElementTypes.CallBehaviorAction_3044);
			types.add(UMLElementTypes.CallOperationAction_3045);
			types.add(UMLElementTypes.StructuredActivityNode_3046);
			types.add(UMLElementTypes.OpaqueBehavior_3047);
			types.add(UMLElementTypes.ActivityParameterNode_3052);
			types.add(UMLElementTypes.SendSignalAction_3053);
			types.add(UMLElementTypes.ActivityPartition_3056);
			types.add(UMLElementTypes.LoopNode_3058);
			types.add(UMLElementTypes.ConditionalNode_3082);
			types.add(UMLElementTypes.ExpansionRegion_3084);
			types.add(UMLElementTypes.ParameterSet_3086);
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
			return types;
		}

		if (editPart instanceof ConstraintEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.LiteralString_3049);
			return types;
		}

		if (editPart instanceof Constraint2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.LiteralString_3051);
			return types;
		}

		if (editPart instanceof OpaqueActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3001);
			return types;
		}

		if (editPart instanceof CreateObjectActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3002);
			return types;
		}

		if (editPart instanceof AddStructuralFeatureValueActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.InputPin_3003);
			types.add(UMLElementTypes.InputPin_3004);
			types.add(UMLElementTypes.InputPin_3005);
			return types;
		}

		if (editPart instanceof CallBehaviorActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			return types;
		}

		if (editPart instanceof CallOperationActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			types.add(UMLElementTypes.InputPin_3008);
			return types;
		}

		if (editPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3001);
			return types;
		}

		if (editPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3002);
			return types;
		}

		if (editPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			return types;
		}

		if (editPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			types.add(UMLElementTypes.InputPin_3008);
			return types;
		}

		if (editPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.InputPin_3003);
			types.add(UMLElementTypes.InputPin_3004);
			types.add(UMLElementTypes.InputPin_3005);
			return types;
		}

		if (editPart instanceof ActivityPartitionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.ActivityPartition_3057);
			types.add(UMLElementTypes.AcceptEventAction_3059);
			types.add(UMLElementTypes.AcceptEventAction_3060);
			types.add(UMLElementTypes.ActivityFinalNode_3061);
			types.add(UMLElementTypes.DecisionNode_3062);
			types.add(UMLElementTypes.MergeNode_3063);
			types.add(UMLElementTypes.InitialNode_3064);
			types.add(UMLElementTypes.DataStoreNode_3065);
			types.add(UMLElementTypes.CentralBufferNode_3066);
			types.add(UMLElementTypes.OpaqueAction_3067);
			types.add(UMLElementTypes.FlowFinalNode_3068);
			types.add(UMLElementTypes.ForkNode_3069);
			types.add(UMLElementTypes.JoinNode_3070);
			types.add(UMLElementTypes.Pin_3071);
			types.add(UMLElementTypes.CreateObjectAction_3072);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
			types.add(UMLElementTypes.CallBehaviorAction_3074);
			types.add(UMLElementTypes.CallOperationAction_3075);
			types.add(UMLElementTypes.StructuredActivityNode_3076);
			types.add(UMLElementTypes.SendSignalAction_3077);
			types.add(UMLElementTypes.LoopNode_3078);
			types.add(UMLElementTypes.ConditionalNode_3083);
			types.add(UMLElementTypes.ExpansionRegion_3085);
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
			return types;
		}

		if (editPart instanceof ActivityPartition_ActivityPartitionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.ActivityPartition_3057);
			types.add(UMLElementTypes.AcceptEventAction_3059);
			types.add(UMLElementTypes.AcceptEventAction_3060);
			types.add(UMLElementTypes.ActivityFinalNode_3061);
			types.add(UMLElementTypes.DecisionNode_3062);
			types.add(UMLElementTypes.MergeNode_3063);
			types.add(UMLElementTypes.InitialNode_3064);
			types.add(UMLElementTypes.DataStoreNode_3065);
			types.add(UMLElementTypes.CentralBufferNode_3066);
			types.add(UMLElementTypes.OpaqueAction_3067);
			types.add(UMLElementTypes.FlowFinalNode_3068);
			types.add(UMLElementTypes.ForkNode_3069);
			types.add(UMLElementTypes.JoinNode_3070);
			types.add(UMLElementTypes.Pin_3071);
			types.add(UMLElementTypes.CreateObjectAction_3072);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
			types.add(UMLElementTypes.CallBehaviorAction_3074);
			types.add(UMLElementTypes.CallOperationAction_3075);
			types.add(UMLElementTypes.StructuredActivityNode_3076);
			types.add(UMLElementTypes.SendSignalAction_3077);
			types.add(UMLElementTypes.LoopNode_3078);
			types.add(UMLElementTypes.ConditionalNode_3083);
			types.add(UMLElementTypes.ExpansionRegion_3085);
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
			return types;
		}

		if (editPart instanceof ActivityPartition_OpaqueActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3001);
			return types;
		}

		if (editPart instanceof CreateObjectAction3EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3002);
			return types;
		}

		if (editPart instanceof AddStructuralFeatureValueAction3EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.InputPin_3003);
			types.add(UMLElementTypes.InputPin_3004);
			types.add(UMLElementTypes.InputPin_3005);
			return types;
		}

		if (editPart instanceof CallBehaviorAction3EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			return types;
		}

		if (editPart instanceof CallOperationAction3EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			types.add(UMLElementTypes.InputPin_3008);
			return types;
		}

		if (editPart instanceof ValueSpecificationActionEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3090);
			return types;
		}

		if (editPart instanceof ParameterSetEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.Parameter_3087);
			return types;
		}

		if (editPart instanceof ValueSpecificationAction2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3090);
			return types;
		}

		if (editPart instanceof StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			return types;
		}

		if (editPart instanceof StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			return types;
		}

		if (editPart instanceof StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3079);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3080);
			types.add(UMLElementTypes.OutputPin_3081);
			return types;
		}

		if (editPart instanceof StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3079);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3080);
			types.add(UMLElementTypes.OutputPin_3081);
			return types;
		}

		if (editPart instanceof LoopNodeLoopNodeContentPaneCompartment2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			return types;
		}

		if (editPart instanceof ConditionalNodeConditionalNodeCompartment2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			return types;
		}

		if (editPart instanceof ExpansionRegionExpansionRegionNodeCompartment2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			return types;
		}

		if (editPart instanceof LoopNodeLoopNodeContentPaneCompartmentEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			return types;
		}

		if (editPart instanceof ConditionalNodeConditionalNodeCompartmentEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			return types;
		}

		if (editPart instanceof ExpansionRegionExpansionRegionNodeCompartmentEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			return types;
		}

		if (editPart instanceof PackageEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.Activity_2026);
			types.add(UMLElementTypes.Constraint_2027);
			types.add(UMLElementTypes.Constraint_2028);
			return types;
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AcceptEventActionEditPart) {
			return ((AcceptEventActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AcceptTimeEventActionEditPart) {
			return ((AcceptTimeEventActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DecisionNodeEditPart) {
			return ((DecisionNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MergeNodeEditPart) {
			return ((MergeNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DataStoreNodeEditPart) {
			return ((DataStoreNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CentralBufferNodeEditPart) {
			return ((CentralBufferNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OpaqueActionEditPart) {
			return ((OpaqueActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OpaqueAction_OutputPinEditPart) {
			return ((OpaqueAction_OutputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForkNodeEditPart) {
			return ((ForkNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JoinNodeEditPart) {
			return ((JoinNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof PinEditPart) {
			return ((PinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CreateObjectActionEditPart) {
			return ((CreateObjectActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CreateObjectAction_OutputPinEditPart) {
			return ((CreateObjectAction_OutputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_insertAt_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_insertAt_InputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_value_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_value_InputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_object_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_object_InputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallAction_OutputPinEditPart) {
			return ((CallAction_OutputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallAction_InputPinEditPart) {
			return ((CallAction_InputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallOperationAction_InputPinEditPart) {
			return ((CallOperationAction_InputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNodeEditPart) {
			return ((StructuredActivityNode_StructuredActivityNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			return ((StructuredActivityNode_OpaqueActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_AcceptEventActionEditPart) {
			return ((StructuredActivityNode_AcceptEventActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_AcceptTimeEventActionEditPart) {
			return ((StructuredActivityNode_AcceptTimeEventActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_ActivityFinalNodeEditPart) {
			return ((StructuredActivityNode_ActivityFinalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_DecisionNodeEditPart) {
			return ((StructuredActivityNode_DecisionNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_FlowFinalNodeEditPart) {
			return ((StructuredActivityNode_FlowFinalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_PinEditPart) {
			return ((StructuredActivityNode_PinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			return ((StructuredActivityNode_CreateObjectActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			return ((StructuredActivityNode_CallBehaviorActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			return ((StructuredActivityNode_CallOperationActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_ForkNodeEditPart) {
			return ((StructuredActivityNode_ForkNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_JoinNodeEditPart) {
			return ((StructuredActivityNode_JoinNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			return ((StructuredActivityNode_AddStructuralFeatureValueActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_DataStoreNodeEditPart) {
			return ((StructuredActivityNode_DataStoreNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_CentralBufferNodeEditPart) {
			return ((StructuredActivityNode_CentralBufferNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_InputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_OutputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityParameterNodeEditPart) {
			return ((ActivityParameterNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SendSignalActionEditPart) {
			return ((SendSignalActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_AcceptEventActionEditPart) {
			return ((ActivityPartition_AcceptEventActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_AcceptTimeEventActionEditPart) {
			return ((ActivityPartition_AcceptTimeEventActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_ActivityFinalNodeEditPart) {
			return ((ActivityPartition_ActivityFinalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_DecisionNodeEditPart) {
			return ((ActivityPartition_DecisionNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_MergeNodeEditPart) {
			return ((ActivityPartition_MergeNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_InitialNodeEditPart) {
			return ((ActivityPartition_InitialNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_DataStoreNodeEditPart) {
			return ((ActivityPartition_DataStoreNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_CentralBufferNodeEditPart) {
			return ((ActivityPartition_CentralBufferNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_OpaqueActionEditPart) {
			return ((ActivityPartition_OpaqueActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_FlowFinalNodeEditPart) {
			return ((ActivityPartition_FlowFinalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityPartition_PinEditPart) {
			return ((ActivityPartition_PinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CreateObjectAction3EditPart) {
			return ((CreateObjectAction3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction3EditPart) {
			return ((AddStructuralFeatureValueAction3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallBehaviorAction3EditPart) {
			return ((CallBehaviorAction3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallOperationAction3EditPart) {
			return ((CallOperationAction3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode3EditPart) {
			return ((StructuredActivityNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode4EditPart) {
			return ((StructuredActivityNode4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_InputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SendSignalAction2EditPart) {
			return ((SendSignalAction2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LoopNode2EditPart) {
			return ((LoopNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ConditionalNode2EditPart) {
			return ((ConditionalNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExpansionRegion2EditPart) {
			return ((ExpansionRegion2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueSpecificationActionEditPart) {
			return ((ValueSpecificationActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OutputPin6EditPart) {
			return ((OutputPin6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ValueSpecificationAction2EditPart) {
			return ((ValueSpecificationAction2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ActivityEditPart) {
			return ((ActivityEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			return ((ConstraintEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Constraint2EditPart) {
			return ((Constraint2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AcceptEventActionEditPart) {
			return ((AcceptEventActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AcceptTimeEventActionEditPart) {
			return ((AcceptTimeEventActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			return ((DecisionNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			return ((MergeNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DataStoreNodeEditPart) {
			return ((DataStoreNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CentralBufferNodeEditPart) {
			return ((CentralBufferNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OpaqueActionEditPart) {
			return ((OpaqueActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OpaqueAction_OutputPinEditPart) {
			return ((OpaqueAction_OutputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			return ((ForkNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			return ((JoinNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof PinEditPart) {
			return ((PinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CreateObjectActionEditPart) {
			return ((CreateObjectActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CreateObjectAction_OutputPinEditPart) {
			return ((CreateObjectAction_OutputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_insertAt_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_insertAt_InputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_value_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_value_InputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_object_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_object_InputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallAction_OutputPinEditPart) {
			return ((CallAction_OutputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallAction_InputPinEditPart) {
			return ((CallAction_InputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallOperationAction_InputPinEditPart) {
			return ((CallOperationAction_InputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNodeEditPart) {
			return ((StructuredActivityNode_StructuredActivityNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			return ((StructuredActivityNode_OpaqueActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptEventActionEditPart) {
			return ((StructuredActivityNode_AcceptEventActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptTimeEventActionEditPart) {
			return ((StructuredActivityNode_AcceptTimeEventActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_ActivityFinalNodeEditPart) {
			return ((StructuredActivityNode_ActivityFinalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_DecisionNodeEditPart) {
			return ((StructuredActivityNode_DecisionNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_FlowFinalNodeEditPart) {
			return ((StructuredActivityNode_FlowFinalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_PinEditPart) {
			return ((StructuredActivityNode_PinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			return ((StructuredActivityNode_CreateObjectActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			return ((StructuredActivityNode_CallBehaviorActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			return ((StructuredActivityNode_CallOperationActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_ForkNodeEditPart) {
			return ((StructuredActivityNode_ForkNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_JoinNodeEditPart) {
			return ((StructuredActivityNode_JoinNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			return ((StructuredActivityNode_AddStructuralFeatureValueActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_DataStoreNodeEditPart) {
			return ((StructuredActivityNode_DataStoreNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_CentralBufferNodeEditPart) {
			return ((StructuredActivityNode_CentralBufferNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_InputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_OutputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OpaqueBehaviorEditPart) {
			return ((OpaqueBehaviorEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityParameterNodeEditPart) {
			return ((ActivityParameterNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SendSignalActionEditPart) {
			return ((SendSignalActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_AcceptEventActionEditPart) {
			return ((ActivityPartition_AcceptEventActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_AcceptTimeEventActionEditPart) {
			return ((ActivityPartition_AcceptTimeEventActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_ActivityFinalNodeEditPart) {
			return ((ActivityPartition_ActivityFinalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_DecisionNodeEditPart) {
			return ((ActivityPartition_DecisionNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_MergeNodeEditPart) {
			return ((ActivityPartition_MergeNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_InitialNodeEditPart) {
			return ((ActivityPartition_InitialNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_DataStoreNodeEditPart) {
			return ((ActivityPartition_DataStoreNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_CentralBufferNodeEditPart) {
			return ((ActivityPartition_CentralBufferNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_OpaqueActionEditPart) {
			return ((ActivityPartition_OpaqueActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_FlowFinalNodeEditPart) {
			return ((ActivityPartition_FlowFinalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityPartition_PinEditPart) {
			return ((ActivityPartition_PinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CreateObjectAction3EditPart) {
			return ((CreateObjectAction3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction3EditPart) {
			return ((AddStructuralFeatureValueAction3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallBehaviorAction3EditPart) {
			return ((CallBehaviorAction3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallOperationAction3EditPart) {
			return ((CallOperationAction3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode3EditPart) {
			return ((StructuredActivityNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode4EditPart) {
			return ((StructuredActivityNode4EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_InputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof SendSignalAction2EditPart) {
			return ((SendSignalAction2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LoopNode2EditPart) {
			return ((LoopNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConditionalNode2EditPart) {
			return ((ConditionalNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExpansionRegion2EditPart) {
			return ((ExpansionRegion2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueSpecificationActionEditPart) {
			return ((ValueSpecificationActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OutputPin6EditPart) {
			return ((OutputPin6EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ValueSpecificationAction2EditPart) {
			return ((ValueSpecificationAction2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AcceptEventActionEditPart) {
			return ((AcceptEventActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AcceptTimeEventActionEditPart) {
			return ((AcceptTimeEventActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DecisionNodeEditPart) {
			return ((DecisionNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MergeNodeEditPart) {
			return ((MergeNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DataStoreNodeEditPart) {
			return ((DataStoreNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CentralBufferNodeEditPart) {
			return ((CentralBufferNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OpaqueActionEditPart) {
			return ((OpaqueActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OpaqueAction_OutputPinEditPart) {
			return ((OpaqueAction_OutputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForkNodeEditPart) {
			return ((ForkNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JoinNodeEditPart) {
			return ((JoinNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof PinEditPart) {
			return ((PinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CreateObjectActionEditPart) {
			return ((CreateObjectActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CreateObjectAction_OutputPinEditPart) {
			return ((CreateObjectAction_OutputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_insertAt_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_insertAt_InputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_value_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_value_InputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_object_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_object_InputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallAction_OutputPinEditPart) {
			return ((CallAction_OutputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallAction_InputPinEditPart) {
			return ((CallAction_InputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallOperationAction_InputPinEditPart) {
			return ((CallOperationAction_InputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNodeEditPart) {
			return ((StructuredActivityNode_StructuredActivityNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			return ((StructuredActivityNode_OpaqueActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_AcceptEventActionEditPart) {
			return ((StructuredActivityNode_AcceptEventActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_AcceptTimeEventActionEditPart) {
			return ((StructuredActivityNode_AcceptTimeEventActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_ActivityFinalNodeEditPart) {
			return ((StructuredActivityNode_ActivityFinalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_DecisionNodeEditPart) {
			return ((StructuredActivityNode_DecisionNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_FlowFinalNodeEditPart) {
			return ((StructuredActivityNode_FlowFinalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_PinEditPart) {
			return ((StructuredActivityNode_PinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			return ((StructuredActivityNode_CreateObjectActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			return ((StructuredActivityNode_CallBehaviorActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			return ((StructuredActivityNode_CallOperationActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_ForkNodeEditPart) {
			return ((StructuredActivityNode_ForkNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_JoinNodeEditPart) {
			return ((StructuredActivityNode_JoinNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			return ((StructuredActivityNode_AddStructuralFeatureValueActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_DataStoreNodeEditPart) {
			return ((StructuredActivityNode_DataStoreNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_CentralBufferNodeEditPart) {
			return ((StructuredActivityNode_CentralBufferNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_InputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_OutputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityParameterNodeEditPart) {
			return ((ActivityParameterNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SendSignalActionEditPart) {
			return ((SendSignalActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_AcceptEventActionEditPart) {
			return ((ActivityPartition_AcceptEventActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_AcceptTimeEventActionEditPart) {
			return ((ActivityPartition_AcceptTimeEventActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_ActivityFinalNodeEditPart) {
			return ((ActivityPartition_ActivityFinalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_DecisionNodeEditPart) {
			return ((ActivityPartition_DecisionNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_MergeNodeEditPart) {
			return ((ActivityPartition_MergeNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_InitialNodeEditPart) {
			return ((ActivityPartition_InitialNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_DataStoreNodeEditPart) {
			return ((ActivityPartition_DataStoreNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_CentralBufferNodeEditPart) {
			return ((ActivityPartition_CentralBufferNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_OpaqueActionEditPart) {
			return ((ActivityPartition_OpaqueActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_FlowFinalNodeEditPart) {
			return ((ActivityPartition_FlowFinalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityPartition_PinEditPart) {
			return ((ActivityPartition_PinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CreateObjectAction3EditPart) {
			return ((CreateObjectAction3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction3EditPart) {
			return ((AddStructuralFeatureValueAction3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallBehaviorAction3EditPart) {
			return ((CallBehaviorAction3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallOperationAction3EditPart) {
			return ((CallOperationAction3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode3EditPart) {
			return ((StructuredActivityNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode4EditPart) {
			return ((StructuredActivityNode4EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_InputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SendSignalAction2EditPart) {
			return ((SendSignalAction2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LoopNode2EditPart) {
			return ((LoopNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ConditionalNode2EditPart) {
			return ((ConditionalNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExpansionRegion2EditPart) {
			return ((ExpansionRegion2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueSpecificationActionEditPart) {
			return ((ValueSpecificationActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OutputPin6EditPart) {
			return ((OutputPin6EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ValueSpecificationAction2EditPart) {
			return ((ValueSpecificationAction2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		if (targetEditPart instanceof ActivityEditPart) {
			return ((ActivityEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			return ((ConstraintEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Constraint2EditPart) {
			return ((Constraint2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AcceptEventActionEditPart) {
			return ((AcceptEventActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AcceptTimeEventActionEditPart) {
			return ((AcceptTimeEventActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			return ((DecisionNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			return ((MergeNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DataStoreNodeEditPart) {
			return ((DataStoreNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CentralBufferNodeEditPart) {
			return ((CentralBufferNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OpaqueActionEditPart) {
			return ((OpaqueActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OpaqueAction_OutputPinEditPart) {
			return ((OpaqueAction_OutputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			return ((ForkNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			return ((JoinNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof PinEditPart) {
			return ((PinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CreateObjectActionEditPart) {
			return ((CreateObjectActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CreateObjectAction_OutputPinEditPart) {
			return ((CreateObjectAction_OutputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_insertAt_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_insertAt_InputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_value_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_value_InputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_object_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_object_InputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallAction_OutputPinEditPart) {
			return ((CallAction_OutputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallAction_InputPinEditPart) {
			return ((CallAction_InputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallOperationAction_InputPinEditPart) {
			return ((CallOperationAction_InputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNodeEditPart) {
			return ((StructuredActivityNode_StructuredActivityNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			return ((StructuredActivityNode_OpaqueActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptEventActionEditPart) {
			return ((StructuredActivityNode_AcceptEventActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptTimeEventActionEditPart) {
			return ((StructuredActivityNode_AcceptTimeEventActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_ActivityFinalNodeEditPart) {
			return ((StructuredActivityNode_ActivityFinalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_DecisionNodeEditPart) {
			return ((StructuredActivityNode_DecisionNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_FlowFinalNodeEditPart) {
			return ((StructuredActivityNode_FlowFinalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_PinEditPart) {
			return ((StructuredActivityNode_PinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			return ((StructuredActivityNode_CreateObjectActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			return ((StructuredActivityNode_CallBehaviorActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			return ((StructuredActivityNode_CallOperationActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_ForkNodeEditPart) {
			return ((StructuredActivityNode_ForkNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_JoinNodeEditPart) {
			return ((StructuredActivityNode_JoinNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			return ((StructuredActivityNode_AddStructuralFeatureValueActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_DataStoreNodeEditPart) {
			return ((StructuredActivityNode_DataStoreNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_CentralBufferNodeEditPart) {
			return ((StructuredActivityNode_CentralBufferNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_InputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_OutputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OpaqueBehaviorEditPart) {
			return ((OpaqueBehaviorEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityParameterNodeEditPart) {
			return ((ActivityParameterNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SendSignalActionEditPart) {
			return ((SendSignalActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_AcceptEventActionEditPart) {
			return ((ActivityPartition_AcceptEventActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_AcceptTimeEventActionEditPart) {
			return ((ActivityPartition_AcceptTimeEventActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_ActivityFinalNodeEditPart) {
			return ((ActivityPartition_ActivityFinalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_DecisionNodeEditPart) {
			return ((ActivityPartition_DecisionNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_MergeNodeEditPart) {
			return ((ActivityPartition_MergeNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_InitialNodeEditPart) {
			return ((ActivityPartition_InitialNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_DataStoreNodeEditPart) {
			return ((ActivityPartition_DataStoreNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_CentralBufferNodeEditPart) {
			return ((ActivityPartition_CentralBufferNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_OpaqueActionEditPart) {
			return ((ActivityPartition_OpaqueActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_FlowFinalNodeEditPart) {
			return ((ActivityPartition_FlowFinalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityPartition_PinEditPart) {
			return ((ActivityPartition_PinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CreateObjectAction3EditPart) {
			return ((CreateObjectAction3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction3EditPart) {
			return ((AddStructuralFeatureValueAction3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallBehaviorAction3EditPart) {
			return ((CallBehaviorAction3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallOperationAction3EditPart) {
			return ((CallOperationAction3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode3EditPart) {
			return ((StructuredActivityNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode4EditPart) {
			return ((StructuredActivityNode4EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_InputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof SendSignalAction2EditPart) {
			return ((SendSignalAction2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LoopNode2EditPart) {
			return ((LoopNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConditionalNode2EditPart) {
			return ((ConditionalNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExpansionRegion2EditPart) {
			return ((ExpansionRegion2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueSpecificationActionEditPart) {
			return ((ValueSpecificationActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OutputPin6EditPart) {
			return ((OutputPin6EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ValueSpecificationAction2EditPart) {
			return ((ValueSpecificationAction2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public List getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		if (sourceEditPart instanceof AcceptEventActionEditPart) {
			return ((AcceptEventActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AcceptTimeEventActionEditPart) {
			return ((AcceptTimeEventActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityFinalNodeEditPart) {
			return ((ActivityFinalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DecisionNodeEditPart) {
			return ((DecisionNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MergeNodeEditPart) {
			return ((MergeNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InitialNodeEditPart) {
			return ((InitialNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DataStoreNodeEditPart) {
			return ((DataStoreNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CentralBufferNodeEditPart) {
			return ((CentralBufferNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OpaqueActionEditPart) {
			return ((OpaqueActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OpaqueAction_OutputPinEditPart) {
			return ((OpaqueAction_OutputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FlowFinalNodeEditPart) {
			return ((FlowFinalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForkNodeEditPart) {
			return ((ForkNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JoinNodeEditPart) {
			return ((JoinNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof PinEditPart) {
			return ((PinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CreateObjectActionEditPart) {
			return ((CreateObjectActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CreateObjectAction_OutputPinEditPart) {
			return ((CreateObjectAction_OutputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_insertAt_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_insertAt_InputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_value_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_value_InputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction_object_InputPinEditPart) {
			return ((AddStructuralFeatureValueAction_object_InputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallAction_OutputPinEditPart) {
			return ((CallAction_OutputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallAction_InputPinEditPart) {
			return ((CallAction_InputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallOperationAction_InputPinEditPart) {
			return ((CallOperationAction_InputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNodeEditPart) {
			return ((StructuredActivityNode_StructuredActivityNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			return ((StructuredActivityNode_OpaqueActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_AcceptEventActionEditPart) {
			return ((StructuredActivityNode_AcceptEventActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_AcceptTimeEventActionEditPart) {
			return ((StructuredActivityNode_AcceptTimeEventActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_ActivityFinalNodeEditPart) {
			return ((StructuredActivityNode_ActivityFinalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_DecisionNodeEditPart) {
			return ((StructuredActivityNode_DecisionNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_FlowFinalNodeEditPart) {
			return ((StructuredActivityNode_FlowFinalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_PinEditPart) {
			return ((StructuredActivityNode_PinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			return ((StructuredActivityNode_CreateObjectActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			return ((StructuredActivityNode_CallBehaviorActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			return ((StructuredActivityNode_CallOperationActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_ForkNodeEditPart) {
			return ((StructuredActivityNode_ForkNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_JoinNodeEditPart) {
			return ((StructuredActivityNode_JoinNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			return ((StructuredActivityNode_AddStructuralFeatureValueActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_DataStoreNodeEditPart) {
			return ((StructuredActivityNode_DataStoreNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_CentralBufferNodeEditPart) {
			return ((StructuredActivityNode_CentralBufferNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_InputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_OutputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityParameterNodeEditPart) {
			return ((ActivityParameterNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SendSignalActionEditPart) {
			return ((SendSignalActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_AcceptEventActionEditPart) {
			return ((ActivityPartition_AcceptEventActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_AcceptTimeEventActionEditPart) {
			return ((ActivityPartition_AcceptTimeEventActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_ActivityFinalNodeEditPart) {
			return ((ActivityPartition_ActivityFinalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_DecisionNodeEditPart) {
			return ((ActivityPartition_DecisionNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_MergeNodeEditPart) {
			return ((ActivityPartition_MergeNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_InitialNodeEditPart) {
			return ((ActivityPartition_InitialNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_DataStoreNodeEditPart) {
			return ((ActivityPartition_DataStoreNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_CentralBufferNodeEditPart) {
			return ((ActivityPartition_CentralBufferNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_OpaqueActionEditPart) {
			return ((ActivityPartition_OpaqueActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_FlowFinalNodeEditPart) {
			return ((ActivityPartition_FlowFinalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityPartition_PinEditPart) {
			return ((ActivityPartition_PinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CreateObjectAction3EditPart) {
			return ((CreateObjectAction3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction3EditPart) {
			return ((AddStructuralFeatureValueAction3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallBehaviorAction3EditPart) {
			return ((CallBehaviorAction3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallOperationAction3EditPart) {
			return ((CallOperationAction3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode3EditPart) {
			return ((StructuredActivityNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode4EditPart) {
			return ((StructuredActivityNode4EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNode_InputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_InputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) {
			return ((StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SendSignalAction2EditPart) {
			return ((SendSignalAction2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LoopNode2EditPart) {
			return ((LoopNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ConditionalNode2EditPart) {
			return ((ConditionalNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExpansionRegion2EditPart) {
			return ((ExpansionRegion2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueSpecificationActionEditPart) {
			return ((ValueSpecificationActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OutputPin6EditPart) {
			return ((OutputPin6EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ValueSpecificationAction2EditPart) {
			return ((ValueSpecificationAction2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		return Collections.EMPTY_LIST;
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForSource(IAdaptable target, IElementType relationshipType) {
		return selectExistingElement(target, getTypesForSource(target, relationshipType));
	}

	/**
	 * @generated
	 */
	public EObject selectExistingElementForTarget(IAdaptable source, IElementType relationshipType) {
		return selectExistingElement(source, getTypesForTarget(source, relationshipType));
	}

	/**
	 * @generated
	 */
	protected EObject selectExistingElement(IAdaptable host, Collection types) {
		if (types.isEmpty()) {
			return null;
		}
		IGraphicalEditPart editPart = (IGraphicalEditPart) host.getAdapter(IGraphicalEditPart.class);
		if (editPart == null) {
			return null;
		}
		Diagram diagram = (Diagram) editPart.getRoot().getContents().getModel();
		Collection elements = new HashSet();
		for (Iterator it = diagram.getElement().eAllContents(); it.hasNext();) {
			EObject element = (EObject) it.next();
			if (isApplicableElement(element, types)) {
				elements.add(element);
			}
		}
		if (elements.isEmpty()) {
			return null;
		}
		return selectElement((EObject[]) elements.toArray(new EObject[elements.size()]));
	}

	/**
	 * @generated
	 */
	protected boolean isApplicableElement(EObject element, Collection types) {
		IElementType type = ElementTypeRegistry.getInstance().getElementType(element);
		return types.contains(type);
	}

	/**
	 * @generated
	 */
	protected EObject selectElement(EObject[] elements) {
		Shell shell = Display.getCurrent().getActiveShell();
		ILabelProvider labelProvider = new AdapterFactoryLabelProvider(UMLDiagramEditorPlugin.getInstance().getItemProvidersAdapterFactory());
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(shell, labelProvider);
		dialog.setMessage(Messages.UMLModelingAssistantProviderMessage);
		dialog.setTitle(Messages.UMLModelingAssistantProviderTitle);
		dialog.setMultipleSelection(false);
		dialog.setElements(elements);
		EObject selected = null;
		if (dialog.open() == Window.OK) {
			selected = (EObject) dialog.getFirstResult();
		}
		return selected;
	}
}
