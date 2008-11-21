package org.eclipse.uml2.diagram.sequence.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.uml2.diagram.sequence.draw2d.MessageDestinationDecoration;
import org.eclipse.uml2.diagram.sequence.edit.policies.MessageItemSemanticEditPolicy;
import org.eclipse.uml2.uml.Message;

/**
 * @generated
 */
public class MessageEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public MessageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new MessageItemSemanticEditPolicy());
	}

	/**
	 * Creates figure for this edit part.
	 * 
	 * Body of this method does not depend on settings in generation model
	 * so you may safely remove <i>generated</i> tag and modify it.
	 * 
	 * @generated
	 */

	protected Connection createConnectionFigureGen() {
		return new MessageFigure();
	}

	/**
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {
		Connection result = createConnectionFigureGen();
		refreshDecorations((MessageFigure) result);
		return result;
	}

	/**
	 * @NOT-GENERATED
	 */
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (notification.getNotifier() instanceof Message) {
			refreshDecorations((MessageFigure) getConnectionFigure());
			if (getSource() instanceof BehaviorExecutionSpecificationEditPart) {
				((BehaviorExecutionSpecificationEditPart) getSource()).refreshVisualEffectOnMessageChange();
			}
			if (getTarget() instanceof BehaviorExecutionSpecificationEditPart) {
				((BehaviorExecutionSpecificationEditPart) getTarget()).refreshVisualEffectOnMessageChange();
			}
		}
	}

	/**
	 * @NOT-GENERATED
	 */
	private void refreshDecorations(MessageFigure linkFigure) {
		Message message = (Message) resolveSemanticElement();
		if (message == null) {
			return;
		}

		IPreferenceStore store = (IPreferenceStore) getDiagramPreferencesHint().getPreferenceStore();
		linkFigure.getTargetDecorationImpl().update(message, store);
	}

	/**
	 * @generated
	 */
	public MessageFigure getPrimaryShape() {
		return (MessageFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class MessageFigure extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public MessageFigure() {
			this.setForegroundColor(ColorConstants.black);

			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			MessageDestinationDecoration df = new MessageDestinationDecoration();

			return df;
		}

		public MessageDestinationDecoration getTargetDecorationImpl() {
			return (MessageDestinationDecoration) getTargetDecoration();
		}

	}

}
