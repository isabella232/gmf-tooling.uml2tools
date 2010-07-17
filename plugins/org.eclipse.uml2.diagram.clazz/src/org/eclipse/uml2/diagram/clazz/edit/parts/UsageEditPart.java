package org.eclipse.uml2.diagram.clazz.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.conventions.InterfaceNotationConvention;
import org.eclipse.uml2.diagram.clazz.edit.policies.UsageItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.links.DiagramLinkInfoProvider;
import org.eclipse.uml2.diagram.common.draw2d.RequiredInterfaceDecoration;
import org.eclipse.uml2.diagram.common.links.RefreshComplementaryLinksHelper;

/**
 * @generated
 */
public class UsageEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4013;

	/**
	 * @generated
	 */
	public UsageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new UsageItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {
		if (InterfaceNotationConvention.needsAlternativeNotation(this)) {
			return new ConnectionWithArrowPolylineFigure(getMapMode());
		}
		return new RequiredInterfaceConnectionFigure();
	}

	/**
	 * @generated
	 */
	public RequiredInterfaceConnectionFigure getPrimaryShape() {
		return (RequiredInterfaceConnectionFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class RequiredInterfaceConnectionFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public RequiredInterfaceConnectionFigure() {
			this.setLineWidth(1);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			RequiredInterfaceDecoration df = new RequiredInterfaceDecoration();

			df.setRadius(10);

			return df;
		}

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
