package org.eclipse.uml2.diagram.activity.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.activity.edit.policies.CentralBufferNodeCanonicalEditPolicy;
import org.eclipse.uml2.diagram.activity.edit.policies.CentralBufferNodeItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramUpdateCommand;
import org.eclipse.uml2.diagram.activity.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class CentralBufferNodeEditPart extends AbstractBorderedShapeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3037;

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
	public CentralBufferNodeEditPart(View view) {
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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new CentralBufferNodeItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new CentralBufferNodeCanonicalEditPolicy());
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
				View childView = (View) child.getModel();
				switch (UMLVisualIDRegistry.getVisualID(childView)) {
				case CentralBufferNodeOrderingEditPart.VISUAL_ID:
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
		CentralBufferFigure figure = new CentralBufferFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public CentralBufferFigure getPrimaryShape() {
		return (CentralBufferFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof CentralBufferNodeNameEditPart) {
			((CentralBufferNodeNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureCentralBufferFigure_name());
			return true;
		}
		if (childEditPart instanceof CentralBufferNodeInStateEditPart) {
			((CentralBufferNodeInStateEditPart) childEditPart).setLabel(getPrimaryShape().getFigureCentralBufferFigure_states());
			return true;
		}
		if (childEditPart instanceof CentralBufferNodeStereotypeEditPart) {
			((CentralBufferNodeStereotypeEditPart) childEditPart).setLabel(getPrimaryShape().getFigureCentralBufferFigure_stereo());
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
		if (editPart instanceof IBorderItemEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected void addBorderItem(IFigure borderItemContainer, IBorderItemEditPart borderItemEditPart) {
		if (borderItemEditPart instanceof CentralBufferNodeOrderingEditPart) {
			BorderItemLocator locator = new BorderItemLocator(getMainFigure(), PositionConstants.SOUTH);
			locator.setBorderItemOffset(new Dimension(-20, -20));
			borderItemContainer.add(borderItemEditPart.getFigure(), locator);
		} else {
			super.addBorderItem(borderItemContainer, borderItemEditPart);
		}
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
			((Shape) primaryShape).setLineWidth(getMapMode().DPtoLP(width));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(CentralBufferNodeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UMLElementTypes.ControlFlow_4001);
		types.add(UMLElementTypes.ObjectFlow_4002);
		types.add(UMLElementTypes.ObjectNodeSelection_4004);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
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
		if (targetEditPart instanceof org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OpaqueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OutputPinEditPart) {
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
		if (targetEditPart instanceof OutputPin2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InputPinEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InputPin2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InputPin3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OutputPin3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InputPin4EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InputPin5EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OpaqueAction2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AcceptEventAction3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AcceptEventAction4EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityFinalNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof FlowFinalNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof Pin2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CreateObjectAction2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallBehaviorAction2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallOperationAction2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof DataStoreNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CentralBufferNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InputPin6EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OutputPin4EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityParameterNodeEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof SendSignalActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AcceptEventAction5EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AcceptEventAction6EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ActivityFinalNode3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof DecisionNode3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof DataStoreNode3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CentralBufferNode3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OpaqueAction3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof FlowFinalNode3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ForkNode3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof JoinNode3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof Pin3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CreateObjectAction3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallBehaviorAction3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof CallOperationAction3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode3EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof StructuredActivityNode4EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof InputPin7EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OutputPin5EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof SendSignalAction2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof LoopNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ConditionalNode2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ExpansionRegion2EditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ControlFlow_4001);
		}
		if (targetEditPart instanceof OutputPin6EditPart) {
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
		if (targetEditPart instanceof ValueSpecificationAction2EditPart) {
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
		if (targetEditPart instanceof org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OpaqueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OutputPinEditPart) {
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
		if (targetEditPart instanceof OutputPin2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InputPinEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InputPin2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InputPin3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallBehaviorActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OutputPin3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InputPin4EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallOperationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InputPin5EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OpaqueAction2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AcceptEventAction3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AcceptEventAction4EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityFinalNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DecisionNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof FlowFinalNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof Pin2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CreateObjectAction2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallBehaviorAction2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallOperationAction2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ForkNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof JoinNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DataStoreNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CentralBufferNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InputPin6EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OutputPin4EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityParameterNodeEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof SendSignalActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AcceptEventAction5EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AcceptEventAction6EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityFinalNode3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DecisionNode3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof MergeNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InitialNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof DataStoreNode3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CentralBufferNode3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OpaqueAction3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof FlowFinalNode3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ForkNode3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof JoinNode3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof Pin3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CreateObjectAction3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof AddStructuralFeatureValueAction3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallBehaviorAction3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof CallOperationAction3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode3EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof StructuredActivityNode4EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof InputPin7EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OutputPin5EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof SendSignalAction2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof LoopNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ConditionalNode2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ExpansionRegion2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ValueSpecificationActionEditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof OutputPin6EditPart) {
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
		if (targetEditPart instanceof ValueSpecificationAction2EditPart) {
			types.add(UMLElementTypes.ObjectFlow_4002);
		}
		if (targetEditPart instanceof ActivityEditPart) {
			types.add(UMLElementTypes.ObjectNodeSelection_4004);
		}
		if (targetEditPart instanceof OpaqueBehaviorEditPart) {
			types.add(UMLElementTypes.ObjectNodeSelection_4004);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3031);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ActivityFinalNode_3032);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DecisionNode_3033);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.MergeNode_3034);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InitialNode_3035);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DataStoreNode_3036);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CentralBufferNode_3037);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OpaqueAction_3029);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3001);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.FlowFinalNode_3038);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ForkNode_3039);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.JoinNode_3040);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.Pin_3041);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CreateObjectAction_3042);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3002);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3003);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3004);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3005);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallBehaviorAction_3044);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3006);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3007);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallOperationAction_3045);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3008);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3046);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3009);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OpaqueAction_3011);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3012);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3013);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ActivityFinalNode_3014);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DecisionNode_3015);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.FlowFinalNode_3016);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.Pin_3017);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CreateObjectAction_3018);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallBehaviorAction_3019);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallOperationAction_3020);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ForkNode_3021);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.JoinNode_3022);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DataStoreNode_3024);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CentralBufferNode_3025);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3054);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3055);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ActivityParameterNode_3052);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.SendSignalAction_3053);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3059);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3060);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ActivityFinalNode_3061);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DecisionNode_3062);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.MergeNode_3063);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InitialNode_3064);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DataStoreNode_3065);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CentralBufferNode_3066);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OpaqueAction_3067);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.FlowFinalNode_3068);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ForkNode_3069);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.JoinNode_3070);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.Pin_3071);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CreateObjectAction_3072);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallBehaviorAction_3074);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallOperationAction_3075);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3076);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3079);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3080);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3081);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.SendSignalAction_3077);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.LoopNode_3078);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ConditionalNode_3083);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ExpansionRegion_3085);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3090);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.LoopNode_3058);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ConditionalNode_3082);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ExpansionRegion_3084);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3031);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ActivityFinalNode_3032);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DecisionNode_3033);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.MergeNode_3034);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InitialNode_3035);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DataStoreNode_3036);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CentralBufferNode_3037);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OpaqueAction_3029);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3001);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.FlowFinalNode_3038);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ForkNode_3039);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.JoinNode_3040);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.Pin_3041);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CreateObjectAction_3042);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3002);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3003);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3004);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3005);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallBehaviorAction_3044);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3006);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3007);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallOperationAction_3045);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3008);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3046);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3009);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OpaqueAction_3011);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3012);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3013);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ActivityFinalNode_3014);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DecisionNode_3015);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.FlowFinalNode_3016);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.Pin_3017);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CreateObjectAction_3018);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallBehaviorAction_3019);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallOperationAction_3020);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ForkNode_3021);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.JoinNode_3022);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DataStoreNode_3024);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CentralBufferNode_3025);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3054);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3055);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ActivityParameterNode_3052);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.SendSignalAction_3053);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3059);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3060);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ActivityFinalNode_3061);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DecisionNode_3062);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.MergeNode_3063);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InitialNode_3064);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DataStoreNode_3065);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CentralBufferNode_3066);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OpaqueAction_3067);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.FlowFinalNode_3068);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ForkNode_3069);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.JoinNode_3070);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.Pin_3071);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CreateObjectAction_3072);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallBehaviorAction_3074);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallOperationAction_3075);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3076);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3079);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3080);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3081);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.SendSignalAction_3077);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.LoopNode_3078);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ConditionalNode_3083);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ExpansionRegion_3085);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3090);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.LoopNode_3058);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ConditionalNode_3082);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ExpansionRegion_3084);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		}
		if (relationshipType == UMLElementTypes.ObjectNodeSelection_4004) {
			types.add(UMLElementTypes.Activity_2026);
		}
		if (relationshipType == UMLElementTypes.ObjectNodeSelection_4004) {
			types.add(UMLElementTypes.OpaqueBehavior_3047);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UMLElementTypes.ControlFlow_4001);
		types.add(UMLElementTypes.ObjectFlow_4002);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3031);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ActivityFinalNode_3032);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DecisionNode_3033);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.MergeNode_3034);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InitialNode_3035);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DataStoreNode_3036);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CentralBufferNode_3037);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OpaqueAction_3029);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3001);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.FlowFinalNode_3038);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ForkNode_3039);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.JoinNode_3040);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.Pin_3041);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CreateObjectAction_3042);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3002);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3003);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3004);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3005);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallBehaviorAction_3044);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3006);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3007);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallOperationAction_3045);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3008);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3046);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3009);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OpaqueAction_3011);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3012);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3013);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ActivityFinalNode_3014);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DecisionNode_3015);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.FlowFinalNode_3016);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.Pin_3017);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CreateObjectAction_3018);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallBehaviorAction_3019);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallOperationAction_3020);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ForkNode_3021);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.JoinNode_3022);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DataStoreNode_3024);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CentralBufferNode_3025);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3054);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3055);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ActivityParameterNode_3052);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.SendSignalAction_3053);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3059);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AcceptEventAction_3060);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ActivityFinalNode_3061);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DecisionNode_3062);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.MergeNode_3063);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InitialNode_3064);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.DataStoreNode_3065);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CentralBufferNode_3066);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OpaqueAction_3067);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.FlowFinalNode_3068);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ForkNode_3069);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.JoinNode_3070);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.Pin_3071);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CreateObjectAction_3072);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallBehaviorAction_3074);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.CallOperationAction_3075);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3076);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.StructuredActivityNode_3079);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.InputPin_3080);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3081);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.SendSignalAction_3077);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.LoopNode_3078);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ConditionalNode_3083);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ExpansionRegion_3085);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.OutputPin_3090);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.LoopNode_3058);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ConditionalNode_3082);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ExpansionRegion_3084);
		}
		if (relationshipType == UMLElementTypes.ControlFlow_4001) {
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3030);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3031);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ActivityFinalNode_3032);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DecisionNode_3033);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.MergeNode_3034);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InitialNode_3035);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DataStoreNode_3036);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CentralBufferNode_3037);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OpaqueAction_3029);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3001);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.FlowFinalNode_3038);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ForkNode_3039);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.JoinNode_3040);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.Pin_3041);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CreateObjectAction_3042);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3002);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3043);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3003);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3004);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3005);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallBehaviorAction_3044);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3006);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3007);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallOperationAction_3045);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3008);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3046);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3009);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OpaqueAction_3011);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3012);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3013);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ActivityFinalNode_3014);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DecisionNode_3015);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.FlowFinalNode_3016);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.Pin_3017);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CreateObjectAction_3018);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallBehaviorAction_3019);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallOperationAction_3020);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ForkNode_3021);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.JoinNode_3022);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3023);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DataStoreNode_3024);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CentralBufferNode_3025);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3054);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3055);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ActivityParameterNode_3052);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.SendSignalAction_3053);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3059);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AcceptEventAction_3060);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ActivityFinalNode_3061);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DecisionNode_3062);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.MergeNode_3063);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InitialNode_3064);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.DataStoreNode_3065);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CentralBufferNode_3066);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OpaqueAction_3067);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.FlowFinalNode_3068);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ForkNode_3069);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.JoinNode_3070);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.Pin_3071);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CreateObjectAction_3072);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.AddStructuralFeatureValueAction_3073);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallBehaviorAction_3074);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.CallOperationAction_3075);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3076);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.StructuredActivityNode_3079);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.InputPin_3080);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3081);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.SendSignalAction_3077);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.LoopNode_3078);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ConditionalNode_3083);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ExpansionRegion_3085);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ValueSpecificationAction_3088);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.OutputPin_3090);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.LoopNode_3058);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ConditionalNode_3082);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ExpansionRegion_3084);
		}
		if (relationshipType == UMLElementTypes.ObjectFlow_4002) {
			types.add(UMLElementTypes.ValueSpecificationAction_3089);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		if (isCanonicalEnabled()) {
			handleFeatureLinkModification(event);
		}
	}

	/**
	 * @generated
	 */
	public class CentralBufferFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private Label fFigureCentralBufferFigure_name;

		/**
		 * @generated
		 */
		private Label fFigureCentralBufferFigure_states;

		/**
		 * @generated
		 */
		private Label fFigureCentralBufferFigure_stereo;

		/**
		 * @generated
		 */
		public CentralBufferFigure() {

			CenterLayout layoutThis = new CenterLayout();

			this.setLayoutManager(layoutThis);

			this.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure centralBufferFigure_NameContainer0 = new RectangleFigure();
			centralBufferFigure_NameContainer0.setFill(false);
			centralBufferFigure_NameContainer0.setOutline(false);

			this.add(centralBufferFigure_NameContainer0);

			ToolbarLayout layoutCentralBufferFigure_NameContainer0 = new ToolbarLayout();
			layoutCentralBufferFigure_NameContainer0.setStretchMinorAxis(false);
			layoutCentralBufferFigure_NameContainer0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutCentralBufferFigure_NameContainer0.setSpacing(0);
			layoutCentralBufferFigure_NameContainer0.setVertical(true);

			centralBufferFigure_NameContainer0.setLayoutManager(layoutCentralBufferFigure_NameContainer0);

			Label centralBufferFigure_fixed_central1 = new Label();
			centralBufferFigure_fixed_central1.setText("\u00ABcentralBuffer\u00BB");

			centralBufferFigure_NameContainer0.add(centralBufferFigure_fixed_central1);

			fFigureCentralBufferFigure_stereo = new Label();
			fFigureCentralBufferFigure_stereo.setText("");

			centralBufferFigure_NameContainer0.add(fFigureCentralBufferFigure_stereo);

			fFigureCentralBufferFigure_name = new Label();
			fFigureCentralBufferFigure_name.setText("");

			centralBufferFigure_NameContainer0.add(fFigureCentralBufferFigure_name);

			fFigureCentralBufferFigure_states = new Label();
			fFigureCentralBufferFigure_states.setText("");

			centralBufferFigure_NameContainer0.add(fFigureCentralBufferFigure_states);

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
		public Label getFigureCentralBufferFigure_name() {
			return fFigureCentralBufferFigure_name;
		}

		/**
		 * @generated
		 */
		public Label getFigureCentralBufferFigure_states() {
			return fFigureCentralBufferFigure_states;
		}

		/**
		 * @generated
		 */
		public Label getFigureCentralBufferFigure_stereo() {
			return fFigureCentralBufferFigure_stereo;
		}

	}

	/**
	 * @generated
	 */
	private void handleFeatureLinkModification(Notification event) {
		if (event.getFeature() == UMLPackage.eINSTANCE.getObjectNode_Selection()) {
			refreshDiagram();
			return;
		}
	}

	/**
	 * @generated
	 */
	private boolean isCanonicalEnabled() {
		//this particular edit part may not have editpolicy at all, 
		//but its compartments still may have it
		EObject semantic = resolveSemanticElement();
		if (semantic == null) {
			return false;
		}
		for (Object next : CanonicalEditPolicy.getRegisteredEditPolicies(semantic)) {
			if (next instanceof CanonicalEditPolicy) {
				CanonicalEditPolicy nextPolicy = (CanonicalEditPolicy) next;
				if (nextPolicy.isEnabled()) {
					return true;
				}
			}
		}
		return false;
	}

	/**
	 * @generated
	 */
	public void refreshDiagram() {
		UMLDiagramUpdateCommand.performCanonicalUpdate(getDiagramView().getElement());
	}

}
