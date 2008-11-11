package org.eclipse.uml2.diagram.component.edit.parts;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.diagram.component.edit.policies.Artifact3ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.component.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;

/**
 * @generated
 */

public class Artifact3EditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 3016;

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
	public Artifact3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		if (UMLVisualIDRegistry.isShortcutDescendant(getNotationView())) {
			installEditPolicy(UpdateDescriptionEditPolicy.ROLE, new UpdateDescriptionEditPolicy(UMLDiagramUpdater.TYPED_ADAPTER, true));
		}
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Artifact3ItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
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
		ArtifactFigure figure = new ArtifactFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ArtifactFigure getPrimaryShape() {
		return (ArtifactFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ArtifactName3EditPart) {
			((ArtifactName3EditPart) childEditPart).setLabel(getPrimaryShape().getFigureArtifactFigure_name());
			return true;
		}
		if (childEditPart instanceof ArtifactStereo3EditPart) {
			((ArtifactStereo3EditPart) childEditPart).setLabel(getPrimaryShape().getFigureArtifactFigure_fixed_artifact());
			return true;
		}
		if (childEditPart instanceof ArtifactContents2EditPart) {
			IFigure pane = getPrimaryShape().getFigureArtifactFigure_Body();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(((ArtifactContents2EditPart) childEditPart).getFigure());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

		if (childEditPart instanceof ArtifactContents2EditPart) {
			IFigure pane = getPrimaryShape().getFigureArtifactFigure_Body();
			pane.remove(((ArtifactContents2EditPart) childEditPart).getFigure());
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
		if (editPart instanceof ArtifactContents2EditPart) {
			return getPrimaryShape().getFigureArtifactFigure_Body();
		}
		return getContentPane();
	}

	/**
	 * @generated
	 */
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(getMapMode().DPtoLP(80), getMapMode().DPtoLP(60));
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
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	 * @generated
	 */
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(getMapMode().DPtoLP(width));
		}
	}

	/**
	 * @generated
	 */
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	 * @generated
	 */
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ArtifactName3EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UMLElementTypes.Dependency_4009);
		types.add(UMLElementTypes.Association_4011);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UMLElementTypes.Dependency_4009);
		types.add(UMLElementTypes.Association_4011);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof Artifact2EditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof Package2EditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof Package3EditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof ClassDiagramNotationClassEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof Component2EditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof PortEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof ArtifactEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.component.edit.parts.Artifact3EditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof PropertyEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof AssemblyConnectorCircleEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof PortOnClassEditPart) {
			types.add(UMLElementTypes.Dependency_4009);
		}
		if (targetEditPart instanceof ComponentEditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof Artifact2EditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof Interface2EditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof Class2EditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof ClassDiagramNotationClassEditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof Component2EditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof ArtifactEditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.component.edit.parts.Artifact3EditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof ClassEditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		if (targetEditPart instanceof InterfaceEditPart) {
			types.add(UMLElementTypes.Association_4011);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Component_2001);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Artifact_2002);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Interface_2003);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Class_2004);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Package_2005);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Package_2006);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Class_2007);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Component_3001);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Port_3002);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Artifact_3003);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Artifact_3016);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Class_3004);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Interface_3005);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Property_3006);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Connector_3015);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Port_3014);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Component_2001);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Artifact_2002);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Interface_2003);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Class_2004);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Class_2007);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Component_3001);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Artifact_3003);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Artifact_3016);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Class_3004);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Interface_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Component_2001);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Artifact_2002);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Interface_2003);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Class_2004);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Package_2005);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Package_2006);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Class_2007);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Component_3001);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Port_3002);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Artifact_3003);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Artifact_3016);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Class_3004);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Interface_3005);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Property_3006);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Connector_3015);
		}
		if (relationshipType == UMLElementTypes.Dependency_4009) {
			types.add(UMLElementTypes.Port_3014);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Component_2001);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Artifact_2002);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Interface_2003);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Class_2004);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Class_2007);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Component_3001);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Artifact_3003);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Artifact_3016);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Class_3004);
		}
		if (relationshipType == UMLElementTypes.Association_4011) {
			types.add(UMLElementTypes.Interface_3005);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
	}

	/**
	 * @generated
	 */
	public class ArtifactFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private Label fFigureArtifactFigure_name;

		/**
		 * @generated
		 */
		private RectangleFigure fFigureArtifactFigure_Body;

		/**
		 * @generated
		 */
		private Label fFigureArtifactFigure_fixed_artifact;

		/**
		 * @generated
		 */
		public ArtifactFigure() {

			BorderLayout layoutThis = new BorderLayout();
			this.setLayoutManager(layoutThis);

			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			RectangleFigure artifactFigure_NameContainer0 = new RectangleFigure();
			artifactFigure_NameContainer0.setFill(false);
			artifactFigure_NameContainer0.setOutline(false);

			this.add(artifactFigure_NameContainer0, BorderLayout.TOP);

			ToolbarLayout layoutArtifactFigure_NameContainer0 = new ToolbarLayout();
			layoutArtifactFigure_NameContainer0.setStretchMinorAxis(true);
			layoutArtifactFigure_NameContainer0.setMinorAlignment(ToolbarLayout.ALIGN_CENTER);

			layoutArtifactFigure_NameContainer0.setSpacing(0);
			layoutArtifactFigure_NameContainer0.setVertical(true);

			artifactFigure_NameContainer0.setLayoutManager(layoutArtifactFigure_NameContainer0);

			fFigureArtifactFigure_name = new Label();
			fFigureArtifactFigure_name.setText("");

			artifactFigure_NameContainer0.add(fFigureArtifactFigure_name);

			fFigureArtifactFigure_fixed_artifact = new Label();
			fFigureArtifactFigure_fixed_artifact.setText("\u00ABartifact\u00BB");

			artifactFigure_NameContainer0.add(fFigureArtifactFigure_fixed_artifact);

			fFigureArtifactFigure_Body = new RectangleFigure();
			fFigureArtifactFigure_Body.setMinimumSize(new Dimension(getMapMode().DPtoLP(0), getMapMode().DPtoLP(55)));

			this.add(fFigureArtifactFigure_Body, BorderLayout.CENTER);

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
		public Label getFigureArtifactFigure_name() {
			return fFigureArtifactFigure_name;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFigureArtifactFigure_Body() {
			return fFigureArtifactFigure_Body;
		}

		/**
		 * @generated
		 */
		public Label getFigureArtifactFigure_fixed_artifact() {
			return fFigureArtifactFigure_fixed_artifact;
		}

	}

}
