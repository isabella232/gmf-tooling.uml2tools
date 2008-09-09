package org.eclipse.uml2.diagram.timing.edit.helpers;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.common.core.command.ICommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;
import org.eclipse.uml2.diagram.timing.edit.policies.create.SemanticHelper;
import org.eclipse.uml2.diagram.timing.model.timingd.DBlock;
import org.eclipse.uml2.diagram.timing.model.timingd.DFrame;
import org.eclipse.uml2.diagram.timing.model.timingd.DSegment;
import org.eclipse.uml2.diagram.timing.model.timingd.DValueLine;
import org.eclipse.uml2.diagram.timing.providers.TimingDElementTypes;
import org.eclipse.uml2.uml.Constraint;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.MessageOccurrenceSpecification;
import org.eclipse.uml2.uml.OpaqueExpression;
import org.eclipse.uml2.uml.StateInvariant;
import org.eclipse.uml2.uml.UMLPackage;

/**
 * @generated
 */

public class DValueLineEditHelper extends TimingDBaseEditHelper {
	@Override
	protected ICommand getCreateCommand(CreateElementRequest req) {
		ICommand result = super.getCreateCommand(req);
		
		if (false == req.getContainer() instanceof DValueLine){
			return result;
		}
		if (req.getElementType() != TimingDElementTypes.DSegment_3003){
			return result;
		}
		
		final DValueLine valueLine = (DValueLine) req.getContainer();
		final DBlock block = valueLine.getBlock();
		if (block.getLifeline() == null){
			return result;
		}
		final DFrame frame = block.getFrame();
		if (frame.getInteraction() == null){
			return result;
		}

		PushToUMLCommand syncCommand = new PushToUMLCommand(req, valueLine.getBlock().getLifeline()){
			@Override
			protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
				DSegment createdSegment = (DSegment) getCreatedTimingDArtefact();
				Interaction interaction = frame.getInteraction();
				String stateName = SemanticHelper.newStateInvariantName(interaction);
				StateInvariant state = (StateInvariant) interaction.createFragment(stateName, UMLPackage.eINSTANCE.getStateInvariant());
				state.getCovereds().add(block.getLifeline());
				
				MessageOccurrenceSpecification spec = (MessageOccurrenceSpecification) interaction.createFragment(stateName, UMLPackage.eINSTANCE.getMessageOccurrenceSpecification());
				spec.getCovereds().add(block.getLifeline());
				createdSegment.setStartOccurrence(spec);
				
				Constraint invariant = state.createInvariant("Invariant");
				OpaqueExpression expr = (OpaqueExpression) invariant.createSpecification("", null, UMLPackage.eINSTANCE.getOpaqueExpression());
				expr.getBodies().add(valueLine.getDisplayName());
				return CommandResult.newOKCommandResult();
			}
		};
		return compose(result, syncCommand, req.getEditingDomain());
	}

}
