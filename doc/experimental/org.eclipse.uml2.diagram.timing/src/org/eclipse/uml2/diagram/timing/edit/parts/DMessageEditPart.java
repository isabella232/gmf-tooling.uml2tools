package org.eclipse.uml2.diagram.timing.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.uml2.diagram.timing.draw2d.MessageDestinationDecoration;
import org.eclipse.uml2.diagram.timing.edit.policies.DMessageItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.timing.model.timingd.DMessage;

/**
 * @generated
 */

public class DMessageEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public DMessageEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DMessageItemSemanticEditPolicy());
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
		MessageFigure result = (MessageFigure) createConnectionFigureGen();
		refreshDecorations(result);
		return result;
	}

	/**
	 * @generated
	 */
	public MessageFigure getPrimaryShape() {
		return (MessageFigure) getFigure();
	}

	/**
	 * @NOT-GENERATED
	 */
	private void refreshDecorations(MessageFigure linkFigure) {
		DMessage dMessage = (DMessage) resolveSemanticElement();
		IPreferenceStore store = (IPreferenceStore) getDiagramPreferencesHint().getPreferenceStore();
		linkFigure.getTargetDecorationImpl().update(dMessage, store);
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

		/**
		 * @NOT-GENERATED
		 */
		private MessageDestinationDecoration getTargetDecorationImpl() {
			return (MessageDestinationDecoration) getTargetDecoration();
		}

	}

}
