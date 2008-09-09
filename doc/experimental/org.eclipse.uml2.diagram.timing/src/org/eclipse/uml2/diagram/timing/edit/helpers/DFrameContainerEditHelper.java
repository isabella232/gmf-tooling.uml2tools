package org.eclipse.uml2.diagram.timing.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrameContainer;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.UMLPackage;
/**
 * @generated
 */

public class DFrameContainerEditHelper extends TimingDBaseEditHelper {
	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		ICommand result = super.getCreateCommand(req);
		
		if (false == req.getContainer() instanceof DFrameContainer){
			return result;
		}
		if (req.getElementType() != TimingDElementTypes.DFrame_2001){
			return result;
		}
		
		final DFrameContainer frameContainer = (DFrameContainer) req.getContainer();
		if (frameContainer.getPakkage() == null){
			return result;
		}
		
		PushToUMLCommand syncCommand = new PushToUMLCommand(req, frameContainer.getPakkage()){
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				Package umlPakkage = (Package) getUmlParent();
				DFrame createdFrame = (DFrame) getCreatedTimingDArtefact();

				Interaction interaction = (Interaction) umlPakkage.createOwnedType(createdFrame.getDisplayName(), UMLPackage.eINSTANCE.getInteraction());
				createdFrame.setInteraction(interaction);
				
				return CommandResult.newOKCommandResult();
			}
		};
		
		return compose(result, syncCommand, req.getEditingDomain());
	}
	
	
}
