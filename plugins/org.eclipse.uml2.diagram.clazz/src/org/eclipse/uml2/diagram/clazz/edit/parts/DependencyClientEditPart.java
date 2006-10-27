package org.eclipse.uml2.diagram.clazz.edit.parts;

import org.eclipse.draw2d.Connection;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.clazz.edit.policies.DependencyClientItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.clazz.edit.policies.UMLReferenceConnectionEditPolicy;

/**
 * @generated
 */
public class DependencyClientEditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4007;

	/**
	 * @generated
	 */
	public DependencyClientEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicy.CONNECTION_ROLE, new UMLReferenceConnectionEditPolicy());
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new DependencyClientItemSemanticEditPolicy());

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
		return new Dependency_NoArrow_Polyline();
	}

	/**
	 * @generated
	 */
	public class Dependency_NoArrow_Polyline extends org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx {

		/**
		 * @generated
		 */
		public Dependency_NoArrow_Polyline() {

			this.setLineStyle(org.eclipse.draw2d.Graphics.LINE_DASH);
			this.setForegroundColor(org.eclipse.draw2d.ColorConstants.lightGray);
		}

	}

}
