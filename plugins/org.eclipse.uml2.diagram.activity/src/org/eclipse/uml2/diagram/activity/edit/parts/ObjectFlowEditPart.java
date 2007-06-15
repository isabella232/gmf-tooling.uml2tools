package org.eclipse.uml2.diagram.activity.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.PolylineDecoration;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.draw2d.geometry.PointList;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.policies.ObjectFlowItemSemanticEditPolicy;

/**
 * @generated
 */
public class ObjectFlowEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4002;

	/**
	 * @generated
	 */
	public ObjectFlowEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new ObjectFlowItemSemanticEditPolicy());
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
		return new ActivityEdgeConnection();
	}

	/**
	 * @generated
	 */
	public ActivityEdgeConnection getPrimaryShape() {
		return (ActivityEdgeConnection) getFigure();
	}

	/**
	 * @generated
	 */
	public class ActivityEdgeConnection extends PolylineConnectionEx {

		/**
		 * @generated
		 */
		public ActivityEdgeConnection() {
			this.setForegroundColor(ColorConstants.black);

			createContents();
			setTargetDecoration(createTargetDecoration());
		}

		/**
		 * @generated
		 */
		private void createContents() {

			PolylineDecoration aux_ActivityEdgeConnection_Arrow0 = new PolylineDecoration();
			aux_ActivityEdgeConnection_Arrow0.addPoint(new Point(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-1)));
			aux_ActivityEdgeConnection_Arrow0.addPoint(new Point(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0)));
			aux_ActivityEdgeConnection_Arrow0.addPoint(new Point(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(1)));

			this.add(aux_ActivityEdgeConnection_Arrow0);

		}

		/**
		 * @generated
		 */
		private RotatableDecoration createTargetDecoration() {
			PolylineDecoration df = new PolylineDecoration();
			PointList pl = new PointList();
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(-1));
			pl.addPoint(getMapMode().DPtoLP(0), getMapMode().DPtoLP(0));
			pl.addPoint(getMapMode().DPtoLP(-2), getMapMode().DPtoLP(1));
			df.setTemplate(pl);
			df.setScale(getMapMode().DPtoLP(7), getMapMode().DPtoLP(3));
			return df;
		}

	}

}
