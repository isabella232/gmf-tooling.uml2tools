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

			this.setLayoutManager(new org.eclipse.gmf.internal.codegen.draw2d.GridLayout());
			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel artifactFigure_fixed_artifact0 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			artifactFigure_fixed_artifact0.setText("\u00ABartifact\u00BB");

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintArtifactFigure_fixed_artifact0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintArtifactFigure_fixed_artifact0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintArtifactFigure_fixed_artifact0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintArtifactFigure_fixed_artifact0.horizontalIndent = 0;
			constraintArtifactFigure_fixed_artifact0.horizontalSpan = 1;
			constraintArtifactFigure_fixed_artifact0.verticalSpan = 1;
			constraintArtifactFigure_fixed_artifact0.grabExcessHorizontalSpace = true;
			constraintArtifactFigure_fixed_artifact0.grabExcessVerticalSpace = false;
			this.add(artifactFigure_fixed_artifact0, constraintArtifactFigure_fixed_artifact0);

			org.eclipse.draw2d.RectangleFigure artifactFigure_NameContainer0 = new org.eclipse.draw2d.RectangleFigure();
			artifactFigure_NameContainer0.setFill(false);
			artifactFigure_NameContainer0.setFillXOR(false);
			artifactFigure_NameContainer0.setOutline(false);
			artifactFigure_NameContainer0.setOutlineXOR(false);
			artifactFigure_NameContainer0.setLineWidth(1);
			artifactFigure_NameContainer0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintArtifactFigure_NameContainer0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintArtifactFigure_NameContainer0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintArtifactFigure_NameContainer0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintArtifactFigure_NameContainer0.horizontalIndent = 0;
			constraintArtifactFigure_NameContainer0.horizontalSpan = 1;
			constraintArtifactFigure_NameContainer0.verticalSpan = 1;
			constraintArtifactFigure_NameContainer0.grabExcessHorizontalSpace = true;
			constraintArtifactFigure_NameContainer0.grabExcessVerticalSpace = true;
			this.add(artifactFigure_NameContainer0, constraintArtifactFigure_NameContainer0);

			org.eclipse.uml2.diagram.common.draw2d.CenterLayout layoutArtifactFigure_NameContainer0 = new org.eclipse.uml2.diagram.common.draw2d.CenterLayout();

			artifactFigure_NameContainer0.setLayoutManager(layoutArtifactFigure_NameContainer0);

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel artifactFigure_name1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			artifactFigure_name1.setText("");

			artifactFigure_NameContainer0.add(artifactFigure_name1);
			setFigureArtifactFigure_name(artifactFigure_name1);

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
