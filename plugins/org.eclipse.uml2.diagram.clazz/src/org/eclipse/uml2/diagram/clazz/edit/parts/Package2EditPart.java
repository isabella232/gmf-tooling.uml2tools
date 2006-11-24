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

			org.eclipse.gmf.internal.codegen.draw2d.GridLayout layoutThis = new org.eclipse.gmf.internal.codegen.draw2d.GridLayout();
			layoutThis.numColumns = 2;
			layoutThis.makeColumnsEqualWidth = true;
			layoutThis.horizontalSpacing = 0;
			layoutThis.verticalSpacing = 0;
			layoutThis.marginWidth = 0;
			layoutThis.marginHeight = 0;
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setFillXOR(false);
			this.setOutline(false);
			this.setOutlineXOR(false);
			this.setLineWidth(1);
			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			org.eclipse.draw2d.RectangleFigure packageFigure_AuxLeftTab0 = new org.eclipse.draw2d.RectangleFigure();
			packageFigure_AuxLeftTab0.setFill(true);
			packageFigure_AuxLeftTab0.setFillXOR(false);
			packageFigure_AuxLeftTab0.setOutline(true);
			packageFigure_AuxLeftTab0.setOutlineXOR(false);
			packageFigure_AuxLeftTab0.setLineWidth(1);
			packageFigure_AuxLeftTab0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			packageFigure_AuxLeftTab0.setPreferredSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));
			packageFigure_AuxLeftTab0.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintPackageFigure_AuxLeftTab0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintPackageFigure_AuxLeftTab0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintPackageFigure_AuxLeftTab0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintPackageFigure_AuxLeftTab0.horizontalIndent = 0;
			constraintPackageFigure_AuxLeftTab0.horizontalSpan = 1;
			constraintPackageFigure_AuxLeftTab0.verticalSpan = 1;
			constraintPackageFigure_AuxLeftTab0.grabExcessHorizontalSpace = true;
			constraintPackageFigure_AuxLeftTab0.grabExcessVerticalSpace = false;
			this.add(packageFigure_AuxLeftTab0, constraintPackageFigure_AuxLeftTab0);

			org.eclipse.draw2d.RectangleFigure packageFigure_AuxRightPadding0 = new org.eclipse.draw2d.RectangleFigure();
			packageFigure_AuxRightPadding0.setFill(false);
			packageFigure_AuxRightPadding0.setFillXOR(false);
			packageFigure_AuxRightPadding0.setOutline(false);
			packageFigure_AuxRightPadding0.setOutlineXOR(false);
			packageFigure_AuxRightPadding0.setLineWidth(1);
			packageFigure_AuxRightPadding0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			packageFigure_AuxRightPadding0.setPreferredSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));
			packageFigure_AuxRightPadding0.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintPackageFigure_AuxRightPadding0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintPackageFigure_AuxRightPadding0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintPackageFigure_AuxRightPadding0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintPackageFigure_AuxRightPadding0.horizontalIndent = 0;
			constraintPackageFigure_AuxRightPadding0.horizontalSpan = 1;
			constraintPackageFigure_AuxRightPadding0.verticalSpan = 1;
			constraintPackageFigure_AuxRightPadding0.grabExcessHorizontalSpace = true;
			constraintPackageFigure_AuxRightPadding0.grabExcessVerticalSpace = false;
			this.add(packageFigure_AuxRightPadding0, constraintPackageFigure_AuxRightPadding0);

			org.eclipse.draw2d.RectangleFigure packageFigure_NameContainer0 = new org.eclipse.draw2d.RectangleFigure();
			packageFigure_NameContainer0.setFill(true);
			packageFigure_NameContainer0.setFillXOR(false);
			packageFigure_NameContainer0.setOutline(true);
			packageFigure_NameContainer0.setOutlineXOR(false);
			packageFigure_NameContainer0.setLineWidth(1);
			packageFigure_NameContainer0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);
			packageFigure_NameContainer0.setMinimumSize(new org.eclipse.draw2d.geometry.Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintPackageFigure_NameContainer0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintPackageFigure_NameContainer0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintPackageFigure_NameContainer0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintPackageFigure_NameContainer0.horizontalIndent = 0;
			constraintPackageFigure_NameContainer0.horizontalSpan = 2;
			constraintPackageFigure_NameContainer0.verticalSpan = 1;
			constraintPackageFigure_NameContainer0.grabExcessHorizontalSpace = true;
			constraintPackageFigure_NameContainer0.grabExcessVerticalSpace = false;
			this.add(packageFigure_NameContainer0, constraintPackageFigure_NameContainer0);

			org.eclipse.uml2.diagram.common.draw2d.CenterLayout layoutPackageFigure_NameContainer0 = new org.eclipse.uml2.diagram.common.draw2d.CenterLayout();

			packageFigure_NameContainer0.setLayoutManager(layoutPackageFigure_NameContainer0);

			org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel packageFigure_name1 = new org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel();
			packageFigure_name1.setText("");

			packageFigure_NameContainer0.add(packageFigure_name1);
			setFigurePackageFigure_name(packageFigure_name1);

			org.eclipse.draw2d.RectangleFigure packageFigure_Body0 = new org.eclipse.draw2d.RectangleFigure();
			packageFigure_Body0.setFill(true);
			packageFigure_Body0.setFillXOR(false);
			packageFigure_Body0.setOutline(true);
			packageFigure_Body0.setOutlineXOR(false);
			packageFigure_Body0.setLineWidth(1);
			packageFigure_Body0.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData constraintPackageFigure_Body0 = new org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData();
			constraintPackageFigure_Body0.verticalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintPackageFigure_Body0.horizontalAlignment = org.eclipse.gmf.internal.codegen.draw2d.GridLayoutData.FILL;
			constraintPackageFigure_Body0.horizontalIndent = 0;
			constraintPackageFigure_Body0.horizontalSpan = 2;
			constraintPackageFigure_Body0.verticalSpan = 1;
			constraintPackageFigure_Body0.grabExcessHorizontalSpace = true;
			constraintPackageFigure_Body0.grabExcessVerticalSpace = true;
			this.add(packageFigure_Body0, constraintPackageFigure_Body0);

			org.eclipse.draw2d.ToolbarLayout layoutPackageFigure_Body0 = new org.eclipse.draw2d.ToolbarLayout();
			layoutPackageFigure_Body0.setStretchMinorAxis(true);
			layoutPackageFigure_Body0.setMinorAlignment(org.eclipse.draw2d.ToolbarLayout.ALIGN_CENTER

			);

			layoutPackageFigure_Body0.setSpacing(0);
			layoutPackageFigure_Body0.setVertical(true);

			packageFigure_Body0.setLayoutManager(layoutPackageFigure_Body0);

			org.eclipse.draw2d.RectangleFigure packageFigure_PackagesCompartment1 = new org.eclipse.draw2d.RectangleFigure();
			packageFigure_PackagesCompartment1.setFill(true);
			packageFigure_PackagesCompartment1.setFillXOR(false);
			packageFigure_PackagesCompartment1.setOutline(true);
			packageFigure_PackagesCompartment1.setOutlineXOR(false);
			packageFigure_PackagesCompartment1.setLineWidth(1);
			packageFigure_PackagesCompartment1.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			packageFigure_Body0.add(packageFigure_PackagesCompartment1);
			setFigurePackageFigure_PackagesCompartment(packageFigure_PackagesCompartment1);

			org.eclipse.draw2d.RectangleFigure packageFigure_ClassesCompartment1 = new org.eclipse.draw2d.RectangleFigure();
			packageFigure_ClassesCompartment1.setFill(true);
			packageFigure_ClassesCompartment1.setFillXOR(false);
			packageFigure_ClassesCompartment1.setOutline(true);
			packageFigure_ClassesCompartment1.setOutlineXOR(false);
			packageFigure_ClassesCompartment1.setLineWidth(1);
			packageFigure_ClassesCompartment1.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			packageFigure_Body0.add(packageFigure_ClassesCompartment1);
			setFigurePackageFigure_ClassesCompartment(packageFigure_ClassesCompartment1);

			org.eclipse.draw2d.RectangleFigure packageFigure_OthersCompartment1 = new org.eclipse.draw2d.RectangleFigure();
			packageFigure_OthersCompartment1.setFill(true);
			packageFigure_OthersCompartment1.setFillXOR(false);
			packageFigure_OthersCompartment1.setOutline(true);
			packageFigure_OthersCompartment1.setOutlineXOR(false);
			packageFigure_OthersCompartment1.setLineWidth(1);
			packageFigure_OthersCompartment1.setLineStyle(org.eclipse.draw2d.Graphics.LINE_SOLID);

			packageFigure_Body0.add(packageFigure_OthersCompartment1);
			setFigurePackageFigure_OthersCompartment(packageFigure_OthersCompartment1);

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
