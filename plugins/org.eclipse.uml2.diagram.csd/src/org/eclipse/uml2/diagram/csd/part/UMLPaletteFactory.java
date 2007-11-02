package org.eclipse.uml2.diagram.csd.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.uml2.diagram.csd.providers.UMLElementTypes;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createChildren1Group());
		paletteRoot.add(createNodes2Group());
		paletteRoot.add(createLinks3Group());
	}

	/**
	 * Creates "Children" palette tool group
	 * @generated
	 */
	private PaletteContainer createChildren1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Children1Group_title);
		paletteContainer.setDescription(Messages.Children1Group_desc);
		paletteContainer.add(createElementImport1CreationTool());
		paletteContainer.add(createAttribute2CreationTool());
		paletteContainer.add(createOperation3CreationTool());
		paletteContainer.add(createPort4CreationTool());
		paletteContainer.add(createRole5CreationTool());
		paletteContainer.add(createCollaborationUse6CreationTool());
		paletteContainer.add(createSlot7CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Nodes2Group_title);
		paletteContainer.setDescription(Messages.Nodes2Group_desc);
		paletteContainer.add(createCollaboration1CreationTool());
		paletteContainer.add(createClass2CreationTool());
		paletteContainer.add(createInterface3CreationTool());
		paletteContainer.add(createInstanceSpecification4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Links3Group_title);
		paletteContainer.setDescription(Messages.Links3Group_desc);
		paletteContainer.add(createConnector1CreationTool());
		paletteContainer.add(createRoleBinding2CreationTool());
		paletteContainer.add(createProvidedInterface3CreationTool());
		paletteContainer.add(createRequiredInterface4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElementImport1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ElementImport_3004);
		NodeToolEntry entry = new NodeToolEntry(Messages.ElementImport1CreationTool_title, Messages.ElementImport1CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ElementImport_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Property_3008);
		NodeToolEntry entry = new NodeToolEntry(Messages.Attribute2CreationTool_title, Messages.Attribute2CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Property_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Operation_3009);
		NodeToolEntry entry = new NodeToolEntry(Messages.Operation3CreationTool_title, Messages.Operation3CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Operation_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Port_3011);
		NodeToolEntry entry = new NodeToolEntry(Messages.Port4CreationTool_title, Messages.Port4CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Port_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRole5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Property_3007);
		NodeToolEntry entry = new NodeToolEntry(Messages.Role5CreationTool_title, Messages.Role5CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Property_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollaborationUse6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.CollaborationUse_3002);
		NodeToolEntry entry = new NodeToolEntry(Messages.CollaborationUse6CreationTool_title, Messages.CollaborationUse6CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CollaborationUse_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSlot7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Slot_3015);
		NodeToolEntry entry = new NodeToolEntry(Messages.Slot7CreationTool_title, Messages.Slot7CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Slot_3015));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCollaboration1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Collaboration_2005);
		NodeToolEntry entry = new NodeToolEntry(Messages.Collaboration1CreationTool_title, Messages.Collaboration1CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Collaboration_2005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(UMLElementTypes.Class_2006);
		types.add(UMLElementTypes.Class_3010);
		types.add(UMLElementTypes.Property_3014);
		NodeToolEntry entry = new NodeToolEntry(Messages.Class2CreationTool_title, Messages.Class2CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Class_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterface3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Interface_2009);
		NodeToolEntry entry = new NodeToolEntry(Messages.Interface3CreationTool_title, Messages.Interface3CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Interface_2009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstanceSpecification4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.InstanceSpecification_2011);
		NodeToolEntry entry = new NodeToolEntry(Messages.InstanceSpecification4CreationTool_title, Messages.InstanceSpecification4CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InstanceSpecification_2011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConnector1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Connector_4005);
		LinkToolEntry entry = new LinkToolEntry(Messages.Connector1CreationTool_title, Messages.Connector1CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Connector_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRoleBinding2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Dependency_4006);
		LinkToolEntry entry = new LinkToolEntry(Messages.RoleBinding2CreationTool_title, Messages.RoleBinding2CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Dependency_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProvidedInterface3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.InterfaceRealization_4007);
		types.add(UMLElementTypes.PortProvided_4010);
		LinkToolEntry entry = new LinkToolEntry(Messages.ProvidedInterface3CreationTool_title, Messages.ProvidedInterface3CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InterfaceRealization_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequiredInterface4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Usage_4008);
		LinkToolEntry entry = new LinkToolEntry(Messages.RequiredInterface4CreationTool_title, Messages.RequiredInterface4CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Usage_4008));
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
