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
import org.eclipse.uml2.diagram.clazz.edit.policies.DataType2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

/**
 * @generated
 */
public class DataType2EditPart extends ShapeNodeEditPart {

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
	public DataType2EditPart(View view) {
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
						if (type == UMLElementTypes.Property_3014) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(DataTypeAttributesEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Operation_3015) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(DataTypeOperationsEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DataType2ItemSemanticEditPolicy());
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
		ClassFigure figure = new ClassFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ClassFigure getPrimaryShape() {
		return (ClassFigure) primaryShape;
	}

	/**
	 * @generated 
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof DataTypeAttributesEditPart) {
			return getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
		}
		if (editPart instanceof DataTypeOperationsEditPart) {
			return getPrimaryShape().getFigureClassFigure_OperationsCompartment();
		}

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataTypeNameEditPart) {
			((DataTypeNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureClassFigure_name());
			return true;
		}
		if (childEditPart instanceof DataTypeAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataTypeAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataTypeOperationsEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_OperationsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DataTypeOperationsEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DataTypeAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
			pane.remove(((DataTypeAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof DataTypeOperationsEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_OperationsCompartment();
			pane.remove(((DataTypeOperationsEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(100), getMapMode().DPtoLP(60));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(DataTypeNameEditPart.VISUAL_ID));
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
	public class ClassFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public ClassFigure() {

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout myGenLayoutManager = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			myGenLayoutManager.numColumns = 1;
			myGenLayoutManager.makeColumnsEqualWidth = true;
			myGenLayoutManager.marginWidth = 0;
			myGenLayoutManager.marginHeight = 0;
			myGenLayoutManager.horizontalSpacing = 0;
			myGenLayoutManager.verticalSpacing = 0;

			this.setLayoutManager(myGenLayoutManager);

			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {
			org.eclipse.draw2d.RectangleFigure fig_0 = new org.eclipse.draw2d.RectangleFigure();

			fig_0.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));

			org.eclipse.uml2.diagram.common.draw2d.CenterLayout layouter0 = new org.eclipse.uml2.diagram.common.draw2d.CenterLayout();

			fig_0.setLayoutManager(layouter0);

			setFigureClassFigure_NameContainer(fig_0);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalIndent = 0;
			layData0.horizontalSpan = 2;
			layData0.verticalSpan = 1;
			layData0.grabExcessHorizontalSpace = true;
			layData0.grabExcessVerticalSpace = false;

			this.add(fig_0, layData0);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();

			setFigureClassFigure_name(fig_1);

			Object layData1 = null;

			fig_0.add(fig_1, layData1);
			org.eclipse.draw2d.RectangleFigure fig_2 = new org.eclipse.draw2d.RectangleFigure();

			org.eclipse.draw2d.ToolbarLayout layouter2 = new org.eclipse.draw2d.ToolbarLayout();
			layouter2.setStretchMinorAxis(true);
			layouter2.setMinorAlignment(org.eclipse.draw2d.ToolbarLayout.ALIGN_CENTER);
			layouter2.setSpacing(0);
			layouter2.setVertical(true);

			fig_2.setLayoutManager(layouter2);

			setFigureClassFigure_Body(fig_2);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData2 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData2.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData2.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData2.horizontalIndent = 0;
			layData2.horizontalSpan = 2;
			layData2.verticalSpan = 1;
			layData2.grabExcessHorizontalSpace = true;
			layData2.grabExcessVerticalSpace = true;

			this.add(fig_2, layData2);
			org.eclipse.draw2d.RectangleFigure fig_3 = new org.eclipse.draw2d.RectangleFigure();

			setFigureClassFigure_PropertiesCompartment(fig_3);

			Object layData3 = null;

			fig_2.add(fig_3, layData3);
			org.eclipse.draw2d.RectangleFigure fig_4 = new org.eclipse.draw2d.RectangleFigure();

			setFigureClassFigure_OperationsCompartment(fig_4);

			Object layData4 = null;

			fig_2.add(fig_4, layData4);
			org.eclipse.draw2d.RectangleFigure fig_5 = new org.eclipse.draw2d.RectangleFigure();

			setFigureClassFigure_ClassesCompartment(fig_5);

			Object layData5 = null;

			fig_2.add(fig_5, layData5);
			org.eclipse.draw2d.RectangleFigure fig_6 = new org.eclipse.draw2d.RectangleFigure();

			setFigureClassFigure_LiteralsCompartment(fig_6);

			Object layData6 = null;

			fig_2.add(fig_6, layData6);
			org.eclipse.draw2d.RectangleFigure fig_7 = new org.eclipse.draw2d.RectangleFigure();

			setFigureClassFigure_OthersCompartment(fig_7);

			Object layData7 = null;

			fig_2.add(fig_7, layData7);
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fClassFigure_NameContainer;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureClassFigure_NameContainer() {
			return fClassFigure_NameContainer;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_NameContainer(org.eclipse.draw2d.RectangleFigure fig) {
			fClassFigure_NameContainer = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fClassFigure_name;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigureClassFigure_name() {
			return fClassFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_name(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fClassFigure_name = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fClassFigure_Body;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureClassFigure_Body() {
			return fClassFigure_Body;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_Body(org.eclipse.draw2d.RectangleFigure fig) {
			fClassFigure_Body = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fClassFigure_PropertiesCompartment;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureClassFigure_PropertiesCompartment() {
			return fClassFigure_PropertiesCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_PropertiesCompartment(org.eclipse.draw2d.RectangleFigure fig) {
			fClassFigure_PropertiesCompartment = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fClassFigure_OperationsCompartment;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureClassFigure_OperationsCompartment() {
			return fClassFigure_OperationsCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_OperationsCompartment(org.eclipse.draw2d.RectangleFigure fig) {
			fClassFigure_OperationsCompartment = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fClassFigure_ClassesCompartment;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureClassFigure_ClassesCompartment() {
			return fClassFigure_ClassesCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_ClassesCompartment(org.eclipse.draw2d.RectangleFigure fig) {
			fClassFigure_ClassesCompartment = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fClassFigure_LiteralsCompartment;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureClassFigure_LiteralsCompartment() {
			return fClassFigure_LiteralsCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_LiteralsCompartment(org.eclipse.draw2d.RectangleFigure fig) {
			fClassFigure_LiteralsCompartment = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fClassFigure_OthersCompartment;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigureClassFigure_OthersCompartment() {
			return fClassFigure_OthersCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_OthersCompartment(org.eclipse.draw2d.RectangleFigure fig) {
			fClassFigure_OthersCompartment = fig;
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
