package org.eclipse.uml2.diagram.usecase.edit.parts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.commands.ICommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.DiagramDragDropEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableLabelEditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewRequest;
import org.eclipse.gmf.runtime.diagram.ui.requests.DropObjectsRequest;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.ui.PlatformUI;
import org.eclipse.uml2.diagram.common.editpolicies.CreationEditPolicyWithCustomReparent;
import org.eclipse.uml2.diagram.common.editpolicies.XYLayoutEditPolicyWithMovableLabels;
import org.eclipse.uml2.diagram.usecase.edit.commands.UMLCreateShortcutDecorationsCommand;
import org.eclipse.uml2.diagram.usecase.edit.policies.PackageCanonicalEditPolicy;
import org.eclipse.uml2.diagram.usecase.edit.policies.PackageItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.usecase.part.UMLDiagramEditor;
import org.eclipse.uml2.diagram.usecase.part.UMLDiagramUpdateCommand;
import org.eclipse.uml2.diagram.usecase.part.UMLVisualIDRegistry;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class PackageEditPart extends DiagramEditPart {

	/**
	* @generated
	*/
	public final static String MODEL_ID = "UMLUseCase"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 1000;

	/**
	* @generated
	*/
	public PackageEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new PackageItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new PackageCanonicalEditPolicy());
		installEditPolicy(EditPolicyRoles.DRAG_DROP_ROLE, new DiagramDragDropEditPolicy() {

			public Command getDropObjectsCommand(DropObjectsRequest dropRequest) {
				ArrayList<CreateViewRequest.ViewDescriptor> viewDescriptors = new ArrayList<CreateViewRequest.ViewDescriptor>();
				for (Iterator<?> it = dropRequest.getObjects().iterator(); it.hasNext();) {
					Object nextObject = it.next();
					if (false == nextObject instanceof EObject) {
						continue;
					}
					viewDescriptors.add(new CreateViewRequest.ViewDescriptor(new EObjectAdapter((EObject) nextObject), Node.class, null, getDiagramPreferencesHint()));
				}
				return createShortcutsCommand(dropRequest, viewDescriptors);
			}

			private Command createShortcutsCommand(DropObjectsRequest dropRequest, List<CreateViewRequest.ViewDescriptor> viewDescriptors) {
				Command command = createViewsAndArrangeCommand(dropRequest, viewDescriptors);
				if (command != null) {
					return command.chain(new ICommandProxy(new UMLCreateShortcutDecorationsCommand(getEditingDomain(), (View) getModel(), viewDescriptors)));
				}
				return null;
			}
		});
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.POPUPBAR_ROLE);

		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(UMLVisualIDRegistry.TYPED_ADAPTER));
		installEditPolicy(EditPolicy.LAYOUT_ROLE, new XYLayoutEditPolicyWithMovableLabels()); //replace with U2T specific version
	}

	/**
	* @generated
	*/
	/*package-local*/static class NodeLabelDragPolicy extends NonResizableEditPolicy {

		/**
		* @generated
		*/
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle h = new MoveHandle((GraphicalEditPart) getHost());
			h.setBorder(null);
			return Collections.singletonList(h);
		}

		/**
		* @generated
		*/
		public Command getCommand(Request request) {
			return null;
		}

		/**
		* @generated
		*/
		public boolean understandsRequest(Request request) {
			return false;
		}
	}

	/**
	* @generated
	*/
	/*package-local*/static class LinkLabelDragPolicy extends NonResizableLabelEditPolicy {

		/**
		* @generated
		*/
		@SuppressWarnings("rawtypes")
		protected List createSelectionHandles() {
			MoveHandle mh = new MoveHandle((GraphicalEditPart) getHost());
			mh.setBorder(null);
			return Collections.singletonList(mh);
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
	protected void addSemanticListeners() {
		super.addSemanticListeners();
		Package pakkage = (Package) resolveSemanticElement();
		addListenerFilter("SemanticModel", this, pakkage, UMLPackage.eINSTANCE.getPackage_ProfileApplication());
	}

	/**
	* @generated
	*/
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);

		if (UMLPackage.eINSTANCE.getPackage_ProfileApplication().equals(notification.getFeature())) {
			UMLDiagramEditor editor = (UMLDiagramEditor) PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
			editor.refreshPalette();
		}

		// FIXME if #335955 in GMF is fixed. This is a Workaround for the case that there 
		// exists an Edge in the semantic model, but not yet in the notation
		// model. So we need to render the Edge on the fly.
		// Template: /dynamic-templates/codegen/aspects/diagram/editparts/DiagramEditPart.xpt
		if (notification.getEventType() == Notification.ADD) {
			java.lang.Object newValue = notification.getNewValue();
			if (newValue instanceof Edge) {
				Map<View, EditPart> registry = getViewer().getEditPartRegistry();
				Edge edge = (Edge) newValue;
				// if the connection edit part already exists, just do nothing and return
				if (registry.get(edge) != null) {
					return;
				}
				EditPart sourceEditPart = registry.get(edge.getSource());
				EditPart targetEditPart = registry.get(edge.getTarget());
				// trigger an explicit refresh to create the connection edit part an draw the link
				if (sourceEditPart != null && targetEditPart != null) {
					sourceEditPart.refresh();
					targetEditPart.refresh();
				}
			}
		}
	}

}