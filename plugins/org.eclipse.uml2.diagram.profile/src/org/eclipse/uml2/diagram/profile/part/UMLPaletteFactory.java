package org.eclipse.uml2.diagram.profile.part;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(org.eclipse.gef.palette.PaletteRoot paletteRoot) {
		paletteRoot.add(createProfiles1Group());
		paletteRoot.add(createUML2Group());
	}

	/**
	 * Creates "UML" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createUML2Group() {
		org.eclipse.gef.palette.PaletteGroup paletteContainer = new org.eclipse.gef.palette.PaletteGroup(org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("UML2Group.title")); //$NON-NLS-1$
		paletteContainer.add(createEnumeration1CreationTool());
		paletteContainer.add(createGeneralization2CreationTool());
		paletteContainer.add(createProperty3CreationTool());
		paletteContainer.add(createConstraint4CreationTool());
		paletteContainer.add(createLiteral5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Profiles" palette tool group
	 * @generated
	 */
	private org.eclipse.gef.palette.PaletteContainer createProfiles1Group() {
		org.eclipse.gef.palette.PaletteGroup paletteContainer = new org.eclipse.gef.palette.PaletteGroup(org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Profiles1Group.title")); //$NON-NLS-1$
		paletteContainer.add(createProfile1CreationTool());
		paletteContainer.add(createStereotype2CreationTool());
		paletteContainer.add(createMetaclass3CreationTool());
		paletteContainer.add(createExtension4CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createEnumeration1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Enumeration_2003);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Enumeration1CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Enumeration1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Enumeration_2003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createGeneralization2CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Generalization_4001);
		LinkToolEntry entry = new LinkToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Generalization2CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Generalization2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Generalization_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createProperty3CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Property_3001);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Property3CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Property3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Property_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createConstraint4CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Constraint_3008);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Constraint4CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Constraint4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Constraint_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createLiteral5CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.EnumerationLiteral_3005);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Literal5CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Literal5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.EnumerationLiteral_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createProfile1CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Profile_2002);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Profile1CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Profile1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Profile_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createStereotype2CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(2);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Stereotype_2001);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Stereotype_3003);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Stereotype2CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Stereotype2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Stereotype_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createMetaclass3CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.ElementImport_2006);
		NodeToolEntry entry = new NodeToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Metaclass3CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Metaclass3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.ElementImport_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private org.eclipse.gef.palette.ToolEntry createExtension4CreationTool() {
		java.util.List/*<IElementType>*/types = new java.util.ArrayList/*<IElementType>*/(1);
		types.add(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Extension_4002);
		LinkToolEntry entry = new LinkToolEntry(
				org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Extension4CreationTool.title"), org.eclipse.uml2.diagram.profile.part.UMLDiagramEditorPlugin.getString("Extension4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.getImageDescriptor(org.eclipse.uml2.diagram.profile.providers.UMLElementTypes.Extension_4002));
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
