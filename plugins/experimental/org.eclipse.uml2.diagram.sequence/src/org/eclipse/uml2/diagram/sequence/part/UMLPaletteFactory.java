package org.eclipse.uml2.diagram.sequence.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.uml2.diagram.sequence.edit.create.CreateCombinedFragmentTool;
import org.eclipse.uml2.diagram.sequence.edit.create.CreateInteractionUseTool;
import org.eclipse.uml2.diagram.sequence.edit.create.CreateLifeLineTool;
import org.eclipse.uml2.diagram.sequence.edit.create.CreateStateInvariantTool;
import org.eclipse.uml2.diagram.sequence.providers.UMLElementTypes;

/**
 * XXX: generate custom tool from SD-Creation suite
 * @generated
 */
public class UMLPaletteFactory {

	/**
	 * @generated
	 */
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createElements1Group());
	}

	/**
	 * Creates "Elements" palette tool group
	 * @generated
	 */
	private PaletteContainer createElements1Group() {
		PaletteGroup paletteContainer = new PaletteGroup(Messages.Elements1Group_title);
		paletteContainer.setDescription(Messages.Elements1Group_desc);
		paletteContainer.add(createInteraction1CreationTool());
		paletteContainer.add(createLifeline2CreationTool());
		paletteContainer.add(createMessage3CreationTool());
		paletteContainer.add(createStateInvariant4CreationTool());
		paletteContainer.add(createActionExecution5CreationTool());
		paletteContainer.add(createBehaviorExecution6CreationTool());
		paletteContainer.add(createFoundExecution7CreationTool());
		paletteContainer.add(createInteractionUse8CreationTool());
		paletteContainer.add(createCombinedFragment9CreationTool());
		paletteContainer.add(createGate10CreationTool());
		paletteContainer.add(createTemporaryOperand11CreationTool());
		paletteContainer.add(createTemporaryMountingLink12CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInteraction1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Interaction_2001);
		org.eclipse.uml2.diagram.common.part.NodeToolEntry entry = new org.eclipse.uml2.diagram.common.part.NodeToolEntry(Messages.Interaction1CreationTool_title,
				Messages.Interaction1CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Interaction_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createLifeline2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Lifeline_3001);
		NodeToolEntry entry = new NodeToolEntry(Messages.Lifeline2CreationTool_title, Messages.Lifeline2CreationTool_desc, types) {

			@Override
			public Tool createTool() {
				Tool result = new CreateLifeLineTool();
				result.setProperties(getToolProperties());
				return result;
			}
		};
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Lifeline_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createMessage3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Message_4001);
		org.eclipse.uml2.diagram.common.part.LinkToolEntry entry = new org.eclipse.uml2.diagram.common.part.LinkToolEntry(Messages.Message3CreationTool_title, Messages.Message3CreationTool_desc,
				types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Message_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createStateInvariant4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.StateInvariant_3003);
		NodeToolEntry entry = new NodeToolEntry(Messages.StateInvariant4CreationTool_title, Messages.StateInvariant4CreationTool_desc, types) {

			@Override
			public Tool createTool() {
				Tool result = new CreateStateInvariantTool();
				result.setProperties(getToolProperties());
				return result;
			}
		};

		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.StateInvariant_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createActionExecution5CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.ActionExecutionSpecification_3002);
		org.eclipse.uml2.diagram.common.part.NodeToolEntry entry = new org.eclipse.uml2.diagram.common.part.NodeToolEntry(Messages.ActionExecution5CreationTool_title,
				Messages.ActionExecution5CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.ActionExecutionSpecification_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createBehaviorExecution6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.BehaviorExecutionSpecification_3004);
		org.eclipse.uml2.diagram.common.part.NodeToolEntry entry = new org.eclipse.uml2.diagram.common.part.NodeToolEntry(Messages.BehaviorExecution6CreationTool_title,
				Messages.BehaviorExecution6CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.BehaviorExecutionSpecification_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createFoundExecution7CreationTool() {
		ToolEntry entry = new ToolEntry(Messages.FoundExecution7CreationTool_title, Messages.FoundExecution7CreationTool_desc, null, null) {
		};
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createInteractionUse8CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.InteractionUse_3007);
		NodeToolEntry entry = new NodeToolEntry(Messages.InteractionUse8CreationTool_title, Messages.InteractionUse8CreationTool_desc, types) {

			@Override
			public Tool createTool() {
				Tool result = new CreateInteractionUseTool();
				result.setProperties(getToolProperties());
				return result;
			}
		};
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InteractionUse_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createCombinedFragment9CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.CombinedFragment_3008);
		NodeToolEntry entry = new NodeToolEntry(Messages.CombinedFragment9CreationTool_title, Messages.CombinedFragment9CreationTool_desc, types) {

			public Tool createTool() {
				Tool result = new CreateCombinedFragmentTool();
				result.setProperties(getToolProperties());
				return result;
			}
		};
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.CombinedFragment_3008));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createGate10CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Gate_3005);
		org.eclipse.uml2.diagram.common.part.NodeToolEntry entry = new org.eclipse.uml2.diagram.common.part.NodeToolEntry(Messages.Gate10CreationTool_title, Messages.Gate10CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Gate_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemporaryOperand11CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.InteractionOperand_3009);
		org.eclipse.uml2.diagram.common.part.NodeToolEntry entry = new org.eclipse.uml2.diagram.common.part.NodeToolEntry(Messages.TemporaryOperand11CreationTool_title,
				Messages.TemporaryOperand11CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.InteractionOperand_3009));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createTemporaryMountingLink12CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(UMLElementTypes.Link_4002);
		org.eclipse.uml2.diagram.common.part.LinkToolEntry entry = new org.eclipse.uml2.diagram.common.part.LinkToolEntry(Messages.TemporaryMountingLink12CreationTool_title,
				Messages.TemporaryMountingLink12CreationTool_desc, types);
		entry.setSmallIcon(UMLElementTypes.getImageDescriptor(UMLElementTypes.Link_4002));
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
