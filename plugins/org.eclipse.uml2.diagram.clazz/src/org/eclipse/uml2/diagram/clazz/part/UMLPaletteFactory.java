package org.eclipse.uml2.diagram.clazz.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.PaletteStack;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

/**
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createNodes1Group());
		paletteRoot.add(createChildren2Group());
		paletteRoot.add(createLinks3Group());
		paletteRoot.add(createInstances4Group());
	}

	/**
	 * Creates "Nodes" palette tool group
	 * @generated
	 */
	private PaletteContainer createNodes1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(UMLDiagramEditorPlugin.getString("Nodes1Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Nodes1Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createClass1CreationTool());
		paletteContainer.add(createPackage2CreationTool());
		paletteContainer.add(createEnumeration3CreationTool());
		paletteContainer.add(createDataType4CreationTool());
		paletteContainer.add(createPrimitiveType5CreationTool());
		paletteContainer.add(createConstraint6CreationTool());
		paletteContainer.add(createAssociationClass7CreationTool());
		paletteContainer.add(createInterface8CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Children" palette tool group
	 * @generated
	 */
	private PaletteContainer createChildren2Group() {
		PaletteGroup paletteContainer = new PaletteGroup(UMLDiagramEditorPlugin.getString("Children2Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Children2Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createAttribute1CreationTool());
		paletteContainer.add(createOperation2CreationTool());
		paletteContainer.add(createValueSpecification3CreationTool());
		paletteContainer.add(createEnumLiteral4CreationTool());
		paletteContainer.add(createPort5CreationTool());
		paletteContainer.add(createTemplateSignature6CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Links" palette tool group
	 * @generated
	 */
	private PaletteContainer createLinks3Group() {
		PaletteGroup paletteContainer = new PaletteGroup(UMLDiagramEditorPlugin.getString("Links3Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Links3Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createAssociation1Group());
		paletteContainer.add(createGeneralization2CreationTool());
		paletteContainer.add(createProvidedInterface3CreationTool());
		paletteContainer.add(createRequiredInterface4CreationTool());
		paletteContainer.add(createDependency5CreationTool());
		paletteContainer.add(createConstrainedElement6CreationTool());
		paletteContainer.add(createNAryDependencyTarget7CreationTool());
		paletteContainer.add(createNAryDependencySource8CreationTool());
		paletteContainer.add(createAssociationEnd9CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Instances" palette tool group
	 * @generated
	 */
	private PaletteContainer createInstances4Group() {
		PaletteGroup paletteContainer = new PaletteGroup(UMLDiagramEditorPlugin.getString("Instances4Group.title")); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Instances4Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createInstanceSpecification1CreationTool());
		paletteContainer.add(createSlot2CreationTool());
		return paletteContainer;
	}

	/**
	 * Creates "Association" palette tool group
	 * @generated
	 */
	private PaletteContainer createAssociation1Group() {
		PaletteStack paletteContainer = new PaletteStack(UMLDiagramEditorPlugin.getString("Association1Group.title"), null, null); //$NON-NLS-1$
		paletteContainer.setDescription(UMLDiagramEditorPlugin.getString("Association1Group.desc")); //$NON-NLS-1$
		paletteContainer.add(createAssociation1CreationTool());
		paletteContainer.add(createSharedAggregation2CreationTool());
		paletteContainer.add(createCompositeAggregation3CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createClass1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(UMLElementTypes.Class_3007);
		types.add(UMLElementTypes.Class_2001);
		types.add(UMLElementTypes.Class_3003);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Class1CreationTool.title"), UMLDiagramEditorPlugin.getString("Class1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Class_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPackage2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Package_2002);
		types.add(UMLElementTypes.Package_3006);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Package2CreationTool.title"), UMLDiagramEditorPlugin.getString("Package2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Package_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumeration3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.Enumeration_3011);
		types.add(UMLElementTypes.Enumeration_2003);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Enumeration3CreationTool.title"), UMLDiagramEditorPlugin.getString("Enumeration3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Enumeration_3011));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDataType4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.DataType_3008);
		types.add(UMLElementTypes.DataType_2004);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("DataType4CreationTool.title"), UMLDiagramEditorPlugin.getString("DataType4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.DataType_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPrimitiveType5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.PrimitiveType_3009);
		types.add(UMLElementTypes.PrimitiveType_2005);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("PrimitiveType5CreationTool.title"), UMLDiagramEditorPlugin.getString("PrimitiveType5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.PrimitiveType_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstraint6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Constraint_2006);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Constraint6CreationTool.title"), UMLDiagramEditorPlugin.getString("Constraint6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Constraint_2006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociationClass7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.AssociationClass_3012);
		types.add(UMLElementTypes.AssociationClass_2007);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("AssociationClass7CreationTool.title"), UMLDiagramEditorPlugin.getString("AssociationClass7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.AssociationClass_3012));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInterface8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Interface_2010);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Interface8CreationTool.title"), UMLDiagramEditorPlugin.getString("Interface8CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Interface_2010));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAttribute1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types.add(UMLElementTypes.Property_3001);
		types.add(UMLElementTypes.Property_3019);
		types.add(UMLElementTypes.Property_3014);
		types.add(UMLElementTypes.Property_3021);
		types.add(UMLElementTypes.Property_3023);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Attribute1CreationTool.title"), UMLDiagramEditorPlugin.getString("Attribute1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Property_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOperation2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(5);
		types.add(UMLElementTypes.Operation_3002);
		types.add(UMLElementTypes.Operation_3020);
		types.add(UMLElementTypes.Operation_3015);
		types.add(UMLElementTypes.Operation_3022);
		types.add(UMLElementTypes.Operation_3024);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Operation2CreationTool.title"), UMLDiagramEditorPlugin.getString("Operation2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Operation_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createValueSpecification3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.LiteralString_3005);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("ValueSpecification3CreationTool.title"), UMLDiagramEditorPlugin.getString("ValueSpecification3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.LiteralString_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createEnumLiteral4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.EnumerationLiteral_3016);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("EnumLiteral4CreationTool.title"), UMLDiagramEditorPlugin.getString("EnumLiteral4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.EnumerationLiteral_3016));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createPort5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Port_3025);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Port5CreationTool.title"), UMLDiagramEditorPlugin.getString("Port5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Port_3025));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemplateSignature6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.RedefinableTemplateSignature_3027);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("TemplateSignature6CreationTool.title"), UMLDiagramEditorPlugin.getString("TemplateSignature6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.RedefinableTemplateSignature_3027));
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
	private ToolEntry createProvidedInterface3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.InterfaceRealization_4008);
		LinkToolEntry entry = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("ProvidedInterface3CreationTool.title"), UMLDiagramEditorPlugin.getString("ProvidedInterface3CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InterfaceRealization_4008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createRequiredInterface4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Usage_4009);
		LinkToolEntry entry = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("RequiredInterface4CreationTool.title"), UMLDiagramEditorPlugin.getString("RequiredInterface4CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Usage_4009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createDependency5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Dependency_4002);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("Dependency5CreationTool.title"), UMLDiagramEditorPlugin.getString("Dependency5CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Dependency_4002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createConstrainedElement6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ConstraintConstrainedElement_4004);
		LinkToolEntry entry = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("ConstrainedElement6CreationTool.title"), UMLDiagramEditorPlugin.getString("ConstrainedElement6CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ConstraintConstrainedElement_4004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNAryDependencyTarget7CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.DependencySupplier_4006);
		LinkToolEntry entry = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("NAryDependencyTarget7CreationTool.title"), UMLDiagramEditorPlugin.getString("NAryDependencyTarget7CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.DependencySupplier_4006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createNAryDependencySource8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.DependencyClient_4007);
		LinkToolEntry entry = new LinkToolEntry(
				UMLDiagramEditorPlugin.getString("NAryDependencySource8CreationTool.title"), UMLDiagramEditorPlugin.getString("NAryDependencySource8CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.DependencyClient_4007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociationEnd9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Property_4003);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("AssociationEnd9CreationTool.title"), UMLDiagramEditorPlugin.getString("AssociationEnd9CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Property_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInstanceSpecification1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(2);
		types.add(UMLElementTypes.InstanceSpecification_3013);
		types.add(UMLElementTypes.InstanceSpecification_2008);
		NodeToolEntry entry = new NodeToolEntry(
				UMLDiagramEditorPlugin.getString("InstanceSpecification1CreationTool.title"), UMLDiagramEditorPlugin.getString("InstanceSpecification1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InstanceSpecification_3013));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSlot2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Slot_3017);
		NodeToolEntry entry = new NodeToolEntry(UMLDiagramEditorPlugin.getString("Slot2CreationTool.title"), UMLDiagramEditorPlugin.getString("Slot2CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Slot_3017));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createAssociation1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Association_4005);
		LinkToolEntry entry = new LinkToolEntry(UMLDiagramEditorPlugin.getString("Association1CreationTool.title"), UMLDiagramEditorPlugin.getString("Association1CreationTool.desc"), types); //$NON-NLS-1$ $NON-NLS-2$
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Association_4005));
		entry.setLargeIcon(entry.getSmallIcon());
		entry.setToolClass(CreateAssociationLinkTool.NONE.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSharedAggregation2CreationTool() {
		ToolEntry entry = new ToolEntry(UMLDiagramEditorPlugin.getString("SharedAggregation2CreationTool.title"), UMLDiagramEditorPlugin.getString("SharedAggregation2CreationTool.desc"), null, null) {}; //$NON-NLS-1$ $NON-NLS-2$
		entry.setToolClass(CreateAssociationLinkTool.SHARED.class);
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createCompositeAggregation3CreationTool() {
		ToolEntry entry = new ToolEntry(
				UMLDiagramEditorPlugin.getString("CompositeAggregation3CreationTool.title"), UMLDiagramEditorPlugin.getString("CompositeAggregation3CreationTool.desc"), null, null) {}; //$NON-NLS-1$ $NON-NLS-2$
		entry.setToolClass(CreateAssociationLinkTool.COMPOSITE.class);
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
