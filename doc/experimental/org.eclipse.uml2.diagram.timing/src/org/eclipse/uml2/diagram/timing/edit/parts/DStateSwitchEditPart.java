package org.eclipse.uml2.diagram.timing.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITreeBranchEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.swt.graphics.Color;
import org.eclipse.uml2.diagram.timing.draw2d.SwitchShape;
import org.eclipse.uml2.diagram.timing.edit.policies.DStateSwitchItemSemanticEditPolicy;

/**
 * @generated
 */

public class DStateSwitchEditPart extends ConnectionNodeEditPart implements ITreeBranchEditPart {
	@Override
	protected void setForegroundColor(Color color) {
//		ignore -- we know better
//		super.setForegroundColor(color);
	}

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4001;

	/**
	 * @generated
	 */
	public DStateSwitchEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DStateSwitchItemSemanticEditPolicy());
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
		return new StateSwitchLinkFigure();
	}

	/**
	 * @generated
	 */
	public StateSwitchLinkFigure getPrimaryShape() {
		return (StateSwitchLinkFigure) getFigure();
	}

	/**
	 * @generated
	 */
	public class StateSwitchLinkFigure extends SwitchShape {

		/**
		 * @generated
		 */
		public StateSwitchLinkFigure() {

			this.setLineWidth(10);

			this.setForegroundColor(ColorConstants.red);
			this.setBackgroundColor(ColorConstants.yellow);
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

	}

}
