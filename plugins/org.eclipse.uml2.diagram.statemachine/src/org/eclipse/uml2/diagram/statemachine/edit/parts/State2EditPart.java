package org.eclipse.uml2.diagram.statemachine.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;

import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import org.eclipse.gef.requests.CreateRequest;

import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;

import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.statemachine.edit.policies.State2CanonicalEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.State2ItemSemanticEditPolicy;

import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class State2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3012;

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
	public State2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new State2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new State2CanonicalEditPolicy());
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
		CompositeStateFigure figure = new CompositeStateFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CompositeStateFigure getPrimaryShape() {
		return (CompositeStateFigure) primaryShape;
	}

	/**
	 * @generated 
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StateName2EditPart) {
			((StateName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureCompositeStateFigure_name());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(60), getMapMode().DPtoLP(70));
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(StateName2EditPart.VISUAL_ID));
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
	public class CompositeStateFigure extends org.eclipse.draw2d.RoundedRectangle {

		/**
		 * @generated
		 */
		public CompositeStateFigure() {
			this.setCornerDimensions(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(18), getMapMode().DPtoLP(18)));
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			this.setBorder(new org.eclipse.draw2d.MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(2), getMapMode().DPtoLP(6), getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel compositeStateFigure_name0 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			compositeStateFigure_name0.setText("");

			this.add(compositeStateFigure_name0);
			setFigureCompositeStateFigure_name(compositeStateFigure_name0);

			org.eclipse.draw2d.RectangleFigure compositeStateFigure_Body0 = new org.eclipse.draw2d.RectangleFigure();
			compositeStateFigure_Body0.setFill(true);
			compositeStateFigure_Body0.setFillXOR(false);
			compositeStateFigure_Body0.setOutline(false);
			compositeStateFigure_Body0.setOutlineXOR(false);
			compositeStateFigure_Body0.setLineWidth(1);
			compositeStateFigure_Body0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			this.add(compositeStateFigure_Body0);
			setFigureCompositeStateFigure_Body(compositeStateFigure_Body0);

			org.eclipse.uml2.diagram.common.draw2d.LaneLayout layoutCompositeStateFigure_Body0 = new org.eclipse.uml2.diagram.common.draw2d.LaneLayout();

			compositeStateFigure_Body0.setLayoutManager(layoutCompositeStateFigure_Body0);

		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fCompositeStateFigure_name;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureCompositeStateFigure_name() {
			return fCompositeStateFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureCompositeStateFigure_name(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fCompositeStateFigure_name = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fCompositeStateFigure_Body;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureCompositeStateFigure_Body() {
			return fCompositeStateFigure_Body;
		}

		/**
		 * @generated
		 */
		private void setFigureCompositeStateFigure_Body(org.eclipse.draw2d.RectangleFigure fig) {
			fCompositeStateFigure_Body = fig;
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
