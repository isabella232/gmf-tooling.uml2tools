package org.eclipse.uml2.diagram.component.edit.parts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.BorderLayout;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.MarginBorder;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.CreationEditPolicyWithCustomReparent;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;
import org.eclipse.uml2.diagram.component.edit.policies.OpenDiagramEditPolicy;
import org.eclipse.uml2.diagram.component.edit.policies.Package3ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.component.part.UMLDiagramUpdateCommand;
import org.eclipse.uml2.diagram.component.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.component.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.component.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Dependency;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class Package3EditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2006;

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
	private LinkTargetListener myLinkTargetListener;

	/**
	 * @generated
	 */
	public Package3EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		if (UMLVisualIDRegistry.isShortcutDescendant(getNotationView())) {
			installEditPolicy(UpdateDescriptionEditPolicy.ROLE, new UpdateDescriptionEditPolicy(UMLDiagramUpdater.TYPED_ADAPTER, true));
		}
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(UMLVisualIDRegistry.TYPED_ADAPTER) {

			public Command getCommand(Request request) {
				if (understandsRequest(request)) {
					if (request instanceof CreateViewAndElementRequest) {
						CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor().getCreateElementRequestAdapter();
						IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
						if (type == UMLElementTypes.Package_3008) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackagePackagesEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Class_3009) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
						if (type == UMLElementTypes.Component_3010) {
							EditPart compartmentEditPart = getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageClassifiersEditPart.VISUAL_ID));
							return compartmentEditPart == null ? null : compartmentEditPart.getCommand(request);
						}
					}
					return super.getCommand(request);
				}
				return null;
			}
		});
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Package3ItemSemanticEditPolicy());
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
		if (childEditPart instanceof PackageName2EditPart) {
			((PackageName2EditPart) childEditPart).setLabel(getPrimaryShape().getFigurePackageFigure_name());
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
		return getContentPane();
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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(PackageName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UMLElementTypes.Dependency_4009);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UMLElementTypes.Dependency_4009);
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
		if (targetEditPart instanceof org.eclipse.uml2.diagram.component.edit.parts.Package3EditPart) {
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
		if (targetEditPart instanceof Artifact3EditPart) {
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
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		super.handleNotificationEvent(event);
		handleTypeLinkModification(event);
	}

	/**
	 * @generated
	 */
	private DiagramEventBroker getDiagramEventBroker() {
		TransactionalEditingDomain theEditingDomain = getEditingDomain();
		if (theEditingDomain != null) {
			return DiagramEventBroker.getInstance(theEditingDomain);
		}
		return null;
	}

	/**
	 * @generated
	 */
	private LinkTargetListener getLinkTargetListener() {
		if (myLinkTargetListener == null) {
			myLinkTargetListener = new LinkTargetListener();
		}
		return myLinkTargetListener;
	}

	/**
	 * @generated
	 */
	private class LinkTargetListener implements NotificationListener {

		/**
		 * @generated
		 */
		Map<EObject, Set<EStructuralFeature>> myNotifiers = new HashMap<EObject, Set<EStructuralFeature>>();

		/**
		 * @generated
		 */
		private void added(EObject link, EStructuralFeature feature) {
			if (!myNotifiers.containsKey(link)) {
				myNotifiers.put(link, new HashSet<EStructuralFeature>());
			}
			myNotifiers.get(link).add(feature);
		}

		/**
		 * @generated
		 */
		private void removed(EObject link, EStructuralFeature feature) {
			if (!myNotifiers.containsKey(link)) {
				return;
			}
			myNotifiers.get(link).remove(feature);
		}

		/**
		 * @generated
		 */
		public void dispose() {
			Set<Map.Entry<EObject, Set<EStructuralFeature>>> entrySet = myNotifiers.entrySet();
			for (Map.Entry<EObject, Set<EStructuralFeature>> entry : entrySet) {
				for (EStructuralFeature feature : entry.getValue()) {
					getDiagramEventBroker().removeNotificationListener(entry.getKey(), feature, this);
				}
			}
		}

		/**
		 * @generated
		 */
		private void removeReferenceListener(EObject link, EStructuralFeature feature) {
			getDiagramEventBroker().removeNotificationListener(link, feature, this);
			removed(link, feature);
		}

		/**
		 * @generated
		 */
		private void addReferenceListener(EObject link, EStructuralFeature feature) {
			getDiagramEventBroker().addNotificationListener(link, feature, this);
			added(link, feature);
		}

		/**
		 * @generated
		 */
		public void notifyChanged(Notification event) {
			if (event.getFeature() == UMLPackage.eINSTANCE.getDependency_Supplier()) {
				refreshDiagram();
				return;
			}
		}
	}

	/**
	 * @generated
	 */
	protected void addSemanticListeners() {
		super.addSemanticListeners();
		for (IUpdaterNodeDescriptor next : getPackage_2006ContainedLinks()) {
			EObject nextLink = next.getModelElement();
			if (nextLink == null) {
				continue;
			}
			switch (next.getVisualID()) {
			case DependencyEditPart.VISUAL_ID:
				getLinkTargetListener().addReferenceListener(nextLink, UMLPackage.eINSTANCE.getDependency_Supplier());
				break;

			default:
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	private List<IUpdaterLinkDescriptor> getPackage_2006ContainedLinks() {
		return UMLDiagramUpdater.getPackage_2006ContainedLinks(getNotationView());
	}

	/**
	 * @generated
	 */
	protected void removeSemanticListeners() {
		super.removeSemanticListeners();
		getLinkTargetListener().dispose();
	}

	/**
	 * @generated
	 */
	private void handleTypeLinkModification(Notification event) {
		if (event.getFeature() == UMLPackage.eINSTANCE.getPackage_PackagedElement()) {
			switch (event.getEventType()) {
			case Notification.ADD: {
				Object link = event.getNewValue();
				if (link instanceof Dependency) {
					getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
				}
				if (link instanceof Dependency) {
					refreshDiagram();
				}
				break;
			}
			case Notification.REMOVE: {
				Object link = event.getOldValue();
				if (link instanceof Dependency) {
					getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
				}
				if (link instanceof Dependency) {
					refreshDiagram();
				}
				break;
			}
			case Notification.ADD_MANY: {
				List<?> links = (List<?>) event.getNewValue();
				for (Object link : links) {
					if (link instanceof Dependency) {
						getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
					}
				}
				for (Object link : links) {
					if (link instanceof Dependency) {
						refreshDiagram();
						break;
					}
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				List<?> links = (List<?>) event.getOldValue();
				for (Object link : links) {
					if (link instanceof Dependency) {
						getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getDependency_Supplier());
					}
				}
				for (Object link : links) {
					if (link instanceof Dependency) {
						refreshDiagram();
						break;
					}
				}
				break;
			}
			}
		}
	}

	/**
	 * @generated
	 */
	public void refreshDiagram() {
		UMLDiagramUpdateCommand.performCanonicalUpdate(getDiagramView().getElement());
	}

	/**
	 * @generated
	 */
	public class PackageFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private Label fFigurePackageFigure_name;

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

			fFigurePackageFigure_name = new Label();
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
		public Label getFigurePackageFigure_name() {
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

	}

}
