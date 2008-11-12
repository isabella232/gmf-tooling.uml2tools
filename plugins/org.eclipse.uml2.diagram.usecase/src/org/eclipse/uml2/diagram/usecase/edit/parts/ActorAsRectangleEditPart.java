package org.eclipse.uml2.diagram.usecase.edit.parts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.ToolbarLayout;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.core.listener.DiagramEventBroker;
import org.eclipse.gmf.runtime.diagram.core.listener.NotificationListener;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.CanonicalEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.ConstrainedToolbarLayoutEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.common.draw2d.CenterLayout;
import org.eclipse.uml2.diagram.common.editparts.PrimaryShapeEditPart;
import org.eclipse.uml2.diagram.common.editpolicies.UpdateDescriptionEditPolicy;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterLinkDescriptor;
import org.eclipse.uml2.diagram.common.genapi.IUpdaterNodeDescriptor;
import org.eclipse.uml2.diagram.usecase.edit.policies.ActorAsRectangleItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.usecase.edit.policies.UMLTextSelectionEditPolicy;
import org.eclipse.uml2.diagram.usecase.part.UMLDiagramUpdateCommand;
import org.eclipse.uml2.diagram.usecase.part.UMLDiagramUpdater;
import org.eclipse.uml2.diagram.usecase.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.usecase.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Generalization;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActorAsRectangleEditPart extends ShapeNodeEditPart implements PrimaryShapeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 2005;

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
	public ActorAsRectangleEditPart(View view) {
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
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ActorAsRectangleItemSemanticEditPolicy());
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
		ActorAsRectangleFigure figure = new ActorAsRectangleFigure();
		return primaryShape = figure;
	}

	/**
	 * @generated
	 */
	public ActorAsRectangleFigure getPrimaryShape() {
		return (ActorAsRectangleFigure) primaryShape;
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof ActorName2EditPart) {
			((ActorName2EditPart) childEditPart).setLabel(getPrimaryShape().getActorAsRectangleFigure_name());
			return true;
		}
		if (childEditPart instanceof ActorStereoEditPart) {
			((ActorStereoEditPart) childEditPart).setLabel(getPrimaryShape().getActorAsRectangleFigure_fixed_actor());
			return true;
		}
		return false;
	}

	/**
	 * @generated
	 */
	protected boolean removeFixedChild(EditPart childEditPart) {

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
		return getChildBySemanticHint(UMLVisualIDRegistry.getType(ActorName2EditPart.VISUAL_ID));
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSource() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UMLElementTypes.Generalization_4003);
		types.add(UMLElementTypes.Association_4004);
		types.add(UMLElementTypes.Dependency_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnTarget() {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		types.add(UMLElementTypes.Generalization_4003);
		types.add(UMLElementTypes.Association_4004);
		types.add(UMLElementTypes.ConstraintConstrainedElement_4005);
		types.add(UMLElementTypes.Dependency_4006);
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMARelTypesOnSourceAndTarget(IGraphicalEditPart targetEditPart) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (targetEditPart instanceof ActorEditPart) {
			types.add(UMLElementTypes.Generalization_4003);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.usecase.edit.parts.ActorAsRectangleEditPart) {
			types.add(UMLElementTypes.Generalization_4003);
		}
		if (targetEditPart instanceof UseCaseEditPart) {
			types.add(UMLElementTypes.Generalization_4003);
		}
		if (targetEditPart instanceof UseCaseAsClassEditPart) {
			types.add(UMLElementTypes.Generalization_4003);
		}
		if (targetEditPart instanceof SubjectEditPart) {
			types.add(UMLElementTypes.Generalization_4003);
		}
		if (targetEditPart instanceof InnerUseCaseEditPart) {
			types.add(UMLElementTypes.Generalization_4003);
		}
		if (targetEditPart instanceof ActorInPackageEditPart) {
			types.add(UMLElementTypes.Generalization_4003);
		}
		if (targetEditPart instanceof UseCaseinPackageEditPart) {
			types.add(UMLElementTypes.Generalization_4003);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(UMLElementTypes.Association_4004);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.usecase.edit.parts.ActorAsRectangleEditPart) {
			types.add(UMLElementTypes.Association_4004);
		}
		if (targetEditPart instanceof UseCaseEditPart) {
			types.add(UMLElementTypes.Association_4004);
		}
		if (targetEditPart instanceof UseCaseAsClassEditPart) {
			types.add(UMLElementTypes.Association_4004);
		}
		if (targetEditPart instanceof SubjectEditPart) {
			types.add(UMLElementTypes.Association_4004);
		}
		if (targetEditPart instanceof InnerUseCaseEditPart) {
			types.add(UMLElementTypes.Association_4004);
		}
		if (targetEditPart instanceof ActorInPackageEditPart) {
			types.add(UMLElementTypes.Association_4004);
		}
		if (targetEditPart instanceof UseCaseinPackageEditPart) {
			types.add(UMLElementTypes.Association_4004);
		}
		if (targetEditPart instanceof DiagramHeaderEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof ActorEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof org.eclipse.uml2.diagram.usecase.edit.parts.ActorAsRectangleEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof UseCaseEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof UseCaseAsClassEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof SubjectEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof NestedPackageEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof ConstraintEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof InnerUseCaseEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof ActorInPackageEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		if (targetEditPart instanceof UseCaseinPackageEditPart) {
			types.add(UMLElementTypes.Dependency_4006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForSource(IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.Actor_2002);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.Actor_2005);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.UseCase_2003);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.UseCase_2004);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.Component_2006);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.UseCase_3004);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.Actor_3005);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.UseCase_3006);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.Actor_2002);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.Actor_2005);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.UseCase_2003);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.UseCase_2004);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.Component_2006);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.UseCase_3004);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.Actor_3005);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.UseCase_3006);
		}
		if (relationshipType == UMLElementTypes.ConstraintConstrainedElement_4005) {
			types.add(UMLElementTypes.Constraint_2008);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Package_2001);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Actor_2002);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Actor_2005);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.UseCase_2003);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.UseCase_2004);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Component_2006);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Package_2007);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Constraint_2008);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.UseCase_3004);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Actor_3005);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.UseCase_3006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	public List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/getMATypesForTarget(IElementType relationshipType) {
		List/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/types = new ArrayList/*<org.eclipse.gmf.runtime.emf.type.core.IElementType>*/();
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.Actor_2002);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.Actor_2005);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.UseCase_2003);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.UseCase_2004);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.Component_2006);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.UseCase_3004);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.Actor_3005);
		}
		if (relationshipType == UMLElementTypes.Generalization_4003) {
			types.add(UMLElementTypes.UseCase_3006);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.Actor_2002);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.Actor_2005);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.UseCase_2003);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.UseCase_2004);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.Component_2006);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.UseCase_3004);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.Actor_3005);
		}
		if (relationshipType == UMLElementTypes.Association_4004) {
			types.add(UMLElementTypes.UseCase_3006);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Package_2001);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Actor_2002);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Actor_2005);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.UseCase_2003);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.UseCase_2004);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Component_2006);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Package_2007);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Constraint_2008);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.UseCase_3004);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.Actor_3005);
		}
		if (relationshipType == UMLElementTypes.Dependency_4006) {
			types.add(UMLElementTypes.UseCase_3006);
		}
		return types;
	}

	/**
	 * @generated
	 */
	protected void handleNotificationEvent(Notification event) {
		if (event.getNotifier() == getModel() && EcorePackage.eINSTANCE.getEModelElement_EAnnotations().equals(event.getFeature())) {
			handleMajorSemanticChange();
		} else {
			super.handleNotificationEvent(event);
		}
		if (isCanonicalEnabled()) {
			handleTypeLinkModification(event);
		}
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
			if (event.getFeature() == UMLPackage.eINSTANCE.getGeneralization_General()) {
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
		for (IUpdaterNodeDescriptor next : getActor_2005ContainedLinks()) {
			EObject nextLink = next.getModelElement();
			if (nextLink == null) {
				continue;
			}
			switch (next.getVisualID()) {
			case GeneralizationEditPart.VISUAL_ID:
				getLinkTargetListener().addReferenceListener(nextLink, UMLPackage.eINSTANCE.getGeneralization_General());
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
	private List<IUpdaterLinkDescriptor> getActor_2005ContainedLinks() {
		return UMLDiagramUpdater.getActor_2005ContainedLinks(getNotationView());
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
		if (event.getFeature() == UMLPackage.eINSTANCE.getClassifier_Generalization()) {
			switch (event.getEventType()) {
			case Notification.ADD: {
				Object link = event.getNewValue();
				if (link instanceof Generalization) {
					getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getGeneralization_General());
				}
				if (link instanceof Generalization) {
					refreshDiagram();
				}
				break;
			}
			case Notification.REMOVE: {
				Object link = event.getOldValue();
				if (link instanceof Generalization) {
					getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getGeneralization_General());
				}
				if (link instanceof Generalization) {
					refreshDiagram();
				}
				break;
			}
			case Notification.ADD_MANY: {
				List<?> links = (List<?>) event.getNewValue();
				for (Object link : links) {
					if (link instanceof Generalization) {
						getLinkTargetListener().addReferenceListener((EObject) link, UMLPackage.eINSTANCE.getGeneralization_General());
					}
				}
				for (Object link : links) {
					if (link instanceof Generalization) {
						refreshDiagram();
						break;
					}
				}
				break;
			}
			case Notification.REMOVE_MANY: {
				List<?> links = (List<?>) event.getOldValue();
				for (Object link : links) {
					if (link instanceof Generalization) {
						getLinkTargetListener().removeReferenceListener((EObject) link, UMLPackage.eINSTANCE.getGeneralization_General());
					}
				}
				for (Object link : links) {
					if (link instanceof Generalization) {
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
	private boolean isCanonicalEnabled() {
		//this particular edit part may not have editpolicy at all, 
		//but its compartments still may have it
		EObject semantic = resolveSemanticElement();
		if (semantic == null) {
			return false;
		}
		for (Object next : CanonicalEditPolicy.getRegisteredEditPolicies(semantic)) {
			if (next instanceof CanonicalEditPolicy) {
				CanonicalEditPolicy nextPolicy = (CanonicalEditPolicy) next;
				if (nextPolicy.isEnabled()) {
					return true;
				}
			}
		}
		return false;
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
	public class ActorAsRectangleFigure extends RectangleFigure {

		/**
		 * @generated
		 */
		private Label fActorAsRectangleFigure_name;

		/**
		 * @generated
		 */
		private Label fActorAsRectangleFigure_fixed_actor;

		/**
		 * @generated
		 */
		public ActorAsRectangleFigure() {

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

			fActorAsRectangleFigure_fixed_actor = new Label();
			fActorAsRectangleFigure_fixed_actor.setText("");

			this.add(fActorAsRectangleFigure_fixed_actor);

			RectangleFigure actorAsRectangleFigure_NameContainer0 = new RectangleFigure();
			actorAsRectangleFigure_NameContainer0.setFill(false);
			actorAsRectangleFigure_NameContainer0.setOutline(false);

			this.add(actorAsRectangleFigure_NameContainer0);

			CenterLayout layoutActorAsRectangleFigure_NameContainer0 = new CenterLayout();

			actorAsRectangleFigure_NameContainer0.setLayoutManager(layoutActorAsRectangleFigure_NameContainer0);

			fActorAsRectangleFigure_name = new Label();
			fActorAsRectangleFigure_name.setText("");

			actorAsRectangleFigure_NameContainer0.add(fActorAsRectangleFigure_name);

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
		public Label getActorAsRectangleFigure_name() {
			return fActorAsRectangleFigure_name;
		}

		/**
		 * @generated
		 */
		public Label getActorAsRectangleFigure_fixed_actor() {
			return fActorAsRectangleFigure_fixed_actor;
		}

	}

}
