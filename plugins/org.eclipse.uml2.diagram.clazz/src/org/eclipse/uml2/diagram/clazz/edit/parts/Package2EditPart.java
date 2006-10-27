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
import org.eclipse.uml2.diagram.clazz.edit.policies.Package2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;

/**
 * @generated
 */
public class Package2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2002;

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
	public Package2EditPart(View view) {
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
						if (type == UMLElementTypes.Package_3006) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackagePackagesEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Class_3007) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.DataType_3008) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.PrimitiveType_3009) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Enumeration_3011) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.AssociationClass_3012) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.InstanceSpecification_3013) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageOtherEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Package2ItemSemanticEditPolicy());
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
		PackageFigure figure = new PackageFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public PackageFigure getPrimaryShape() {
		return (PackageFigure) primaryShape;
	}

	/**
	 * @generated 
	 */
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof PackagePackagesEditPart) {
			return getPrimaryShape().getFigurePackageFigure_PackagesCompartment();
		}
		if (editPart instanceof PackageClassifiersEditPart) {
			return getPrimaryShape().getFigurePackageFigure_ClassesCompartment();
		}
		if (editPart instanceof PackageOtherEditPart) {
			return getPrimaryShape().getFigurePackageFigure_OthersCompartment();
		}

		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PackageNameEditPart) {
			((PackageNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigurePackageFigure_name());
			return true;
		}
		if (childEditPart instanceof PackagePackagesEditPart) {
			IFigure pane = getPrimaryShape().getFigurePackageFigure_PackagesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PackagePackagesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PackageClassifiersEditPart) {
			IFigure pane = getPrimaryShape().getFigurePackageFigure_ClassesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PackageClassifiersEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PackageOtherEditPart) {
			IFigure pane = getPrimaryShape().getFigurePackageFigure_OthersCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PackageOtherEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PackagePackagesEditPart) {
			IFigure pane = getPrimaryShape().getFigurePackageFigure_PackagesCompartment();
			pane.remove(((PackagePackagesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PackageClassifiersEditPart) {
			IFigure pane = getPrimaryShape().getFigurePackageFigure_ClassesCompartment();
			pane.remove(((PackageClassifiersEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PackageOtherEditPart) {
			IFigure pane = getPrimaryShape().getFigurePackageFigure_OthersCompartment();
			pane.remove(((PackageOtherEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(100), getMapMode().DPtoLP(80));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageNameEditPart.VISUAL_ID));
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
	public class PackageFigure extends org.eclipse.draw2d.RectangleFigure {

		/**
		 * @generated
		 */
		public PackageFigure() {

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout myGenLayoutManager = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			myGenLayoutManager.numColumns = 2;
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

			fig_0.setPreferredSize(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25));
			fig_0.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));

			setFigurePackageFigure_AuxLeftTab(fig_0);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData0.horizontalIndent = 0;
			layData0.horizontalSpan = 1;
			layData0.verticalSpan = 1;
			layData0.grabExcessHorizontalSpace = true;
			layData0.grabExcessVerticalSpace = false;

			this.add(fig_0, layData0);
			org.eclipse.draw2d.RectangleFigure fig_1 = new org.eclipse.draw2d.RectangleFigure();
			fig_1.setFill(false);
			fig_1.setOutline(false);
			fig_1.setPreferredSize(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25));
			fig_1.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));

			setFigurePackageFigure_AuxRightPadding(fig_1);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData1 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData1.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData1.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData1.horizontalIndent = 0;
			layData1.horizontalSpan = 1;
			layData1.verticalSpan = 1;
			layData1.grabExcessHorizontalSpace = true;
			layData1.grabExcessVerticalSpace = false;

			this.add(fig_1, layData1);
			org.eclipse.draw2d.RectangleFigure fig_2 = new org.eclipse.draw2d.RectangleFigure();

			fig_2.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));

			org.eclipse.uml2.diagram.common.draw2d.CenterLayout layouter2 = new org.eclipse.uml2.diagram.common.draw2d.CenterLayout();

			fig_2.setLayoutManager(layouter2);

			setFigurePackageFigure_NameContainer(fig_2);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData2 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData2.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData2.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData2.horizontalIndent = 0;
			layData2.horizontalSpan = 2;
			layData2.verticalSpan = 1;
			layData2.grabExcessHorizontalSpace = true;
			layData2.grabExcessVerticalSpace = false;

			this.add(fig_2, layData2);
			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig_3 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();

			setFigurePackageFigure_name(fig_3);

			Object layData3 = null;

			fig_2.add(fig_3, layData3);
			org.eclipse.draw2d.RectangleFigure fig_4 = new org.eclipse.draw2d.RectangleFigure();

			org.eclipse.draw2d.ToolbarLayout layouter4 = new org.eclipse.draw2d.ToolbarLayout();
			layouter4.setStretchMinorAxis(true);
			layouter4.setMinorAlignment(org.eclipse.draw2d.ToolbarLayout.ALIGN_CENTER);
			layouter4.setSpacing(0);
			layouter4.setVertical(true);

			fig_4.setLayoutManager(layouter4);

			setFigurePackageFigure_Body(fig_4);
			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData layData4 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			layData4.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData4.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			layData4.horizontalIndent = 0;
			layData4.horizontalSpan = 2;
			layData4.verticalSpan = 1;
			layData4.grabExcessHorizontalSpace = true;
			layData4.grabExcessVerticalSpace = true;

			this.add(fig_4, layData4);
			org.eclipse.draw2d.RectangleFigure fig_5 = new org.eclipse.draw2d.RectangleFigure();

			setFigurePackageFigure_PackagesCompartment(fig_5);

			Object layData5 = null;

			fig_4.add(fig_5, layData5);
			org.eclipse.draw2d.RectangleFigure fig_6 = new org.eclipse.draw2d.RectangleFigure();

			setFigurePackageFigure_ClassesCompartment(fig_6);

			Object layData6 = null;

			fig_4.add(fig_6, layData6);
			org.eclipse.draw2d.RectangleFigure fig_7 = new org.eclipse.draw2d.RectangleFigure();

			setFigurePackageFigure_OthersCompartment(fig_7);

			Object layData7 = null;

			fig_4.add(fig_7, layData7);
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fPackageFigure_AuxLeftTab;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigurePackageFigure_AuxLeftTab() {
			return fPackageFigure_AuxLeftTab;
		}

		/**
		 * @generated
		 */
		private void setFigurePackageFigure_AuxLeftTab(org.eclipse.draw2d.RectangleFigure fig) {
			fPackageFigure_AuxLeftTab = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fPackageFigure_AuxRightPadding;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigurePackageFigure_AuxRightPadding() {
			return fPackageFigure_AuxRightPadding;
		}

		/**
		 * @generated
		 */
		private void setFigurePackageFigure_AuxRightPadding(org.eclipse.draw2d.RectangleFigure fig) {
			fPackageFigure_AuxRightPadding = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fPackageFigure_NameContainer;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigurePackageFigure_NameContainer() {
			return fPackageFigure_NameContainer;
		}

		/**
		 * @generated
		 */
		private void setFigurePackageFigure_NameContainer(org.eclipse.draw2d.RectangleFigure fig) {
			fPackageFigure_NameContainer = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fPackageFigure_name;

		/**
		 * @generated
		 */
		public org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel getFigurePackageFigure_name() {
			return fPackageFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigurePackageFigure_name(org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel fig) {
			fPackageFigure_name = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fPackageFigure_Body;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigurePackageFigure_Body() {
			return fPackageFigure_Body;
		}

		/**
		 * @generated
		 */
		private void setFigurePackageFigure_Body(org.eclipse.draw2d.RectangleFigure fig) {
			fPackageFigure_Body = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fPackageFigure_PackagesCompartment;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigurePackageFigure_PackagesCompartment() {
			return fPackageFigure_PackagesCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigurePackageFigure_PackagesCompartment(org.eclipse.draw2d.RectangleFigure fig) {
			fPackageFigure_PackagesCompartment = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fPackageFigure_ClassesCompartment;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigurePackageFigure_ClassesCompartment() {
			return fPackageFigure_ClassesCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigurePackageFigure_ClassesCompartment(org.eclipse.draw2d.RectangleFigure fig) {
			fPackageFigure_ClassesCompartment = fig;
		}

		/**
		 * @generated
		 */
		private org.eclipse.draw2d.RectangleFigure fPackageFigure_OthersCompartment;

		/**
		 * @generated
		 */
		public org.eclipse.draw2d.RectangleFigure getFigurePackageFigure_OthersCompartment() {
			return fPackageFigure_OthersCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigurePackageFigure_OthersCompartment(org.eclipse.draw2d.RectangleFigure fig) {
			fPackageFigure_OthersCompartment = fig;
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
