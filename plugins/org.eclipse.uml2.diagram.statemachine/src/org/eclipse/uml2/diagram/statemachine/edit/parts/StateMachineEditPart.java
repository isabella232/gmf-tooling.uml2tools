package org.eclipse.uml2.diagram.statemachine.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.gmf.runtime.diagram.ui.editparts.DiagramEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.draw2d.CoveredFreeformLayer;
import org.eclipse.uml2.diagram.common.editpolicies.LaneLayoutEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.StateMachineCanonicalEditPolicy;
import org.eclipse.uml2.diagram.statemachine.edit.policies.StateMachineItemSemanticEditPolicy;

/**
 * @generated
 */
public class StateMachineEditPart extends DiagramEditPart {

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
	 * @NOT-GENERATED
	 */
	@Override
	protected IFigure createFigure() {
		CoveredFreeformLayer figure = new CoveredFreeformLayer();
		figure.setMarginRatio(0.045);
		return figure;
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
