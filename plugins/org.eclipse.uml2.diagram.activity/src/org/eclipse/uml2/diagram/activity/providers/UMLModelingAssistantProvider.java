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
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction6EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeConditionalNodeCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeConditionalNodeCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConditionalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Constraint2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ConstraintEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegion2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionExpansionRegionNodeCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ExpansionRegionExpansionRegionNodeCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin6EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPin7EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeLoopNodeContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.LoopNodeLoopNodeContentPaneCompartmentEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueAction3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPin5EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OutputPinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PackageEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ParameterSetEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.Pin3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNode4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart;
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

		if (editPart instanceof OpaqueAction2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3001);
			return types;
		}

		if (editPart instanceof CreateObjectAction2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3002);
			return types;
		}

		if (editPart instanceof CallBehaviorAction2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			return types;
		}

		if (editPart instanceof CallOperationAction2EditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			types.add(UMLElementTypes.InputPin_3008);
			return types;
		}

		if (editPart instanceof AddStructuralFeatureValueAction2EditPart) {
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
			return types;
		}

		if (editPart instanceof ActivityPartition2EditPart) {
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
			return types;
		}

		if (editPart instanceof OpaqueAction3EditPart) {
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

		if (editPart instanceof ParameterSetEditPart) {
			List<IElementType> types = new ArrayList<IElementType>();
			types.add(UMLElementTypes.Parameter_3087);
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
		if (sourceEditPart instanceof AcceptEventAction2EditPart) {
			return ((AcceptEventAction2EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof OutputPinEditPart) {
			return ((OutputPinEditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof OutputPin2EditPart) {
			return ((OutputPin2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputPinEditPart) {
			return ((InputPinEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputPin2EditPart) {
			return ((InputPin2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputPin3EditPart) {
			return ((InputPin3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OutputPin3EditPart) {
			return ((OutputPin3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputPin4EditPart) {
			return ((InputPin4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputPin5EditPart) {
			return ((InputPin5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof StructuredActivityNode2EditPart) {
			return ((StructuredActivityNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OpaqueAction2EditPart) {
			return ((OpaqueAction2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AcceptEventAction3EditPart) {
			return ((AcceptEventAction3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AcceptEventAction4EditPart) {
			return ((AcceptEventAction4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityFinalNode2EditPart) {
			return ((ActivityFinalNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DecisionNode2EditPart) {
			return ((DecisionNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FlowFinalNode2EditPart) {
			return ((FlowFinalNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pin2EditPart) {
			return ((Pin2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CreateObjectAction2EditPart) {
			return ((CreateObjectAction2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallBehaviorAction2EditPart) {
			return ((CallBehaviorAction2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CallOperationAction2EditPart) {
			return ((CallOperationAction2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForkNode2EditPart) {
			return ((ForkNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JoinNode2EditPart) {
			return ((JoinNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction2EditPart) {
			return ((AddStructuralFeatureValueAction2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DataStoreNode2EditPart) {
			return ((DataStoreNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CentralBufferNode2EditPart) {
			return ((CentralBufferNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InputPin6EditPart) {
			return ((InputPin6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OutputPin4EditPart) {
			return ((OutputPin4EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityParameterNodeEditPart) {
			return ((ActivityParameterNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof SendSignalActionEditPart) {
			return ((SendSignalActionEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AcceptEventAction5EditPart) {
			return ((AcceptEventAction5EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof AcceptEventAction6EditPart) {
			return ((AcceptEventAction6EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ActivityFinalNode3EditPart) {
			return ((ActivityFinalNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DecisionNode3EditPart) {
			return ((DecisionNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof MergeNode2EditPart) {
			return ((MergeNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof InitialNode2EditPart) {
			return ((InitialNode2EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof DataStoreNode3EditPart) {
			return ((DataStoreNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof CentralBufferNode3EditPart) {
			return ((CentralBufferNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OpaqueAction3EditPart) {
			return ((OpaqueAction3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof FlowFinalNode3EditPart) {
			return ((FlowFinalNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof Pin3EditPart) {
			return ((Pin3EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof InputPin7EditPart) {
			return ((InputPin7EditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof OutputPin5EditPart) {
			return ((OutputPin5EditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (sourceEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) sourceEditPart).getMARelTypesOnSource();
		}
		if (sourceEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) sourceEditPart).getMARelTypesOnSource();
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
		if (targetEditPart instanceof AcceptEventAction2EditPart) {
			return ((AcceptEventAction2EditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (targetEditPart instanceof OutputPinEditPart) {
			return ((OutputPinEditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (targetEditPart instanceof OutputPin2EditPart) {
			return ((OutputPin2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputPinEditPart) {
			return ((InputPinEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputPin2EditPart) {
			return ((InputPin2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputPin3EditPart) {
			return ((InputPin3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OutputPin3EditPart) {
			return ((OutputPin3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputPin4EditPart) {
			return ((InputPin4EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputPin5EditPart) {
			return ((InputPin5EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof StructuredActivityNode2EditPart) {
			return ((StructuredActivityNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OpaqueAction2EditPart) {
			return ((OpaqueAction2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AcceptEventAction3EditPart) {
			return ((AcceptEventAction3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AcceptEventAction4EditPart) {
			return ((AcceptEventAction4EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityFinalNode2EditPart) {
			return ((ActivityFinalNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			return ((DecisionNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FlowFinalNode2EditPart) {
			return ((FlowFinalNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pin2EditPart) {
			return ((Pin2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CreateObjectAction2EditPart) {
			return ((CreateObjectAction2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallBehaviorAction2EditPart) {
			return ((CallBehaviorAction2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CallOperationAction2EditPart) {
			return ((CallOperationAction2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			return ((ForkNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			return ((JoinNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction2EditPart) {
			return ((AddStructuralFeatureValueAction2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DataStoreNode2EditPart) {
			return ((DataStoreNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CentralBufferNode2EditPart) {
			return ((CentralBufferNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InputPin6EditPart) {
			return ((InputPin6EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OutputPin4EditPart) {
			return ((OutputPin4EditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (targetEditPart instanceof AcceptEventAction5EditPart) {
			return ((AcceptEventAction5EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof AcceptEventAction6EditPart) {
			return ((AcceptEventAction6EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ActivityFinalNode3EditPart) {
			return ((ActivityFinalNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DecisionNode3EditPart) {
			return ((DecisionNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			return ((MergeNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			return ((InitialNode2EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof DataStoreNode3EditPart) {
			return ((DataStoreNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof CentralBufferNode3EditPart) {
			return ((CentralBufferNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OpaqueAction3EditPart) {
			return ((OpaqueAction3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof FlowFinalNode3EditPart) {
			return ((FlowFinalNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof Pin3EditPart) {
			return ((Pin3EditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (targetEditPart instanceof InputPin7EditPart) {
			return ((InputPin7EditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof OutputPin5EditPart) {
			return ((OutputPin5EditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (targetEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) targetEditPart).getMARelTypesOnTarget();
		}
		if (targetEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) targetEditPart).getMARelTypesOnTarget();
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
		if (sourceEditPart instanceof AcceptEventAction2EditPart) {
			return ((AcceptEventAction2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
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
		if (sourceEditPart instanceof OutputPinEditPart) {
			return ((OutputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
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
		if (sourceEditPart instanceof OutputPin2EditPart) {
			return ((OutputPin2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputPinEditPart) {
			return ((InputPinEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputPin2EditPart) {
			return ((InputPin2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputPin3EditPart) {
			return ((InputPin3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OutputPin3EditPart) {
			return ((OutputPin3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputPin4EditPart) {
			return ((InputPin4EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputPin5EditPart) {
			return ((InputPin5EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof StructuredActivityNode2EditPart) {
			return ((StructuredActivityNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OpaqueAction2EditPart) {
			return ((OpaqueAction2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AcceptEventAction3EditPart) {
			return ((AcceptEventAction3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AcceptEventAction4EditPart) {
			return ((AcceptEventAction4EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityFinalNode2EditPart) {
			return ((ActivityFinalNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DecisionNode2EditPart) {
			return ((DecisionNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FlowFinalNode2EditPart) {
			return ((FlowFinalNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pin2EditPart) {
			return ((Pin2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CreateObjectAction2EditPart) {
			return ((CreateObjectAction2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallBehaviorAction2EditPart) {
			return ((CallBehaviorAction2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CallOperationAction2EditPart) {
			return ((CallOperationAction2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForkNode2EditPart) {
			return ((ForkNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JoinNode2EditPart) {
			return ((JoinNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction2EditPart) {
			return ((AddStructuralFeatureValueAction2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DataStoreNode2EditPart) {
			return ((DataStoreNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CentralBufferNode2EditPart) {
			return ((CentralBufferNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InputPin6EditPart) {
			return ((InputPin6EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OutputPin4EditPart) {
			return ((OutputPin4EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityParameterNodeEditPart) {
			return ((ActivityParameterNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof SendSignalActionEditPart) {
			return ((SendSignalActionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AcceptEventAction5EditPart) {
			return ((AcceptEventAction5EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof AcceptEventAction6EditPart) {
			return ((AcceptEventAction6EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ActivityFinalNode3EditPart) {
			return ((ActivityFinalNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DecisionNode3EditPart) {
			return ((DecisionNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof MergeNode2EditPart) {
			return ((MergeNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof InitialNode2EditPart) {
			return ((InitialNode2EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof DataStoreNode3EditPart) {
			return ((DataStoreNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof CentralBufferNode3EditPart) {
			return ((CentralBufferNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OpaqueAction3EditPart) {
			return ((OpaqueAction3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof FlowFinalNode3EditPart) {
			return ((FlowFinalNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof Pin3EditPart) {
			return ((Pin3EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
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
		if (sourceEditPart instanceof InputPin7EditPart) {
			return ((InputPin7EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof OutputPin5EditPart) {
			return ((OutputPin5EditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
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
		if (sourceEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
		}
		if (sourceEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) sourceEditPart).getMARelTypesOnSourceAndTarget(targetEditPart);
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
		if (targetEditPart instanceof AcceptEventAction2EditPart) {
			return ((AcceptEventAction2EditPart) targetEditPart).getMATypesForSource(relationshipType);
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
		if (targetEditPart instanceof OutputPinEditPart) {
			return ((OutputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
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
		if (targetEditPart instanceof OutputPin2EditPart) {
			return ((OutputPin2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputPinEditPart) {
			return ((InputPinEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputPin2EditPart) {
			return ((InputPin2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputPin3EditPart) {
			return ((InputPin3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OutputPin3EditPart) {
			return ((OutputPin3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputPin4EditPart) {
			return ((InputPin4EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputPin5EditPart) {
			return ((InputPin5EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof StructuredActivityNode2EditPart) {
			return ((StructuredActivityNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OpaqueAction2EditPart) {
			return ((OpaqueAction2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AcceptEventAction3EditPart) {
			return ((AcceptEventAction3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AcceptEventAction4EditPart) {
			return ((AcceptEventAction4EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityFinalNode2EditPart) {
			return ((ActivityFinalNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			return ((DecisionNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FlowFinalNode2EditPart) {
			return ((FlowFinalNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pin2EditPart) {
			return ((Pin2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CreateObjectAction2EditPart) {
			return ((CreateObjectAction2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallBehaviorAction2EditPart) {
			return ((CallBehaviorAction2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CallOperationAction2EditPart) {
			return ((CallOperationAction2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			return ((ForkNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			return ((JoinNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction2EditPart) {
			return ((AddStructuralFeatureValueAction2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DataStoreNode2EditPart) {
			return ((DataStoreNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CentralBufferNode2EditPart) {
			return ((CentralBufferNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InputPin6EditPart) {
			return ((InputPin6EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OutputPin4EditPart) {
			return ((OutputPin4EditPart) targetEditPart).getMATypesForSource(relationshipType);
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
		if (targetEditPart instanceof AcceptEventAction5EditPart) {
			return ((AcceptEventAction5EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof AcceptEventAction6EditPart) {
			return ((AcceptEventAction6EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ActivityFinalNode3EditPart) {
			return ((ActivityFinalNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DecisionNode3EditPart) {
			return ((DecisionNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			return ((MergeNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			return ((InitialNode2EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof DataStoreNode3EditPart) {
			return ((DataStoreNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof CentralBufferNode3EditPart) {
			return ((CentralBufferNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OpaqueAction3EditPart) {
			return ((OpaqueAction3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof FlowFinalNode3EditPart) {
			return ((FlowFinalNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof Pin3EditPart) {
			return ((Pin3EditPart) targetEditPart).getMATypesForSource(relationshipType);
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
		if (targetEditPart instanceof InputPin7EditPart) {
			return ((InputPin7EditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof OutputPin5EditPart) {
			return ((OutputPin5EditPart) targetEditPart).getMATypesForSource(relationshipType);
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
		if (targetEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) targetEditPart).getMATypesForSource(relationshipType);
		}
		if (targetEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) targetEditPart).getMATypesForSource(relationshipType);
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
		if (sourceEditPart instanceof AcceptEventAction2EditPart) {
			return ((AcceptEventAction2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
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
		if (sourceEditPart instanceof OutputPinEditPart) {
			return ((OutputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
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
		if (sourceEditPart instanceof OutputPin2EditPart) {
			return ((OutputPin2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			return ((AddStructuralFeatureValueActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputPinEditPart) {
			return ((InputPinEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputPin2EditPart) {
			return ((InputPin2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputPin3EditPart) {
			return ((InputPin3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallBehaviorActionEditPart) {
			return ((CallBehaviorActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OutputPin3EditPart) {
			return ((OutputPin3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputPin4EditPart) {
			return ((InputPin4EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallOperationActionEditPart) {
			return ((CallOperationActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputPin5EditPart) {
			return ((InputPin5EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNodeEditPart) {
			return ((StructuredActivityNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof StructuredActivityNode2EditPart) {
			return ((StructuredActivityNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OpaqueAction2EditPart) {
			return ((OpaqueAction2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AcceptEventAction3EditPart) {
			return ((AcceptEventAction3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AcceptEventAction4EditPart) {
			return ((AcceptEventAction4EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityFinalNode2EditPart) {
			return ((ActivityFinalNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DecisionNode2EditPart) {
			return ((DecisionNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FlowFinalNode2EditPart) {
			return ((FlowFinalNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pin2EditPart) {
			return ((Pin2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CreateObjectAction2EditPart) {
			return ((CreateObjectAction2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallBehaviorAction2EditPart) {
			return ((CallBehaviorAction2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CallOperationAction2EditPart) {
			return ((CallOperationAction2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForkNode2EditPart) {
			return ((ForkNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JoinNode2EditPart) {
			return ((JoinNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AddStructuralFeatureValueAction2EditPart) {
			return ((AddStructuralFeatureValueAction2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DataStoreNode2EditPart) {
			return ((DataStoreNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CentralBufferNode2EditPart) {
			return ((CentralBufferNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InputPin6EditPart) {
			return ((InputPin6EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OutputPin4EditPart) {
			return ((OutputPin4EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityParameterNodeEditPart) {
			return ((ActivityParameterNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof SendSignalActionEditPart) {
			return ((SendSignalActionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AcceptEventAction5EditPart) {
			return ((AcceptEventAction5EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof AcceptEventAction6EditPart) {
			return ((AcceptEventAction6EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ActivityFinalNode3EditPart) {
			return ((ActivityFinalNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DecisionNode3EditPart) {
			return ((DecisionNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof MergeNode2EditPart) {
			return ((MergeNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof InitialNode2EditPart) {
			return ((InitialNode2EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof DataStoreNode3EditPart) {
			return ((DataStoreNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof CentralBufferNode3EditPart) {
			return ((CentralBufferNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OpaqueAction3EditPart) {
			return ((OpaqueAction3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof FlowFinalNode3EditPart) {
			return ((FlowFinalNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ForkNode3EditPart) {
			return ((ForkNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof JoinNode3EditPart) {
			return ((JoinNode3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof Pin3EditPart) {
			return ((Pin3EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
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
		if (sourceEditPart instanceof InputPin7EditPart) {
			return ((InputPin7EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof OutputPin5EditPart) {
			return ((OutputPin5EditPart) sourceEditPart).getMATypesForTarget(relationshipType);
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
		if (sourceEditPart instanceof LoopNodeEditPart) {
			return ((LoopNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ConditionalNodeEditPart) {
			return ((ConditionalNodeEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
		}
		if (sourceEditPart instanceof ExpansionRegionEditPart) {
			return ((ExpansionRegionEditPart) sourceEditPart).getMATypesForTarget(relationshipType);
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
