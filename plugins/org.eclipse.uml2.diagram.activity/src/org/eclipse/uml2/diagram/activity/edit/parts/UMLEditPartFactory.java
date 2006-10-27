package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.IFigure;
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
	public static final String EXTERNAL_NODE_LABELS_LAYER = "External Node Labels"; //$NON-NLS-1$

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			int viewVisualID = UMLVisualIDRegistry.getVisualID(view);
			switch (viewVisualID) {
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
			case StructuredActivityNodeEditPart.VISUAL_ID:
				return new StructuredActivityNodeEditPart(view);
			case DataStoreNodeEditPart.VISUAL_ID:
				return new DataStoreNodeEditPart(view);
			case CentralBufferNodeEditPart.VISUAL_ID:
				return new CentralBufferNodeEditPart(view);
			case OpaqueActionEditPart.VISUAL_ID:
				return new OpaqueActionEditPart(view);
			case OpaqueActionNameEditPart.VISUAL_ID:
				return new OpaqueActionNameEditPart(view);
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
			case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionEditPart(view);
			case AddStructuralFeatureValueActionNameEditPart.VISUAL_ID:
				return new AddStructuralFeatureValueActionNameEditPart(view);
			case CallBehaviorActionEditPart.VISUAL_ID:
				return new CallBehaviorActionEditPart(view);
			case CallBehaviorActionNameEditPart.VISUAL_ID:
				return new CallBehaviorActionNameEditPart(view);
			case CallOperationActionEditPart.VISUAL_ID:
				return new CallOperationActionEditPart(view);
			case CallOperationActionNameEditPart.VISUAL_ID:
				return new CallOperationActionNameEditPart(view);
			case OutputPinEditPart.VISUAL_ID:
				return new OutputPinEditPart(view);
			case OutputPinNameEditPart.VISUAL_ID:
				return new OutputPinNameEditPart(view);
			case OutputPin2EditPart.VISUAL_ID:
				return new OutputPin2EditPart(view);
			case OutputPinName2EditPart.VISUAL_ID:
				return new OutputPinName2EditPart(view);
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
			case OutputPin3EditPart.VISUAL_ID:
				return new OutputPin3EditPart(view);
			case OutputPinName3EditPart.VISUAL_ID:
				return new OutputPinName3EditPart(view);
			case InputPin4EditPart.VISUAL_ID:
				return new InputPin4EditPart(view);
			case InputPinName4EditPart.VISUAL_ID:
				return new InputPinName4EditPart(view);
			case InputPin5EditPart.VISUAL_ID:
				return new InputPin5EditPart(view);
			case InputPinName5EditPart.VISUAL_ID:
				return new InputPinName5EditPart(view);
			case ActivityEditPart.VISUAL_ID:
				return new ActivityEditPart(view);
			case ControlFlowEditPart.VISUAL_ID:
				return new ControlFlowEditPart(view);
			case ObjectFlowEditPart.VISUAL_ID:
				return new ObjectFlowEditPart(view);
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
			IFigure figure = source.getFigure();
			return new LabelCellEditorLocator((Label) figure);
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
			super();
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

			if (getWrapLabel().isTextWrapped() && getWrapLabel().getText().length() > 0)
				rect.setSize(new Dimension(text.computeSize(rect.width, SWT.DEFAULT)));
			else {
				int avr = FigureUtilities.getFontMetrics(text.getFont()).getAverageCharWidth();
				rect.setSize(new Dimension(text.computeSize(SWT.DEFAULT, SWT.DEFAULT)).expand(avr * 2, 0));
			}

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
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

			if (!rect.equals(new Rectangle(text.getBounds())))
				text.setBounds(rect.x, rect.y, rect.width, rect.height);
		}
	}
}
