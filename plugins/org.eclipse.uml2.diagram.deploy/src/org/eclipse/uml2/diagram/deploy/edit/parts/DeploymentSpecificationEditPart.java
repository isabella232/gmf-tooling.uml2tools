package org.eclipse.uml2.diagram.deploy.edit.parts;

import org.eclipse.draw2d.ColorConstants;
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
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
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
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.deploy.edit.policies.DeploymentSpecificationCanonicalEditPolicy;
import org.eclipse.uml2.diagram.deploy.edit.policies.DeploymentSpecificationItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.deploy.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.deploy.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.deploy.providers.UMLElementTypes;

/**
 * @generated
 */
public class DeploymentSpecificationEditPart extends ShapeNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2007;

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
	public DeploymentSpecificationEditPart(View view) {
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
						if (type == UMLElementTypes.Property_3003) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(DeploymentSpecificationPropertiesEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DeploymentSpecificationItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new DeploymentSpecificationCanonicalEditPolicy());
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
		DeploymentSpecificationFigure figure = new DeploymentSpecificationFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public DeploymentSpecificationFigure getPrimaryShape() {
		return (DeploymentSpecificationFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof DeploymentSpecificationNameEditPart) {
			((DeploymentSpecificationNameEditPart) childEditPart).setLabel(getPrimaryShape().getFigureDeploymentSpecificationFigure_name());
			return true;
		}
		if (childEditPart instanceof DeploymentSpecificationPropertiesEditPart) {
			IFigure pane = getPrimaryShape().getFigureDeploymentSpecificationFigure_PropertiesCompartment();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((DeploymentSpecificationPropertiesEditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof DeploymentSpecificationPropertiesEditPart) {
			IFigure pane = getPrimaryShape().getFigureDeploymentSpecificationFigure_PropertiesCompartment();
			pane.remove(((DeploymentSpecificationPropertiesEditPart) childEditPart).getFigure());
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

		if (editPart instanceof DeploymentSpecificationPropertiesEditPart) {
			return getPrimaryShape().getFigureDeploymentSpecificationFigure_PropertiesCompartment();
		}
		return super.getContentPaneFor(editPart);
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(160), getMapMode().DPtoLP(100));
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(DeploymentSpecificationNameEditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public class DeploymentSpecificationFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private WrapLabel fFigureDeploymentSpecificationFigure_stereo;

		/**
		 * @generated
		 */
		private WrapLabel fFigureDeploymentSpecificationFigure_name;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureDeploymentSpecificationFigure_PropertiesCompartment;

		/**
		 * @generated
		 */
		public DeploymentSpecificationFigure() {

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

			RectangleFigure deploymentSpecificationFigure_Header0 = new RectangleFigure();
			deploymentSpecificationFigure_Header0.setBorder(new LineBorder(null, getMapMode().DPtoLP(1)));

			this.add(deploymentSpecificationFigure_Header0);

			ToolbarLayout layoutDeploymentSpecificationFigure_Header0 = new ToolbarLayout();
			layoutDeploymentSpecificationFigure_Header0.setStretchMinorAxis(true);
			layoutDeploymentSpecificationFigure_Header0.setMinorAlignment(ToolbarLayout.ALIGN_TOPLEFT);

			layoutDeploymentSpecificationFigure_Header0.setSpacing(0);
			layoutDeploymentSpecificationFigure_Header0.setVertical(true);

			deploymentSpecificationFigure_Header0.setLayoutManager(layoutDeploymentSpecificationFigure_Header0);

			RectangleFigure deploymentSpecificationFigure_StereoContainer1 = new RectangleFigure();
			deploymentSpecificationFigure_StereoContainer1.setOutline(false);

			deploymentSpecificationFigure_Header0.add(deploymentSpecificationFigure_StereoContainer1);

			CenterLayout layoutDeploymentSpecificationFigure_StereoContainer1 = new CenterLayout();

			deploymentSpecificationFigure_StereoContainer1.setLayoutManager(layoutDeploymentSpecificationFigure_StereoContainer1);

			fFigureDeploymentSpecificationFigure_stereo = new WrapLabel();
			fFigureDeploymentSpecificationFigure_stereo.setText("\u00ABdeployment spec\u00BB");

			fFigureDeploymentSpecificationFigure_stereo.setFont(FFIGUREDEPLOYMENTSPECIFICATIONFIGURE_STEREO_FONT);

			fFigureDeploymentSpecificationFigure_stereo.setBorder(new MarginBorder(getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(0), getMapMode().DPtoLP(5)));

			deploymentSpecificationFigure_StereoContainer1.add(fFigureDeploymentSpecificationFigure_stereo);

			RectangleFigure deploymentSpecificationFigure_NameContainer1 = new RectangleFigure();
			deploymentSpecificationFigure_NameContainer1.setOutline(false);

			deploymentSpecificationFigure_Header0.add(deploymentSpecificationFigure_NameContainer1);

			CenterLayout layoutDeploymentSpecificationFigure_NameContainer1 = new CenterLayout();

			deploymentSpecificationFigure_NameContainer1.setLayoutManager(layoutDeploymentSpecificationFigure_NameContainer1);

			fFigureDeploymentSpecificationFigure_name = new WrapLabel();
			fFigureDeploymentSpecificationFigure_name.setText("");

			fFigureDeploymentSpecificationFigure_name.setFont(FFIGUREDEPLOYMENTSPECIFICATIONFIGURE_NAME_FONT);

			fFigureDeploymentSpecificationFigure_name.setBorder(new MarginBorder(getMapMode().DPtoLP(0), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5), getMapMode().DPtoLP(5)));

			deploymentSpecificationFigure_NameContainer1.add(fFigureDeploymentSpecificationFigure_name);

			fFigureDeploymentSpecificationFigure_PropertiesCompartment = new RectangleFigure();

			this.add(fFigureDeploymentSpecificationFigure_PropertiesCompartment);

			fFigureDeploymentSpecificationFigure_PropertiesCompartment.setLayoutManager(new StackLayout());

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
		public WrapLabel getFigureDeploymentSpecificationFigure_stereo() {
			return fFigureDeploymentSpecificationFigure_stereo;
		}

		/**
		 * @generated
		 */
		public WrapLabel getFigureDeploymentSpecificationFigure_name() {
			return fFigureDeploymentSpecificationFigure_name;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureDeploymentSpecificationFigure_PropertiesCompartment() {
			return fFigureDeploymentSpecificationFigure_PropertiesCompartment;
		}

	}

	/**
	 * @generated
	 */
	static final Font FFIGUREDEPLOYMENTSPECIFICATIONFIGURE_STEREO_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

	/**
	 * @generated
	 */
	static final Font FFIGUREDEPLOYMENTSPECIFICATIONFIGURE_NAME_FONT = new Font(Display.getCurrent(), Display.getDefault().getSystemFont().getFontData()[0].getName(), 9, SWT.NORMAL);

}
