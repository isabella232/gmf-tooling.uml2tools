package org.eclipse.uml2.diagram.statemachine.edit.parts;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.GraphicalEditPart;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.handles.MoveHandle;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.NonResizableLabelEditPolicy;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.editpolicies.CreationEditPolicyWithCustomReparent;
import org.eclipse.uml2.diagram.common.editpolicies.XYLayoutEditPolicyWithMovableLabels;
import org.eclipse.uml2.diagram.statemachine.edit.policies.PackageCanonicalEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.PackageItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.statemachine.part.UMLDiagramUpdateCommand;
import org.eclipse.uml2.diagram.statemachine.part.UMLVisualIDRegistry;

/**
 * @generated
 */

public class PackageEditPart extends DiagramEditPart {

	/**
	 * @generated
	 */
	public final static String MODEL_ID = "UMLStateMachine"; //$NON-NLS-1$

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
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);

		// FIXME if #335955 in GMF is fixed. This is a Workaround for the case that there 
		// exists an Edge in the semantic model, but not yet in the notation
		// model. So we need to render the Edge on the fly.
		// Template: /dynamic-templates/codegen/aspects/diagram/editparts/DiagramEditPart.xpt
		if (notification.getEventType() == Notification.ADD) {
			Object newValue = notification.getNewValue();
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
