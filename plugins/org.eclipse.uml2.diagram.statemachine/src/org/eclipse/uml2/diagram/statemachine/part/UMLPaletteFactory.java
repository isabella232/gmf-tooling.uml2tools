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
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Nodes1Group.title")); //$NON-NLS-1$
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
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(UMLDiagramEditorPlugin.getString("Links2Group.title")); //$NON-NLS-1$
		paletteContainer.add(createTransition1CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSimpleState1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.State_3001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.State_3001);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("SimpleState1CreationTool.title"), UMLDiagramEditorPlugin.getString("SimpleState1CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeState2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.State_3012);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.State_3012);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("CompositeState2CreationTool.title"), UMLDiagramEditorPlugin.getString("CompositeState2CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRegion3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Region_2001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Region_2001);
		elementTypes.add(UMLElementTypes.Region_3002);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Region3CreationTool.title"), UMLDiagramEditorPlugin.getString("Region3CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFinalState4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.FinalState_3003);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.FinalState_3003);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("FinalState4CreationTool.title"), UMLDiagramEditorPlugin.getString("FinalState4CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInitial5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Pseudostate_3004);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3004);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Initial5CreationTool.title"), UMLDiagramEditorPlugin.getString("Initial5CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createShallowHistory6CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_shallowHistory.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_shallowHistory.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3005);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("ShallowHistory6CreationTool.title"), UMLDiagramEditorPlugin.getString("ShallowHistory6CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDeepHistory7CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_deepHistory.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_deepHistory.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3006);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("DeepHistory7CreationTool.title"), UMLDiagramEditorPlugin.getString("DeepHistory7CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFork8CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_fork.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_fork.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3008);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Fork8CreationTool.title"), UMLDiagramEditorPlugin.getString("Fork8CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJoin9CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_join.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_join.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3007);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Join9CreationTool.title"), UMLDiagramEditorPlugin.getString("Join9CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createJunction10CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_junction.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_junction.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3009);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Junction10CreationTool.title"), UMLDiagramEditorPlugin.getString("Junction10CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createChoice11CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_choice.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_choice.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3010);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Choice11CreationTool.title"), UMLDiagramEditorPlugin.getString("Choice11CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTerminate12CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_terminate.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_terminate.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_3011);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Terminate12CreationTool.title"), UMLDiagramEditorPlugin.getString("Terminate12CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEntryPoint13CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_entryPoint.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_entryPoint.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_2002);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("EntryPoint13CreationTool.title"), UMLDiagramEditorPlugin.getString("EntryPoint13CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExitPoint14CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_exitPoint.gif"); //$NON-NLS-1$

		largeImage = UMLDiagramEditorPlugin.findImageDescriptor("/org.eclipse.uml2.uml.edit/icons/full/obj16/Pseudostate_exitPoint.gif"); //$NON-NLS-1$

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Pseudostate_2003);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("ExitPoint14CreationTool.title"), UMLDiagramEditorPlugin.getString("ExitPoint14CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

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
		ToolEntry result = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("Transition1CreationTool.title"), UMLDiagramEditorPlugin.getString("Transition1CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

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
