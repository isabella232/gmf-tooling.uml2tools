package org.eclipse.uml2.diagram.component.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;

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

import org.eclipse.uml2.diagram.component.edit.policies.Artifact2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class Artifact2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public Artifact2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Artifact2ItemSemanticEditPolicy());
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
		ArtifactFigure figure = new ArtifactFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ArtifactFigure getPrimaryShape() {
		return (ArtifactFigure) primaryShape;
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
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArtifactName2EditPart) {
			((ArtifactName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureArtifactFigure_name());
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
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(80), getMapMode().DPtoLP(60));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ArtifactName2EditPart.VISUAL_ID));
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
	public class ArtifactFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public ArtifactFigure() {

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout myGenLayoutManager = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			myGenLayoutManager.numColumns = 1;
			myGenLayoutManager.makeColumnsEqualWidth = true;
			myGenLayoutManager.marginWidth = 0;
			myGenLayoutManager.marginHeight = 0;
			myGenLayoutManager.horizontalSpacing = 0;
			myGenLayoutManager.verticalSpacing = 0;

			this.setLayoutManager(myGenLayoutManager);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_0 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			fig_0.setText("\u00ABartifact\u00BB");

			setFigureArtifactFigure_fixed_artifact(fig_0);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			layData0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			layData0.horizontalIndent = 0;
			layData0.horizontalSpan = 1;
			layData0.verticalSpan = 1;
			layData0.grabExcessHorizontalSpace = true;
			layData0.grabExcessVerticalSpace = false;

			this.add(fig_0, layData0);
			org.eclipse.draw2d.RectangleFigure fig_1 = new org.eclipse.draw2d.RectangleFigure();
			fig_1.setFill(false);
			fig_1.setOutline(false);

			org.eclipse.uml2.diagram.common.draw2d.CenterLayout layouter1 = new org.eclipse.uml2.diagram.common.draw2d.CenterLayout();

			fig_1.setLayoutManager(layouter1);

			setFigureArtifactFigure_NameContainer(fig_1);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData1 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData1.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData1.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData1.horizontalIndent = 0;
			layData1.horizontalSpan = 1;
			layData1.verticalSpan = 1;
			layData1.grabExcessHorizontalSpace = true;
			layData1.grabExcessVerticalSpace = true;

			this.add(fig_1, layData1);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_2 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();

			setFigureArtifactFigure_name(fig_2);

			Object layData2 = null;

			fig_1.add(fig_2, layData2);
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fArtifactFigure_fixed_artifact;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureArtifactFigure_fixed_artifact() {
			return fArtifactFigure_fixed_artifact;
		}

		/**
		 * @generated
		 */
		private void setFigureArtifactFigure_fixed_artifact(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fArtifactFigure_fixed_artifact = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fArtifactFigure_NameContainer;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureArtifactFigure_NameContainer() {
			return fArtifactFigure_NameContainer;
		}

		/**
		 * @generated
		 */
		private void setFigureArtifactFigure_NameContainer(org.eclipse.draw2d.RectangleFigure fig) {
			fArtifactFigure_NameContainer = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fArtifactFigure_name;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureArtifactFigure_name() {
			return fArtifactFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureArtifactFigure_name(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fArtifactFigure_name = fig;
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
