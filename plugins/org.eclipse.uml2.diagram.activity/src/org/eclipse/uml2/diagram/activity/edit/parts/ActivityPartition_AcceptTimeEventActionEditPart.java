package org.eclipse.uml2.diagram.activity.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.ScalablePolygonShape;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.draw2d.geometry.Rectangle;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.editpolicies.ResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.activity.edit.policies.ActivityPartition_AcceptTimeEventActionCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.ActivityPartition_AcceptTimeEventActionItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramUpdateCommand;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.draw2d.UnrestrictedOutsideBorderItemLocator;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.U2TResizableShapeEditPolicy;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class ActivityPartition_AcceptTimeEventActionEditPart extends AbstractBorderedShapeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3060;

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
	private LinkTargetListener myLinkTargetListener;

	/**
	 * @generated
	 */
	public ActivityPartition_AcceptTimeEventActionEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		if (UMLVisualIDRegistry.isShortcutDescendant(getNotationView())) {
			installEditPolicy(UpdateDescriptionEditPolicy.ROLE, new UpdateDescriptionEditPolicy(UMLDiagramUpdater.TYPED_ADAPTER, true));
		}
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ActivityPartition_AcceptTimeEventActionItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new ActivityPartition_AcceptTimeEventActionCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (UMLVisualIDRegistry.getVisualID(childView)) {
				case ActivityPartition_AcceptTimeEventActionNameEditPart.VISUAL_ID:
					return new BorderItemSelectionEditPolicy() {

						protected List createSelectionHandles() {
							MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
							mh.setBorder(null);
							return Collections.singletonList(mh);
						}
					};
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
		return primaryShape = new AcceptTimeEventActionFigure();
	}

	/**
	 * @generated
	 */
	public AcceptTimeEventActionFigure getPrimaryShape() {
		return (AcceptTimeEventActionFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof ActivityPartition_AcceptTimeEventActionNameEditPart) {
			IBorderItemLocator locator = new UnrestrictedOutsideBorderItemLocator(getMainFigure());
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
			return;
		}

		super.addBorderItem(borderItemContainer, borderItemEditPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(80, 50);
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ActivityPartition_AcceptTimeEventActionNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSource() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(5);
		types.add(UMLElementTypes.ControlFlow_4001);
		types.add(UMLElementTypes.ObjectFlow_4002);
		types.add(UMLElementTypes.ActionLocalPrecondition_4003);
		types.add(UMLElementTypes.ActionLocalPostcondition_4006);
		types.add(UMLElementTypes.ExceptionHandler_4005);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OpaqueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OpaqueAction_OutputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OpaqueAction_InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof FlowFinalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof PinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CreateObjectAction_OutputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_insertAt_InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_value_InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_object_InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallAction_OutputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallAction_InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallOperationAction_InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_ActivityFinalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_DecisionNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_FlowFinalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_PinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_ForkNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_JoinNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_OutputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_InitialNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityParameterNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof SendSignalActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_ActivityFinalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_DecisionNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_MergeNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_InitialNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_OpaqueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_FlowFinalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_ForkNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_JoinNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_PinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_CallOperationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_StructuredActivityNode_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNode_InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_SendSignalActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_LoopNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_ExpansionRegionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityPartition_ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ValueSpecificationAction_OutputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof LoopNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ExpansionRegionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ExpansionNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityFinalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DecisionNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof MergeNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InitialNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OpaqueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OpaqueAction_OutputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OpaqueAction_InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof FlowFinalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ForkNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof JoinNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof PinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CreateObjectAction_OutputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_insertAt_InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_value_InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction_object_InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallAction_OutputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallAction_InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallOperationAction_InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_ActivityFinalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_DecisionNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_FlowFinalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_PinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_ForkNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_JoinNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_OutputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_InitialNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityParameterNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof SendSignalActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_ActivityFinalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_DecisionNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_MergeNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_InitialNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_DataStoreNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_OpaqueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_FlowFinalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_ForkNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_JoinNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_PinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_CallOperationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_StructuredActivityNode_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNode_InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNode_OutputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_SendSignalActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_LoopNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_ExpansionRegionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityPartition_ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ValueSpecificationAction_OutputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof LoopNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ExpansionRegionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ExpansionNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof LocalPreconditionEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4003);
		}
		if (targetEditPart instanceof LocalPostconditionEditPart) {
			types.add(UMLElementTypes.ActionLocalPrecondition_4003);
		}
		if (targetEditPart instanceof LocalPreconditionEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4006);
		}
		if (targetEditPart instanceof LocalPostconditionEditPart) {
			types.add(UMLElementTypes.ActionLocalPostcondition_4006);
		}
		if (targetEditPart instanceof AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof OpaqueActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_OpaqueActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_CallOperationActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof StructuredActivityNode_ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof SendSignalActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_AcceptEventActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartition_AcceptTimeEventActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_OpaqueActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_CreateObjectActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_CallOperationActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_StructuredActivityNode_StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_SendSignalActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_LoopNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_ExpansionRegionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ActivityPartition_ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof LoopNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ConditionalNodeEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ExpansionRegionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		if (targetEditPart instanceof ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ExceptionHandler_4005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForTarget(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
			types.add(UMLElementTypes.AcceptEventAction_3031);
			types.add(UMLElementTypes.ActivityFinalNode_3032);
			types.add(UMLElementTypes.DecisionNode_3033);
			types.add(UMLElementTypes.MergeNode_3034);
			types.add(UMLElementTypes.InitialNode_3035);
			types.add(UMLElementTypes.DataStoreNode_3036);
			types.add(UMLElementTypes.CentralBufferNode_3037);
			types.add(UMLElementTypes.OpaqueAction_3029);
			types.add(UMLElementTypes.OutputPin_3001);
			types.add(UMLElementTypes.InputPin_3094);
			types.add(UMLElementTypes.FlowFinalNode_3038);
			types.add(UMLElementTypes.ForkNode_3039);
			types.add(UMLElementTypes.JoinNode_3040);
			types.add(UMLElementTypes.Pin_3041);
			types.add(UMLElementTypes.CreateObjectAction_3042);
			types.add(UMLElementTypes.OutputPin_3002);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
			types.add(UMLElementTypes.InputPin_3003);
			types.add(UMLElementTypes.InputPin_3004);
			types.add(UMLElementTypes.InputPin_3005);
			types.add(UMLElementTypes.CallBehaviorAction_3044);
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			types.add(UMLElementTypes.CallOperationAction_3045);
			types.add(UMLElementTypes.InputPin_3008);
			types.add(UMLElementTypes.StructuredActivityNode_3046);
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			types.add(UMLElementTypes.ConditionalNode_3092);
			types.add(UMLElementTypes.InitialNode_3093);
			types.add(UMLElementTypes.ActivityParameterNode_3052);
			types.add(UMLElementTypes.SendSignalAction_3053);
			types.add(UMLElementTypes.AcceptEventAction_3059);
			types.add(UMLElementTypes.AcceptEventAction_3060);
			types.add(UMLElementTypes.ActivityFinalNode_3061);
			types.add(UMLElementTypes.DecisionNode_3062);
			types.add(UMLElementTypes.MergeNode_3063);
			types.add(UMLElementTypes.InitialNode_3064);
			types.add(UMLElementTypes.DataStoreNode_3065);
			types.add(UMLElementTypes.CentralBufferNode_3066);
			types.add(UMLElementTypes.OpaqueAction_3067);
			types.add(UMLElementTypes.FlowFinalNode_3068);
			types.add(UMLElementTypes.ForkNode_3069);
			types.add(UMLElementTypes.JoinNode_3070);
			types.add(UMLElementTypes.Pin_3071);
			types.add(UMLElementTypes.CreateObjectAction_3072);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
			types.add(UMLElementTypes.CallBehaviorAction_3074);
			types.add(UMLElementTypes.CallOperationAction_3075);
			types.add(UMLElementTypes.StructuredActivityNode_3076);
			types.add(UMLElementTypes.StructuredActivityNode_3079);
			types.add(UMLElementTypes.InputPin_3080);
			types.add(UMLElementTypes.OutputPin_3081);
			types.add(UMLElementTypes.SendSignalAction_3077);
			types.add(UMLElementTypes.LoopNode_3078);
			types.add(UMLElementTypes.ConditionalNode_3083);
			types.add(UMLElementTypes.ExpansionRegion_3085);
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.LoopNode_3058);
			types.add(UMLElementTypes.ConditionalNode_3082);
			types.add(UMLElementTypes.ExpansionRegion_3084);
			types.add(UMLElementTypes.ExpansionNode_3091);
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		} else if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
			types.add(UMLElementTypes.AcceptEventAction_3031);
			types.add(UMLElementTypes.ActivityFinalNode_3032);
			types.add(UMLElementTypes.DecisionNode_3033);
			types.add(UMLElementTypes.MergeNode_3034);
			types.add(UMLElementTypes.InitialNode_3035);
			types.add(UMLElementTypes.DataStoreNode_3036);
			types.add(UMLElementTypes.CentralBufferNode_3037);
			types.add(UMLElementTypes.OpaqueAction_3029);
			types.add(UMLElementTypes.OutputPin_3001);
			types.add(UMLElementTypes.InputPin_3094);
			types.add(UMLElementTypes.FlowFinalNode_3038);
			types.add(UMLElementTypes.ForkNode_3039);
			types.add(UMLElementTypes.JoinNode_3040);
			types.add(UMLElementTypes.Pin_3041);
			types.add(UMLElementTypes.CreateObjectAction_3042);
			types.add(UMLElementTypes.OutputPin_3002);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
			types.add(UMLElementTypes.InputPin_3003);
			types.add(UMLElementTypes.InputPin_3004);
			types.add(UMLElementTypes.InputPin_3005);
			types.add(UMLElementTypes.CallBehaviorAction_3044);
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			types.add(UMLElementTypes.CallOperationAction_3045);
			types.add(UMLElementTypes.InputPin_3008);
			types.add(UMLElementTypes.StructuredActivityNode_3046);
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			types.add(UMLElementTypes.ConditionalNode_3092);
			types.add(UMLElementTypes.InitialNode_3093);
			types.add(UMLElementTypes.ActivityParameterNode_3052);
			types.add(UMLElementTypes.SendSignalAction_3053);
			types.add(UMLElementTypes.AcceptEventAction_3059);
			types.add(UMLElementTypes.AcceptEventAction_3060);
			types.add(UMLElementTypes.ActivityFinalNode_3061);
			types.add(UMLElementTypes.DecisionNode_3062);
			types.add(UMLElementTypes.MergeNode_3063);
			types.add(UMLElementTypes.InitialNode_3064);
			types.add(UMLElementTypes.DataStoreNode_3065);
			types.add(UMLElementTypes.CentralBufferNode_3066);
			types.add(UMLElementTypes.OpaqueAction_3067);
			types.add(UMLElementTypes.FlowFinalNode_3068);
			types.add(UMLElementTypes.ForkNode_3069);
			types.add(UMLElementTypes.JoinNode_3070);
			types.add(UMLElementTypes.Pin_3071);
			types.add(UMLElementTypes.CreateObjectAction_3072);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
			types.add(UMLElementTypes.CallBehaviorAction_3074);
			types.add(UMLElementTypes.CallOperationAction_3075);
			types.add(UMLElementTypes.StructuredActivityNode_3076);
			types.add(UMLElementTypes.StructuredActivityNode_3079);
			types.add(UMLElementTypes.InputPin_3080);
			types.add(UMLElementTypes.OutputPin_3081);
			types.add(UMLElementTypes.SendSignalAction_3077);
			types.add(UMLElementTypes.LoopNode_3078);
			types.add(UMLElementTypes.ConditionalNode_3083);
			types.add(UMLElementTypes.ExpansionRegion_3085);
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.LoopNode_3058);
			types.add(UMLElementTypes.ConditionalNode_3082);
			types.add(UMLElementTypes.ExpansionRegion_3084);
			types.add(UMLElementTypes.ExpansionNode_3091);
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		} else if (relationshipType == UMLElementTypes.ActionLocalPrecondition_4003) {
			types.add(UMLElementTypes.Constraint_2027);
			types.add(UMLElementTypes.Constraint_2028);
		} else if (relationshipType == UMLElementTypes.ActionLocalPostcondition_4006) {
			types.add(UMLElementTypes.Constraint_2027);
			types.add(UMLElementTypes.Constraint_2028);
		} else if (relationshipType == UMLElementTypes.ExceptionHandler_4005) {
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
	public List<IElementType> getMARelTypesOnTarget() {
		ArrayList<IElementType> types = new ArrayList<IElementType>(4);
		types.add(UMLElementTypes.ControlFlow_4001);
		types.add(UMLElementTypes.ObjectFlow_4002);
		types.add(UMLElementTypes.ExceptionHandler_4005);
		types.add(UMLElementTypes.CommentAnnotatedElement_4007);
		return types;
	}

	/**
	 * @generated
	 */
	public List<IElementType> getMATypesForSource(IElementType relationshipType) {
		LinkedList<IElementType> types = new LinkedList<IElementType>();
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
			types.add(UMLElementTypes.AcceptEventAction_3031);
			types.add(UMLElementTypes.ActivityFinalNode_3032);
			types.add(UMLElementTypes.DecisionNode_3033);
			types.add(UMLElementTypes.MergeNode_3034);
			types.add(UMLElementTypes.InitialNode_3035);
			types.add(UMLElementTypes.DataStoreNode_3036);
			types.add(UMLElementTypes.CentralBufferNode_3037);
			types.add(UMLElementTypes.OpaqueAction_3029);
			types.add(UMLElementTypes.OutputPin_3001);
			types.add(UMLElementTypes.InputPin_3094);
			types.add(UMLElementTypes.FlowFinalNode_3038);
			types.add(UMLElementTypes.ForkNode_3039);
			types.add(UMLElementTypes.JoinNode_3040);
			types.add(UMLElementTypes.Pin_3041);
			types.add(UMLElementTypes.CreateObjectAction_3042);
			types.add(UMLElementTypes.OutputPin_3002);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
			types.add(UMLElementTypes.InputPin_3003);
			types.add(UMLElementTypes.InputPin_3004);
			types.add(UMLElementTypes.InputPin_3005);
			types.add(UMLElementTypes.CallBehaviorAction_3044);
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			types.add(UMLElementTypes.CallOperationAction_3045);
			types.add(UMLElementTypes.InputPin_3008);
			types.add(UMLElementTypes.StructuredActivityNode_3046);
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			types.add(UMLElementTypes.ConditionalNode_3092);
			types.add(UMLElementTypes.InitialNode_3093);
			types.add(UMLElementTypes.ActivityParameterNode_3052);
			types.add(UMLElementTypes.SendSignalAction_3053);
			types.add(UMLElementTypes.AcceptEventAction_3059);
			types.add(UMLElementTypes.AcceptEventAction_3060);
			types.add(UMLElementTypes.ActivityFinalNode_3061);
			types.add(UMLElementTypes.DecisionNode_3062);
			types.add(UMLElementTypes.MergeNode_3063);
			types.add(UMLElementTypes.InitialNode_3064);
			types.add(UMLElementTypes.DataStoreNode_3065);
			types.add(UMLElementTypes.CentralBufferNode_3066);
			types.add(UMLElementTypes.OpaqueAction_3067);
			types.add(UMLElementTypes.FlowFinalNode_3068);
			types.add(UMLElementTypes.ForkNode_3069);
			types.add(UMLElementTypes.JoinNode_3070);
			types.add(UMLElementTypes.Pin_3071);
			types.add(UMLElementTypes.CreateObjectAction_3072);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
			types.add(UMLElementTypes.CallBehaviorAction_3074);
			types.add(UMLElementTypes.CallOperationAction_3075);
			types.add(UMLElementTypes.StructuredActivityNode_3076);
			types.add(UMLElementTypes.StructuredActivityNode_3079);
			types.add(UMLElementTypes.InputPin_3080);
			types.add(UMLElementTypes.OutputPin_3081);
			types.add(UMLElementTypes.SendSignalAction_3077);
			types.add(UMLElementTypes.LoopNode_3078);
			types.add(UMLElementTypes.ConditionalNode_3083);
			types.add(UMLElementTypes.ExpansionRegion_3085);
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.LoopNode_3058);
			types.add(UMLElementTypes.ConditionalNode_3082);
			types.add(UMLElementTypes.ExpansionRegion_3084);
			types.add(UMLElementTypes.ExpansionNode_3091);
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		} else if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
			types.add(UMLElementTypes.AcceptEventAction_3031);
			types.add(UMLElementTypes.ActivityFinalNode_3032);
			types.add(UMLElementTypes.DecisionNode_3033);
			types.add(UMLElementTypes.MergeNode_3034);
			types.add(UMLElementTypes.InitialNode_3035);
			types.add(UMLElementTypes.DataStoreNode_3036);
			types.add(UMLElementTypes.CentralBufferNode_3037);
			types.add(UMLElementTypes.OpaqueAction_3029);
			types.add(UMLElementTypes.OutputPin_3001);
			types.add(UMLElementTypes.InputPin_3094);
			types.add(UMLElementTypes.FlowFinalNode_3038);
			types.add(UMLElementTypes.ForkNode_3039);
			types.add(UMLElementTypes.JoinNode_3040);
			types.add(UMLElementTypes.Pin_3041);
			types.add(UMLElementTypes.CreateObjectAction_3042);
			types.add(UMLElementTypes.OutputPin_3002);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
			types.add(UMLElementTypes.InputPin_3003);
			types.add(UMLElementTypes.InputPin_3004);
			types.add(UMLElementTypes.InputPin_3005);
			types.add(UMLElementTypes.CallBehaviorAction_3044);
			types.add(UMLElementTypes.OutputPin_3006);
			types.add(UMLElementTypes.InputPin_3007);
			types.add(UMLElementTypes.CallOperationAction_3045);
			types.add(UMLElementTypes.InputPin_3008);
			types.add(UMLElementTypes.StructuredActivityNode_3046);
			types.add(UMLElementTypes.StructuredActivityNode_3009);
			types.add(UMLElementTypes.OpaqueAction_3011);
			types.add(UMLElementTypes.AcceptEventAction_3012);
			types.add(UMLElementTypes.AcceptEventAction_3013);
			types.add(UMLElementTypes.ActivityFinalNode_3014);
			types.add(UMLElementTypes.DecisionNode_3015);
			types.add(UMLElementTypes.FlowFinalNode_3016);
			types.add(UMLElementTypes.Pin_3017);
			types.add(UMLElementTypes.CreateObjectAction_3018);
			types.add(UMLElementTypes.CallBehaviorAction_3019);
			types.add(UMLElementTypes.CallOperationAction_3020);
			types.add(UMLElementTypes.ForkNode_3021);
			types.add(UMLElementTypes.JoinNode_3022);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
			types.add(UMLElementTypes.DataStoreNode_3024);
			types.add(UMLElementTypes.CentralBufferNode_3025);
			types.add(UMLElementTypes.InputPin_3054);
			types.add(UMLElementTypes.OutputPin_3055);
			types.add(UMLElementTypes.ConditionalNode_3092);
			types.add(UMLElementTypes.InitialNode_3093);
			types.add(UMLElementTypes.ActivityParameterNode_3052);
			types.add(UMLElementTypes.SendSignalAction_3053);
			types.add(UMLElementTypes.AcceptEventAction_3059);
			types.add(UMLElementTypes.AcceptEventAction_3060);
			types.add(UMLElementTypes.ActivityFinalNode_3061);
			types.add(UMLElementTypes.DecisionNode_3062);
			types.add(UMLElementTypes.MergeNode_3063);
			types.add(UMLElementTypes.InitialNode_3064);
			types.add(UMLElementTypes.DataStoreNode_3065);
			types.add(UMLElementTypes.CentralBufferNode_3066);
			types.add(UMLElementTypes.OpaqueAction_3067);
			types.add(UMLElementTypes.FlowFinalNode_3068);
			types.add(UMLElementTypes.ForkNode_3069);
			types.add(UMLElementTypes.JoinNode_3070);
			types.add(UMLElementTypes.Pin_3071);
			types.add(UMLElementTypes.CreateObjectAction_3072);
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
			types.add(UMLElementTypes.CallBehaviorAction_3074);
			types.add(UMLElementTypes.CallOperationAction_3075);
			types.add(UMLElementTypes.StructuredActivityNode_3076);
			types.add(UMLElementTypes.StructuredActivityNode_3079);
			types.add(UMLElementTypes.InputPin_3080);
			types.add(UMLElementTypes.OutputPin_3081);
			types.add(UMLElementTypes.SendSignalAction_3077);
			types.add(UMLElementTypes.LoopNode_3078);
			types.add(UMLElementTypes.ConditionalNode_3083);
			types.add(UMLElementTypes.ExpansionRegion_3085);
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
			types.add(UMLElementTypes.OutputPin_3090);
			types.add(UMLElementTypes.LoopNode_3058);
			types.add(UMLElementTypes.ConditionalNode_3082);
			types.add(UMLElementTypes.ExpansionRegion_3084);
			types.add(UMLElementTypes.ExpansionNode_3091);
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		} else if (relationshipType == UMLElementTypes.ExceptionHandler_4005) {
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
		} else if (relationshipType == UMLElementTypes.CommentAnnotatedElement_4007) {
			types.add(UMLElementTypes.Comment_2029);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		handleTypeLinkModification(event);
		handleFeatureLinkModification(event);
	}

	/**
	 * @generated
	 */
	public class AcceptTimeEventActionFigure extends ScalablePolygonShape {

		/**
		 * @generated
		 */
		public AcceptTimeEventActionFigure() {
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(25), getMapMode().DPtoLP(0)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));
			this.addPoint(new Point(getMapMode().DPtoLP(25), getMapMode().DPtoLP(25)));
			this.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			this.setFill(true);
			this.setLineWidth(1);
		}

	}

	/**
	 * @generated
	 */
	private DiagramEventBroker getDiagramEventBroker() {
		TransactionalEditingDomain theEditingDomain = getEditingDomain();
		if (theEditingDomain != null) {
			return DiagramEventBroker.getInstance(theEditingDomain);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private LinkTargetListener getLinkTargetListener() {
		if (myLinkTargetListener == null) {
			myLinkTargetListener = new LinkTargetListener();
		}
		return myLinkTargetListener;
	}

	/**
	 * @generated
	 */
	private class LinkTargetListener implements NotificationListener {

		/**
		 * @generated
		 */
		Map<EObject, Set<EStructuralFeature>> myNotifiers = new HashMap<EObject, Set<EStructuralFeature>>();

		/**
		 * @generated
		 */
		private void added(EObject link, EStructuralFeature feature) {
			if (!myNotifiers.containsKey(link)) {
				myNotifiers.put(link, new HashSet<EStructuralFeature>());
			}
			myNotifiers.get(link).add(feature);
		}

		/**
		 * @generated
		 */
		private void removed(EObject link, EStructuralFeature feature) {
			if (!myNotifiers.containsKey(link)) {
				return;
			}
			myNotifiers.get(link).remove(feature);
		}

		/**
		 * @generated
		 */
		public void dispose() {
			Set<Map.Entry<EObject, Set<EStructuralFeature>>> entrySet = myNotifiers.entrySet();
			for (Map.Entry<EObject, Set<EStructuralFeature>> entry : entrySet) {
				for (EStructuralFeature feature : entry.getValue()) {
					getDiagramEventBroker().removeNotificationListener(entry.getKey(), feature, this);
				}
			}
		}

		/**
		 * @generated
		 */
		private void removeReferenceListener(EObject link, EStructuralFeature feature) {
			getDiagramEventBroker().removeNotificationListener(link, feature, this);
			removed(link, feature);
		}

		/**
		 * @generated
		 */
		private void addReferenceListener(EObject link, EStructuralFeature feature) {
			getDiagramEventBroker().addNotificationListener(link, feature, this);
			added(link, feature);
		}

		/**
		 * @generated
		 */
		public void notifyChanged(Notification event) {
			if (event.getFeature() == UMLPackage.eINSTANCE.getExceptionHandler_HandlerBody()) {
				guardedRefreshDiagram();
				return;
			}
		}
	}

	/**
	 * @generated
	 */
	protected void addSemanticListeners() {
		super.addSemanticListeners();
		for (IUpdaterNodeDescriptor next : getAcceptEventAction_3060ContainedLinks()) {
			EObject nextLink = next.getModelElement();
			if (nextLink == null) {
				continue;
			}
			switch (next.getVisualID()) {
			case ExceptionHandlerEditPart.VISUAL_ID:
				getLinkTargetListener().addReferenceListener(nextLink, UMLPackage.eINSTANCE.getExceptionHandler_HandlerBody());
				break;

			default:
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private List<? extends IUpdaterLinkDescriptor> getAcceptEventAction_3060ContainedLinks() {
		return UMLDiagramUpdater.getAcceptEventAction_3060ContainedLinks(getNotationView());
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		super.removeSemanticListeners();
		getLinkTargetListener().dispose();
	}

	/**
	 * @generated
	 */
	private void handleTypeLinkModification(Notification event) {
		if (event.getFeature() == UMLPackage.eINSTANCE.getExecutableNode_Handler()) {
			switch (event.getEventType()) {
			case Notification.ADD: {
				Object link = event.getNewValue();
				if (link instanceof ExceptionHandler) {
					getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getExceptionHandler_HandlerBody());
				}
				if (link instanceof ExceptionHandler) {
					guardedRefreshDiagram();
				}
				break;
			}
			case Notification.REMOVE: {
				Object link = event.getOldValue();
				if (link instanceof ExceptionHandler) {
					getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getExceptionHandler_HandlerBody());
				}
				if (link instanceof ExceptionHandler) {
					guardedRefreshDiagram();
				}
				break;
			}
			case Notification.ADD_MANY: {
				List<?> links = (List<?>) event.getNewValue();
				for (Object link : links) {
					if (link instanceof ExceptionHandler) {
						getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getExceptionHandler_HandlerBody());
					}
				}
				for (Object link : links) {
					if (link instanceof ExceptionHandler) {
						guardedRefreshDiagram();
						break;
					}
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				List<?> links = (List<?>) event.getOldValue();
				for (Object link : links) {
					if (link instanceof ExceptionHandler) {
						getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getExceptionHandler_HandlerBody());
					}
				}
				for (Object link : links) {
					if (link instanceof ExceptionHandler) {
						guardedRefreshDiagram();
						break;
					}
				}
				break;
			}
			}
		}
	}

	/**
	 * @generated
	 */
	private void handleFeatureLinkModification(Notification event) {
		if (event.getFeature() == UMLPackage.eINSTANCE.getAction_LocalPrecondition()) {
			guardedRefreshDiagram();
			return;
		}
		if (event.getFeature() == UMLPackage.eINSTANCE.getAction_LocalPostcondition()) {
			guardedRefreshDiagram();
			return;
		}
	}

	/**
	 * @generated
	 */
	private boolean isCanonicalDisabled() {
		if (isCanonicalDisabled(getEditPolicy(EditPolicyRoles.CANONICAL_ROLE))) {
			return true;
		}
		if (getParent() != null && isCanonicalDisabled(getParent().getEditPolicy(EditPolicyRoles.CANONICAL_ROLE))) {
			return true;
		}
		//this particular edit part may not have editpolicy at all, 
		//but its compartments still may have it
		EObject semantic = resolveSemanticElement();
		if (semantic != null) {
			for (Object next : CanonicalEditPolicy.getRegisteredEditPolicies(semantic)) {
				if (next instanceof EditPolicy) {
					EditPolicy nextEP = (EditPolicy) next;
					if (isCanonicalDisabled(nextEP)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	private static boolean isCanonicalDisabled(EditPolicy editPolicy) {
		return editPolicy instanceof CanonicalEditPolicy && !((CanonicalEditPolicy) editPolicy).isEnabled();
	}

	/**
	 * @generated
	 */
	private void guardedRefreshDiagram() {
		if (!isCanonicalDisabled()) {
			UMLDiagramUpdateCommand.performCanonicalUpdate(getDiagramView().getElement());
		}
	}

}
