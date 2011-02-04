package org.eclipse.uml2.diagram.statemachine.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateUnspecifiedTypeRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.U2TResizableShapeEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.State_RegionItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */

public class State_RegionEditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3002;

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
	public State_RegionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new State_RegionItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);

	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

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
		return primaryShape = new RegionFigure();
	}

	/**
	 * @generated
	 */
	public RegionFigure getPrimaryShape() {
		return (RegionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof RegionName2EditPart) {
			((RegionName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureRegionFigure_name());
			return true;
		}
		if (childEditPart instanceof State_RegionSubverticesEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionFigure_Compartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((State_RegionSubverticesEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof State_RegionSubverticesEditPart) {
			IFigure pane = getPrimaryShape().getFigureRegionFigure_Compartment();
			pane.remove(((State_RegionSubverticesEditPart) childEditPart).getFigure());
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
		if (editPart instanceof State_RegionSubverticesEditPart) {
			return getPrimaryShape().getFigureRegionFigure_Compartment();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	 * @generated
	 */
	public EditPolicy getPrimaryDragEditPolicy() {
		// #265822 Improve appearance of selection feedback
		ResizableEditPolicy result = new U2TResizableShapeEditPolicy();
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
			layout.setSpacing(5);
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
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(RegionName2EditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(1);
		types.add(UMLElementTypes.CommentAnnotatedElement_4002);
		return types;
	}

	/**
	* @generated
	*/
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UMLElementTypes.CommentAnnotatedElement_4002) {
			types.add(UMLElementTypes.Comment_2006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class RegionFigure extends RectangleFigure {

		/**
		* @generated
		*/
		private Label fFigureRegionFigure_name;

		/**
			 * @generated
			 */
		private RectangleFigure fFigureRegionFigure_Compartment;

		/**
		 * @generated
		 */
		public RegionFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_DASH);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure regionFigure_NameContainer0 = new RectangleFigure();
			regionFigure_NameContainer0.setFill(false);
			regionFigure_NameContainer0.setOutline(false);
			regionFigure_NameContainer0.setLineWidth(1);

			this.add(regionFigure_NameContainer0, BorderLayout.TOP);

			ConstrainedToolbarLayout layoutRegionFigure_NameContainer0 = new ConstrainedToolbarLayout();

			layoutRegionFigure_NameContainer0.setStretchMajorAxis(true);

			layoutRegionFigure_NameContainer0.setVertical(false);

			regionFigure_NameContainer0.setLayoutManager(layoutRegionFigure_NameContainer0);

			RectangleFigure regionFigure_InnerNameContainer1 = new RectangleFigure();
			regionFigure_InnerNameContainer1.setFill(false);
			regionFigure_InnerNameContainer1.setOutline(false);
			regionFigure_InnerNameContainer1.setLineWidth(1);

			regionFigure_NameContainer0.add(regionFigure_InnerNameContainer1);

			ToolbarLayout layoutRegionFigure_InnerNameContainer1 = new ToolbarLayout();
			layoutRegionFigure_InnerNameContainer1.setStretchMinorAxis(false);
			layoutRegionFigure_InnerNameContainer1.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutRegionFigure_InnerNameContainer1.setSpacing(3);
			layoutRegionFigure_InnerNameContainer1.setVertical(false);

			regionFigure_InnerNameContainer1.setLayoutManager(layoutRegionFigure_InnerNameContainer1);

			fFigureRegionFigure_name = new Label();
			fFigureRegionFigure_name.setText("");

			regionFigure_InnerNameContainer1.add(fFigureRegionFigure_name);

			RectangleFigure regionFigure_ContentContainer0 = new RectangleFigure();
			regionFigure_ContentContainer0.setFill(false);
			regionFigure_ContentContainer0.setOutline(false);
			regionFigure_ContentContainer0.setLineWidth(1);

			regionFigure_ContentContainer0.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(10), getMapMode().DPtoLP(1)));

			this.add(regionFigure_ContentContainer0, BorderLayout.CENTER);

			ToolbarLayout layoutRegionFigure_ContentContainer0 = new ToolbarLayout();
			layoutRegionFigure_ContentContainer0.setStretchMinorAxis(true);
			layoutRegionFigure_ContentContainer0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutRegionFigure_ContentContainer0.setSpacing(0);
			layoutRegionFigure_ContentContainer0.setVertical(true);

			regionFigure_ContentContainer0.setLayoutManager(layoutRegionFigure_ContentContainer0);

			fFigureRegionFigure_Compartment = new RectangleFigure();
			fFigureRegionFigure_Compartment.setFill(false);
			fFigureRegionFigure_Compartment.setOutline(false);
			fFigureRegionFigure_Compartment.setLineWidth(1);

			regionFigure_ContentContainer0.add(fFigureRegionFigure_Compartment);

		}

		/**
		* @generated
		*/
		public Label getFigureRegionFigure_name() {
			return fFigureRegionFigure_name;
		}

		/**
			 * @generated
			 */
		public RectangleFigure getFigureRegionFigure_Compartment() {
			return fFigureRegionFigure_Compartment;
		}

	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateUnspecifiedTypeRequest) {
			CreateUnspecifiedTypeRequest unspecifiedRequest = (CreateUnspecifiedTypeRequest) request;
			List<IElementType> types = unspecifiedRequest.getElementTypes();
			if (types.contains(UMLElementTypes.State_3001)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.State_3012)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.State_3016)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.FinalState_3003)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Pseudostate_3004)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Pseudostate_3005)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Pseudostate_3006)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Pseudostate_3007)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Pseudostate_3008)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Pseudostate_3009)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Pseudostate_3010)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
			if (types.contains(UMLElementTypes.Pseudostate_3011)) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(State_RegionSubverticesEditPart.VISUAL_ID));
			}
		}

		return super.getTargetEditPart(request);
	}

}
