package org.eclipse.uml2.diagram.sequence.edit.policies;

import java.util.List;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.common.core.command.ICompositeCommand;
import org.eclipse.gmf.runtime.diagram.core.commands.DeleteCommand;
import org.eclipse.gmf.runtime.diagram.ui.commands.CommandProxy;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.IDiagramGraphicalViewer;
import org.eclipse.gmf.runtime.emf.commands.core.command.CompositeTransactionalCommand;
import org.eclipse.gmf.runtime.emf.core.util.EMFCoreUtil;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyElementRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.sequence.edit.commands.MessageCreateCommand;
import org.eclipse.uml2.diagram.sequence.edit.commands.MessageReorientCommand;
import org.eclipse.uml2.diagram.sequence.edit.parts.MessageEditPart;
import org.eclipse.uml2.diagram.sequence.model.SDModelAccess;
import org.eclipse.uml2.diagram.sequence.model.builder.SDModelHelper;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDEntity;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.diagram.sequence.providers.UMLElementTypes;
import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Message;

/**
 * @generated
 */

public class MessageItemSemanticEditPolicy extends UMLBaseItemSemanticEditPolicy {

	/**
	 * @generated
	 */
	public MessageItemSemanticEditPolicy() {
		super(UMLElementTypes.Message_4001);
	}

	/**
	 * @generated
	 */
	protected Command getDestroyElementCommandGen(DestroyElementRequest req) {
		return getGEFWrapper(new DestroyElementCommand(req));
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
		SDEntity sdMessage = sdModel.getUMLTracing().findMessage((Message) view.getElement());
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
