package org.eclipse.uml2.diagram.statemachine.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.geometry.Insets;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;

import org.eclipse.uml2.diagram.common.editpolicies.LaneLayoutEditPolicy;

import org.eclipse.uml2.diagram.common.draw2d.LaneLayout;
import org.eclipse.uml2.diagram.statemachine.edit.policies.StateMachineCanonicalEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.StateMachineItemSemanticEditPolicy;

/**
 * @generated
 */
public class StateMachineEditPart extends DiagramEditPart {

	/**
	 * @NOT-GENERATED
	 */
	protected IFigure createFigure() {
		IFigure figure = super.createFigure();
		figure.setLayoutManager(new LaneLayout(new Insets(10, 10, 10, 10)));
		return figure;
	}

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
	public StateMachineEditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new StateMachineItemSemanticEditPolicy());
		installEditPolicy(EditPolicyRoles.CANONICAL_ROLE, new StateMachineCanonicalEditPolicy());

		installEditPolicy("LayoutEditPolicy", new LaneLayoutEditPolicy()); //$NON-NLS-1$
	}
}
