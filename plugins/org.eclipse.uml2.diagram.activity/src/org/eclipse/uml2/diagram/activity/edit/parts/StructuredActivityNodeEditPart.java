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

			org.eclipse.draw2d.BorderLayout myGenLayoutManager = new org.eclipse.draw2d.BorderLayout();

			this.setLayoutManager(myGenLayoutManager);

			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_DASH);
			this.setCornerDimensions(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.draw2d.RectangleFigure fig_0 = new org.eclipse.draw2d.RectangleFigure();
			fig_0.setFill(false);
			fig_0.setOutline(false);

			setFigureStructuredActivityFigure_ContentPane(fig_0);

			Object layData0 = org.eclipse.draw2d.BorderLayout.CENTER;

			this.add(fig_0, layData0);
			org.eclipse.draw2d.RectangleFigure fig_1 = new org.eclipse.draw2d.RectangleFigure();
			fig_1.setFill(false);
			fig_1.setOutline(false);
			fig_1.setBorder(new org.eclipse.draw2d.MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0)));

			org.eclipse.draw2d.BorderLayout layouter1 = new org.eclipse.draw2d.BorderLayout();

			fig_1.setLayoutManager(layouter1);

			setFigureAux_StructuredActivityFigure_LabelContainer(fig_1);

			Object layData1 = org.eclipse.draw2d.BorderLayout.TOP;

			this.add(fig_1, layData1);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_2 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			fig_2.setText("\u00ABstructured\u00BB");

			Object layData2 = org.eclipse.draw2d.BorderLayout.LEFT;

			fig_1.add(fig_2, layData2);
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
		private org.eclipse.draw2d.RectangleFigure fAux_StructuredActivityFigure_LabelContainer;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureAux_StructuredActivityFigure_LabelContainer() {
			return fAux_StructuredActivityFigure_LabelContainer;
		}

		/**
		 * @generated
		 */
		private void setFigureAux_StructuredActivityFigure_LabelContainer(org.eclipse.draw2d.RectangleFigure fig) {
			fAux_StructuredActivityFigure_LabelContainer = fig;
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
