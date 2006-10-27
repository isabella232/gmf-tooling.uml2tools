package org.eclipse.uml2.diagram.clazz.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.policies.InstanceSpecification2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

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
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof InstanceSpecificationSlotsEditPart) {
			return getPrimaryShape().getFigureInstanceNode_SlotsCompartmentFigure();
		}

		return super.getContentPaneFor(editPart);
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
	public class InstanceNodeFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.Border createBorder_InstanceNode_NameLabel_1() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder result = new org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder();

			result.setPosition(org.eclipse.draw2d.PositionConstants.BOTTOM);

			return result;
		}

		/**
		 * @generated
		 */
		public InstanceNodeFigure() {

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout myGenLayoutManager = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			myGenLayoutManager.numColumns = 1;
			myGenLayoutManager.makeColumnsEqualWidth = true;

			this.setLayoutManager(myGenLayoutManager);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.draw2d.RectangleFigure fig_0 = new org.eclipse.draw2d.RectangleFigure();

			fig_0.setOutline(false);
			fig_0.setBorder(createBorder_InstanceNode_NameLabel_1());

			org.eclipse.draw2d.StackLayout layouter0 = new org.eclipse.draw2d.StackLayout();

			fig_0.setLayoutManager(layouter0);

			setFigureInstanceNode_NameContainerFigure(fig_0);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			layData0.horizontalIndent = 0;
			layData0.horizontalSpan = 1;
			layData0.verticalSpan = 1;
			layData0.grabExcessHorizontalSpace = true;
			layData0.grabExcessVerticalSpace = false;

			this.add(fig_0, layData0);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();

			setFigureInstanceNode_NameLabel(fig_1);

			Object layData1 = null;

			fig_0.add(fig_1, layData1);
			org.eclipse.draw2d.RectangleFigure fig_2 = new org.eclipse.draw2d.RectangleFigure();

			fig_2.setOutline(false);

			org.eclipse.draw2d.StackLayout layouter2 = new org.eclipse.draw2d.StackLayout();

			fig_2.setLayoutManager(layouter2);

			setFigureInstanceSpecification_SpecificationContainerFigure(fig_2);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData2 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData2.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData2.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			layData2.horizontalIndent = 0;
			layData2.horizontalSpan = 1;
			layData2.verticalSpan = 1;
			layData2.grabExcessHorizontalSpace = true;
			layData2.grabExcessVerticalSpace = false;

			this.add(fig_2, layData2);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_3 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();

			setFigureInstanceNode_SpecificationLabel(fig_3);

			Object layData3 = null;

			fig_2.add(fig_3, layData3);
			org.eclipse.draw2d.RectangleFigure fig_4 = new org.eclipse.draw2d.RectangleFigure();

			fig_4.setOutline(false);

			setFigureInstanceNode_SlotsCompartmentFigure(fig_4);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData4 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData4.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData4.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData4.horizontalIndent = 0;
			layData4.horizontalSpan = 1;
			layData4.verticalSpan = 1;
			layData4.grabExcessHorizontalSpace = true;
			layData4.grabExcessVerticalSpace = true;

			this.add(fig_4, layData4);
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fInstanceNode_NameContainerFigure;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureInstanceNode_NameContainerFigure() {
			return fInstanceNode_NameContainerFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureInstanceNode_NameContainerFigure(org.eclipse.draw2d.RectangleFigure fig) {
			fInstanceNode_NameContainerFigure = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fInstanceNode_NameLabel;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureInstanceNode_NameLabel() {
			return fInstanceNode_NameLabel;
		}

		/**
		 * @generated
		 */
		private void setFigureInstanceNode_NameLabel(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fInstanceNode_NameLabel = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fInstanceSpecification_SpecificationContainerFigure;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureInstanceSpecification_SpecificationContainerFigure() {
			return fInstanceSpecification_SpecificationContainerFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureInstanceSpecification_SpecificationContainerFigure(org.eclipse.draw2d.RectangleFigure fig) {
			fInstanceSpecification_SpecificationContainerFigure = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fInstanceNode_SpecificationLabel;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureInstanceNode_SpecificationLabel() {
			return fInstanceNode_SpecificationLabel;
		}

		/**
		 * @generated
		 */
		private void setFigureInstanceNode_SpecificationLabel(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fInstanceNode_SpecificationLabel = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fInstanceNode_SlotsCompartmentFigure;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureInstanceNode_SlotsCompartmentFigure() {
			return fInstanceNode_SlotsCompartmentFigure;
		}

		/**
		 * @generated
		 */
		private void setFigureInstanceNode_SlotsCompartmentFigure(org.eclipse.draw2d.RectangleFigure fig) {
			fInstanceNode_SlotsCompartmentFigure = fig;
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
