package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
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
import org.eclipse.uml2.diagram.activity.edit.policies.CentralBufferNode2CanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.CentralBufferNode2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class CentralBufferNode2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3025;

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
	public CentralBufferNode2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CentralBufferNode2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CentralBufferNode2CanonicalEditPolicy());
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
		CentralBufferFigure figure = new CentralBufferFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CentralBufferFigure getPrimaryShape() {
		return (CentralBufferFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CentralBufferNodeName3EditPart) {
			((CentralBufferNodeName3EditPart) childEditPart).setLabel(getPrimaryShape().getFigureCentralBufferFigure_name());
			return true;
		}
		if (childEditPart instanceof CentralBufferNodeName4EditPart) {
			((CentralBufferNodeName4EditPart) childEditPart).setLabel(getPrimaryShape().getFigureCentralBufferFigure_states());
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(CentralBufferNodeName3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class CentralBufferFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrapLabel fFigureCentralBufferFigure_name;

		/**
		 * @generated
		 */
		private WrapLabel fFigureCentralBufferFigure_states;

		/**
		 * @generated
		 */
		public CentralBufferFigure() {

			this.setLayoutManager(new StackLayout());
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure centralBufferFigure_NameContainer0 = new RectangleFigure();
			centralBufferFigure_NameContainer0.setFill(false);
			centralBufferFigure_NameContainer0.setOutline(false);

			this.add(centralBufferFigure_NameContainer0);

			ToolbarLayout layoutCentralBufferFigure_NameContainer0 = new ToolbarLayout();
			layoutCentralBufferFigure_NameContainer0.setStretchMinorAxis(false);
			layoutCentralBufferFigure_NameContainer0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutCentralBufferFigure_NameContainer0.setSpacing(0);
			layoutCentralBufferFigure_NameContainer0.setVertical(true);

			centralBufferFigure_NameContainer0.setLayoutManager(layoutCentralBufferFigure_NameContainer0);

			WrapLabel centralBufferFigure_fixed_central1 = new WrapLabel();
			centralBufferFigure_fixed_central1.setText("\u00ABcentralBuffer\u00BB");

			centralBufferFigure_NameContainer0.add(centralBufferFigure_fixed_central1);

			WrapLabel centralBufferFigure_name1 = new WrapLabel();
			centralBufferFigure_name1.setText("");

			centralBufferFigure_NameContainer0.add(centralBufferFigure_name1);
			fFigureCentralBufferFigure_name = centralBufferFigure_name1;

			WrapLabel centralBufferFigure_states1 = new WrapLabel();
			centralBufferFigure_states1.setText("");

			centralBufferFigure_NameContainer0.add(centralBufferFigure_states1);
			fFigureCentralBufferFigure_states = centralBufferFigure_states1;

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
		public WrapLabel getFigureCentralBufferFigure_name() {
			return fFigureCentralBufferFigure_name;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureCentralBufferFigure_states() {
			return fFigureCentralBufferFigure_states;
		}

	}

}
