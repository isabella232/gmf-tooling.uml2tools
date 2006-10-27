package org.eclipse.uml2.diagram.component.part;

import java.util.List;
import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.jface.resource.ImageDescriptor;
import java.util.ArrayList;

import org.eclipse.gef.palette.PaletteGroup;

import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;

import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;

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
		PaletteContainer paletteContainer = new PaletteGroup("Nodes");
		paletteContainer.setDescription("Diagram Nodes");
		paletteContainer.add(createComponent1CreationTool());
		paletteContainer.add(createArtifact2CreationTool());
		paletteContainer.add(createInterface3CreationTool());
		paletteContainer.add(createPort4CreationTool());
		paletteContainer.add(createClass5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private PaletteContainer createLinks2Group() {
		PaletteContainer paletteContainer = new PaletteGroup("Links");
		paletteContainer.setDescription("Diagram Links");
		paletteContainer.add(createProvidedInterface1CreationTool());
		paletteContainer.add(createRequiredInterface2CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComponent1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Component_2001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Component_2001);
		elementTypes.add(UMLElementTypes.Component_3001);
		ToolEntry result = new NodeToolEntry("Component", "Create Component", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createArtifact2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Artifact_3003);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Artifact_3003);
		elementTypes.add(UMLElementTypes.Artifact_2002);
		ToolEntry result = new NodeToolEntry("Artifact", "Create Artifact", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterface3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Interface_3005);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Interface_3005);
		elementTypes.add(UMLElementTypes.Interface_2003);
		ToolEntry result = new NodeToolEntry("Interface", "Create Component Interface", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Port_3002);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Port_3002);
		ToolEntry result = new NodeToolEntry("Port", "Create Port", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Class_3004);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Class_3004);
		elementTypes.add(UMLElementTypes.Class_2004);
		ToolEntry result = new NodeToolEntry("Class", "Create Class", smallImage, largeImage, elementTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProvidedInterface1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.InterfaceRealization_4001);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(UMLElementTypes.InterfaceRealization_4001);
		relationshipTypes.add(UMLElementTypes.PortProvided_4006);
		ToolEntry result = new LinkToolEntry("Provided Interface", "Create Provided Interface", smallImage, largeImage, relationshipTypes);

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequiredInterface2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.PortRequired_4004);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(UMLElementTypes.PortRequired_4004);
		ToolEntry result = new LinkToolEntry("Required Interface", "Create Required Interface", smallImage, largeImage, relationshipTypes);

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
