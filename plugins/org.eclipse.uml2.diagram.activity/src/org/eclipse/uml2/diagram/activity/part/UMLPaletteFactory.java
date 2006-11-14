package org.eclipse.uml2.diagram.activity.part;

import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import java.util.ArrayList;

import org.eclipse.gef.palette.PaletteDrawer;

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
	 * @generated
	 */
	private PaletteContainer createActions1Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Actions");
		paletteContainer.setDescription("Actions");
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
	 * @generated
	 */
	private PaletteContainer createControlNodes2Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Control Nodes");
		paletteContainer.setDescription("Control Nodes");
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
	private PaletteContainer createStructuredActivities3Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Structured Activities");
		paletteContainer.setDescription("Structured Activities");
		paletteContainer.add(createStructuredActivityNode1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createObjects4Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Objects");
		paletteContainer.setDescription("Objects");
		paletteContainer.add(createDatastore1CreationTool());
		paletteContainer.add(createCentralBuffer2CreationTool());
		paletteContainer.add(createPin3CreationTool());
		paletteContainer.add(createOutputPin4CreationTool());
		paletteContainer.add(createInputPin5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createEdges5Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Edges");
		paletteContainer.setDescription("Edges");
		paletteContainer.add(createControlFlow1CreationTool());
		paletteContainer.add(createObjectFlow2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcceptEventAction1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.AcceptEventAction_2001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.AcceptEventAction_2001);
		ToolEntry result = new NodeToolEntry("Accept Event Action", "Create Accept Event Action", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAcceptTimeAction2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.AcceptEventAction_2002);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.AcceptEventAction_2002);
		ToolEntry result = new NodeToolEntry("Accept Time Action", "Create Accept Time Action", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOpaqueAction3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.OpaqueAction_2010);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.OpaqueAction_2010);
		ToolEntry result = new NodeToolEntry("Opaque Action", "Create Opaque Action", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCreateObjectAction4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.CreateObjectAction_2015);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.CreateObjectAction_2015);
		ToolEntry result = new NodeToolEntry("Create Object Action", "Create Create Object Action", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAddFeatureValueAction5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.AddStructuralFeatureValueAction_2016);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.AddStructuralFeatureValueAction_2016);
		ToolEntry result = new NodeToolEntry("Add Feature Value Action", "Create Add Feature Value Action", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallBehaviorAction6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.CallBehaviorAction_2017);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.CallBehaviorAction_2017);
		ToolEntry result = new NodeToolEntry("Call Behavior Action", "Create Call Behavior Action", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCallOperationAction7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.CallOperationAction_2018);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.CallOperationAction_2018);
		ToolEntry result = new NodeToolEntry("Call Operation Action", "Create Call Operation Action", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityFinalNode1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.ActivityFinalNode_2003);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.ActivityFinalNode_2003);
		ToolEntry result = new NodeToolEntry("Activity Final Node", "Create Activity Final Node", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActivityInitialNode2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.InitialNode_2006);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.InitialNode_2006);
		ToolEntry result = new NodeToolEntry("Activity Initial Node", "Create Activity Initial Node", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFlowFinalNode3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.FlowFinalNode_2011);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.FlowFinalNode_2011);
		ToolEntry result = new NodeToolEntry("Flow Final Node", "Create Flow Final Node", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDecisionNode4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.DecisionNode_2004);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.DecisionNode_2004);
		ToolEntry result = new NodeToolEntry("Decision Node", "Create Decision Node", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMergeNode5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.MergeNode_2005);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.MergeNode_2005);
		ToolEntry result = new NodeToolEntry("Merge Node", "Create Merge Node", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createForkNode6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.ForkNode_2012);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.ForkNode_2012);
		ToolEntry result = new NodeToolEntry("Fork Node", "Create Fork Node", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoinNode7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.JoinNode_2013);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.JoinNode_2013);
		ToolEntry result = new NodeToolEntry("Join Node", "Create Join Node", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStructuredActivityNode1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.StructuredActivityNode_2007);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.StructuredActivityNode_2007);
		ToolEntry result = new NodeToolEntry("Structured Activity Node", "Creare Structured Activity Node", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDatastore1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.DataStoreNode_2008);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.DataStoreNode_2008);
		ToolEntry result = new NodeToolEntry("Datastore", "Create Datastore", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCentralBuffer2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.CentralBufferNode_2009);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.CentralBufferNode_2009);
		ToolEntry result = new NodeToolEntry("Central Buffer", "Create Central Buffer", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPin3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Pin_2014);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pin_2014);
		ToolEntry result = new NodeToolEntry("Pin", "Create Pin", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOutputPin4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.OutputPin_3001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.OutputPin_3001);
		elementTypes.add(UMLElementTypes.OutputPin_3002);
		elementTypes.add(UMLElementTypes.OutputPin_3006);
		ToolEntry result = new NodeToolEntry("Output Pin", "Create Output Pin", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInputPin5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.InputPin_3003);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.InputPin_3003);
		elementTypes.add(UMLElementTypes.InputPin_3004);
		elementTypes.add(UMLElementTypes.InputPin_3005);
		elementTypes.add(UMLElementTypes.InputPin_3007);
		elementTypes.add(UMLElementTypes.InputPin_3008);
		ToolEntry result = new NodeToolEntry("Input Pin", "Create Input Pin", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createControlFlow1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.ControlFlow_4001);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(UMLElementTypes.ControlFlow_4001);
		ToolEntry result = new LinkToolEntry("Control Flow", "Create Control Flow", smallImage, largeImage, relationshipTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createObjectFlow2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.ObjectFlow_4002);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(UMLElementTypes.ObjectFlow_4002);
		ToolEntry result = new LinkToolEntry("Object Flow", "Create Object Flow", smallImage, largeImage, relationshipTypes);

		return result;
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
		private NodeToolEntry(String title, String description, ImageDescriptor smallIcon, ImageDescriptor largeIcon, List elementTypes) {
			super(title, description, smallIcon, largeIcon);
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
		private LinkToolEntry(String title, String description, ImageDescriptor smallIcon, ImageDescriptor largeIcon, List relationshipTypes) {
			super(title, description, smallIcon, largeIcon);
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
