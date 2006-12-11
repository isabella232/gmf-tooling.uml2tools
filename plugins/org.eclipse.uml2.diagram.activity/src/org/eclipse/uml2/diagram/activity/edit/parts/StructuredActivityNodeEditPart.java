package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;

import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import org.eclipse.gef.requests.CreateRequest;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;

import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;

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
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart) {
			return getPrimaryShape().getFigureStructuredActivityFigure_ContentPane();
		}

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureStructuredActivityFigure_ContentPane();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureStructuredActivityFigure_ContentPane();
			pane.remove(((StructuredActivityNodeStructuredActivityContentPaneCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
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
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	public class StructuredActivityFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		public StructuredActivityFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure structuredActivityFigure_ContentPane0 = new RectangleFigure();
			structuredActivityFigure_ContentPane0.setFill(false);
			structuredActivityFigure_ContentPane0.setFillXOR(false);
			structuredActivityFigure_ContentPane0.setOutline(false);
			structuredActivityFigure_ContentPane0.setOutlineXOR(false);
			structuredActivityFigure_ContentPane0.setLineWidth(1);
			structuredActivityFigure_ContentPane0.setLineStyle(Graphics.LINE_SOLID);

			this.add(structuredActivityFigure_ContentPane0, BorderLayout.CENTER);
			setFigureStructuredActivityFigure_ContentPane(structuredActivityFigure_ContentPane0);

			RectangleFigure aux_StructuredActivityFigure_LabelContainer0 = new RectangleFigure();
			aux_StructuredActivityFigure_LabelContainer0.setFill(false);
			aux_StructuredActivityFigure_LabelContainer0.setFillXOR(false);
			aux_StructuredActivityFigure_LabelContainer0.setOutline(false);
			aux_StructuredActivityFigure_LabelContainer0.setOutlineXOR(false);
			aux_StructuredActivityFigure_LabelContainer0.setLineWidth(1);
			aux_StructuredActivityFigure_LabelContainer0.setLineStyle(Graphics.LINE_SOLID);

			aux_StructuredActivityFigure_LabelContainer0.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0)));

			this.add(aux_StructuredActivityFigure_LabelContainer0, BorderLayout.TOP);

			BorderLayout layoutAux_StructuredActivityFigure_LabelContainer0 = new BorderLayout();
			aux_StructuredActivityFigure_LabelContainer0.setLayoutManager(layoutAux_StructuredActivityFigure_LabelContainer0);

			WrapLabel structuredActivityFigure_fixed_structured1 = new WrapLabel();
			structuredActivityFigure_fixed_structured1.setText("\u00ABstructured\u00BB");

			aux_StructuredActivityFigure_LabelContainer0.add(structuredActivityFigure_fixed_structured1, BorderLayout.LEFT);

		}

		/**
		 * @generated
		 */
		private RectangleFigure fStructuredActivityFigure_ContentPane;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStructuredActivityFigure_ContentPane() {
			return fStructuredActivityFigure_ContentPane;
		}

		/**
		 * @generated
		 */
		private void setFigureStructuredActivityFigure_ContentPane(RectangleFigure fig) {
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
