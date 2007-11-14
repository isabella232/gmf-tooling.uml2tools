package org.eclipse.uml2.diagram.clazz.edit.parts;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
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
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.Package2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;

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
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
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
	public class PackageFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrapLabel fFigurePackageFigure_name;

		/**
		 * @generated
		 */
		private RectangleFigure fFigurePackageFigure_PackagesCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigurePackageFigure_ClassesCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigurePackageFigure_OthersCompartment;

		/**
		 * @generated
		 */
		public PackageFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure packageFigure_AuxTop0 = new RectangleFigure();
			packageFigure_AuxTop0.setFill(false);
			packageFigure_AuxTop0.setOutline(false);

			this.add(packageFigure_AuxTop0, BorderLayout.TOP);

			ConstrainedToolbarLayout layoutPackageFigure_AuxTop0 = new ConstrainedToolbarLayout();

			layoutPackageFigure_AuxTop0.setStretchMajorAxis(true);

			layoutPackageFigure_AuxTop0.setVertical(false);

			packageFigure_AuxTop0.setLayoutManager(layoutPackageFigure_AuxTop0);

			RectangleFigure packageFigure_AuxLeftTab1 = new RectangleFigure();
			packageFigure_AuxLeftTab1.setPreferredSize(new Dimension(getMapMode().DPtoLP(1), getMapMode().DPtoLP(30)));

			packageFigure_AuxTop0.add(packageFigure_AuxLeftTab1);

			RectangleFigure packageFigure_AuxRightPadding1 = new RectangleFigure();
			packageFigure_AuxRightPadding1.setFill(false);
			packageFigure_AuxRightPadding1.setOutline(false);
			packageFigure_AuxRightPadding1.setPreferredSize(new Dimension(getMapMode().DPtoLP(1), getMapMode().DPtoLP(30)));

			packageFigure_AuxTop0.add(packageFigure_AuxRightPadding1);

			RectangleFigure packageFigure_AuxCenter0 = new RectangleFigure();

			this.add(packageFigure_AuxCenter0, BorderLayout.CENTER);

			ToolbarLayout layoutPackageFigure_AuxCenter0 = new ToolbarLayout();
			layoutPackageFigure_AuxCenter0.setStretchMinorAxis(true);
			layoutPackageFigure_AuxCenter0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutPackageFigure_AuxCenter0.setSpacing(0);
			layoutPackageFigure_AuxCenter0.setVertical(true);

			packageFigure_AuxCenter0.setLayoutManager(layoutPackageFigure_AuxCenter0);

			RectangleFigure packageFigure_NameContainer1 = new RectangleFigure();
			packageFigure_NameContainer1.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(20)));

			packageFigure_AuxCenter0.add(packageFigure_NameContainer1);

			CenterLayout layoutPackageFigure_NameContainer1 = new CenterLayout();

			packageFigure_NameContainer1.setLayoutManager(layoutPackageFigure_NameContainer1);

			fFigurePackageFigure_name = new WrapLabel();
			fFigurePackageFigure_name.setText("");

			fFigurePackageFigure_name.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			packageFigure_NameContainer1.add(fFigurePackageFigure_name);

			fFigurePackageFigure_PackagesCompartment = new RectangleFigure();

			packageFigure_AuxCenter0.add(fFigurePackageFigure_PackagesCompartment);

			fFigurePackageFigure_ClassesCompartment = new RectangleFigure();

			packageFigure_AuxCenter0.add(fFigurePackageFigure_ClassesCompartment);

			fFigurePackageFigure_OthersCompartment = new RectangleFigure();

			packageFigure_AuxCenter0.add(fFigurePackageFigure_OthersCompartment);

		}

		/**
		 * @generated
		 */
		public WrapLabel getFigurePackageFigure_name() {
			return fFigurePackageFigure_name;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePackageFigure_PackagesCompartment() {
			return fFigurePackageFigure_PackagesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePackageFigure_ClassesCompartment() {
			return fFigurePackageFigure_ClassesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigurePackageFigure_OthersCompartment() {
			return fFigurePackageFigure_OthersCompartment;
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
