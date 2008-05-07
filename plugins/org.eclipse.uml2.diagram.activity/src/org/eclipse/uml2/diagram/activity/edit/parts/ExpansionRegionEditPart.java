package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
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
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.policies.ExpansionRegionCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.ExpansionRegionItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;

/**
 * @generated
 */
public class ExpansionRegionEditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3084;

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
	public ExpansionRegionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ExpansionRegionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ExpansionRegionCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
		ExpansionRegionFigure figure = new ExpansionRegionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ExpansionRegionFigure getPrimaryShape() {
		return (ExpansionRegionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ExpansionRegionModeEditPart) {
			((ExpansionRegionModeEditPart) childEditPart).setLabel(getPrimaryShape().getFigureExpansionRegionFigure_keyword());
			return true;
		}
		if (childEditPart instanceof ExpansionRegionExpansionRegionNodeCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureExpansionRegionFigure_ContentPane();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ExpansionRegionExpansionRegionNodeCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof ExpansionRegionExpansionRegionNodeCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureExpansionRegionFigure_ContentPane();
			pane.remove(((ExpansionRegionExpansionRegionNodeCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
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
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		if (editPart instanceof ExpansionRegionExpansionRegionNodeCompartmentEditPart) {
			return getPrimaryShape().getFigureExpansionRegionFigure_ContentPane();
		}
		return super.getContentPaneFor(editPart);
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ExpansionRegionModeEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ExpansionRegionFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private Label fFigureExpansionRegionFigure_keyword;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureExpansionRegionFigure_ContentPane;

		/**
		 * @generated
		 */
		public ExpansionRegionFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setLineStyle(Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureExpansionRegionFigure_ContentPane = new RectangleFigure();
			fFigureExpansionRegionFigure_ContentPane.setFill(false);
			fFigureExpansionRegionFigure_ContentPane.setOutline(false);

			this.add(fFigureExpansionRegionFigure_ContentPane, BorderLayout.CENTER);

			RectangleFigure expansionRegionFigure_LabelContainer0 = new RectangleFigure();
			expansionRegionFigure_LabelContainer0.setFill(false);
			expansionRegionFigure_LabelContainer0.setOutline(false);

			expansionRegionFigure_LabelContainer0.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0)));

			this.add(expansionRegionFigure_LabelContainer0, BorderLayout.TOP);

			BorderLayout layoutExpansionRegionFigure_LabelContainer0 = new BorderLayout();
			expansionRegionFigure_LabelContainer0.setLayoutManager(layoutExpansionRegionFigure_LabelContainer0);

			fFigureExpansionRegionFigure_keyword = new Label();
			fFigureExpansionRegionFigure_keyword.setText("");

			expansionRegionFigure_LabelContainer0.add(fFigureExpansionRegionFigure_keyword, BorderLayout.LEFT);

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

		/**
		 * @generated
		 */
		public Label getFigureExpansionRegionFigure_keyword() {
			return fFigureExpansionRegionFigure_keyword;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureExpansionRegionFigure_ContentPane() {
			return fFigureExpansionRegionFigure_ContentPane;
		}

	}

}
