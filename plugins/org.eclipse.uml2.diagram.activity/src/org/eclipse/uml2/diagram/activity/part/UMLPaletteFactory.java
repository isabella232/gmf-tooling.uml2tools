package org.eclipse.uml2.diagram.activity.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createActivities1Group());
		paletteRoot.add(createActions2Group());
		paletteRoot.add(createControlNodes3Group());
		paletteRoot.add(createStructuredActivities4Group());
		paletteRoot.add(createObjects5Group());
		paletteRoot.add(createEdges6Group());
	}

	/**
	 * Creates "Activities" palette tool group
	 * @generated
	 */
	private PaletteContainer createActivities1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(UMLDiagramEditorPlugin.getString("Activities1Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Activities1Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createActivity1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Actions" palette tool group
	 * @generated
	 */
	private PaletteContainer createActions2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Actions2Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Actions2Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createAcceptEventAction1CreationTool());
		paletteContainer.add(createAcceptTimeAction2CreationTool());
		paletteContainer.add(createOpaqueAction3CreationTool());
		paletteContainer.add(createCreateObjectAction4CreationTool());
		paletteContainer.add(createAddFeatureValueAction5CreationTool());
		paletteContainer.add(createCallBehaviorAction6CreationTool());
		paletteContainer.add(createCallOperationAction7CreationTool());
		paletteContainer.add(createConstraint8CreationTool());
		paletteContainer.add(createConstraintLink9CreationTool());
		paletteContainer.add(createOpaqueBehavior10CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Control Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createControlNodes3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("ControlNodes3Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("ControlNodes3Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createActivityFinalNode1CreationTool());
		paletteContainer.add(createActivityInitialNode2CreationTool());
		paletteContainer.add(createFlowFinalNode3CreationTool());
		paletteContainer.add(createDecisionNode4CreationTool());
		paletteContainer.add(createMergeNode5CreationTool());
		paletteContainer.add(createForkNode6CreationTool());
		paletteContainer.add(createJoinNode7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Structured Activities" palette tool group
	 * @generated
	 */
	private PaletteContainer createStructuredActivities4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("StructuredActivities4Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("StructuredActivities4Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createStructuredActivityNode1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Objects5Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Objects5Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createDatastore1CreationTool());
		paletteContainer.add(createCentralBuffer2CreationTool());
		paletteContainer.add(createPin3CreationTool());
		paletteContainer.add(createOutputPin4CreationTool());
		paletteContainer.add(createInputPin5CreationTool());
		paletteContainer.add(createSelection6CreationTool());
		paletteContainer.add(createActivityParameter7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Edges" palette tool group
	 * @generated
	 */
	private PaletteContainer createEdges6Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Edges6Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Edges6Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createControlFlow1CreationTool());
		paletteContainer.add(createObjectFlow2CreationTool());
		paletteContainer.add(createExceptionHandlerLink3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivity1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Activity_2026);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Activity1CreationTool.title"), UMLDiagramEditorPlugin.getString("Activity1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Activity_2026));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcceptEventAction1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.AcceptEventAction_3030);
		types.add(UMLElementTypes.AcceptEventAction_3012);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("AcceptEventAction1CreationTool.title"), UMLDiagramEditorPlugin.getString("AcceptEventAction1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.AcceptEventAction_3030));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcceptTimeAction2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.AcceptEventAction_3031);
		types.add(UMLElementTypes.AcceptEventAction_3013);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("AcceptTimeAction2CreationTool.title"), UMLDiagramEditorPlugin.getString("AcceptTimeAction2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.AcceptEventAction_3031));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpaqueAction3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.OpaqueAction_3029);
		types.add(UMLElementTypes.OpaqueAction_3011);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("OpaqueAction3CreationTool.title"), UMLDiagramEditorPlugin.getString("OpaqueAction3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.OpaqueAction_3029));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateObjectAction4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.CreateObjectAction_3042);
		types.add(UMLElementTypes.CreateObjectAction_3018);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("CreateObjectAction4CreationTool.title"), UMLDiagramEditorPlugin.getString("CreateObjectAction4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CreateObjectAction_3042));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAddFeatureValueAction5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
		types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("AddFeatureValueAction5CreationTool.title"), UMLDiagramEditorPlugin.getString("AddFeatureValueAction5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.AddStructuralFeatureValueAction_3043));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallBehaviorAction6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.CallBehaviorAction_3044);
		types.add(UMLElementTypes.CallBehaviorAction_3019);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("CallBehaviorAction6CreationTool.title"), UMLDiagramEditorPlugin.getString("CallBehaviorAction6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CallBehaviorAction_3044));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallOperationAction7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.CallOperationAction_3045);
		types.add(UMLElementTypes.CallOperationAction_3020);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("CallOperationAction7CreationTool.title"), UMLDiagramEditorPlugin.getString("CallOperationAction7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CallOperationAction_3045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Constraint_2027);
		types.add(UMLElementTypes.Constraint_2028);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Constraint8CreationTool.title"), UMLDiagramEditorPlugin.getString("Constraint8CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Constraint_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraintLink9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ActionLocalPrecondition_4003);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("ConstraintLink9CreationTool.title"), UMLDiagramEditorPlugin.getString("ConstraintLink9CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ActionLocalPrecondition_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpaqueBehavior10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.OpaqueBehavior_3047);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("OpaqueBehavior10CreationTool.title"), UMLDiagramEditorPlugin.getString("OpaqueBehavior10CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.OpaqueBehavior_3047));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinalNode1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.ActivityFinalNode_3032);
		types.add(UMLElementTypes.ActivityFinalNode_3014);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("ActivityFinalNode1CreationTool.title"), UMLDiagramEditorPlugin.getString("ActivityFinalNode1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ActivityFinalNode_3032));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityInitialNode2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.InitialNode_3035);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("ActivityInitialNode2CreationTool.title"), UMLDiagramEditorPlugin.getString("ActivityInitialNode2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InitialNode_3035));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlowFinalNode3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.FlowFinalNode_3038);
		types.add(UMLElementTypes.FlowFinalNode_3016);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("FlowFinalNode3CreationTool.title"), UMLDiagramEditorPlugin.getString("FlowFinalNode3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.FlowFinalNode_3038));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecisionNode4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.MergeNode_3034);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("DecisionNode4CreationTool.title"), UMLDiagramEditorPlugin.getString("DecisionNode4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.MergeNode_3034));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMergeNode5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.DecisionNode_3033);
		types.add(UMLElementTypes.DecisionNode_3015);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("MergeNode5CreationTool.title"), UMLDiagramEditorPlugin.getString("MergeNode5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.DecisionNode_3033));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForkNode6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.ForkNode_3039);
		types.add(UMLElementTypes.ForkNode_3021);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("ForkNode6CreationTool.title"), UMLDiagramEditorPlugin.getString("ForkNode6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ForkNode_3039));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoinNode7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.JoinNode_3040);
		types.add(UMLElementTypes.JoinNode_3022);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("JoinNode7CreationTool.title"), UMLDiagramEditorPlugin.getString("JoinNode7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.JoinNode_3040));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredActivityNode1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.StructuredActivityNode_3046);
		types.add(UMLElementTypes.StructuredActivityNode_3009);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("StructuredActivityNode1CreationTool.title"), UMLDiagramEditorPlugin.getString("StructuredActivityNode1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.StructuredActivityNode_3046));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatastore1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.DataStoreNode_3036);
		types.add(UMLElementTypes.DataStoreNode_3024);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Datastore1CreationTool.title"), UMLDiagramEditorPlugin.getString("Datastore1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.DataStoreNode_3036));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCentralBuffer2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.CentralBufferNode_3037);
		types.add(UMLElementTypes.CentralBufferNode_3025);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("CentralBuffer2CreationTool.title"), UMLDiagramEditorPlugin.getString("CentralBuffer2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CentralBufferNode_3037));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPin3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Pin_3041);
		types.add(UMLElementTypes.Pin_3017);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Pin3CreationTool.title"), UMLDiagramEditorPlugin.getString("Pin3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Pin_3041));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPin4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(UMLElementTypes.OutputPin_3001);
		types.add(UMLElementTypes.OutputPin_3002);
		types.add(UMLElementTypes.OutputPin_3006);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("OutputPin4CreationTool.title"), UMLDiagramEditorPlugin.getString("OutputPin4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.OutputPin_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPin5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types.add(UMLElementTypes.InputPin_3003);
		types.add(UMLElementTypes.InputPin_3004);
		types.add(UMLElementTypes.InputPin_3005);
		types.add(UMLElementTypes.InputPin_3007);
		types.add(UMLElementTypes.InputPin_3008);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("InputPin5CreationTool.title"), UMLDiagramEditorPlugin.getString("InputPin5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InputPin_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelection6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ObjectNodeSelection_4004);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("Selection6CreationTool.title"), UMLDiagramEditorPlugin.getString("Selection6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ObjectNodeSelection_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityParameter7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ActivityParameterNode_3052);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("ActivityParameter7CreationTool.title"), UMLDiagramEditorPlugin.getString("ActivityParameter7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ActivityParameterNode_3052));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlFlow1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ControlFlow_4001);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("ControlFlow1CreationTool.title"), UMLDiagramEditorPlugin.getString("ControlFlow1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ControlFlow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectFlow2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ObjectFlow_4002);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("ObjectFlow2CreationTool.title"), UMLDiagramEditorPlugin.getString("ObjectFlow2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ObjectFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExceptionHandlerLink3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ExceptionHandler_4005);
		LinkToolEntry entry = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("ExceptionHandlerLink3CreationTool.title"), UMLDiagramEditorPlugin.getString("ExceptionHandlerLink3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ExceptionHandler_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends ToolEntry {

		/**
		 * @generated
		 */
		private final List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public Tool createTool() {
			Tool tool = new UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
