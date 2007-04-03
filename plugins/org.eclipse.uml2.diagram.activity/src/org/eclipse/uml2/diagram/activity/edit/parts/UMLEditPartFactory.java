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
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

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

			case AcceptEventAction2EditPart.VISUAL_ID:
				return new AcceptEventAction2EditPart(view);

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

			case CentralBufferNodeEditPart.VISUAL_ID:
				return new CentralBufferNodeEditPart(view);

			case OpaqueActionEditPart.VISUAL_ID:
				return new OpaqueActionEditPart(view);

			case OpaqueActionNameEditPart.VISUAL_ID:
				return new OpaqueActionNameEditPart(view);

			case OutputPinEditPart.VISUAL_ID:
				return new OutputPinEditPart(view);

			case OutputPinNameEditPart.VISUAL_ID:
				return new OutputPinNameEditPart(view);

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

			case CreateObjectActionEditPart.VISUAL_ID:
				return new CreateObjectActionEditPart(view);

			case CreateObjectActionNameEditPart.VISUAL_ID:
				return new CreateObjectActionNameEditPart(view);

			case OutputPin2EditPart.VISUAL_ID:
				return new OutputPin2EditPart(view);

			case OutputPinName2EditPart.VISUAL_ID:
				return new OutputPinName2EditPart(view);

			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionEditPart(view);

			case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionNameEditPart(view);

			case InputPinEditPart.VISUAL_ID:
				return new InputPinEditPart(view);

			case InputPinNameEditPart.VISUAL_ID:
				return new InputPinNameEditPart(view);

			case InputPin2EditPart.VISUAL_ID:
				return new InputPin2EditPart(view);

			case InputPinName2EditPart.VISUAL_ID:
				return new InputPinName2EditPart(view);

			case InputPin3EditPart.VISUAL_ID:
				return new InputPin3EditPart(view);

			case InputPinName3EditPart.VISUAL_ID:
				return new InputPinName3EditPart(view);

			case CallBehaviorActionEditPart.VISUAL_ID:
				return new CallBehaviorActionEditPart(view);

			case CallBehaviorActionNameEditPart.VISUAL_ID:
				return new CallBehaviorActionNameEditPart(view);

			case OutputPin3EditPart.VISUAL_ID:
				return new OutputPin3EditPart(view);

			case OutputPinName3EditPart.VISUAL_ID:
				return new OutputPinName3EditPart(view);

			case InputPin4EditPart.VISUAL_ID:
				return new InputPin4EditPart(view);

			case InputPinName4EditPart.VISUAL_ID:
				return new InputPinName4EditPart(view);

			case CallOperationActionEditPart.VISUAL_ID:
				return new CallOperationActionEditPart(view);

			case CallOperationActionNameEditPart.VISUAL_ID:
				return new CallOperationActionNameEditPart(view);

			case InputPin5EditPart.VISUAL_ID:
				return new InputPin5EditPart(view);

			case InputPinName5EditPart.VISUAL_ID:
				return new InputPinName5EditPart(view);

			case StructuredActivityNodeEditPart.VISUAL_ID:
				return new StructuredActivityNodeEditPart(view);

			case StructuredActivityNode2EditPart.VISUAL_ID:
				return new StructuredActivityNode2EditPart(view);

			case OpaqueAction2EditPart.VISUAL_ID:
				return new OpaqueAction2EditPart(view);

			case OpaqueActionName2EditPart.VISUAL_ID:
				return new OpaqueActionName2EditPart(view);

			case AcceptEventAction3EditPart.VISUAL_ID:
				return new AcceptEventAction3EditPart(view);

			case AcceptEventAction4EditPart.VISUAL_ID:
				return new AcceptEventAction4EditPart(view);

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

			case CentralBufferNode2EditPart.VISUAL_ID:
				return new CentralBufferNode2EditPart(view);

			case OpaqueBehaviorEditPart.VISUAL_ID:
				return new OpaqueBehaviorEditPart(view);

			case OpaqueBehaviorNameEditPart.VISUAL_ID:
				return new OpaqueBehaviorNameEditPart(view);

			case ActivityParameterNodeEditPart.VISUAL_ID:
				return new ActivityParameterNodeEditPart(view);

			case ActivityParameterNodeNameEditPart.VISUAL_ID:
				return new ActivityParameterNodeNameEditPart(view);

			case LiteralStringEditPart.VISUAL_ID:
				return new LiteralStringEditPart(view);

			case LiteralString2EditPart.VISUAL_ID:
				return new LiteralString2EditPart(view);

			case ActivitySubverticesEditPart.VISUAL_ID:
				return new ActivitySubverticesEditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart(view);

			case StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart.VISUAL_ID:
				return new StructuredActivityNodeStructuredActivityContentPaneCompartment2EditPart(view);

			case ConstraintPreconditionEditPart.VISUAL_ID:
				return new ConstraintPreconditionEditPart(view);

			case ConstraintPostconditionEditPart.VISUAL_ID:
				return new ConstraintPostconditionEditPart(view);

			case ControlFlowEditPart.VISUAL_ID:
				return new ControlFlowEditPart(view);

			case ObjectFlowEditPart.VISUAL_ID:
				return new ObjectFlowEditPart(view);

			case ActionLocalPreconditionEditPart.VISUAL_ID:
				return new ActionLocalPreconditionEditPart(view);

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
	 * @generated
	 */
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		if (source.getFigure() instanceof WrapLabel)
			return new TextCellEditorLocator((WrapLabel) source.getFigure());
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
		private WrapLabel wrapLabel;

		/**
		 * @generated
		 */
		public TextCellEditorLocator(WrapLabel wrapLabel) {
			this.wrapLabel = wrapLabel;
		}

		/**
		 * @generated
		 */
		public WrapLabel getWrapLabel() {
			return wrapLabel;
		}

		/**
		 * @generated
		 */
		public void relocate(CellEditor celleditor) {
			Text text = (Text) celleditor.getControl();
			Rectangle rect = getWrapLabel().getTextBounds().getCopy();
			getWrapLabel().translateToAbsolute(rect);
			if (getWrapLabel().isTextWrapped() && getWrapLabel().getText().length() > 0) {
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
}
