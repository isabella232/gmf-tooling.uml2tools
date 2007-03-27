package org.eclipse.uml2.diagram.profile.edit.parts;

import org.eclipse.draw2d.Graphics;
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
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.profile.edit.policies.StereotypeItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.profile.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

/**
 * @generated
 */
public class StereotypeEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2001;

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
	public StereotypeEditPart(View view) {
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
						if (type == UMLElementTypes.Property_3001) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(StereotypeAttributesEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Constraint_3008) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(StereotypeConstraintsEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StereotypeItemSemanticEditPolicy());
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
		StereotypeFigure figure = new StereotypeFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public StereotypeFigure getPrimaryShape() {
		return (StereotypeFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof StereotypeNameEditPart) {
			((StereotypeNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureStereotypeFigure_NameLabel());
			return true;
		}
		if (childEditPart instanceof StereotypeAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureStereotypeFigure_AttributesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StereotypeAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof StereotypeConstraintsEditPart) {
			IFigure pane = getPrimaryShape().getFigureStereotypeFigure_ConstraintsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((StereotypeConstraintsEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof StereotypeAttributesEditPart) {
			IFigure pane = getPrimaryShape().getFigureStereotypeFigure_AttributesCompartment();
			pane.remove(((StereotypeAttributesEditPart) childEditPart).getFigure());
			return true;
		}
		if (childEditPart instanceof StereotypeConstraintsEditPart) {
			IFigure pane = getPrimaryShape().getFigureStereotypeFigure_ConstraintsCompartment();
			pane.remove(((StereotypeConstraintsEditPart) childEditPart).getFigure());
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

		if (editPart instanceof StereotypeAttributesEditPart) {
			return getPrimaryShape().getFigureStereotypeFigure_AttributesCompartment();
		}
		if (editPart instanceof StereotypeConstraintsEditPart) {
			return getPrimaryShape().getFigureStereotypeFigure_ConstraintsCompartment();
		}
		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(100), getMapMode().DPtoLP(25));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(StereotypeNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class StereotypeFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		public StereotypeFigure() {

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
			this.setBorder(new MarginBorder(getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(1), getMapMode().DPtoLP(1)));
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			WrapLabel stereotypeFigure_StereotypeLabel0 = new WrapLabel();
			stereotypeFigure_StereotypeLabel0.setText("\u00ABstereotype\u00BB");

			this.add(stereotypeFigure_StereotypeLabel0);

			CenterLayout layoutStereotypeFigure_StereotypeLabel0 = new CenterLayout();

			stereotypeFigure_StereotypeLabel0.setLayoutManager(layoutStereotypeFigure_StereotypeLabel0);

			RectangleFigure stereotypeFigure_NameContainer0 = new RectangleFigure();
			stereotypeFigure_NameContainer0.setFill(true);
			stereotypeFigure_NameContainer0.setFillXOR(false);
			stereotypeFigure_NameContainer0.setOutline(false);
			stereotypeFigure_NameContainer0.setOutlineXOR(false);
			stereotypeFigure_NameContainer0.setLineWidth(1);
			stereotypeFigure_NameContainer0.setLineStyle(Graphics.LINE_SOLID);
			stereotypeFigure_NameContainer0.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(25)));

			this.add(stereotypeFigure_NameContainer0);

			CenterLayout layoutStereotypeFigure_NameContainer0 = new CenterLayout();

			stereotypeFigure_NameContainer0.setLayoutManager(layoutStereotypeFigure_NameContainer0);

			WrapLabel stereotypeFigure_NameLabel1 = new WrapLabel();
			stereotypeFigure_NameLabel1.setText("");

			stereotypeFigure_NameContainer0.add(stereotypeFigure_NameLabel1);
			setFigureStereotypeFigure_NameLabel(stereotypeFigure_NameLabel1);

			RectangleFigure stereotypeFigure_AttributesCompartment0 = new RectangleFigure();
			stereotypeFigure_AttributesCompartment0.setFill(true);
			stereotypeFigure_AttributesCompartment0.setFillXOR(false);
			stereotypeFigure_AttributesCompartment0.setOutline(false);
			stereotypeFigure_AttributesCompartment0.setOutlineXOR(false);
			stereotypeFigure_AttributesCompartment0.setLineWidth(1);
			stereotypeFigure_AttributesCompartment0.setLineStyle(Graphics.LINE_SOLID);

			this.add(stereotypeFigure_AttributesCompartment0);
			setFigureStereotypeFigure_AttributesCompartment(stereotypeFigure_AttributesCompartment0);

			RectangleFigure stereotypeFigure_ConstraintsCompartment0 = new RectangleFigure();
			stereotypeFigure_ConstraintsCompartment0.setFill(true);
			stereotypeFigure_ConstraintsCompartment0.setFillXOR(false);
			stereotypeFigure_ConstraintsCompartment0.setOutline(false);
			stereotypeFigure_ConstraintsCompartment0.setOutlineXOR(false);
			stereotypeFigure_ConstraintsCompartment0.setLineWidth(1);
			stereotypeFigure_ConstraintsCompartment0.setLineStyle(Graphics.LINE_SOLID);

			this.add(stereotypeFigure_ConstraintsCompartment0);
			setFigureStereotypeFigure_ConstraintsCompartment(stereotypeFigure_ConstraintsCompartment0);

		}

		/**
		 * @generated
		 */
		private WrapLabel fStereotypeFigure_NameLabel;

		/**
		 * @generated
		 */
		public WrapLabel getFigureStereotypeFigure_NameLabel() {
			return fStereotypeFigure_NameLabel;
		}

		/**
		 * @generated
		 */
		private void setFigureStereotypeFigure_NameLabel(WrapLabel fig) {
			fStereotypeFigure_NameLabel = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fStereotypeFigure_AttributesCompartment;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStereotypeFigure_AttributesCompartment() {
			return fStereotypeFigure_AttributesCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureStereotypeFigure_AttributesCompartment(RectangleFigure fig) {
			fStereotypeFigure_AttributesCompartment = fig;
		}

		/**
		 * @generated
		 */
		private RectangleFigure fStereotypeFigure_ConstraintsCompartment;

		/**
		 * @generated
		 */
		public RectangleFigure getFigureStereotypeFigure_ConstraintsCompartment() {
			return fStereotypeFigure_ConstraintsCompartment;
		}

		/**
		 * @generated
		 */
		private void setFigureStereotypeFigure_ConstraintsCompartment(RectangleFigure fig) {
			fStereotypeFigure_ConstraintsCompartment = fig;
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
