package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.Polyline;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;

import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;

import org.eclipse.gef.requests.CreateRequest;

import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;

import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;

import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;

import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.activity.edit.policies.CallBehaviorActionCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.CallBehaviorActionItemSemanticEditPolicy;

import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.common.draw2d.PolylineContainer;

/**
 * @generated
 */
public class CallBehaviorActionEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2017;

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
	public CallBehaviorActionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CallBehaviorActionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CallBehaviorActionCanonicalEditPolicy());
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
		ActionCallBehaviorFigure figure = new ActionCallBehaviorFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ActionCallBehaviorFigure getPrimaryShape() {
		return (ActionCallBehaviorFigure) primaryShape;
	}

	/**
	 * @generated 
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof OutputPin3EditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		if (editPart instanceof InputPin4EditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CallBehaviorActionNameEditPart) {
			((CallBehaviorActionNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureActionCallBehaviorFigure_name());
			return true;
		}
		if (childEditPart instanceof OutputPin3EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.EAST);
			getBorderedFigure().getBorderItemContainer().add(((OutputPin3EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof InputPin4EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(((InputPin4EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof OutputPin3EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((OutputPin3EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InputPin4EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((InputPin4EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(80), getMapMode().DPtoLP(50));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(CallBehaviorActionNameEditPart.VISUAL_ID));
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
	public class ActionCallBehaviorFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		public ActionCallBehaviorFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_SOLID);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure actionCallBehaviorFigure_AuxBottom0 = new RectangleFigure();
			actionCallBehaviorFigure_AuxBottom0.setFill(false);
			actionCallBehaviorFigure_AuxBottom0.setFillXOR(false);
			actionCallBehaviorFigure_AuxBottom0.setOutline(false);
			actionCallBehaviorFigure_AuxBottom0.setOutlineXOR(false);
			actionCallBehaviorFigure_AuxBottom0.setLineWidth(1);
			actionCallBehaviorFigure_AuxBottom0.setLineStyle(Graphics.LINE_SOLID);

			this.add(actionCallBehaviorFigure_AuxBottom0, BorderLayout.BOTTOM);

			BorderLayout layoutActionCallBehaviorFigure_AuxBottom0 = new BorderLayout();
			actionCallBehaviorFigure_AuxBottom0.setLayoutManager(layoutActionCallBehaviorFigure_AuxBottom0);

			RectangleFigure actionCallBehaviorFigure_AuxBottomLeft1 = new RectangleFigure();
			actionCallBehaviorFigure_AuxBottomLeft1.setFill(false);
			actionCallBehaviorFigure_AuxBottomLeft1.setFillXOR(false);
			actionCallBehaviorFigure_AuxBottomLeft1.setOutline(false);
			actionCallBehaviorFigure_AuxBottomLeft1.setOutlineXOR(false);
			actionCallBehaviorFigure_AuxBottomLeft1.setLineWidth(1);
			actionCallBehaviorFigure_AuxBottomLeft1.setLineStyle(Graphics.LINE_SOLID);

			actionCallBehaviorFigure_AuxBottom0.add(actionCallBehaviorFigure_AuxBottomLeft1, BorderLayout.LEFT);

			actionCallBehaviorFigure_AuxBottomLeft1.setLayoutManager(new StackLayout());

			PolylineContainer actionCallBehaviorFigure_AuxIconOwner2 = new PolylineContainer();

			actionCallBehaviorFigure_AuxIconOwner2.setPreferredSize(new Dimension(getMapMode().DPtoLP(20), getMapMode().DPtoLP(20)));

			actionCallBehaviorFigure_AuxBottomLeft1.add(actionCallBehaviorFigure_AuxIconOwner2);

			Polyline actionCallBehaviorFigure_IconCenter3 = new Polyline();
			actionCallBehaviorFigure_IconCenter3.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode().DPtoLP(4)));
			actionCallBehaviorFigure_IconCenter3.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode().DPtoLP(16)));
			actionCallBehaviorFigure_IconCenter3.setFill(true);
			actionCallBehaviorFigure_IconCenter3.setFillXOR(false);
			actionCallBehaviorFigure_IconCenter3.setOutline(true);
			actionCallBehaviorFigure_IconCenter3.setOutlineXOR(false);
			actionCallBehaviorFigure_IconCenter3.setLineWidth(2);
			actionCallBehaviorFigure_IconCenter3.setLineStyle(Graphics.LINE_SOLID);
			actionCallBehaviorFigure_IconCenter3.setForegroundColor(ColorConstants.darkBlue);

			actionCallBehaviorFigure_AuxIconOwner2.add(actionCallBehaviorFigure_IconCenter3);

			Polyline actionCallBehaviorFigure_IconLeft3 = new Polyline();
			actionCallBehaviorFigure_IconLeft3.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));
			actionCallBehaviorFigure_IconLeft3.addPoint(new Point(getMapMode().DPtoLP(5), getMapMode().DPtoLP(10)));
			actionCallBehaviorFigure_IconLeft3.addPoint(new Point(getMapMode().DPtoLP(5), getMapMode().DPtoLP(16)));
			actionCallBehaviorFigure_IconLeft3.setFill(true);
			actionCallBehaviorFigure_IconLeft3.setFillXOR(false);
			actionCallBehaviorFigure_IconLeft3.setOutline(true);
			actionCallBehaviorFigure_IconLeft3.setOutlineXOR(false);
			actionCallBehaviorFigure_IconLeft3.setLineWidth(2);
			actionCallBehaviorFigure_IconLeft3.setLineStyle(Graphics.LINE_SOLID);
			actionCallBehaviorFigure_IconLeft3.setForegroundColor(ColorConstants.darkBlue);

			actionCallBehaviorFigure_AuxIconOwner2.add(actionCallBehaviorFigure_IconLeft3);

			Polyline actionCallBehaviorFigure_IconRight3 = new Polyline();
			actionCallBehaviorFigure_IconRight3.addPoint(new Point(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10)));
			actionCallBehaviorFigure_IconRight3.addPoint(new Point(getMapMode().DPtoLP(15), getMapMode().DPtoLP(10)));
			actionCallBehaviorFigure_IconRight3.addPoint(new Point(getMapMode().DPtoLP(15), getMapMode().DPtoLP(16)));
			actionCallBehaviorFigure_IconRight3.setFill(true);
			actionCallBehaviorFigure_IconRight3.setFillXOR(false);
			actionCallBehaviorFigure_IconRight3.setOutline(true);
			actionCallBehaviorFigure_IconRight3.setOutlineXOR(false);
			actionCallBehaviorFigure_IconRight3.setLineWidth(2);
			actionCallBehaviorFigure_IconRight3.setLineStyle(Graphics.LINE_SOLID);
			actionCallBehaviorFigure_IconRight3.setForegroundColor(ColorConstants.darkBlue);

			actionCallBehaviorFigure_AuxIconOwner2.add(actionCallBehaviorFigure_IconRight3);

			RectangleFigure actionCallBehaviorFigure_AuxCenter0 = new RectangleFigure();
			actionCallBehaviorFigure_AuxCenter0.setFill(false);
			actionCallBehaviorFigure_AuxCenter0.setFillXOR(false);
			actionCallBehaviorFigure_AuxCenter0.setOutline(false);
			actionCallBehaviorFigure_AuxCenter0.setOutlineXOR(false);
			actionCallBehaviorFigure_AuxCenter0.setLineWidth(1);
			actionCallBehaviorFigure_AuxCenter0.setLineStyle(Graphics.LINE_SOLID);

			this.add(actionCallBehaviorFigure_AuxCenter0, BorderLayout.CENTER);

			CenterLayout layoutActionCallBehaviorFigure_AuxCenter0 = new CenterLayout();

			actionCallBehaviorFigure_AuxCenter0.setLayoutManager(layoutActionCallBehaviorFigure_AuxCenter0);

			WrapLabel actionCallBehaviorFigure_name1 = new WrapLabel();
			actionCallBehaviorFigure_name1.setText("");

			actionCallBehaviorFigure_name1.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			actionCallBehaviorFigure_AuxCenter0.add(actionCallBehaviorFigure_name1);
			setFigureActionCallBehaviorFigure_name(actionCallBehaviorFigure_name1);

		}

		/**
		 * @generated
		 */
		private WrapLabel fActionCallBehaviorFigure_name;

		/**
		 * @generated
		 */
		public WrapLabel getFigureActionCallBehaviorFigure_name() {
			return fActionCallBehaviorFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureActionCallBehaviorFigure_name(WrapLabel fig) {
			fActionCallBehaviorFigure_name = fig;
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
