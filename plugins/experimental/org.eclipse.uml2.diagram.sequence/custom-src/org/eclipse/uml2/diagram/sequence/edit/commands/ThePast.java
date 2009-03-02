package org.eclipse.uml2.diagram.sequence.edit.commands;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;

import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.uml2.diagram.common.editpolicies.U2TCreateLinkCommand;
import org.eclipse.uml2.diagram.common.editpolicies.U2TCreateParameters;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDExecution;
import org.eclipse.uml2.diagram.sequence.model.sequenced.SDInvocation;
import org.eclipse.uml2.uml.ExecutionSpecification;
import org.eclipse.uml2.uml.Interaction;
import org.eclipse.uml2.uml.InteractionFragment;


public class ThePast {
	private final List<InteractionFragment> myPastFragments = new ArrayList<InteractionFragment>(5);
	
	public ThePast(){
		//
	}
	
	public ThePast(U2TCreateParameters createParams){
		this();
		addThePastFromAnchor(createParams);
	}
	
	public ThePast(U2TCreateLinkCommand commandPack){
		this();
		addThePastFromAnchor(commandPack.getSourceParameters());
		addThePastFromAnchor(commandPack.getTargetParameters());
	}

	public ListIterator<InteractionFragment> getAfterThePastPosition(Interaction interaction) {
		if (myPastFragments.isEmpty()) {
			return interaction.getFragments().listIterator();
		}

		HashSet<InteractionFragment> notFound = new HashSet<InteractionFragment>();
		for (InteractionFragment next : myPastFragments) {
			if (next == null) {
				continue;
			}
			if (next.getEnclosingInteraction() != interaction) {
				throw new IllegalArgumentException("Alien fragment found: " + next + " for interaction: " + interaction);
			}
			notFound.add(next);
		}

		ListIterator<InteractionFragment> result = interaction.getFragments().listIterator();
		while (!notFound.isEmpty() && result.hasNext()) {
			InteractionFragment next = result.next();
			notFound.remove(next);
		}
		return result;
	}

	public void executionStarted(SDExecution sdExecution) {
		ExecutionSpecification umlExecution = sdExecution.getUmlExecutionSpec();
		considerAsPast(umlExecution);
		considerAsPast(umlExecution.getStart());

		SDInvocation sdParentInvocation = sdExecution.getInvocation();
		if (sdParentInvocation != null) {
			considerAsPast(sdParentInvocation.getUmlExecutionSpec());
			considerAsPast(sdParentInvocation.getUmlStart());
		}
	}

	public void considerAsPast(InteractionFragment fragment) {
		if (fragment != null) {
			myPastFragments.add(fragment);
		}
	}

	protected void addThePastFromAnchor(U2TCreateParameters params) {
		View anchor = params.getAnchorSibling();
		if (anchor != null && !params.isBeforeNotAfterAnchor()) {
			InteractionFragment semanticAnchor = (InteractionFragment) anchor.getElement();
			if (semanticAnchor instanceof ExecutionSpecification) {
				considerAsPast(((ExecutionSpecification) semanticAnchor).getFinish());
			} else {
				considerAsPast(semanticAnchor);
			}
		}
	}

}
