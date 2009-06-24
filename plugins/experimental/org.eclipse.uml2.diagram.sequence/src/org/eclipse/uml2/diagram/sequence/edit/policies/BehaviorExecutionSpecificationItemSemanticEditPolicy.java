package org.eclipse.uml2.diagram.sequence.edit.policies;

import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.sequence.edit.commands.BehaviorExecutionSpecificationCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.MessageCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.MessageReorientCommand;
import org.eclipse.uml2.diagram.sequence.edit.parts.BehaviorExecutionSpecificationEditPart;
import org.eclipse.uml2.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.uml2.diagram.sequence.model.SDModelAccess;
import org.eclipse.uml2.diagram.sequence.model.builder.SDModelHelper;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDEntity;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.part.UMLVisualIDRegistry;
import org.eclipse.uml2.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.uml2.uml.BehaviorExecutionSpecification;
import org.eclipse.uml2.uml.Element;

/**
 * @generated
 */

public class BehaviorExecutionSpecificationItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public BehaviorExecutionSpecificationItemSemanticEditPolicy() {
		super(UMLElementTypes.BehaviorExecutionSpecification_3004);
	}

	/**
	 * @generated
	 */
	protected Command getCreateCommand(CreateElementRequest req) {
		if (UMLElementTypes.BehaviorExecutionSpecification_3004 == req.getElementType()) {
			return getGEFWrapper(new BehaviorExecutionSpecificationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}
	
	/**
	 * @generated
	 */
	protected Command getDestroyElementCommandGen(DestroyElementRequest req) {
		View view = (View) getHost().getModel();
		CompositeTransactionalCommand cmd = new CompositeTransactionalCommand(getEditingDomain(), null);
		cmd.setTransactionNestingEnabled(false);
		for (Iterator it = view.getTargetEdges().iterator(); it.hasNext();) {
			Edge incomingLink = (Edge) it.next();
			if (UMLVisualIDRegistry.getVisualID(incomingLink) == MessageEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
				continue;
			}
		}
		for (Iterator it = view.getSourceEdges().iterator(); it.hasNext();) {
			Edge outgoingLink = (Edge) it.next();
			if (UMLVisualIDRegistry.getVisualID(outgoingLink) == MessageEditPart.VISUAL_ID) {
				DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
				cmd.add(new DestroyElementCommand(r));
				cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
				continue;
			}
		}
		EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
		if (annotation == null) {
			// there are indirectly referenced children, need extra commands: true
			addDestroyChildNodesCommand(cmd);
			addDestroyShortcutsCommand(cmd, view);
			// delete host element
			cmd.add(new DestroyElementCommand(req));
		} else {
			cmd.add(new DeleteCommand(getEditingDomain(), view));
		}
		return getGEFWrapper(cmd.reduce());
	}

	/**
	 * @generated NOT
	 */
	protected Command getDestroyElementCommand(DestroyElementRequest req) {
		View view = ((IGraphicalEditPart) getHost()).getNotationView();
		IDiagramGraphicalViewer viewer = (IDiagramGraphicalViewer) getHost().getViewer();
		ICompositeCommand withAllChained = getDestroyWithAllChainedElementsCommand(view, viewer, req);
		if (withAllChained != null) {
			return getGEFWrapper(withAllChained);
		}
		return getDestroyElementCommandGen(req);
	}

	protected ICompositeCommand getDestroyWithAllChainedElementsCommand(View view, IDiagramGraphicalViewer viewer, DestroyElementRequest req) {
		if (view == null || view.getElement() == null) {
			return null;
		}
		SDModel sdModel = SDModelAccess.findSDModel(view);

		if (sdModel == null) {
			return null;
		}
		SDEntity sdMessage = sdModel.getUMLTracing().findBehaviorSpec((BehaviorExecutionSpecification) view.getElement());
		SDModelHelper.ChainedElementsCollector collector = new SDModelHelper.ChainedElementsCollector();
		collector.doSwitch(sdMessage);
		List<Element> allChained = collector.getCollectedElements();
		if (allChained.isEmpty()) {
			return null;
		}
		CompositeTransactionalCommand result = new CompositeTransactionalCommand(req.getEditingDomain(), req.getLabel());
		result.add(new DestroyElementCommand(req));
		for (Element next : allChained) {
			if (next == req.getElementToDestroy()) {
				continue;
			}
			DestroyElementRequest chainedRequest = new DestroyElementRequest(req.getEditingDomain(), next, false);
			DestroyElementCommand nextDestroy = new DestroyElementCommand(chainedRequest);
			result.add(nextDestroy);
			String nextGuid = EMFCoreUtil.getProxyID(next);
			if (nextGuid != null && nextGuid.length() != 0) {
				@SuppressWarnings("unchecked")
				List<IGraphicalEditPart> editPartsFor = viewer.findEditPartsForElement(nextGuid, IGraphicalEditPart.class);
				for (IGraphicalEditPart nextEditPart : editPartsFor) {
					View nextView = nextEditPart.getNotationView();
					if (nextView != null) {
						DeleteCommand nextDeleteViewCommand = new DeleteCommand(getEditingDomain(), nextView);
						result.add(nextDeleteViewCommand);
					}
				}
			}
		}
		IGraphicalEditPart interactionEP = findInteractionEditPart(getHost());
		if (interactionEP != null) {
			result.add(SDModelAccess.getInvalidateSDModelCommand(interactionEP.getNotationView()));
			InteractionNestedLayoutRequest postLayoutRequest = new InteractionNestedLayoutRequest();
			postLayoutRequest.requestTotalLayout();
			Command postLayout = interactionEP.getCommand(postLayoutRequest);
			if (postLayout != null && postLayout.canExecute()) {
				result.add(new CommandProxy(postLayout));
			}
		}
		return result;
	}
	
	/**
	 * @generated
	 */
	private void addDestroyChildNodesCommand(ICompositeCommand cmd) {
		View view = (View) getHost().getModel();
		for (Iterator nit = view.getChildren().iterator(); nit.hasNext();) {
			Node node = (Node) nit.next();
			switch (UMLVisualIDRegistry.getVisualID(node)) {
			case BehaviorExecutionSpecificationEditPart.VISUAL_ID:
				for (Iterator it = node.getTargetEdges().iterator(); it.hasNext();) {
					Edge incomingLink = (Edge) it.next();
					if (UMLVisualIDRegistry.getVisualID(incomingLink) == MessageEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(incomingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), incomingLink));
						continue;
					}
				}
				for (Iterator it = node.getSourceEdges().iterator(); it.hasNext();) {
					Edge outgoingLink = (Edge) it.next();
					if (UMLVisualIDRegistry.getVisualID(outgoingLink) == MessageEditPart.VISUAL_ID) {
						DestroyElementRequest r = new DestroyElementRequest(outgoingLink.getElement(), false);
						cmd.add(new DestroyElementCommand(r));
						cmd.add(new DeleteCommand(getEditingDomain(), outgoingLink));
						continue;
					}
				}
				cmd.add(new DestroyElementCommand(new DestroyElementRequest(getEditingDomain(), node.getElement(), false))); // directlyOwned: false
				// don't need explicit deletion of node as parent's view deletion would clean child views as well 
				// cmd.add(new org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand(getEditingDomain(), node));
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
		if (UMLElementTypes.Message_4001 == req.getElementType()) {
			return getGEFWrapper(new MessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * @generated
	 */
	protected Command getCompleteCreateRelationshipCommand(CreateRelationshipRequest req) {
		if (UMLElementTypes.Message_4001 == req.getElementType()) {
			return getGEFWrapper(new MessageCreateCommand(req, req.getSource(), req.getTarget()));
		}
		return null;
	}

	/**
	 * Returns command to reorient EClass based link. New link target or source
	 * should be the domain model element associated with this node.
	 * 
	 * @generated
	 */
	protected Command getReorientRelationshipCommand(ReorientRelationshipRequest req) {
		switch (getVisualID(req)) {
		case MessageEditPart.VISUAL_ID:
			return getGEFWrapper(new MessageReorientCommand(req));
		}
		return super.getReorientRelationshipCommand(req);
	}

}
