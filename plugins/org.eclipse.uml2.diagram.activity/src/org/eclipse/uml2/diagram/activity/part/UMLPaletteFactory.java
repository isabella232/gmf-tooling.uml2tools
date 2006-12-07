package org.eclipse.uml2.diagram.activity.part;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(org.eclipse.gef.palette.PaletteRoot paletteRoot) {
		paletteRoot.add(createActions1Group());
		paletteRoot.add(createControlNodes2Group());
		paletteRoot.add(createStructuredActivities3Group());
		paletteRoot.add(createObjects4Group());
		paletteRoot.add(createEdges5Group());
	}

	/**
	 * Creates "Edges" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createEdges5Group() {
		org.eclipse.gef.palette.PaletteDrawer paletteContainer = new org.eclipse.gef.palette.PaletteDrawer(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("Edges5Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("Edges5Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createControlFlow1CreationTool());
		paletteContainer.add(createObjectFlow2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Structured Activities" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createStructuredActivities3Group() {
		org.eclipse.gef.palette.PaletteDrawer paletteContainer = new org.eclipse.gef.palette.PaletteDrawer(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin
				.getString("StructuredActivities3Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("StructuredActivities3Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createStructuredActivityNode1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Actions" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createActions1Group() {
		org.eclipse.gef.palette.PaletteDrawer paletteContainer = new org.eclipse.gef.palette.PaletteDrawer(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin
				.getString("Actions1Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("Actions1Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createAcceptEventAction1CreationTool());
		paletteContainer.add(createAcceptTimeAction2CreationTool());
		paletteContainer.add(createOpaqueAction3CreationTool());
		paletteContainer.add(createCreateObjectAction4CreationTool());
		paletteContainer.add(createAddFeatureValueAction5CreationTool());
		paletteContainer.add(createCallBehaviorAction6CreationTool());
		paletteContainer.add(createCallOperationAction7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Objects" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createObjects4Group() {
		org.eclipse.gef.palette.PaletteDrawer paletteContainer = new org.eclipse.gef.palette.PaletteDrawer(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin
				.getString("Objects4Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("Objects4Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createDatastore1CreationTool());
		paletteContainer.add(createCentralBuffer2CreationTool());
		paletteContainer.add(createPin3CreationTool());
		paletteContainer.add(createOutputPin4CreationTool());
		paletteContainer.add(createInputPin5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Control Nodes" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createControlNodes2Group() {
		org.eclipse.gef.palette.PaletteDrawer paletteContainer = new org.eclipse.gef.palette.PaletteDrawer(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin
				.getString("ControlNodes2Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ControlNodes2Group.desc")); //$NON-NLS-1$
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
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createControlFlow1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.ControlFlow_4001);
		LinkToolEntry entry = new LinkToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ControlFlow1CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ControlFlow1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.ControlFlow_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createObjectFlow2CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.ObjectFlow_4002);
		LinkToolEntry entry = new LinkToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ObjectFlow2CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ObjectFlow2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.ObjectFlow_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createStructuredActivityNode1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.StructuredActivityNode_2007);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("StructuredActivityNode1CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("StructuredActivityNode1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.StructuredActivityNode_2007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createAcceptEventAction1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.AcceptEventAction_2001);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("AcceptEventAction1CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("AcceptEventAction1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.AcceptEventAction_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createAcceptTimeAction2CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.AcceptEventAction_2002);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("AcceptTimeAction2CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("AcceptTimeAction2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.AcceptEventAction_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createOpaqueAction3CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.OpaqueAction_2010);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("OpaqueAction3CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("OpaqueAction3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.OpaqueAction_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createCreateObjectAction4CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.CreateObjectAction_2015);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("CreateObjectAction4CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("CreateObjectAction4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.CreateObjectAction_2015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createAddFeatureValueAction5CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.AddStructuralFeatureValueAction_2016);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("AddFeatureValueAction5CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("AddFeatureValueAction5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes
				.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.AddStructuralFeatureValueAction_2016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createCallBehaviorAction6CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.CallBehaviorAction_2017);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("CallBehaviorAction6CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("CallBehaviorAction6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.CallBehaviorAction_2017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createCallOperationAction7CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.CallOperationAction_2018);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("CallOperationAction7CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("CallOperationAction7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.CallOperationAction_2018));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createDatastore1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.DataStoreNode_2008);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("Datastore1CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("Datastore1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.DataStoreNode_2008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createCentralBuffer2CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.CentralBufferNode_2009);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("CentralBuffer2CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("CentralBuffer2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.CentralBufferNode_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createPin3CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.Pin_2014);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("Pin3CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("Pin3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.Pin_2014));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createOutputPin4CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(3);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.OutputPin_3001);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.OutputPin_3002);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.OutputPin_3006);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("OutputPin4CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("OutputPin4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.OutputPin_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createInputPin5CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(5);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.InputPin_3003);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.InputPin_3004);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.InputPin_3005);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.InputPin_3007);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.InputPin_3008);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("InputPin5CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("InputPin5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.InputPin_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createActivityFinalNode1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.ActivityFinalNode_2003);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ActivityFinalNode1CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ActivityFinalNode1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.ActivityFinalNode_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createActivityInitialNode2CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.InitialNode_2006);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ActivityInitialNode2CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ActivityInitialNode2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.InitialNode_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createFlowFinalNode3CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.FlowFinalNode_2011);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("FlowFinalNode3CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("FlowFinalNode3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.FlowFinalNode_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createDecisionNode4CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.DecisionNode_2004);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("DecisionNode4CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("DecisionNode4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.DecisionNode_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createMergeNode5CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.MergeNode_2005);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("MergeNode5CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("MergeNode5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.MergeNode_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createForkNode6CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.ForkNode_2012);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ForkNode6CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("ForkNode6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.ForkNode_2012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createJoinNode7CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.JoinNode_2013);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("JoinNode7CreationTool.title"), org.eclipse.uml2.diagram.activity.part.UMLDiagramEditorPlugin.getString("JoinNode7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.activity.providers.UMLElementTypes.JoinNode_2013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private static class NodeToolEntry extends org.eclipse.gef.palette.ToolEntry {

		/**
		 * @generated
		 */
		private final java.util.List elementTypes;

		/**
		 * @generated
		 */
		private NodeToolEntry(String title, String description, java.util.List elementTypes) {
			super(title, description, null, null);
			this.elementTypes = elementTypes;
		}

		/**
		 * @generated
		 */
		public org.eclipse.gef.Tool createTool() {
			org.eclipse.gef.Tool tool = new org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}

	/**
	 * @generated
	 */
	private static class LinkToolEntry extends org.eclipse.gef.palette.ToolEntry {

		/**
		 * @generated
		 */
		private final java.util.List relationshipTypes;

		/**
		 * @generated
		 */
		private LinkToolEntry(String title, String description, java.util.List relationshipTypes) {
			super(title, description, null, null);
			this.relationshipTypes = relationshipTypes;
		}

		/**
		 * @generated
		 */
		public org.eclipse.gef.Tool createTool() {
			org.eclipse.gef.Tool tool = new org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool(relationshipTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}
	}
}
