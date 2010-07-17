package org.eclipse.uml2.diagram.activity.edit.parts;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.activity.edit.policies.LocalPostconditionCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.LocalPostconditionItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.draw2d.ConstraintFigure;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.CreationEditPolicyWithCustomReparent;
import org.eclipse.uml2.diagram.common.editpolicies.U2TResizableShapeEditPolicy;

/**
 * @generated
 */

public class LocalPostconditionEditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2028;

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
	public LocalPostconditionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(UMLVisualIDRegistry.TYPED_ADAPTER));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new LocalPostconditionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new LocalPostconditionCanonicalEditPolicy());
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
		return primaryShape = new LocalPostconditionFigure();
	}

	/**
	 * @generated
	 */
	public LocalPostconditionFigure getPrimaryShape() {
		return (LocalPostconditionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof LocalPostconditionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureLocalPostconditionFigure_Body();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((LocalPostconditionCompartmentEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof LocalPostconditionCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFigureLocalPostconditionFigure_Body();
			pane.remove(((LocalPostconditionCompartmentEditPart) childEditPart).getFigure());
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
		if (editPart instanceof LocalPostconditionCompartmentEditPart) {
			return getPrimaryShape().getFigureLocalPostconditionFigure_Body();
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
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(2);
		types.add(UMLElementTypes.ActionLocalPrecondition_4003);
		types.add(UMLElementTypes.ActionLocalPostcondition_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UMLElementTypes.ActionLocalPrecondition_4003) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
			types.add(UMLElementTypes.AcceptEventAction_3031);
			types.add(UMLElementTypes.OpaqueAction_3029);
			types.add(UMLElementTypes.CreateObjectAction_3042);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
			types.add(UMLElementTypes.CallBehaviorAction_3044);
			types.add(UMLElementTypes.CallOperationAction_3045);
			types.add(UMLElementTypes.StructuredActivityNode_3046);
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.ConditionalNode_3092);
			types.add(UMLElementTypes.SendSignalAction_3053);
			types.add(UMLElementTypes.AcceptEventAction_3059);
			types.add(UMLElementTypes.AcceptEventAction_3060);
			types.add(UMLElementTypes.OpaqueAction_3067);
			types.add(UMLElementTypes.CreateObjectAction_3072);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
			types.add(UMLElementTypes.CallBehaviorAction_3074);
			types.add(UMLElementTypes.CallOperationAction_3075);
			types.add(UMLElementTypes.StructuredActivityNode_3076);
			types.add(UMLElementTypes.StructuredActivityNode_3079);
			types.add(UMLElementTypes.SendSignalAction_3077);
			types.add(UMLElementTypes.LoopNode_3078);
			types.add(UMLElementTypes.ConditionalNode_3083);
			types.add(UMLElementTypes.ExpansionRegion_3085);
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
			types.add(UMLElementTypes.LoopNode_3058);
			types.add(UMLElementTypes.ConditionalNode_3082);
			types.add(UMLElementTypes.ExpansionRegion_3084);
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		} else if (relationshipType == UMLElementTypes.ActionLocalPostcondition_4006) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
			types.add(UMLElementTypes.AcceptEventAction_3031);
			types.add(UMLElementTypes.OpaqueAction_3029);
			types.add(UMLElementTypes.CreateObjectAction_3042);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
			types.add(UMLElementTypes.CallBehaviorAction_3044);
			types.add(UMLElementTypes.CallOperationAction_3045);
			types.add(UMLElementTypes.StructuredActivityNode_3046);
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.ConditionalNode_3092);
			types.add(UMLElementTypes.SendSignalAction_3053);
			types.add(UMLElementTypes.AcceptEventAction_3059);
			types.add(UMLElementTypes.AcceptEventAction_3060);
			types.add(UMLElementTypes.OpaqueAction_3067);
			types.add(UMLElementTypes.CreateObjectAction_3072);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
			types.add(UMLElementTypes.CallBehaviorAction_3074);
			types.add(UMLElementTypes.CallOperationAction_3075);
			types.add(UMLElementTypes.StructuredActivityNode_3076);
			types.add(UMLElementTypes.StructuredActivityNode_3079);
			types.add(UMLElementTypes.SendSignalAction_3077);
			types.add(UMLElementTypes.LoopNode_3078);
			types.add(UMLElementTypes.ConditionalNode_3083);
			types.add(UMLElementTypes.ExpansionRegion_3085);
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
			types.add(UMLElementTypes.LoopNode_3058);
			types.add(UMLElementTypes.ConditionalNode_3082);
			types.add(UMLElementTypes.ExpansionRegion_3084);
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor().getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == UMLElementTypes.LiteralString_3051) {
				return getChildBySemanticHint(UMLVisualIDRegistry.getType(LocalPostconditionCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
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
	public class LocalPostconditionFigure extends ConstraintFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureLocalPostconditionFigure_Body;

		/**
		 * @generated
		 */
		public LocalPostconditionFigure() {

			this.setFixedLabelText("\u00ABlocalPostcondition\u00BB");

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureLocalPostconditionFigure_Body = new RectangleFigure();
			fFigureLocalPostconditionFigure_Body.setLineWidth(1);

			this.add(fFigureLocalPostconditionFigure_Body);

		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureLocalPostconditionFigure_Body() {
			return fFigureLocalPostconditionFigure_Body;
		}

	}

}
