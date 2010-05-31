package org.eclipse.uml2.diagram.profile.part;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.uml2.diagram.common.part.LinkToolEntry;
import org.eclipse.uml2.diagram.common.part.NodeToolEntry;
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
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Profiles1Group_title);
		paletteContainer.setId("createProfiles1Group"); //$NON-NLS-1$

		paletteContainer.add(createProfile1CreationTool());
		paletteContainer.add(createStereotype2CreationTool());
		paletteContainer.add(createMetaclass3CreationTool());
		paletteContainer.add(createExtension4CreationTool());
		paletteContainer.add(createImage5CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "UML" palette tool group
	 * @generated
	 */
	private PaletteContainer createUML2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.UML2Group_title);
		paletteContainer.setId("createUML2Group"); //$NON-NLS-1$

		paletteContainer.add(createEnumeration1CreationTool());
		paletteContainer.add(createGeneralization2CreationTool());
		paletteContainer.add(createProperty3CreationTool());
		paletteContainer.add(createOCLConstraint4CreationTool());
		paletteContainer.add(createLiteral5CreationTool());
		paletteContainer.add(createElementImport6CreationTool());
		paletteContainer.add(createConstrainedElement7CreationTool());
		paletteContainer.add(createComment8CreationTool());
		paletteContainer.add(createAnnotatedElement9CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProfile1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Profile1CreationTool_title, Messages.Profile1CreationTool_desc, Collections.singletonList(UMLElementTypes.Profile_2002));

		entry.setId("createProfile1CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Profile_2002));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStereotype2CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Stereotype_2001);
		types.add(UMLElementTypes.Stereotype_3003);
		NodeToolEntry entry = new NodeToolEntry(Messages.Stereotype2CreationTool_title, Messages.Stereotype2CreationTool_desc, types);

		entry.setId("createStereotype2CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Stereotype_2001));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMetaclass3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Metaclass3CreationTool_title, Messages.Metaclass3CreationTool_desc, Collections.singletonList(UMLElementTypes.ElementImport_2006));

		entry.setId("createMetaclass3CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ElementImport_2006));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createExtension4CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Extension4CreationTool_title, Messages.Extension4CreationTool_desc, Collections.singletonList(UMLElementTypes.Extension_4002));

		entry.setId("createExtension4CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Extension_4002));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createImage5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Image5CreationTool_title, Messages.Image5CreationTool_desc, Collections.singletonList(UMLElementTypes.Image_3010));

		entry.setId("createImage5CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Image_3010));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumeration1CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Enumeration1CreationTool_title, Messages.Enumeration1CreationTool_desc, Collections.singletonList(UMLElementTypes.Enumeration_2003));

		entry.setId("createEnumeration1CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Enumeration_2003));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGeneralization2CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.Generalization2CreationTool_title, Messages.Generalization2CreationTool_desc, Collections.singletonList(UMLElementTypes.Generalization_4001));

		entry.setId("createGeneralization2CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Generalization_4001));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createProperty3CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Property3CreationTool_title, Messages.Property3CreationTool_desc, Collections.singletonList(UMLElementTypes.Property_3001));

		entry.setId("createProperty3CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Property_3001));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOCLConstraint4CreationTool() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.Constraint_3008);
		types.add(UMLElementTypes.Constraint_2008);
		NodeToolEntry entry = new NodeToolEntry(Messages.OCLConstraint4CreationTool_title, Messages.OCLConstraint4CreationTool_desc, types);

		entry.setId("createOCLConstraint4CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Constraint_3008));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLiteral5CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Literal5CreationTool_title, Messages.Literal5CreationTool_desc, Collections.singletonList(UMLElementTypes.EnumerationLiteral_3005));

		entry.setId("createLiteral5CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.EnumerationLiteral_3005));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createElementImport6CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.ElementImport6CreationTool_title, Messages.ElementImport6CreationTool_desc, Collections.singletonList(UMLElementTypes.ElementImport_3009));

		entry.setId("createElementImport6CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ElementImport_3009));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstrainedElement7CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.ConstrainedElement7CreationTool_title, Messages.ConstrainedElement7CreationTool_desc,
				Collections.singletonList(UMLElementTypes.ConstraintConstrainedElement_4003));

		entry.setId("createConstrainedElement7CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ConstraintConstrainedElement_4003));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createComment8CreationTool() {
		NodeToolEntry entry = new NodeToolEntry(Messages.Comment8CreationTool_title, Messages.Comment8CreationTool_desc, Collections.singletonList(UMLElementTypes.Comment_2009));

		entry.setId("createComment8CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Comment_2009));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAnnotatedElement9CreationTool() {
		LinkToolEntry entry = new LinkToolEntry(Messages.AnnotatedElement9CreationTool_title, Messages.AnnotatedElement9CreationTool_desc,
				Collections.singletonList(UMLElementTypes.CommentAnnotatedElement_4004));

		entry.setId("createAnnotatedElement9CreationTool"); //$NON-NLS-1$

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CommentAnnotatedElement_4004));

		entry.setLargeIcon(entry.getSmallIcon());

		return entry;
	}
}
