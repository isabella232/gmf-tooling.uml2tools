package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.draw2d.RotatedImageOfString;

/**
 * @generated
 */
public class UMLEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (UMLVisualIDRegistry.getVisualID(view)) {

			case PackageEditPart.VISUAL_ID:
				return new PackageEditPart(view);

			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);

			case ActivityNameEditPart.VISUAL_ID:
				return new ActivityNameEditPart(view);

			case ConstraintEditPart.VISUAL_ID:
				return new ConstraintEditPart(view);

			case Constraint2EditPart.VISUAL_ID:
				return new Constraint2EditPart(view);

			case AcceptEventActionEditPart.VISUAL_ID:
				return new AcceptEventActionEditPart(view);

			case AcceptEventActionNameEditPart.VISUAL_ID:
				return new AcceptEventActionNameEditPart(view);

			case AcceptEventAction2EditPart.VISUAL_ID:
				return new AcceptEventAction2EditPart(view);

			case AcceptEventActionName3EditPart.VISUAL_ID:
				return new AcceptEventActionName3EditPart(view);

			case ActivityFinalNodeEditPart.VISUAL_ID:
				return new ActivityFinalNodeEditPart(view);

			case DecisionNodeEditPart.VISUAL_ID:
				return new DecisionNodeEditPart(view);

			case MergeNodeEditPart.VISUAL_ID:
				return new MergeNodeEditPart(view);

			case InitialNodeEditPart.VISUAL_ID:
				return new InitialNodeEditPart(view);

			case DataStoreNodeEditPart.VISUAL_ID:
				return new DataStoreNodeEditPart(view);

			case DataStoreNodeNameEditPart.VISUAL_ID:
				return new DataStoreNodeNameEditPart(view);

			case DataStoreNodeName2EditPart.VISUAL_ID:
				return new DataStoreNodeName2EditPart(view);

			case DataStoreNodeOrderingEditPart.VISUAL_ID:
				return new DataStoreNodeOrderingEditPart(view);

			case CentralBufferNodeEditPart.VISUAL_ID:
				return new CentralBufferNodeEditPart(view);

			case CentralBufferNodeNameEditPart.VISUAL_ID:
				return new CentralBufferNodeNameEditPart(view);

			case CentralBufferNodeName2EditPart.VISUAL_ID:
				return new CentralBufferNodeName2EditPart(view);

			case CentralBufferNodeOrderingEditPart.VISUAL_ID:
				return new CentralBufferNodeOrderingEditPart(view);

			case OpaqueActionEditPart.VISUAL_ID:
				return new OpaqueActionEditPart(view);

			case OpaqueActionNameEditPart.VISUAL_ID:
				return new OpaqueActionNameEditPart(view);

			case OutputPinEditPart.VISUAL_ID:
				return new OutputPinEditPart(view);

			case OutputPinNameEditPart.VISUAL_ID:
				return new OutputPinNameEditPart(view);

			case OutputPinOrderingEditPart.VISUAL_ID:
				return new OutputPinOrderingEditPart(view);

			case FlowFinalNodeEditPart.VISUAL_ID:
				return new FlowFinalNodeEditPart(view);

			case ForkNodeEditPart.VISUAL_ID:
				return new ForkNodeEditPart(view);

			case JoinNodeEditPart.VISUAL_ID:
				return new JoinNodeEditPart(view);

			case PinEditPart.VISUAL_ID:
				return new PinEditPart(view);

			case PinNameEditPart.VISUAL_ID:
				return new PinNameEditPart(view);

			case PinName4EditPart.VISUAL_ID:
				return new PinName4EditPart(view);

			case PinOrderingEditPart.VISUAL_ID:
				return new PinOrderingEditPart(view);

			case CreateObjectActionEditPart.VISUAL_ID:
				return new CreateObjectActionEditPart(view);

			case CreateObjectActionNameEditPart.VISUAL_ID:
				return new CreateObjectActionNameEditPart(view);

			case OutputPin2EditPart.VISUAL_ID:
				return new OutputPin2EditPart(view);

			case OutputPinName2EditPart.VISUAL_ID:
				return new OutputPinName2EditPart(view);

			case OutputPinOrdering2EditPart.VISUAL_ID:
				return new OutputPinOrdering2EditPart(view);

			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionEditPart(view);

			case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionNameEditPart(view);

			case InputPinEditPart.VISUAL_ID:
				return new InputPinEditPart(view);

			case InputPinNameEditPart.VISUAL_ID:
				return new InputPinNameEditPart(view);

			case InputPinOrderingEditPart.VISUAL_ID:
				return new InputPinOrderingEditPart(view);

			case InputPin2EditPart.VISUAL_ID:
				return new InputPin2EditPart(view);

			case InputPinName2EditPart.VISUAL_ID:
				return new InputPinName2EditPart(view);

			case InputPinOrdering2EditPart.VISUAL_ID:
				return new InputPinOrdering2EditPart(view);

			case InputPin3EditPart.VISUAL_ID:
				return new InputPin3EditPart(view);

			case InputPinName3EditPart.VISUAL_ID:
				return new InputPinName3EditPart(view);

			case InputPinOrdering3EditPart.VISUAL_ID:
				return new InputPinOrdering3EditPart(view);

			case CallBehaviorActionEditPart.VISUAL_ID:
				return new CallBehaviorActionEditPart(view);

			case CallBehaviorActionNameEditPart.VISUAL_ID:
				return new CallBehaviorActionNameEditPart(view);

			case OutputPin3EditPart.VISUAL_ID:
				return new OutputPin3EditPart(view);

			case OutputPinName3EditPart.VISUAL_ID:
				return new OutputPinName3EditPart(view);

			case OutputPinOrdering3EditPart.VISUAL_ID:
				return new OutputPinOrdering3EditPart(view);

			case InputPin4EditPart.VISUAL_ID:
				return new InputPin4EditPart(view);

			case InputPinName4EditPart.VISUAL_ID:
				return new InputPinName4EditPart(view);

			case InputPinOrdering4EditPart.VISUAL_ID:
				return new InputPinOrdering4EditPart(view);

			case CallOperationActionEditPart.VISUAL_ID:
				return new CallOperationActionEditPart(view);

			case CallOperationActionNameEditPart.VISUAL_ID:
				return new CallOperationActionNameEditPart(view);

			case InputPin5EditPart.VISUAL_ID:
				return new InputPin5EditPart(view);

			case InputPinName5EditPart.VISUAL_ID:
				return new InputPinName5EditPart(view);

			case InputPinOrdering5EditPart.VISUAL_ID:
				return new InputPinOrdering5EditPart(view);

			case StructuredActivityNodeEditPart.VISUAL_ID:
				return new StructuredActivityNodeEditPart(view);

			case StructuredActivityNodeNameEditPart.VISUAL_ID:
				return new StructuredActivityNodeNameEditPart(view);

			case StructuredActivityNode2EditPart.VISUAL_ID:
				return new StructuredActivityNode2EditPart(view);

			case StructuredActivityNodeName2EditPart.VISUAL_ID:
				return new StructuredActivityNodeName2EditPart(view);

			case OpaqueAction2EditPart.VISUAL_ID:
				return new OpaqueAction2EditPart(view);

			case OpaqueActionName2EditPart.VISUAL_ID:
				return new OpaqueActionName2EditPart(view);

			case AcceptEventAction3EditPart.VISUAL_ID:
				return new AcceptEventAction3EditPart(view);

			case AcceptEventActionName2EditPart.VISUAL_ID:
				return new AcceptEventActionName2EditPart(view);

			case AcceptEventAction4EditPart.VISUAL_ID:
				return new AcceptEventAction4EditPart(view);

			case AcceptEventActionName4EditPart.VISUAL_ID:
				return new AcceptEventActionName4EditPart(view);

			case ActivityFinalNode2EditPart.VISUAL_ID:
				return new ActivityFinalNode2EditPart(view);

			case DecisionNode2EditPart.VISUAL_ID:
				return new DecisionNode2EditPart(view);

			case FlowFinalNode2EditPart.VISUAL_ID:
				return new FlowFinalNode2EditPart(view);

			case Pin2EditPart.VISUAL_ID:
				return new Pin2EditPart(view);

			case PinName2EditPart.VISUAL_ID:
				return new PinName2EditPart(view);

			case PinName5EditPart.VISUAL_ID:
				return new PinName5EditPart(view);

			case PinOrdering2EditPart.VISUAL_ID:
				return new PinOrdering2EditPart(view);

			case CreateObjectAction2EditPart.VISUAL_ID:
				return new CreateObjectAction2EditPart(view);

			case CreateObjectActionName2EditPart.VISUAL_ID:
				return new CreateObjectActionName2EditPart(view);

			case CallBehaviorAction2EditPart.VISUAL_ID:
				return new CallBehaviorAction2EditPart(view);

			case CallBehaviorActionName2EditPart.VISUAL_ID:
				return new CallBehaviorActionName2EditPart(view);

			case CallOperationAction2EditPart.VISUAL_ID:
				return new CallOperationAction2EditPart(view);

			case CallOperationActionName2EditPart.VISUAL_ID:
				return new CallOperationActionName2EditPart(view);

			case ForkNode2EditPart.VISUAL_ID:
				return new ForkNode2EditPart(view);

			case JoinNode2EditPart.VISUAL_ID:
				return new JoinNode2EditPart(view);

			case AddStructuralFeatureValueAction2EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction2EditPart(view);

			case AddStructuralFeatureValueActionName2EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionName2EditPart(view);

			case DataStoreNode2EditPart.VISUAL_ID:
				return new DataStoreNode2EditPart(view);

			case DataStoreNodeName3EditPart.VISUAL_ID:
				return new DataStoreNodeName3EditPart(view);

			case DataStoreNodeName4EditPart.VISUAL_ID:
				return new DataStoreNodeName4EditPart(view);

			case DataStoreNodeOrdering2EditPart.VISUAL_ID:
				return new DataStoreNodeOrdering2EditPart(view);

			case CentralBufferNode2EditPart.VISUAL_ID:
				return new CentralBufferNode2EditPart(view);

			case CentralBufferNodeName3EditPart.VISUAL_ID:
				return new CentralBufferNodeName3EditPart(view);

			case CentralBufferNodeName4EditPart.VISUAL_ID:
				return new CentralBufferNodeName4EditPart(view);

			case CentralBufferNodeOrdering2EditPart.VISUAL_ID:
				return new CentralBufferNodeOrdering2EditPart(view);

			case InputPin6EditPart.VISUAL_ID:
				return new InputPin6EditPart(view);

			case InputPinName6EditPart.VISUAL_ID:
				return new InputPinName6EditPart(view);

			case InputPinOrdering6EditPart.VISUAL_ID:
				return new InputPinOrdering6EditPart(view);

			case OutputPin4EditPart.VISUAL_ID:
				return new OutputPin4EditPart(view);

			case OutputPinName4EditPart.VISUAL_ID:
				return new OutputPinName4EditPart(view);

			case OutputPinOrdering4EditPart.VISUAL_ID:
				return new OutputPinOrdering4EditPart(view);

			case OpaqueBehaviorEditPart.VISUAL_ID:
				return new OpaqueBehaviorEditPart(view);

			case OpaqueBehaviorNameEditPart.VISUAL_ID:
				return new OpaqueBehaviorNameEditPart(view);

			case ActivityParameterNodeEditPart.VISUAL_ID:
				return new ActivityParameterNodeEditPart(view);

			case ActivityParameterNodeNameEditPart.VISUAL_ID:
				return new ActivityParameterNodeNameEditPart(view);

			case SendSignalActionEditPart.VISUAL_ID:
				return new SendSignalActionEditPart(view);

			case SendSignalActionNameEditPart.VISUAL_ID:
				return new SendSignalActionNameEditPart(view);

			case ActivityPartitionEditPart.VISUAL_ID:
				return new ActivityPartitionEditPart(view);

			case ActivityPartitionNameEditPart.VISUAL_ID:
				return new ActivityPartitionNameEditPart(view);

			case ActivityPartition2EditPart.VISUAL_ID:
				return new ActivityPartition2EditPart(view);

			case ActivityPartitionName2EditPart.VISUAL_ID:
				return new ActivityPartitionName2EditPart(view);

			case AcceptEventAction5EditPart.VISUAL_ID:
				return new AcceptEventAction5EditPart(view);

			case AcceptEventActionName5EditPart.VISUAL_ID:
				return new AcceptEventActionName5EditPart(view);

			case AcceptEventAction6EditPart.VISUAL_ID:
				return new AcceptEventAction6EditPart(view);

			case AcceptEventActionName6EditPart.VISUAL_ID:
				return new AcceptEventActionName6EditPart(view);

			case ActivityFinalNode3EditPart.VISUAL_ID:
				return new ActivityFinalNode3EditPart(view);

			case DecisionNode3EditPart.VISUAL_ID:
				return new DecisionNode3EditPart(view);

			case MergeNode2EditPart.VISUAL_ID:
				return new MergeNode2EditPart(view);

			case InitialNode2EditPart.VISUAL_ID:
				return new InitialNode2EditPart(view);

			case DataStoreNode3EditPart.VISUAL_ID:
				return new DataStoreNode3EditPart(view);

			case DataStoreNodeName5EditPart.VISUAL_ID:
				return new DataStoreNodeName5EditPart(view);

			case DataStoreNodeName6EditPart.VISUAL_ID:
				return new DataStoreNodeName6EditPart(view);

			case DataStoreNodeOrdering3EditPart.VISUAL_ID:
				return new DataStoreNodeOrdering3EditPart(view);

			case CentralBufferNode3EditPart.VISUAL_ID:
				return new CentralBufferNode3EditPart(view);

			case CentralBufferNodeName5EditPart.VISUAL_ID:
				return new CentralBufferNodeName5EditPart(view);

			case CentralBufferNodeName6EditPart.VISUAL_ID:
				return new CentralBufferNodeName6EditPart(view);

			case CentralBufferNodeOrdering3EditPart.VISUAL_ID:
				return new CentralBufferNodeOrdering3EditPart(view);

			case OpaqueAction3EditPart.VISUAL_ID:
				return new OpaqueAction3EditPart(view);

			case OpaqueActionName3EditPart.VISUAL_ID:
				return new OpaqueActionName3EditPart(view);

			case FlowFinalNode3EditPart.VISUAL_ID:
				return new FlowFinalNode3EditPart(view);

			case ForkNode3EditPart.VISUAL_ID:
				return new ForkNode3EditPart(view);

			case JoinNode3EditPart.VISUAL_ID:
				return new JoinNode3EditPart(view);

			case Pin3EditPart.VISUAL_ID:
				return new Pin3EditPart(view);

			case PinName3EditPart.VISUAL_ID:
				return new PinName3EditPart(view);

			case PinOrdering3EditPart.VISUAL_ID:
				return new PinOrdering3EditPart(view);

			case CreateObjectAction3EditPart.VISUAL_ID:
				return new CreateObjectAction3EditPart(view);

			case CreateObjectActionName3EditPart.VISUAL_ID:
				return new CreateObjectActionName3EditPart(view);

			case AddStructuralFeatureValueAction3EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueAction3EditPart(view);

			case AddStructuralFeatureValueActionName3EditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionName3EditPart(view);

			case CallBehaviorAction3EditPart.VISUAL_ID:
				return new CallBehaviorAction3EditPart(view);

			case CallBehaviorActionName3EditPart.VISUAL_ID:
				return new CallBehaviorActionName3EditPart(view);

			case CallOperationAction3EditPart.VISUAL_ID:
				return new CallOperationAction3EditPart(view);

			case CallOperationActionName3EditPart.VISUAL_ID:
				return new CallOperationActionName3EditPart(view);

			case StructuredActivityNode3EditPart.VISUAL_ID:
				return new StructuredActivityNode3EditPart(view);

			case StructuredActivityNode4EditPart.VISUAL_ID:
				return new StructuredActivityNode4EditPart(view);

			case InputPin7EditPart.VISUAL_ID:
				return new InputPin7EditPart(view);

			case InputPinName7EditPart.VISUAL_ID:
				return new InputPinName7EditPart(view);

			case InputPinOrdering7EditPart.VISUAL_ID:
				return new InputPinOrdering7EditPart(view);

			case OutputPin5EditPart.VISUAL_ID:
				return new OutputPin5EditPart(view);

			case OutputPinName5EditPart.VISUAL_ID:
				return new OutputPinName5EditPart(view);

			case OutputPinOrdering5EditPart.VISUAL_ID:
				return new OutputPinOrdering5EditPart(view);

			case SendSignalAction2EditPart.VISUAL_ID:
				return new SendSignalAction2EditPart(view);

			case SendSignalActionName2EditPart.VISUAL_ID:
				return new SendSignalActionName2EditPart(view);

			case LoopNode2EditPart.VISUAL_ID:
				return new LoopNode2EditPart(view);

			case ConditionalNode2EditPart.VISUAL_ID:
				return new ConditionalNode2EditPart(view);

			case ExpansionRegion2EditPart.VISUAL_ID:
				return new ExpansionRegion2EditPart(view);

			case ExpansionRegionMode2EditPart.VISUAL_ID:
				return new ExpansionRegionMode2EditPart(view);

			case LoopNodeEditPart.VISUAL_ID:
				return new LoopNodeEditPart(view);

			case LoopNodeNameEditPart.VISUAL_ID:
				return new LoopNodeNameEditPart(view);

			case ConditionalNodeEditPart.VISUAL_ID:
				return new ConditionalNodeEditPart(view);

			case ConditionalNodeNameEditPart.VISUAL_ID:
				return new ConditionalNodeNameEditPart(view);

			case ExpansionRegionEditPart.VISUAL_ID:
				return new ExpansionRegionEditPart(view);

			case ExpansionRegionModeEditPart.VISUAL_ID:
				return new ExpansionRegionModeEditPart(view);

			case LiteralStringEditPart.VISUAL_ID:
				return new LiteralStringEditPart(view);

			case LiteralString2EditPart.VISUAL_ID:
				return new LiteralString2EditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartment3EditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartment4EditPart(view);

			case LoopNodeLoopNodeContentPaneCompartment2EditPart.VISUAL_ID:
				return new LoopNodeLoopNodeContentPaneCompartment2EditPart(view);

			case ConditionalNodeConditionalNodeCompartment2EditPart.VISUAL_ID:
				return new ConditionalNodeConditionalNodeCompartment2EditPart(view);

			case ExpansionRegionExpansionRegionNodeCompartment2EditPart.VISUAL_ID:
				return new ExpansionRegionExpansionRegionNodeCompartment2EditPart(view);

			case LoopNodeLoopNodeContentPaneCompartmentEditPart.VISUAL_ID:
				return new LoopNodeLoopNodeContentPaneCompartmentEditPart(view);

			case ConditionalNodeConditionalNodeCompartmentEditPart.VISUAL_ID:
				return new ConditionalNodeConditionalNodeCompartmentEditPart(view);

			case ExpansionRegionExpansionRegionNodeCompartmentEditPart.VISUAL_ID:
				return new ExpansionRegionExpansionRegionNodeCompartmentEditPart(view);

			case ConstraintPreconditionEditPart.VISUAL_ID:
				return new ConstraintPreconditionEditPart(view);

			case ConstraintPostconditionEditPart.VISUAL_ID:
				return new ConstraintPostconditionEditPart(view);

			case ControlFlowEditPart.VISUAL_ID:
				return new ControlFlowEditPart(view);

			case ControlFlowNameEditPart.VISUAL_ID:
				return new ControlFlowNameEditPart(view);

			case ControlFlowName2EditPart.VISUAL_ID:
				return new ControlFlowName2EditPart(view);

			case ControlFlowName3EditPart.VISUAL_ID:
				return new ControlFlowName3EditPart(view);

			case ObjectFlowEditPart.VISUAL_ID:
				return new ObjectFlowEditPart(view);

			case ObjectFlowNameEditPart.VISUAL_ID:
				return new ObjectFlowNameEditPart(view);

			case ObjectFlowName2EditPart.VISUAL_ID:
				return new ObjectFlowName2EditPart(view);

			case ObjectFlowName3EditPart.VISUAL_ID:
				return new ObjectFlowName3EditPart(view);

			case ActionLocalPreconditionEditPart.VISUAL_ID:
				return new ActionLocalPreconditionEditPart(view);

			case ActionLocalPostconditionEditPart.VISUAL_ID:
				return new ActionLocalPostconditionEditPart(view);

			case ObjectNodeSelectionEditPart.VISUAL_ID:
				return new ObjectNodeSelectionEditPart(view);

			case ExceptionHandlerEditPart.VISUAL_ID:
				return new ExceptionHandlerEditPart(view);

			case ExceptionHandlerLink_fixed_iconEditPart.VISUAL_ID:
				return new ExceptionHandlerLink_fixed_iconEditPart(view);
			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	 * @generated
	 */
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	 * @generated NOT
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof RotatedImageOfString) {
			return new RotatedImageCellEditorLocator((RotatedImageOfString) source.getFigure());
		}
		return getTextCellEditorLocatorGen(source);
	}

	/**
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocatorGen(ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrappingLabel)
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		else {
			return new LabelCellEditorLocator((Label) source.getFigure());
		}
	}

	/**
	 * @generated
	 */
	static private class TextCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private WrappingLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrappingLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrappingLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapOn() && getWrapLabel().getText().length() > 0) {
				rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
			} else {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}

	}

	/**
	 * @generated
	 */
	private static class LabelCellEditorLocator implements CellEditorLocator {

		/**
		 * @generated
		 */
		private Label label;

		/**
		 * @generated
		 */
		public LabelCellEditorLocator(Label label) {
			this.label = label;
		}

		/**
		 * @generated
		 */
		public Label getLabel() {
			return label;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getLabel().getTextBounds().getCopy();
			getLabel().translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
			rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}

	/**
	 * @NOT generated
	 */
	static private class RotatedImageCellEditorLocator implements CellEditorLocator {

		private RotatedImageOfString rotatedImage;

		public RotatedImageCellEditorLocator(RotatedImageOfString rotatedImage) {
			this.rotatedImage = rotatedImage;
		}

		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = rotatedImage.getBounds().getCopy();
			rotatedImage.translateToAbsolute(rect);
			int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
			Dimension textSize = new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0);
			rect.x = rect.x + 3;
			rect.y = rect.y + rect.height / 2 - textSize.height / 2;
			rect.setSize(textSize);
			if (!rect.equals(new Rectangle(text.getBounds()))) {
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
			}
		}
	}
}
