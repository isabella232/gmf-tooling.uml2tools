package org.eclipse.uml2.diagram.statemachine.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.draw2d.BisectionBorderItemLocator;
import org.eclipse.uml2.diagram.common.draw2d.LaneLayout;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.CreationEditPolicyWithCustomReparent;
import org.eclipse.uml2.diagram.common.editpolicies.LaneLayoutEditPolicy;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.State3CanonicalEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.State3ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.statemachine.providers.UMLElementTypes;

/**
 * @generated
 */
public class State3EditPart extends AbstractBorderedShapeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3016;

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
	public State3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		if (UMLVisualIDRegistry.isShortcutDescendant(getNotationView())) {
			installEditPolicy(UpdateDescriptionEditPolicy.ROLE, new UpdateDescriptionEditPolicy(UMLDiagramUpdater.TYPED_ADAPTER, true));
		}
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(UMLVisualIDRegistry.TYPED_ADAPTER) {

			public Command getCommand(Request request) {
				if (understandsRequest(request)) {
					if (request instanceof CreateViewAndElementRequest) {
						CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor().getCreateElementRequestAdapter();
						IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
						if (type == UMLElementTypes.Behavior_3019) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(StateCompositeState_InternalActivities2EditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Behavior_3020) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(StateCompositeState_InternalActivities2EditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Behavior_3021) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(StateCompositeState_InternalActivities2EditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new State3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new State3CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		installEditPolicy("LayoutEditPolicy", new LaneLayoutEditPolicy()); //$NON-NLS-1$
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
		if (childEditPart instanceof StateName2EditPart) {
			((StateName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureCompositeStateFigure_name());
			return true;
		}
		if (childEditPart instanceof StateCompositeState_InternalActivities2EditPart) {
			IFigure pane = getPrimaryShape().getFigureCompositeStateFigure_InternalActivitiesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StateCompositeState_InternalActivities2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConnectionPointReferenceEditPart) {
			IBorderItemLocator locator = new BisectionBorderItemLocator(getMainFigure());
			getBorderedFigure().getBorderItemContainer().add(((ConnectionPointReferenceEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		if (childEditPart instanceof ConnectionPointReference2EditPart) {
			IBorderItemLocator locator = new BisectionBorderItemLocator(getMainFigure());
			getBorderedFigure().getBorderItemContainer().add(((ConnectionPointReference2EditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof StateCompositeState_InternalActivities2EditPart) {
			IFigure pane = getPrimaryShape().getFigureCompositeStateFigure_InternalActivitiesCompartment();
			pane.remove(((StateCompositeState_InternalActivities2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConnectionPointReferenceEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((ConnectionPointReferenceEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof ConnectionPointReference2EditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((ConnectionPointReference2EditPart) childEditPart).getFigure());
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

		if (editPart instanceof StateCompositeState_InternalActivities2EditPart) {
			return getPrimaryShape().getFigureCompositeStateFigure_InternalActivitiesCompartment();
		}
		if (editPart instanceof ConnectionPointReferenceEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		if (editPart instanceof ConnectionPointReference2EditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated NOT
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {

		if (editPart instanceof StateCompositeState_InternalActivities2EditPart || editPart instanceof ConnectionPointReferenceEditPart || editPart instanceof ConnectionPointReference2EditPart) {
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(StateName2EditPart.VISUAL_ID));
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
	public class CompositeStateFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private Label fFigureCompositeStateFigure_name;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompositeStateFigure_Body;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureCompositeStateFigure_InternalActivitiesCompartment;

		/**
		 * @generated
		 */
		public CompositeStateFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(18), getMapMode().DPtoLP(18)));
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(4), getMapMode().DPtoLP(4), getMapMode().DPtoLP(4), getMapMode().DPtoLP(4)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure compositeStateFigure_UpperContainer0 = new RectangleFigure();
			compositeStateFigure_UpperContainer0.setOutline(false);

			this.add(compositeStateFigure_UpperContainer0, BorderLayout.TOP);

			ToolbarLayout layoutCompositeStateFigure_UpperContainer0 = new ToolbarLayout();
			layoutCompositeStateFigure_UpperContainer0.setStretchMinorAxis(true);
			layoutCompositeStateFigure_UpperContainer0.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutCompositeStateFigure_UpperContainer0.setSpacing(0);
			layoutCompositeStateFigure_UpperContainer0.setVertical(true);

			compositeStateFigure_UpperContainer0.setLayoutManager(layoutCompositeStateFigure_UpperContainer0);

			fFigureCompositeStateFigure_name = new Label();
			fFigureCompositeStateFigure_name.setText("");

			compositeStateFigure_UpperContainer0.add(fFigureCompositeStateFigure_name);

			fFigureCompositeStateFigure_InternalActivitiesCompartment = new RectangleFigure();
			fFigureCompositeStateFigure_InternalActivitiesCompartment.setOutline(false);

			compositeStateFigure_UpperContainer0.add(fFigureCompositeStateFigure_InternalActivitiesCompartment);
			fFigureCompositeStateFigure_InternalActivitiesCompartment.setLayoutManager(new StackLayout());

			fFigureCompositeStateFigure_Body = new RectangleFigure();
			fFigureCompositeStateFigure_Body.setOutline(false);

			this.add(fFigureCompositeStateFigure_Body, BorderLayout.CENTER);

			LaneLayout layoutFFigureCompositeStateFigure_Body = new LaneLayout();

			fFigureCompositeStateFigure_Body.setLayoutManager(layoutFFigureCompositeStateFigure_Body);

		}

		/**
		 * @generated
		 */
		public Label getFigureCompositeStateFigure_name() {
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
		public RectangleFigure getFigureCompositeStateFigure_InternalActivitiesCompartment() {
			return fFigureCompositeStateFigure_InternalActivitiesCompartment;
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
