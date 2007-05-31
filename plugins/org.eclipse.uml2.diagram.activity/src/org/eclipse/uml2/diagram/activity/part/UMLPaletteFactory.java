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
import org.eclipse.uml2.uml.UMLPackage;

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
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Activities1Group_title);
		paletteContainer.setDescription(Messages.Activities1Group_desc);
		paletteContainer.add(createActivity1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Actions" palette tool group
	 * @generated
	 */
	private PaletteContainer createActions2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Actions2Group_title);
		paletteContainer.setDescription(Messages.Actions2Group_desc);
		paletteContainer.add(createAcceptEventAction1CreationTool());
		paletteContainer.add(createAcceptTimeAction2CreationTool());
		paletteContainer.add(createOpaqueAction3CreationTool());
		paletteContainer.add(createCreateObjectAction4CreationTool());
		paletteContainer.add(createAddFeatureValueAction5CreationTool());
		paletteContainer.add(createCallBehaviorAction6CreationTool());
		paletteContainer.add(createCallOperationAction7CreationTool());
		paletteContainer.add(createSendSignalAction8CreationTool());
		paletteContainer.add(createConstraint9CreationTool());
		paletteContainer.add(createConstraintLink10CreationTool());
		paletteContainer.add(createOpaqueBehavior11CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Control Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createControlNodes3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.ControlNodes3Group_title);
		paletteContainer.setDescription(Messages.ControlNodes3Group_desc);
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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.StructuredActivities4Group_title);
		paletteContainer.setDescription(Messages.StructuredActivities4Group_desc);
		paletteContainer.add(createStructuredActivityNode1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Objects5Group_title);
		paletteContainer.setDescription(Messages.Objects5Group_desc);
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
		PaletteDrawer paletteContainer = new PaletteDrawer(Messages.Edges6Group_title);
		paletteContainer.setDescription(Messages.Edges6Group_desc);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.Activity1CreationTool_title, Messages.Activity1CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.AcceptEventAction1CreationTool_title, Messages.AcceptEventAction1CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.AcceptTimeAction2CreationTool_title, Messages.AcceptTimeAction2CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.OpaqueAction3CreationTool_title, Messages.OpaqueAction3CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.CreateObjectAction4CreationTool_title, Messages.CreateObjectAction4CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.AddFeatureValueAction5CreationTool_title, Messages.AddFeatureValueAction5CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.CallBehaviorAction6CreationTool_title, Messages.CallBehaviorAction6CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.CallOperationAction7CreationTool_title, Messages.CallOperationAction7CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CallOperationAction_3045));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSendSignalAction8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.SendSignalAction_3053);
		NodeToolEntry entry = new NodeToolEntry(Messages.SendSignalAction8CreationTool_title, Messages.SendSignalAction8CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.SendSignalAction_3053));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Constraint_2027);
		types.add(UMLElementTypes.Constraint_2028);
		NodeToolEntry entry = new NodeToolEntry(Messages.Constraint9CreationTool_title, Messages.Constraint9CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Constraint_2027));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraintLink10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ActionLocalPrecondition_4003);
		LinkToolEntry entry = new LinkToolEntry(Messages.ConstraintLink10CreationTool_title, Messages.ConstraintLink10CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ActionLocalPrecondition_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpaqueBehavior11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.OpaqueBehavior_3047);
		NodeToolEntry entry = new NodeToolEntry(Messages.OpaqueBehavior11CreationTool_title, Messages.OpaqueBehavior11CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.ActivityFinalNode1CreationTool_title, Messages.ActivityFinalNode1CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.ActivityInitialNode2CreationTool_title, Messages.ActivityInitialNode2CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.FlowFinalNode3CreationTool_title, Messages.FlowFinalNode3CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.DecisionNode4CreationTool_title, Messages.DecisionNode4CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.MergeNode5CreationTool_title, Messages.MergeNode5CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.ForkNode6CreationTool_title, Messages.ForkNode6CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.JoinNode7CreationTool_title, Messages.JoinNode7CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.StructuredActivityNode1CreationTool_title, Messages.StructuredActivityNode1CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.Datastore1CreationTool_title, Messages.Datastore1CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.CentralBuffer2CreationTool_title, Messages.CentralBuffer2CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.Pin3CreationTool_title, Messages.Pin3CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.OutputPin4CreationTool_title, Messages.OutputPin4CreationTool_desc, types);
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
		NodeToolEntry entry = new NodeToolEntry(Messages.InputPin5CreationTool_title, Messages.InputPin5CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InputPin_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSelection6CreationToolGen() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ObjectNodeSelection_4004);
		LinkToolEntry entry = new LinkToolEntry(Messages.Selection6CreationTool_title, Messages.Selection6CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ObjectNodeSelection_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createSelection6CreationTool() {
		ToolEntry entry = createSelection6CreationToolGen();
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLPackage.eINSTANCE.getStateMachine()));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityParameter7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ActivityParameterNode_3052);
		NodeToolEntry entry = new NodeToolEntry(Messages.ActivityParameter7CreationTool_title, Messages.ActivityParameter7CreationTool_desc, types);
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
		LinkToolEntry entry = new LinkToolEntry(Messages.ControlFlow1CreationTool_title, Messages.ControlFlow1CreationTool_desc, types);
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
		LinkToolEntry entry = new LinkToolEntry(Messages.ObjectFlow2CreationTool_title, Messages.ObjectFlow2CreationTool_desc, types);
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
		LinkToolEntry entry = new LinkToolEntry(Messages.ExceptionHandlerLink3CreationTool_title, null, types);
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
