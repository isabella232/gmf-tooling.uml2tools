package org.eclipse.uml2.diagram.component.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.component.edit.policies.Component2CanonicalEditPolicy;
import org.eclipse.uml2.diagram.component.edit.policies.Component2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.component.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class Component2EditPart extends AbstractBorderedShapeEditPart {

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
	public Component2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Component2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new Component2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child instanceof IBorderItemEditPart) {
					return new BorderItemSelectionEditPolicy();
				}
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new UMLTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		ComponentFigure figure = new ComponentFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ComponentFigure getPrimaryShape() {
		return (ComponentFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentNameEditPart) {
			((ComponentNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureComponentFigure_name());
			return true;
		}
		if (childEditPart instanceof ComponentContents2EditPart) {
			IFigure pane = getPrimaryShape().getFigureComponentFigure_Body();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponentContents2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PortEditPart) {
			IBorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NONE);
			getBorderedFigure().getBorderItemContainer().add(((PortEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof ComponentContents2EditPart) {
			IFigure pane = getPrimaryShape().getFigureComponentFigure_Body();
			pane.remove(((ComponentContents2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PortEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((PortEditPart) childEditPart).getFigure());
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

		if (editPart instanceof ComponentContents2EditPart) {
			return getPrimaryShape().getFigureComponentFigure_Body();
		}
		if (editPart instanceof PortEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(100), getMapMode().DPtoLP(40));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ComponentFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public ComponentFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER

			);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setFillXOR(false);
			this.setOutline(false);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_SOLID);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure componentFigure_LabelsContainer0 = new RectangleFigure();
			componentFigure_LabelsContainer0.setFill(true);
			componentFigure_LabelsContainer0.setFillXOR(false);
			componentFigure_LabelsContainer0.setOutline(true);
			componentFigure_LabelsContainer0.setOutlineXOR(false);
			componentFigure_LabelsContainer0.setLineWidth(1);
			componentFigure_LabelsContainer0.setLineStyle(Graphics.LINE_SOLID);
			componentFigure_LabelsContainer0.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(35)));

			this.add(componentFigure_LabelsContainer0);

			ToolbarLayout layoutComponentFigure_LabelsContainer0 = new ToolbarLayout();
			layoutComponentFigure_LabelsContainer0.setStretchMinorAxis(true);
			layoutComponentFigure_LabelsContainer0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER

			);

			layoutComponentFigure_LabelsContainer0.setSpacing(0);
			layoutComponentFigure_LabelsContainer0.setVertical(true);

			componentFigure_LabelsContainer0.setLayoutManager(layoutComponentFigure_LabelsContainer0);

			WrapLabel componentFigure_fixed_component1 = new WrapLabel();
			componentFigure_fixed_component1.setText("\u00ABcomponent\u00BB");

			componentFigure_LabelsContainer0.add(componentFigure_fixed_component1);

			WrapLabel componentFigure_name1 = new WrapLabel();
			componentFigure_name1.setText("");

			componentFigure_LabelsContainer0.add(componentFigure_name1);
			setFigureComponentFigure_name(componentFigure_name1);

			RectangleFigure componentFigure_Body0 = new RectangleFigure();
			componentFigure_Body0.setFill(true);
			componentFigure_Body0.setFillXOR(false);
			componentFigure_Body0.setOutline(true);
			componentFigure_Body0.setOutlineXOR(false);
			componentFigure_Body0.setLineWidth(1);
			componentFigure_Body0.setLineStyle(Graphics.LINE_SOLID);
			componentFigure_Body0.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(55)));

			this.add(componentFigure_Body0);
			setFigureComponentFigure_Body(componentFigure_Body0);

		}

		/**
		 * @generated
		 */
		private WrapLabel fComponentFigure_name;

		/**
		 * @generated
		 */
		public WrapLabel getFigureComponentFigure_name() {
			return fComponentFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureComponentFigure_name(WrapLabel fig) {
			fComponentFigure_name = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fComponentFigure_Body;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureComponentFigure_Body() {
			return fComponentFigure_Body;
		}

		/**
		 * @generated
		 */
		private void setFigureComponentFigure_Body(RectangleFigure fig) {
			fComponentFigure_Body = fig;
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
