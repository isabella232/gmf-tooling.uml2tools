package org.eclipse.uml2.diagram.statemachine.part;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(org.eclipse.gef.palette.PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createLinks2Group());
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createLinks2Group() {
		org.eclipse.gef.palette.PaletteDrawer paletteContainer = new org.eclipse.gef.palette.PaletteDrawer(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin
				.getString("Links2Group.title")); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createNodes1Group() {
		org.eclipse.gef.palette.PaletteDrawer paletteContainer = new org.eclipse.gef.palette.PaletteDrawer(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin
				.getString("Nodes1Group.title")); //$NON-NLS-1$
		paletteContainer.add(createSimpleState1CreationTool());
		paletteContainer.add(createCompositeState2CreationTool());
		paletteContainer.add(createRegion3CreationTool());
		paletteContainer.add(createFinalState4CreationTool());
		paletteContainer.add(createInitial5CreationTool());
		paletteContainer.add(createShallowHistory6CreationTool());
		paletteContainer.add(createDeepHistory7CreationTool());
		paletteContainer.add(createFork8CreationTool());
		paletteContainer.add(createJoin9CreationTool());
		paletteContainer.add(createJunction10CreationTool());
		paletteContainer.add(createChoice11CreationTool());
		paletteContainer.add(createTerminate12CreationTool());
		paletteContainer.add(createEntryPoint13CreationTool());
		paletteContainer.add(createExitPoint14CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createTransition1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Transition_4001);
		LinkToolEntry entry = new LinkToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Transition1CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Transition1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createSimpleState1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.State_3001);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("SimpleState1CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("SimpleState1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.State_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createCompositeState2CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.State_3012);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("CompositeState2CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("CompositeState2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.State_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createRegion3CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(2);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Region_2001);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Region_3002);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Region3CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Region3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Region_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createFinalState4CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.FinalState_3003);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("FinalState4CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("FinalState4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.FinalState_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createInitial5CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3004);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Initial5CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Initial5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createShallowHistory6CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3005);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("ShallowHistory6CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("ShallowHistory6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_shallowHistory.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_shallowHistory.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createDeepHistory7CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3006);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("DeepHistory7CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("DeepHistory7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_deepHistory.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_deepHistory.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createFork8CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3008);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Fork8CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Fork8CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_fork.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_fork.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createJoin9CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3007);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Join9CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Join9CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_join.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_join.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createJunction10CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3009);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Junction10CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Junction10CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_junction.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_junction.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createChoice11CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3010);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Choice11CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Choice11CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_choice.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_choice.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createTerminate12CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_3011);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Terminate12CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("Terminate12CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_terminate.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_terminate.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createEntryPoint13CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_2002);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("EntryPoint13CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("EntryPoint13CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_entryPoint.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_entryPoint.gif")); //$NON-NLS-1$
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createExitPoint14CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes.Pseudostate_2003);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("ExitPoint14CreationTool.title"), org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.getString("ExitPoint14CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_exitPoint.gif")); //$NON-NLS-1$
		entry.setLargeIcon(org.eclipse.uml2.diagram.statemachine.part.UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_exitPoint.gif")); //$NON-NLS-1$
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
