package org.eclipse.uml2.diagram.timing.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.XYLayoutEditPolicy;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.common.draw2d.RotatedImageOfString;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.CreationEditPolicyWithCustomReparent;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.diagram.timing.draw2d.layout.TimeLineLayout;
import org.eclipse.uml2.diagram.timing.edit.policies.DBlockCanonicalEditPolicy;
import org.eclipse.uml2.diagram.timing.edit.policies.DBlockItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.timing.part.TimingDDiagramUpdater;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;

/**
 * @generated
 */

public class DBlockEditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3001;

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
	public DBlockEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		if (TimingDVisualIDRegistry.isShortcutDescendant(getNotationView())) {
			installEditPolicy(UpdateDescriptionEditPolicy.ROLE, new UpdateDescriptionEditPolicy(TimingDDiagramUpdater.TYPED_ADAPTER, true));
		}
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(TimingDVisualIDRegistry.TYPED_ADAPTER));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DBlockItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new DBlockCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutEditPolicy());
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
		TimeLinePartitionFigure figure = new TimeLinePartitionFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public TimeLinePartitionFigure getPrimaryShape() {
		return (TimeLinePartitionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DBlockDisplayNameEditPart) {
			((DBlockDisplayNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureTimeLinePartitionFigure_name());
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

		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(-1), getMapMode().DPtoLP(120));
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		EditPolicy result = super.getPrimaryDragEditPolicy();
		if (result instanceof ResizableEditPolicy) {
			ResizableEditPolicy ep = (ResizableEditPolicy) result;
			ep.setResizeDirections(PositionConstants.NORTH | PositionConstants.SOUTH);
		}
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
	 * @generated NOT
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return getPrimaryShape().getFigureTimeLinePartitionFigure_body();
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
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(getMapMode().DPtoLP(width));
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(TimingDVisualIDRegistry.getType(DBlockDisplayNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class TimeLinePartitionFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RotatedImageOfString fFigureTimeLinePartitionFigure_name;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureTimeLinePartitionFigure_body;

		/**
		 * @generated
		 */
		public TimeLinePartitionFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureTimeLinePartitionFigure_name = new RotatedImageOfString();

			fFigureTimeLinePartitionFigure_name.setBorder(new MarginBorder(getMapMode().DPtoLP(8), getMapMode().DPtoLP(13), getMapMode().DPtoLP(8), getMapMode().DPtoLP(13)));

			this.add(fFigureTimeLinePartitionFigure_name, BorderLayout.LEFT);

			fFigureTimeLinePartitionFigure_body = new RectangleFigure();
			fFigureTimeLinePartitionFigure_body.setOutline(false);

			this.add(fFigureTimeLinePartitionFigure_body, BorderLayout.CENTER);

			TimeLineLayout layoutFFigureTimeLinePartitionFigure_body = new TimeLineLayout();

			layoutFFigureTimeLinePartitionFigure_body.setViewer(getViewer());

			fFigureTimeLinePartitionFigure_body.setLayoutManager(layoutFFigureTimeLinePartitionFigure_body);

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
		public RotatedImageOfString getFigureTimeLinePartitionFigure_name() {
			return fFigureTimeLinePartitionFigure_name;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureTimeLinePartitionFigure_body() {
			return fFigureTimeLinePartitionFigure_body;
		}

	}

}
