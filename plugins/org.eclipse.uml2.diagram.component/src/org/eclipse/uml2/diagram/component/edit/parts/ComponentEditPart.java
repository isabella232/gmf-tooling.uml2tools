package org.eclipse.uml2.diagram.component.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.StackLayout;

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

import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;

import org.eclipse.gmf.runtime.notation.View;

import org.eclipse.uml2.diagram.component.edit.policies.ComponentCanonicalEditPolicy;
import org.eclipse.uml2.diagram.component.edit.policies.ComponentItemSemanticEditPolicy;

import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class ComponentEditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public ComponentEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ComponentItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ComponentCanonicalEditPolicy());
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
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof ComponentContentsEditPart) {
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
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentName2EditPart) {
			((ComponentName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureComponentFigure_name());
			return true;
		}
		if (childEditPart instanceof ComponentContentsEditPart) {
			IFigure pane = getPrimaryShape().getFigureComponentFigure_Body();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ComponentContentsEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PortEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.NONE);
			getBorderedFigure().getBorderItemContainer().add(((PortEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ComponentContentsEditPart) {
			IFigure pane = getPrimaryShape().getFigureComponentFigure_Body();
			pane.remove(((ComponentContentsEditPart) childEditPart).getFigure());
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
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(100), getMapMode().DPtoLP(80));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentName2EditPart.VISUAL_ID));
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
	public class ComponentFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public ComponentFigure() {

			this.setLayoutManager(new org.eclipse.gmf.internal.codegen.draw2d.GridLayout());
			this.setFill(false);
			this.setFillXOR(false);
			this.setOutline(false);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			org.eclipse.draw2d.RectangleFigure componentFigure_LabelsContainer0 = new org.eclipse.draw2d.RectangleFigure();
			componentFigure_LabelsContainer0.setFill(true);
			componentFigure_LabelsContainer0.setFillXOR(false);
			componentFigure_LabelsContainer0.setOutline(true);
			componentFigure_LabelsContainer0.setOutlineXOR(false);
			componentFigure_LabelsContainer0.setLineWidth(1);
			componentFigure_LabelsContainer0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			componentFigure_LabelsContainer0.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(35)));

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintComponentFigure_LabelsContainer0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintComponentFigure_LabelsContainer0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintComponentFigure_LabelsContainer0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintComponentFigure_LabelsContainer0.horizontalIndent = 0;
			constraintComponentFigure_LabelsContainer0.horizontalSpan = 2;
			constraintComponentFigure_LabelsContainer0.verticalSpan = 1;
			constraintComponentFigure_LabelsContainer0.grabExcessHorizontalSpace = true;
			constraintComponentFigure_LabelsContainer0.grabExcessVerticalSpace = false;
			this.add(componentFigure_LabelsContainer0, constraintComponentFigure_LabelsContainer0);

			componentFigure_LabelsContainer0.setLayoutManager(new org.eclipse.gmf.internal.codegen.draw2d.GridLayout());

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel componentFigure_fixed_component1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			componentFigure_fixed_component1.setText("\u00ABcomponent\u00BB");

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintComponentFigure_fixed_component1 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintComponentFigure_fixed_component1.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintComponentFigure_fixed_component1.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintComponentFigure_fixed_component1.horizontalIndent = 0;
			constraintComponentFigure_fixed_component1.horizontalSpan = 1;
			constraintComponentFigure_fixed_component1.verticalSpan = 1;
			constraintComponentFigure_fixed_component1.grabExcessHorizontalSpace = true;
			constraintComponentFigure_fixed_component1.grabExcessVerticalSpace = false;
			componentFigure_LabelsContainer0.add(componentFigure_fixed_component1, constraintComponentFigure_fixed_component1);

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel componentFigure_name1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			componentFigure_name1.setText("");

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintComponentFigure_name1 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintComponentFigure_name1.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintComponentFigure_name1.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintComponentFigure_name1.horizontalIndent = 0;
			constraintComponentFigure_name1.horizontalSpan = 1;
			constraintComponentFigure_name1.verticalSpan = 1;
			constraintComponentFigure_name1.grabExcessHorizontalSpace = true;
			constraintComponentFigure_name1.grabExcessVerticalSpace = false;
			componentFigure_LabelsContainer0.add(componentFigure_name1, constraintComponentFigure_name1);

			setFigureComponentFigure_name(componentFigure_name1);

			org.eclipse.draw2d.RectangleFigure componentFigure_Body0 = new org.eclipse.draw2d.RectangleFigure();
			componentFigure_Body0.setFill(true);
			componentFigure_Body0.setFillXOR(false);
			componentFigure_Body0.setOutline(true);
			componentFigure_Body0.setOutlineXOR(false);
			componentFigure_Body0.setLineWidth(1);
			componentFigure_Body0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			componentFigure_Body0.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(55)));

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintComponentFigure_Body0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintComponentFigure_Body0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintComponentFigure_Body0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintComponentFigure_Body0.horizontalIndent = 0;
			constraintComponentFigure_Body0.horizontalSpan = 1;
			constraintComponentFigure_Body0.verticalSpan = 1;
			constraintComponentFigure_Body0.grabExcessHorizontalSpace = true;
			constraintComponentFigure_Body0.grabExcessVerticalSpace = true;
			this.add(componentFigure_Body0, constraintComponentFigure_Body0);

			setFigureComponentFigure_Body(componentFigure_Body0);

		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fComponentFigure_name;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureComponentFigure_name() {
			return fComponentFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureComponentFigure_name(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fComponentFigure_name = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fComponentFigure_Body;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureComponentFigure_Body() {
			return fComponentFigure_Body;
		}

		/**
		 * @generated
		 */
		private void setFigureComponentFigure_Body(org.eclipse.draw2d.RectangleFigure fig) {
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
