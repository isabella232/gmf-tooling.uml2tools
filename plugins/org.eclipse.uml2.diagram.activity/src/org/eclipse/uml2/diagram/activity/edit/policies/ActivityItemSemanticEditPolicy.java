package org.eclipse.uml2.diagram.activity.edit.policies;

import java.util.Iterator;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.CompoundCommand;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.activity.edit.commands.ActivityParameterNodeCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectNodeSelectionCreateCommand;
import org.eclipse.uml2.diagram.activity.edit.commands.ObjectNodeSelectionReorientCommand;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventAction2EditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AcceptEventActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityParameterNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivityPartitionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ActivitySubverticesEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.AddStructuralFeatureValueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallBehaviorActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CallOperationActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CentralBufferNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.CreateObjectActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DataStoreNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.DecisionNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.FlowFinalNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ForkNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.InitialNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.JoinNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.MergeNodeEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.ObjectNodeSelectionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.OpaqueBehaviorEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.PinEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.SendSignalActionEditPart;
import org.eclipse.uml2.diagram.activity.edit.parts.StructuredActivityNodeEditPart;
import org.eclipse.uml2.diagram.activity.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.activity.providers.UMLElementTypes;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */
public class ActivityItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.ActivityParameterNode_3052 == req.getElementType()) {
			if (req.getContainmentFeature() == null) {
				req.setContainmentFeature(UMLPackage.eINSTANCE.getActivity_Node());
			}
			return getGEFWrapper(new ActivityParameterNodeCreateCommand(req));
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
		View view = (View) getHost().getModel();
		if (view.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
			req.setElementToDestroy(view);
		}
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
			switch (UMLVisualIDRegistry.getVisualID(node)) {
			case ActivityParameterNodeEditPart.VISUAL_ID:
				cmd.add(getDestroyElementCommand(node));
				break;
			case ActivitySubverticesEditPart.VISUAL_ID:
				for (Iterator cit = node.getChildren().iterator(); cit.hasNext();) {
					Node cnode = (Node) cit.next();
					switch (UMLVisualIDRegistry.getVisualID(cnode)) {
					case AcceptEventActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case AcceptEventAction2EditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case ActivityFinalNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case DecisionNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case MergeNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case InitialNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case DataStoreNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case CentralBufferNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case OpaqueActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case FlowFinalNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case ForkNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case JoinNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case PinEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case CreateObjectActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case AddStructuralFeatureValueActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case CallBehaviorActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case CallOperationActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case StructuredActivityNodeEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case OpaqueBehaviorEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case SendSignalActionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					case ActivityPartitionEditPart.VISUAL_ID:
						cmd.add(getDestroyElementCommand(cnode));
						break;
					}
				}
				break;
			}
		}
	}

	/**
	 * @generated
	 */
	protected Command getCreateRelationshipCommand(CreateRelationshipRequest req) {
		Command command = req.getTarget() == null ? getStartCreateRelationshipCommand(req) : getCompleteCreateRelationshipCommand(req);
		return command != null ? command : super.getCreateRelationshipCommand(req);
	}

	/**
	 * @generated
	 */
	protected Command getStartCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ObjectNodeSelection_4004 == req.getElementType()) {
			return null;
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.ObjectNodeSelection_4004 == req.getElementType()) {
			return getGEFWrapper(new ObjectNodeSelectionCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EReference based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientReferenceRelationshipCommand(ReorientReferenceRelationshipRequest req) {
		switch (getVisualID(req)) {
		case ObjectNodeSelectionEditPart.VISUAL_ID:
			return getGEFWrapper(new ObjectNodeSelectionReorientCommand(req));
		}
		return super.getReorientReferenceRelationshipCommand(req);
	}

}
