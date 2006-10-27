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

import org.eclipse.uml2.diagram.component.edit.policies.Component2CanonicalEditPolicy;
import org.eclipse.uml2.diagram.component.edit.policies.Component2ItemSemanticEditPolicy;
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ComponentNameEditPart.VISUAL_ID));
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

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout myGenLayoutManager = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			myGenLayoutManager.numColumns = 1;
			myGenLayoutManager.makeColumnsEqualWidth = true;
			myGenLayoutManager.marginWidth = 0;
			myGenLayoutManager.marginHeight = 0;
			myGenLayoutManager.horizontalSpacing = 0;
			myGenLayoutManager.verticalSpacing = 0;

			this.setLayoutManager(myGenLayoutManager);

			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.draw2d.RectangleFigure fig_0 = new org.eclipse.draw2d.RectangleFigure();

			fig_0.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(35)));

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout layouter0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			layouter0.numColumns = 1;
			layouter0.makeColumnsEqualWidth = false;

			fig_0.setLayoutManager(layouter0);

			setFigureComponentFigure_LabelsContainer(fig_0);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalIndent = 0;
			layData0.horizontalSpan = 2;
			layData0.verticalSpan = 1;
			layData0.grabExcessHorizontalSpace = true;
			layData0.grabExcessVerticalSpace = false;

			this.add(fig_0, layData0);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			fig_1.setText("\u00ABcomponent\u00BB");

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData1 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData1.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			layData1.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			layData1.horizontalIndent = 0;
			layData1.horizontalSpan = 1;
			layData1.verticalSpan = 1;
			layData1.grabExcessHorizontalSpace = true;
			layData1.grabExcessVerticalSpace = false;

			fig_0.add(fig_1, layData1);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_2 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();

			setFigureComponentFigure_name(fig_2);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData2 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData2.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			layData2.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			layData2.horizontalIndent = 0;
			layData2.horizontalSpan = 1;
			layData2.verticalSpan = 1;
			layData2.grabExcessHorizontalSpace = true;
			layData2.grabExcessVerticalSpace = false;

			fig_0.add(fig_2, layData2);
			org.eclipse.draw2d.RectangleFigure fig_3 = new org.eclipse.draw2d.RectangleFigure();

			fig_3.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(55)));

			setFigureComponentFigure_Body(fig_3);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData3 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData3.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData3.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData3.horizontalIndent = 0;
			layData3.horizontalSpan = 1;
			layData3.verticalSpan = 1;
			layData3.grabExcessHorizontalSpace = true;
			layData3.grabExcessVerticalSpace = true;

			this.add(fig_3, layData3);
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fComponentFigure_LabelsContainer;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureComponentFigure_LabelsContainer() {
			return fComponentFigure_LabelsContainer;
		}

		/**
		 * @generated
		 */
		private void setFigureComponentFigure_LabelsContainer(org.eclipse.draw2d.RectangleFigure fig) {
			fComponentFigure_LabelsContainer = fig;
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
