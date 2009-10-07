package org.eclipse.uml2.diagram.sequence.edit.create;

import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.commands.UnexecutableCommand;
import org.eclipse.gmf.runtime.diagram.ui.editparts.GraphicalEditPart;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.uml2.diagram.sequence.edit.policies.TieFrameRequest;
import org.eclipse.uml2.diagram.sequence.edit.policies.TieFrameRequest.Completed;
import org.eclipse.uml2.diagram.sequence.model.SDModelAccess;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDCombinedFragment;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDModel;
import org.eclipse.uml2.uml.CombinedFragment;

public class TieCombinedFragmentToLifeLineEditPolicy extends AbstractCreateSDElementEditPolicy {

	@Override
	public boolean understandsRequest(Request req) {
		return req instanceof TieFrameRequest.Completed;
	}

	@Override
	public Command getCommand(Request request) {
		if (request instanceof TieFrameRequest.Completed) {
			return getCompleteTieFrameCommand((TieFrameRequest.Completed) request);
		}
		return super.getCommand(request);
	}

	private Command getCompleteTieFrameCommand(Completed request) {
		GraphicalEditPart frameEP = request.getSubjectFrameEditPart();
		if (false == frameEP.resolveSemanticElement() instanceof CombinedFragment) {
			//allow TieInteractionUse to run
			return null;
		}

		CombinedFragment umlCombined = (CombinedFragment) frameEP.resolveSemanticElement();
		final SDModel sdModel = SDModelAccess.findSDModel(getHostImpl().getNotationView());
		if (sdModel == null) {
			return UnexecutableCommand.INSTANCE;
		}

		SDCombinedFragment sdFragment = sdModel.getUMLTracing().findCombinedFragment(umlCombined);

		GraphicalEditPart bracketEP = getHostImpl();
		GraphicalEditPart lifelineEP = findLifeLineEditPart(bracketEP);

		if (lifelineEP == null) {
			return UnexecutableCommand.INSTANCE;
		}

		CreateCombinedFragmentRequest createRequest = new CreateCombinedFragmentRequest(getHostImpl().getDiagramPreferencesHint());
		createRequest.setCombinedFragmentToTie(sdFragment, (Node) frameEP.getNotationView());
		createRequest.setExtendedData(request.getExtendedData());
		createRequest.setLocation(request.getLocation());

		Command creation = lifelineEP.getCommand(createRequest);
		return creation;
	}

}
