package org.eclipse.uml2.diagram.statemachine.edit.parts;

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
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

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
			case RegionEditPart.VISUAL_ID:
				return new RegionEditPart(view);
			case Pseudostate9EditPart.VISUAL_ID:
				return new Pseudostate9EditPart(view);
			case PseudostateNameEditPart.VISUAL_ID:
				return new PseudostateNameEditPart(view);
			case Pseudostate10EditPart.VISUAL_ID:
				return new Pseudostate10EditPart(view);
			case PseudostateName2EditPart.VISUAL_ID:
				return new PseudostateName2EditPart(view);
			case StateEditPart.VISUAL_ID:
				return new StateEditPart(view);
			case StateNameEditPart.VISUAL_ID:
				return new StateNameEditPart(view);
			case State2EditPart.VISUAL_ID:
				return new State2EditPart(view);
			case StateName2EditPart.VISUAL_ID:
				return new StateName2EditPart(view);
			case Region2EditPart.VISUAL_ID:
				return new Region2EditPart(view);
			case FinalStateEditPart.VISUAL_ID:
				return new FinalStateEditPart(view);
			case PseudostateEditPart.VISUAL_ID:
				return new PseudostateEditPart(view);
			case Pseudostate2EditPart.VISUAL_ID:
				return new Pseudostate2EditPart(view);
			case Pseudostate3EditPart.VISUAL_ID:
				return new Pseudostate3EditPart(view);
			case Pseudostate4EditPart.VISUAL_ID:
				return new Pseudostate4EditPart(view);
			case Pseudostate5EditPart.VISUAL_ID:
				return new Pseudostate5EditPart(view);
			case Pseudostate6EditPart.VISUAL_ID:
				return new Pseudostate6EditPart(view);
			case Pseudostate7EditPart.VISUAL_ID:
				return new Pseudostate7EditPart(view);
			case Pseudostate8EditPart.VISUAL_ID:
				return new Pseudostate8EditPart(view);
			case RegionSubverticesEditPart.VISUAL_ID:
				return new RegionSubverticesEditPart(view);
			case StateContentEditPart.VISUAL_ID:
				return new StateContentEditPart(view);
			case RegionSubvertices2EditPart.VISUAL_ID:
				return new RegionSubvertices2EditPart(view);
			case StateMachineEditPart.VISUAL_ID:
				return new StateMachineEditPart(view);
			case TransitionEditPart.VISUAL_ID:
				return new TransitionEditPart(view);
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
