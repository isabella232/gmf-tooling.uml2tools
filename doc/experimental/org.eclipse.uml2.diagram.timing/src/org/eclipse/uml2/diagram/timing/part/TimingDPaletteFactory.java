package org.eclipse.uml2.diagram.timing.part;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.gef.Tool;
import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteGroup;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeConnectionTool;
import org.eclipse.gmf.runtime.diagram.ui.tools.UnspecifiedTypeCreationTool;
import org.eclipse.uml2.diagram.timing.edit.policies.CreateSegmentTool;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

/**
 * @generated
 */

public class TimingDPaletteFactory {

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
		paletteContainer.add(createStateCondition3CreationTool());
		paletteContainer.add(createSwitch4CreationTool());
		paletteContainer.add(createSegment5CreationTool());
		paletteContainer.add(createOccurrence6CreationTool());
		return paletteContainer;
	}

	/**
	 * @generated
	 */
	private ToolEntry createInteraction1CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TimingDElementTypes.DFrame_2001);
		NodeToolEntry entry = new NodeToolEntry(Messages.Interaction1CreationTool_title, Messages.Interaction1CreationTool_desc, types);
		entry.setSmallIcon(TimingDElementTypes.getImageDescriptor(TimingDElementTypes.DFrame_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createLifeline2CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TimingDElementTypes.DBlock_3001);
		NodeToolEntry entry = new NodeToolEntry(Messages.Lifeline2CreationTool_title, Messages.Lifeline2CreationTool_desc, types);
		entry.setSmallIcon(TimingDElementTypes.getImageDescriptor(TimingDElementTypes.DBlock_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createStateCondition3CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TimingDElementTypes.DValueLine_3002);
		NodeToolEntry entry = new NodeToolEntry(Messages.StateCondition3CreationTool_title, Messages.StateCondition3CreationTool_desc, types);
		entry.setSmallIcon(TimingDElementTypes.getImageDescriptor(TimingDElementTypes.DValueLine_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createSwitch4CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TimingDElementTypes.DStateSwitch_4001);
		LinkToolEntry entry = new LinkToolEntry(Messages.Switch4CreationTool_title, Messages.Switch4CreationTool_desc, types);
		entry.setSmallIcon(TimingDElementTypes.getImageDescriptor(TimingDElementTypes.DStateSwitch_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated NOT
	 */
	private ToolEntry createSegment5CreationTool() {
		final List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(1);
		types.add(TimingDElementTypes.DSegment_3003);
		NodeToolEntry entry = new NodeToolEntry(Messages.Segment5CreationTool_title, Messages.Segment5CreationTool_desc, types) {

			@Override
			public Tool createTool() {
				Tool tool = new CreateSegmentTool(types);
				tool.setProperties(getToolProperties());
				return tool;

			}
		};
		entry.setSmallIcon(TimingDElementTypes.getImageDescriptor(TimingDElementTypes.DSegment_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	 * @generated
	 */
	private ToolEntry createOccurrence6CreationTool() {
		List/*<IElementType>*/types = new ArrayList/*<IElementType>*/(3);
		types.add(TimingDElementTypes.DSegmentMiddlePoint_3004);
		types.add(TimingDElementTypes.DSegmentStart_3005);
		types.add(TimingDElementTypes.DSegmentEnd_3006);
		NodeToolEntry entry = new NodeToolEntry(Messages.Occurrence6CreationTool_title, Messages.Occurrence6CreationTool_desc, types);
		entry.setSmallIcon(TimingDElementTypes.getImageDescriptor(TimingDElementTypes.DSegmentMiddlePoint_3004));
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
