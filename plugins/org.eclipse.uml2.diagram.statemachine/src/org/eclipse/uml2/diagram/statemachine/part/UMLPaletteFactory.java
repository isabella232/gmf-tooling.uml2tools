package org.eclipse.uml2.diagram.statemachine.part;

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
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Nodes");
		paletteContainer.add(createState1CreationTool());
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
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteContainer paletteContainer = new PaletteDrawer("Links");
		paletteContainer.add(createTransition1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createState1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.State_3001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.State_3001);
		ToolEntry result = new NodeToolEntry("State", "Create new State", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegion2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Region_2001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Region_2001);
		elementTypes.add(UMLElementTypes.Region_3002);
		ToolEntry result = new NodeToolEntry("Region", "Create new Region", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalState3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.FinalState_3003);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.FinalState_3003);
		ToolEntry result = new NodeToolEntry("Final State", "Create Final State", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitial4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Pseudostate_3004);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3004);
		ToolEntry result = new NodeToolEntry("Initial", "Create Initial Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShallowHistory5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_shallowHistory.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_shallowHistory.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3005);
		ToolEntry result = new NodeToolEntry("Shallow History", "Create Shallow History Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeepHistory6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_deepHistory.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_deepHistory.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3006);
		ToolEntry result = new NodeToolEntry("Deep History", "Create Deep History Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFork7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_fork.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_fork.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3008);
		ToolEntry result = new NodeToolEntry("Fork", "Create Fork Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoin8CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_join.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_join.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3007);
		ToolEntry result = new NodeToolEntry("Join", "Create Join Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunction9CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_junction.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_junction.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3009);
		ToolEntry result = new NodeToolEntry("Junction", "Create Junction Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice10CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_choice.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_choice.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3010);
		ToolEntry result = new NodeToolEntry("Choice", "Create Choice Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTerminate11CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_terminate.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_terminate.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3011);
		ToolEntry result = new NodeToolEntry("Terminate", "Create Terminate Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryPoint12CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_entryPoint.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_entryPoint.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_2002);
		ToolEntry result = new NodeToolEntry("Entry Point", "Create Entry Point Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitPoint13CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_exitPoint.gif");

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_exitPoint.gif");

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_2003);
		ToolEntry result = new NodeToolEntry("Exit Point", "Create Exit Point Pseudostate", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTransition1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Transition_4001);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(UMLElementTypes.Transition_4001);
		ToolEntry result = new LinkToolEntry("Transition", "Create Transition", smallImage, largeImage, relationshipTypes);

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
