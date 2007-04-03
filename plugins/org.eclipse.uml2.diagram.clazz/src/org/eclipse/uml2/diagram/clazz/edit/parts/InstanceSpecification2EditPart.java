package org.eclipse.uml2.diagram.clazz.edit.parts;

import org.eclipse.draw2d.Border;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.PositionConstants;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.policies.InstanceSpecification2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;

/**
 * @generated
 */
public class InstanceSpecification2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2008;

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
	public InstanceSpecification2EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicy() {

			public Command getCommand(Request request) {
				if (understandsRequest(request)) {
					if (request instanceof CreateViewAndElementRequest) {
						CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor().getCreateElementRequestAdapter();
						IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
						if (type == UMLElementTypes.Slot_3017) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(InstanceSpecificationSlotsEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InstanceSpecification2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE) == null) {
					if (child instanceof ITextAwareEditPart) {
						return new UMLTextSelectionEditPolicy();
					}
				}
				return super.createChildEditPolicy(child);
			}
		};
		return lep;
	}

	/**
	 * @generated
	 */
	protected IFigure createNodeShape() {
		InstanceNodeFigure figure = new InstanceNodeFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public InstanceNodeFigure getPrimaryShape() {
		return (InstanceNodeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InstanceSpecificationNameEditPart) {
			((InstanceSpecificationNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureInstanceNode_NameLabel());
			return true;
		}
		if (childEditPart instanceof InstanceSpecificationSlotsEditPart) {
			IFigure pane = getPrimaryShape().getFigureInstanceNode_SlotsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InstanceSpecificationSlotsEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof InstanceSpecificationSlotsEditPart) {
			IFigure pane = getPrimaryShape().getFigureInstanceNode_SlotsCompartmentFigure();
			pane.remove(((InstanceSpecificationSlotsEditPart) childEditPart).getFigure());
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

		if (editPart instanceof InstanceSpecificationSlotsEditPart) {
			return getPrimaryShape().getFigureInstanceNode_SlotsCompartmentFigure();
		}
		return super.getContentPaneFor(editPart);
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(InstanceSpecificationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class InstanceNodeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public InstanceNodeFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER

			);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			this.setFill(true);
			this.setFillXOR(false);
			this.setOutline(true);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(Graphics.LINE_SOLID);
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(0), getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure instanceNode_NameContainerFigure0 = new RectangleFigure();
			instanceNode_NameContainerFigure0.setFill(true);
			instanceNode_NameContainerFigure0.setFillXOR(false);
			instanceNode_NameContainerFigure0.setOutline(false);
			instanceNode_NameContainerFigure0.setOutlineXOR(false);
			instanceNode_NameContainerFigure0.setLineWidth(1);
			instanceNode_NameContainerFigure0.setLineStyle(Graphics.LINE_SOLID);
			instanceNode_NameContainerFigure0.setBorder(createBorderinstanceNode_NameContainerFigure0());

			this.add(instanceNode_NameContainerFigure0);

			instanceNode_NameContainerFigure0.setLayoutManager(new StackLayout());

			WrapLabel instanceNode_NameLabel1 = new WrapLabel();
			instanceNode_NameLabel1.setText("");

			instanceNode_NameContainerFigure0.add(instanceNode_NameLabel1);
			setFigureInstanceNode_NameLabel(instanceNode_NameLabel1);

			CenterLayout layoutInstanceNode_NameLabel1 = new CenterLayout();

			instanceNode_NameLabel1.setLayoutManager(layoutInstanceNode_NameLabel1);

			RectangleFigure instanceSpecification_SpecificationContainerFigure0 = new RectangleFigure();
			instanceSpecification_SpecificationContainerFigure0.setFill(true);
			instanceSpecification_SpecificationContainerFigure0.setFillXOR(false);
			instanceSpecification_SpecificationContainerFigure0.setOutline(false);
			instanceSpecification_SpecificationContainerFigure0.setOutlineXOR(false);
			instanceSpecification_SpecificationContainerFigure0.setLineWidth(1);
			instanceSpecification_SpecificationContainerFigure0.setLineStyle(Graphics.LINE_SOLID);

			this.add(instanceSpecification_SpecificationContainerFigure0);

			CenterLayout layoutInstanceSpecification_SpecificationContainerFigure0 = new CenterLayout();

			instanceSpecification_SpecificationContainerFigure0.setLayoutManager(layoutInstanceSpecification_SpecificationContainerFigure0);

			WrapLabel instanceNode_SpecificationLabel1 = new WrapLabel();
			instanceNode_SpecificationLabel1.setText("");

			instanceSpecification_SpecificationContainerFigure0.add(instanceNode_SpecificationLabel1);
			setFigureInstanceNode_SpecificationLabel(instanceNode_SpecificationLabel1);

			RectangleFigure instanceNode_SlotsCompartmentFigure0 = new RectangleFigure();
			instanceNode_SlotsCompartmentFigure0.setFill(true);
			instanceNode_SlotsCompartmentFigure0.setFillXOR(false);
			instanceNode_SlotsCompartmentFigure0.setOutline(false);
			instanceNode_SlotsCompartmentFigure0.setOutlineXOR(false);
			instanceNode_SlotsCompartmentFigure0.setLineWidth(1);
			instanceNode_SlotsCompartmentFigure0.setLineStyle(Graphics.LINE_SOLID);

			this.add(instanceNode_SlotsCompartmentFigure0);
			setFigureInstanceNode_SlotsCompartmentFigure(instanceNode_SlotsCompartmentFigure0);

		}

		/**
		 * @generated
		 */
		private WrapLabel fInstanceNode_NameLabel;

		/**
		 * @generated
		 */
		public WrapLabel getFigureInstanceNode_NameLabel() {
			return fInstanceNode_NameLabel;
		}

		/**
		 * @generated
		 */
		private void setFigureInstanceNode_NameLabel(WrapLabel fig) {
			fInstanceNode_NameLabel = fig;
		}

		/**
		 * @generated
		 */
		private WrapLabel fInstanceNode_SpecificationLabel;

		/**
		 * @generated
		 */
		public WrapLabel getFigureInstanceNode_SpecificationLabel() {
			return fInstanceNode_SpecificationLabel;
		}

		/**
		 * @generated
		 */
		private void setFigureInstanceNode_SpecificationLabel(WrapLabel fig) {
			fInstanceNode_SpecificationLabel = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fInstanceNode_SlotsCompartmentFigure;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureInstanceNode_SlotsCompartmentFigure() {
			return fInstanceNode_SlotsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureInstanceNode_SlotsCompartmentFigure(RectangleFigure fig) {
			fInstanceNode_SlotsCompartmentFigure = fig;
		}

		/**
		 * @generated
		 */
		private Border createBorderinstanceNode_NameContainerFigure0() {
			OneLineBorder result = new OneLineBorder();

			result.setPosition(PositionConstants.BOTTOM);

			return result;
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
