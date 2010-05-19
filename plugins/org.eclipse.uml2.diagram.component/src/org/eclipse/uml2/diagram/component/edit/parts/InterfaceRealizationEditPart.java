package org.eclipse.uml2.diagram.component.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.editpolicies.U2TGraphicalNodeEditPolicy;
import org.eclipse.uml2.diagram.common.links.RefreshComplementaryLinksHelper;
import org.eclipse.uml2.diagram.component.edit.policies.InterfaceRealizationItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.component.links.DiagramLinkInfoProvider;

/**
 * @generated
 */
public class InterfaceRealizationEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public InterfaceRealizationEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new InterfaceRealizationItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.GRAPHICAL_NODE_ROLE, new U2TGraphicalNodeEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigure() {
		return new PolylineConnectionEx();
	}

	/**
	 * @generated
	 */
	public PolylineConnectionEx getPrimaryShape() {
		return (PolylineConnectionEx) getFigure();
	}

	/**
	 * NOT generated
	 */
	@Override
	protected void handleNotificationEvent(Notification notification) {
		RefreshComplementaryLinksHelper.getInstance().handleNotification(this, notification, DiagramLinkInfoProvider.getInstance());

		super.handleNotificationEvent(notification);
	}

}
