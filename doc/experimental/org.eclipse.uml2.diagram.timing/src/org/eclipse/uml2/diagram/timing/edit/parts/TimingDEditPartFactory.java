package org.eclipse.uml2.diagram.timing.edit.parts;

import org.eclipse.draw2d.FigureUtilities;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Text;
import org.eclipse.uml2.diagram.common.draw2d.RotatedImageCellEditorLocator;
import org.eclipse.uml2.diagram.common.draw2d.RotatedImageOfString;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;

/**
 * @generated
 */

public class TimingDEditPartFactory implements EditPartFactory {

	/**
	 * @generated
	 */
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (TimingDVisualIDRegistry.getVisualID(view)) {

			case DFrameContainerEditPart.VISUAL_ID:
				return new DFrameContainerEditPart(view);

			case DFrameEditPart.VISUAL_ID:
				return new DFrameEditPart(view);

			case DFrameDisplayNameEditPart.VISUAL_ID:
				return new DFrameDisplayNameEditPart(view);

			case DBlockEditPart.VISUAL_ID:
				return new DBlockEditPart(view);

			case DBlockDisplayNameEditPart.VISUAL_ID:
				return new DBlockDisplayNameEditPart(view);

			case DValueLineEditPart.VISUAL_ID:
				return new DValueLineEditPart(view);

			case DValueLineDisplayNameEditPart.VISUAL_ID:
				return new DValueLineDisplayNameEditPart(view);

			case DSegmentEditPart.VISUAL_ID:
				return new DSegmentEditPart(view);

			case DSegmentMiddlePointEditPart.VISUAL_ID:
				return new DSegmentMiddlePointEditPart(view);

			case DSegmentStartEditPart.VISUAL_ID:
				return new DSegmentStartEditPart(view);

			case DSegmentEndEditPart.VISUAL_ID:
				return new DSegmentEndEditPart(view);

			case DTickEditPart.VISUAL_ID:
				return new DTickEditPart(view);

			case DStateSwitchEditPart.VISUAL_ID:
				return new DStateSwitchEditPart(view);

			case DMessageEditPart.VISUAL_ID:
				return new DMessageEditPart(view);

			case DMessageDisplayNameEditPart.VISUAL_ID:
				return new DMessageDisplayNameEditPart(view);
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
		if (source.getFigure() instanceof WrappingLabel) {
			return new TextCellEditorLocator((WrappingLabel) source.getFigure());
		} else if (source.getFigure() instanceof RotatedImageOfString) {
			return new RotatedImageCellEditorLocator((RotatedImageOfString) source.getFigure());
		} else {
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

}
