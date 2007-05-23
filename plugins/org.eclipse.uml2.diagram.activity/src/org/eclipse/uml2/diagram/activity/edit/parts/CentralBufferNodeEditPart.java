package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.GridLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
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
import org.eclipse.uml2.diagram.activity.edit.policies.CentralBufferNodeCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.CentralBufferNodeItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class CentralBufferNodeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3037;

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
	public CentralBufferNodeEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CentralBufferNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CentralBufferNodeCanonicalEditPolicy());
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
		if (childEditPart instanceof CentralBufferNodeNameEditPart) {
			((CentralBufferNodeNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureCentralBufferFigure_name());
			return true;
		}
		if (childEditPart instanceof CentralBufferNodeName2EditPart) {
			((CentralBufferNodeName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureCentralBufferFigure_states());
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
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(60), getMapMode().DPtoLP(30));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(CentralBufferNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class CentralBufferFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public CentralBufferFigure() {

			GridLayout layoutThis = new GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_SOLID);
			this.setPreferredSize(new Dimension(getMapMode().DPtoLP(60), getMapMode().DPtoLP(30)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure centralBufferFigure_NameContainer0 = new RectangleFigure();
			centralBufferFigure_NameContainer0.setFill(false);
			centralBufferFigure_NameContainer0.setFillXOR(false);
			centralBufferFigure_NameContainer0.setOutline(false);
			centralBufferFigure_NameContainer0.setOutlineXOR(false);
			centralBufferFigure_NameContainer0.setLineWidth(1);
			centralBufferFigure_NameContainer0.setLineStyle(Graphics.LINE_SOLID);

			GridData constraintCentralBufferFigure_NameContainer0 = new GridData();
			constraintCentralBufferFigure_NameContainer0.verticalAlignment = GridData.CENTER;
			constraintCentralBufferFigure_NameContainer0.horizontalAlignment = GridData.CENTER;
			constraintCentralBufferFigure_NameContainer0.horizontalIndent = 0;
			constraintCentralBufferFigure_NameContainer0.horizontalSpan = 1;
			constraintCentralBufferFigure_NameContainer0.verticalSpan = 1;
			constraintCentralBufferFigure_NameContainer0.grabExcessHorizontalSpace = true;
			constraintCentralBufferFigure_NameContainer0.grabExcessVerticalSpace = true;
			this.add(centralBufferFigure_NameContainer0, constraintCentralBufferFigure_NameContainer0);

			GridLayout layoutCentralBufferFigure_NameContainer0 = new GridLayout();
			layoutCentralBufferFigure_NameContainer0.numColumns = 1;
			layoutCentralBufferFigure_NameContainer0.makeColumnsEqualWidth = true;
			centralBufferFigure_NameContainer0.setLayoutManager(layoutCentralBufferFigure_NameContainer0);

			WrapLabel centralBufferFigure_fixed_central1 = new WrapLabel();
			centralBufferFigure_fixed_central1.setText("\u00ABcentralBuffer\u00BB");

			GridData constraintCentralBufferFigure_fixed_central1 = new GridData();
			constraintCentralBufferFigure_fixed_central1.verticalAlignment = GridData.CENTER;
			constraintCentralBufferFigure_fixed_central1.horizontalAlignment = GridData.CENTER;
			constraintCentralBufferFigure_fixed_central1.horizontalIndent = 0;
			constraintCentralBufferFigure_fixed_central1.horizontalSpan = 1;
			constraintCentralBufferFigure_fixed_central1.verticalSpan = 1;
			constraintCentralBufferFigure_fixed_central1.grabExcessHorizontalSpace = true;
			constraintCentralBufferFigure_fixed_central1.grabExcessVerticalSpace = false;
			centralBufferFigure_NameContainer0.add(centralBufferFigure_fixed_central1, constraintCentralBufferFigure_fixed_central1);

			WrapLabel centralBufferFigure_name1 = new WrapLabel();
			centralBufferFigure_name1.setText("");

			GridData constraintCentralBufferFigure_name1 = new GridData();
			constraintCentralBufferFigure_name1.verticalAlignment = GridData.CENTER;
			constraintCentralBufferFigure_name1.horizontalAlignment = GridData.CENTER;
			constraintCentralBufferFigure_name1.horizontalIndent = 0;
			constraintCentralBufferFigure_name1.horizontalSpan = 1;
			constraintCentralBufferFigure_name1.verticalSpan = 1;
			constraintCentralBufferFigure_name1.grabExcessHorizontalSpace = true;
			constraintCentralBufferFigure_name1.grabExcessVerticalSpace = false;
			centralBufferFigure_NameContainer0.add(centralBufferFigure_name1, constraintCentralBufferFigure_name1);

			setFigureCentralBufferFigure_name(centralBufferFigure_name1);

			WrapLabel centralBufferFigure_states1 = new WrapLabel();
			centralBufferFigure_states1.setText("");

			GridData constraintCentralBufferFigure_states1 = new GridData();
			constraintCentralBufferFigure_states1.verticalAlignment = GridData.CENTER;
			constraintCentralBufferFigure_states1.horizontalAlignment = GridData.CENTER;
			constraintCentralBufferFigure_states1.horizontalIndent = 0;
			constraintCentralBufferFigure_states1.horizontalSpan = 1;
			constraintCentralBufferFigure_states1.verticalSpan = 1;
			constraintCentralBufferFigure_states1.grabExcessHorizontalSpace = true;
			constraintCentralBufferFigure_states1.grabExcessVerticalSpace = false;
			centralBufferFigure_NameContainer0.add(centralBufferFigure_states1, constraintCentralBufferFigure_states1);

			setFigureCentralBufferFigure_states(centralBufferFigure_states1);

		}

		/**
		 * @generated
		 */
		private WrapLabel fCentralBufferFigure_name;

		/**
		 * @generated
		 */
		public WrapLabel getFigureCentralBufferFigure_name() {
			return fCentralBufferFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureCentralBufferFigure_name(WrapLabel fig) {
			fCentralBufferFigure_name = fig;
		}

		/**
		 * @generated
		 */
		private WrapLabel fCentralBufferFigure_states;

		/**
		 * @generated
		 */
		public WrapLabel getFigureCentralBufferFigure_states() {
			return fCentralBufferFigure_states;
		}

		/**
		 * @generated
		 */
		private void setFigureCentralBufferFigure_states(WrapLabel fig) {
			fCentralBufferFigure_states = fig;
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
