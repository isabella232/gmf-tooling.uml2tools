package org.eclipse.uml2.diagram.timing.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Lifeline;

/**
 * @generated
 */

public class DFrameEditHelper extends TimingDBaseEditHelper {
	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		ICommand result = super.getCreateCommand(req);
		
		if (false == req.getContainer() instanceof DFrame){
			return result;
		}
		if (req.getElementType() != TimingDElementTypes.DBlock_3001){
			return result;
		}
		
		final DFrame frame = (DFrame) req.getContainer();
		if (frame.getInteraction() == null){
			return result;
		}
		
		PushToUMLCommand syncCommand = new PushToUMLCommand(req, frame.getInteraction()){
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				Interaction interaction = (Interaction) getUmlParent();
				DBlock createdBlock = (DBlock) getCreatedTimingDArtefact();
				Lifeline lifeline = interaction.createLifeline(createdBlock.getDisplayName());
				createdBlock.setLifeline(lifeline);
				return CommandResult.newOKCommandResult();
			}
		};
		return compose(result, syncCommand, req.getEditingDomain());
	}


}
