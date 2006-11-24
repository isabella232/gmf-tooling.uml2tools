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
		public InstanceNodeFigure() {

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout layoutThis = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			layoutThis.numColumns = 1;
			layoutThis.makeColumnsEqualWidth = true;
			this.setLayoutManager(layoutThis);

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

			org.eclipse.draw2d.RectangleFigure instanceNode_NameContainerFigure0 = new org.eclipse.draw2d.RectangleFigure();
			instanceNode_NameContainerFigure0.setFill(true);
			instanceNode_NameContainerFigure0.setFillXOR(false);
			instanceNode_NameContainerFigure0.setOutline(false);
			instanceNode_NameContainerFigure0.setOutlineXOR(false);
			instanceNode_NameContainerFigure0.setLineWidth(1);
			instanceNode_NameContainerFigure0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			instanceNode_NameContainerFigure0.setBorder(createBorderinstanceNode_NameContainerFigure0());

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintInstanceNode_NameContainerFigure0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintInstanceNode_NameContainerFigure0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintInstanceNode_NameContainerFigure0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintInstanceNode_NameContainerFigure0.horizontalIndent = 0;
			constraintInstanceNode_NameContainerFigure0.horizontalSpan = 1;
			constraintInstanceNode_NameContainerFigure0.verticalSpan = 1;
			constraintInstanceNode_NameContainerFigure0.grabExcessHorizontalSpace = true;
			constraintInstanceNode_NameContainerFigure0.grabExcessVerticalSpace = false;
			this.add(instanceNode_NameContainerFigure0, constraintInstanceNode_NameContainerFigure0);

			instanceNode_NameContainerFigure0.setLayoutManager(new org.eclipse.draw2d.StackLayout());

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel instanceNode_NameLabel1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			instanceNode_NameLabel1.setText("");

			instanceNode_NameContainerFigure0.add(instanceNode_NameLabel1);
			setFigureInstanceNode_NameLabel(instanceNode_NameLabel1);

			org.eclipse.draw2d.RectangleFigure instanceSpecification_SpecificationContainerFigure0 = new org.eclipse.draw2d.RectangleFigure();
			instanceSpecification_SpecificationContainerFigure0.setFill(true);
			instanceSpecification_SpecificationContainerFigure0.setFillXOR(false);
			instanceSpecification_SpecificationContainerFigure0.setOutline(false);
			instanceSpecification_SpecificationContainerFigure0.setOutlineXOR(false);
			instanceSpecification_SpecificationContainerFigure0.setLineWidth(1);
			instanceSpecification_SpecificationContainerFigure0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintInstanceSpecification_SpecificationContainerFigure0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintInstanceSpecification_SpecificationContainerFigure0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintInstanceSpecification_SpecificationContainerFigure0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.CENTER;
			constraintInstanceSpecification_SpecificationContainerFigure0.horizontalIndent = 0;
			constraintInstanceSpecification_SpecificationContainerFigure0.horizontalSpan = 1;
			constraintInstanceSpecification_SpecificationContainerFigure0.verticalSpan = 1;
			constraintInstanceSpecification_SpecificationContainerFigure0.grabExcessHorizontalSpace = true;
			constraintInstanceSpecification_SpecificationContainerFigure0.grabExcessVerticalSpace = false;
			this.add(instanceSpecification_SpecificationContainerFigure0, constraintInstanceSpecification_SpecificationContainerFigure0);

			instanceSpecification_SpecificationContainerFigure0.setLayoutManager(new org.eclipse.draw2d.StackLayout());

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel instanceNode_SpecificationLabel1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			instanceNode_SpecificationLabel1.setText("");

			instanceSpecification_SpecificationContainerFigure0.add(instanceNode_SpecificationLabel1);
			setFigureInstanceNode_SpecificationLabel(instanceNode_SpecificationLabel1);

			org.eclipse.draw2d.RectangleFigure instanceNode_SlotsCompartmentFigure0 = new org.eclipse.draw2d.RectangleFigure();
			instanceNode_SlotsCompartmentFigure0.setFill(true);
			instanceNode_SlotsCompartmentFigure0.setFillXOR(false);
			instanceNode_SlotsCompartmentFigure0.setOutline(false);
			instanceNode_SlotsCompartmentFigure0.setOutlineXOR(false);
			instanceNode_SlotsCompartmentFigure0.setLineWidth(1);
			instanceNode_SlotsCompartmentFigure0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintInstanceNode_SlotsCompartmentFigure0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintInstanceNode_SlotsCompartmentFigure0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintInstanceNode_SlotsCompartmentFigure0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintInstanceNode_SlotsCompartmentFigure0.horizontalIndent = 0;
			constraintInstanceNode_SlotsCompartmentFigure0.horizontalSpan = 1;
			constraintInstanceNode_SlotsCompartmentFigure0.verticalSpan = 1;
			constraintInstanceNode_SlotsCompartmentFigure0.grabExcessHorizontalSpace = true;
			constraintInstanceNode_SlotsCompartmentFigure0.grabExcessVerticalSpace = true;
			this.add(instanceNode_SlotsCompartmentFigure0, constraintInstanceNode_SlotsCompartmentFigure0);

			setFigureInstanceNode_SlotsCompartmentFigure(instanceNode_SlotsCompartmentFigure0);

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
		private org.eclipse.draw2d.Border createBorderinstanceNode_NameContainerFigure0() {
			org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder result = new org.eclipse.gmf.runtime.draw2d.ui.figures.OneLineBorder();

			result.setPosition(org.eclipse.draw2d.PositionConstants.BOTTOM);

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
