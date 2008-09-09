package org.eclipse.uml2.diagram.timing.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.timing.edit.commands.DSegmentEndCreateCommand;
import org.eclipse.uml2.diagram.timing.edit.commands.DSegmentMiddlePointCreateCommand;
import org.eclipse.uml2.diagram.timing.edit.commands.DSegmentStartCreateCommand;
import org.eclipse.uml2.diagram.timing.edit.commands.DStateSwitchCreateCommand;
import org.eclipse.uml2.diagram.timing.edit.commands.DStateSwitchReorientCommand;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentEndEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentMiddlePointEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DSegmentStartEditPart;
import org.eclipse.uml2.diagram.timing.edit.parts.DStateSwitchEditPart;
import org.eclipse.uml2.diagram.timing.model.timingd.TimingDPackage;
import org.eclipse.uml2.diagram.timing.part.TimingDVisualIDRegistry;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;

/**
 * @generated
 */

public class DSegmentItemSemanticEditPolicy extends TimingDBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public DSegmentItemSemanticEditPolicy() {
		super(TimingDElementTypes.DSegment_3003);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (TimingDElementTypes.DSegmentMiddlePoint_3004 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TimingDPackage.eINSTANCE.getDSegment_MiddlePoints());
			}
			return getGEFWrapper(new DSegmentMiddlePointCreateCommand(req));
		}
		if (TimingDElementTypes.DSegmentStart_3005 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TimingDPackage.eINSTANCE.getDSegment_Start());
			}
			return getGEFWrapper(new DSegmentStartCreateCommand(req));
		}
		if (TimingDElementTypes.DSegmentEnd_3006 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(TimingDPackage.eINSTANCE.getDSegment_End());
			}
			return getGEFWrapper(new DSegmentEndCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		CompoundCommand cc = getDestroyEdgesCommand();
		addDestroyChildNodesCommand(cc);
		addDestroyShortcutsCommand(cc);
		cc.add(getGEFWrapper(new DestroyElementCommand(req)));
		return cc.unwrap();
	}

	/**
	 * @generated
	 */
	protected void addDestroyChildNodesCommand(CompoundCommand cmd) {
		View view = (View) getHost().getModel();
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation != null) {
			return;
		}
		for (Iterator it = view.getChildren().iterator(); it.hasNext();) {
			Node node = (Node) it.next();
			switch (TimingDVisualIDRegistry.getVisualID(node)) {
			case DSegmentMiddlePointEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case DSegmentStartEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case DSegmentEndEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			}
		}
	}

}
