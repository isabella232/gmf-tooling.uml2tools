package org.eclipse.uml2.diagram.usecase.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
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
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.usecase.edit.policies.NestedPackageItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.usecase.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.uml2.diagram.usecase.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class NestedPackageEditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

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
	public NestedPackageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new NestedPackageItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
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
		PackageAsFrameFigure figure = new PackageAsFrameFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PackageAsFrameFigure getPrimaryShape() {
		return (PackageAsFrameFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof NestedPackageNameEditPart) {
			((NestedPackageNameEditPart) childEditPart).setLabel(getPrimaryShape().getPackageAsFrameFigure_name());
			return true;
		}
		if (childEditPart instanceof PackageFramecontentsEditPart) {
			IFigure pane = getPrimaryShape().getPackageAsFrameFigure_contents();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PackageFramecontentsEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof PackageFramecontentsEditPart) {
			IFigure pane = getPrimaryShape().getPackageAsFrameFigure_contents();
			pane.remove(((PackageFramecontentsEditPart) childEditPart).getFigure());
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

		if (editPart instanceof PackageFramecontentsEditPart) {
			return getPrimaryShape().getPackageAsFrameFigure_contents();
		}
		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(300), getMapMode().DPtoLP(100));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(NestedPackageNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class PackageAsFrameFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private Label fPackageAsFrameFigure_name;

		/**
		 * @generated
		 */
		private Label fPackageAsFrameFigure_fixed_package;

		/**
		 * @generated
		 */
		private RectangleFigure fPackageAsFrameFigure_contents;

		/**
		 * @generated
		 */
		public PackageAsFrameFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure packageAsFrameFigure_TopRow0 = new RectangleFigure();
			packageAsFrameFigure_TopRow0.setOutline(false);

			this.add(packageAsFrameFigure_TopRow0, BorderLayout.TOP);

			ToolbarLayout layoutPackageAsFrameFigure_TopRow0 = new ToolbarLayout();
			layoutPackageAsFrameFigure_TopRow0.setStretchMinorAxis(true);
			layoutPackageAsFrameFigure_TopRow0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutPackageAsFrameFigure_TopRow0.setSpacing(0);
			layoutPackageAsFrameFigure_TopRow0.setVertical(false);

			packageAsFrameFigure_TopRow0.setLayoutManager(layoutPackageAsFrameFigure_TopRow0);

			class PackageAsFrameFigure_header1Class extends Shape {

				/**
				 * @generated
				 */
				private final PointList myTemplate = new PointList();

				/**
				 * @generated
				 */
				private Rectangle myTemplateBounds;

				/**
				 * @generated
				 */
				public void addPoint(Point point) {
					myTemplate.addPoint(point);
					myTemplateBounds = null;
				}

				/**
				 * @generated
				 */
				protected void fillShape(Graphics graphics) {
					Rectangle bounds = getBounds();
					graphics.pushState();
					graphics.translate(bounds.x, bounds.y);
					graphics.fillPolygon(scalePointList());
					graphics.popState();
				}

				/**
				 * @generated
				 */
				protected void outlineShape(Graphics graphics) {
					Rectangle bounds = getBounds();
					graphics.pushState();
					graphics.translate(bounds.x, bounds.y);
					graphics.drawPolygon(scalePointList());
					graphics.popState();
				}

				/**
				 * @generated
				 */
				private Rectangle getTemplateBounds() {
					if (myTemplateBounds == null) {
						myTemplateBounds = myTemplate.getBounds().getCopy().union(0, 0);
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
					Rectangle pointsBounds = getTemplateBounds();
					Rectangle actualBounds = getBounds();

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
			;
			PackageAsFrameFigure_header1Class packageAsFrameFigure_header1 = new PackageAsFrameFigure_header1Class();

			packageAsFrameFigure_header1.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			packageAsFrameFigure_header1.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(40)));
			packageAsFrameFigure_header1.addPoint(new Point(getMapMode().DPtoLP(35), getMapMode().DPtoLP(40)));
			packageAsFrameFigure_header1.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode().DPtoLP(35)));
			packageAsFrameFigure_header1.addPoint(new Point(getMapMode().DPtoLP(40), getMapMode().DPtoLP(0)));
			packageAsFrameFigure_header1.setFill(true);

			packageAsFrameFigure_header1.setBorder(new MarginBorder(getMapMode().DPtoLP(10), getMapMode().DPtoLP(10), getMapMode().DPtoLP(13), getMapMode().DPtoLP(13)));

			packageAsFrameFigure_TopRow0.add(packageAsFrameFigure_header1);

			ToolbarLayout layoutPackageAsFrameFigure_header1 = new ToolbarLayout();
			layoutPackageAsFrameFigure_header1.setStretchMinorAxis(true);
			layoutPackageAsFrameFigure_header1.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutPackageAsFrameFigure_header1.setSpacing(10);
			layoutPackageAsFrameFigure_header1.setVertical(false);

			packageAsFrameFigure_header1.setLayoutManager(layoutPackageAsFrameFigure_header1);

			fPackageAsFrameFigure_fixed_package = new Label();
			fPackageAsFrameFigure_fixed_package.setText("package");

			packageAsFrameFigure_header1.add(fPackageAsFrameFigure_fixed_package);

			fPackageAsFrameFigure_name = new Label();
			fPackageAsFrameFigure_name.setText("");

			packageAsFrameFigure_header1.add(fPackageAsFrameFigure_name);

			fPackageAsFrameFigure_contents = new RectangleFigure();
			fPackageAsFrameFigure_contents.setOutline(false);
			fPackageAsFrameFigure_contents.setForegroundColor(ColorConstants.white);

			this.add(fPackageAsFrameFigure_contents, BorderLayout.CENTER);

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
		public Label getPackageAsFrameFigure_name() {
			return fPackageAsFrameFigure_name;
		}

		/**
		 * @generated
		 */
		public Label getPackageAsFrameFigure_fixed_package() {
			return fPackageAsFrameFigure_fixed_package;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getPackageAsFrameFigure_contents() {
			return fPackageAsFrameFigure_contents;
		}

	}

}
