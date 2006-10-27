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

import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;

import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;

import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;

import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.statemachine.edit.policies.Pseudostate3ItemSemanticEditPolicy;

/**
 * @generated
 */
public class Pseudostate3EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3006;

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
	public Pseudostate3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Pseudostate3ItemSemanticEditPolicy());
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
		DeepHistoryFigure figure = new DeepHistoryFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public DeepHistoryFigure getPrimaryShape() {
		return (DeepHistoryFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(25), getMapMode().DPtoLP(25));
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
	public class DeepHistoryFigure extends org.eclipse.draw2d.Ellipse {

		/**
		 * @generated
		 */
		public class ScalablePolygon extends org.eclipse.draw2d.Shape {

			/**
			 * @generated
			 */
			private final org.eclipse.draw2d.geometry.PointList myTemplate = new org.eclipse.draw2d.geometry.PointList();

			/**
			 * @generated
			 */
			private org.eclipse.draw2d.geometry.Rectangle myTemplateBounds;

			/**
			 * @generated
			 */
			public void addPoint(org.eclipse.draw2d.geometry.Point point) {
				myTemplate.addPoint(point);
				myTemplateBounds = null;
			}

			/**
			 * @generated
			 */
			protected void fillShape(org.eclipse.draw2d.Graphics graphics) {
				org.eclipse.draw2d.geometry.Rectangle bounds = getBounds();
				graphics.pushState();
				graphics.translate(bounds.x, bounds.y);
				graphics.fillPolygon(scalePointList());
				graphics.popState();
			}

			/**
			 * @generated
			 */
			protected void outlineShape(org.eclipse.draw2d.Graphics graphics) {
				org.eclipse.draw2d.geometry.Rectangle bounds = getBounds();
				graphics.pushState();
				graphics.translate(bounds.x, bounds.y);
				graphics.drawPolygon(scalePointList());
				graphics.popState();
			}

			/**
			 * @generated
			 */
			private org.eclipse.draw2d.geometry.Rectangle getTemplateBounds() {
				if (myTemplateBounds == null) {
					myTemplateBounds = new org.eclipse.draw2d.geometry.Rectangle();
					myTemplateBounds = myTemplate.getBounds().union(0, 0);
					//just safety -- we are going to use this as divider 
					if (myTemplateBounds.width < 1) {
						myTemplateBounds.width = 1;
					}
					if (myTemplateBounds.height < 1) {
						myTemplateBounds.height = 1;
					}
				}
				return myTemplateBounds;
			}

			/**
			 * @generated
			 */
			private int[] scalePointList() {
				org.eclipse.draw2d.geometry.Rectangle pointsBounds = getTemplateBounds();
				org.eclipse.draw2d.geometry.Rectangle actualBounds = getBounds();

				float xScale = ((float) actualBounds.width) / pointsBounds.width;
				float yScale = ((float) actualBounds.height) / pointsBounds.height;

				if (xScale == 1 && yScale == 1) {
					return myTemplate.toIntArray();
				}
				int[] scaled = (int[]) myTemplate.toIntArray().clone();
				for (int i = 0; i < scaled.length; i += 2) {
					scaled[i] = (int) Math.floor(scaled[i] * xScale);
					scaled[i + 1] = (int) Math.floor(scaled[i + 1] * yScale);
				}
				return scaled;
			}
		}

		/**
		 * @generated
		 */
		public DeepHistoryFigure() {

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout myGenLayoutManager = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			myGenLayoutManager.numColumns = 2;
			myGenLayoutManager.makeColumnsEqualWidth = true;
			myGenLayoutManager.marginWidth = 0;
			myGenLayoutManager.marginHeight = 0;
			myGenLayoutManager.horizontalSpacing = 0;
			myGenLayoutManager.verticalSpacing = 0;

			this.setLayoutManager(myGenLayoutManager);

			this.setPreferredSize(getMapMode().DPtoLP(25), getMapMode().DPtoLP(25));
			this.setMaximumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(25), getMapMode().DPtoLP(25)));
			this.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(25), getMapMode().DPtoLP(25)));
			this.setBorder(new org.eclipse.draw2d.MarginBorder(getMapMode().DPtoLP(6), getMapMode().DPtoLP(6), getMapMode().DPtoLP(6), getMapMode().DPtoLP(3)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			ScalablePolygon fig_0 = new ScalablePolygon();
			fig_0.setFill(true);
			fig_0.setPreferredSize(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15));
			fig_0.setMaximumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15)));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(0, 40));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(0, 20));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(40, 20));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(40, 40));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(40, 0));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(40, 20));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(0, 20));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(0, 0));

			setFigureDeepHistoryFigure_Letter(fig_0);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalIndent = 0;
			layData0.horizontalSpan = 1;
			layData0.verticalSpan = 1;
			layData0.grabExcessHorizontalSpace = true;
			layData0.grabExcessVerticalSpace = true;

			this.add(fig_0, layData0);
			org.eclipse.draw2d.RectangleFigure fig_1 = new org.eclipse.draw2d.RectangleFigure();
			fig_1.setFill(false);
			fig_1.setOutline(false);
			fig_1.setPreferredSize(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15));
			fig_1.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15)));
			fig_1.setBorder(new org.eclipse.draw2d.MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(2), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0)));

			org.eclipse.draw2d.StackLayout layouter1 = new org.eclipse.draw2d.StackLayout();

			fig_1.setLayoutManager(layouter1);

			setFigureDeepHistoryFigure_AsteriskContainer(fig_1);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData1 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData1.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData1.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData1.horizontalIndent = 0;
			layData1.horizontalSpan = 1;
			layData1.verticalSpan = 1;
			layData1.grabExcessHorizontalSpace = true;
			layData1.grabExcessVerticalSpace = true;

			this.add(fig_1, layData1);
			ScalablePolygon fig_2 = new ScalablePolygon();
			fig_2.setFill(true);
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(10, 7));
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(30, 33));
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(20, 20));
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(30, 7));
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(10, 33));
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(20, 20));
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(40, 20));
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(0, 20));
			fig_2.addPoint(new org.eclipse.draw2d.geometry.Point(20, 20));

			Object layData2 = null;

			fig_1.add(fig_2, layData2);
		}

		/**
		 * @generated
		 */
		private ScalablePolygon fDeepHistoryFigure_Letter;

		/**
		 * @generated
		 */
		public ScalablePolygon getFigureDeepHistoryFigure_Letter() {
			return fDeepHistoryFigure_Letter;
		}

		/**
		 * @generated
		 */
		private void setFigureDeepHistoryFigure_Letter(ScalablePolygon fig) {
			fDeepHistoryFigure_Letter = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fDeepHistoryFigure_AsteriskContainer;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureDeepHistoryFigure_AsteriskContainer() {
			return fDeepHistoryFigure_AsteriskContainer;
		}

		/**
		 * @generated
		 */
		private void setFigureDeepHistoryFigure_AsteriskContainer(org.eclipse.draw2d.RectangleFigure fig) {
			fDeepHistoryFigure_AsteriskContainer = fig;
		}

		/**
		 * @generated
		 */
		private boolean myUseLocalCoordinates = true;

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
