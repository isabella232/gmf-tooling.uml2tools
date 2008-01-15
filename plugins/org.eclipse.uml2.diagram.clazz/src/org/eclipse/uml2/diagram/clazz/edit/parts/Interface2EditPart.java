package org.eclipse.uml2.diagram.clazz.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.LineBorder;
import org.eclipse.draw2d.MarginBorder;
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
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrapLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.widgets.Display;
import org.eclipse.uml2.diagram.clazz.edit.policies.Interface2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.clazz.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.clazz.providers.UMLElementTypes;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;

/**
 * @generated
 */
public class Interface2EditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2013;

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
	public Interface2EditPart(View view) {
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
						if (type == UMLElementTypes.Property_3028) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceAttributesEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Operation_3029) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceOperationsEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Class_3030) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceClassesEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Interface2ItemSemanticEditPolicy());
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
		RectangleInterfaceFigure figure = new RectangleInterfaceFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public RectangleInterfaceFigure getPrimaryShape() {
		return (RectangleInterfaceFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof InterfaceName2EditPart) {
			((InterfaceName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigureRectangleInterfaceFigure_name());
			return true;
		}
		if (childEditPart instanceof InterfaceAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureRectangleInterfaceFigure_propertiesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InterfaceAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceOperationsEditPart) {
			IFigure pane = getPrimaryShape().getFigureRectangleInterfaceFigure_operationsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InterfaceOperationsEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceClassesEditPart) {
			IFigure pane = getPrimaryShape().getFigureRectangleInterfaceFigure_classesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((InterfaceClassesEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof InterfaceAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureRectangleInterfaceFigure_propertiesCompartment();
			pane.remove(((InterfaceAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceOperationsEditPart) {
			IFigure pane = getPrimaryShape().getFigureRectangleInterfaceFigure_operationsCompartment();
			pane.remove(((InterfaceOperationsEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof InterfaceClassesEditPart) {
			IFigure pane = getPrimaryShape().getFigureRectangleInterfaceFigure_classesCompartment();
			pane.remove(((InterfaceClassesEditPart) childEditPart).getFigure());
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

		if (editPart instanceof InterfaceAttributesEditPart) {
			return getPrimaryShape().getFigureRectangleInterfaceFigure_propertiesCompartment();
		}
		if (editPart instanceof InterfaceOperationsEditPart) {
			return getPrimaryShape().getFigureRectangleInterfaceFigure_operationsCompartment();
		}
		if (editPart instanceof InterfaceClassesEditPart) {
			return getPrimaryShape().getFigureRectangleInterfaceFigure_classesCompartment();
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(InterfaceName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class RectangleInterfaceFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private RectangleFigure fFigureRectangleInterfaceFigure_propertiesCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureRectangleInterfaceFigure_operationsCompartment;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureRectangleInterfaceFigure_classesCompartment;

		/**
		 * @generated
		 */
		private Label fFigureRectangleInterfaceFigure_name;

		/**
		 * @generated
		 */
		public RectangleInterfaceFigure() {

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

			RectangleFigure rectangleInterfaceFigure_header0 = new RectangleFigure();
			rectangleInterfaceFigure_header0.setBorder(new LineBorder(null, getMapMode().DPtoLP(1)));

			this.add(rectangleInterfaceFigure_header0);

			ToolbarLayout layoutRectangleInterfaceFigure_header0 = new ToolbarLayout();
			layoutRectangleInterfaceFigure_header0.setStretchMinorAxis(true);
			layoutRectangleInterfaceFigure_header0.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutRectangleInterfaceFigure_header0.setSpacing(0);
			layoutRectangleInterfaceFigure_header0.setVertical(true);

			rectangleInterfaceFigure_header0.setLayoutManager(layoutRectangleInterfaceFigure_header0);

			RectangleFigure rectangleInterfaceFigure_InterfaceContainer1 = new RectangleFigure();
			rectangleInterfaceFigure_InterfaceContainer1.setOutline(false);

			rectangleInterfaceFigure_header0.add(rectangleInterfaceFigure_InterfaceContainer1);

			CenterLayout layoutRectangleInterfaceFigure_InterfaceContainer1 = new CenterLayout();

			rectangleInterfaceFigure_InterfaceContainer1.setLayoutManager(layoutRectangleInterfaceFigure_InterfaceContainer1);

			Label rectangleInterfaceFigure_interface2 = new Label();
			rectangleInterfaceFigure_interface2.setText("\u00ABinterface\u00BB");

			rectangleInterfaceFigure_interface2.setFont(RECTANGLEINTERFACEFIGURE_INTERFACE2_FONT);

			rectangleInterfaceFigure_interface2.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			rectangleInterfaceFigure_InterfaceContainer1.add(rectangleInterfaceFigure_interface2);

			RectangleFigure rectangleInterfaceFigure_NameContainer1 = new RectangleFigure();
			rectangleInterfaceFigure_NameContainer1.setOutline(false);

			rectangleInterfaceFigure_header0.add(rectangleInterfaceFigure_NameContainer1);

			CenterLayout layoutRectangleInterfaceFigure_NameContainer1 = new CenterLayout();

			rectangleInterfaceFigure_NameContainer1.setLayoutManager(layoutRectangleInterfaceFigure_NameContainer1);

			fFigureRectangleInterfaceFigure_name = new Label();
			fFigureRectangleInterfaceFigure_name.setText("");

			fFigureRectangleInterfaceFigure_name.setFont(FFIGURERECTANGLEINTERFACEFIGURE_NAME_FONT);

			fFigureRectangleInterfaceFigure_name.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			rectangleInterfaceFigure_NameContainer1.add(fFigureRectangleInterfaceFigure_name);

			fFigureRectangleInterfaceFigure_propertiesCompartment = new RectangleFigure();

			this.add(fFigureRectangleInterfaceFigure_propertiesCompartment);

			fFigureRectangleInterfaceFigure_propertiesCompartment.setLayoutManager(new StackLayout());

			fFigureRectangleInterfaceFigure_operationsCompartment = new RectangleFigure();

			this.add(fFigureRectangleInterfaceFigure_operationsCompartment);

			fFigureRectangleInterfaceFigure_operationsCompartment.setLayoutManager(new StackLayout());

			fFigureRectangleInterfaceFigure_classesCompartment = new RectangleFigure();

			this.add(fFigureRectangleInterfaceFigure_classesCompartment);

			fFigureRectangleInterfaceFigure_classesCompartment.setLayoutManager(new StackLayout());

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
		public RectangleFigure getFigureRectangleInterfaceFigure_propertiesCompartment() {
			return fFigureRectangleInterfaceFigure_propertiesCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureRectangleInterfaceFigure_operationsCompartment() {
			return fFigureRectangleInterfaceFigure_operationsCompartment;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureRectangleInterfaceFigure_classesCompartment() {
			return fFigureRectangleInterfaceFigure_classesCompartment;
		}

		/**
		 * @generated
		 */
		public Label getFigureRectangleInterfaceFigure_name() {
			return fFigureRectangleInterfaceFigure_name;
		}

	}

	/**
	 * @generated
	 */
	static final Font RECTANGLEINTERFACEFIGURE_INTERFACE2_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGURERECTANGLEINTERFACEFIGURE_NAME_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

}
