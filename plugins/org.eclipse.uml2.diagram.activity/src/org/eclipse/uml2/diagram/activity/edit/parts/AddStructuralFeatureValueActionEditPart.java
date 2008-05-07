package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
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
import org.eclipse.uml2.diagram.activity.edit.policies.AddStructuralFeatureValueActionCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.AddStructuralFeatureValueActionItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;

/**
 * @generated
 */
public class AddStructuralFeatureValueActionEditPart extends AbstractBorderedShapeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3043;

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
	public AddStructuralFeatureValueActionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy());
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new AddStructuralFeatureValueActionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new AddStructuralFeatureValueActionCanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
		ActionBaseFigure figure = new ActionBaseFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ActionBaseFigure getPrimaryShape() {
		return (ActionBaseFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof AddStructuralFeatureValueActionNameEditPart) {
			((AddStructuralFeatureValueActionNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureActionBaseFigure_name());
			return true;
		}
		if (childEditPart instanceof InputPinEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(((InputPinEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof InputPin2EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(((InputPin2EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof InputPin3EditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.WEST);
			getBorderedFigure().getBorderItemContainer().add(((InputPin3EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof InputPinEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((InputPinEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InputPin2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((InputPin2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InputPin3EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((InputPin3EditPart) childEditPart).getFigure());
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

		if (editPart instanceof InputPinEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		if (editPart instanceof InputPin2EditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		if (editPart instanceof InputPin3EditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return super.getContentPaneFor(editPart);
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(AddStructuralFeatureValueActionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ActionBaseFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private Label fFigureActionBaseFigure_name;

		/**
		 * @generated
		 */
		public ActionBaseFigure() {

			CenterLayout layoutThis = new CenterLayout();

			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(16), getMapMode().DPtoLP(16)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureActionBaseFigure_name = new Label();
			fFigureActionBaseFigure_name.setText("");

			fFigureActionBaseFigure_name.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			this.add(fFigureActionBaseFigure_name);

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
		public Label getFigureActionBaseFigure_name() {
			return fFigureActionBaseFigure_name;
		}

	}

	/**
	 * @generated
	 */
	protected void reorderChild(EditPart child, int index) {
		// Save the constraint of the child so that it does not
		// get lost during the remove and re-add.
		IFigure childFigure = ((GraphicalEditPart) child).getFigure();
		LayoutManager layout = getContentPaneFor((IGraphicalEditPart) child).getLayoutManager();
		Object constraint = null;
		if (layout != null) {
			constraint = layout.getConstraint(childFigure);
		}
		super.reorderChild(child, index);
		setLayoutConstraint(child, childFigure, constraint);
	}

}
