package org.eclipse.uml2.diagram.profile.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Graphics;
import org.eclipse.draw2d.IFigure;
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
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.profile.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.uml2.diagram.profile.edit.policies.Profile2ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.profile.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.profile.providers.UMLElementTypes;

/**
 * @generated
 */
public class Profile2EditPart extends ShapeNodeEditPart {

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
	public Profile2EditPart(View view) {
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
						if (type == UMLElementTypes.Stereotype_3003) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(ProfileContentsEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});

		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Profile2ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new OpenDiagramEditPolicy());
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
		ProfileFigure figure = new ProfileFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ProfileFigure getPrimaryShape() {
		return (ProfileFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ProfileNameEditPart) {
			((ProfileNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureProfileFigure_NameLabel());
			return true;
		}
		if (childEditPart instanceof ProfileContentsEditPart) {
			IFigure pane = getPrimaryShape().getFigureProfileFigure_ContentsCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ProfileContentsEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof ProfileContentsEditPart) {
			IFigure pane = getPrimaryShape().getFigureProfileFigure_ContentsCompartment();
			pane.remove(((ProfileContentsEditPart) childEditPart).getFigure());
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

		if (editPart instanceof ProfileContentsEditPart) {
			return getPrimaryShape().getFigureProfileFigure_ContentsCompartment();
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ProfileNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class ProfileFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrapLabel fFigureProfileFigure_NameLabel;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureProfileFigure_ContentsCompartment;

		/**
		 * @generated
		 */
		public ProfileFigure() {

			ConstrainedToolbarLayout layoutThis = new ConstrainedToolbarLayout();

			layoutThis.setStretchMajorAxis(true);

			layoutThis.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			this.setLayoutManager(layoutThis);

			this.setFill(false);
			this.setOutline(false);
			this.setForegroundColor(ColorConstants.lightGray);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure profile_leftTab0 = new RectangleFigure();
			profile_leftTab0.setPreferredSize(new Dimension(getMapMode().DPtoLP(40), getMapMode().DPtoLP(20)));
			profile_leftTab0.setMaximumSize(new Dimension(getMapMode().DPtoLP(40), getMapMode().DPtoLP(20)));

			this.add(profile_leftTab0);

			RectangleFigure profile_body0 = new RectangleFigure();

			this.add(profile_body0);

			ToolbarLayout layoutProfile_body0 = new ToolbarLayout();
			layoutProfile_body0.setStretchMinorAxis(true);
			layoutProfile_body0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutProfile_body0.setSpacing(0);
			layoutProfile_body0.setVertical(true);

			profile_body0.setLayoutManager(layoutProfile_body0);

			WrapLabel profileFigure_ProfileLabel1 = new WrapLabel();
			profileFigure_ProfileLabel1.setText("\u00ABprofile\u00BB");

			profile_body0.add(profileFigure_ProfileLabel1);

			CenterLayout layoutProfileFigure_ProfileLabel1 = new CenterLayout();

			profileFigure_ProfileLabel1.setLayoutManager(layoutProfileFigure_ProfileLabel1);

			WrapLabel profileFigure_NameLabel1 = new WrapLabel();
			profileFigure_NameLabel1.setText("");

			profile_body0.add(profileFigure_NameLabel1);
			fFigureProfileFigure_NameLabel = profileFigure_NameLabel1;

			CenterLayout layoutProfileFigure_NameLabel1 = new CenterLayout();

			profileFigure_NameLabel1.setLayoutManager(layoutProfileFigure_NameLabel1);

			RectangleFigure profileFigure_ContentsCompartment1 = new RectangleFigure();

			profile_body0.add(profileFigure_ContentsCompartment1);
			fFigureProfileFigure_ContentsCompartment = profileFigure_ContentsCompartment1;

		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureProfileFigure_NameLabel() {
			return fFigureProfileFigure_NameLabel;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureProfileFigure_ContentsCompartment() {
			return fFigureProfileFigure_ContentsCompartment;
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
