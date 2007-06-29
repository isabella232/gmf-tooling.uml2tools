package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
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
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.policies.ActivityCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.ActivityItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;

/**
 * @generated
 */
public class ActivityEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2026;

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
	public ActivityEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ActivityItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ActivityCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child instanceof IBorderItemEditPart) {
					return new BorderItemSelectionEditPolicy();
				}
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
		ActivityFigure figure = new ActivityFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ActivityFigure getPrimaryShape() {
		return (ActivityFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActivityNameEditPart) {
			((ActivityNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureActivityFigure_name());
			return true;
		}
		if (childEditPart instanceof ActivitySubverticesEditPart) {
			IFigure pane = getPrimaryShape().getFigureActivityFigure_Body();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ActivitySubverticesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityParameterNodeEditPart) {
			IBorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(((ActivityParameterNodeEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof ActivitySubverticesEditPart) {
			IFigure pane = getPrimaryShape().getFigureActivityFigure_Body();
			pane.remove(((ActivitySubverticesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ActivityParameterNodeEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((ActivityParameterNodeEditPart) childEditPart).getFigure());
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

		if (editPart instanceof ActivitySubverticesEditPart) {
			return getPrimaryShape().getFigureActivityFigure_Body();
		}
		if (editPart instanceof ActivityParameterNodeEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(600), getMapMode().DPtoLP(600));
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
	protected NodeFigure createMainFigure() {
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ActivityFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrapLabel fFigureActivityFigure_name;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureActivityFigure_Body;

		/**
		 * @generated
		 */
		public ActivityFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(18), getMapMode().DPtoLP(18)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure activityFigureRectangle_name0 = new RectangleFigure();
			activityFigureRectangle_name0.setFill(false);
			activityFigureRectangle_name0.setOutline(false);
			activityFigureRectangle_name0.setBorder(createBorder0());

			this.add(activityFigureRectangle_name0, BorderLayout.TOP);

			activityFigureRectangle_name0.setLayoutManager(new StackLayout());

			fFigureActivityFigure_name = new WrapLabel();
			fFigureActivityFigure_name.setText("");

			activityFigureRectangle_name0.add(fFigureActivityFigure_name);

			CenterLayout layoutFFigureActivityFigure_name = new CenterLayout();

			fFigureActivityFigure_name.setLayoutManager(layoutFFigureActivityFigure_name);

			fFigureActivityFigure_Body = new RectangleFigure();
			fFigureActivityFigure_Body.setFill(false);
			fFigureActivityFigure_Body.setOutline(false);

			this.add(fFigureActivityFigure_Body, BorderLayout.CENTER);

		}

		private Border createBorder0() {
			OneLineBorder result = new OneLineBorder();

			result.setPosition(PositionConstants.NONE);

			return result;
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
		public WrapLabel getFigureActivityFigure_name() {
			return fFigureActivityFigure_name;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureActivityFigure_Body() {
			return fFigureActivityFigure_Body;
		}

	}

}
