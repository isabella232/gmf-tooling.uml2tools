package org.eclipse.uml2.diagram.clazz.edit.parts;

import org.eclipse.draw2d.ColorConstants;
import org.eclipse.draw2d.Connection;
import org.eclipse.draw2d.RotatableDecoration;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.gef.EditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ConnectionNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.draw2d.ui.figures.PolylineConnectionEx;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.uml2.diagram.clazz.edit.policies.Property7ItemSemanticEditPolicy;
import org.eclipse.uml2.diagram.common.conventions.AssociationEndConvention;
import org.eclipse.uml2.diagram.common.draw2d.decoration.AssociationDecoration;
import org.eclipse.uml2.uml.Association;
import org.eclipse.uml2.uml.Property;

/**
 * @generated
 */
public class Property7EditPart extends ConnectionNodeEditPart {

	/**
	 * @generated
	 */
	public static final int VISUAL_ID = 4003;

	/**
	 * @generated
	 */
	public Property7EditPart(View view) {
		super(view);
	}

	/**
	 * @generated
	 */
	protected void createDefaultEditPolicies() {
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE, new Property7ItemSemanticEditPolicy());
	}

	/**
	 * @generated
	 */
	protected boolean addFixedChild(EditPart childEditPart) {
		return false;
	}

	/**
	 * @generated
	 */
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
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
		return new PolylineConnectionEx();
	}

	/**
	 * @generated NOT
	 */
	protected Connection createConnectionFigure() {
		Connection result = createConnectionFigureGen();
		refreshDecorations((AssociationLinkFigure) result);
		return result;
	}

	/**
	 * @generated
	 */
	public PolylineConnectionEx getPrimaryShape() {
		return (PolylineConnectionEx) getFigure();
	}

	/**
	 * @NOT-GENERATED
	 */
	protected void addSemanticListeners() {
		super.addSemanticListeners();
		Property end = (Property) resolveSemanticElement();
		addListenerFilter("SemanticModel", this, end);
		Property otherEnd = getOtherEnd(end);
		if (otherEnd != null) {
			addListenerFilter("SemanticModel", this, otherEnd);
		}
	}

	/**
	 * @NOT-GENERATED
	 */
	protected void handleNotificationEvent(Notification notification) {
		super.handleNotificationEvent(notification);
		if (notification.getNotifier() instanceof Property) {
			refreshDecorations((AssociationLinkFigure) getConnectionFigure());
		}
	}

	/**
	 * @NOT-GENERATED
	 */
	private void refreshDecorations(AssociationLinkFigure linkFigure) {
		Property currentEnd = (Property) resolveSemanticElement();
		Association association = currentEnd.getAssociation();
		Property otherEnd = getOtherEnd(currentEnd);
		if (otherEnd == null) {
			return;
		}
		IPreferenceStore store = (IPreferenceStore) getDiagramPreferencesHint().getPreferenceStore();
		linkFigure.getTargetDecorationImpl().update(association, currentEnd, otherEnd, store);
	}

	/**
	 * @NOT-GENERATED
	 */
	private Property getOtherEnd(Property end) {
		Association association = end.getAssociation();
		if (association == null || !association.isBinary()) {
			return null;
		}
		Property sourceEnd = AssociationEndConvention.getSourceEnd(association);
		return (end.equals(sourceEnd)) ? AssociationEndConvention.getTargetEnd(association) : sourceEnd;
	}

}
