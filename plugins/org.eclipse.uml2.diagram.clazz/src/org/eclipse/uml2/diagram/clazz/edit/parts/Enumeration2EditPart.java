package org.eclipse.uml2.diagram.clazz.edit.parts;

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
import org.eclipse.gmf.runtime.diagram.ui.editparts.AbstractBorderedShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IBorderItemEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.BorderItemSelectionEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CreationEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.figures.BorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.figures.IBorderItemLocator;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.diagram.clazz.edit.policies.Enumeration2CanonicalEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.Enumeration2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;

/**
 * @generated
 */
public class Enumeration2EditPart extends AbstractBorderedShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2003;

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
	public Enumeration2EditPart(View view) {
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
						if (type == UMLElementTypes.EnumerationLiteral_3016) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationLiteralsEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Property_3023) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationAttributesEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Operation_3024) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationOperationsEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Enumeration2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DragDropEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		if (childEditPart instanceof EnumerationNameEditPart) {
			((EnumerationNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureClassFigure_name());
			return true;
		}
		if (childEditPart instanceof EnumerationLiteralsEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_LiteralsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((EnumerationLiteralsEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EnumerationAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((EnumerationAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EnumerationOperationsEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_OperationsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((EnumerationOperationsEditPart) childEditPart).getFigure());
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

		if (childEditPart instanceof EnumerationLiteralsEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_LiteralsCompartment();
			pane.remove(((EnumerationLiteralsEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EnumerationAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
			pane.remove(((EnumerationAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof EnumerationOperationsEditPart) {
			IFigure pane = getPrimaryShape().getFigureClassFigure_OperationsCompartment();
			pane.remove(((EnumerationOperationsEditPart) childEditPart).getFigure());
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

		if (editPart instanceof EnumerationLiteralsEditPart) {
			return getPrimaryShape().getFigureClassFigure_LiteralsCompartment();
		}
		if (editPart instanceof EnumerationAttributesEditPart) {
			return getPrimaryShape().getFigureClassFigure_PropertiesCompartment();
		}
		if (editPart instanceof EnumerationOperationsEditPart) {
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(EnumerationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ClassFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public ClassFigure() {

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
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure classFigure_NameContainer0 = new RectangleFigure();
			classFigure_NameContainer0.setFill(true);
			classFigure_NameContainer0.setFillXOR(false);
			classFigure_NameContainer0.setOutline(true);
			classFigure_NameContainer0.setOutlineXOR(false);
			classFigure_NameContainer0.setLineWidth(1);
			classFigure_NameContainer0.setLineStyle(Graphics.LINE_SOLID);

			this.add(classFigure_NameContainer0);

			CenterLayout layoutClassFigure_NameContainer0 = new CenterLayout();

			classFigure_NameContainer0.setLayoutManager(layoutClassFigure_NameContainer0);

			WrapLabel classFigure_name1 = new WrapLabel();
			classFigure_name1.setText("");

			classFigure_name1.setFont(ClassFigure_name_FONT);

			classFigure_name1.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			classFigure_NameContainer0.add(classFigure_name1);
			setFigureClassFigure_name(classFigure_name1);

			RectangleFigure classFigure_PropertiesCompartment0 = new RectangleFigure();
			classFigure_PropertiesCompartment0.setFill(true);
			classFigure_PropertiesCompartment0.setFillXOR(false);
			classFigure_PropertiesCompartment0.setOutline(true);
			classFigure_PropertiesCompartment0.setOutlineXOR(false);
			classFigure_PropertiesCompartment0.setLineWidth(1);
			classFigure_PropertiesCompartment0.setLineStyle(Graphics.LINE_SOLID);

			this.add(classFigure_PropertiesCompartment0);
			setFigureClassFigure_PropertiesCompartment(classFigure_PropertiesCompartment0);
			classFigure_PropertiesCompartment0.setLayoutManager(new StackLayout());

			RectangleFigure classFigure_OperationsCompartment0 = new RectangleFigure();
			classFigure_OperationsCompartment0.setFill(true);
			classFigure_OperationsCompartment0.setFillXOR(false);
			classFigure_OperationsCompartment0.setOutline(true);
			classFigure_OperationsCompartment0.setOutlineXOR(false);
			classFigure_OperationsCompartment0.setLineWidth(1);
			classFigure_OperationsCompartment0.setLineStyle(Graphics.LINE_SOLID);

			this.add(classFigure_OperationsCompartment0);
			setFigureClassFigure_OperationsCompartment(classFigure_OperationsCompartment0);
			classFigure_OperationsCompartment0.setLayoutManager(new StackLayout());

			RectangleFigure classFigure_ClassesCompartment0 = new RectangleFigure();
			classFigure_ClassesCompartment0.setFill(true);
			classFigure_ClassesCompartment0.setFillXOR(false);
			classFigure_ClassesCompartment0.setOutline(true);
			classFigure_ClassesCompartment0.setOutlineXOR(false);
			classFigure_ClassesCompartment0.setLineWidth(1);
			classFigure_ClassesCompartment0.setLineStyle(Graphics.LINE_SOLID);

			this.add(classFigure_ClassesCompartment0);
			setFigureClassFigure_ClassesCompartment(classFigure_ClassesCompartment0);
			classFigure_ClassesCompartment0.setLayoutManager(new StackLayout());

			RectangleFigure classFigure_LiteralsCompartment0 = new RectangleFigure();
			classFigure_LiteralsCompartment0.setFill(true);
			classFigure_LiteralsCompartment0.setFillXOR(false);
			classFigure_LiteralsCompartment0.setOutline(true);
			classFigure_LiteralsCompartment0.setOutlineXOR(false);
			classFigure_LiteralsCompartment0.setLineWidth(1);
			classFigure_LiteralsCompartment0.setLineStyle(Graphics.LINE_SOLID);

			this.add(classFigure_LiteralsCompartment0);
			setFigureClassFigure_LiteralsCompartment(classFigure_LiteralsCompartment0);
			classFigure_LiteralsCompartment0.setLayoutManager(new StackLayout());

			RectangleFigure classFigure_OthersCompartment0 = new RectangleFigure();
			classFigure_OthersCompartment0.setFill(true);
			classFigure_OthersCompartment0.setFillXOR(false);
			classFigure_OthersCompartment0.setOutline(true);
			classFigure_OthersCompartment0.setOutlineXOR(false);
			classFigure_OthersCompartment0.setLineWidth(1);
			classFigure_OthersCompartment0.setLineStyle(Graphics.LINE_SOLID);

			this.add(classFigure_OthersCompartment0);
			setFigureClassFigure_OthersCompartment(classFigure_OthersCompartment0);
			classFigure_OthersCompartment0.setLayoutManager(new StackLayout());

		}

		/**
		 * @generated
		 */
		private WrapLabel fClassFigure_name;

		/**
		 * @generated
		 */
		public WrapLabel getFigureClassFigure_name() {
			return fClassFigure_name;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_name(WrapLabel fig) {
			fClassFigure_name = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fClassFigure_PropertiesCompartment;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_PropertiesCompartment() {
			return fClassFigure_PropertiesCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_PropertiesCompartment(RectangleFigure fig) {
			fClassFigure_PropertiesCompartment = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fClassFigure_OperationsCompartment;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_OperationsCompartment() {
			return fClassFigure_OperationsCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_OperationsCompartment(RectangleFigure fig) {
			fClassFigure_OperationsCompartment = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fClassFigure_ClassesCompartment;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_ClassesCompartment() {
			return fClassFigure_ClassesCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_ClassesCompartment(RectangleFigure fig) {
			fClassFigure_ClassesCompartment = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fClassFigure_LiteralsCompartment;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_LiteralsCompartment() {
			return fClassFigure_LiteralsCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_LiteralsCompartment(RectangleFigure fig) {
			fClassFigure_LiteralsCompartment = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fClassFigure_OthersCompartment;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureClassFigure_OthersCompartment() {
			return fClassFigure_OthersCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureClassFigure_OthersCompartment(RectangleFigure fig) {
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

	/**
	 * @generated
	 */
	static final Font ClassFigure_name_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

}
