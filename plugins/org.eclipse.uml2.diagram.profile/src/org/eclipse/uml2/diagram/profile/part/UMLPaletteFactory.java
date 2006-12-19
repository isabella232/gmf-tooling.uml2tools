package org.eclipse.uml2.diagram.profile.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createProfiles1Group());
		paletteRoot.add(createUML2Group());
	}

	/**
	 * Creates "Profiles" palette tool group
	 * @generated
	 */
	private PaletteContainer createProfiles1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(UMLDiagramEditorPlugin.getString("Profiles1Group.title")); //$NON-NLS-1$
		paletteContainer.add(createProfile1CreationTool());
		paletteContainer.add(createStereotype2CreationTool());
		paletteContainer.add(createMetaclass3CreationTool());
		paletteContainer.add(createExtension4CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "UML" palette tool group
	 * @generated
	 */
	private PaletteContainer createUML2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(UMLDiagramEditorPlugin.getString("UML2Group.title")); //$NON-NLS-1$
		paletteContainer.add(createEnumeration1CreationTool());
		paletteContainer.add(createGeneralization2CreationTool());
		paletteContainer.add(createProperty3CreationTool());
		paletteContainer.add(createConstraint4CreationTool());
		paletteContainer.add(createLiteral5CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProfile1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Profile_2002);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Profile1CreationTool.title"), UMLDiagramEditorPlugin.getString("Profile1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Profile_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStereotype2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Stereotype_2001);
		types.add(UMLElementTypes.Stereotype_3003);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Stereotype2CreationTool.title"), UMLDiagramEditorPlugin.getString("Stereotype2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Stereotype_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetaclass3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ElementImport_2006);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Metaclass3CreationTool.title"), UMLDiagramEditorPlugin.getString("Metaclass3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ElementImport_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtension4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Extension_4002);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("Extension4CreationTool.title"), UMLDiagramEditorPlugin.getString("Extension4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Extension_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumeration1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Enumeration_2003);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Enumeration1CreationTool.title"), UMLDiagramEditorPlugin.getString("Enumeration1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Enumeration_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Generalization_4001);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("Generalization2CreationTool.title"), UMLDiagramEditorPlugin.getString("Generalization2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Generalization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Property_3001);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Property3CreationTool.title"), UMLDiagramEditorPlugin.getString("Property3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Property_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Constraint_3008);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Constraint4CreationTool.title"), UMLDiagramEditorPlugin.getString("Constraint4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Constraint_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLiteral5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.EnumerationLiteral_3005);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Literal5CreationTool.title"), UMLDiagramEditorPlugin.getString("Literal5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.EnumerationLiteral_3005));
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
