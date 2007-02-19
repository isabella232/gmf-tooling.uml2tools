package org.eclipse.uml2.diagram.statemachine.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createLinks2Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(UMLDiagramEditorPlugin.getString("Nodes1Group.title")); //$NON-NLS-1$
		paletteContainer.add(createState1Group());
		paletteContainer.add(createRegion2CreationTool());
		paletteContainer.add(createFinalState3CreationTool());
		paletteContainer.add(createInitial4CreationTool());
		paletteContainer.add(createShallowHistory5CreationTool());
		paletteContainer.add(createDeepHistory6CreationTool());
		paletteContainer.add(createFork7CreationTool());
		paletteContainer.add(createJoin8CreationTool());
		paletteContainer.add(createJunction9CreationTool());
		paletteContainer.add(createChoice10CreationTool());
		paletteContainer.add(createTerminate11CreationTool());
		paletteContainer.add(createEntryPoint12CreationTool());
		paletteContainer.add(createExitPoint13CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Links2Group.title")); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "State" palette tool group
	 * @generated
	 */
	private PaletteContainer createState1Group() {
		PaletteStack paletteContainer = new PaletteStack(UMLDiagramEditorPlugin.getString("State1Group.title"), null, null); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("State1Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createSimpleState1CreationTool());
		paletteContainer.add(createCompositeState2CreationTool());
		paletteContainer.add(createSubmachineState3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegion2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Region_3013);
		types.add(UMLElementTypes.Region_3002);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Region2CreationTool.title"), UMLDiagramEditorPlugin.getString("Region2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Region_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalState3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.FinalState_3003);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("FinalState3CreationTool.title"), UMLDiagramEditorPlugin.getString("FinalState3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.FinalState_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitial4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3004);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Initial4CreationTool.title"), UMLDiagramEditorPlugin.getString("Initial4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Pseudostate_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShallowHistory5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3005);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("ShallowHistory5CreationTool.title"), UMLDiagramEditorPlugin.getString("ShallowHistory5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_shallowHistory.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_shallowHistory.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeepHistory6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3006);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("DeepHistory6CreationTool.title"), UMLDiagramEditorPlugin.getString("DeepHistory6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_deepHistory.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_deepHistory.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFork7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3007);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Fork7CreationTool.title"), UMLDiagramEditorPlugin.getString("Fork7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_fork.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_fork.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoin8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3008);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Join8CreationTool.title"), UMLDiagramEditorPlugin.getString("Join8CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_join.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_join.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunction9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3009);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Junction9CreationTool.title"), UMLDiagramEditorPlugin.getString("Junction9CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_junction.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_junction.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3010);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Choice10CreationTool.title"), UMLDiagramEditorPlugin.getString("Choice10CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_choice.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_choice.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTerminate11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3011);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Terminate11CreationTool.title"), UMLDiagramEditorPlugin.getString("Terminate11CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_terminate.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_terminate.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryPoint12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3014);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("EntryPoint12CreationTool.title"), UMLDiagramEditorPlugin.getString("EntryPoint12CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_entryPoint.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_entryPoint.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitPoint13CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Pseudostate_3015);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("ExitPoint13CreationTool.title"), UMLDiagramEditorPlugin.getString("ExitPoint13CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_exitPoint.gif")); //$NON-NLS-1$
		entry.setLargeIcon(UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_exitPoint.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Transition_4001);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("Transition1CreationTool.title"), UMLDiagramEditorPlugin.getString("Transition1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSimpleState1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.State_3001);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("SimpleState1CreationTool.title"), UMLDiagramEditorPlugin.getString("SimpleState1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.State_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeState2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.State_3012);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("CompositeState2CreationTool.title"), UMLDiagramEditorPlugin.getString("CompositeState2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.State_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSubmachineState3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.State_3016);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("SubmachineState3CreationTool.title"), UMLDiagramEditorPlugin.getString("SubmachineState3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.State_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		entry.setToolClass(CreateSubmachineStateTool.class);
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
		public Tool createToolGen() {
			Tool tool = new UnspecifiedTypeCreationTool(elementTypes);
			tool.setProperties(getToolProperties());
			return tool;
		}

		/**
		 * @generated NOT
		 */
		public Tool createTool() {
			Tool tool = super.createTool();
			if (tool != null) {
				return tool;
			}
			return createToolGen();
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
