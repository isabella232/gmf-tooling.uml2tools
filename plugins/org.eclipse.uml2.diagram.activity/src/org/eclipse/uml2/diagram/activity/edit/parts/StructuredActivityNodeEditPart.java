package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;

import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import org.eclipse.gef.requests.CreateRequest;

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;

import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.activity.edit.policies.StructuredActivityNodeItemSemanticEditPolicy;

/**
 * @generated
 */
public class StructuredActivityNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

	/**
	 * @generated
	 */
	protected IFigure contentPane;

	/**
	 * @generated
	 */
	protected IFigure primaryShape;

	/**
	 * @generated
	 */
	public StructuredActivityNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StructuredActivityNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		StructuredActivityFigure figure = new StructuredActivityFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public StructuredActivityFigure getPrimaryShape() {
		return (StructuredActivityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
		return result;
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	 * Default implementation treats passed figure as content pane.
	 * Respects layout one may have set for generated figure.
	 * @param nodeShape instance of generated figure class
	 * @generated
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(getMapMode().DPtoLP(5));
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	 * @generated
	 */
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	 * @generated
	 */
	public class StructuredActivityFigure extends org.eclipse.draw2d.RoundedRectangle {

		/**
		 * @generated
		 */
		public StructuredActivityFigure() {

			org.eclipse.draw2d.BorderLayout layoutThis = new org.eclipse.draw2d.BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			org.eclipse.draw2d.RectangleFigure structuredActivityFigure_ContentPane0 = new org.eclipse.draw2d.RectangleFigure();
			structuredActivityFigure_ContentPane0.setFill(false);
			structuredActivityFigure_ContentPane0.setFillXOR(false);
			structuredActivityFigure_ContentPane0.setOutline(false);
			structuredActivityFigure_ContentPane0.setOutlineXOR(false);
			structuredActivityFigure_ContentPane0.setLineWidth(1);
			structuredActivityFigure_ContentPane0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			this.add(structuredActivityFigure_ContentPane0, org.eclipse.draw2d.BorderLayout.CENTER);
			setFigureStructuredActivityFigure_ContentPane(structuredActivityFigure_ContentPane0);

			org.eclipse.draw2d.RectangleFigure aux_StructuredActivityFigure_LabelContainer0 = new org.eclipse.draw2d.RectangleFigure();
			aux_StructuredActivityFigure_LabelContainer0.setFill(false);
			aux_StructuredActivityFigure_LabelContainer0.setFillXOR(false);
			aux_StructuredActivityFigure_LabelContainer0.setOutline(false);
			aux_StructuredActivityFigure_LabelContainer0.setOutlineXOR(false);
			aux_StructuredActivityFigure_LabelContainer0.setLineWidth(1);
			aux_StructuredActivityFigure_LabelContainer0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			aux_StructuredActivityFigure_LabelContainer0.setBorder(new org.eclipse.draw2d.MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0)));

			this.add(aux_StructuredActivityFigure_LabelContainer0, org.eclipse.draw2d.BorderLayout.TOP);

			org.eclipse.draw2d.BorderLayout layoutAux_StructuredActivityFigure_LabelContainer0 = new org.eclipse.draw2d.BorderLayout();
			aux_StructuredActivityFigure_LabelContainer0.setLayoutManager(layoutAux_StructuredActivityFigure_LabelContainer0);

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel structuredActivityFigure_fixed_structured1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			structuredActivityFigure_fixed_structured1.setText("\u00ABstructured\u00BB");

			aux_StructuredActivityFigure_LabelContainer0.add(structuredActivityFigure_fixed_structured1, org.eclipse.draw2d.BorderLayout.LEFT);

		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fStructuredActivityFigure_ContentPane;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureStructuredActivityFigure_ContentPane() {
			return fStructuredActivityFigure_ContentPane;
		}

		/**
		 * @generated
		 */
		private void setFigureStructuredActivityFigure_ContentPane(org.eclipse.draw2d.RectangleFigure fig) {
			fStructuredActivityFigure_ContentPane = fig;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = false;

		/**
		 * @generated
		 */
		protected boolean useLocalCoordinates() {
			return myUseLocalCoordinates;
		}

		/**
		 * @generated
		 */
		protected void setUseLocalCoordinates(boolean useLocalCoordinates) {
			myUseLocalCoordinates = useLocalCoordinates;
		}

	}

}
