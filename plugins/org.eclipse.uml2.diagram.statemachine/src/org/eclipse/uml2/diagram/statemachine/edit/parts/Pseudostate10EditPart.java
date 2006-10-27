package org.eclipse.uml2.diagram.statemachine.edit.parts;

import java.util.Iterator;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;

import org.eclipse.gef.commands.Command;

import org.eclipse.gef.editparts.LayerManager;

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

import org.eclipse.uml2.diagram.statemachine.edit.policies.Pseudostate10ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.UMLExtNodeLabelHostLayoutEditPolicy;

import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class Pseudostate10EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public Pseudostate10EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Pseudostate10ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected void decorateChild(EditPart child) {
				if (isExternalLabel(child)) {
					return;
				}
				super.decorateChild(child);
			}

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
		UMLExtNodeLabelHostLayoutEditPolicy xlep = new UMLExtNodeLabelHostLayoutEditPolicy() {

			protected boolean isExternalLabel(EditPart editPart) {
				return Pseudostate10EditPart.this.isExternalLabel(editPart);
			}
		};
		xlep.setRealLayoutEditPolicy(lep);
		return xlep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		ExitPointFigure figure = new ExitPointFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ExitPointFigure getPrimaryShape() {
		return (ExitPointFigure) primaryShape;
	}

	/**
	 * @generated 
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (isExternalLabel(editPart)) {
			return getExternalLabelsContainer();
		}

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(PseudostateName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	protected boolean isExternalLabel(EditPart childEditPart) {
		if (childEditPart instanceof PseudostateName2EditPart) {
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected IFigure getExternalLabelsContainer() {
		LayerManager root = (LayerManager) getRoot();
		return root.getLayer(UMLEditPartFactory.EXTERNAL_NODE_LABELS_LAYER);
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (isExternalLabel(childEditPart)) {
			IFigure labelFigure = ((GraphicalEditPart) childEditPart).getFigure();
			getExternalLabelsContainer().add(labelFigure);
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	 * @generated
	 */
	protected void removeChildVisual(EditPart childEditPart) {
		if (isExternalLabel(childEditPart)) {
			IFigure labelFigure = ((GraphicalEditPart) childEditPart).getFigure();
			getExternalLabelsContainer().remove(labelFigure);
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	 * @generated
	 */
	public void removeNotify() {
		for (Iterator it = getChildren().iterator(); it.hasNext();) {
			EditPart childEditPart = (EditPart) it.next();
			if (isExternalLabel(childEditPart)) {
				IFigure labelFigure = ((GraphicalEditPart) childEditPart).getFigure();
				getExternalLabelsContainer().remove(labelFigure);
			}
		}
		super.removeNotify();
	}

	/**
	 * @generated
	 */
	public class ExitPointFigure extends org.eclipse.draw2d.Ellipse {

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
		public ExitPointFigure() {

			org.eclipse.draw2d.StackLayout myGenLayoutManager = new org.eclipse.draw2d.StackLayout();

			this.setLayoutManager(myGenLayoutManager);

			this.setPreferredSize(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15));
			this.setMaximumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15)));
			this.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(15), getMapMode().DPtoLP(15)));
			this.setBorder(new org.eclipse.draw2d.MarginBorder(getMapMode().DPtoLP(2), getMapMode().DPtoLP(2), getMapMode().DPtoLP(2), getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			ScalablePolygon fig_0 = new ScalablePolygon();
			fig_0.setFill(true);
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(0, 0));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(40, 40));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(20, 20));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(40, 0));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(0, 40));
			fig_0.addPoint(new org.eclipse.draw2d.geometry.Point(20, 20));

			setFigureExitPointFigure_Cross(fig_0);

			Object layData0 = null;

			this.add(fig_0, layData0);
		}

		/**
		 * @generated
		 */
		private ScalablePolygon fExitPointFigure_Cross;

		/**
		 * @generated
		 */
		public ScalablePolygon getFigureExitPointFigure_Cross() {
			return fExitPointFigure_Cross;
		}

		/**
		 * @generated
		 */
		private void setFigureExitPointFigure_Cross(ScalablePolygon fig) {
			fExitPointFigure_Cross = fig;
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
