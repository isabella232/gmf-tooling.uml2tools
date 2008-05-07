package org.eclipse.uml2.diagram.clazz.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LayoutManager;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.diagram.clazz.edit.policies.PrimitiveType3CanonicalEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.PrimitiveType3ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;

/**
 * @generated
 */
public class PrimitiveType3EditPart extends AbstractBorderedShapeEditPart implements PrimaryShapeEditPart {

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
	public PrimitiveType3EditPart(View view) {
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
						if (type == UMLElementTypes.Property_3021) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PrimitiveTypeAttributes2EditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Operation_3022) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PrimitiveTypeOperations2EditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PrimitiveType3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new PrimitiveType3CanonicalEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		// XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	 * @generated
	 */
	protected LayoutEditPolicy createLayoutEditPolicy() {

		ConstrainedToolbarLayoutEditPolicy lep = new ConstrainedToolbarLayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				if (child instanceof IBorderItemEditPart) {
					return new BorderItemSelectionEditPolicy();
				}
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
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof PrimitiveTypeName2EditPart) {
			((PrimitiveTypeName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureClassFigure_name());
			return true;
		}
		if (childEditPart instanceof PrimitiveTypeAttributes2EditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PrimitiveTypeAttributes2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PrimitiveTypeOperations2EditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_OperationsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((PrimitiveTypeOperations2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof RedefinableTemplateSignatureEditPart) {
			IBorderItemLocator locator = new TemplateLocator(getMainFigure());
			getBorderedFigure().getBorderItemContainer().add(((RedefinableTemplateSignatureEditPart) childEditPart).getFigure(), locator);
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof PrimitiveTypeAttributes2EditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
			pane.remove(((PrimitiveTypeAttributes2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof PrimitiveTypeOperations2EditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_OperationsCompartment();
			pane.remove(((PrimitiveTypeOperations2EditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof RedefinableTemplateSignatureEditPart) {
			getBorderedFigure().getBorderItemContainer().remove(((RedefinableTemplateSignatureEditPart) childEditPart).getFigure());
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

		if (editPart instanceof PrimitiveTypeAttributes2EditPart) {
			return getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
		}
		if (editPart instanceof PrimitiveTypeOperations2EditPart) {
			return getPrimaryShape().getFigureClassFigure_OperationsCompartment();
		}
		if (editPart instanceof RedefinableTemplateSignatureEditPart) {
			return getBorderedFigure().getBorderItemContainer();
		}
		return super.getContentPaneFor(editPart);
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
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(PrimitiveTypeName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ClassFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private Label fFigureClassFigure_stereo;

		/**
		 * @generated
		 */
		private Label fFigureClassFigure_name;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_PropertiesCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_OperationsCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_ClassesCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_LiteralsCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureClassFigure_OthersCompartment;

		/**
		 * @generated
		 */
		public ClassFigure() {

			ToolbarLayout layoutThis = new ToolbarLayout();
			layoutThis.setStretchMinorAxis(true);
			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutThis.setSpacing(0);
			layoutThis.setVertical(true);

			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure classFigure_Header0 = new RectangleFigure();
			classFigure_Header0.setBorder(new LineBorder(null, getMapMode().DPtoLP(1)));

			this.add(classFigure_Header0);

			ToolbarLayout layoutClassFigure_Header0 = new ToolbarLayout();
			layoutClassFigure_Header0.setStretchMinorAxis(true);
			layoutClassFigure_Header0.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutClassFigure_Header0.setSpacing(0);
			layoutClassFigure_Header0.setVertical(true);

			classFigure_Header0.setLayoutManager(layoutClassFigure_Header0);

			RectangleFigure classFigure_StereoContainer1 = new RectangleFigure();
			classFigure_StereoContainer1.setOutline(false);

			classFigure_Header0.add(classFigure_StereoContainer1);

			CenterLayout layoutClassFigure_StereoContainer1 = new CenterLayout();

			classFigure_StereoContainer1.setLayoutManager(layoutClassFigure_StereoContainer1);

			fFigureClassFigure_stereo = new Label();
			fFigureClassFigure_stereo.setText("");

			fFigureClassFigure_stereo.setFont(FFIGURECLASSFIGURE_STEREO_FONT);

			fFigureClassFigure_stereo.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			classFigure_StereoContainer1.add(fFigureClassFigure_stereo);

			RectangleFigure classFigure_NameContainer1 = new RectangleFigure();
			classFigure_NameContainer1.setOutline(false);

			classFigure_Header0.add(classFigure_NameContainer1);

			CenterLayout layoutClassFigure_NameContainer1 = new CenterLayout();

			classFigure_NameContainer1.setLayoutManager(layoutClassFigure_NameContainer1);

			fFigureClassFigure_name = new Label();
			fFigureClassFigure_name.setText("");

			fFigureClassFigure_name.setFont(FFIGURECLASSFIGURE_NAME_FONT);

			fFigureClassFigure_name.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			classFigure_NameContainer1.add(fFigureClassFigure_name);

			fFigureClassFigure_PropertiesCompartment = new RectangleFigure();

			this.add(fFigureClassFigure_PropertiesCompartment);

			fFigureClassFigure_PropertiesCompartment.setLayoutManager(new StackLayout());

			fFigureClassFigure_OperationsCompartment = new RectangleFigure();

			this.add(fFigureClassFigure_OperationsCompartment);

			fFigureClassFigure_OperationsCompartment.setLayoutManager(new StackLayout());

			fFigureClassFigure_ClassesCompartment = new RectangleFigure();

			this.add(fFigureClassFigure_ClassesCompartment);

			fFigureClassFigure_ClassesCompartment.setLayoutManager(new StackLayout());

			fFigureClassFigure_LiteralsCompartment = new RectangleFigure();

			this.add(fFigureClassFigure_LiteralsCompartment);

			fFigureClassFigure_LiteralsCompartment.setLayoutManager(new StackLayout());

			fFigureClassFigure_OthersCompartment = new RectangleFigure();

			this.add(fFigureClassFigure_OthersCompartment);

			fFigureClassFigure_OthersCompartment.setLayoutManager(new StackLayout());

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
		public Label getFigureClassFigure_stereo() {
			return fFigureClassFigure_stereo;
		}

		/**
		 * @generated
		 */
		public Label getFigureClassFigure_name() {
			return fFigureClassFigure_name;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_PropertiesCompartment() {
			return fFigureClassFigure_PropertiesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_OperationsCompartment() {
			return fFigureClassFigure_OperationsCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_ClassesCompartment() {
			return fFigureClassFigure_ClassesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_LiteralsCompartment() {
			return fFigureClassFigure_LiteralsCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_OthersCompartment() {
			return fFigureClassFigure_OthersCompartment;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGURECLASSFIGURE_STEREO_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURECLASSFIGURE_NAME_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

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
