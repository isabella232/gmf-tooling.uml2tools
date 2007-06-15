package org.eclipse.uml2.diagram.statemachine.edit.parts;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.GridData;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.internal.codegen.draw2d.GridLayout;
import org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
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
import org.eclipse.uml2.diagram.common.draw2d.BisectionBorderItemLocator;
import org.eclipse.uml2.diagram.common.draw2d.BorderItemNameLocator;
import org.eclipse.uml2.diagram.common.draw2d.LaneLayout;
import org.eclipse.uml2.diagram.common.editpolicies.LaneLayoutEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.StateMachine2CanonicalEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.StateMachine2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

/**
 * @generated
 */
public class StateMachine2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2004;

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
	public StateMachine2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StateMachine2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new StateMachine2CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy("LayoutEditPolicy", new LaneLayoutEditPolicy()); //$NON-NLS-1$
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		LayoutEditPolicy lep = new LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child instanceof IBorderItemEditPart) {
					return new BorderItemSelectionEditPolicy();
				}
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
		CompositeStateFigure figure = new CompositeStateFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CompositeStateFigure getPrimaryShape() {
		return (CompositeStateFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StateMachineNameEditPart) {
			((StateMachineNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureCompositeStateFigure_name());
			return true;
		}
		if (childEditPart instanceof Pseudostate9EditPart) {
			IBorderItemLocator locator = new BisectionBorderItemLocator(getMainFigure());
			getBorderedFigure().getBorderItemContainer().add(((Pseudostate9EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof Pseudostate10EditPart) {
			IBorderItemLocator locator = new BisectionBorderItemLocator(getMainFigure());
			getBorderedFigure().getBorderItemContainer().add(((Pseudostate10EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof Pseudostate9EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((Pseudostate9EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof Pseudostate10EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((Pseudostate10EditPart) childEditPart).getFigure());
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
	protected IFigure getContentPaneForGen(IGraphicalEditPart editPart) {

		if (editPart instanceof Pseudostate9EditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		if (editPart instanceof Pseudostate10EditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated NOT
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof Pseudostate9EditPart || editPart instanceof Pseudostate10EditPart) {
			return getContentPaneForGen(editPart);
		}
		return contentPane;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(40), getMapMode().DPtoLP(40));
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
	 * @generated NOT
	 * XXX: Support content pane in xPand custom templates
	 */
	protected IFigure setupContentPane(IFigure nodeShape) {
		return getPrimaryShape().getFigureCompositeStateFigure_Body();
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(StateMachineNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class CompositeStateFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrapLabel fFigureCompositeStateFigure_name;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompositeStateFigure_Body;

		/**
		 * @generated
		 */
		public CompositeStateFigure() {

			org.eclipse.draw2d.GridLayout layoutThis = new org.eclipse.draw2d.GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(18), getMapMode().DPtoLP(18)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(2), getMapMode().DPtoLP(6), getMapMode().DPtoLP(2)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure compositeStateFigure_NameContainer0 = new RectangleFigure();
			compositeStateFigure_NameContainer0.setFill(false);
			compositeStateFigure_NameContainer0.setOutline(false);

			GridData constraintCompositeStateFigure_NameContainer0 = new GridData();
			constraintCompositeStateFigure_NameContainer0.verticalAlignment = GridData.FILL;
			constraintCompositeStateFigure_NameContainer0.horizontalAlignment = GridData.FILL;
			constraintCompositeStateFigure_NameContainer0.horizontalIndent = 0;
			constraintCompositeStateFigure_NameContainer0.horizontalSpan = 1;
			constraintCompositeStateFigure_NameContainer0.verticalSpan = 1;
			constraintCompositeStateFigure_NameContainer0.grabExcessHorizontalSpace = true;
			constraintCompositeStateFigure_NameContainer0.grabExcessVerticalSpace = false;
			this.add(compositeStateFigure_NameContainer0, constraintCompositeStateFigure_NameContainer0);

			org.eclipse.draw2d.GridLayout layoutCompositeStateFigure_NameContainer0 = new org.eclipse.draw2d.GridLayout();
			layoutCompositeStateFigure_NameContainer0.numColumns = 1;
			layoutCompositeStateFigure_NameContainer0.makeColumnsEqualWidth = true;
			layoutCompositeStateFigure_NameContainer0.horizontalSpacing = 0;
			layoutCompositeStateFigure_NameContainer0.verticalSpacing = 0;
			layoutCompositeStateFigure_NameContainer0.marginWidth = 3;
			layoutCompositeStateFigure_NameContainer0.marginHeight = 3;
			compositeStateFigure_NameContainer0.setLayoutManager(layoutCompositeStateFigure_NameContainer0);

			WrapLabel compositeStateFigure_name1 = new WrapLabel();
			compositeStateFigure_name1.setText("");

			GridData constraintCompositeStateFigure_name1 = new GridData();
			constraintCompositeStateFigure_name1.verticalAlignment = GridData.CENTER;
			constraintCompositeStateFigure_name1.horizontalAlignment = GridData.CENTER;
			constraintCompositeStateFigure_name1.horizontalIndent = 0;
			constraintCompositeStateFigure_name1.horizontalSpan = 1;
			constraintCompositeStateFigure_name1.verticalSpan = 1;
			constraintCompositeStateFigure_name1.grabExcessHorizontalSpace = true;
			constraintCompositeStateFigure_name1.grabExcessVerticalSpace = false;
			compositeStateFigure_NameContainer0.add(compositeStateFigure_name1, constraintCompositeStateFigure_name1);

			fFigureCompositeStateFigure_name = compositeStateFigure_name1;

			RectangleFigure compositeStateFigure_Body0 = new RectangleFigure();
			compositeStateFigure_Body0.setOutline(false);

			GridData constraintCompositeStateFigure_Body0 = new GridData();
			constraintCompositeStateFigure_Body0.verticalAlignment = GridData.FILL;
			constraintCompositeStateFigure_Body0.horizontalAlignment = GridData.FILL;
			constraintCompositeStateFigure_Body0.horizontalIndent = 0;
			constraintCompositeStateFigure_Body0.horizontalSpan = 1;
			constraintCompositeStateFigure_Body0.verticalSpan = 1;
			constraintCompositeStateFigure_Body0.grabExcessHorizontalSpace = true;
			constraintCompositeStateFigure_Body0.grabExcessVerticalSpace = true;
			this.add(compositeStateFigure_Body0, constraintCompositeStateFigure_Body0);

			fFigureCompositeStateFigure_Body = compositeStateFigure_Body0;

			LaneLayout layoutCompositeStateFigure_Body0 = new LaneLayout();

			compositeStateFigure_Body0.setLayoutManager(layoutCompositeStateFigure_Body0);

		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureCompositeStateFigure_name() {
			return fFigureCompositeStateFigure_name;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureCompositeStateFigure_Body() {
			return fFigureCompositeStateFigure_Body;
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
