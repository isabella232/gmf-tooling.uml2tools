package org.eclipse.uml2.diagram.profile.part;

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
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Profile_2002);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Profile_2002);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Profile1CreationTool.title"), UMLDiagramEditorPlugin.getString("Profile1CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStereotype2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Stereotype_2001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Stereotype_2001);
		elementTypes.add(UMLElementTypes.Stereotype_3003);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Stereotype2CreationTool.title"), UMLDiagramEditorPlugin.getString("Stereotype2CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetaclass3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.ElementImport_2006);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.ElementImport_2006);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Metaclass3CreationTool.title"), UMLDiagramEditorPlugin.getString("Metaclass3CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtension4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Extension_4002);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(UMLElementTypes.Extension_4002);
		ToolEntry result = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("Extension4CreationTool.title"), UMLDiagramEditorPlugin.getString("Extension4CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumeration1CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Enumeration_2003);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Enumeration_2003);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Enumeration1CreationTool.title"), UMLDiagramEditorPlugin.getString("Enumeration1CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization2CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Generalization_4001);

		largeImage = smallImage;

		final List relationshipTypes = new ArrayList();
		relationshipTypes.add(UMLElementTypes.Generalization_4001);
		ToolEntry result = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("Generalization2CreationTool.title"), UMLDiagramEditorPlugin.getString("Generalization2CreationTool.desc"), smallImage, largeImage, relationshipTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty3CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Property_3001);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Property_3001);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Property3CreationTool.title"), UMLDiagramEditorPlugin.getString("Property3CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint4CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.Constraint_3008);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.Constraint_3008);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Constraint4CreationTool.title"), UMLDiagramEditorPlugin.getString("Constraint4CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

		return result;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLiteral5CreationTool() {
		ImageDescriptor smallImage;
		ImageDescriptor largeImage;

		smallImage = UMLElementTypes.getImageDescriptor(UMLElementTypes.EnumerationLiteral_3005);

		largeImage = smallImage;

		final List elementTypes = new ArrayList();
		elementTypes.add(UMLElementTypes.EnumerationLiteral_3005);
		ToolEntry result = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("Literal5CreationTool.title"), UMLDiagramEditorPlugin.getString("Literal5CreationTool.desc"), smallImage, largeImage, elementTypes); //$NON-NLS-1$ $NON-NLS-2$

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
