package org.eclipse.uml2.diagram.activity.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
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
		paletteRoot.add(createActions1Group());
		paletteRoot.add(createControlNodes2Group());
		paletteRoot.add(createStructuredActivities3Group());
		paletteRoot.add(createObjects4Group());
		paletteRoot.add(createEdges5Group());
	}

	/**
	 * Creates "Actions" palette tool group
	 * @generated
	 */
	private PaletteContainer createActions1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Actions1Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Actions1Group.desc")); //$NON-NLS-1$
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
	private PaletteContainer createControlNodes2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("ControlNodes2Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("ControlNodes2Group.desc")); //$NON-NLS-1$
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
	private PaletteContainer createStructuredActivities3Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("StructuredActivities3Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("StructuredActivities3Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createStructuredActivityNode1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private PaletteContainer createObjects4Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Objects4Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Objects4Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createDatastore1CreationTool());
		paletteContainer.add(createCentralBuffer2CreationTool());
		paletteContainer.add(createPin3CreationTool());
		paletteContainer.add(createOutputPin4CreationTool());
		paletteContainer.add(createInputPin5CreationTool());
		paletteContainer.add(createSelection6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Edges" palette tool group
	 * @generated
	 */
	private PaletteContainer createEdges5Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Edges5Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Edges5Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createControlFlow1CreationTool());
		paletteContainer.add(createObjectFlow2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcceptEventAction1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.AcceptEventAction_2001);
		types.add(UMLElementTypes.AcceptEventAction_3012);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("AcceptEventAction1CreationTool.title"), UMLDiagramEditorPlugin.getString("AcceptEventAction1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.AcceptEventAction_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcceptTimeAction2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.AcceptEventAction_2002);
		types.add(UMLElementTypes.AcceptEventAction_3013);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("AcceptTimeAction2CreationTool.title"), UMLDiagramEditorPlugin.getString("AcceptTimeAction2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.AcceptEventAction_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpaqueAction3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.OpaqueAction_2010);
		types.add(UMLElementTypes.OpaqueAction_3011);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("OpaqueAction3CreationTool.title"), UMLDiagramEditorPlugin.getString("OpaqueAction3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.OpaqueAction_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateObjectAction4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.CreateObjectAction_2015);
		types.add(UMLElementTypes.CreateObjectAction_3018);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("CreateObjectAction4CreationTool.title"), UMLDiagramEditorPlugin.getString("CreateObjectAction4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CreateObjectAction_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAddFeatureValueAction5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.AddStructuralFeatureValueAction_2016);
		types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("AddFeatureValueAction5CreationTool.title"), UMLDiagramEditorPlugin.getString("AddFeatureValueAction5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.AddStructuralFeatureValueAction_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallBehaviorAction6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.CallBehaviorAction_2017);
		types.add(UMLElementTypes.CallBehaviorAction_3019);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("CallBehaviorAction6CreationTool.title"), UMLDiagramEditorPlugin.getString("CallBehaviorAction6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CallBehaviorAction_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallOperationAction7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.CallOperationAction_2018);
		types.add(UMLElementTypes.CallOperationAction_3020);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("CallOperationAction7CreationTool.title"), UMLDiagramEditorPlugin.getString("CallOperationAction7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CallOperationAction_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Constraint_2019);
		types.add(UMLElementTypes.Constraint_2020);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Constraint8CreationTool.title"), UMLDiagramEditorPlugin.getString("Constraint8CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Constraint_2019));
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
		types.add(UMLElementTypes.OpaqueBehavior_2021);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("OpaqueBehavior10CreationTool.title"), UMLDiagramEditorPlugin.getString("OpaqueBehavior10CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.OpaqueBehavior_2021));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinalNode1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.ActivityFinalNode_2003);
		types.add(UMLElementTypes.ActivityFinalNode_3014);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("ActivityFinalNode1CreationTool.title"), UMLDiagramEditorPlugin.getString("ActivityFinalNode1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ActivityFinalNode_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityInitialNode2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.InitialNode_2006);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("ActivityInitialNode2CreationTool.title"), UMLDiagramEditorPlugin.getString("ActivityInitialNode2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InitialNode_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlowFinalNode3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.FlowFinalNode_2011);
		types.add(UMLElementTypes.FlowFinalNode_3016);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("FlowFinalNode3CreationTool.title"), UMLDiagramEditorPlugin.getString("FlowFinalNode3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.FlowFinalNode_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecisionNode4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.DecisionNode_2004);
		types.add(UMLElementTypes.DecisionNode_3015);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("DecisionNode4CreationTool.title"), UMLDiagramEditorPlugin.getString("DecisionNode4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.DecisionNode_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMergeNode5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.MergeNode_2005);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("MergeNode5CreationTool.title"), UMLDiagramEditorPlugin.getString("MergeNode5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.MergeNode_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForkNode6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.ForkNode_2012);
		types.add(UMLElementTypes.ForkNode_3021);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("ForkNode6CreationTool.title"), UMLDiagramEditorPlugin.getString("ForkNode6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ForkNode_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoinNode7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.JoinNode_2013);
		types.add(UMLElementTypes.JoinNode_3022);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("JoinNode7CreationTool.title"), UMLDiagramEditorPlugin.getString("JoinNode7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.JoinNode_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredActivityNode1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.StructuredActivityNode_2007);
		types.add(UMLElementTypes.StructuredActivityNode_3009);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("StructuredActivityNode1CreationTool.title"), UMLDiagramEditorPlugin.getString("StructuredActivityNode1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.StructuredActivityNode_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatastore1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.DataStoreNode_2008);
		types.add(UMLElementTypes.DataStoreNode_3024);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Datastore1CreationTool.title"), UMLDiagramEditorPlugin.getString("Datastore1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.DataStoreNode_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCentralBuffer2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.CentralBufferNode_2009);
		types.add(UMLElementTypes.CentralBufferNode_3025);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("CentralBuffer2CreationTool.title"), UMLDiagramEditorPlugin.getString("CentralBuffer2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CentralBufferNode_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPin3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Pin_2014);
		types.add(UMLElementTypes.Pin_3017);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Pin3CreationTool.title"), UMLDiagramEditorPlugin.getString("Pin3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Pin_2014));
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
